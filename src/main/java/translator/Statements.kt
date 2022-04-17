package translator

import arrow.core.Option
import eotree.EOCopy
import eotree.EODot
import eotree.EOExpr
import eotree.eoDot
import tree.Statement.*
import util.ParseExprTasks

// fun mapBlockStatement(stmt: BlockStatement): EOExpr =
//    // Block statement is one of three variants
//    when {
//        stmt.statement != null ->
//            mapStatement(stmt.statement)
//        stmt.declaration != null ->
//            throw UnsupportedOperationException("Not implemented")
//        stmt.expression != null ->
//            mapExpression(stmt.expression)
//        else ->
//            throw IllegalArgumentException("BlockStatement does not have any known type")
//    }

fun mapStatement(parseExprTasks: ParseExprTasks, statement: Statement): EOExpr =
    when (statement) {
        is StatementExpression -> mapStatementExpression(parseExprTasks, statement)
        is Return -> mapReturnStatement(parseExprTasks, statement)
        is IfThenElse -> mapIfThenElseStatement(parseExprTasks, statement)
        is While -> mapWhileStatement(parseExprTasks, statement)
        is Do -> mapDoStatement(parseExprTasks, statement)
        // is Switch -> mapSwitchStatement(parseExprTasks, statement)
        else ->
            throw IllegalArgumentException("Statement of type ${statement.javaClass.simpleName} is not supported")
    }

fun mapStatementExpression(parseExprTasks: ParseExprTasks, stmtExpr: StatementExpression): EOExpr {
    return parseExprTasks.addTask(stmtExpr.expression).eoDot()
}

fun mapReturnStatement(parseExprTasks: ParseExprTasks, rn: Return): EOExpr {
    if (rn.expression != null) {
        return parseExprTasks.addTask(rn.expression).eoDot()
    } else {
        return "return_placeholder".eoDot()
    }
}

fun mapIfThenElseStatement(parseExprTasks: ParseExprTasks, rn: IfThenElse): EOExpr =
    if (rn.elsePart == null) {
        EOCopy(
            EODot(
                Option.fromNullable(mapExpression(parseExprTasks, rn.condition)),
                "if"
            ),
            mapStatement(parseExprTasks, rn.thenPart)
        )
    } else {
        EOCopy(
            EODot(
                Option.fromNullable(mapExpression(parseExprTasks, rn.condition)),
                "if"
            ),
            mapStatement(parseExprTasks, rn.thenPart),
            mapStatement(parseExprTasks, rn.elsePart)
        )
    }

fun mapWhileStatement(parseExprTasks: ParseExprTasks, rn: While): EOExpr =
    EOCopy(
        EODot(
            Option.fromNullable(mapExpression(parseExprTasks, rn.condition)),
            "while"
        ),
        mapStatement(parseExprTasks, rn.statement)
    )

fun mapDoStatement(parseExprTasks: ParseExprTasks, rn: Do): EOExpr =
    EOCopy(
        EODot(
            Option.fromNullable(mapExpression(parseExprTasks, rn.condition)),
            "while"
        ),
        mapStatement(parseExprTasks, rn.statement)
    )

// fun mapIfThenElse(statement: IfThenElse): EOExpr =
//    EOCopy(
//        "if.",
//        listOfNotNull(
//            mapExpression(statement.condition),
//            mapStatement(statement.thenPart),
//            if (statement.elsePart != null) mapStatement(statement.elsePart) else null,
//        )
//    )
