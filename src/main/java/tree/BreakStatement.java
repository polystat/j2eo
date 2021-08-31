package tree;

import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | BREAK            SEMICOLON             // BreakStatement
//    | BREAK IDENTIFIER SEMICOLON             // BreakStatement
//    | ...
//    ;
public class BreakStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public String label;

    // Creation
    public BreakStatement(ArrayList<String> ls, String label)
    {
        super(ls);
        this.label = label;
    }

    // Reporting
    public void report(int sh)
    {

    }

    // Generation
    public void generateEO()
    {

    }
}
