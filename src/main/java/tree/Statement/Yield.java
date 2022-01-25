package tree.Statement;

import java.util.ArrayList;
import tree.Entity;
import tree.Expression.Expression;

// SimpleStatement
//    : ...
//    | YIELD Expression SEMICOLON      // YieldStatement
//    | ...
//    ;
public class Yield extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public Expression expression;

    // Creation
    public Yield(ArrayList<String> ls, Expression expr) {
        super(ls);
        this.expression = expr;
        if ( this.expression != null ) this.expression.parent = this;
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
        Entity.doShift(sh);
        System.out.println("YIELD");
        if ( expression != null )
            expression.report(sh+Entity.shift);
    }

}
