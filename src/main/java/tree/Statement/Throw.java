package tree.Statement;

import java.util.ArrayList;
import tree.Entity;
import tree.Expression.Expression;

// SimpleStatement
//    : ...
//    | THROW Expression SEMICOLON      // ThrowStatement
//    | ...
//    ;
public class Throw extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public Expression expression;

    // Creation
    public Throw(ArrayList<String> ls, Expression expr) {
        super(ls);
        this.expression = expr;
        if (this.expression != null) {
            this.expression.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
        Entity.doShift(sh);
        System.out.println("THROW");
        if (expression != null) {
            expression.report(sh + Entity.shift);
        }
    }

}
