package org.polystat.j2eo.eotree

import arrow.core.Option
import arrow.core.getOrElse

open class EOObject(
    var freeAttrs: List<String>,
    var varargAttr: Option<String>,
    var bndAttrs: List<EOBndExpr>,
    var comment: String = "",
) : EOExpr() {
    override fun generateEO(indent: Int): String {
        return listOfNotNull(
            comment.let {
                if (it.isNotEmpty())
                    it
                        .split("\n")
                        .joinToString("") { line ->
                            "${indent(indent)}# $line\n"
                        }
                else
                    null
            },
            indent(indent),
            "[",
            freeAttrs.joinToString(" "),
            varargAttr
                .map { attr -> (if (freeAttrs.isNotEmpty()) " " else "") + attr + "..." }
                .getOrElse { null },
            "]",
            bndAttrs
                .map { attr: EOBndExpr -> "\n" + attr.generateEO(indent + 1) }
                .joinToString("")
        ).joinToString("")
    }

    override fun toString(): String = "[Object]"
}
