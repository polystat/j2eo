package eotree

import arrow.core.*
import tree.CompoundName

class EODotObject : EOObject {
    var src: Option<EOExpr>
    var name: String

    constructor(name: String) : this(name.split("."))

    constructor(names: List<String>) : super(listOf(), None, listOf()) {
        this.name = names.last()
        this.src = if (names.size > 1)
            EODot(names.dropLast(1)).some()
        else
            None
    }

    constructor(src: Option<EOExpr>, name: String) : super(listOf(), None, listOf()) {
        this.src = src
        this.name = name
    }

    constructor(name: CompoundName) : super(listOf(), None, listOf()) {
        // println("Mapping ${name.concatenatedJava()}")
        // Recursively build a dot expression
        this.src =
            if (name.names.size >= 2)
                Some(EODot(CompoundName(name.names.dropLast(1))))
            else None
        this.name = name.names.last()
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

fun String.eoDotObject(): EODotObject = EODotObject(this)

fun CompoundName.eoDotObject(): EODotObject = EODotObject(this)

fun List<String>.eoDotObject(): EODotObject = EODotObject(this)
