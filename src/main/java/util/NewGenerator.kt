package util

import arrow.core.None
import arrow.core.flatten
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import eotree.data.EOStringData
import eotree.eoDot
import lexer.TokenCode
import translator.*
import tree.CompoundName
import tree.Declaration.*
import tree.Type.TypeName

fun generateInit(clsDec: NormalClassDeclaration, context: Context): EOBndExpr {
    val nonStaticVarDecls = clsDec.body?.declarations
        ?.filterIsInstance<VariableDeclaration>()
        ?.filter { it ->
            it.modifiers?.modifiers?.modifiers?.find { it == TokenCode.Static } == null && it.initializer != null
        } ?: listOf()

    val initNames = nonStaticVarDecls.associateWith { context.genUniqueEntityName(it.initializer) }
    val declNames = nonStaticVarDecls.associateWith { context.genUniqueEntityName(it) }

    val parsedInits = nonStaticVarDecls
        .associate {
            declNames[it]!! to listOf(
                EOBndExpr(
                    EOObject(
                        listOf(),
                        None,
                        listOf(
                            EOBndExpr(
                                EOCopy(
                                    listOf("this", it.name, "write").eoDot(),
                                    initNames[it]!!.eoDot()
                                ),
                                "@"
                            )
                        )
                    ),
                    declNames[it]!!
                )
            ) + mapInitializer(it.initializer, initNames[it]!!, context)
        }

    return EOBndExpr(
        EOObject(
            listOf("this"),
            None,
            listOf(
                EOBndExpr(
                    EOCopy(
                        "seq",
                        if (parsedInits.isNotEmpty())
                            parsedInits.keys.map { it.eoDot() }
                        else
                            listOf("TRUE".eoDot())
                    ),
                    "@"
                )
            ) + parsedInits.values.toList().flatten()
        ),
        "init"
    )
}

fun generateNewBody(clsDec: NormalClassDeclaration, context: Context): List<EOBndExpr> {
    return listOf(
        if (clsDec.extendedType is TypeName)
            EOBndExpr(
                CompoundName((clsDec.extendedType as TypeName).compoundName.names + "new").eoDot(),
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
        ),
        EOBndExpr(
            EOStringData(clsDec.name),
            "className"
        ),
        generateInit(clsDec, context)
    ) + (
        clsDec.body?.declarations
            ?.filter { dec: Declaration ->
                dec.modifiers?.modifiers?.modifiers?.find { it == TokenCode.Static } == null &&
                        dec !is ConstructorDeclaration &&
                        dec !is ClassDeclaration /* FIXME (IT'S NOT ALWAYS TRUE) */
            }
            ?.map { mapClassDeclaration(it, context) }
            ?.flatten()
        ?: listOf()
    )
}

fun generateNew(clsDec: NormalClassDeclaration, context: Context): EOBndExpr {
    return EOBndExpr(
        EOObject(
            ArrayList(),
            None,
            generateNewBody(clsDec, context)
        ),
        "new"
    )
}
