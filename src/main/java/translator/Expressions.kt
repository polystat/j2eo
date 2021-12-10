package translator

import eotree.EOAnonExpr
import tree.Expression.Expression
import tree.Expression.Primary.Literal
import tree.Expression.Primary.MethodInvocation

fun mapExpression(expr: Expression?): EOAnonExpr {
    if (expr is MethodInvocation) {
        return EOAnonExpr(mapMethodInvocation(expr))
    } else if (expr is Literal) {
        return EOAnonExpr(mapLiteral(expr))
    }
    throw IllegalArgumentException("Only MethodInvocation & Literal are supported!")
}
