package org.polystat.j2eo.eotree

import arrow.core.prependTo
import arrow.core.tail

class EOBndExpr(
    expr: EOExpr,
    private var bndName: String,
) : EOBnd(expr) {
    override fun generateEO(indent: Int): String {
        val lines = expr.generateEO(indent).split("\n")
        return lines
            .first()
            .let { line -> "$line > $bndName" }
            .prependTo(lines.tail())
            .joinToString("\n")
    }

    override fun toString(): String = "[expr] > $bndName"
}
