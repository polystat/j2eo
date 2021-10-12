package translator;

import eotree.EOBndExpr;
import tree.Statement.BlockStatement;
import tree.Statement.Statement;

public class Statements {
    public static EOBndExpr mapBlockStatement(BlockStatement stmt) {
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

    public static EOBndExpr mapStatement(Statement statement) {
        return null;
    }
}
