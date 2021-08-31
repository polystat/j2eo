package tree;

public class InstanceOf extends Expression
{
    // Structure
    public Expression expression;
    public Type type;

    // Creation
    public InstanceOf(Expression expr, Type tp)
    {
        this.expression = expr;
        this.type = tp;
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
