package tree.Statement;

import lexer.*;
import tree.Entity;
import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | BREAK            SEMICOLON             // BreakStatement
//    | BREAK IDENTIFIER SEMICOLON             // BreakStatement
//    | ...
//    ;
public class Break extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public String label;

    // Creation
    public Break(ArrayList<String> ls, Token label)
    {
        super(ls);
        this.label = label.image;
    }

    // Reporting
    public void report(int sh)
    {
        super.report(sh);
        Entity.doShift(sh);
        System.out.print("BREAK ");
        if ( label != null ) System.out.print(label);
        System.out.println();
    }

}
