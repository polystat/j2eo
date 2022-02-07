package eotree

import arrow.core.prependTo
import arrow.core.tail

class EOBndExpr(expr: EOExpr, var bndName: String) : EOBnd(expr) {
    override fun generateEO(indent: Int): String {
        val lines = expr.generateEO(indent).split("\n")

        val commentLines: List<String> = lines.takeWhile { it.trimStart().startsWith("#") }
        val nonCommentLines: List<String> = lines.dropWhile { it.trimStart().startsWith("#") }

        // Append attribute name to the first non-comment line
        return (
            commentLines +
                nonCommentLines
                    .first { !it.trimStart().startsWith("#") }
                    .let { line -> "$line > $bndName" }
                    .prependTo(nonCommentLines.tail())
            ).joinToString("\n")
    }

    override fun toString(): String = "[expr] > $bndName"
}
