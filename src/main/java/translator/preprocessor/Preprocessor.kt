package translator.preprocessor

import lexer.Token
import lexer.TokenCode
import tree.Compilation.CompilationUnit
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.CompoundName
import tree.Declaration.*
import tree.Expression.ArgumentList
import tree.Expression.Cast
import tree.Expression.Expression
import tree.Expression.Primary.FieldAccess
import tree.Expression.Primary.InstanceCreation
import tree.Expression.Primary.MethodInvocation
import tree.Expression.Primary.Parenthesized
import tree.Expression.Primary.This
import tree.Expression.SimpleReference
import tree.Initializer
import tree.InitializerArray
import tree.InitializerSimple
import tree.Statement.*
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
 * @property tokensNeededForAlias
 * @property stdTokensForCurrentAlias
 */
data class PreprocessorState(
        val classNames: HashMap<String, String> = hashMapOf(
            "Object" to TokenCodes.CLASS__OBJECT.value,
            "System" to TokenCodes.CLASS__SYSTEM.value,
            "String" to TokenCodes.CLASS__STRING.value,
            "Random" to TokenCodes.CLASS__RANDOM.value
        ),
        val tokensNeededForAlias: HashSet<String> = hashSetOf(
            TokenCodes.CLASS__OBJECT.value,
            TokenCodes.CLASS__SYSTEM.value,
            TokenCodes.CLASS__RANDOM.value,
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
        val tokensToImportPath: Map<String, String> = TokenCodes.values()
            .associate { it.value to it.importPath },
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

private fun findClassDecl(state: PreprocessorState, decl: Declaration) {
    when (decl) {
        is NormalClassDeclaration -> findClassDeclInClass(state, decl)
        is MethodDeclaration -> findClassDeclInMethod(state, decl)
        is VariableDeclaration -> findClassDeclInVar(state, decl)
    }
}

private fun findClassDeclInMethod(state: PreprocessorState, decl: MethodDeclaration) {
    decl.methodBody?.block?.blockStatements
        ?.mapNotNull { it.declaration }
        ?.map { findClassDecl(state, it) }
}

private fun findClassDeclInVar(state: PreprocessorState, decl: VariableDeclaration) {
    val initializer = decl.initializer

    if (initializer is InitializerSimple) {
        findClassDeclInInit(state, initializer)
    }

    if (initializer is InitializerArray) {
        initializer.initializers
            .filterIsInstance<InitializerSimple>()
            .map { findClassDeclInInit(state, it) }
    }
}

private fun findClassDeclInInit(state: PreprocessorState, initializer: InitializerSimple) {
    val expr = initializer.expression
    if (expr is InstanceCreation) {
        val ctorType = expr.ctorType

        if (ctorType is TypeName) {
            ctorType.compoundName.names
                .map {
                    state.classNames[it] ?: run {
                        state.classNames[it] = "class__$it"
                        tryAddClassForAliases(state, "class__$it")
                    }
                }
        }

        expr.classBody?.declarations
            ?.map { findClassDecl(state, it) }
    }
}

private fun findClassDeclInClass(state: PreprocessorState, clsDec: NormalClassDeclaration) {
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

    clsDec.body?.declarations
        ?.map { findClassDecl(state, it) }
}

private fun collectClassNames(state: PreprocessorState, unit: SimpleCompilationUnit) {
    unit.components?.components
        ?.mapNotNull { component: TopLevelComponent -> component.classDecl }
        ?.map { findClassDecl(state, it) }
}

private fun preprocessSimpleCompilationUnit(state: PreprocessorState, unit: SimpleCompilationUnit) {
    collectClassNames(state, unit)
    collectPrimitivePackages(state.stdTokensForCurrentAlias, unit)

    unit.imports?.imports
        ?.map { preprocessImportDeclaration(state, it) }

    unit.components.components
            .map { component: TopLevelComponent? -> preprocessTopLevelComponent(state, component!!) }
}

private fun preprocessImportDeclaration(state: PreprocessorState, importDecl: ImportDeclaration) {
    if (importDecl.compoundName.names.size == 0) {
        return
    }

    if (importDecl.compoundName.names[0].equals("java")) {
        importDecl.compoundName.names[0] = "stdlib"
    }

    val checkEntity = if (!importDecl.signStatic) {
        importDecl.compoundName.names.last()
    } else {
        importDecl.compoundName.names[importDecl.compoundName.names.size - 2] // Always works, no static without class
    }

    state.classNames[checkEntity] ?: run { state.classNames[checkEntity] = "class__$checkEntity" }

    importDecl.compoundName.names
        .replaceAll { str: String ->
            state.classNames[str]?.let {
                state.classNames[str]
            } ?: run {
                str
            }
        }
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

    clsDec.name = state.classNames[clsDec.name] ?: clsDec.name

    try {
        clsDec.body.declarations
                .map { decl: Declaration -> preprocessDecl(state, decl) }
    } catch (e: NullPointerException) {
        /* Ignore it */
    }
    tryToAddConstructor(clsDec)
}

private fun tryToAddConstructor(clsDec: NormalClassDeclaration) {
    if (clsDec.body?.declarations?.find { it is ConstructorDeclaration } == null) {
        val argList = ArgumentList(null)
        argList.arguments = ArrayList()
        val genConstDecl = ConstructorDeclaration(
            null, null, null, null, null,
            Block(
                ArrayList(),
                BlockStatements(
                    BlockStatement(
                        StatementExpression(
                            ArrayList(),
                            MethodInvocation(
                                null, true, null, Token(TokenCode.Super, "super"), argList
                            )
                        )
                    )
                )
            )
        )
        if (clsDec.body != null) {
            clsDec.body.add(genConstDecl)
        } else {
            clsDec.body = Declarations(genConstDecl)
        }
    }
}

private fun preprocessMethodDecl(state: PreprocessorState, methodDecl: MethodDeclaration) {
    try {
        preprocessBlock(state, methodDecl.methodBody)
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

private fun preprocessBlock(state: PreprocessorState, block: Block) {
    block.block?.blockStatements
        ?.map { blockStmt: BlockStatement -> preprocessBlockStmt(state, blockStmt) }
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
        is Block -> preprocessBlock(state, stmt)
        is BlockStatement -> preprocessBlockStmt(state, stmt)
        is StatementExpression -> preprocessStmtExpr(state, stmt)
        is Assert -> {
            preprocessExpr(state, stmt.expression)
            if (stmt.expression2 != null) {
                preprocessExpr(state, stmt.expression2)
            }
        }
        is IfThenElse -> {
            preprocessStmt(state, stmt.thenPart)
            preprocessStmt(state, stmt.elsePart)
        }
        is While -> {
            preprocessExpr(state, stmt.condition)
            preprocessStmt(state, stmt.statement)
        }
        is Do -> {
            preprocessExpr(state, stmt.condition)
            preprocessStmt(state, stmt.statement)
        }
        else -> {
            // this is a generated else block
        }
    }
}

private fun preprocessVarDecl(state: PreprocessorState, varDecl: VariableDeclaration) {
    if (varDecl.initializer != null) {
        preprocessInitializer(state, varDecl.initializer)
    }
    when (varDecl.type) {
        is TypeName -> {
            preprocessType(state, varDecl.type)
            tryAddClassForAliases(state, TokenCodes.EO_CAGE.value, false)
        }
        is PrimitiveType -> {
            if ((varDecl.type as PrimitiveType).dimensions.dimensions.isNotEmpty()) {
                tryAddClassForAliases(state, TokenCodes.EO_CAGE.value, false)
            }
        }
        else -> {}
    }
}

private fun preprocessInitializer(state: PreprocessorState, initializer: Initializer) {
    when (initializer) {
        is InitializerSimple -> preprocessSimpleInitializer(state, initializer)
        is InitializerArray -> initializer.initializers
            .map { preprocessInitializer(state, it) }
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
        is SimpleReference -> preprocessSimpleReference(state, expr)
        is MethodInvocation -> preprocessMethodInvocation(state, expr)
        is InstanceCreation -> preprocessInstanceCreation(state, expr)
        is Cast -> preprocessCastExpr(state, expr)
        is Parenthesized -> preprocessExpr(state, expr.expression)
        is FieldAccess -> {
            preprocessExpr(state, expr.expression)
            preprocessCompoundName(state, CompoundName(expr.identifier))
            expr.identifier = state.classNames[expr.identifier] ?: expr.identifier
        }
        else -> {
            // this is a generated else block
        }
    }
}

private fun preprocessCastExpr(state: PreprocessorState, cast: Cast) {
    preprocessExpr(state, cast.expression)
    cast.types.types
        .map { preprocessType(state, it) }
}

private fun preprocessInstanceCreation(state: PreprocessorState, instanceCreation: InstanceCreation) {
    preprocessType(state, instanceCreation.ctorType)
    instanceCreation.args.arguments.forEach { preprocessExpr(state, it) }
    instanceCreation.classBody?.declarations?.forEach { preprocessDecl(state, it) }
}

private fun preprocessType(state: PreprocessorState, type: Type) {
    when (type) {
        is TypeName -> preprocessCompoundName(state, type.compoundName)
        else -> {}
    }
}

private fun preprocessMethodInvocation(state: PreprocessorState, methodInvocation: MethodInvocation) {
    methodInvocation.qualifier = methodInvocation.qualifier ?: This(null) /* FIXME: TEMPORARY */

    when (val methodQualifier = methodInvocation.qualifier) {
        is SimpleReference -> preprocessSimpleReference(state, methodQualifier)
        is MethodInvocation -> preprocessMethodInvocation(state, methodQualifier)
        is FieldAccess -> {
            preprocessExpr(state, methodQualifier.expression)
            preprocessCompoundName(state, CompoundName(methodQualifier.identifier))
            methodQualifier.identifier = state.classNames[methodQualifier.identifier] ?: methodQualifier.identifier
        }
    }

    methodInvocation.arguments.arguments
        .map { preprocessExpr(state, it) }
}

private fun preprocessSimpleReference(state: PreprocessorState, ref: SimpleReference) {
    preprocessCompoundName(state, ref.compoundName)
}

private fun preprocessCompoundName(state: PreprocessorState, compoundName: CompoundName) {
//    if (compoundName.names.size == 1 &&
//            state.classNames[compoundName.names.first()] == null
//    ) {
//        compoundName.names.add(0, "^")
//    }

    compoundName.names
            .replaceAll {
                state.classNames[it] ?: it
            }
    tryAddClassForAliases(state, compoundName.names.first())
}

private fun tryAddClassForAliases(state: PreprocessorState, className: String, forStdLib: Boolean = true) {
    if (state.tokensNeededForAlias.contains(className)) {
        if (forStdLib) {
            state.tokensToImportPath[className]?.let { state.stdTokensForCurrentAlias.add(it) }
        } else {
            state.tokensToImportPath[className]?.let { state.eoClassesForCurrentAlias.add(it) }
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
