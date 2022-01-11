package tree.Expression;

import tree.Declaration.Declaration;
import tree.Entity;
import tree.Type.Type;

// InstanceofExpression
//    : RelationalExpression INSTANCEOF Type
//    | RelationalExpression INSTANCEOF Pattern
//    ;
public class InstanceOf extends Expression {
    // Structure
    public Expression expression;
    // Either type OR declaration
    public Type type;
    public Declaration declaration;

    // Creation
    public InstanceOf(Expression expr, Type type) {
        this.expression = expr;
        this.type = type;
    }

    public InstanceOf(Expression expr, Declaration decl) {
        this.expression = expr;
        this.declaration = decl;
    }

    // Reporting
    public void report(int sh) {
        Entity.doShift(sh);
        System.out.println("INSTANCEOF");
        expression.report(sh + Entity.shift);
        if (type != null) {
            type.report(sh + Entity.shift);
        } else {
            declaration.report(sh + Entity.shift);
        }
    }

}
