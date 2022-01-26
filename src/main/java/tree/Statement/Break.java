package tree.Statement;

import java.util.ArrayList;
import lexer.Token;
import tree.Entity;

// SimpleStatement
//    : ...
//    | BREAK            SEMICOLON             // BreakStatement
//    | BREAK IDENTIFIER SEMICOLON             // BreakStatement
//    | ...
//    ;
public class Break extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public String label;

    // Creation
    public Break(ArrayList<String> ls, Token label) {
        super(ls);
        this.label = label.image;
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
        Entity.doShift(sh);
        System.out.print("BREAK ");
        if (label != null) {
            System.out.print(label);
        }
        System.out.println();
    }

}
