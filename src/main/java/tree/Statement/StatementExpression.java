package tree.Statement;

import tree.Entity;
import tree.Expression.*;
import java.util.ArrayList;

// StatementExpression
//    : Assignment
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
        int shift = sh;
        if ( super.labels != null && super.labels.size() != 0 )
        {
            super.report(sh);
            shift += Entity.shift;
        }
        expression.report(shift);
    }

}
