package tree.Expression;

import tree.*;
import tree.Type.TypeList;

// CastExpression
//    : TargetType UnaryExpression   { $$ = new Cast($1,$2); }
//    | TargetType LambdaExpression  { $$ = new Cast($1,$2); }
//    ;
public class Cast extends Expression
{
    // Structure
    public TypeList types;
    public Expression expression;

    // Creation
    public Cast(TypeList types,Expression expr)
    {
        this.types = types;
        this.expression = expr;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("CAST");
        types.report(sh+Entity.shift);
        expression.report(sh+Entity.shift);
    }

}
