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

        if ( this.operand != null ) this.operand.parent = this;
    }

    // Reporting
    public void report(int sh)
    {
        title("UNARY POSTFIX "+operator.toString(),sh);
        operand.report(sh+Entity.shift);
    }

}
