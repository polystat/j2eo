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
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.time.Duration
import java.util.Locale
import java.util.concurrent.TimeUnit
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
        val pomClonePath = File(testFolderRoot.toString() + fileSep + "pom.xml").toPath()
        Files.copy(pomFilePath, pomClonePath)
        val stdClonePath = File(testFolderRoot.toString() + fileSep + "stdlib").toPath()
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
            mvnSb.append(m).append(lineSep)
        }
        compileProcess.waitFor()
        compileProcess.destroy()
        logger.info(" -- EO compilation output --$lineSep$mvnSb")

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
        private val fileSep = File.separatorChar.toString()
        private val lineSep = System.lineSeparator() // New line character

        @BeforeAll
        @JvmStatic
        fun setup() {
            val candidatesProp = System.getProperty("candidates")
            val testCandidates = candidatesProp == "true"
            if (testCandidates)
                logger.info("-- Executing candidate tests --")
            var testFolderPath = listOf("src", "test", "resources").joinToString(fileSep)
            testFolderPath += fileSep + if (testCandidates) "test_candidates" else "test_ready"
            val stdlibFolderPath = listOf("src", "main", "eo", "org", "polystat", "stdlib").joinToString(fileSep)
            val fileStd = File(stdlibFolderPath)
            stdlibFolderRoot = fileStd.toPath().toAbsolutePath()
            val fileTest = File(testFolderPath)
            testFolderRoot = fileTest.toPath().toAbsolutePath()

            val pomPath = listOf("src", "test", "resources", "eo_execution_pom", "pom.xml").joinToString(fileSep)
            pomFilePath = File(pomPath).toPath().toAbsolutePath()

            // Double check for test files (in case testing exited abruptly)
            val targetFolder = File(testFolderRoot.toString() + fileSep + "target")
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
            File(testFolderRoot.toString() + fileSep + "target").deleteRecursively()
            testFolderRoot.toFile().walk()
                .filter { file -> file.isFile }
                .filter { file -> isEOFile(file.toPath()) }.forEach { it.delete() }
        }

        private fun translateFile(path: Path): DynamicTest {
            return DynamicTest.dynamicTest(
                path.parent.fileName.toString() + fileSep +
                    path.fileName.toString()
            ) {
                assertTimeoutPreemptively(
                    Duration.ofSeconds(10)
                ) {
                    val lexer = JavaLexer(CharStreams.fromFileName(path.absolutePathString()))
                    val parser = JavaParser(CommonTokenStream(lexer))
                    val tree = parser.compilationUnit()
                    val eval = Visitor()
                    val cu = eval.visit(tree) as CompilationUnit
                    val genEOLangText = Translator(path.relativeTo(testFolderRoot)).translate(cu, Context(HashMap()))
                    val newFileName = path.fileName.name.removeSuffix(".java") + ".eo"
                    val newPath = File(path.parent.toString() + fileSep + newFileName).toPath()
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
                assertTimeoutPreemptively(Duration.ofSeconds(15)) {
                    val isWindows = System.getProperty("os.name").lowercase(Locale.getDefault())
                        .contains("windows") // Matters a lot

                    // Execute Java
                    val execPbJava = ProcessBuilder(
                        "java", path.toAbsolutePath().toString()
                    )
                    execPbJava.directory(testFolderRoot.toFile())
                    execPbJava.redirectErrorStream(true)
                    val execProcessJava = execPbJava.start()
                    logger.info("-- Executing Java... --")

                    // Receive output
                    val outputJava = StringBuilder()
                    val stdInputJava = BufferedReader(InputStreamReader(execProcessJava.inputStream))
                    var s: String?
                    while (stdInputJava.readLine().also { s = it } != null) {
                        outputJava.append(s).append(lineSep)
                    }
                    execProcessJava.waitFor()
                    execProcessJava.destroy()
                    logger.info("-- Java execution output --$lineSep$outputJava")

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
                    logger.info("-- Executing EO... --")

                    // Receive EO execution output
                    val outputEO = StringBuilder()
                    val stdInputEO = BufferedReader(InputStreamReader(execProcess.inputStream))
                    var sEO: String?
                    while (stdInputEO.readLine().also { sEO = it } != null) {
                        outputEO.append(sEO).append(lineSep)
                    }
                    if (execProcess.waitFor(5, TimeUnit.SECONDS)) {
                        logger.warn("-- EO process has finished. ---")
                        execProcess.destroy()
                    } else {
                        logger.warn("-- EO process is stuck!!! ---")
                        execProcess.destroyForcibly()
                    }

                    logger.info("-- EO execution output --$lineSep$outputEO")

                    Assertions.assertEquals(outputJava.toString(), outputEO.toString())
                }
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
