package tree.Expression;

import lexer.Token;
import lexer.TokenCode;
import tree.Entity;

public class UnaryPostfix extends Expression {
    // Structure
    public TokenCode operator;
    public Expression operand;

    // Creation
    public UnaryPostfix(Token token, Expression op) {
        this.operator = token.code;
        this.operand = op;
    }

    // Reporting
    public void report(int sh) {
        title("UNARY POSTFIX " + operator.toString(), sh);
        operand.report(sh + Entity.shift);
    }

}
