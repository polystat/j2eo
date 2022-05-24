package util

import arrow.core.prependTo
import eotree.EOBndExpr
import eotree.EOObject

/**
 * Prepends comment to the first binding in the list.
 */
fun List<EOBndExpr>.comment(comment: String): List<EOBndExpr> =
    first()
        .apply { (expr as EOObject).comment = comment }
        .prependTo(drop(1))
