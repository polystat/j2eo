package translator

import arrow.core.None
import arrow.core.flatten
import eotree.*
import lexer.TokenCode
import tree.CompoundName
import tree.Expression.*
import tree.Expression.Primary.*
import tree.Type.PrimitiveType
import tree.Type.TypeName

fun mapExpression(expr: Expression, name: String, context: Context): List<EOBndExpr> =
    when (expr) {
        is MethodInvocation ->
            mapMethodInvocation(expr, name, context)
        is Literal ->
            listOf(mapLiteral(expr, name, context))
        is UnaryPrefix ->
            mapUnaryPrefix(expr, name, context)
        is UnaryPostfix ->
            mapUnaryPostfix(expr, name, context)
        is Binary ->
            mapBinary(expr, name, context)
        is SimpleReference ->
            listOf(mapSimpleReference(expr, name, context))
        is FieldAccess ->
            mapFieldAccess(expr, name, context)
        is This ->
            listOf(mapThis(expr, name, context))
        is Parenthesized ->
            mapParenthesized(expr, name, context)
        is InstanceCreation ->
            mapInstanceCreation(expr, name, context)
        is ArrayCreation ->
            mapArrayCreation(expr, name, context)
        is ArrayAccess ->
            mapArrayAccess(expr, name, context)
        is Cast ->
            mapCastExpr(expr, name, context)
        is InstanceOf -> listOf(
            mapSimpleReference(SimpleReference(CompoundName("instance_of_placeholder")), name, context) /* FIXME */
        )
        is InstanceCreationQualified -> listOf(
            mapSimpleReference(SimpleReference(CompoundName("instance_creation_q_placeholder")), name, context) /* FIXME */
        )
        else ->
            throw IllegalArgumentException("Expression of type ${expr.javaClass.simpleName} is not supported")
    }

fun mapCastExpr(cast: Cast, name: String, context: Context): List<EOBndExpr> {
    val castExprName = context.genUniqueEntityName(cast.expression)

    val castType = cast.types.types[0]
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            (
                                when(castType) {
                                    is PrimitiveType -> listOf(decodePrimitiveType(castType).value)
                                    is TypeName -> castType.compoundName.names
                                    else -> listOf("unknown_type_${castType.javaClass.simpleName}")
                                } +
                                listOf("from")
                            ).eoDot(),
                            castExprName.eoDot()
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(cast.expression, castExprName, context)
}

fun mapArrayAccess(access: ArrayAccess, name: String, context: Context): List<EOBndExpr> {
    val accessExprName = context.genUniqueEntityName(access.expression)
    val accessSizeName = context.genUniqueEntityName(access.size)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(accessExprName, "get").eoDot(),
                            listOf(accessSizeName, "v").eoDot()
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(access.expression, accessExprName, context) +
            mapExpression(access.size, accessSizeName, context)
}

fun mapArrayCreation(arrayCreation: ArrayCreation, name: String, context: Context): List<EOBndExpr> {
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            "cannot_get_access_to_array_initializer" // FIXME
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    )
}

/**
 * Maps Java instance creation using "new" operator to EO binding.
 * The output has the following structure:
 *
 *             [] > name
 *               class.constructor_1 > @
 *                 class.new
 *                 "value"
 */
fun mapInstanceCreation(expr: InstanceCreation, name: String, context: Context): List<EOBndExpr> {
    val argNames = expr.args.arguments.map { context.genUniqueEntityName(it) }

    return listOf(
            EOBndExpr(
                EOObject(
                    listOf(),
                    None,
                    listOf(
                        EOBndExpr(
                            EOCopy(
                                listOf(expr.ctorType.getTypeName(), "constructor").eoDot(),
                                listOf(listOf(expr.ctorType.getTypeName(), "new").eoDot()) +
                                argNames.map { it.eoDot() }
                            ),
                            "@"
                        )
                    )
                ),
                name
            )
    ) + expr.args.arguments
            .mapIndexed { idx, it -> mapExpression(it, argNames[idx], context) }.toList().flatten()
}

fun mapParenthesized(expr: Parenthesized, name: String, context: Context): List<EOBndExpr> {
    val parExprName = context.genUniqueEntityName(expr.expression)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            parExprName
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.expression, parExprName, context)
}

// TODO: add support for type
fun mapThis(expr: This, name: String, context: Context): EOBndExpr {
    return EOBndExpr(
        EOObject(
            listOf(),
            None,
            listOf(
                EOBndExpr(
                    EOCopy(
                        "this"
                    ),
                    "@"
                )
            )
        ),
        name
    )
}

fun mapFieldAccess(expr: FieldAccess, name: String, context: Context): List<EOBndExpr> {
    val fieldExprName = context.genUniqueEntityName(expr.expression)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            if (!expr.superSign) {
                                listOf(fieldExprName, expr.identifier).eoDot()
                            } else {
                                listOf(fieldExprName, "super", expr.identifier).eoDot()
                            }
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.expression, fieldExprName, context)
}

fun mapUnaryPrefix(expr: UnaryPrefix, name: String, context: Context): List<EOBndExpr> {
    val function = when (expr.operator) {
        TokenCode.PlusPlus -> "inc_pre"
        TokenCode.MinusMinus -> "dec_pre"
        TokenCode.Minus -> "neg"
        TokenCode.Plus -> null
        else ->
            "unary_placeholder" // FIXME
    }

    val operandName = context.genUniqueEntityName(expr.operand)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            if (function != null) {
                                listOf(operandName, function).eoDot()
                            } else {
                                operandName.eoDot()
                            }
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.operand, operandName, context)
}

fun mapUnaryPostfix(expr: UnaryPostfix, name: String, context: Context): List<EOBndExpr> {
    val function = when (expr.operator) {
        TokenCode.PlusPlus -> "inc_post"
        TokenCode.MinusMinus -> "dec_post"
        else ->
            "unary_placeholder" // FIXME
    }

    val operandName = context.genUniqueEntityName(expr.operand)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(operandName, function).eoDot()
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.operand, operandName, context)
}

// TODO: add automatic casting for primitive types
// TODO: populate with all Java binary operators
fun mapBinary(expr: Binary, name: String, context: Context): List<EOBndExpr> {
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

    val leftName = context.genUniqueEntityName(expr.left)
    val rightName = context.genUniqueEntityName(expr.right)

    return listOf(
        EOBndExpr(
            EOObject(
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
            ),
            name
        )
    ) + mapExpression(expr.left, leftName, context) +
            mapExpression(expr.right, rightName, context)
}

fun mapSimpleReference(expr: SimpleReference, name: String, context: Context): EOBndExpr =
    EOBndExpr(
        EOObject(
            listOf(),
            None,
            listOf(
                EOBndExpr(
                    EOCopy(
                        expr.compoundName.eoDot()
                    ),
                    "@"
                )
            )
        ),
        name
    )
