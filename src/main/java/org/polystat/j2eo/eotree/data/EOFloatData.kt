package org.polystat.j2eo.eotree.data

/**
 * EBNF representation:
 * `
 * /[+-]?\d+(\.\d+)?/
` *
 */
class EOFloatData(var f: Float) : EOData() {
    override fun generateEO(indent: Int): String {
        return indent(indent) + f.toString()
    }
}
