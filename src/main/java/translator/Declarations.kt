package translator

import arrow.core.None
import eotree.* // ktlint-disable no-wildcard-imports
import lexer.TokenCode
import tree.Declaration.ClassDeclaration
import tree.Declaration.Declaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Declaration.VariableDeclaration
import tree.Initializer
import tree.Type.PrimitiveType
import tree.Type.TypeName
import util.TokenCodes
import util.logger

/**
 * Maps a declaration that resides inside of class.
 * The name may be confusing, but this DOES NOT map the class declaration itself.
 */
fun mapClassDeclaration(dec: Declaration, context: Context): List<EOBndExpr> {
    return when (dec) {
        is MethodDeclaration -> {
            listOf(mapMethodDeclaration(dec, context))
        }
        is NormalClassDeclaration -> {
            listOf(mapClass(dec as ClassDeclaration, context))
        }
        is VariableDeclaration -> {
            // FIXME: why do we have static name "dec" here?
            mapVariableDeclaration(dec, "dec", context, false)
        }
        else -> {
            logger.warn { "Skipping unsupported class declaration: ${dec.javaClass.name}" }
            listOf()
        }
    }
}

fun mapDeclaration(dec: Declaration, name: String, context: Context): List<EOBndExpr> {
    return when (dec) {
        is MethodDeclaration -> {
            listOf(mapMethodDeclaration(dec, context))
        }
        is NormalClassDeclaration -> {
            listOf(mapClass(dec as ClassDeclaration, context))
        }
        is VariableDeclaration -> {
            mapVariableDeclaration(dec, name, context)
        }
        else -> {
            logger.warn { "Skipping unsupported declaration: ${dec.javaClass.name}" }
            listOf()
        }
    }
}

fun mapVariableDeclaration(dec: VariableDeclaration, name: String, context: Context, mapInitializer: Boolean = true): List<EOBndExpr> {
    val initName = context.genUniqueEntityName(dec.initializer)

    return when (dec.type) {
        is TypeName -> {
            listOf(
                EOBndExpr(
                    EOCopy(
                        EODot("cage"),
                    ),
                    dec.name
                )
            )
        }
        is PrimitiveType -> {
            if ((dec.type as PrimitiveType).dimensions.dimensions.isEmpty()) {
                listOf(
                    EOBndExpr(
                        EOCopy(
                            listOf(
                                decodePrimitiveType(dec.type as PrimitiveType).value,
                                decodeInitializer(dec.initializer)
                            ).eoDot(),
                            listOf(decodePrimitiveType(dec.type as PrimitiveType).value, "new").eoDot()
                        ),
                        dec.name
                    )
                )
            } else {
                listOf(
                    EOBndExpr(
                        EOCopy(
                            EODot("cage"),
                        ),
                        dec.name
                    )
                )
            }
        }
        null ->
            throw IllegalArgumentException("\"var\" declarations are not supported yet")
        else ->
            throw IllegalArgumentException("Type of type " + dec.type.javaClass.name + " is not supported")
    } + if (mapInitializer) {
        if (dec.initializer != null) {
            listOf(
                EOBndExpr(
                    EOObject(
                        listOf(),
                        None,
                        listOf(
                            EOBndExpr(
                                EOCopy(
                                    listOf(dec.name, "write").eoDot(),
                                    initName.eoDot()
                                ),
                                "@"
                            )
                        )
                    ),
                    name
                )
            ) +
                mapInitializer(dec.initializer, initName, context)
        } else {
            listOf(
                EOBndExpr(
                    EOObject(
                        listOf(),
                        None,
                        listOf(
                            EOBndExpr(
                                EOCopy(
                                    "TRUE"
                                ),
                                "@"
                            )
                        )
                    ),
                    name
                )
            )
        }
    } else {
        listOf()
    }
}

fun decodePrimitiveType(type: PrimitiveType): TokenCodes {
    return when (type.typeCode) {
        TokenCode.Char -> TokenCodes.PRIM__CHAR
        TokenCode.Int -> TokenCodes.PRIM__INT
        TokenCode.Float -> TokenCodes.PRIM__FLOAT
        TokenCode.Double -> TokenCodes.PRIM__DOUBLE
        TokenCode.Boolean -> TokenCodes.PRIM__BOOLEAN
        TokenCode.Long -> TokenCodes.PRIM__LONG
        TokenCode.Byte -> TokenCodes.PRIM__BYTE
        TokenCode.Short -> TokenCodes.PRIM__SHORT
        else -> throw IllegalArgumentException("Type code " + type.typeCode + " is not supported")
    }
}

fun decodeInitializer(initializer: Initializer?): String {
    return "constructor_1"
}
