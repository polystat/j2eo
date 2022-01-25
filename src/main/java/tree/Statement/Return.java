package tree.Statement;

import java.util.ArrayList;
import tree.Entity;
import tree.Expression.Expression;

// SimpleStatement
//    : ...
//    | RETURN            SEMICOLON            // ReturnStatement
//    | RETURN Expression SEMICOLON            // ReturnStatement
//    | ...
//    ;
public class Return extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public Expression expression;

    // Creation
    public Return(ArrayList<String> ls, Expression expr) {
        super(ls);
        this.expression = expr;

        if ( this.expression != null ) this.expression.parent = this;
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
        Entity.doShift(sh);
        System.out.print("RETURN");
        if (expression != null) {
            System.out.println();
            expression.report(sh + Entity.shift);
        }
    }

}
