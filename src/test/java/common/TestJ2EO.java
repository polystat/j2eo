package common;

import eotree.EOProgram;
import lexer.Scanner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import parser.JavaParser;
import translator.Translator;
import tree.Compilation.CompilationUnit;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class TestJ2EO {

    private static String testFolderRoot;

    @BeforeAll
    static void setup() {
        String testFolderPath = "src/test/resources";
        File file = new File(testFolderPath);
        testFolderRoot = file.getAbsolutePath();
    }

    @TestFactory
    Collection<DynamicTest> testChapter4() {
        return testChapter(testFolderRoot + "/ch_4_types_values_variables");
    }

    @TestFactory
    Collection<DynamicTest> testChapter5() {
        return testChapter(testFolderRoot + "/ch_5_conversions_and_contexts");
    }

    @TestFactory
    Collection<DynamicTest> testChapter6() {
        return testChapter(testFolderRoot + "/ch_6_names");
    }

    @TestFactory
    Collection<DynamicTest> testChapter7() {
        return testChapter(testFolderRoot + "/ch_7_packages_and_modules");
    }

    @TestFactory
    Collection<DynamicTest> testChapter8() {
        return testChapter(testFolderRoot + "/ch_8_classes");
    }

    @TestFactory
    Collection<DynamicTest> testChapter9() {
        return testChapter(testFolderRoot + "/ch_9_interfaces");
    }

    @TestFactory
    Collection<DynamicTest> testChapter10() {
        return testChapter(testFolderRoot + "/ch_10_arrays");
    }

    @TestFactory
    Collection<DynamicTest> testChapter11() {
        return testChapter(testFolderRoot + "/ch_11_exceptions");
    }

    @TestFactory
    Collection<DynamicTest> testChapter14() {
        return testChapter(testFolderRoot + "/ch_14_blocks_statements_and_patterns");
    }

    @TestFactory
    Collection<DynamicTest> testChapter15() {
        return testChapter(testFolderRoot + "/ch_15_expressions");
    }

    @TestFactory
    Collection<DynamicTest> testChapter16() {
        return testChapter(testFolderRoot + "/ch_16_definite_assignment");
    }

    @TestFactory
    Collection<DynamicTest> testChapter17() {
        return testChapter(testFolderRoot + "/ch_17_threads_and_locks");
    }

    @TestFactory
    Collection<DynamicTest> testChapter18() {
        return testChapter(testFolderRoot + "/ch_18_type_inference");
    }

    @TestFactory
    Collection<DynamicTest> zerothTest() {
       return new ArrayList<>() {
           {
                add(testFile(Paths.get(testFolderRoot + "/../TEST0.java")));
           }
       };
    }

    private ArrayList<DynamicTest> testChapter(String chapterPath) {
        ArrayList<DynamicTest> chapterTests = new ArrayList<>();
        try {
            for (Path p : Files
                    .walk(Paths.get(chapterPath))
                    .filter(Files::isRegularFile)
                    .filter(TestJ2EO::isReadyTest)
                    .filter(TestJ2EO::isNotClassFile)
                    .collect(Collectors.toList())) {
                chapterTests.add(testFile(p));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chapterTests;
    }

    private static DynamicTest testFile(Path path) {
        return DynamicTest.dynamicTest(
                path.getFileName().toString(), () -> {
                    // Compile and execute Java file
                    String javaExecOutput = compileAndExecuteJava(path);

                    // Run parser
                    CompilationUnit unit = parseAndBuildAST(path);

                    // EO tree to string
                    String eoCode = translateToEO(unit);
                    System.out.println("eoCode = " + eoCode);

                    // Compile and execute translated to EO Java file
                    String eoExecOutput = compileAndExecuteEO(eoCode);

                    // Assert equal execution outputs
                    assertEquals(javaExecOutput, eoExecOutput);
                }
        );
    }

    private static String compileAndExecuteJava(Path path) {
        StringBuilder output = new StringBuilder();
        try {
            // Compile .java file
            Process compileProcess = Runtime.getRuntime().exec("javac " + path.toString());
            compileProcess.waitFor();

            // Execute .class file
            String folder = path.toString().substring(0, path.toString().lastIndexOf(File.separatorChar) + 1);
            Process execProcess = Runtime.getRuntime().exec("java -cp " + folder + " " + path.toString());

            // Receive output
            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(execProcess.getInputStream()));
            String s;
            while ((s = stdInput.readLine()) != null) {
                output.append(s).append(System.lineSeparator());
            }
            execProcess.waitFor();

            // Remove .class files
            for (Path p : Files
                    .walk(Paths.get(folder))
                    .filter(Files::isRegularFile)
                    .filter(TestJ2EO::isClassFile)
                    .collect(Collectors.toList())) {
                if (!p.toFile().delete()) {
                    System.err.println("Unable to delete file/dir: \"" + p.toString() + "\"");
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    private static CompilationUnit parseAndBuildAST(Path path) {
        Scanner scanner = new Scanner();
        scanner.read(path.toString());
        JavaParser parser = new JavaParser(scanner);
        try {
            if (!parser.parse()) {
                System.err.println("Unable to parse a .java file: \"" + path.toString() + "\"");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser.ast;
    }

    private static String translateToEO(CompilationUnit unit) {
        EOProgram eoProgram = Translator.translate(unit);
        return eoProgram.generateEO(0);
    }

    private static String compileAndExecuteEO(String eoCode) {
        return "passed" + System.lineSeparator(); // TODO: actual compilation & execution of EO code
    }

    private static boolean isReadyTest(Path path) {
        return !path.endsWith("SampleTest.java");
    }

    private static boolean isClassFile(Path path) {
        return path.toString().endsWith(".class");
    }

    private static boolean isNotClassFile(Path path) {
        return !isClassFile(path);
    }
}
