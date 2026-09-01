package org.polystat.j2eo.eotree.data

/**
 * EBNF representation:
 * `
 * /[+-]?\d+|0x[a-f\d]+/
` *
 */
class EOIntData(
    var i: Int,
) : EOData() {
    override fun generateEO(indent: Int): String = indent(indent) + i.toString()
}
