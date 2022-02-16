package translator

import lexer.TokenCode
import tree.Type.PrimitiveType
import tree.Type.Type
import tree.Type.TypeName

fun TokenCode.mapPrimitiveType(): String =
    when (this) {
        else -> throw IllegalArgumentException("Primitive type \"$this\" is not supported")
    }


fun Type.getTypeName(): String =
    when (this) {
        is TypeName -> this.compoundName.concatenatedJava() + this.dimensions.dimensions.joinToString("") { "[]" }
        is PrimitiveType -> when (this.typeCode) {
            TokenCode.Byte -> "byte"
            TokenCode.Short -> "short"
            TokenCode.Int -> "int"
            TokenCode.Long -> "long"
            TokenCode.Char -> "char"
            TokenCode.Float -> "float"
            TokenCode.Double -> "double"
            TokenCode.Boolean -> "boolean"
            else -> throw IllegalArgumentException("Primitive type of token ${this.typeCode} is not supported.")
        } + this.dimensions.dimensions.joinToString("") { "[]" }
        else -> throw IllegalArgumentException("Can't get type for instance of ${this.javaClass.name}")
    }