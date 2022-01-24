package eotree

import java.util.Arrays
import java.util.stream.Collectors

/**
 * EBNF representation:
 * `
 * { comment EOL } EOL
` *
 */
class EOLicense(var comments: List<EOComment>) : EONode() {
    constructor(vararg comments: EOComment) : this(
        Arrays.stream<EOComment>(comments)
            .collect(Collectors.toList<EOComment>())
    )

    override fun generateEO(indent: Int): String =
        comments
            .map { comment: EOComment -> comment.generateEO(indent) }
            .joinToString("\n")

    override fun toString(): String = "+ [license]"
}
