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
import tree.Statement.BlockStatement
import tree.Statement.Statement
import tree.Statement.StatementExpression
import tree.Type.PrimitiveType
import tree.Type.Type
import tree.Type.TypeName

private fun findPrimitivesInMethodInvocation(primitives: HashSet<String>, methodInvocation: MethodInvocation) {
    methodInvocation.arguments?.arguments
        ?.map { findPrimitivesInExpression(primitives, it) }
}

private fun decodeLiteralCode(code: TokenCode): String? {
    return when(code) {
        TokenCode.IntegerLiteral -> "class__Integer"
        TokenCode.FloatingLiteral -> "class__Float"
        TokenCode.StringLiteral -> "class__String"
        else -> null
    }
}

private fun findPrimitivesInLiteral(primitives: HashSet<String>, literal: Literal) {
    val primitiveType = decodeLiteralCode(literal.code)
    if (primitiveType != null) {
        primitives.add(primitiveType)
    }
}

private fun findPrimitivesInExpression(primitives: HashSet<String>, expr: Expression) {
    when (expr) {
        is MethodInvocation -> findPrimitivesInMethodInvocation(primitives, expr)
        is Literal -> findPrimitivesInLiteral(primitives, expr)
        is Binary -> findPrimitivesInExpression(primitives, expr.right)
        is Parenthesized -> findPrimitivesInExpression(primitives, expr.expression)
    }
}

private fun findPrimitivesInStatement(primitives: HashSet<String>, stmt: Statement) {
    when(stmt) {
        is StatementExpression -> findPrimitivesInExpression(primitives, stmt.expression)
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

private fun findPrimitivesInVarDeclaration(primitives: HashSet<String>, varDeclType: Type) {
    if (varDeclType is PrimitiveType) {
        primitives.add(decodePrimitiveType(varDeclType))
    } else if (varDeclType is TypeName &&
        varDeclType.compoundName.names.size == 1 &&
            varDeclType.compoundName.names.last().equals("String")) {
        primitives.add("class__String")
    }
}

private fun findPrimitivesInClass(primitives: HashSet<String>, clsDec: NormalClassDeclaration) {
    clsDec.body?.declarations
        ?.map { findPrimitivesInDeclaration(primitives, it) }
}

private fun findPrimitivesInDeclaration(primitives: HashSet<String>, dec: Declaration) {
    when (dec) {
        is NormalClassDeclaration -> findPrimitivesInClass(primitives, dec)
        is VariableDeclaration -> findPrimitivesInVarDeclaration(primitives, dec.type)
        is MethodDeclaration -> findPrimitivesInMethod(primitives, dec)
    }
}

fun collectPrimitivePackages(primitives: HashSet<String>, unit: SimpleCompilationUnit) {
    unit.components.components
        .mapNotNull { component: TopLevelComponent -> component.classDecl }
        .filterIsInstance<NormalClassDeclaration>()
        .map { findPrimitivesInDeclaration(primitives, it) }
}

