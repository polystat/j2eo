package eotree.data

/**
 * EBNF representation:
 * `
 * / /.+/[a-z]* /
` *
 */
class EORegexData(var regex: String) : EOData() {
    override fun generateEO(indent: Int): String {
        return regex
    }
}
