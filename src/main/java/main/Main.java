package main;

import lexer.Scanner;
import org.apache.commons.cli.*;
import parser.JavaParser;
import translator.Translator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        // Setup command line argument parser
        Options options = new Options();

        Option output = new Option("o", "output", true, "Target EOLANG filepath");
        output.setRequired(false);
        options.addOption(output);

        CommandLineParser cmdLineParser = new DefaultParser();
        HelpFormatter     formatter     = new HelpFormatter();
        CommandLine       cmd           = null;

        // Parse command line arguments and exit if parsing failed.
        try {
            cmd = cmdLineParser.parse(options, args);
        } catch (ParseException e) {
            e.printStackTrace();
            printUsage(formatter, options);
            System.exit(1);
        }

        // Check argv for all required data
        if (cmd.getArgList().size() != 1) {
            printUsage(formatter, options);
            System.exit(1);
        }

        boolean outputToFile = cmd.hasOption("o");

        // Check if source file exists
        String inputFilepath = cmd.getArgList().get(0);
        var    f             = new File(inputFilepath);
        if (!inputFilepath.equals("-") && !f.exists())
            throw new FileNotFoundException("No file found at \"" + inputFilepath + "\"");


        // Read, parse, map and print file
        Scanner scanner = new Scanner();
        if (inputFilepath.equals("-")) {
            // Handle stdin case
            var src = new String(System.in.readAllBytes(), StandardCharsets.UTF_8);
            scanner.read(src);
        } else {
            // Handle file case
            scanner.readFile(inputFilepath);
        }
        JavaParser parser = new JavaParser(scanner);
        try {
            boolean result = parser.parse();
            System.out.println(result ? "SUCCESS" : "FAIL");
            if (parser.ast != null) {
                //parser.ast.report(0);
                var eoProgram  = Translator.translate(parser.ast);
                var targetText = eoProgram.generateEO(0);

                // Print generated code to stdout or to file, if any specified
                if (outputToFile) {
                    String outputPath = cmd.getOptionValue("o");
                    try (PrintWriter writer = new PrintWriter(outputPath)) {
                        writer.println(targetText);
                    }
                } else {
                    System.out.println("\n\n=== Produced EO code ===");
                    System.out.println(targetText);
                }
            } else
                throw new IllegalStateException("Parser AST is null");

        } catch (java.io.IOException exc) {
            System.out.println("ABORT");
        }
    }

    private static void printUsage(HelpFormatter formatter, Options options) {
        formatter.printHelp("java -jar J2EO.jar [OPTIONS...] <input file or - for stdin>", options);
    }
}
