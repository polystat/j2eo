package tree.Expression;

import java.util.ArrayList;
import tree.Entity;

// Arguments
//    : LPAREN              RPAREN
//    | LPAREN ArgumentList RPAREN
//    ;
//
// ArgumentList
//    :                    Expression
//    | ArgumentList COMMA Expression
//    ;
public class ArgumentList extends Entity {
    // Structure
    public ArrayList<Expression> arguments;

    // Creation
    public ArgumentList(Expression expr) {
        this.arguments = new ArrayList<>();
        this.arguments.add(expr);
        if (expr != null) {
            expr.parent = this;
        }
    }

    public ArgumentList add(Expression expr) {
        this.arguments.add(expr);
        if (expr != null) {
            expr.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        for (Expression arg : arguments) {
            arg.report(sh);
            // System.out.println();
        }
    }

}
