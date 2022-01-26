package tree.Expression;

import tree.Entity;

// ArrayAccess
//    : CompoundName LBRACKET Expression RBRACKET
//    | Primary      LBRACKET Expression RBRACKET
//    ;
public class ArrayAccess extends Expression {
    // Structure
    public Expression expression;
    public Expression size;

    // Creation
    public ArrayAccess(Expression expr, Expression size) {
        this.expression = expr;
        this.size = size;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        if (this.size != null) {
            this.size.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        Entity.doShift(sh);
        System.out.println("ARRAY ACCESS");
        expression.report(sh + Entity.shift);
        size.report(sh + Entity.shift);
    }

}
