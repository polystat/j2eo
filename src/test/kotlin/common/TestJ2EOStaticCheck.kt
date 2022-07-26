package common

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
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
import tree.Compilation.CompilationUnit
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import java.time.Duration
import kotlin.io.path.absolutePathString
import kotlin.io.path.relativeTo

@Execution(ExecutionMode.SAME_THREAD)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class TestJ2EOStaticCheck {
    @TestFactory
    fun test(): Collection<DynamicTest> {
        val t = testFolderRoot.toFile().walk()
            .filter { file -> file.isFile }
            .filter { file -> isReadyTest(file.toPath()) }
            .filter { file -> isNotClassFile(file.toPath()) }
            .filter { file -> isJavaFile(file.toPath()) }

        return t.map { translateFile(it.toPath()) }.toList()
    }

    companion object {
        private const val translatedTestsFolderName = "translated_tests"
        private const val testsFolderName = "test_candidates"
        private val testFolderRoot = Paths.get("src", "test", "resources", testsFolderName)
            .toAbsolutePath()
        private val sep = File.separatorChar.toString()

        @BeforeAll
        @JvmStatic
        fun setup() {
            val t = testFolderRoot.toFile().walk()
                .filter { file -> file.isFile }
                .filter { file -> isReadyTest(file.toPath()) }
                .filter { file -> isNotClassFile(file.toPath()) }
                .filter { file -> isJavaFile(file.toPath()) }
                .toList()
        }

        private fun translateJavaFile(path: Path): String {
            val lexer = JavaLexer(CharStreams.fromFileName(path.absolutePathString()))
            val parser = JavaParser(CommonTokenStream(lexer))
            val tree = parser.compilationUnit()
            val eval = Visitor()
            val cu = eval.visit(tree) as CompilationUnit
            val genEOLangText = Translator(path.relativeTo(testFolderRoot)).translate(cu, Context(HashMap()))
            return genEOLangText.generateEO(0)
        }

        private fun getEOSample(path: Path): String {
            val eoPathStr = path.absolutePathString()
                .replace(testsFolderName, translatedTestsFolderName)
                .replace(".java", ".eo")
            return CharStreams.fromFileName(eoPathStr).toString()
        }

        private fun translateFile(path: Path): DynamicTest {
            return DynamicTest.dynamicTest(
                path.parent.fileName.toString() + sep +
                    path.fileName.toString()
            ) {
                assertTimeoutPreemptively(
                    Duration.ofSeconds(10)
                ) {
                    var translatedJava = translateJavaFile(path)
                    var sampleJava = getEOSample(path)

                    // Ignores comments in the beginning
                    translatedJava = translatedJava.substring(translatedJava.indexOf("+alias"))
                    sampleJava = sampleJava.substring(sampleJava.indexOf("+alias"))

                    assert(translatedJava == sampleJava)
                }
            }
        }

        @AfterAll
        @JvmStatic
        fun cleanup() {
        }

        private fun isReadyTest(path: Path): Boolean {
            return !path.endsWith("SampleTest.java") && !path.contains(Paths.get("target"))
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
