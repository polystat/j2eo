package util

import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.Declaration.Declaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration

fun containsMain(component: TopLevelComponent): Boolean {
    return if (component.classDecl != null) {
        (component.classDecl as NormalClassDeclaration).body.declarations
            .filterIsInstance<MethodDeclaration>()
            .find { declaration: Declaration? ->
                try {
                    (declaration as MethodDeclaration).parameters.parameters.size == 1 &&
                        declaration.parameters.parameters[0].name == "args" &&
                        declaration.name == "main"
                } catch (e: NullPointerException) { false }
            } != null
    } else {
        false
    }
}

fun findMainClass(unit: SimpleCompilationUnit): String {
    return unit.components.components.find { component: TopLevelComponent -> containsMain(component) }!!.classDecl.name
}
