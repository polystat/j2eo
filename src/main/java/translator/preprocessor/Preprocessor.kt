package translator.preprocessor

import tree.Compilation.CompilationUnit
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.CompoundName
import tree.Declaration.ClassDeclaration
import tree.Declaration.Declaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Declaration.VariableDeclaration
import tree.Expression.Expression
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import tree.InitializerSimple
import tree.Statement.BlockStatement
import tree.Statement.Statement
import tree.Statement.StatementExpression
import tree.Type.TypeName

class ClassNames {
    companion object {
        val classNames = HashMap<String, String>().also {
            it["System"] = "class__System"
        }
    }
}

fun preprocess(unit: CompilationUnit) {
    if (unit is SimpleCompilationUnit) {
        preprocessSimpleCompilationUnit(unit)
    } else {
        throw IllegalArgumentException(
            "CompilationUnit of type " +
                unit.javaClass.simpleName +
                " cannot be preprocessed"
        )
    }
}

fun preprocessSimpleCompilationUnit(unit: SimpleCompilationUnit) {
    fun findClassDeclaration(clsDec: NormalClassDeclaration) {
        if (ClassNames.classNames[clsDec.name] == null) {
            ClassNames.classNames[clsDec.name] = "class__${clsDec.name}"
        }

        if (clsDec.extendedType is TypeName) {
            (clsDec.extendedType as TypeName).compoundName.names
                .map {
                    if (ClassNames.classNames[it] == null) {
                        ClassNames.classNames[it] = "class__$it"
                    }
                }
            (clsDec.extendedType as TypeName).compoundName.names
                .replaceAll { if (ClassNames.classNames[it] != null) ClassNames.classNames[it] else it }
        }

        try {
            clsDec.body.declarations
                .filterIsInstance<NormalClassDeclaration>()
                .map { innerClsDec: NormalClassDeclaration -> findClassDeclaration(innerClsDec) }
        } catch (e: NullPointerException) { /*Ignore it*/ }
    }

    fun collectClassNames(unit: SimpleCompilationUnit) {
        unit.components.components
            .mapNotNull { component: TopLevelComponent -> component.classDecl }
            .filterIsInstance<NormalClassDeclaration>()
            .map { clsDec: NormalClassDeclaration -> findClassDeclaration(clsDec) }
    }

    collectClassNames(unit)

    unit.components.components
        .map { component: TopLevelComponent? -> preprocessTopLevelComponent(component!!) }
}

fun preprocessTopLevelComponent(component: TopLevelComponent) {
    if (component.classDecl != null) {
        preprocessClassDecl(component.classDecl)
    } else if (component.interfaceDecl != null) {
        /* To discuss */
    } else {
        throw IllegalArgumentException("Preprocessor: Supplied TopLevelComponent does not have neither class nor interface")
    }
}

fun preprocessClassDecl(clsDec: ClassDeclaration) {
    require(clsDec is NormalClassDeclaration) {
        (
            "Preprocessor: Only NormalClassDeclaration is supported, but " +
                clsDec.javaClass.simpleName +
                " was passed"
            )
    }

    clsDec.name = ClassNames.classNames[clsDec.name]

    try {
        clsDec.body.declarations
            .map { decl: Declaration -> preprocessDecl(decl) }
    } catch (e: NullPointerException) { /* Ignore it */ }
}

fun preprocessMethodDecl(methodDecl: MethodDeclaration) {
    try {
        methodDecl.methodBody.block.blockStatements
            .map { blockStmt: BlockStatement -> preprocessBlockStmt(blockStmt) }
    } catch (e: NullPointerException) { /* Ignore it */ }
}

fun preprocessBlockStmt(blockStmt: BlockStatement) {
    if (blockStmt.declaration != null) {
        preprocessDecl(blockStmt.declaration)
    }
    if (blockStmt.statement != null) {
        preprocessStmt(blockStmt.statement)
    }
    if (blockStmt.expression != null) {
        preprocessExpr(blockStmt.expression)
    }
}

fun preprocessDecl(decl: Declaration) {
    when (decl) {
        is ClassDeclaration -> preprocessClassDecl(decl)
        is VariableDeclaration -> preprocessVarDecl(decl)
        is MethodDeclaration -> preprocessMethodDecl(decl)
    }
}

fun preprocessStmt(stmt: Statement) {
    when (stmt) {
        is BlockStatement -> preprocessBlockStmt(stmt)
        is StatementExpression -> preprocessStmtExpr(stmt)
    }
}

fun preprocessVarDecl(varDecl: VariableDeclaration) {
    when (varDecl.initializer) {
        is InitializerSimple -> preprocessSimpleInitializer(varDecl.initializer as InitializerSimple)
    }
}

fun preprocessSimpleInitializer(initializer: InitializerSimple) {
    preprocessExpr(initializer.expression)
}

fun preprocessStmtExpr(stmExpr: StatementExpression) {
    preprocessExpr(stmExpr.expression)
}

fun preprocessExpr(expr: Expression) {
    when (expr) {
        is MethodInvocation -> preprocessMethodInvocation(expr)
    }
}

fun preprocessMethodInvocation(methodInvocation: MethodInvocation) {
    when (methodInvocation.qualifier) {
        is SimpleReference -> preprocessSimpleReference(methodInvocation.qualifier as SimpleReference)
    }
}

fun preprocessSimpleReference(ref: SimpleReference) {
    preprocessCompoundName(ref.compoundName)
}

fun preprocessCompoundName(compoundName: CompoundName) {
    if (compoundName.names.size == 1 &&
        ClassNames.classNames[compoundName.names.first()] == null
    ) {
        compoundName.names.add(0, "^")
    }

    compoundName.names
        .replaceAll { if (ClassNames.classNames[it] != null) ClassNames.classNames[it] else it }
}
