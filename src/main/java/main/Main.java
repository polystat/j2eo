package main;

import lexer.*;
import parser.*;
import translator.Translator;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(args[0]);

        // Check if source file exists
        var f = new File(args[0]);
        if (!f.exists())
            throw new FileNotFoundException("No file found at \"" + args[0] + "\"");

        Scanner.read(args[0]);
        Scanner    scanner = new Scanner();
        JavaParser parser  = new JavaParser(scanner);
        try {
            boolean result = parser.parse();
            System.out.println(result ? "SUCCESS" : "FAIL");
            if (parser.ast != null) {
                parser.ast.report(0);
                var eoProgram  = Translator.translate(parser.ast);
                var targetText = eoProgram.generateEO(0);
                System.out.println("\n\n=== Produced EO code ===");
                System.out.println(targetText);
            } else
                throw new IllegalStateException("Parser AST is null");


        } catch (java.io.IOException exc) {
            System.out.println("ABORT");
        }
    }
}
