package translator

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EODot
import eotree.EOExpr
import eotree.EOObject
import eotree.eoDot
import tree.CompoundName
import tree.Expression.Primary.FieldAccess
import tree.Expression.Primary.MethodInvocation
import tree.Expression.Primary.This
import tree.Expression.SimpleReference


private fun isStaticCall(methodInvocation: MethodInvocation): Boolean {
    return when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference -> {
            methodQualifier.compoundName.names.first().contains("class__") &&
                    methodQualifier.compoundName.names.size == 1
        }
        is FieldAccess -> {
            val fullIdentifier = getFullIdentifier(methodQualifier)
            fullIdentifier.first().contains("class__") && fullIdentifier.size == 1
        }
        else -> false
    }
}

private fun getFullIdentifier(fieldAccess: FieldAccess): List<String> {
    return (
        when (fieldAccess.expression) {
            is FieldAccess -> {
                getFullIdentifier(fieldAccess.expression as FieldAccess)
            }
            is SimpleReference -> {
                (fieldAccess.expression as SimpleReference).compoundName.names
            }
            is This -> listOf("this")
            else -> {
                listOf()
            }
        }
    ) + listOf(fieldAccess.identifier)
}

fun trueMethodInvocationName(name: String): List<String> {
    return when (name) {
        "this" -> listOf("constructor") /* FIXME (IT'S NOT ALWAYS TRUE) */
        "super" -> listOf("super", "constructor") /* FIXME (IT'S NOT ALWAYS TRUE) */
        else -> listOf(name)
    }
}

// TODO: create state object to store binding of expression
fun mapMethodInvocation(methodInvocation: MethodInvocation, name: String, context: Context): List<EOBndExpr> {
    // require(!methodInvocation.superSign) { "Super sign isn't supported yet" }
    /* FIXME (NOW PARTIALLY SUPPORTED) */
    require(methodInvocation.typeArguments == null) { "Type arguments aren't supported yet" }

    val isStaticCall = isStaticCall(methodInvocation)
    val trueName = trueMethodInvocationName(methodInvocation.name)
    val qualifierName = context.genUniqueEntityName(methodInvocation.qualifier)

    val src: EODot = when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference -> (methodQualifier.compoundName.names + trueName).eoDot()
        is FieldAccess -> (getFullIdentifier(methodQualifier) + trueName).eoDot()
        is MethodInvocation -> (listOf(qualifierName) + trueName).eoDot()
        is This -> (listOf("this") + trueName).eoDot()
        null -> trueName.eoDot()
        else -> {
            util.logger.warn { "Unsupported method qualifier ${methodQualifier.javaClass.simpleName}; " +
                    "falling back to unsupported_qualifier" }
            "unsupported_qualifier".eoDot()
        }
    }
    val callee: EODot = when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference ->
            if (methodQualifier.compoundName.names.size > 0)
                methodQualifier.compoundName.names.eoDot()
            else
                if (!methodInvocation.superSign) "this".eoDot() else listOf("this", "super").eoDot()
        is FieldAccess -> getFullIdentifier(methodQualifier).eoDot()
        is MethodInvocation -> qualifierName.eoDot()
        is This -> "this".eoDot()
        null -> if (!methodInvocation.superSign) "this".eoDot() else listOf("this", "super").eoDot()
        else -> {
            util.logger.warn { "Unsupported method qualifier ${methodQualifier.javaClass.simpleName}; " +
                    "falling back to unsupported_qualifier" }
            "unsupported_qualifier".eoDot()
        }
    }

    val argNames = methodInvocation.arguments?.arguments?.map { context.genUniqueEntityName(it) }

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
                                (argNames?.map { it.eoDot() } ?: listOf())
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + (methodInvocation.arguments?.arguments
            ?.mapIndexed { idx, it -> mapExpression(it, argNames!![idx], context) }?.flatten() ?: listOf()) +
        if (methodInvocation.qualifier is MethodInvocation) {
            mapMethodInvocation(
                methodInvocation.qualifier as MethodInvocation,
                qualifierName,
                context
            )
        } else {
            listOf()
        }
}
