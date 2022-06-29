package open_jdk

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.*
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import parser.JavaLexer
import parser.JavaParser
import parser.Visitor
import translator.Context
import translator.Translator
import tree.Compilation.CompilationUnit
import util.logger
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.time.Duration
import java.util.*
import kotlin.collections.HashMap
import kotlin.io.path.*

@Execution(ExecutionMode.CONCURRENT)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class TestJ2EOonOpenJDK {
    @TestFactory
    @Order(1)
    fun checkTranslation(): Collection<DynamicTest> {
        return workingDir.toFile().walk()
            .filter { file -> file.isFile }
            .filter { file -> isTest(file.toPath()) }
            .filter { file -> isNotClassFile(file.toPath()) }
            .filter { file -> isJavaFile(file.toPath()) }
            .map { file -> translateFile(file.toPath()) }
            .toList()
    }

    @Test
    @Order(2)
    fun compileEOFiles() {
        // Copy all necessary files
        val pomClonePath = File(workingDir.toString() + sep + "pom.xml").toPath()
        Files.copy(pomFilePath, pomClonePath)
        val stdClonePath = File(workingDir.toString() + sep + "stdlib").toPath()
        stdlibFolderRoot.toFile().copyRecursively(stdClonePath.toFile())

        // Execute generated EO code
        val isWindows = System.getProperty("os.name").lowercase(Locale.getDefault())
            .contains("windows") // Matters a lot

        // Compile EO file
        val mvnCommands = if (isWindows) listOf("mvn.cmd", "clean", "compile")
        else listOf("mvn", "clean", "compile")
        val compileProcess = ProcessBuilder(mvnCommands)
            .directory(workingDir.toFile())
            .redirectErrorStream(true)
            .start()

        // Receive compilation output (maybe useful)
        val mvnStdInput = BufferedReader(InputStreamReader(compileProcess.inputStream))
        var m: String?
        val mvnSb = StringBuilder()
        while (mvnStdInput.readLine().also { m = it } != null) {
            mvnSb.append(m).append(System.lineSeparator())
        }
        compileProcess.waitFor()
        compileProcess.destroy()
        logger.info(" -- EO compilation output --" + System.lineSeparator() + mvnSb.toString())

        pomClonePath.toFile().delete()
        stdClonePath.toFile().deleteRecursively()

        assert(true)
    }

    @TestFactory
    @Order(3)
    fun executeAndCheckEO(): Collection<DynamicTest> {
        return workingDir.toFile().walk()
            .filter { file -> file.isFile }
            .filter { file -> isTest(file.toPath()) }
            .filter { file -> isNotClassFile(file.toPath()) }
            .filter { file -> isJavaFile(file.toPath()) }
            .map { file -> executeTranslatedTest(file.toPath()) }
            .toList()
    }


    companion object {
        private val openJdkUrl = URL("https://github.com/openjdk/jdk/archive/refs/tags/jdk-16+36.zip")
        private val sep = File.separatorChar.toString()
        private val pomFilePath = Paths.get("src", "test", "resources", "eo_execution_pom", "pom.xml")
            .toAbsolutePath()
        private val stdlibFolderRoot = Paths.get("src", "main", "resources", "stdlib").toAbsolutePath()
        private val workingDir = Paths.get("src", "test", "resources", "open_jdk").toAbsolutePath()
        private val openjdkZipSavePath = Paths.get("jdk.zip").toAbsolutePath()
        private val openJdkTestPath = Paths.get("jdk-jdk-16-36", "test").toAbsolutePath()

        @BeforeAll
        @JvmStatic
        fun setup() {
            if (workingDir.notExists()) {
                workingDir.createDirectories()
                openJdkUrl.openStream().use { Files.copy(it, Paths.get(openjdkZipSavePath.toString())) }
                ProcessBuilder()
                    .command("unzip", openjdkZipSavePath.toString())
                    .redirectError(ProcessBuilder.Redirect.INHERIT)
                    .redirectOutput(ProcessBuilder.Redirect.INHERIT)
                    .start()
                    .waitFor()

                val sources = Files.walk(openJdkTestPath)
                for (source in sources) {
                    Files.copy(source, workingDir.resolve(openJdkTestPath.relativize(source)),
                        StandardCopyOption.REPLACE_EXISTING
                    )
                }
                openjdkZipSavePath.deleteIfExists()
                openJdkTestPath.parent.deleteIfExists()
            }
        }

        @AfterAll
        @JvmStatic
        fun cleanup() {
            workingDir.deleteIfExists()
        }

        private fun translateFile(path: Path): DynamicTest {
            return DynamicTest.dynamicTest(
                path.parent.fileName.toString() + "/" +
                        path.fileName.toString()
            ) {
                assertTimeoutPreemptively(
                    Duration.ofSeconds(90)
                ) {
                    val lexer = JavaLexer(CharStreams.fromFileName(path.absolutePathString()))
                    val parser = JavaParser(CommonTokenStream(lexer))
                    val tree = parser.compilationUnit()
                    val eval = Visitor()
                    val cu = eval.visit(tree) as CompilationUnit
                    val genEOLangText = Translator().translate(cu, Context(HashMap()))
                    val newFileName = path.fileName.name.removeSuffix(".java") + ".eo"
                    val newPath = File(path.parent.toString() + sep + newFileName).toPath()
                    Files.writeString(newPath, genEOLangText.generateEO(0))
                    assert(true)
                }
            }
        }

        private fun executeTranslatedTest(path: Path): DynamicTest {
            return DynamicTest.dynamicTest(
                path.parent.fileName.toString() + "/" +
                        path.fileName.toString()
            ) {
                val isWindows = System.getProperty("os.name").lowercase(Locale.getDefault())
                    .contains("windows") // Matters a lot

                // Execute Java
                val execPbJava = ProcessBuilder(
                    "java", path.toAbsolutePath().toString()
                )
                execPbJava.directory(workingDir.toFile())
                execPbJava.redirectErrorStream(true)
                val execProcessJava = execPbJava.start()

                // Receive output
                val outputJava = StringBuilder()
                val stdInputJava = BufferedReader(InputStreamReader(execProcessJava.inputStream))
                var s: String?
                while (stdInputJava.readLine().also { s = it } != null) {
                    outputJava.append(s).append(System.lineSeparator())
                }
                execProcessJava.waitFor()
                execProcessJava.destroy()
                logger.info("-- Java execution output --" + System.lineSeparator() + outputJava.toString())

                // Execute EO
                val relPath = path.relativeTo(workingDir)
                val pkg = relPath.toList().dropLast(1).joinToString(".")
                val execPb = ProcessBuilder(
                    "java", "-cp",
                    if (isWindows)
                        "\"target/classes;target/eo-runtime.jar\""
                    else
                        "target/classes:target/eo-runtime.jar",
                    "org.eolang.Main",
                    "$pkg.main",
                    if (isWindows)
                        "%*"
                    else
                        "\"$@\"1"
                )
                execPb.directory(workingDir.toFile())
                execPb.redirectErrorStream(true)
                val execProcess = execPb.start()

                // Receive EO execution output
                val outputEO = StringBuilder()
                val stdInputEO = BufferedReader(InputStreamReader(execProcess.inputStream))
                var sEO: String?
                while (stdInputEO.readLine().also { sEO = it } != null) {
                    outputEO.append(sEO).append(System.lineSeparator())
                }
                execProcess.waitFor()
                execProcess.destroy()
                logger.info("-- EO execution output --${System.lineSeparator()}$outputEO")

                Assertions.assertEquals(outputJava.toString(), outputEO.toString())
            }
        }

        private fun isTest(path: Path): Boolean {
            return !path.contains(Paths.get("target"))
        }

        private fun isClassFile(path: Path): Boolean {
            return path.toString().endsWith(".class")
        }

        private fun isJavaFile(path: Path): Boolean {
            return path.toString().endsWith(".java")
        }

        private fun isNotClassFile(path: Path): Boolean {
            return !isClassFile(path)
        }

        private fun isEOFile(path: Path): Boolean {
            return path.toString().endsWith(".eo")
        }
    }
}
