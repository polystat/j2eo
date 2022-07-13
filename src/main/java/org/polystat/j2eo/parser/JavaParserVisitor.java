// Generated from /home/ilia-milioshin/Desktop/eo/j2eo/grammar/JavaParser.g4 by ANTLR 4.7.2

package org.polystat.j2eo.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link org.polystat.j2eo.parser.JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(org.polystat.j2eo.parser.JavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(org.polystat.j2eo.parser.JavaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(org.polystat.j2eo.parser.JavaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(org.polystat.j2eo.parser.JavaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(org.polystat.j2eo.parser.JavaParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(org.polystat.j2eo.parser.JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(org.polystat.j2eo.parser.JavaParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(org.polystat.j2eo.parser.JavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(org.polystat.j2eo.parser.JavaParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(org.polystat.j2eo.parser.JavaParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(org.polystat.j2eo.parser.JavaParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(org.polystat.j2eo.parser.JavaParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(org.polystat.j2eo.parser.JavaParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(org.polystat.j2eo.parser.JavaParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(org.polystat.j2eo.parser.JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(org.polystat.j2eo.parser.JavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(org.polystat.j2eo.parser.JavaParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(org.polystat.j2eo.parser.JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(org.polystat.j2eo.parser.JavaParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(org.polystat.j2eo.parser.JavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(org.polystat.j2eo.parser.JavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(org.polystat.j2eo.parser.JavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(org.polystat.j2eo.parser.JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(org.polystat.j2eo.parser.JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(org.polystat.j2eo.parser.JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(org.polystat.j2eo.parser.JavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(org.polystat.j2eo.parser.JavaParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(org.polystat.j2eo.parser.JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(org.polystat.j2eo.parser.JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(org.polystat.j2eo.parser.JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCommonBodyDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(org.polystat.j2eo.parser.JavaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(org.polystat.j2eo.parser.JavaParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(org.polystat.j2eo.parser.JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(org.polystat.j2eo.parser.JavaParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(org.polystat.j2eo.parser.JavaParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(org.polystat.j2eo.parser.JavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(org.polystat.j2eo.parser.JavaParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(org.polystat.j2eo.parser.JavaParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(org.polystat.j2eo.parser.JavaParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(org.polystat.j2eo.parser.JavaParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIList(org.polystat.j2eo.parser.JavaParser.LambdaLVTIListContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIParameter(org.polystat.j2eo.parser.JavaParser.LambdaLVTIParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(org.polystat.j2eo.parser.JavaParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(org.polystat.j2eo.parser.JavaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(org.polystat.j2eo.parser.JavaParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(org.polystat.j2eo.parser.JavaParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(org.polystat.j2eo.parser.JavaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(org.polystat.j2eo.parser.JavaParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(org.polystat.j2eo.parser.JavaParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(org.polystat.j2eo.parser.JavaParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(org.polystat.j2eo.parser.JavaParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(org.polystat.j2eo.parser.JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(org.polystat.j2eo.parser.JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(org.polystat.j2eo.parser.JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(org.polystat.j2eo.parser.JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(org.polystat.j2eo.parser.JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(org.polystat.j2eo.parser.JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(org.polystat.j2eo.parser.JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(org.polystat.j2eo.parser.JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(org.polystat.j2eo.parser.JavaParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(org.polystat.j2eo.parser.JavaParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(org.polystat.j2eo.parser.JavaParser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(org.polystat.j2eo.parser.JavaParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(org.polystat.j2eo.parser.JavaParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(org.polystat.j2eo.parser.JavaParser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordHeader(org.polystat.j2eo.parser.JavaParser.RecordHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordComponentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponentList(org.polystat.j2eo.parser.JavaParser.RecordComponentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponent(org.polystat.j2eo.parser.JavaParser.RecordComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordBody(org.polystat.j2eo.parser.JavaParser.RecordBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(org.polystat.j2eo.parser.JavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(org.polystat.j2eo.parser.JavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(org.polystat.j2eo.parser.JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(org.polystat.j2eo.parser.JavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(org.polystat.j2eo.parser.JavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBlockLabel}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlockLabel(org.polystat.j2eo.parser.JavaParser.StatementBlockLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssert}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssert(org.polystat.j2eo.parser.JavaParser.StatementAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(org.polystat.j2eo.parser.JavaParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(org.polystat.j2eo.parser.JavaParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(org.polystat.j2eo.parser.JavaParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(org.polystat.j2eo.parser.JavaParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementTryBlock}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTryBlock(org.polystat.j2eo.parser.JavaParser.StatementTryBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementTryResourceSpecification}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTryResourceSpecification(org.polystat.j2eo.parser.JavaParser.StatementTryResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(org.polystat.j2eo.parser.JavaParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSynchronized}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSynchronized(org.polystat.j2eo.parser.JavaParser.StatementSynchronizedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(org.polystat.j2eo.parser.JavaParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementThrow}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementThrow(org.polystat.j2eo.parser.JavaParser.StatementThrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(org.polystat.j2eo.parser.JavaParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(org.polystat.j2eo.parser.JavaParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementYield}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementYield(org.polystat.j2eo.parser.JavaParser.StatementYieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSemi}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSemi(org.polystat.j2eo.parser.JavaParser.StatementSemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(org.polystat.j2eo.parser.JavaParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitchExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitchExpression(org.polystat.j2eo.parser.JavaParser.StatementSwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIdentifierLabel}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIdentifierLabel(org.polystat.j2eo.parser.JavaParser.StatementIdentifierLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(org.polystat.j2eo.parser.JavaParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(org.polystat.j2eo.parser.JavaParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(org.polystat.j2eo.parser.JavaParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(org.polystat.j2eo.parser.JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(org.polystat.j2eo.parser.JavaParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(org.polystat.j2eo.parser.JavaParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(org.polystat.j2eo.parser.JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(org.polystat.j2eo.parser.JavaParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(org.polystat.j2eo.parser.JavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(org.polystat.j2eo.parser.JavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(org.polystat.j2eo.parser.JavaParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(org.polystat.j2eo.parser.JavaParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(org.polystat.j2eo.parser.JavaParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(org.polystat.j2eo.parser.JavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpresion(org.polystat.j2eo.parser.JavaParser.CastExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(org.polystat.j2eo.parser.JavaParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceCreation}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceCreation(org.polystat.j2eo.parser.JavaParser.InstanceCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpresion(org.polystat.j2eo.parser.JavaParser.PrimaryExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(org.polystat.j2eo.parser.JavaParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(org.polystat.j2eo.parser.JavaParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reference}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(org.polystat.j2eo.parser.JavaParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(org.polystat.j2eo.parser.JavaParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(org.polystat.j2eo.parser.JavaParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(org.polystat.j2eo.parser.JavaParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(org.polystat.j2eo.parser.JavaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(org.polystat.j2eo.parser.JavaParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(org.polystat.j2eo.parser.JavaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceOfExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(org.polystat.j2eo.parser.JavaParser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(org.polystat.j2eo.parser.JavaParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(org.polystat.j2eo.parser.JavaParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(org.polystat.j2eo.parser.JavaParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(org.polystat.j2eo.parser.JavaParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(org.polystat.j2eo.parser.JavaParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpresion(org.polystat.j2eo.parser.JavaParser.ThisExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(org.polystat.j2eo.parser.JavaParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(org.polystat.j2eo.parser.JavaParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpresion(org.polystat.j2eo.parser.JavaParser.IdentifierExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpression(org.polystat.j2eo.parser.JavaParser.ClassExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonWildcardTypeArgumentsExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsExpression(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(org.polystat.j2eo.parser.JavaParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabeledRule(org.polystat.j2eo.parser.JavaParser.SwitchLabeledRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#guardedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedPattern(org.polystat.j2eo.parser.JavaParser.GuardedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchRuleOutcome(org.polystat.j2eo.parser.JavaParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(org.polystat.j2eo.parser.JavaParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(org.polystat.j2eo.parser.JavaParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(org.polystat.j2eo.parser.JavaParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(org.polystat.j2eo.parser.JavaParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(org.polystat.j2eo.parser.JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(org.polystat.j2eo.parser.JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(org.polystat.j2eo.parser.JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(org.polystat.j2eo.parser.JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(org.polystat.j2eo.parser.JavaParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeClassOrInterfaceType}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeClassOrInterfaceType(org.polystat.j2eo.parser.JavaParser.TypeClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typePrimitiveType}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePrimitiveType(org.polystat.j2eo.parser.JavaParser.TypePrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(org.polystat.j2eo.parser.JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(org.polystat.j2eo.parser.JavaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(org.polystat.j2eo.parser.JavaParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(org.polystat.j2eo.parser.JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaParser.ArgumentsContext ctx);
}