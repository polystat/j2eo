package org.polystat.j2eo.util

import arrow.core.Some
import org.polystat.j2eo.eotree.EOBndExpr
import org.polystat.j2eo.eotree.EOCopy
import org.polystat.j2eo.eotree.EOObject
import org.polystat.j2eo.eotree.eoDot

fun generateEntryPoint(mainClassName: String): List<EOBndExpr> {
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                Some("args"),
                listOf(
                    EOBndExpr(
                        EOCopy(
                            "$mainClassName.main".eoDot(),
                            listOf("*".eoDot())
                        ),
                        "@"
                    )
                )
            ),
            "main"
        )
    )
}
