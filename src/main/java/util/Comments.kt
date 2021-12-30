package util

import arrow.core.prependTo
import eotree.EOBndExpr
import eotree.EOObject

fun List<EOBndExpr>.comment(comment: String): List<EOBndExpr> =
    first()
        .apply { (expr as EOObject).comment = comment }
        .prependTo(drop(1))