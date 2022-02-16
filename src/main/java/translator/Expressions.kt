package translator

import arrow.core.None
import eotree.*
import eotree.data.EOIntData
import lexer.TokenCode
import tree.Expression.Binary
import tree.Expression.Expression
import tree.Expression.FieldAccess
import tree.Expression.Primary.Literal
import tree.Expression.Primary.MethodInvocation
import tree.Expression.Primary.Parenthesized
import tree.Expression.Primary.This
import tree.Expression.SimpleReference
import tree.Expression.UnaryPostfix
import tree.Expression.UnaryPrefix

fun mapExpression(expr: Expression): EOObject =
    when (expr) {
        is MethodInvocation ->
            mapMethodInvocation(expr)
        is Literal ->
            mapLiteral(expr)
//        is UnaryPrefix ->
//            mapUnaryPrefix(expr)
//        is UnaryPostfix ->
//            mapUnaryPostfix(expr)
        is Binary ->
            mapBinary(expr)
        is SimpleReference ->
            mapSimpleReference(expr)
//        is FieldAccess ->
//            mapFieldAccess(expr)
//        is This ->
//            mapThis(expr)
        is Parenthesized ->
            mapParenthesized(expr)
        else ->
            throw IllegalArgumentException("Expression of type ${expr.javaClass.simpleName} is not supported")
    }

fun mapParenthesized(expr: Parenthesized): EOObject =
    mapExpression(expr.expression)

// TODO: add support for type
fun mapThis(expr: This): EOExpr =
    "this".eoDot()

fun mapFieldAccess(expr: FieldAccess): EOExpr =
    "${mapExpression(expr.expression)}.${expr.identifier}".eoDot()

fun mapUnaryPrefix(expr: UnaryPrefix): EOExpr {
    val function = when (expr.operator) {
        TokenCode.PlusPlus -> "add"
        TokenCode.MinusMinus -> "sub"
        else -> throw IllegalArgumentException("Unary prefix ${expr.operator} is not supported")
    }

    // TODO: create separate state object to pass pre and post operations of the statement
    // TODO: return EODot here
    return EOCopy(
        "${mapSimpleReference(expr.operand as SimpleReference)}.$function".eoDot(),
        EOIntData(1)
    )
}

// TODO: think about operation order
fun mapUnaryPostfix(expr: UnaryPostfix): EOExpr {
    val function = when (expr.operator) {
        TokenCode.PlusPlus -> "add"
        TokenCode.MinusMinus -> "sub"
        else -> throw IllegalArgumentException("Unary prefix ${expr.operator} is not supported")
    }

    // TODO: create separate state object to pass pre and post operations of the statement
    // TODO: return EODot here
    return EOCopy(
        "${mapSimpleReference(expr.operand as SimpleReference)}.$function".eoDot(),
        EOIntData(1)
    )
}

// TODO: add automatic casting for primitive types
// TODO: populate with all Java binary operators
fun mapBinary(expr: Binary): EOObject {
    val function = when (expr.operator) {
        TokenCode.Plus -> "add"
        TokenCode.Minus -> "minus"
        TokenCode.Greater -> "greater"
        TokenCode.GreaterEqual -> "geq"
        TokenCode.Equal -> "eq"
        TokenCode.Less -> "less"
        TokenCode.LessEqual -> "leq"
        TokenCode.Assign -> "write"
        TokenCode.Star -> "mul"
        TokenCode.Slash -> "div"
        else -> throw IllegalArgumentException("Binary operation ${expr.operator} is not supported")
    }

    ParseExprGoals.addGoal(expr.left)
    val leftName = ParseExprGoals.c_name
    ParseExprGoals.addGoal(expr.right)
    val rightName = ParseExprGoals.c_name

    return EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                EOCopy(
                    listOf(leftName, function).eoDot(),
                    rightName.eoDot()
                ),
                "@"
            )
        )
    )
}

fun mapSimpleReference(expr: SimpleReference): EOObject =
    EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                expr.compoundName.eoDot(),
                "@"
            )
        )
    )
