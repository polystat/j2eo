package translator

import arrow.core.None
import eotree.EOBnd
import eotree.EOBndExpr
import eotree.EOObject
import eotree.data.EOStringData
import eotree.eoDot
import tree.Declaration.ClassDeclaration
import tree.Declaration.InterfaceDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Type.TypeName
import util.generateNew
import util.generateStatic

fun mapClass(clsDec: ClassDeclaration): EOBndExpr {
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
            /* Static variables */
            //                                clsDec.getStaticVariables().stream()
            //                                        .map(varDec -> Declarations.mapClassDeclaration(varDec))
            //                                                .collect(Collectors.toList())),

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
            )
                    + (generateNew(clsDec))
                    + generateStatic(clsDec)
//                    + clsDec.body.declarations
//                .filterIsInstance<NormalClassDeclaration>()
//                .map { mapClass(it) }
        ),
        clsDec.name
    )
}

fun mapInterface(interfaceDeclaration: InterfaceDeclaration?): EOBnd {
    throw IllegalArgumentException("Interface declarations are not yet implemented")
}
