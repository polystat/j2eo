package translator

import arrow.core.None
import arrow.core.firstOrNone
import arrow.core.some
import eotree.*
import tree.Declaration.Declaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.ParameterDeclaration
import tree.Statement.BlockStatement
import util.ListUtils
import java.util.*
import java.util.stream.Collectors

//fun MethodDeclaration.getLocalVariables(): List<Declaration> =
//    // TODO: add support for nested block variables as well
//    methodBody.block.blockStatements
//        .filter { it.declaration != null }
//        .map {  }


fun mapMethodDeclaration(dec: MethodDeclaration): EOBndExpr {
    val obj = EOObject(
        // Non-vararg parameters
        if (dec.parameters != null) // Exclude 'String[] args' fon now
            dec.parameters.parameters.stream()
                .filter { param: ParameterDeclaration -> !param.signEllipsis }
                .map { param: ParameterDeclaration -> param.name }
                .collect(Collectors.toList())
        else
            ArrayList(),

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
        listOf()
//            listOf(
//                EOBndExpr(
//                    EOCopy(
//                        EODot("seq"),
//                        if (dec.methodBody != null) dec.methodBody.block.blockStatements.stream()
//                            .map { obj: BlockStatement? -> mapBlockStatement(obj!!) }
//                            .collect(Collectors.toList()) else emptyList()
//                    ),
//                    "@"
//                )
//            )
    )

    // Contract to check parameter count
    if (dec.parameters != null)
        assert(dec.parameters.parameters.size ==
                obj.freeAttrs.size + if (obj.varargAttr.nonEmpty()) 1 else 0) {
            "Parameters count of Java method and EO method do not match: ${dec.parameters.parameters.size} vs ${obj.freeAttrs.size + if (obj.varargAttr.nonEmpty()) 1 else 0}"
        }

    return EOBndExpr(
        obj,
        dec.name
    )
}
