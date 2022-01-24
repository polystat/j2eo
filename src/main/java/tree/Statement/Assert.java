package tree.Statement;

import java.util.ArrayList;
import tree.Entity;
import tree.Expression.Expression;

// SimpleStatement
//     ...
//    | ASSERT Expression                  SEMICOLON // AssertStatement
//    | ASSERT Expression COLON Expression SEMICOLON // AssertStatement
//    | ...
//    ;
public class Assert extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public Expression expression;
    public Expression expression2;

    // Creation
    public Assert(ArrayList<String> ls, Expression expr, Expression expr2) {
        super(ls);
        this.expression = expr;
        this.expression2 = expr2;

        if ( this.expression != null )  this.expression.parent = this;
        if ( this.expression2 != null ) this.expression2.parent = this;
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
        title("ASSERT", sh);
        expression.report(sh + Entity.shift);
        if (expression2 != null) {
            System.out.println();
            Entity.doShift(sh);
            System.out.println("DIAG");
            expression2.report(sh + Entity.shift);
        }
    }

}
