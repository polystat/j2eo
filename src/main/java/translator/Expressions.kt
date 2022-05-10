package translator

import arrow.core.None
import eotree.*
import lexer.TokenCode
import tree.CompoundName
import tree.Expression.Binary
import tree.Expression.Expression
import tree.Expression.Primary.*
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
        is InstanceCreation ->
            mapInstanceCreation(parseExprTasks, expr)
        else ->
            throw IllegalArgumentException("Expression of type ${expr.javaClass.simpleName} is not supported")
    }

fun mapInstanceCreation(parseExprTasks: ParseExprTasks, expr: InstanceCreation): EOObject {
    return EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                EOCopy(
                    CompoundName(listOf(expr.ctorType.getTypeName(), "new")).eoDot(),
                    expr.args.arguments.map { mapExpression(parseExprTasks, it) }
                ),
                "@"
            )
        )
    )
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
        TokenCode.Minus -> "neg"
        TokenCode.Plus -> null
        else -> throw IllegalArgumentException("Unary prefix ${expr.operator} is not supported")
    }

    val varName = parseExprTasks.addTask(expr.operand)

    return EOObject(
        listOf(),
        None,
        listOf(
            EOBndExpr(
                if (function != null) {
                    listOf(varName, function).eoDot()
                } else {
                    varName.eoDot()
                },
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
        TokenCode.Minus -> "sub"
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
        TokenCode.NonEqual -> "not_eq" /* TODO: double check */
        TokenCode.DoubleVertical -> "or" /* TODO: double check */
        TokenCode.DoubleAmpersand -> "and" /* TODO: double check */
        TokenCode.Ampersand -> "bit_and" /* TODO: double check */
        TokenCode.Vertical -> "bit_or" /* TODO: double check */
        TokenCode.VerticalAssign -> "or_write" /* FIXME */
        TokenCode.AmpersandAssign -> "and_write" /* FIXME */
        TokenCode.Caret -> "bit_xor" /* TODO: double check */
        else ->
            "binary_op_placeholder" // FIXME
            // throw IllegalArgumentException("Binary operation ${expr.operator} is not supported")
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
