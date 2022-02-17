package translator

import arrow.core.None
import eotree.*
import eotree.data.EOData
import eotree.data.EOFloatData
import eotree.data.EOIntData
import eotree.data.EOStringData
import lexer.TokenCode
import tree.Expression.Primary.Literal
import tree.Type.PrimitiveType

fun mapLiteral(literal: Literal): EOObject =
    when (literal.code) {
        TokenCode.StringLiteral -> generateEOData(
            listOf("class__String", "constructor2").eoDot(),
            EOStringData(literal.value as String)
        )
        TokenCode.FloatingLiteral -> generateEOData(
            listOf("class__Float", "constructor2").eoDot(),
            EOFloatData((literal.value as String).toFloat())
        )
        TokenCode.IntegerLiteral -> generateEOData(
            listOf("class__Integer", "constructor2").eoDot(),
            EOIntData((literal.value as String).toInt())
        )
        else -> throw IllegalArgumentException("Mapping of type ${literal.javaClass.simpleName} is not supported.")
    }

fun generateEOData(primitiveTypeCall: EODot, value: EOData) : EOObject =
    EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                EOCopy(
                    primitiveTypeCall,
                    value
                ),
                "@"
            )
        )
    )
