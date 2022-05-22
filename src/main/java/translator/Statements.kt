package translator

import arrow.core.None
import eotree.*
import tree.Statement.*
import java.util.Random

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

fun mapStatement(statement: Statement, name: String): List<EOBndExpr> =
    when (statement) {
        is StatementExpression -> mapStatementExpression(statement, name)
        is Return -> mapReturnStatement(statement, name)
        is IfThenElse -> mapIfThenElseStatement(statement, name)
        is While -> mapWhileStatement(statement, name)
        is Do -> mapDoStatement(statement, name)
        is Block -> mapBlock(statement, name)
        // is Switch -> mapSwitchStatement(parseExprTasks, statement)
        is Assert -> mapAssert(statement, name)
        else ->
            listOf() // FIXME
        // FIXME: throw IllegalArgumentException("Statement of type ${statement.javaClass.simpleName} is not supported")
    }

fun mapEmptyStmt(name: String): EOBndExpr =
    EOBndExpr(
        EOObject(
            listOf(),
            None,
            listOf(
                EOBndExpr(
                    EOCopy(
                        "0"
                    ),
                    "@"
                )
            )
        ),
        name
    )

fun constructStmtName(statement: Statement): String =
    when (statement) {
        is StatementExpression -> "se${statement.hashCode()}"
        is Return -> "r${statement.hashCode()}"
        is IfThenElse -> "if_t_e${statement.hashCode()}"
        is While -> "w${statement.hashCode()}"
        is Do -> "do${statement.hashCode()}"
        is Block -> "b${statement.hashCode()}"
        // is Switch -> mapSwitchStatement(parseExprTasks, statement)
        is Assert -> "ast${statement.hashCode()}"
        else ->
            "unknown${statement.hashCode()}" // FIXME
        // FIXME: throw IllegalArgumentException("Statement of type ${statement.javaClass.simpleName} is not supported")
    }


fun mapAssert(assert: Assert, name: String): List<EOBndExpr> {
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(constructExprName(assert.expression), "if").eoDot(),
                            "TRUE".eoDot(),
                            EOObject(
                                listOf(),
                                None,
                                listOf(
                                    EOBndExpr(
                                        EOCopy(
                                            if (assert.expression2 == null) {
                                                "\"AssertionError\"".eoDot()
                                            } else {
                                                constructExprName(assert.expression2).eoDot()
                                            }
                                        ),
                                        "msg"
                                    )
                                )
                            ),
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(assert.expression, constructExprName(assert.expression)) + if (assert.expression2 != null) {
        mapExpression(assert.expression2, constructExprName(assert.expression2))
    } else {
        listOf()
    }
}

fun mapStatementExpression(stmtExpr: StatementExpression, name: String): List<EOBndExpr> {
    return mapExpression(stmtExpr.expression, name)
}

/**
 * Outputs structure of form:
 *
 *     returnExpr > @
 *
 * returnExpr is mapped into separate object.
 */
fun mapReturnStatement(rn: Return, name: String): List<EOBndExpr> {
    return if (rn.expression != null) {
        listOf(
            EOBndExpr(
                EOObject(
                    listOf(),
                    None,
                    listOf(
                        EOBndExpr(
                            EOCopy(
                                constructExprName(rn.expression)
                            ),
                            "@"
                        )
                    )
                ),
                name
            )
        ) + mapExpression(rn.expression, constructExprName(rn.expression))
    } else {
        listOf()
    }
}

/**
 * Outputs structure of form:
 *
 *     conditionExpr.if > @
 *       thenPart
 *       elsePart
 *
 * conditionExpr, thenPart and elsePart are mapped into separate objects.
 */
fun mapIfThenElseStatement(rn: IfThenElse, name: String): List<EOBndExpr> {
    val emptyName = "empty${Random().nextInt(Int.MAX_VALUE)}"

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(constructExprName(rn.condition), "if").eoDot(),
                            constructStmtName(rn.thenPart).eoDot(),
                            if (rn.elsePart != null) {
                                constructStmtName(rn.elsePart).eoDot()
                            } else {
                                emptyName.eoDot()
                            }
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(rn.condition, constructExprName(rn.condition)) +
            mapStatement(rn.thenPart, constructStmtName(rn.thenPart)) +
            if (rn.elsePart != null) {
                mapStatement(rn.elsePart, constructStmtName(rn.elsePart))
            } else {
                listOf(mapEmptyStmt(emptyName))
            }
}

/**
 * Outputs structure of form:
 *
 *     conditionExpr.while > @
 *       [while_i]
 *         statement
 *
 * conditionExpr and statement are mapped into separate objects.
 *
 * TODO: check if we can use iterator inside of statement.
 */
fun mapWhileStatement(wh: While, name: String): List<EOBndExpr> {
    val emptyName = "empty${Random().nextInt(Int.MAX_VALUE)}"

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(constructExprName(wh.condition), "while").eoDot(),
                            EOObject(
                                listOf("while_i"),
                                None,
                                listOf(
                                    EOBndExpr(
                                        if (wh.statement != null) {
                                            constructStmtName(wh.statement).eoDot()
                                        } else {
                                            emptyName.eoDot()
                                        },
                                        "@"
                                    )
                                )
                            )
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(wh.condition, constructExprName(wh.condition)) +
            if (wh.statement != null) {
                mapStatement(wh.statement, constructStmtName(wh.statement))
            } else {
                listOf(mapEmptyStmt(emptyName))
            }
}

fun mapDoStatement(rn: Do, name: String): List<EOBndExpr> {
    val emptyName = "empty${Random().nextInt()}"

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(constructExprName(rn.condition), "do").eoDot(),
                            EOObject(
                                listOf("do_i"),
                                None,
                                listOf(
                                    EOBndExpr(
                                        if (rn.statement != null) {
                                            constructStmtName(rn.statement).eoDot()
                                        } else {
                                            emptyName.eoDot()
                                        },
                                        "@"
                                    )
                                )
                            )
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(rn.condition, constructExprName(rn.condition)) +
            if (rn.statement != null) {
                mapStatement(rn.statement, constructStmtName(rn.statement))
            } else {
                listOf(mapEmptyStmt(emptyName))
            }
}

// fun mapIfThenElse(statement: IfThenElse): EOExpr =
//    EOCopy(
//        "if.",
//        listOfNotNull(
//            mapExpression(statement.condition),
//            mapStatement(statement.thenPart),
//            if (statement.elsePart != null) mapStatement(statement.elsePart) else null,
//        )
//    )
