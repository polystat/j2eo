package eotree.data

import java.util.*

/**
 * EBNF representation:
 * `
 * TRUE | FALSE
` *
 */
class EOBoolData(var b: Boolean) : EOData() {
    override fun generateEO(indent: Int): String {
        return indent(indent) + b.toString().uppercase(Locale.getDefault())
    }
}
