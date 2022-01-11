package tree.Statement;

import java.util.ArrayList;
import tree.Entity;

public class StatementExpressions extends Entity {
    // Structure
    public ArrayList<StatementExpression> expressions;

    // Creation
    public StatementExpressions(StatementExpression expr) {
        this.expressions = new ArrayList<>();
        this.expressions.add(expr);
    }

    public StatementExpressions add(StatementExpression expr) {
        this.expressions.add(expr);
        return this;
    }
}
