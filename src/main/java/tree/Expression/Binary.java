package tree.Expression;

import lexer.*;
import tree.Entity;

public class Binary extends Expression
{
    // Structure
    public Expression left;
    public Expression right;
    public TokenCode operator;

    // Creation
    public Binary(Expression l, Expression r, Token token)
    {
        super();
        this.left = l;
        this.right = r;
        this.operator = token.code;
    }

    // Reporting
    public void report(int sh)
    {
        title("BINARY "+operator.toString(),sh);
        left.report(sh+Entity.shift);
        right.report(sh+Entity.shift);
    }

}
