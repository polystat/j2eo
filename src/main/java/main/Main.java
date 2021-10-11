package main;

import lexer.*;
import parser.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(args[0]);

        Scanner.read(args[0]);
        Scanner scanner = new Scanner();
        JavaParser parser = new JavaParser(scanner);
        try {
            boolean result = parser.parse();
            System.out.println(result?"SUCCESS":"FAIL");
            parser.ast.report(0);
        }
        catch(java.io.IOException exc)
        {
            System.out.println("ABORT");
        }
    }
}
