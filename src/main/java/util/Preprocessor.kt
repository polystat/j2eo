package util

import translator.mapExpression
import translator.mapStatement
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.CompoundName
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Expression.Expression
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import tree.Statement.BlockStatement
import tree.Statement.StatementExpression
import java.util.ArrayList


fun preprocessCompoundNames(compoundName: CompoundName, classNames: HashMap<String, String>) {
    if (compoundName.names.size > 0 &&
        compoundName.names.first() != "this" &&
        classNames[compoundName.names.first()] == null) {
        compoundName.names.add(0, "this")
    }
    compoundName.names
        .replaceAll { if (classNames[it] != null) classNames[it] else it }
}

fun preprocessClsDec(clsDec: NormalClassDeclaration, classNames: HashMap<String, String>){
    if (classNames[clsDec.name] == null) {
        classNames[clsDec.name] = "class__${clsDec.name}"
    }

    clsDec.name = classNames[clsDec.name]
    try {
        clsDec.body.declarations
            .filterIsInstance<NormalClassDeclaration>()
            .map { innerClsDec: NormalClassDeclaration ->  preprocessClsDec(innerClsDec, classNames) }
        clsDec.body.declarations
            .filterIsInstance<MethodDeclaration>()
            .mapNotNull { methodDeclaration: MethodDeclaration -> try {
                    methodDeclaration.methodBody.block.blockStatements
                    } catch (e: NullPointerException) {null}
                }
            .map {
                blockStatements: ArrayList<BlockStatement> ->  blockStatements
                .mapNotNull {
                    if (it.statement != null && it.statement is StatementExpression)
                        (it.statement as StatementExpression).expression
                    else
                        null
                }
                .mapNotNull {
                    if (it is MethodInvocation) { if (it.qualifier != null) it.qualifier else null } else null
                }
                .map {
                    preprocessCompoundNames((it as SimpleReference).compoundName, classNames)
                }
            }
    } catch (e: NullPointerException) { /*Ignore it*/ }
}

fun preprocessUnit(unit: SimpleCompilationUnit) {
    var classNames = HashMap<String, String>().also {
        it["System"] = "class__System"
    }

    unit.components.components
        .mapNotNull { component: TopLevelComponent -> component.classDecl }
        .filterIsInstance<NormalClassDeclaration>()
        .map { clsDec: NormalClassDeclaration ->  preprocessClsDec(clsDec, classNames)}
}
