package org.polystat.j2eo.eotree

import arrow.core.Option
import arrow.core.getOrElse

/**
 * EBNF representation:
 * `
 * { meta EOL } EOL
` *
 */
class EOMetas(var packageName: Option<String>, var metas: List<EOMeta>) : EONode() {
    override fun generateEO(indent: Int): String =
        packageName
            .map { name -> "+package $name\n" }
            .getOrElse { "" } +
            metas
                .map { m: EOMeta -> m.generateEO(indent) }
                .joinToString("\n")

    override fun toString(): String = "+ [metas]"
}
