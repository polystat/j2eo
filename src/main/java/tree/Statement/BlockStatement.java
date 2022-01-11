package tree.Statement;

import tree.Declaration.Declaration;
import tree.Expression.Expression;

// BlockStatement
//    : ModifierSeqOpt BlockDeclaration
//    | Statement
//    ;
public class BlockStatement extends Statement {
    // Structure: either a declaration OR a statement OR an expression
    public Declaration declaration;
    public Statement statement;
    public Expression expression;

    // Creation
    public BlockStatement(Declaration d) {
        super(null);
        this.declaration = d;
    }

    public BlockStatement(Statement stmt) {
        super(null);
        this.statement = stmt;
    }

    public BlockStatement(Expression expr) {
        super(null);
        this.expression = expr;
    }

    // Reporting
    public void report(int sh) {
        if (declaration != null) {
            declaration.report(sh);
            return;
        }
        if (statement != null) {
            statement.report(sh);
            return;
        }
        if (expression != null) {
            expression.report(sh);
        }
    }

}
