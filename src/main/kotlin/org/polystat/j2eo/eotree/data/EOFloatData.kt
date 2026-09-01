package org.polystat.j2eo.eotree.data

/**
 * EBNF representation:
 * `
 * /[+-]?\d+(\.\d+)?/
` *
 */
class EOFloatData(
    var f: Float,
) : EOData() {
    override fun generateEO(indent: Int): String = indent(indent) + f.toString()
}
