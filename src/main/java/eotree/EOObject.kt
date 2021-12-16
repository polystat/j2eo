package eotree

import arrow.core.Option
import arrow.core.getOrElse
import java.util.*
import java.util.stream.Collectors

class EOObject(
    var freeAttrs: List<String>,
    var varargAttr: Option<String>,
    var bndAttrs: List<EOBndExpr>,
    var comment: String = "",
) : EOExpr() {
    override fun generateEO(indent: Int): String {
        return comment.let {
            if (it.isNotEmpty())
                indent(indent) + it
            else
                it
        } +
                indent(indent) +
                "[" +
                freeAttrs.joinToString(" ") +
                varargAttr
                    .map { attr -> (if (freeAttrs.isNotEmpty()) " " else "") + attr + "..." }
                    .getOrElse { "" } +
                "]" +
                bndAttrs
                    .map { attr: EOBndExpr -> "\n" + attr.generateEO(indent + 1) }
                    .joinToString("")
    }
}