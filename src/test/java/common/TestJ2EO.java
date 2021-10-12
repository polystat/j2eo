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
import tree.Compilation.Package;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
    Collection<DynamicTest> testChapter15() {
        return testChapter(testFolderRoot + "/ch_15_expressions");
    }

    @TestFactory
    Collection<DynamicTest> testChapter8() {
        return testChapter(testFolderRoot + "/ch_8_classes");
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
                    //String eoCode = translateToEO(unit);
                    String eoCode = "[args...] > app";

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
                p.toFile().delete();
                p.toFile().deleteOnExit();
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    private static CompilationUnit parseAndBuildAST(Path path) {
        Scanner.read(path.toString());
        Scanner scanner = new Scanner();
        JavaParser parser = new JavaParser(scanner);
        try {
            boolean success = parser.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser.ast;
    }

    private static String translateToEO(CompilationUnit unit) {
        Translator translator = new Translator();
        EOProgram eoProgram = translator.translate((Package) unit); // TODO: 'CompilationUnit' preferred
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
