package translator

import arrow.core.None
import arrow.core.Option
import arrow.core.some
import eotree.*
import tree.Expression.Expression
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import java.util.*
import java.util.stream.Collectors

// TODO: create state object to store binding of expression
fun mapMethodInvocation(methodInvocation: MethodInvocation): EOCopy {
    require(!methodInvocation.superSign) { "Super sign isn't supported yet" }
    require(methodInvocation.typeArguments == null) { "Type arguments aren't supported yet" }

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
    return EOCopy(
        src,
        listOf(callee) +
        (methodInvocation.arguments?.arguments?.map { obj -> mapExpression(obj) } ?: listOf())
    )
}
