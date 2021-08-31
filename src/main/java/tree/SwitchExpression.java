package tree;

// SwitchExpression
//    : SWITCH LPAREN Expression RPAREN SwitchBlock
//    ;
public class SwitchExpression extends Expression
{
    // Structure
    public Expression expression;
    public SwitchBlock switchBlock;

    // Creation
    public SwitchExpression(Expression expr, SwitchBlock block)
    {
        this.expression = expr;
        this.switchBlock = block;
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
