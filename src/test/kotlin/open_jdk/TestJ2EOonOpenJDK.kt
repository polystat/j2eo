package open_jdk

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.assertTimeoutPreemptively
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import org.polystat.j2eo.antlrParser.JavaLexer
import org.polystat.j2eo.antlrParser.JavaParser
import org.polystat.j2eo.translator.Context
import org.polystat.j2eo.translator.Translator
import org.polystat.j2eo.treeMapper.Visitor
import org.polystat.j2eo.util.logger
import tree.Compilation.CompilationUnit
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.time.Duration
import java.util.Locale
import kotlin.collections.HashMap
import kotlin.io.path.absolutePathString
import kotlin.io.path.createDirectories
import kotlin.io.path.deleteIfExists
import kotlin.io.path.exists
import kotlin.io.path.name
import kotlin.io.path.notExists
import kotlin.io.path.relativeTo

@Execution(ExecutionMode.SAME_THREAD)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
@Disabled
class TestJ2EOonOpenJDK {
    @TestFactory
    fun executeAndCheckEO(): Collection<DynamicTest> {
        return translatedFiles
            .map { file -> executeTranslatedTest(file.first.toPath(), file.second) }
            .toList()
    }

    companion object {
        private lateinit var openJdkUrl: URL
        private lateinit var unzipCommand: List<String>
        private val sep = File.separatorChar.toString()
        private val pomFilePath = Paths.get("src", "test", "resources", "eo_execution_pom", "pom.xml")
            .toAbsolutePath()
        private val stdlibFolderRoot = Paths.get("src", "main", "eo", "org", "polystat", "stdlib").toAbsolutePath()
        private val workingDir = Paths.get("src", "test", "resources", "open_jdk").toAbsolutePath()
        private val openjdkZipSavePath = Paths.get("jdk.tar.gz").toAbsolutePath()
        private val openJdkTestPath = Paths.get("jdk-jdk-16-36", "test").toAbsolutePath()

        private var amountOfFiles: Int? = null
        private lateinit var traversedFiles: Sequence<File>
        private lateinit var translatedFiles: Sequence<Pair<File, Boolean>>

        private fun setupVars() {
            unzipCommand = listOf("tar", "-xf", openjdkZipSavePath.toString())
            openJdkUrl = URL("https://github.com/openjdk/jdk/archive/refs/tags/jdk-16+36.tar.gz")

            amountOfFiles = try {
                System.getProperty("amount")?.toInt()
            } catch (e: NumberFormatException) {
                null
            }
        }

        @BeforeAll
        @JvmStatic
        fun setup() {
            setupVars()

            workingDir.createDirectories()
            if (openjdkZipSavePath.notExists())
                openJdkUrl.openStream().use { Files.copy(it, Paths.get(openjdkZipSavePath.toString())) }

            ProcessBuilder()
                .command(unzipCommand)
                .redirectError(ProcessBuilder.Redirect.INHERIT)
                .redirectOutput(ProcessBuilder.Redirect.INHERIT)
                .start()
                .waitFor()

            val sources = Files.walk(openJdkTestPath)
            for (source in sources) {
                Files.copy(
                    source, workingDir.resolve(openJdkTestPath.relativize(source)),
                    StandardCopyOption.REPLACE_EXISTING
                )
            }

            if (openJdkTestPath.parent.exists()) {
                openJdkTestPath.parent.toFile().deleteRecursively()
            }
            openjdkZipSavePath.deleteIfExists()

            checkTranslation()
            compileEOFiles()
        }

        @AfterAll
        @JvmStatic
        fun cleanup() {
            if (workingDir.exists()) {
                workingDir.toFile().deleteRecursively()
            }
            logger.info(workingDir.toString())
            logger.info(openjdkZipSavePath.toString())
            logger.info(openJdkTestPath.toString())
        }

        private fun checkTranslation() {
            traversedFiles = workingDir.toFile().walk()
                .filter { file -> file.isFile }
                .filter { file -> isTest(file.toPath()) }
                .filter { file -> isNotClassFile(file.toPath()) }
                .filter { file -> isJavaFile(file.toPath()) }

            if (amountOfFiles != null) {
                traversedFiles = traversedFiles.take(amountOfFiles!!)
            }

            translatedFiles = traversedFiles
                .map { file -> file to translateFile(file.toPath()) }
        }

        private fun translateFile(path: Path): Boolean {
            try {
                assertTimeoutPreemptively(
                    Duration.ofSeconds(90)
                ) {
                    val lexer = JavaLexer(CharStreams.fromFileName(path.absolutePathString()))
                    val parser = JavaParser(CommonTokenStream(lexer))
                    val tree = parser.compilationUnit()
                    val eval = Visitor()
                    val cu = eval.visit(tree) as CompilationUnit
                    val genEOLangText = Translator(path.relativeTo(workingDir)).translate(cu, Context(HashMap()))
                    val newFileName = path.fileName.name.removeSuffix(".java") + ".eo"
                    val newPath = File(path.parent.toString() + sep + newFileName).toPath()
                    Files.writeString(newPath, genEOLangText.generateEO(0))
                }
            } catch (e: Exception) {
                return false
            }
            return true
        }

        private fun compileEOFiles() {
            // Copy all necessary files
            val pomClonePath = File(workingDir.toString() + sep + "pom.xml").toPath()
            Files.copy(pomFilePath, pomClonePath)
            val stdClonePath = File(workingDir.toString() + sep + "stdlib").toPath()
            stdlibFolderRoot.toFile().copyRecursively(stdClonePath.toFile())

            // Execute generated EO code
            val isWindows = System.getProperty("os.name").lowercase(Locale.getDefault())
                .contains("windows") // Matters a lot

            // Compile EO file
            val mvnCommands = if (isWindows)
                listOf("mvn.cmd", "clean", "compile")
            else
                listOf("mvn", "clean", "compile")
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
        }

        private fun executeTranslatedTest(path: Path, isTranslated: Boolean): DynamicTest {
            return DynamicTest.dynamicTest(
                path.parent.fileName.toString() + "/" +
                    path.fileName.toString()
            ) {
                if (!isTranslated) {
                    assert(false)
                }

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
    }
}
