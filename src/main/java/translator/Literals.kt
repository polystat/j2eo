package translator

import arrow.core.None
import eotree.*
import eotree.data.*
import lexer.TokenCode
import tree.Expression.Primary.Literal
import tree.Type.PrimitiveType
import util.TokenCodes

fun mapLiteral(literal: Literal): EOObject =
    when (literal.code) {
        TokenCode.StringLiteral -> generateEOData(
                listOf(TokenCodes.CLASS__STRING.value, "constructor2").eoDot(),
                EOStringData(literal.value as String)
        )
        TokenCode.FloatingLiteral -> generateEOData(
                listOf(TokenCodes.PRIM__FLOAT.value, "constructor2").eoDot(),
                EOFloatData((literal.value as String).toFloat())
        )
        TokenCode.IntegerLiteral -> generateEOData(
                listOf(TokenCodes.PRIM__INT.value, "constructor2").eoDot(),
                EOIntData((literal.value as String).toInt())
        )
        TokenCode.True -> generateEOData(
                listOf(TokenCodes.PRIM__BOOLEAN.value, "constructor2").eoDot(),
                EOBoolData(true)
        )
        TokenCode.False -> generateEOData(
                listOf(TokenCodes.PRIM__BOOLEAN.value, "constructor2").eoDot(),
                EOBoolData(false)
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
