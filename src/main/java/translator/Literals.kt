package translator

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import eotree.data.EOFloatData
import eotree.data.EOIntData
import eotree.data.EOStringData
import eotree.eoDot
import lexer.TokenCode
import tree.Expression.Primary.Literal

fun mapLiteral(literal: Literal): EOObject =
    when (literal.code) {
        TokenCode.StringLiteral -> EOObject(
            listOf(),
            None,
            listOf(
                EOBndExpr(
                    EOCopy(
                        listOf("class__String", "constructor2").eoDot(),
                        EOStringData(literal.value as String)
                    ),
                    "@"
                )
            )
        )
        TokenCode.FloatingLiteral -> EOObject(
            listOf(),
            None,
            listOf(
                EOBndExpr(
                    EOCopy(
                        listOf("class__Float", "constructor2").eoDot(),
                        EOFloatData((literal.value as String).toFloat())
                    ),
                    "@"
                )
            )
        )
        TokenCode.IntegerLiteral -> EOObject(
            listOf(),
            None,
            listOf(
                EOBndExpr(
                    EOCopy(
                        listOf("class__Int", "constructor2").eoDot(),
                        EOIntData((literal.value as String).toInt())
                    ),
                    "@"
                )
            )
        )
        else -> throw IllegalArgumentException("Mapping of type ${literal.javaClass.simpleName} is not supported.")
    }
