package eotree

/**
 * EBNF representation:
 * `
 * '#' ANY EOL
` *
 */
class EOComment(var comment: String) : EONode() {
    override fun generateEO(indent: Int): String {
        return "# $comment"
    }
}