package tree.Expression;

import lexer.Token;
import tree.Entity;

// FieldAccess
//    : Primary                DOT IDENTIFIER
//    |                  SUPER DOT IDENTIFIER
//    | CompoundName DOT SUPER DOT IDENTIFIER
//    ;
public class FieldAccess extends Expression {
    // Structure
    public Expression expression; // Primary or SimpleReference
    public boolean superSign;
    public String identifier;

    // Creation
    public FieldAccess(Expression expr, boolean ss, Token id) {
        this.expression = expr;
        this.superSign = ss;
        this.identifier = id.image;

        if (this.expression != null) {
            this.expression.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        Entity.doShift(sh);
        if (expression != null) {
            expression.report(0);
            if (superSign) {
                System.out.print(".");
            }
        } else if (superSign) {
            System.out.print("SUPER.");
        }
        System.out.print(identifier);
    }

}
