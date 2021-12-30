package main;

import lexer.*;
import org.apache.commons.cli.*;
import parser.*;
import tree.Entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static translator.TranslatorKt.translate;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Setup command line argument parser
        Options options = new Options();

        Option output = new Option("o", "output", true, "Target EOLANG filepath");
        output.setRequired(false);
        options.addOption(output);

        Option debug = new Option("d","debug",false,"Debug mode");
        debug.setRequired(false);
        options.addOption(debug);

        Option syntaxOnly = new Option("s","syntax",false,"Syntax only");
        syntaxOnly.setRequired(false);
        options.addOption(syntaxOnly);

        CommandLineParser cmdLineParser = new DefaultParser();
        HelpFormatter     formatter     = new HelpFormatter();
        CommandLine       cmd           = null;

        // Parse command line arguments and exit if parsing failed.
        try {
            cmd = cmdLineParser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            printUsage(formatter, options);
            System.exit(1);
        }

        // Check argv for all required data
        if (cmd.getArgList().size() != 1) {
            printUsage(formatter, options);
            System.exit(1);
        }

        boolean outputToFile = cmd.hasOption("o");
        Entity.syntaxOnly = cmd.hasOption("s");
        Entity.debug = cmd.hasOption("d");

        // Check if source file exists
        String inputFilepath = cmd.getArgList().get(0);
        var    f             = new File(inputFilepath);
        if (!f.exists())
            throw new FileNotFoundException("No file found at \"" + inputFilepath + "\"");

        // Read, parse, map and print file
        Scanner scanner = new Scanner();
        scanner.readFile(inputFilepath);
        JavaParser parser  = new JavaParser(scanner);
        try {
            boolean result = parser.parse();
            System.out.println("Parsing completed: "+(result ? "SUCCESS" : "FAIL"));
            if (parser.ast != null) {
                if ( Entity.debug ) parser.ast.report(0);
                if ( Entity.syntaxOnly ) return;
                var eoProgram  = translate(parser.ast);
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
        formatter.printHelp("java -jar J2EO.jar [OPTIONS...] <input file>", options);
    }
}
