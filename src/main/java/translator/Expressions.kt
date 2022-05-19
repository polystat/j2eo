package translator

import arrow.core.None
import arrow.core.flatten
import eotree.*
import lexer.TokenCode
import tree.Expression.*
import tree.Expression.Primary.*
import tree.Type.PrimitiveType
import tree.Type.TypeName

fun mapExpression(expr: Expression, name: String): List<EOBndExpr> =
    when (expr) {
        is MethodInvocation ->
            mapMethodInvocation(expr, name)
        is Literal ->
            listOf(mapLiteral(expr, name))
        is UnaryPrefix ->
            mapUnaryPrefix(expr, name)
        is UnaryPostfix ->
            mapUnaryPostfix(expr, name)
        is Binary ->
            mapBinary(expr, name)
        is SimpleReference ->
            listOf(mapSimpleReference(expr, name))
        is FieldAccess ->
            mapFieldAccess(expr, name)
        is This ->
            listOf(mapThis(expr, name))
        is Parenthesized ->
            mapParenthesized(expr, name)
        is InstanceCreation ->
            mapInstanceCreation(expr, name)
        is ArrayCreation ->
            mapArrayCreation(expr, name)
        is ArrayAccess ->
            mapArrayAccess(expr, name)
        is Cast ->
            mapCastExpr(expr, name)
        else ->
            throw IllegalArgumentException("Expression of type ${expr.javaClass.simpleName} is not supported")
    }

fun constructExprName(expr: Expression): String =
    when (expr) {
        is MethodInvocation ->
            "m_i${expr.hashCode()}"
        is Literal ->
            "l${expr.hashCode()}"
        is UnaryPrefix ->
            "u_pre${expr.hashCode()}"
        is UnaryPostfix ->
            "u_post${expr.hashCode()}"
        is Binary ->
            "b${expr.hashCode()}"
        is SimpleReference ->
            "s_r${expr.hashCode()}"
        is FieldAccess ->
            "f_a${expr.hashCode()}"
        is This ->
            "t${expr.hashCode()}"
        is Parenthesized ->
            "p${expr.hashCode()}"
        is InstanceCreation ->
            "inst${expr.hashCode()}"
        is ArrayCreation ->
            "a_c${expr.hashCode()}"
        is ArrayAccess ->
            "a_a${expr.hashCode()}"
        is Cast ->
            "c${expr.hashCode()}"
        else ->
            throw IllegalArgumentException("Expression of type ${expr.javaClass.simpleName} is not supported")
    }

fun mapCastExpr(cast: Cast, name: String): List<EOBndExpr> {
    val castType = cast.types.types[0]
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            (when(castType) {
                                    is PrimitiveType -> listOf(decodePrimitiveType(castType).value)
                                    is TypeName -> castType.compoundName.names
                                    else -> listOf("unknown_type_${castType.javaClass.simpleName}")
                                } +
                                listOf("from")
                            ).eoDot(),
                            constructExprName(cast.expression).eoDot()
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(cast.expression, constructExprName(cast.expression))
}

fun mapArrayAccess(access: ArrayAccess, name: String): List<EOBndExpr> {
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(constructExprName(access.expression), "get").eoDot(),
                            listOf(constructExprName(access.size), "v").eoDot()
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(access.expression, constructExprName(access.expression)) +
            mapExpression(access.size, constructExprName(access.size))
}

fun mapArrayCreation(arrayCreation: ArrayCreation, name: String): List<EOBndExpr> {
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

fun mapInstanceCreation(expr: InstanceCreation, name: String): List<EOBndExpr> {
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
                                expr.args.arguments.map { constructExprName(it).eoDot() }.toList()
                            ),
                            "@"
                        )
                    )
                ),
                name
            )
    ) + expr.args.arguments.map { mapExpression(it, constructExprName(it)) }.toList().flatten()
}

fun mapParenthesized(expr: Parenthesized, name: String): List<EOBndExpr> =
    listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            constructExprName(expr.expression)
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.expression, constructExprName(expr.expression))

// TODO: add support for type
fun mapThis(expr: This, name: String): EOBndExpr {
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

fun mapFieldAccess(expr: FieldAccess, name: String): List<EOBndExpr> {
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(constructExprName(expr.expression), expr.identifier).eoDot()
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.expression, constructExprName(expr.expression))
}

fun mapUnaryPrefix(expr: UnaryPrefix, name: String): List<EOBndExpr> {
    val function = when (expr.operator) {
        TokenCode.PlusPlus -> "inc_pre"
        TokenCode.MinusMinus -> "dec_pre"
        TokenCode.Minus -> "neg"
        TokenCode.Plus -> null
        else ->
            "unary_placeholder" // FIXME
    }

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            if (function != null) {
                                listOf(constructExprName(expr.operand), function).eoDot()
                            } else {
                                constructExprName(expr.operand).eoDot()
                            }
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.operand, constructExprName(expr.operand))
}

fun mapUnaryPostfix(expr: UnaryPostfix, name: String): List<EOBndExpr> {
    val function = when (expr.operator) {
        TokenCode.PlusPlus -> "inc_post"
        TokenCode.MinusMinus -> "dec_post"
        else ->
            "unary_placeholder" // FIXME
    }

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(constructExprName(expr.operand), function).eoDot()
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.operand, constructExprName(expr.operand))
}

// TODO: add automatic casting for primitive types
// TODO: populate with all Java binary operators
fun mapBinary(expr: Binary, name: String): List<EOBndExpr> {
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

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(constructExprName(expr.left), function).eoDot(),
                            constructExprName(expr.right).eoDot()
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(expr.left, constructExprName(expr.left)) + mapExpression(expr.right, constructExprName(expr.right))
}

fun mapSimpleReference(expr: SimpleReference, name: String): EOBndExpr =
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
