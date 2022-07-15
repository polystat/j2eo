package org.polystat.j2eo.util

import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.CompoundName
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import tree.Statement.StatementExpression

fun preprocessCompoundName(compoundName: CompoundName, classNames: HashMap<String, String>) {
    if (compoundName.names.size == 1 &&
        classNames[compoundName.names.first()] == null
    ) {
        compoundName.names.add(0, "^")
    }
    compoundName.names
        .replaceAll { if (classNames[it] != null) classNames[it] else it }
}

fun preprocessMethodDeclaration(methodDeclaration: MethodDeclaration, classNames: HashMap<String, String>) {
    try {
        methodDeclaration.methodBody.block.blockStatements
            .mapNotNull { it.statement }
            .mapNotNull { if (it is StatementExpression) it else null }
            .mapNotNull { if (it.expression is MethodInvocation) it.expression as MethodInvocation else null }
            .map {
                if (it.qualifier != null && it.qualifier is SimpleReference)
                    preprocessCompoundName((it.qualifier as SimpleReference).compoundName, classNames)
                else
                    null
            }
    } catch (e: NullPointerException) { /* Do nothing */
    }
}

fun preprocessClsDec(clsDec: NormalClassDeclaration, classNames: HashMap<String, String>) {
    if (classNames[clsDec.name] == null) {
        classNames[clsDec.name] = "class__${clsDec.name}"
    }

    clsDec.name = classNames[clsDec.name]
    try {
        clsDec.body.declarations
            .filterIsInstance<NormalClassDeclaration>()
            .map { innerClsDec: NormalClassDeclaration -> preprocessClsDec(innerClsDec, classNames) }
        clsDec.body.declarations
            .filterIsInstance<MethodDeclaration>()
            .map { methodDeclaration: MethodDeclaration -> preprocessMethodDeclaration(methodDeclaration, classNames) }
    } catch (e: NullPointerException) { /* Ignore it */
    }
}

fun preprocessUnit(unit: SimpleCompilationUnit) {
    var classNames = HashMap<String, String>().also {
        it["System"] = "class__System"
    }

    unit.components.components
        .mapNotNull { component: TopLevelComponent -> component.classDecl }
        .filterIsInstance<NormalClassDeclaration>()
        .map { clsDec: NormalClassDeclaration -> preprocessClsDec(clsDec, classNames) }
}
