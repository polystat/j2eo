package tree.Statement;

import tree.Entity;
import tree.Statement.Statement;

import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | CONTINUE             SEMICOLON         // ContinueStatement
//    | CONTINUE IDENTIFIER  SEMICOLON         // ContinueStatement
//    | ...
//    ;
public class Continue extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public String label;

    // Creation
    public Continue(ArrayList<String> ls, String label)
    {
        super(ls);
        this.label = label;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.print("CONTINUE ");
        if ( label != null ) System.out.print(label);
        System.out.println();
    }

    // Generation
    public void generateEO()
    {

    }

}
