package tree.Expression;

import tree.Entity;
import tree.Type.TypeList;

// CastExpression
//    : TargetType UnaryExpression
//    | TargetType LambdaExpression
//    ;
public class Cast extends Expression {
    // Structure
    public TypeList types;
    public Expression expression;

    // Creation
    public Cast(TypeList types, Expression expr) {
        this.types = types;
        this.expression = expr;
    }

    // Reporting
    public void report(int sh) {
        Entity.doShift(sh);
        System.out.println("CAST");
        types.title("Target types:", sh + Entity.shift);
        types.report(sh + 2 * Entity.shift);
        expression.report(sh + Entity.shift);
    }

}
