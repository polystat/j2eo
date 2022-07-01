package translator

import arrow.core.None
import eotree.* // ktlint-disable no-wildcard-imports
import tree.Statement.* // ktlint-disable no-wildcard-imports

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

fun mapStatement(statement: Statement, name: String, context: Context): List<EOBndExpr> =
    when (statement) {
        is StatementExpression -> mapStatementExpression(statement, name, context)
        is Return -> mapReturnStatement(statement, name, context)
        is IfThenElse -> mapIfThenElseStatement(statement, name, context)
        is While -> mapWhileStatement(statement, name, context)
        is Do -> mapDoStatement(statement, name, context)
        is Block -> mapBlock(statement, context, name)
        // is Switch -> mapSwitchStatement(parseExprTasks, statement)
        is Assert -> mapAssert(statement, name, context)
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
                        "TRUE"
                    ),
                    "@"
                )
            )
        ),
        name
    )

fun mapAssert(assert: Assert, name: String, context: Context): List<EOBndExpr> {
    val assertExprName = context.genUniqueEntityName(assert.expression)
    val assertExpr2Name = context.genUniqueEntityName(assert.expression2)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(assertExprName, "if").eoDot(),
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
                                                assertExpr2Name.eoDot()
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
    ) + mapExpression(assert.expression, assertExprName, context) + if (assert.expression2 != null) {
        mapExpression(assert.expression2, assertExpr2Name, context)
    } else {
        listOf()
    }
}

fun mapStatementExpression(stmtExpr: StatementExpression, name: String, context: Context): List<EOBndExpr> {
    return mapExpression(stmtExpr.expression, name, context)
}

/**
 * Outputs structure of form:
 *
 *     returnExpr > @
 *
 * returnExpr is mapped into separate object.
 */
fun mapReturnStatement(rn: Return, name: String, context: Context): List<EOBndExpr> {
    val rnExprName = context.genUniqueEntityName(rn.expression)

    return if (rn.expression != null) {
        listOf(
            EOBndExpr(
                EOObject(
                    listOf(),
                    None,
                    listOf(
                        EOBndExpr(
                            EOCopy(
                                rnExprName
                            ),
                            "@"
                        )
                    )
                ),
                name
            )
        ) + mapExpression(rn.expression, rnExprName, context)
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
fun mapIfThenElseStatement(rn: IfThenElse, name: String, context: Context): List<EOBndExpr> {
    val emptyName = context.genUniqueEntityName("empty")
    val condName = context.genUniqueEntityName(rn.condition)
    val thenName = context.genUniqueEntityName(rn.thenPart)
    val elseName = context.genUniqueEntityName(rn.elsePart)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(condName, "if").eoDot(),
                            thenName.eoDot(),
                            if (rn.elsePart != null) {
                                elseName.eoDot()
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
    ) + mapExpression(rn.condition, condName, context) +
        mapStatement(rn.thenPart, thenName, context) +
        if (rn.elsePart != null) {
            mapStatement(rn.elsePart, elseName, context)
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
fun mapWhileStatement(wh: While, name: String, context: Context): List<EOBndExpr> {
    val emptyName = context.genUniqueEntityName("empty")
    val condName = context.genUniqueEntityName(wh.condition)
    val stmtName = context.genUniqueEntityName(wh.statement)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(condName, "while").eoDot(),
                            EOObject(
                                listOf("while_i"),
                                None,
                                listOf(
                                    EOBndExpr(
                                        if (wh.statement != null) {
                                            stmtName.eoDot()
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
    ) + mapExpression(wh.condition, condName, context) +
        if (wh.statement != null) {
            mapStatement(wh.statement, stmtName, context)
        } else {
            listOf(mapEmptyStmt(emptyName))
        }
}

fun mapDoStatement(do_stmt: Do, name: String, context: Context): List<EOBndExpr> {
    val emptyName = context.genUniqueEntityName("empty")
    val condName = context.genUniqueEntityName(do_stmt.condition)
    val stmtName = context.genUniqueEntityName(do_stmt.statement)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(condName, "do").eoDot(),
                            EOObject(
                                listOf("do_i"),
                                None,
                                listOf(
                                    EOBndExpr(
                                        if (do_stmt.statement != null) {
                                            stmtName.eoDot()
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
    ) + mapExpression(do_stmt.condition, condName, context) +
        if (do_stmt.statement != null) {
            mapStatement(do_stmt.statement, stmtName, context)
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
