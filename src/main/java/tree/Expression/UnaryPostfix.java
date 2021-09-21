package tree.Expression;

import lexer.*;
import tree.Entity;

public class UnaryPostfix extends Expression
{
    // Structure
    public TokenCode operator;
    public Expression operand;

    // Creation
    public UnaryPostfix(Token token, Expression op)
    {
        this.operator = token.code;
        this.operand = op;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("UNARY POSTFIX "+operator.toString());
        operand.report(sh+Entity.shift);
    }

    // Generation
    public void generateEO()
    {

    }

}
