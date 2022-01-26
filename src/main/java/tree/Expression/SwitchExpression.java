package tree.Expression;

import tree.Statement.SwitchBlock;

// SwitchExpression
//    : SWITCH LPAREN Expression RPAREN SwitchBlock
//    ;
public class SwitchExpression extends Expression {
    // Structure
    public Expression expression;
    public SwitchBlock switchBlock;

    // Creation
    public SwitchExpression(Expression expr, SwitchBlock block) {
        this.expression = expr;
        this.switchBlock = block;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        if (this.switchBlock != null) {
            this.switchBlock.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }

}
