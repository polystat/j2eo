package translator;

import eotree.EOAnonExpr;
import tree.Statement.BlockStatement;
import tree.Statement.Statement;
import tree.Statement.StatementExpression;

public class Statements {
    public static EOAnonExpr mapBlockStatement(BlockStatement stmt) {
        // Block statement is one of three variants
        if (stmt.statement != null) {
            return Statements.mapStatement(stmt.statement);
        } else if (stmt.declaration != null) {
            throw new UnsupportedOperationException("Not implemented");
        } else if (stmt.expression != null) {
            throw new UnsupportedOperationException("Not implemented");
        } else
            throw new IllegalArgumentException("BlockStatement does not have any known type");
    }

    public static EOAnonExpr mapStatement(Statement statement) {
        if (statement instanceof StatementExpression) {
            return mapStatementExpression((StatementExpression) statement);
        }
        return null;
    }

    public static EOAnonExpr mapStatementExpression(StatementExpression stmtExpr) {
        if (stmtExpr.expression != null) {
            return Expressions.mapExpression(stmtExpr.expression);
        }
        return null;
    }
}
