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
             name: String? = null,
             firstStmts: List<Pair<String, List<EOBndExpr>>>? = null,
             lastStmts: List<Pair<String, List<EOBndExpr>>>? = null): List<EOBndExpr> {
    if (name != null) {
        return listOf(
            EOBndExpr(
                EOObject(
                    listOf(),
                    None,
                    mapBlock(block, firstStmts = firstStmts, lastStmts = lastStmts)
                ),
                name
            )
        )
    }

    val parsedStatements = block.block.blockStatements
        .associate { constructName(it) to mapBlockStatement(it, constructName(it)) }

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


fun constructName(blockStatement: BlockStatement): String {
    return if (blockStatement.statement != null) {
        "s${blockStatement.hashCode()}"
    } else if (blockStatement.expression != null) {
        "e${blockStatement.hashCode()}"
    } else if (blockStatement.declaration != null) {
        "d${blockStatement.hashCode()}"
    } else {
        throw java.lang.IllegalArgumentException("Invalid block statement!")
    }
}


fun mapBlockStatement(blockStatement: BlockStatement, name: String): List<EOBndExpr> {
    return if (blockStatement.statement != null) {
        mapStatement(blockStatement.statement, name)
    } else if (blockStatement.expression != null) {
        mapExpression(blockStatement.expression, name)
    } else if (blockStatement.declaration != null) {
        mapDeclaration(blockStatement.declaration, name)
    } else {
        throw java.lang.IllegalArgumentException("Invalid block statement!")
    }
}
