package tree;

public class Conditional extends Expression
{
    // Structure
    public Expression condition;
    public Expression truePart;
    public Expression falsePart;

    // Creation
    public Conditional(Expression c, Expression t, Expression f)
    {
        this.condition = c;
        this.truePart = t;
        this.falsePart = f;
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
