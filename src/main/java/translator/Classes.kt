package translator

import arrow.core.None
import arrow.core.flattenOption
import tree.Declaration.ClassDeclaration
import eotree.EOBnd
import tree.Declaration.NormalClassDeclaration
import java.lang.IllegalArgumentException
import eotree.EOBndExpr
import eotree.EOObject
import tree.Type.TypeName
import eotree.EODot
import tree.Declaration.InterfaceDeclaration
import java.util.ArrayList

fun mapClass(clsDec: ClassDeclaration): EOBndExpr {
    require(clsDec is NormalClassDeclaration) {
        ("Only NormalClassDeclaration is supported, but " +
                clsDec.javaClass.simpleName
                + " was passed")
    }
    return EOBndExpr(
        EOObject(
            ArrayList(),
            None,
            /* Static variables */
            //                                clsDec.getStaticVariables().stream()
            //                                        .map(varDec -> Declarations.mapClassDeclaration(varDec))
            //                                                .collect(Collectors.toList())),

            listOf<EOBndExpr>(
                /* Super class extension */
//                if (clsDec.extendedType is TypeName)
//                    EOBndExpr(
//                        EODot((clsDec.extendedType as TypeName).compoundName),
//                        "@"
//                    )
//                else
//                // Derive classes without "extends" specification from Object class.
//                    EOBndExpr(
//                        EODot(None, "class__Object"),
//                        "@"
//                    )
            ) + (
                    if (clsDec.body != null)
                        clsDec.body.declarations
                            .map { mapClassDeclaration(it) }
                            .flattenOption()
                    else
                        listOf()
                    )
        ),
        "class_" + clsDec.name
    )
}

fun mapInterface(interfaceDeclaration: InterfaceDeclaration?): EOBnd {
    throw IllegalArgumentException("Interface declarations are not yet implemented")
}
