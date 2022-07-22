package org.polystat.j2eo.eotree.data

import java.util.Locale

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
