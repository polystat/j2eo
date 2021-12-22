package eotree

import arrow.core.*
import tree.CompoundName

class EODot : EOExpr {
    var src: Option<EOExpr>
    var name: String

    constructor(name: String) : this(name.split("."))

    constructor(names: List<String>) {
        if (names.last() != "System")
            this.name = names.last()
        else
            this.name = "class__System"
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
        println("Mapping ${name.concatenatedJava()}")
        // Recursively build a dot expression
        this.src =
            if (name.names.size >= 2)
                Some(EODot(CompoundName(name.names.dropLast(1))))
            else None
        if (name.names.last() != "System")
            this.name = name.names.last()
        else
            this.name = "class__System"
    }

    override fun generateEO(indent: Int): String =
        src
            .map { src -> src.generateEO(indent) + "." + name }
            .getOrElse { indent(indent) + name }

    override fun toString(): String =
        src
            .map { src -> "$src.$name" }
            .getOrElse { name }
}


fun String.eoDot(): EODot = EODot(this)

fun CompoundName.eoDot(): EODot = EODot(this)

fun List<String>.eoDot(): EODot = EODot(this)
