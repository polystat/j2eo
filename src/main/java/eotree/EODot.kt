package eotree

import arrow.core.*
import tree.CompoundName

class EODot : EOExpr {
    var src: Option<EOExpr>
    var name: String

    constructor(name: String) {
        src = None
        this.name = name
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
            .getOrElse { name }
}