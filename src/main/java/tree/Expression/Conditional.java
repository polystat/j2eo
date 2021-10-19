package tree.Expression;

import tree.Entity;

// ConditionalExpression
//    : ConditionalOrExpression ConditionalOrTail
//    ;
//
// ConditionalOrTail
//    : %empty
//    | QUESTION Expression COLON ConditionalExpression
//    | QUESTION Expression COLON LambdaExpression
//    ;
public class Conditional extends Expression
{
    // Structure
    public Expression condition;
    public Expression thenPart;
    public Expression elsePart;

    // Creation
    public Conditional(Expression c, Expression t, Expression e)
    {
        this.condition = c;
        this.thenPart = t;
        this.elsePart = e;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("CONDITIONAL");
        condition.report(sh+Entity.shift);
        thenPart.report(sh+Entity.shift);
        elsePart.report(sh+Entity.shift);
    }

}
