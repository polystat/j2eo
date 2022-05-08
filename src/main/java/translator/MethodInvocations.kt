package translator

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EODot
import eotree.EOExpr
import eotree.EOObject
import eotree.eoDot
import tree.CompoundName
import tree.Expression.Expression
import tree.Expression.FieldAccess
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import util.ParseExprTasks
import util.isSystemOutCall
import util.logger
import java.lang.reflect.Field

// TODO: create state object to store binding of expression
fun mapMethodInvocation(methodInvocation: MethodInvocation, name: String): List<EOBndExpr> {
    require(!methodInvocation.superSign) { "Super sign isn't supported yet" }
    require(methodInvocation.typeArguments == null) { "Type arguments aren't supported yet" }

    val isStaticCall = !isSystemOutCall(methodInvocation)

    val src: EODot = when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference -> (methodQualifier.compoundName.names + listOf(methodInvocation.name)).eoDot()
        is FieldAccess ->
            when (val qualExpr = methodQualifier.expression) {
                is SimpleReference -> CompoundName(
                    qualExpr.compoundName.names + listOf(methodQualifier.identifier, methodInvocation.name)
                ).eoDot()
                else -> {
                    logger.warn { "Unsupported field access expression" }
                    "field_access_expression".eoDot()
                }
            }
        // TODO: fix this with actual method invocation
        is MethodInvocation -> "method_invocation_${methodInvocation.name}".eoDot()
        else -> {
            logger.warn { "Unsupported method qualifier: ${methodQualifier?.javaClass?.name}" }
            "method_qualifier_${methodQualifier?.javaClass?.name}".eoDot()
        }
    }

    val callee: EODot = when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference ->
            if (methodQualifier.compoundName.names.size > 1)
                methodQualifier.compoundName.names.dropLast(1).eoDot()
            else
                "this".eoDot()
        is FieldAccess -> methodQualifier.identifier.eoDot()
        // TODO: fix this with actual method invocation
        is MethodInvocation -> "method_invocation_${methodInvocation.name}".eoDot()
        else -> {
            logger.warn { "Unsupported method qualifier: ${methodQualifier?.javaClass?.name}" }
            "method_qualifier_${methodQualifier?.javaClass?.name}".eoDot()
        }
    }

    return listOf(
        EOBndExpr (
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            src,
                            (if (!isStaticCall) listOf(callee) else ArrayList<EOExpr>()) +
                                (methodInvocation.arguments?.arguments?.map { obj -> constructExprName(obj).eoDot() } ?: listOf())
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + (methodInvocation.arguments?.arguments?.map { mapExpression(it, constructExprName(it)) }?.flatten() ?: listOf())
}
