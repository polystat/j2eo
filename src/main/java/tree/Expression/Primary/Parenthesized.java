package tree.Expression.Primary;

import tree.Expression.Expression;

// Primary
//    : ...
//    | LPAREN Expression RPAREN
//    | ...
public class Parenthesized extends Primary {
    // Structure
    public Expression expression;

    // Creation
    public Parenthesized(Expression expr) {
        this.expression = expr;
        if (this.expression != null) {
            this.expression.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        expression.report(sh);
    }

}
