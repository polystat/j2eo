package org.polystat.j2eo.eotree

/**
 * EBNF representation:
 * `
 * '+' name ' ' ANY EOL
` *
 */
class EOMeta(var name: String, var value: String) : EONode() {
    override fun generateEO(indent: Int): String =
        "+$name $value"

    override fun toString(): String = "+$name $value"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as EOMeta

        if (name != other.name) return false
        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int =
        31 * name.hashCode() + value.hashCode()
}
