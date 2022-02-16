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
import util.isSystemOutCall

// TODO: create state object to store binding of expression
fun mapMethodInvocation(methodInvocation: MethodInvocation): EOObject {
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

    return EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                EOCopy(
                    src,
                    (if (!isStaticCall) listOf(callee) else ArrayList<EOExpr>()) +
                        (methodInvocation.arguments?.arguments?.map { obj -> parseArgument(obj) } ?: listOf())
                ),
                "@"
            )
        )
    )
}

fun parseArgument(expr: Expression): EOExpr {
    ParseExprGoals.addGoal(expr)
    return ParseExprGoals.c_name.eoDot()
}
