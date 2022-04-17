package parser

import lexer.Token
import lexer.TokenCode
import parser.JavaParser.*
import tree.Annotations
import tree.Compilation.*
import tree.CompoundName
import tree.Declaration.ClassDeclaration
import tree.Declaration.ImportDeclaration
import tree.Declaration.ImportDeclarations
import tree.Declaration.NormalClassDeclaration
import tree.Type.*

fun CompilationUnitContext.toCompilationUnit() : CompilationUnit =
    SimpleCompilationUnit(
        ImportDeclarations(ArrayList(importDeclaration().map { it.toImportDeclaration() })),
        TopLevelComponents(ArrayList(typeDeclaration().map { it.toTopLevelComponent() }))
    )

fun TypeDeclarationContext.toTopLevelComponent() : TopLevelComponent =
    if (classDeclaration() != null) {
        TopLevelComponent(classDeclaration().toClassDeclaration())
    } else {
        throw java.lang.Exception("Cannot translate") // FIXME
    }

fun ClassDeclarationContext.toClassDeclaration() : ClassDeclaration =
    NormalClassDeclaration(
        this.identifier().toToken(),
        this.typeParameters()?.toTypeParameters(),
        this.typeType()?.toType(),
        null,
        null
    )

fun TypeParametersContext.toTypeParameters() : TypeParameters =
    TypeParameters(ArrayList(this.typeParameter().map { it.toTypeParameter()}))

fun TypeParameterContext.toTypeParameter() : TypeParameter =
    TypeParameter(null, TypeParameterTail(this.identifier().toToken(), null))

fun TypeListContext.toTypeList() : TypeList =
    TypeList(ArrayList(this.typeType().map { it.toType() }))

fun TypeTypeContext.toType() : Type =
    when (this) {
        is TypeClassOrInterfaceTypeContext -> this.toType()
        else -> throw Exception("cannot convert type") // FIXME
    }
fun TypeClassOrInterfaceTypeContext.toType() : Type =
    this.classOrInterfaceType().toType()

fun ClassOrInterfaceTypeContext.toType() : Type =
    TypeName(
        CompoundName(this.identifier().map { it.text }),
        this.typeArguments().last().toTypeArguments()   // FIXME: we use last() since we do not support types like A<B>.C<D>
    )

fun TypeArgumentsContext.toTypeArguments() : TypeArguments =
    TypeArguments(ArrayList(typeArgument().map { it.toTypeArgument() }))

fun TypeArgumentContext.toTypeArgument() : TypeArgument =
    TypeArgument(this.typeType().toType(), 0 /* FIXME */, null)

fun IdentifierContext.toToken() : Token = Token(TokenCode.Identifier, this.text)

fun QualifiedNameContext.toCompoundName(): CompoundName =
    CompoundName(identifier().map { it.text })

fun PackageDeclarationContext.toPackage(): Package =
    Package(
        qualifiedName().toCompoundName(),
        null,
        null,
    )

//fun ExpressionContext.toExpression(): Expression =
//    when (this) {
//
//    }

fun ImportDeclarationContext.toImportDeclaration(): ImportDeclaration =
    ImportDeclaration(
        STATIC()?.text == "static",
        qualifiedName().toCompoundName(),
        false
    )