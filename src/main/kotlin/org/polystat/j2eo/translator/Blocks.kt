package org.polystat.j2eo.translator

import arrow.core.None
import org.polystat.j2eo.eotree.EOBndExpr
import org.polystat.j2eo.eotree.EOCopy
import org.polystat.j2eo.eotree.EOObject
import org.polystat.j2eo.eotree.eoDot
import tree.Statement.Block
import tree.Statement.BlockStatement

/**
 * In order to map Java block into EO, all variable declarations are separated out as memory objects and then seq
 * contains all the logic.
 */
fun mapBlock(
    block: Block,
    context: Context,
    name: String? = null,
    firstStmts: List<Pair<String, List<EOBndExpr>>>? = null,
    lastStmts: List<Pair<String, List<EOBndExpr>>>? = null,
    paramList: List<String>? = null
): List<EOBndExpr> {
    if (name != null) {
        return listOf(
            EOBndExpr(
                EOObject(
                    paramList ?: listOf(),
                    None,
                    mapBlock(block, context, firstStmts = firstStmts, lastStmts = lastStmts)
                ),
                name
            )
        )
    }

    val statementsNames = block.block.blockStatements.associateWith { getBlockStmtName(it, context) }

    val parsedStatements = block.block.blockStatements
        .associate { statementsNames[it]!! to mapBlockStatement(it, statementsNames[it]!!, context) }

    return listOf(
        EOBndExpr(
            EOCopy(
                "seq",
                (firstStmts?.map { it.first.eoDot() } ?: listOf()) +
                    if (parsedStatements.isNotEmpty())
                        parsedStatements.keys.map { it.eoDot() }
                    else {
                        if (firstStmts == null && lastStmts == null) {
                            listOf("TRUE".eoDot())
                        } else {
                            listOf()
                        }
                    } +
                    (lastStmts?.map { it.first.eoDot() } ?: listOf())
            ),
            "@"
        )
    ) + (firstStmts?.map { it.second }?.flatten() ?: listOf()) +
        parsedStatements.values.toList().flatten() +
        (lastStmts?.map { it.second }?.flatten() ?: listOf())
}

fun getBlockStmtName(blockStatement: BlockStatement, context: Context): String {
    return if (blockStatement.statement != null) {
        context.genUniqueEntityName(blockStatement.statement)
    } else if (blockStatement.expression != null) {
        context.genUniqueEntityName(blockStatement.expression)
    } else if (blockStatement.declaration != null) {
        context.genUniqueEntityName(blockStatement.declaration)
    } else {
        throw java.lang.IllegalArgumentException("Invalid block statement!")
    }
}

fun mapBlockStatement(blockStatement: BlockStatement, name: String, context: Context): List<EOBndExpr> {
    return if (blockStatement.statement != null) {
        mapStatement(blockStatement.statement, name, context)
    } else if (blockStatement.expression != null) {
        mapExpression(blockStatement.expression, name, context)
    } else if (blockStatement.declaration != null) {
        mapDeclaration(blockStatement.declaration, name, context)
    } else {
        throw java.lang.IllegalArgumentException("Invalid block statement!")
    }
}
