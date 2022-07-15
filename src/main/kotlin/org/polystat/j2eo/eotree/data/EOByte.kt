package org.polystat.j2eo.eotree.data

import org.polystat.j2eo.eotree.EONode
import java.util.Locale

/**
 * EBNF representation:
 * `
 * /[\dA-F][\dA-F]/
` *
 */
class EOByte(var b: Byte) : EONode() {
    override fun generateEO(indent: Int): String {
        return String.format("%02x", b).uppercase(Locale.getDefault())
    }
}
