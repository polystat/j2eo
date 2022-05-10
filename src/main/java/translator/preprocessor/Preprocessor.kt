package translator.preprocessor

import lexer.TokenCode
import tree.Compilation.CompilationUnit
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.CompoundName
import tree.Declaration.*
import tree.Expression.Expression
import tree.Expression.Primary.FieldAccess
import tree.Expression.Primary.InstanceCreation
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference
import tree.InitializerSimple
import tree.Statement.BlockStatement
import tree.Statement.Statement
import tree.Statement.StatementExpression
import tree.Type.PrimitiveType
import tree.Type.Type
import tree.Type.TypeName
import util.TokenCodes
import util.collectPrimitivePackages
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

/**
 * @property classNames
 * @property stdTokensNeededForAlias
 * @property stdTokensForCurrentAlias
 */
data class PreprocessorState(
        val classNames: HashMap<String, String> = hashMapOf(
            "Object" to TokenCodes.CLASS__OBJECT.value,
            "System" to TokenCodes.CLASS__SYSTEM.value,
        ),
        val stdTokensNeededForAlias: HashSet<String> = hashSetOf(
            TokenCodes.CLASS__OBJECT.value,
            TokenCodes.CLASS__SYSTEM.value,
            TokenCodes.PRIM__INT.value,
            TokenCodes.PRIM__FLOAT.value,
            TokenCodes.PRIM__BOOLEAN.value,
            TokenCodes.CLASS__STRING.value,
            TokenCodes.EO_CAGE.value,
            TokenCodes.PRIM__LONG.value,
            TokenCodes.PRIM__BYTE.value,
            TokenCodes.PRIM__CHAR.value,
            TokenCodes.PRIM__DOUBLE.value,
            TokenCodes.PRIM__SHORT.value
        ),
        val stdTokensForCurrentAlias: HashSet<String> = hashSetOf(
            TokenCodes.CLASS__OBJECT.importPath  // We need it always
        ),
        val eoClassesForCurrentAlias: HashSet<String> = hashSetOf()
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
                    .replaceAll { str: String ->
                        state.classNames[str]?.let {
                            state.classNames[str]
                        } ?: run {
                            str
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
    collectPrimitivePackages(state.stdTokensForCurrentAlias, unit)

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
        when (methodDecl.type) {
            is PrimitiveType ->
            {
                tryAddClassForAliases(
                        state, convertPrimTokenCode((methodDecl.type as PrimitiveType).typeCode)
                )
            }
            else -> {}
        }
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
    when (varDecl.type) {
        is TypeName -> tryAddClassForAliases(state, TokenCodes.EO_CAGE.value, false)
        else -> {}
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
        is SimpleReference -> preprocessSimpleReference(state, expr)
        is MethodInvocation -> preprocessMethodInvocation(state, expr)
        is InstanceCreation -> preprocessInstanceCreation(state, expr)
        else -> {
            // this is a generated else block
        }
    }
}

private fun preprocessInstanceCreation(state: PreprocessorState, instanceCreation: InstanceCreation) {
    preprocessType(state, instanceCreation.ctorType)
    instanceCreation.args.arguments.forEach { preprocessExpr(state, it) }
    instanceCreation.classBody.declarations.forEach { preprocessDecl(state, it) }
}

private fun preprocessType(state: PreprocessorState, type: Type) {
    when (type) {
        is TypeName -> preprocessCompoundName(state, type.compoundName)
        else -> {}
    }
}

private fun preprocessMethodInvocation(state: PreprocessorState, methodInvocation: MethodInvocation) {
    when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference -> preprocessSimpleReference(state, methodQualifier)
        is FieldAccess -> {
            preprocessExpr(state, methodQualifier.expression)
            preprocessCompoundName(state, CompoundName(methodQualifier.identifier))
        }
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

private fun tryAddClassForAliases(state: PreprocessorState, className: String, forStdLib: Boolean = true) {
    if (state.stdTokensNeededForAlias.contains(className)) {
        if (forStdLib) {
            state.stdTokensForCurrentAlias.add(className)
        } else {
            state.eoClassesForCurrentAlias.add(className)
        }
    }
}

/**
 * Converts token code name of type to the stdlib EO class.
 * Example: TokenCode.Int -> 'prim__int'
 *
 * @param tokenCode the token code of primitive type
 */
private fun convertPrimTokenCode(tokenCode: TokenCode) : String {
    return "prim__${tokenCode.name.lowercase(Locale.getDefault())}"
}
