package util

import lexer.TokenCode
import translator.decodePrimitiveType
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.Declaration.Declaration
import tree.Declaration.MethodDeclaration
import tree.Declaration.NormalClassDeclaration
import tree.Declaration.VariableDeclaration
import tree.Expression.*
import tree.Expression.Primary.Literal
import tree.Expression.Primary.MethodInvocation
import tree.Expression.Primary.Parenthesized
import tree.Initializer
import tree.InitializerArray
import tree.InitializerSimple
import tree.Statement.Assert
import tree.Statement.BlockStatement
import tree.Statement.Statement
import tree.Statement.StatementExpression
import tree.Type.PrimitiveType
import tree.Type.Type
import tree.Type.TypeName

private fun findPrimitivesInMethodInvocation(primitives: HashSet<String>, methodInvocation: MethodInvocation) {
    methodInvocation.arguments?.arguments
        ?.map { findPrimitivesInExpression(primitives, it) }
    if (methodInvocation.qualifier != null) {
        findPrimitivesInExpression(primitives, methodInvocation.qualifier)
    }
}

private fun decodeLiteralCode(code: TokenCode): TokenCodes? {
    return when (code) {
        TokenCode.IntegerLiteral -> TokenCodes.PRIM__INT
        TokenCode.FloatingLiteral -> TokenCodes.PRIM__FLOAT
        TokenCode.StringLiteral -> TokenCodes.CLASS__STRING
        TokenCode.False -> TokenCodes.PRIM__BOOLEAN
        TokenCode.True -> TokenCodes.PRIM__BOOLEAN
        else -> null
    }
}

private fun findPrimitivesInLiteral(primitives: HashSet<String>, literal: Literal) {
    val primitiveType = decodeLiteralCode(literal.code)
    if (primitiveType != null) {
        primitives.add(primitiveType.importPath)
    }
}

private fun findPrimitivesInSimpleReference(primitives: HashSet<String>, simpleReference: SimpleReference) {
    simpleReference.compoundName.names
        .map {
            run {
                if (it.equals("String")) {
                    primitives.add(TokenCodes.CLASS__STRING.importPath)
                }
            }
        }
}

private fun findPrimitivesInType(primitives: HashSet<String>, type: Type) {
    when (type) {
        is PrimitiveType -> primitives.add(decodePrimitiveType(type).importPath)
        is TypeName -> {
            if (type.compoundName.names.size == 1 &&
                type.compoundName.names.last().equals("String")
            ) {
                primitives.add(TokenCodes.CLASS__STRING.importPath)
            }
        }
    }
}

private fun findPrimitivesInCastExpr(primitives: HashSet<String>, cast: Cast) {
    cast.types.types
        .map { findPrimitivesInType(primitives, it) }
    findPrimitivesInExpression(primitives, cast.expression)
}

private fun findPrimitivesInExpression(primitives: HashSet<String>, expr: Expression) {
    when (expr) {
        is MethodInvocation -> findPrimitivesInMethodInvocation(primitives, expr)
        is Literal -> findPrimitivesInLiteral(primitives, expr)
        is SimpleReference -> findPrimitivesInSimpleReference(primitives, expr)
        is Cast -> findPrimitivesInCastExpr(primitives, expr)
        is Binary -> findPrimitivesInExpression(primitives, expr.right)
        is Parenthesized -> findPrimitivesInExpression(primitives, expr.expression)
        is UnaryPrefix -> findPrimitivesInExpression(primitives, expr.operand)
        is UnaryPostfix -> findPrimitivesInExpression(primitives, expr.operand)
    }
}

private fun findPrimitivesInStatement(primitives: HashSet<String>, stmt: Statement) {
    when (stmt) {
        is StatementExpression -> findPrimitivesInExpression(primitives, stmt.expression)
        is Assert -> {
            findPrimitivesInExpression(primitives, stmt.expression)
            if (stmt.expression2 != null) {
                findPrimitivesInExpression(primitives, stmt.expression2)
            }
        }
    }
}

private fun findPrimitivesInBlockStmt(primitives: HashSet<String>, stmt: BlockStatement) {
    if (stmt.declaration != null) {
        findPrimitivesInDeclaration(primitives, stmt.declaration)
    } else if (stmt.expression != null) {
        findPrimitivesInExpression(primitives, stmt.expression)
    } else if (stmt.statement != null) {
        findPrimitivesInStatement(primitives, stmt.statement)
    }
}

private fun findPrimitivesInMethod(primitives: HashSet<String>, methodDecl: MethodDeclaration) {
    methodDecl.methodBody?.block?.blockStatements
        ?.map { findPrimitivesInBlockStmt(primitives, it) }
}

private fun findPrimitivesInInitializer(primitives: HashSet<String>, initializer: Initializer) {
    when (initializer) {
        is InitializerSimple -> findPrimitivesInExpression(primitives, initializer.expression)
        is InitializerArray -> initializer.initializers
            .map { findPrimitivesInInitializer(primitives, it) }
    }
}

private fun findPrimitivesInVarDeclaration(primitives: HashSet<String>, dec: VariableDeclaration) {
    if (dec.type is PrimitiveType) {
        primitives.add(decodePrimitiveType(dec.type as PrimitiveType).importPath)
    } else if (dec.type is TypeName &&
        (dec.type as TypeName).compoundName.names.size == 1 &&
        (dec.type as TypeName).compoundName.names.last().equals("String")
    ) {
        primitives.add(TokenCodes.CLASS__STRING.importPath)
    }
    if (dec.initializer != null) {
        findPrimitivesInInitializer(primitives, dec.initializer)
    } else
        logger.warn { "findPrimitivesInVarDeclaration: dec.initializer must not be null" }
}

private fun findPrimitivesInClass(primitives: HashSet<String>, clsDec: NormalClassDeclaration) {
    clsDec.body?.declarations
        ?.map { findPrimitivesInDeclaration(primitives, it) }
}

private fun findPrimitivesInDeclaration(primitives: HashSet<String>, dec: Declaration) {
    when (dec) {
        is NormalClassDeclaration -> findPrimitivesInClass(primitives, dec)
        is VariableDeclaration -> findPrimitivesInVarDeclaration(primitives, dec)
        is MethodDeclaration -> findPrimitivesInMethod(primitives, dec)
    }
}

fun collectPrimitivePackages(primitives: HashSet<String>, unit: SimpleCompilationUnit) {
    unit.components.components
        .mapNotNull { component: TopLevelComponent -> component.classDecl }
        .filterIsInstance<NormalClassDeclaration>()
        .map { findPrimitivesInDeclaration(primitives, it) }
}

