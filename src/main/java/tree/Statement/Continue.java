package tree.Statement;

import lexer.*;
import tree.Entity;

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
    public Continue(ArrayList<String> ls, Token label)
    {
        super(ls);
        this.label = label.image;
    }

    // Reporting
    public void report(int sh)
    {
        super.report(sh);
        Entity.doShift(sh);
        System.out.print("CONTINUE ");
        if ( label != null ) System.out.print(label);
        System.out.println();
    }

}
