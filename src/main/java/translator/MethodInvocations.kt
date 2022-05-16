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
            else -> {
                listOf()
            }
        }
    ) + listOf(fieldAccess.identifier)
}


// TODO: create state object to store binding of expression
fun mapMethodInvocation(methodInvocation: MethodInvocation, name: String): List<EOBndExpr> {
    require(!methodInvocation.superSign) { "Super sign isn't supported yet" }
    require(methodInvocation.typeArguments == null) { "Type arguments aren't supported yet" }

    val isStaticCall = isStaticCall(methodInvocation)

    val src: EODot = when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference -> (methodQualifier.compoundName.names + listOf(methodInvocation.name)).eoDot()
        is FieldAccess -> (getFullIdentifier(methodQualifier) + listOf(methodInvocation.name)).eoDot()
        null -> methodInvocation.name.eoDot()
        else ->
            throw IllegalArgumentException("Unsupported method qualifier!")
    }
    val callee: EODot = when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference ->
            if (methodQualifier.compoundName.names.size > 1)
                methodQualifier.compoundName.names.dropLast(1).eoDot()
            else
                "this".eoDot()
        is FieldAccess -> getFullIdentifier(methodQualifier).eoDot()
        null -> "this".eoDot()
        else ->
            throw IllegalArgumentException("Unsupported method qualifier!")
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
