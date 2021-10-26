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
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class TestJ2EO {

    private static String testFolderRoot;
    private static final char sep = File.separatorChar;

    @BeforeAll
    static void setup() {
        boolean testCandidates = System.getProperty("candidates") != null &&
                System.getProperty("candidates").equals("true");
        System.out.println("Testing candidates:  " + testCandidates);
        String testFolderPath = "src" + sep + "test" + sep + "resources";
        if (testCandidates) {
            testFolderPath += sep + "test_candidates";
        }
        File file = new File(testFolderPath);
        testFolderRoot = file.getAbsolutePath();
    }

    @TestFactory
    Collection<DynamicTest> testChapter4() {
        return testChapter(testFolderRoot + sep + "ch_4_types_values_variables");
    }

    @TestFactory
    Collection<DynamicTest> testChapter5() {
        return testChapter(testFolderRoot + sep + "ch_5_conversions_and_contexts");
    }

    @TestFactory
    Collection<DynamicTest> testChapter6() {
        return testChapter(testFolderRoot + sep + "ch_6_names");
    }

    @TestFactory
    Collection<DynamicTest> testChapter7() {
        return testChapter(testFolderRoot + sep + "ch_7_packages_and_modules");
    }

    @TestFactory
    Collection<DynamicTest> testChapter8() {
        return testChapter(testFolderRoot + sep + "ch_8_classes");
    }

    @TestFactory
    Collection<DynamicTest> testChapter9() {
        return testChapter(testFolderRoot + sep + "ch_9_interfaces");
    }

    @TestFactory
    Collection<DynamicTest> testChapter10() {
        return testChapter(testFolderRoot + sep + "ch_10_arrays");
    }

    @TestFactory
    Collection<DynamicTest> testChapter11() {
        return testChapter(testFolderRoot + sep + "ch_11_exceptions");
    }

    @TestFactory
    Collection<DynamicTest> testChapter14() {
        return testChapter(testFolderRoot + sep + "ch_14_blocks_statements_and_patterns");
    }

    @TestFactory
    Collection<DynamicTest> testChapter15() {
        return testChapter(testFolderRoot + sep + "ch_15_expressions");
    }

    @TestFactory
    Collection<DynamicTest> testChapter16() {
        return testChapter(testFolderRoot + sep + "ch_16_definite_assignment");
    }

    @TestFactory
    Collection<DynamicTest> testChapter17() {
        return testChapter(testFolderRoot + sep + "ch_17_threads_and_locks");
    }

    @TestFactory
    Collection<DynamicTest> testChapter18() {
        return testChapter(testFolderRoot + sep + "ch_18_type_inference");
    }

    @TestFactory
    Collection<DynamicTest> simpleTest() {
        return new ArrayList<>() {
            {
                add(testFile(Paths.get(testFolderRoot + sep + "SimpleTest.java")));
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
                    .filter(TestJ2EO::isJavaFile)
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
                path.getParent().getFileName().toString() + "/" +
                        path.getFileName().toString(), () -> {
                    // Compile and execute Java file
                    String javaExecOutput = compileAndExecuteJava(path);
                    System.out.println("javaExecOutput = \n" + javaExecOutput);
                    System.out.flush();

                    // Run parser
                    CompilationUnit unit = parseAndBuildAST(path);

                    // EO tree to string
                    String eoCode = translateToEO(unit);
                    System.out.println("eoCode = \n" + eoCode);
                    System.out.flush();

                    // Compile and execute translated to EO Java file
                    String eoExecOutput = compileAndExecuteEO(eoCode, path);
                    //System.out.println("eoExecOutput = \n" + eoExecOutput);
                    //System.out.flush();

                    // Assert equal execution outputs
                    assertEquals(javaExecOutput, eoExecOutput);
                }
        );
    }

    private static String compileAndExecuteJava(Path path) {
        StringBuilder output = new StringBuilder();
        try {
            // Compile .java file
            String fileName = path.getFileName().toString().split("\\.")[0];
            Path subFolder = Paths.get(path.getParent().toString(), fileName + "_java");
            if (Files.exists(subFolder)) {
                deleteDirTree(subFolder);
            }
            Files.createDirectories(subFolder);
            Files.copy(path, Paths.get(subFolder.toString(), path.getFileName().toString()));
            ProcessBuilder compilePb = new ProcessBuilder(
                    "javac",
                    "-d",
                    subFolder.toString(),
                    path.toString()
            );
            compilePb.directory(new File(subFolder.toString()));
            compilePb.redirectErrorStream(true);
            Process compileProcess = compilePb.start();
            compileProcess.waitFor();
            compileProcess.destroy();

            // Execute .class file
            ProcessBuilder execPb = new ProcessBuilder(
                    "java",
                    "-cp",
                    subFolder.toString() + sep,
                    fileName
            );
            execPb.directory(new File(subFolder.toString()));
            execPb.redirectErrorStream(true);
            Process execProcess = execPb.start();

            // Receive output
            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(execProcess.getInputStream()));
            String s;
            while ((s = stdInput.readLine()) != null) {
                output.append(s).append(System.lineSeparator());
            }
            execProcess.waitFor();
            execProcess.destroy();

            // Remove .class files
            deleteDirTree(subFolder);

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

    /***
     * The process is following:<br>
     * 1. In the same parent folder as the ".java" test file has create subfolder.<br>
     * 2. In that subfolder create "eo" subfolder.<br>
     * 3. In "eo" subfolder create "main.eo" file and write previously generated EO code to it.<br>
     * 4. Alongside "eo" subfolder make a copy of "pom.xml" file fo Maven.<br>
     * 5. Compile "main.eo" with <pre>mvn clean compile</pre>
     * 6. Execute with <pre>java -cp ...</pre>
     * 7. Receive execution output<br>
     * 8. Pass received output back<br>
     * @param eoCode previously generated EO code
     * @param testFilePath path to the ".java" test file
     * @return EO execution output
     */
    private static String compileAndExecuteEO(String eoCode, Path testFilePath) {
        StringBuilder eoExecOut = new StringBuilder();
        String eoFileName = testFilePath.getFileName().toString().split("\\.")[0];
        Path testFolderPath = Paths.get(testFilePath.getParent().toString(), eoFileName + "_eo");
        try {
            // Setup temporary folders and files
            if (Files.exists(testFolderPath)) {
                deleteDirTree(testFolderPath);
            }
            Path eoExecDir = Files.createDirectories(
                        Paths.get(testFolderPath.toString(), "eo"));
            Path eoFilePath = Files.createFile(Paths.get(eoExecDir.toString() + sep + "class_" + eoFileName + ".eo"));
            Files.copy(
                    Paths.get(testFolderRoot, "eo_execution_pom", "pom.xml"),
                    Paths.get(eoExecDir.getParent().toString() + sep + "pom.xml"));

            // Write generated code to the file
            Files.writeString(eoFilePath, eoCode);

            // Execute generated EO code
            try {
                boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows"); // Matters a lot

                // Compile EO file
                ProcessBuilder compilePb = new ProcessBuilder("mvn" + (isWindows ? ".cmd" : ""), "clean", "compile");
                compilePb.directory(new File(eoExecDir.getParent().toString()));
                compilePb.redirectErrorStream(true);
                Process compileProcess = compilePb.start();

                // Receive compilation output (may be useful)
                BufferedReader mvnStdInput = new BufferedReader(new
                        InputStreamReader(compileProcess.getInputStream()));
                String m;
                while ((m = mvnStdInput.readLine()) != null) {
                    System.out.println(m);
                    System.out.flush();
                }
                compileProcess.waitFor();
                compileProcess.destroy();

                // Execute Java ".class"es
                ProcessBuilder execPb = new ProcessBuilder(
                        "java",
                        "-cp",
                        (isWindows ?
                                "\"target/classes;target/eo-runtime.jar\"" :
                                "target/classes:target/eo-runtime.jar"),
                        "org.eolang.Main",
                        "global",
                        (isWindows ? "%*" : "\"$@\"")
                );
                execPb.directory(new File(eoExecDir.getParent().toString()));
                execPb.redirectErrorStream(true);
                Process execProcess = execPb.start();

                // Receive EO execution output
                BufferedReader stdInput = new BufferedReader(new
                        InputStreamReader(execProcess.getInputStream()));
                String s;
                while ((s = stdInput.readLine()) != null) {
                    eoExecOut.append(s).append(System.lineSeparator());
                    System.out.println(s);
                    System.out.flush();
                }
                execProcess.waitFor();
                execProcess.destroy();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Clean everything out
            deleteDirTree(eoExecDir.getParent());

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Double check for delete, so that no obsolete files are created after test fail
        if (Files.exists(testFolderPath)) {
            try {
                deleteDirTree(testFolderPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return eoExecOut.isEmpty() ? "not passed" : eoExecOut.toString();
    }

    private static void deleteDirTree(Path path) throws IOException {
        Files.walkFileTree(path, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private static boolean isReadyTest(Path path) {
        return !path.endsWith("SampleTest.java");
    }

    private static boolean isClassFile(Path path) {
        return path.toString().endsWith(".class");
    }

    private static boolean isJavaFile(Path path) {
        return path.toString().endsWith(".java");
    }

    private static boolean isNotClassFile(Path path) {
        return !isClassFile(path);
    }
}
