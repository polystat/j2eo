package tree.Expression;

import lexer.Token;
import lexer.TokenCode;
import tree.Entity;

public class UnaryPrefix extends Expression {
    // Structure
    public TokenCode operator;
    public Expression operand;

    // Creation
    public UnaryPrefix(Token token, Expression op) {
        this.operator = token.code;
        this.operand = op;

        if (this.operand != null) {
            this.operand.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        title("UNARY PREFIX " + operator.toString(), sh);
        operand.report(sh + Entity.shift);
    }

}
