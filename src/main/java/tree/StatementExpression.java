package tree;

import java.util.ArrayList;

// StatementExpression
//    : Assignment  ===================????????????????
//    | PreIncrementExpression
//    | PreDecrementExpression
//    | PostIncrementExpression
//    | PostDecrementExpression
//    | MethodInvocation
//    | ClassInstanceCreationExpression
//    ;
public class StatementExpression extends Statement
{
    // Structure
    public Expression expression;

    // Creation
    public StatementExpression(ArrayList<String> ls, Expression expr)
    {
        super(ls);
        this.expression = expr;
    }

    // Reporting
    public void report(int sh)
    {

    }

    // Generation
    public void generateEO()
    {

    }
}
