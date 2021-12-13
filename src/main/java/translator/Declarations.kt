package translator

import eotree.EOBndExpr
import eotree.EODot
import tree.Declaration.VariableDeclaration
import tree.Type.TypeName

//fun mapClassDeclaration(dec: Declaration): EOBndExpr? {
//    return if (dec is MethodDeclaration) {
//        mapMethodDeclaration(dec)
//    } else if (dec is NormalClassDeclaration) {
//        mapClass(dec as ClassDeclaration)
//    } else require(dec !is VariableDeclaration, "Declaration of type " +
//            dec.javaClass.simpleName
//            + " is not supported yet") {
//}

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
