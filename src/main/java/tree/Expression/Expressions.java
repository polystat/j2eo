package tree.Expression;

import tree.Entity;

import java.util.ArrayList;

public class Expressions extends Entity
{
    // Structure
    public ArrayList<Expression> expressions;

    // Creation
    public Expressions(Expression expr)
    {
        this.expressions = new ArrayList<>();
        this.expressions.add(expr);
    }
    public Expressions add(Expression expr)
    {
        this.expressions.add(expr);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        for (Expression e: expressions)
        {
            e.report(sh);
            System.out.println();
        }
    }

    // Generation
    public void generateEO()
    {

    }
}
