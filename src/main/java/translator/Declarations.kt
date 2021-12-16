package translator

import arrow.core.None
import arrow.core.Option
import arrow.core.some
import eotree.EOBndExpr
import eotree.EODot
import tree.Declaration.*
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
        is VariableDeclaration -> {
            mapVariableDeclaration(dec).some()
        }
        else -> {
            None
        }
    }
}

/**
 * Maps a variable declaration in class object (i.e. static variable).
 */
fun mapVariableDeclaration(dec: VariableDeclaration): EOBndExpr =
    when (dec.type) {
        is TypeName ->
            EOBndExpr(EODot("cage"), dec.name)
        is PrimitiveType ->
            EOBndExpr(EODot("memory"), dec.name)
        else ->
            throw IllegalArgumentException("Type of type " + dec.type.javaClass.name + " is not supported")
    }
