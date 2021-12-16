package eotree

import arrow.core.*
import tree.CompoundName

class EODot : EOExpr {
    var src: Option<EOExpr>
    var name: String

    constructor(name: String) : this(name.split("."))

    constructor(names: List<String>) {
        this.name = names.last()
        this.src = if (names.size > 1)
            EODot(names.dropLast(1)).some()
        else
            None
    }

    constructor(src: Option<EOExpr>, name: String) {
        this.src = src
        this.name = name
    }

    constructor(name: CompoundName) {
        // Recursively build a dot expression
        this.src =
            if (name.names.size >= 2)
                Some(EODot(CompoundName(name.names.subList(0, name.names.size - 1))))
            else None
        this.name = name.names.last()
    }

    override fun generateEO(indent: Int): String =
        src
            .map { src -> src.generateEO(indent) + "." + name }
            .getOrElse { indent(indent) + name }
}


fun String.eoDot(): EODot = EODot(this)

fun CompoundName.eoDot(): EODot = EODot(this)