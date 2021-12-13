package translator

import arrow.core.None
import arrow.core.Option
import arrow.core.some
import eotree.EOCopy
import eotree.EODot
import eotree.EOExpr
import tree.Expression.Expression
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import java.util.*
import java.util.stream.Collectors

fun mapMethodInvocation(methodInvocation: MethodInvocation): EOCopy {
    var src: Option<EOExpr> = None
    if (methodInvocation.qualifier != null) {
        val expr = methodInvocation.qualifier
        if (expr is SimpleReference) {
            expr.compoundName.names.reverse()
            src = buildEODotObjTree(expr.compoundName.names)
        }
    }
    require(!methodInvocation.superSign) { "Super sign isn't supported yet" }
    require(methodInvocation.typeArguments == null) { "Type arguments aren't supported yet" }
    return EOCopy(
        EODot(src, methodInvocation.name),
        methodInvocation.arguments.arguments.stream()
            .map { obj -> mapExpression(obj) }
            .collect(Collectors.toList())
    )
}

private fun buildEODotObjTree(names: ArrayList<String>): Option<EOExpr> =
    if (names.size > 0) {
        var name = names.removeAt(0)
        if (name == "System") {
            name = "class_$name"
        }
        EODot(
            buildEODotObjTree(names),
            name
        ).some()
    } else {
        None
    }
