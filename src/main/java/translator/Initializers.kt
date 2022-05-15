package translator

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import tree.CompoundName
import tree.Expression.SimpleReference
import tree.Initializer
import tree.InitializerSimple

fun mapInitializer(initializer: Initializer, name: String): List<EOBndExpr> {
    return when (initializer) {
        is InitializerSimple -> mapInitializerSimple(initializer, name)
        else ->
            mapInitializerSimple(InitializerSimple(SimpleReference(CompoundName("array_initializer_placeholder"))), name) // FIXME
    }
}

fun constructInitName(initializer: Initializer): String {
    return when (initializer) {
        is InitializerSimple -> "i_s${initializer.hashCode()}"
        else ->
            "un_i${initializer.hashCode()}"
    }
}

fun mapInitializerSimple(initializerSimple: InitializerSimple, name: String): List<EOBndExpr> {
    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            constructExprName(initializerSimple.expression)
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(initializerSimple.expression, constructExprName(initializerSimple.expression))
}
