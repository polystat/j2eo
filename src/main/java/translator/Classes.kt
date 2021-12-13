package translator

import arrow.core.None
import tree.Declaration.ClassDeclaration
import eotree.EOBnd
import tree.Declaration.NormalClassDeclaration
import java.lang.IllegalArgumentException
import eotree.EOBndExpr
import eotree.EOObject
import eotree.EOBndName
import java.util.Optional
import util.ListUtils
import tree.Type.TypeName
import eotree.EODot
import eotree.EOExpr
import tree.Declaration.InterfaceDeclaration
import java.util.ArrayList

fun mapClass(classDeclaration: ClassDeclaration): EOBnd {
    require(classDeclaration is NormalClassDeclaration) {
        ("Only NormalClassDeclaration is supported, but " +
                classDeclaration.javaClass.simpleName
                + " was passed")
    }
    val clsDec = classDeclaration
    return EOBndExpr(
        EOObject(
            ArrayList(),
            None,
            ListUtils.concat(
                /* Static variables */
                //                                clsDec.getStaticVariables().stream()
                //                                        .map(varDec -> Declarations.mapClassDeclaration(varDec))
                //                                                .collect(Collectors.toList())),

                listOf(
                    /* Super class extension */
                    if (clsDec.extendedType is TypeName) EOBndExpr(
                        EODot((clsDec.extendedType as TypeName).compoundName),
                        "@"
                    ) else
                        // Derive classes without "extends" specification from Object class.
                        EOBndExpr(
                            EODot(None, "class__Object"),
                            "@"
                        )
                )
                //                                clsDec.body != null ?
                //                                        clsDec.body.declarations.stream()
                //                                                .map(Declarations::mapClassDeclaration)
                //                                                .collect(Collectors.toList()) :
                //                                        new ArrayList<>()
            )
        ),
        "class_" + clsDec.name
    )
}

fun mapInterface(interfaceDeclaration: InterfaceDeclaration?): EOBnd {
    throw IllegalArgumentException("Interface declarations are not yet implemented")
}
