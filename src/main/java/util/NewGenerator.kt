package util

import arrow.core.None
import arrow.core.flattenOption
import eotree.*
import lexer.TokenCode
import translator.mapClassDeclaration
import tree.Declaration.ClassDeclaration
import tree.Declaration.Declaration
import tree.Declaration.NormalClassDeclaration
import tree.Declaration.ParameterDeclaration
import tree.Type.Type
import tree.Type.TypeName
import kotlin.collections.ArrayList

fun generateThis(clsDec: NormalClassDeclaration): EOBndExpr {
    return EOBndExpr(
        EOObject(
            ArrayList(),
            None,
            listOf(
                if (clsDec.extendedType is TypeName)
                    EOBndExpr(
                        ((clsDec.extendedType as TypeName).compoundName.names.last().eoClassName() + ".new").eoDot(),
                        "super"
                    )
                else
                    EOBndExpr(
                        "class__Object.new".eoDot(),
                        "super"
                    ),
                EOBndExpr(
                    "super".eoDot(),
                    "@"
                )
            ) +
            if (clsDec.body != null)
                clsDec.body.declarations
                    .filter { dec: Declaration -> dec.modifiers == null ||
                        dec.modifiers.modifiers.modifiers.find { code: TokenCode -> code == TokenCode.Static } == null }
                    .map { mapClassDeclaration(it) }
                    .flattenOption()
            else
                listOf()
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
                generateThis(clsDec)
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
