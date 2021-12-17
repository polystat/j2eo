package eotree

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
}