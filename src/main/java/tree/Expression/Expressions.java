package tree.Expression;

import java.util.ArrayList;
import tree.Entity;

public class Expressions extends Entity {
    // Structure
    public ArrayList<Expression> expressions;

    // Creation
    public Expressions(Expression expr) {
        this.expressions = new ArrayList<>();
        this.expressions.add(expr);
        if (expr != null) {
            expr.parent = this;
        }
    }

    public Expressions add(Expression expr) {
        this.expressions.add(expr);
        if (expr != null) {
            expr.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        for (Expression e : expressions) {
            e.report(sh);
            System.out.println();
        }
    }

}
