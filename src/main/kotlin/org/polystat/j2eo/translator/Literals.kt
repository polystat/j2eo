package org.polystat.j2eo.translator

import arrow.core.None
import lexer.TokenCode
import org.polystat.j2eo.eotree.* // ktlint-disable no-wildcard-imports
import org.polystat.j2eo.eotree.data.* // ktlint-disable no-wildcard-imports
import org.polystat.j2eo.util.TokenCodes
import org.polystat.j2eo.util.logger
import tree.Expression.Primary.Literal

/**
 * Maps Java literal to J2EO stdlib literal initialization binding.
 * Example of output for literal "2" assigned to variable "var":
 *
 *     [] > var
 *       prim__int.constructor_2 > @
 *         prim__int.new
 *         2
 */
fun mapLiteral(literal: Literal, name: String, context: Context): EOBndExpr =
    when (literal.code) {
        TokenCode.StringLiteral -> generateEOData(
            listOf(TokenCodes.CLASS__STRING.value, "constructor_2").eoDot(),
            listOf(TokenCodes.CLASS__STRING.value, "new").eoDot(),
            EOStringData(literal.value as String),
            name
        )
        TokenCode.FloatingLiteral -> generateEOData(
            listOf(TokenCodes.PRIM__FLOAT.value, "constructor_2").eoDot(),
            listOf(TokenCodes.PRIM__FLOAT.value, "new").eoDot(),
            EOFloatData((literal.value as String).replace("_", "").toFloat()),
            name
        )
        TokenCode.IntegerLiteral -> generateEOData(
            listOf(TokenCodes.PRIM__INT.value, "constructor_2").eoDot(),
            listOf(TokenCodes.PRIM__INT.value, "new").eoDot(),
            EOIntData(
                try {
                    (literal.value as String).replace("_", "").toInt()
                } catch (e: NumberFormatException) {
                    logger.warn { "Integer literal parsing is not implemented; falling back to 0" }
                    0 /* FIXME: parse integer literals */
                }
            ),
            name
        )
        TokenCode.True -> generateEOData(
            listOf(TokenCodes.PRIM__BOOLEAN.value, "constructor_2").eoDot(),
            listOf(TokenCodes.PRIM__BOOLEAN.value, "new").eoDot(),
            EOBoolData(true),
            name
        )
        TokenCode.False -> generateEOData(
            listOf(TokenCodes.PRIM__BOOLEAN.value, "constructor_2").eoDot(),
            listOf(TokenCodes.PRIM__BOOLEAN.value, "new").eoDot(),
            EOBoolData(false),
            name
        )
        TokenCode.Null -> {
            EOBndExpr(
                EOObject(
                    listOf(),
                    None,
                    listOf(
                        EOBndExpr(
                            "null".eoDot(),
                            "@"
                        )
                    )
                ),
                name
            )
        }
        else -> throw IllegalArgumentException("Mapping of type ${literal.javaClass.simpleName} (${literal.code}) is not supported.")
    }

/**
 * Creates EOObject binding for given primitive type, constructor and value.
 */
private fun generateEOData(primitiveTypeCall: EODot, primitiveNewCall: EODot, value: EOData, name: String): EOBndExpr =
    EOBndExpr(
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
        ),
        name
    )
