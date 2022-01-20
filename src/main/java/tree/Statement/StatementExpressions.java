package tree.Statement;

import tree.Entity;
import java.util.ArrayList;

public class StatementExpressions extends Entity
{
    // Structure
    public ArrayList<StatementExpression> expressions;

    // Creation
    public StatementExpressions(StatementExpression expr)
    {
        this.expressions = new ArrayList<>();
        this.expressions.add(expr);

        if ( expr != null ) expr.parent = this;
    }
    public StatementExpressions add(StatementExpression expr)
    {
        this.expressions.add(expr);
        if ( expr != null ) expr.parent = this;
        return this;
    }
}
