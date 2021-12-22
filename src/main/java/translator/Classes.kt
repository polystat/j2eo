package translator

import arrow.core.None
import arrow.core.flattenOption
import eotree.*
import tree.Declaration.ClassDeclaration
import tree.Declaration.NormalClassDeclaration
import java.lang.IllegalArgumentException
import tree.Declaration.InterfaceDeclaration
import tree.Type.TypeName
import util.eoClassCompoundName
import util.eoClassName
import util.generateNew
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

            listOf(
                /* Super class extension */
                if (clsDec.extendedType is TypeName)
                    EOBndExpr(
                        (clsDec.extendedType as TypeName).compoundName.eoClassCompoundName().eoDot(),
                        "@"
                    )
                else
                // Derive classes without "extends" specification from Object class.
                    EOBndExpr(
                        "class__Object".eoDot(),
                        "@"
                    )
            ) +
                    (generateNew(clsDec)) +
                    if (clsDec.body != null)
                        clsDec.body.declarations
                            .map { mapClassDeclaration(it) }
                            .flattenOption()
                    else
                        listOf()

        ),
        clsDec.name.eoClassName()
    )
}

fun mapInterface(interfaceDeclaration: InterfaceDeclaration?): EOBnd {
    throw IllegalArgumentException("Interface declarations are not yet implemented")
}
