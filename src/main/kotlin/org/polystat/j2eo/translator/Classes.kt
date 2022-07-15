package org.polystat.j2eo.translator

import arrow.core.None
import org.polystat.j2eo.eotree.EOBnd
import org.polystat.j2eo.eotree.EOBndExpr
import org.polystat.j2eo.eotree.EOObject
import org.polystat.j2eo.eotree.eoDot
import org.polystat.j2eo.util.generateNew
import org.polystat.j2eo.util.generateStatic
import tree.Declaration.ClassDeclaration
import tree.Declaration.InterfaceDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Type.TypeName

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

fun mapInterface(interfaceDeclaration: InterfaceDeclaration?, context: Context): org.polystat.j2eo.eotree.EOBnd {
    throw IllegalArgumentException("Interface declarations are not yet implemented")
}
