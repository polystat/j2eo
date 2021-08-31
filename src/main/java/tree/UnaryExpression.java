package tree;

public class UnaryExpression extends Expression
{
    public enum operator
    {
        op_plus,
        op_minus,
        op_negation,       // !
        op_inversion,      // ~
        op_preincrement,   // ++
        op_predecrement,   // --
        op_postincrement,
        op_postdecrement,
    }

    // Structure
    public Expression operand;
    public operator sign;

    // Creation
    public UnaryExpression(Expression operand, operator op)
    {
        this.operand = operand;
        this.sign = op;
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
