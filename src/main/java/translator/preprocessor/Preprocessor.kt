package translator.preprocessor

import tree.Compilation.CompilationUnit
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.CompoundName
import tree.Declaration.*
import tree.Expression.Expression
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import tree.InitializerSimple
import tree.Statement.BlockStatement
import tree.Statement.Statement
import tree.Statement.StatementExpression
import tree.Type.TypeName

/**
 * @property classNames
 * @property stdClassesNeededForAlias
 * @property stdClassesForCurrentAlias
 */
data class PreprocessorState(
        val classNames: HashMap<String, String> = hashMapOf(
            "Object" to "class__Object",
            "System" to "class__System"
        ),
        val stdClassesNeededForAlias: HashSet<String> = hashSetOf(
                "class__Object",
                "class__System",
                "class__Int"
        ),
        val stdClassesForCurrentAlias: HashSet<String> = hashSetOf(
                "class__Object"  // We need it always
        )
)

/**
 * @param state
 * @param unit
 * @throws IllegalArgumentException
 */
fun preprocess(state: PreprocessorState, unit: CompilationUnit) {
    if (unit is SimpleCompilationUnit) {
        preprocessSimpleCompilationUnit(state, unit)
    } else {
        throw IllegalArgumentException(
                "CompilationUnit of type " +
                        unit.javaClass.simpleName +
                        " cannot be preprocessed"
        )
    }
}

private fun preprocessSimpleCompilationUnit(state: PreprocessorState, unit: SimpleCompilationUnit) {
    /**
     * @param clsDec
     */
    fun findClassDeclaration(clsDec: NormalClassDeclaration) {
        state.classNames[clsDec.name] ?: run {
            state.classNames[clsDec.name] = "class__${clsDec.name}"
            tryAddClassForAliases(state, "class__${clsDec.name}")
        }

        if (clsDec.extendedType is TypeName) {
            (clsDec.extendedType as TypeName).compoundName.names
                    .map {
                        state.classNames[it] ?: run {
                            state.classNames[it] = "class__$it"
                            tryAddClassForAliases(state, "class__$it")
                        }
                    }
            (clsDec.extendedType as TypeName).compoundName.names
                    .replaceAll {
                        state.classNames[it]?.let {
                            state.classNames[it]
                        }
                                ?: run {
                                    it
                                }
                    }
        }

        try {
            clsDec.body.declarations
                    .filterIsInstance<NormalClassDeclaration>()
                    .map { innerClsDec: NormalClassDeclaration -> findClassDeclaration(innerClsDec) }
        } catch (e: NullPointerException) {
            /* Ignore it*/
        }
    }

    /**
     * @param unit
     */
    fun collectClassNames(unit: SimpleCompilationUnit) {
        unit.components.components
                .mapNotNull { component: TopLevelComponent -> component.classDecl }
                .filterIsInstance<NormalClassDeclaration>()
                .map { clsDec: NormalClassDeclaration -> findClassDeclaration(clsDec) }
    }

    collectClassNames(unit)

    unit.components.components
            .map { component: TopLevelComponent? -> preprocessTopLevelComponent(state, component!!) }
}

private fun preprocessTopLevelComponent(state: PreprocessorState, component: TopLevelComponent) {
    if (component.classDecl != null) {
        preprocessClassDecl(state, component.classDecl)
    } else component.interfaceDecl?.let {
        /* To discuss */
    }
            ?: run {
                throw IllegalArgumentException("Preprocessor: Supplied TopLevelComponent does not have neither class nor interface")
            }
}

private fun preprocessClassDecl(state: PreprocessorState, clsDec: ClassDeclaration) {
    require(clsDec is NormalClassDeclaration) {
        (
            "Preprocessor: Only NormalClassDeclaration is supported, but " +
                    clsDec.javaClass.simpleName +
                    " was passed"
        )
    }

    clsDec.name = state.classNames[clsDec.name]

    try {
        clsDec.body.declarations
                .map { decl: Declaration -> preprocessDecl(state, decl) }
    } catch (e: NullPointerException) {
        /* Ignore it */
    }
}

private fun preprocessMethodDecl(state: PreprocessorState, methodDecl: MethodDeclaration) {
    try {
        methodDecl.methodBody.block.blockStatements
                .map { blockStmt: BlockStatement -> preprocessBlockStmt(state, blockStmt) }
    } catch (e: NullPointerException) {
        /* Ignore it */
    }
}

private fun preprocessBlockStmt(state: PreprocessorState, blockStmt: BlockStatement) {
    blockStmt.declaration?.let {
        preprocessDecl(state, blockStmt.declaration)
    }
    blockStmt.statement?.let {
        preprocessStmt(state, blockStmt.statement)
    }
    blockStmt.expression?.let {
        preprocessExpr(state, blockStmt.expression)
    }
}

private fun preprocessDecl(state: PreprocessorState, decl: Declaration) {
    when (decl) {
        is ClassDeclaration -> preprocessClassDecl(state, decl)
        is VariableDeclaration -> preprocessVarDecl(state, decl)
        is MethodDeclaration -> preprocessMethodDecl(state, decl)
        else -> {
            // this is a generated else block
        }
    }
}

private fun preprocessStmt(state: PreprocessorState, stmt: Statement) {
    when (stmt) {
        is BlockStatement -> preprocessBlockStmt(state, stmt)
        is StatementExpression -> preprocessStmtExpr(state, stmt)
        else -> {
            // this is a generated else block
        }
    }
}

private fun preprocessVarDecl(state: PreprocessorState, varDecl: VariableDeclaration) {
    when (varDecl.initializer) {
        is InitializerSimple -> preprocessSimpleInitializer(state, varDecl.initializer as InitializerSimple)
        else -> {
            // this is a generated else block
        }
    }
}

private fun preprocessSimpleInitializer(state: PreprocessorState, initializer: InitializerSimple) {
    preprocessExpr(state, initializer.expression)
}

private fun preprocessStmtExpr(state: PreprocessorState, stmExpr: StatementExpression) {
    preprocessExpr(state, stmExpr.expression)
}

private fun preprocessExpr(state: PreprocessorState, expr: Expression) {
    when (expr) {
        is MethodInvocation -> preprocessMethodInvocation(state, expr)
        else -> {
            // this is a generated else block
        }
    }
}

private fun preprocessMethodInvocation(state: PreprocessorState, methodInvocation: MethodInvocation) {
    when (methodInvocation.qualifier) {
        is SimpleReference -> preprocessSimpleReference(state, methodInvocation.qualifier as SimpleReference)
        else -> {
            // this is a generated else block
        }
    }
}

private fun preprocessSimpleReference(state: PreprocessorState, ref: SimpleReference) {
    preprocessCompoundName(state, ref.compoundName)
}

private fun preprocessCompoundName(state: PreprocessorState, compoundName: CompoundName) {
    if (compoundName.names.size == 1 &&
            state.classNames[compoundName.names.first()] == null
    ) {
        compoundName.names.add(0, "^")
    }

    compoundName.names
            .replaceAll {
                state.classNames[it] ?: it
            }
    tryAddClassForAliases(state, compoundName.names.first())
}

private fun tryAddClassForAliases(state: PreprocessorState, className: String) {
    if (state.stdClassesNeededForAlias.contains(className)) {
        state.stdClassesForCurrentAlias.add(className)
    }
}
