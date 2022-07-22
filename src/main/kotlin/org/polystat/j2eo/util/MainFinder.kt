package org.polystat.j2eo.util

import lexer.TokenCode
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.Declaration.Declaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration

fun containsMain(component: TopLevelComponent): Boolean {
    return if (component.classDecl != null) {
        (component.classDecl as NormalClassDeclaration).body?.declarations
            ?.filterIsInstance<MethodDeclaration>()
            ?.find { declaration: Declaration? ->
                (declaration as MethodDeclaration).parameters?.parameters?.size == 1 &&
                    declaration.parameters?.parameters?.get(0)?.name == "args" &&
                    declaration.name == "main" &&
                    declaration.modifiers?.modifiers?.modifiers?.size == 2 &&
                    declaration.modifiers?.modifiers?.modifiers?.find { it == TokenCode.Static } != null &&
                    declaration.modifiers?.modifiers?.modifiers?.find { it == TokenCode.Public } != null
            } != null
    } else {
        false
    }
}

fun findMainClass(unit: SimpleCompilationUnit): String? {
    return unit.components.components.find { component: TopLevelComponent -> containsMain(component) }?.classDecl?.name
}
