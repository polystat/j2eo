package eotree.data

/**
 * EBNF representation:
 * `
 * /[+-]?\d+|0x[a-f\d]+/
` *
 */
class EOIntData(var i: Int) : EOData() {
    override fun generateEO(indent: Int): String {
        return indent(indent) + i.toString()
    }
}
