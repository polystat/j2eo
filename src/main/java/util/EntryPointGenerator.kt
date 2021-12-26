package util

import arrow.core.Some
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import eotree.data.EOStringData
import eotree.eoDot

fun generateEntryPoint(mainClassName: String): List<EOBndExpr> {
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                Some("args"),
                listOf(
                    EOBndExpr(
                        "cage".eoDot(),
                        "instance"
                    ),

                    EOBndExpr(
                        EOCopy(
                            "seq",
                            listOf(
                                EOCopy(
                                    "instance.write".eoDot(),
                                    "${mainClassName}.new".eoDot()
                                ),
                                EOCopy(
                                    "instance.main".eoDot(),
                                    listOf("instance".eoDot(), EOStringData("arg"))
                                )
                            )
                        ),
                        "@"
                    )
                )
            ),
            "main"
        )
    )
}
