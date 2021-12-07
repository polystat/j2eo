package eotree.data

import eotree.EONode

/**
 * EBNF representation:
 * `
 * /"[^"]*"/
` *
 */
class EOStringData(var str: String) : EOData() {
    override fun generateEO(indent: Int): String {
        return indent(indent) + "\"" + str + "\""
    }
}