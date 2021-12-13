package translator

import eotree.data.EOData
import eotree.data.EOFloatData
import eotree.data.EOIntData
import eotree.data.EOStringData
import lexer.TokenCode
import tree.Expression.Primary.Literal

fun mapLiteral(literal: Literal): EOData =
    when (literal.code) {
        TokenCode.StringLiteral -> EOStringData(literal.value as String)
        TokenCode.FloatingLiteral -> EOFloatData((literal.value as Number).toFloat())
        TokenCode.IntegerLiteral -> EOIntData((literal.value as Number).toInt())
        else -> throw IllegalArgumentException("Mapping of type ${literal.javaClass.simpleName} is not supported.")
    }
