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
import util.ParseExprTasks

fun mapExpression(parseExprTasks: ParseExprTasks, expr: Expression): EOObject =
    when (expr) {
        is MethodInvocation ->
            mapMethodInvocation(parseExprTasks, expr)
        is Literal ->
            mapLiteral(expr)
        is UnaryPrefix ->
            mapUnaryPrefix(parseExprTasks, expr)
        is UnaryPostfix ->
            mapUnaryPostfix(parseExprTasks, expr)
        is Binary ->
            mapBinary(parseExprTasks, expr)
        is SimpleReference ->
            mapSimpleReference(parseExprTasks, expr)
        is FieldAccess ->
            mapFieldAccess(parseExprTasks, expr)
        is This ->
            mapThis(expr)
        is Parenthesized ->
            mapParenthesized(parseExprTasks, expr)
        else ->
            throw IllegalArgumentException("Expression of type ${expr.javaClass.simpleName} is not supported")
    }

fun mapParenthesized(parseExprTasks: ParseExprTasks, expr: Parenthesized): EOObject =
    mapExpression(parseExprTasks, expr.expression)

// TODO: add support for type
fun mapThis(expr: This): EOObject {
    return EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                EOCopy(
                    "this".eoDot()
                ),
                "@"
            )
        )
    )
}

fun mapFieldAccess(parseExprTasks: ParseExprTasks, expr: FieldAccess): EOObject {
    //"${mapExpression(expr.expression)}.${expr.identifier}".eoDot()

    val exprName = parseExprTasks.addTask(expr.expression)
    return EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                EOCopy(
                    listOf(exprName, expr.identifier).eoDot()
                ),
                "@"
            )
        )
    )
}

fun mapUnaryPrefix(parseExprTasks: ParseExprTasks, expr: UnaryPrefix): EOObject {
    val function = when (expr.operator) {
        TokenCode.PlusPlus -> "inc_pre"
        TokenCode.MinusMinus -> "dec_pre"
        else -> throw IllegalArgumentException("Unary prefix ${expr.operator} is not supported")
    }

    val varName = parseExprTasks.addTask(expr.operand)

    return EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                listOf(varName, function).eoDot(),
                "@"
            )
        )
    )
}

fun mapUnaryPostfix(parseExprTasks: ParseExprTasks, expr: UnaryPostfix): EOObject {
    val function = when (expr.operator) {
        TokenCode.PlusPlus -> "inc_post"
        TokenCode.MinusMinus -> "dec_post"
        else -> throw IllegalArgumentException("Unary prefix ${expr.operator} is not supported")
    }

    val varName = parseExprTasks.addTask(expr.operand)

    return EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                listOf(varName, function).eoDot(),
                "@"
            )
        )
    )
}

// TODO: add automatic casting for primitive types
// TODO: populate with all Java binary operators
fun mapBinary(parseExprTasks: ParseExprTasks, expr: Binary): EOObject {
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
        TokenCode.PlusAssign -> "add_equal"
        TokenCode.MinusAssign -> "sub_equal"
        TokenCode.StarAssign -> "mul_equal"
        TokenCode.SlashAssign -> "div_equal"
        TokenCode.PercentAssign -> "mod_equal"
        TokenCode.RightShift -> "shift_r"
        TokenCode.LeftShift -> "shift_l"
        TokenCode.RightShiftAssign -> "shift_r_equal"
        TokenCode.LeftShiftAssign -> "shift_l_equal"
        TokenCode.ArithmRightShift -> "shift_u"
        TokenCode.ArithmRightShiftAssign -> "shift_u_equal"
        else -> throw IllegalArgumentException("Binary operation ${expr.operator} is not supported")
    }

    val leftName = parseExprTasks.addTask(expr.left)
    val rightName = parseExprTasks.addTask(expr.right)

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

fun mapSimpleReference(parseExprTasks: ParseExprTasks, expr: SimpleReference): EOObject =
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
