package translator

import arrow.core.None
import arrow.core.Option
import arrow.core.some
import eotree.EOBndExpr
import eotree.EODot
import eotree.eoDot
import lexer.TokenCode
import tree.Declaration.ClassDeclaration
import tree.Declaration.Declaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Declaration.VariableDeclaration
import tree.Initializer
import tree.Type.PrimitiveType
import tree.Type.TypeName

fun mapClassDeclaration(dec: Declaration): Option<EOBndExpr> {
    // TODO: get rid of option and implement all cases

    return when (dec) {
        is MethodDeclaration -> {
            mapMethodDeclaration(dec).some()
        }
        is NormalClassDeclaration -> {
            mapClass(dec as ClassDeclaration).some()
        }
//        is VariableDeclaration -> {
//            mapVariableDeclaration(dec).some()
//        }
        else -> {
            None
        }
    }
}

/**
 * Maps a variable declaration in class object (i.e. static variable).
 */
fun preMapVariableDeclaration(dec: VariableDeclaration): EOBndExpr =
    when (dec.type) {
        is TypeName ->
            EOBndExpr(EODot("cage"), dec.name)
        is PrimitiveType ->
            EOBndExpr(listOf(decodePrimitiveType(dec.type as PrimitiveType), decodeInitializer(dec.initializer)).eoDot(), dec.name)
        null ->
            throw IllegalArgumentException("\"var\" declarations are not supported yet")
        else ->
            throw IllegalArgumentException("Type of type " + dec.type.javaClass.name + " is not supported")
    }

fun decodePrimitiveType(type: PrimitiveType): String {
    return when (type.typeCode) {
        TokenCode.Int -> "class__Int"
        else -> throw IllegalArgumentException("Type code " + type.typeCode + " is not supported")
    }
}

fun decodeInitializer(initializer: Initializer?): String {
    return "constructor2"
}
