package translator

import eotree.EOObject
import tree.CompoundName
import tree.Expression.SimpleReference
import tree.Initializer
import tree.InitializerSimple
import util.ParseExprTasks

fun mapInitializer(parseExprTasks: ParseExprTasks, initializer: Initializer): EOObject {
    return when (initializer) {
        is InitializerSimple -> mapInitializerSimple(parseExprTasks, initializer)
        else ->
            mapInitializerSimple(parseExprTasks, InitializerSimple(SimpleReference(CompoundName("array_initializer_placeholder")))) // FIXME
            // throw IllegalArgumentException("Initializer of type ${initializer.javaClass.simpleName} is not supported")
    }
}

fun mapInitializerSimple(parseExprTasks: ParseExprTasks, initializerSimple: InitializerSimple): EOObject {
    return mapExpression(parseExprTasks, initializerSimple.expression)
}
