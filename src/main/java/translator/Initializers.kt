package translator

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOCopy
import eotree.EOObject
import eotree.eoDot
import tree.CompoundName
import tree.Expression.SimpleReference
import tree.Initializer
import tree.InitializerArray
import tree.InitializerSimple

fun mapInitializer(initializer: Initializer, name: String, context: Context): List<EOBndExpr> {
    return when (initializer) {
        is InitializerSimple -> mapInitializerSimple(initializer, name, context)
        is InitializerArray -> mapInitializerArray(initializer, name, context)
        else ->
            mapInitializerSimple(
                InitializerSimple(SimpleReference(CompoundName("unknown_initializer_placeholder"))), name, context
            ) // FIXME
    }
}

fun mapInitializerSimple(initializerSimple: InitializerSimple, name: String, context: Context): List<EOBndExpr> {
    val initExprName = context.genUniqueEntityName(initializerSimple.expression)

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            initExprName
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + mapExpression(initializerSimple.expression, initExprName, context)
}

fun mapInitializerArray(initializerArray: InitializerArray, name: String, context: Context): List<EOBndExpr> {
    val initNames = initializerArray.initializers.map { context.genUniqueEntityName(it) }

    return listOf(
        EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(
                    EOBndExpr(
                        EOCopy(
                            "*",
                            initNames.map { it.eoDot() }
                        ),
                        "@"
                    )
                )
            ),
            name
        )
    ) + initializerArray.initializers.mapIndexed{ idx, it -> mapInitializer(it, initNames[idx], context) }.flatten()
}
