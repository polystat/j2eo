package translator

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOExpr
import eotree.EOObject
import eotree.eoDot
import tree.Expression.Expression
import tree.Expression.Primary.FieldAccess
import tree.Expression.Primary.MethodInvocation
import tree.Expression.Primary.This
import tree.Expression.SimpleReference

private fun isStaticCall(fullIdentifier: List<String>): Boolean {
    return fullIdentifier.size == 1 && fullIdentifier.first().startsWith("class__")
}

private fun getCalleeFullIdentifier(
    methodInvocation: MethodInvocation,
    context: Context,
    additionalBindings: ArrayList<Pair<Expression, String>>,
    qualifierName: String
): List<String> {
    return when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference -> methodQualifier.compoundName.names
        is FieldAccess -> getFullIdentifier(methodQualifier, context, additionalBindings)
        is MethodInvocation -> {
            additionalBindings.add(methodQualifier to qualifierName)
            listOf(qualifierName)
        }
        is This -> listOf("this")
        null -> listOf()
        else -> {
            util.logger.warn {
                "Unsupported method qualifier ${methodQualifier.javaClass.simpleName}; " +
                    "falling back to unsupported_qualifier"
            }
            listOf("unsupported_qualifier")
        }
    }
}

private fun getFullIdentifier(
    fieldAccess: FieldAccess,
    context: Context,
    additionalBindings: ArrayList<Pair<Expression, String>>
): List<String> {
    return (
        when (val expr = fieldAccess.expression) {
            is FieldAccess -> getFullIdentifier(expr, context, additionalBindings)
            is SimpleReference -> expr.compoundName.names
            is This -> listOf("this")
            is MethodInvocation -> {
                val qualifierName = context.genUniqueEntityName(expr)
                additionalBindings.add(expr to qualifierName)
                listOf(qualifierName)
            }
            else -> listOf()
        }
        ) + listOf(fieldAccess.identifier)
}

fun trueMethodInvocationName(name: String): List<String> {
    return when (name) {
        "this" -> listOf("this", "constructor") /* FIXME (IT'S NOT ALWAYS TRUE) */
        "super" -> listOf("this", "super", "constructor") /* FIXME (IT'S NOT ALWAYS TRUE) */
        else -> listOf(name)
    }
}

// TODO: create state object to store binding of expression
fun mapMethodInvocation(methodInvocation: MethodInvocation, name: String, context: Context): List<EOBndExpr> {
    // require(!methodInvocation.superSign) { "Super sign isn't supported yet" }
    /* FIXME (NOW PARTIALLY SUPPORTED) */
    require(methodInvocation.typeArguments == null) { "Type arguments aren't supported yet" }

    val additionalBindings = ArrayList<Pair<Expression, String>>()
    val qualifierName = context.genUniqueEntityName(methodInvocation.qualifier)
    val trueName = trueMethodInvocationName(methodInvocation.name)

    val fullIdentifier = getCalleeFullIdentifier(
        methodInvocation, context, additionalBindings, qualifierName
    ) + trueName
    val isStaticCall = isStaticCall(fullIdentifier.dropLast(1))

    val src = fullIdentifier.eoDot()
    val callee = fullIdentifier.dropLast(1).eoDot()
    val argNames = methodInvocation.arguments?.arguments?.map { context.genUniqueEntityName(it) }

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            src,
                            (if (!isStaticCall) listOf(callee) else ArrayList<EOExpr>()) +
                                (argNames?.map { it.eoDot() } ?: listOf())
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + (
        methodInvocation.arguments?.arguments
            ?.mapIndexed { idx, it -> mapExpression(it, argNames!![idx], context) }?.flatten() ?: listOf()
        ) + additionalBindings.map { mapExpression(it.first, it.second, context) }.flatten()
}
