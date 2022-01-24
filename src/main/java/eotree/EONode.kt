package eotree

abstract class EONode {
    private val indentSize = 2

    abstract fun generateEO(indent: Int): String

    fun indent(indent: Int): String {
        return " ".repeat(indent * indentSize)
    }
}
