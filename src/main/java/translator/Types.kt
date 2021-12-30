package translator

import lexer.TokenCode


fun TokenCode.mapPrimitiveType(): String =
    when (this) {
        else -> throw IllegalArgumentException("Primitive type \"$this\" is not supported")
    }