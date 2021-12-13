package translator

import eotree.EOAnonExpr
import tree.Statement.BlockStatement
import tree.Statement.Statement
import tree.Statement.StatementExpression

fun mapBlockStatement(stmt: BlockStatement): EOAnonExpr? {
    // Block statement is one of three variants
    return if (stmt.statement != null) {
        mapStatement(stmt.statement)
    } else if (stmt.declaration != null) {
        throw UnsupportedOperationException("Not implemented")
    } else if (stmt.expression != null) {
        throw UnsupportedOperationException("Not implemented")
    } else throw IllegalArgumentException("BlockStatement does not have any known type")
}

fun mapStatement(statement: Statement?): EOAnonExpr? {
    return if (statement is StatementExpression) {
        mapStatementExpression(statement)
    } else null
}

fun mapStatementExpression(stmtExpr: StatementExpression): EOAnonExpr? {
    return if (stmtExpr.expression != null) {
        mapExpression(stmtExpr.expression)
    } else null
}
