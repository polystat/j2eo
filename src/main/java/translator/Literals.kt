package translator

import arrow.core.None
import arrow.core.Option
import eotree.*
import eotree.data.*
import lexer.TokenCode
import tree.Expression.Primary.Literal
import tree.Type.PrimitiveType
import util.TokenCodes

fun mapLiteral(literal: Literal): EOObject =
    when (literal.code) {
        TokenCode.StringLiteral -> generateEOData(
                listOf(TokenCodes.CLASS__STRING.value, "constructor_2").eoDot(),
                listOf(TokenCodes.CLASS__STRING.value, "new").eoDot(),
                EOStringData(literal.value as String)
        )
        TokenCode.FloatingLiteral -> generateEOData(
                listOf(TokenCodes.PRIM__FLOAT.value, "constructor_2").eoDot(),
                listOf(TokenCodes.PRIM__FLOAT.value, "new").eoDot(),
                EOFloatData((literal.value as String).toFloat())
        )
        TokenCode.IntegerLiteral -> generateEOData(
                listOf(TokenCodes.PRIM__INT.value, "constructor_2").eoDot(),
                listOf(TokenCodes.PRIM__INT.value, "new").eoDot(),
                EOIntData(try {(literal.value as String).toInt()} catch (e: NumberFormatException) { 0 /* FIXME: parse integer literals */ })
        )
        TokenCode.True -> generateEOData(
                listOf(TokenCodes.PRIM__BOOLEAN.value, "constructor_2").eoDot(),
                listOf(TokenCodes.PRIM__BOOLEAN.value, "new").eoDot(),
                EOBoolData(true)
        )
        TokenCode.False -> generateEOData(
                listOf(TokenCodes.PRIM__BOOLEAN.value, "constructor_2").eoDot(),
                listOf(TokenCodes.PRIM__BOOLEAN.value, "new").eoDot(),
                EOBoolData(false)
        )
        TokenCode.Null -> generateEOData( /* FIXME: use proper null */
            listOf(TokenCodes.PRIM__INT.value, "constructor_2").eoDot(),
            listOf(TokenCodes.PRIM__INT.value, "new").eoDot(),
            EOIntData(0)
        )
        else -> throw IllegalArgumentException("Mapping of type ${literal.javaClass.simpleName} (${literal.code}) is not supported.")
    }

fun generateEOData(primitiveTypeCall: EODot, primitiveNewCall: EODot, value: EOData) : EOObject =
    EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                EOCopy(
                    primitiveTypeCall,
                    primitiveNewCall,
                    value
                ),
                "@"
            )
        )
    )
