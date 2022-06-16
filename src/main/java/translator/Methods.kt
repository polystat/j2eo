package translator

import arrow.core.*
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import eotree.eoDot
import lexer.TokenCode
import tree.Declaration.ConstructorDeclaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.ParameterDeclaration

fun genInit(): EOBndExpr =
    EOBndExpr(
        EOObject(
            listOf(),
            None,
            listOf(
                EOBndExpr(
                    EOCopy(
                        listOf("this", "init").eoDot(),
                        "this".eoDot()
                    ),
                    "@"
                )
            )
        ),
        "initialization"
    )

fun mapMethodDeclaration(dec: MethodDeclaration, context: Context): EOBndExpr {
    val isStatic = dec.modifiers != null &&
            dec.modifiers.modifiers.modifiers.find { it == TokenCode.Static } != null
    val additionalParameters = if (!isStatic) listOf("this") else ArrayList()

    val obj = EOObject(
        // Non-vararg parameters
        if (dec.parameters != null) // Exclude 'String[] args' fon now
            additionalParameters +
                    dec.parameters.parameters
                        .filter { param: ParameterDeclaration -> !param.signEllipsis }
                        .map { param: ParameterDeclaration -> param.name }
                        .toList()
        else
            additionalParameters,

        // Optional vararg parameter
        if (dec.parameters != null)
            dec.parameters.parameters
                .filter { param: ParameterDeclaration -> param.signEllipsis }
                .map { param: ParameterDeclaration -> param.name }
                .also { assert(it.size <= 1) }
                .firstOrNone()
        else
            None,

        // Bound attributes
        if (dec.methodBody != null) {
            mapBlock(
                dec.methodBody,
                context,
                firstStmts = if (dec is ConstructorDeclaration) {
                    listOf("initialization" to listOf(genInit()))
                } else {
                    null
                },
                lastStmts = if (dec is ConstructorDeclaration) {
                    listOf("this" to listOf())
                } else {
                    null
                }
            )
        } else {
            listOf(
                EOBndExpr(
                    EOCopy(
                        "TRUE",
                        ArrayList()
                    ),
                    "@"
                )
            )
        },

        "${dec.name} :: ${
            dec.parameters?.parameters
                ?.joinToString(" -> ") { param ->
                    param.type.getTypeName() + param.signEllipsis.let { if (it) "..." else "" }
                }
        } -> ${
            Option.fromNullable(dec.type)
                .map { it.getTypeName() }
                .getOrElse { "void" }
        }"
    )

    // Contract to check parameter count
    if (dec.parameters != null)
        assert(
            dec.parameters.parameters.size + (if (isStatic) 0 else 1) ==
                    obj.freeAttrs.size + if (obj.varargAttr.nonEmpty()) 1 else 0
        ) {
            "Parameters count of Java method and EO method do not match: ${dec.parameters.parameters.size} vs ${obj.freeAttrs.size + if (obj.varargAttr.nonEmpty()) 1 else 0}"
        }

    return EOBndExpr(
        obj,
        dec.name ?: "constructor"
    )
}
