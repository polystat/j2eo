package translator

import arrow.core.None
import arrow.core.Option
import arrow.core.some
import eotree.EOBndExpr
import eotree.EODot
import tree.Declaration.*
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
        else -> {
            require(dec is VariableDeclaration) {
                "Declaration of type " + dec.javaClass.simpleName + " is not supported yet"
            }
            None
        }
    }
}

/**
 * Maps a variable declaration in class object (i.e. static variable).
 */
fun mapVariableDeclaration(dec: VariableDeclaration): EOBndExpr {
    return if (dec.type is TypeName) {
        EOBndExpr(when ((dec.type as TypeName).compoundName.concatenatedJava()) {
            "int", "float", "double", "bool" -> EODot("memory")
            else -> EODot("cage")
        },
            (dec.type as TypeName).compoundName.concatenatedEO()
        )
    } else {
        throw IllegalArgumentException("Type of type " + dec.type.javaClass.name + " is not supported")
    }
}
