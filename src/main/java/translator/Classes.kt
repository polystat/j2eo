package translator

import arrow.core.None
import eotree.EOBnd
import eotree.EOBndExpr
import eotree.EOObject
import eotree.eoDot
import tree.Declaration.ClassDeclaration
import tree.Declaration.InterfaceDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Type.TypeName
import util.generateNew
import util.generateStatic

fun mapClass(clsDec: ClassDeclaration, context: Context): EOBndExpr {
    require(clsDec is NormalClassDeclaration) {
        (
            "Only NormalClassDeclaration is supported, but " +
                clsDec.javaClass.simpleName +
                " was passed"
            )
    }
    return EOBndExpr(
        EOObject(
            ArrayList(),
            None,
            listOf(
                /* Super class extension */
                (
                    if (clsDec.extendedType is TypeName)
                        EOBndExpr(
                            (clsDec.extendedType as TypeName).compoundName.eoDot(),
                            "super"
                        )
                    else
                    // Derive classes without "extends" specification from Object class.
                        EOBndExpr(
                            "class__Object".eoDot(),
                            "super"
                        )
                    ),
                EOBndExpr(
                    "super".eoDot(),
                    "@"
                )
            ) +
                (generateNew(clsDec, context)) +
                generateStatic(clsDec, context)
        ),
        clsDec.name
    )
}

fun mapInterface(interfaceDeclaration: InterfaceDeclaration?, context: Context): EOBnd {
    throw IllegalArgumentException("Interface declarations are not yet implemented")
}
