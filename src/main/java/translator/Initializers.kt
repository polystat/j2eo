package translator

import eotree.EOExpr
import tree.Initializer
import tree.InitializerSimple

fun mapInitializer(initializer: Initializer): EOExpr {
    return when (initializer) {
        is InitializerSimple -> mapInitializerSimple(initializer)
        else ->
            throw IllegalArgumentException("Initializer of type ${initializer.javaClass.simpleName} is not supported")
    }
}

fun mapInitializerSimple(initializerSimple: InitializerSimple): EOExpr {
    return mapExpression(initializerSimple.expression)
}
