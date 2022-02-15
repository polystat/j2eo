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

class Preprocessor {

    private val classNames = HashMap<String, String>().also {
        it["System"] = "class__System"
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

    private fun preprocessSimpleCompilationUnit(unit: SimpleCompilationUnit) {
        fun findClassDeclaration(clsDec: NormalClassDeclaration) {
            if (classNames[clsDec.name] == null) {
                classNames[clsDec.name] = "class__${clsDec.name}"
            }

            if (clsDec.extendedType is TypeName) {
                (clsDec.extendedType as TypeName).compoundName.names
                    .map {
                        if (classNames[it] == null) {
                            classNames[it] = "class__$it"
                        }
                    }
                (clsDec.extendedType as TypeName).compoundName.names
                    .replaceAll { if (classNames[it] != null) classNames[it] else it }
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

    private fun preprocessTopLevelComponent(component: TopLevelComponent) {
        if (component.classDecl != null) {
            preprocessClassDecl(component.classDecl)
        } else if (component.interfaceDecl != null) {
            /* To discuss */
        } else {
            throw IllegalArgumentException("Preprocessor: Supplied TopLevelComponent does not have neither class nor interface")
        }
    }

    private fun preprocessClassDecl(clsDec: ClassDeclaration) {
        require(clsDec is NormalClassDeclaration) {
            (
                "Preprocessor: Only NormalClassDeclaration is supported, but " +
                    clsDec.javaClass.simpleName +
                    " was passed"
                )
        }

        clsDec.name = classNames[clsDec.name]

        try {
            clsDec.body.declarations
                .map { decl: Declaration -> preprocessDecl(decl) }
        } catch (e: NullPointerException) { /* Ignore it */ }
    }

    private fun preprocessMethodDecl(methodDecl: MethodDeclaration) {
        try {
            methodDecl.methodBody.block.blockStatements
                .map { blockStmt: BlockStatement -> preprocessBlockStmt(blockStmt) }
        } catch (e: NullPointerException) { /* Ignore it */ }
    }

    private fun preprocessBlockStmt(blockStmt: BlockStatement) {
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

    private fun preprocessDecl(decl: Declaration) {
        when (decl) {
            is ClassDeclaration -> preprocessClassDecl(decl)
            is VariableDeclaration -> preprocessVarDecl(decl)
            is MethodDeclaration -> preprocessMethodDecl(decl)
        }
    }

    private fun preprocessStmt(stmt: Statement) {
        when (stmt) {
            is BlockStatement -> preprocessBlockStmt(stmt)
            is StatementExpression -> preprocessStmtExpr(stmt)
        }
    }

    private fun preprocessVarDecl(varDecl: VariableDeclaration) {
        when (varDecl.initializer) {
            is InitializerSimple -> preprocessSimpleInitializer(varDecl.initializer as InitializerSimple)
        }
    }

    private fun preprocessSimpleInitializer(initializer: InitializerSimple) {
        preprocessExpr(initializer.expression)
    }

    private fun preprocessStmtExpr(stmExpr: StatementExpression) {
        preprocessExpr(stmExpr.expression)
    }

    private fun preprocessExpr(expr: Expression) {
        when (expr) {
            is MethodInvocation -> preprocessMethodInvocation(expr)
        }
    }

    private fun preprocessMethodInvocation(methodInvocation: MethodInvocation) {
        when (methodInvocation.qualifier) {
            is SimpleReference -> preprocessSimpleReference(methodInvocation.qualifier as SimpleReference)
        }
    }

    private fun preprocessSimpleReference(ref: SimpleReference) {
        preprocessCompoundName(ref.compoundName)
    }

    private fun preprocessCompoundName(compoundName: CompoundName) {
        if (compoundName.names.size == 1 &&
            classNames[compoundName.names.first()] == null
        ) {
            compoundName.names.add(0, "^")
        }

        compoundName.names
            .replaceAll { if (classNames[it] != null) classNames[it] else it }
    }

}