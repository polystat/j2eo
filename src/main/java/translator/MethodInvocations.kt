package translator

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EODot
import eotree.EOExpr
import eotree.EOObject
import eotree.eoDot
import tree.Expression.Expression
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import util.ParseExprTasks
import util.isSystemOutCall

// TODO: create state object to store binding of expression
fun mapMethodInvocation(methodInvocation: MethodInvocation, name: String): List<EOBndExpr> {
    require(!methodInvocation.superSign) { "Super sign isn't supported yet" }
    require(methodInvocation.typeArguments == null) { "Type arguments aren't supported yet" }

    val isStaticCall = !isSystemOutCall(methodInvocation)

    val src: EODot = when (methodInvocation.qualifier) {
        is SimpleReference ->
            (methodInvocation.qualifier as SimpleReference).compoundName.eoDot()
        else ->
            throw IllegalArgumentException("Only SimpleReference is supported")
    }
    val callee: EODot = when (methodInvocation.qualifier) {
        is SimpleReference ->
            if ((methodInvocation.qualifier as SimpleReference).compoundName.names.size > 1)
                (methodInvocation.qualifier as SimpleReference).compoundName.names.dropLast(1).eoDot()
            else
                "this".eoDot()
        else ->
            throw IllegalArgumentException("Only SimpleReference is supported")
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
