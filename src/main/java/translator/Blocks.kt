package translator

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import eotree.eoDot
import tree.Statement.Block
import tree.Statement.BlockStatement

/**
 * In order to map Java block into EO, all variable declarations are separated out as memory objects and then seq
 * contains all the logic.
 */
fun mapBlock(block: Block,
             context: Context,
             name: String? = null,
             firstStmts: List<Pair<String, List<EOBndExpr>>>? = null,
             lastStmts: List<Pair<String, List<EOBndExpr>>>? = null,
             paramList: List<String>? = null): List<EOBndExpr> {
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

    val statementsNames = block.block.blockStatements.associateWith { context.genUniqueEntityName(it) }

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
