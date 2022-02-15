package translator

import arrow.core.None
import arrow.core.firstOrNone
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import lexer.TokenCode
import tree.Declaration.MethodDeclaration
import tree.Declaration.ParameterDeclaration
import tree.Declaration.VariableDeclaration
import tree.Statement.BlockStatements
import java.util.stream.Collectors

// fun MethodDeclaration.getLocalVariables(): List<Declaration> =
//    // TODO: add support for nested block variables as well
//    methodBody.block.blockStatements
//        .filter { it.declaration != null }
//        .map {  }

fun mapMethodDeclaration(dec: MethodDeclaration): EOBndExpr {
    val isStatic = dec.modifiers != null &&
        dec.modifiers.modifiers.modifiers.find { it == TokenCode.Static } != null
    val additionalParameters = if (!isStatic) listOf("this") else ArrayList()

    val obj = EOObject(
        // Non-vararg parameters
        if (dec.parameters != null) // Exclude 'String[] args' fon now
            additionalParameters +
                dec.parameters.parameters.stream()
                    .filter { param: ParameterDeclaration -> !param.signEllipsis }
                    .map { param: ParameterDeclaration -> param.name }
                    .collect(Collectors.toList())
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
        // TODO: implement
        try {
            dec.methodBody.block.findAllLocalVariables().map { preMapVariableDeclaration(it) } +
                listOf(
                    EOBndExpr(
                        EOCopy(
                            "seq",
                            dec.methodBody.block.blockStatements
                                .mapNotNull {
                                    if (it.statement != null)
                                        mapStatement(it.statement)
                                    else if (it.expression != null)
                                        mapExpression(it.expression)
//                                    else if (it.declaration != null)
//
                                    else
                                        null
                                }
                        ),
                        "@"
                    )
                )
        } catch (e: NullPointerException) {
            listOf(
                EOBndExpr(
                    EOCopy(
                        "0",
                        ArrayList()
                    ),
                    "@"
                )
            )
        }
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
        dec.name
    )
}

fun BlockStatements.findAllLocalVariables(): List<VariableDeclaration> =
    blockStatements
        .filter { it.declaration is VariableDeclaration }
        .map { it.declaration as VariableDeclaration }
