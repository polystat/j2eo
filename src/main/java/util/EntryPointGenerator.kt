package util

import arrow.core.Some
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import eotree.eoDot

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
