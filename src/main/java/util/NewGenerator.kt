package util

import arrow.core.None
import eotree.*
import tree.Declaration.ClassDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Type.Type
import tree.Type.TypeName
import kotlin.collections.ArrayList

fun generateThis(extendedType: Type?): EOBndExpr {
    return EOBndExpr(
        EOObject(
            ArrayList(),
            None,
            listOf(
                if (extendedType is TypeName)
                    EOBndExpr(
                        ((extendedType as TypeName).compoundName.names.last().eoClassName() + ".new").eoDot(),
                        "super"
                    )
                else
                // Derive classes without "extends" specification from Object class.
                    EOBndExpr(
                        "class__Object.new".eoDot(),
                        "super"
                    ),
                EOBndExpr(
                    "super".eoDot(),
                    "@"
                )
            )
        ),
        "this"
    )
}

fun generateNew(clsDec: NormalClassDeclaration): EOBndExpr {
    return EOBndExpr(
        EOObject(
            ArrayList(),
            None,
            listOf(
                generateThis(clsDec.extendedType)
            ) + (
                EOBndExpr(
                    EOCopy(
                        "seq",
                        listOf(
                            EOCopy(
                                "this",
                                listOf()
                            )
                        )
                    ),
                    "@"
                )
            )
        ),
        "new"
    )
}
