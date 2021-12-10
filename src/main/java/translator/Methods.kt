package translator

import arrow.core.None
import arrow.core.some
import eotree.*
import tree.Declaration.MethodDeclaration
import tree.Declaration.ParameterDeclaration
import tree.Statement.BlockStatement
import util.ListUtils
import java.util.*
import java.util.stream.Collectors

fun mapMethodDeclaration(dec: MethodDeclaration): EOBndExpr {
    return EOBndExpr(
        EOObject(
            // Non-vararg parameters
            if (dec.parameters != null && dec.name != "main") // Exclude 'String[] args' fon now
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
                    .first()
                    .some()
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
        ),
        dec.name
    )
}
