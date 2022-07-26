package org.polystat.j2eo.util

import arrow.core.prependTo
import org.polystat.j2eo.eotree.EOBndExpr
import org.polystat.j2eo.eotree.EOObject

/**
 * Prepends comment to the first binding in the list.
 */
fun List<EOBndExpr>.comment(comment: String): List<EOBndExpr> =
    first()
        .apply { (expr as EOObject).comment = comment }
        .prependTo(drop(1))
