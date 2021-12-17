package eotree

import arrow.core.prependTo
import arrow.core.tail

class EOBndExpr(expr: EOExpr, var bndName: String) : EOBnd(expr) {
    override fun generateEO(indent: Int): String {
        val lines = expr.generateEO(indent).split("\n")

        // Append attribute name to the first line
        return lines
            .first()
            .let { line -> "$line > $bndName" }
            .prependTo(lines.tail())
            .joinToString("\n")
    }

    override fun toString(): String = "[expr] > $bndName"
}