package common

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.assertTimeoutPreemptively
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
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.time.Duration
import java.util.Locale
import kotlin.collections.HashMap
import kotlin.io.path.absolutePathString
import kotlin.io.path.name
import kotlin.io.path.relativeTo

@Execution(ExecutionMode.SAME_THREAD)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class TestJ2EO {

    @TestFactory
    @Order(1)
    fun checkTranslation(): Collection<DynamicTest> {
        return testFolderRoot.toFile().walk()
            .filter { file -> file.isFile }
            .filter { file -> isReadyTest(file.toPath()) }
            .filter { file -> isNotClassFile(file.toPath()) }
            .filter { file -> isJavaFile(file.toPath()) }
            // .filter { file -> isSimpleTest(file.toPath()) }
            .map { file -> translateFile(file.toPath()) }
            .toList()
    }

    @Test
    @Order(2)
    fun compileEOFiles() {
        // Copy all necessary files
        val pomClonePath = File(testFolderRoot.toString() + sep + "pom.xml").toPath()
        Files.copy(pomFilePath, pomClonePath)
        val stdClonePath = File(testFolderRoot.toString() + sep + "stdlib").toPath()
        stdlibFolderRoot.toFile().copyRecursively(stdClonePath.toFile())

        // Execute generated EO code
        val isWindows = System.getProperty("os.name").lowercase(Locale.getDefault())
            .contains("windows") // Matters a lot

        // Compile EO file
        val mvnCommands = if (isWindows) listOf("mvn.cmd", "clean", "compile")
        else listOf("mvn", "clean", "compile")
        val compileProcess = ProcessBuilder(mvnCommands)
            .directory(testFolderRoot.toFile())
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
        return testFolderRoot.toFile().walk()
            .filter { file -> file.isFile }
            .filter { file -> isReadyTest(file.toPath()) }
            .filter { file -> isNotClassFile(file.toPath()) }
            .filter { file -> isJavaFile(file.toPath()) }
            .map { file -> executeTranslatedTest(file.toPath()) }
            .toList()
    }

    companion object {
        private var testFolderRoot = Paths.get("")
        private var pomFilePath = Paths.get("")
        private var stdlibFolderRoot = Paths.get("")
        private val sep = File.separatorChar.toString()

        @BeforeAll
        @JvmStatic
        fun setup() {
            val testCandidates =
                System.getProperty("candidates") != null &&
                    System.getProperty("candidates") == "true"
            if (testCandidates)
                logger.info("-- Executing candidate tests --")
            var testFolderPath = listOf("src", "test", "resources").joinToString(sep)
            testFolderPath += sep + if (testCandidates) "test_candidates" else "test_ready"
            val stdlibFolderPath = listOf("src", "main", "resources", "stdlib").joinToString(sep)
            val fileStd = File(stdlibFolderPath)
            stdlibFolderRoot = fileStd.toPath().toAbsolutePath()
            val fileTest = File(testFolderPath)
            testFolderRoot = fileTest.toPath().toAbsolutePath()

            val pomPath = listOf("src", "test", "resources", "eo_execution_pom", "pom.xml").joinToString(sep)
            pomFilePath = File(pomPath).toPath().toAbsolutePath()

            // Double check for test files (in case testing exited abruptly)
            val targetFolder = File(testFolderRoot.toString() + sep + "target")
            if (targetFolder.exists()) {
                targetFolder.deleteRecursively()
            }
            testFolderRoot.toFile().walk()
                .filter { file -> file.isFile }
                .filter { file -> isEOFile(file.toPath()) }.forEach { it.delete() }
        }

        @AfterAll
        @JvmStatic
        fun cleanup() {
            File(testFolderRoot.toString() + sep + "target").deleteRecursively()
            testFolderRoot.toFile().walk()
                .filter { file -> file.isFile }
                .filter { file -> isEOFile(file.toPath()) }.forEach { it.delete() }
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
                    val genEOLangText = Translator(path.relativeTo(testFolderRoot)).translate(cu, Context(HashMap()))
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
                execPbJava.directory(testFolderRoot.toFile())
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
                val relPath = path.relativeTo(testFolderRoot)
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
                execPb.directory(testFolderRoot.toFile())
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

        private fun isReadyTest(path: Path): Boolean {
            return !path.endsWith("SampleTest.java") && !path.contains(Paths.get("target"))
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
