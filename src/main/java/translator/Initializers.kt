package translator

import eotree.EOObject
import tree.Initializer
import tree.InitializerSimple

fun mapInitializer(initializer: Initializer): EOObject {
    return when (initializer) {
        is InitializerSimple -> mapInitializerSimple(initializer)
        else ->
            throw IllegalArgumentException("Initializer of type ${initializer.javaClass.simpleName} is not supported")
    }
}

fun mapInitializerSimple(initializerSimple: InitializerSimple): EOObject {
    return mapExpression(initializerSimple.expression)
}
