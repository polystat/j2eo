package tree;

import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | CONTINUE             SEMICOLON         // ContinueStatement
//    | CONTINUE IDENTIFIER  SEMICOLON         // ContinueStatement
//    | ...
//    ;
public class ContinueStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public String label;

    // Creation
    public ContinueStatement(ArrayList<String> ls, String label)
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
