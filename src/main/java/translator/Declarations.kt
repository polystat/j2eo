package translator

import arrow.core.None
import arrow.core.Option
import arrow.core.some
import eotree.*
import lexer.TokenCode
import tree.Declaration.ClassDeclaration
import tree.Declaration.Declaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Declaration.VariableDeclaration
import tree.Initializer
import tree.Type.PrimitiveType
import tree.Type.TypeName
import util.ParseExprTasks
import util.TokenCodes

fun mapClassDeclaration(dec: Declaration): List<EOBndExpr> {
    // TODO: get rid of option and implement all cases

    return when (dec) {
        is MethodDeclaration -> {
            listOf(mapMethodDeclaration(dec))
        }
        is NormalClassDeclaration -> {
            listOf(mapClass(dec as ClassDeclaration))
        }
        is VariableDeclaration -> {
            mapVariableDeclaration(dec, "n")
        }
        else -> {
            listOf()
        }
    }
}

fun mapDeclaration(dec: Declaration, name: String): List<EOBndExpr> {
    return when (dec) {
        is MethodDeclaration -> {
            listOf(mapMethodDeclaration(dec))
        }
        is NormalClassDeclaration -> {
            listOf(mapClass(dec as ClassDeclaration))
        }
        is VariableDeclaration -> {
            mapVariableDeclaration(dec, name)
        }
        else -> {
            listOf()
        }
    }
}

fun mapVariableDeclaration(dec: VariableDeclaration, name: String): List<EOBndExpr> =
    when (dec.type) {
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
    } + if (dec.initializer != null) {
        listOf(
            EOBndExpr(
                EOObject(
                    listOf(),
                    None,
                    listOf(
                        EOBndExpr(
                            EOCopy(
                                listOf(dec.name, "write").eoDot(),
                                constructInitName(dec.initializer).eoDot()
                            ),
                            "@"
                        )
                    )
                ),
                name
            )
        ) +
        mapInitializer(dec.initializer, constructInitName(dec.initializer))
    } else {
        listOf()
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
