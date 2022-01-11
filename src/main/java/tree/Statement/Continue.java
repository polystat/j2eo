package tree.Statement;

import java.util.ArrayList;
import lexer.Token;
import tree.Entity;

// SimpleStatement
//    : ...
//    | CONTINUE             SEMICOLON         // ContinueStatement
//    | CONTINUE IDENTIFIER  SEMICOLON         // ContinueStatement
//    | ...
//    ;
public class Continue extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public String label;

    // Creation
    public Continue(ArrayList<String> ls, Token label) {
        super(ls);
        this.label = label.image;
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
        Entity.doShift(sh);
        System.out.print("CONTINUE ");
        if (label != null) {
            System.out.print(label);
        }
        System.out.println();
    }

}
