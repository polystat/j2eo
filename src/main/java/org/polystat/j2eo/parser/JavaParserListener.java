// Generated from /home/ilia-milioshin/Desktop/eo/j2eo/grammar/JavaParser.g4 by ANTLR 4.7.2

package org.polystat.j2eo.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link org.polystat.j2eo.parser.JavaParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(org.polystat.j2eo.parser.JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(org.polystat.j2eo.parser.JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(org.polystat.j2eo.parser.JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(org.polystat.j2eo.parser.JavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(org.polystat.j2eo.parser.JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(org.polystat.j2eo.parser.JavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(org.polystat.j2eo.parser.JavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(org.polystat.j2eo.parser.JavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(org.polystat.j2eo.parser.JavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(org.polystat.j2eo.parser.JavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(org.polystat.j2eo.parser.JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(org.polystat.j2eo.parser.JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(org.polystat.j2eo.parser.JavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(org.polystat.j2eo.parser.JavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(org.polystat.j2eo.parser.JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(org.polystat.j2eo.parser.JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(org.polystat.j2eo.parser.JavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(org.polystat.j2eo.parser.JavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(org.polystat.j2eo.parser.JavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(org.polystat.j2eo.parser.JavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(org.polystat.j2eo.parser.JavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(org.polystat.j2eo.parser.JavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(org.polystat.j2eo.parser.JavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(org.polystat.j2eo.parser.JavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(org.polystat.j2eo.parser.JavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(org.polystat.j2eo.parser.JavaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(org.polystat.j2eo.parser.JavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(org.polystat.j2eo.parser.JavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(org.polystat.j2eo.parser.JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(org.polystat.j2eo.parser.JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(org.polystat.j2eo.parser.JavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(org.polystat.j2eo.parser.JavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(org.polystat.j2eo.parser.JavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(org.polystat.j2eo.parser.JavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(org.polystat.j2eo.parser.JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(org.polystat.j2eo.parser.JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(org.polystat.j2eo.parser.JavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(org.polystat.j2eo.parser.JavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(org.polystat.j2eo.parser.JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(org.polystat.j2eo.parser.JavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(org.polystat.j2eo.parser.JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(org.polystat.j2eo.parser.JavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(org.polystat.j2eo.parser.JavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(org.polystat.j2eo.parser.JavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(org.polystat.j2eo.parser.JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(org.polystat.j2eo.parser.JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(org.polystat.j2eo.parser.JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(org.polystat.j2eo.parser.JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(org.polystat.j2eo.parser.JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(org.polystat.j2eo.parser.JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(org.polystat.j2eo.parser.JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(org.polystat.j2eo.parser.JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(org.polystat.j2eo.parser.JavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(org.polystat.j2eo.parser.JavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(org.polystat.j2eo.parser.JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(org.polystat.j2eo.parser.JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(org.polystat.j2eo.parser.JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(org.polystat.j2eo.parser.JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(org.polystat.j2eo.parser.JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(org.polystat.j2eo.parser.JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCommonBodyDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCommonBodyDeclaration(org.polystat.j2eo.parser.JavaParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(org.polystat.j2eo.parser.JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(org.polystat.j2eo.parser.JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(org.polystat.j2eo.parser.JavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(org.polystat.j2eo.parser.JavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(org.polystat.j2eo.parser.JavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(org.polystat.j2eo.parser.JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(org.polystat.j2eo.parser.JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(org.polystat.j2eo.parser.JavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(org.polystat.j2eo.parser.JavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(org.polystat.j2eo.parser.JavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(org.polystat.j2eo.parser.JavaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(org.polystat.j2eo.parser.JavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(org.polystat.j2eo.parser.JavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(org.polystat.j2eo.parser.JavaParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(org.polystat.j2eo.parser.JavaParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(org.polystat.j2eo.parser.JavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(org.polystat.j2eo.parser.JavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(org.polystat.j2eo.parser.JavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(org.polystat.j2eo.parser.JavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(org.polystat.j2eo.parser.JavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(org.polystat.j2eo.parser.JavaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIList(org.polystat.j2eo.parser.JavaParser.LambdaLVTIListContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIList(org.polystat.j2eo.parser.JavaParser.LambdaLVTIListContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIParameter(org.polystat.j2eo.parser.JavaParser.LambdaLVTIParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIParameter(org.polystat.j2eo.parser.JavaParser.LambdaLVTIParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(org.polystat.j2eo.parser.JavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(org.polystat.j2eo.parser.JavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(org.polystat.j2eo.parser.JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(org.polystat.j2eo.parser.JavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(org.polystat.j2eo.parser.JavaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(org.polystat.j2eo.parser.JavaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(org.polystat.j2eo.parser.JavaParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(org.polystat.j2eo.parser.JavaParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(org.polystat.j2eo.parser.JavaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(org.polystat.j2eo.parser.JavaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(org.polystat.j2eo.parser.JavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(org.polystat.j2eo.parser.JavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(org.polystat.j2eo.parser.JavaParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(org.polystat.j2eo.parser.JavaParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(org.polystat.j2eo.parser.JavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(org.polystat.j2eo.parser.JavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(org.polystat.j2eo.parser.JavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(org.polystat.j2eo.parser.JavaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(org.polystat.j2eo.parser.JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(org.polystat.j2eo.parser.JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(org.polystat.j2eo.parser.JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(org.polystat.j2eo.parser.JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(org.polystat.j2eo.parser.JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(org.polystat.j2eo.parser.JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(org.polystat.j2eo.parser.JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(org.polystat.j2eo.parser.JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(org.polystat.j2eo.parser.JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(org.polystat.j2eo.parser.JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(org.polystat.j2eo.parser.JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(org.polystat.j2eo.parser.JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(org.polystat.j2eo.parser.JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(org.polystat.j2eo.parser.JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(org.polystat.j2eo.parser.JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(org.polystat.j2eo.parser.JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(org.polystat.j2eo.parser.JavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(org.polystat.j2eo.parser.JavaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(org.polystat.j2eo.parser.JavaParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(org.polystat.j2eo.parser.JavaParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(org.polystat.j2eo.parser.JavaParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(org.polystat.j2eo.parser.JavaParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(org.polystat.j2eo.parser.JavaParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(org.polystat.j2eo.parser.JavaParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(org.polystat.j2eo.parser.JavaParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(org.polystat.j2eo.parser.JavaParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(org.polystat.j2eo.parser.JavaParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(org.polystat.j2eo.parser.JavaParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(org.polystat.j2eo.parser.JavaParser.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(org.polystat.j2eo.parser.JavaParser.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(org.polystat.j2eo.parser.JavaParser.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(org.polystat.j2eo.parser.JavaParser.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(org.polystat.j2eo.parser.JavaParser.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(org.polystat.j2eo.parser.JavaParser.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(org.polystat.j2eo.parser.JavaParser.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(org.polystat.j2eo.parser.JavaParser.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(org.polystat.j2eo.parser.JavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(org.polystat.j2eo.parser.JavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(org.polystat.j2eo.parser.JavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(org.polystat.j2eo.parser.JavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(org.polystat.j2eo.parser.JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(org.polystat.j2eo.parser.JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(org.polystat.j2eo.parser.JavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(org.polystat.j2eo.parser.JavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(org.polystat.j2eo.parser.JavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(org.polystat.j2eo.parser.JavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBlockLabel}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlockLabel(org.polystat.j2eo.parser.JavaParser.StatementBlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBlockLabel}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlockLabel(org.polystat.j2eo.parser.JavaParser.StatementBlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementAssert}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssert(org.polystat.j2eo.parser.JavaParser.StatementAssertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementAssert}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssert(org.polystat.j2eo.parser.JavaParser.StatementAssertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(org.polystat.j2eo.parser.JavaParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(org.polystat.j2eo.parser.JavaParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(org.polystat.j2eo.parser.JavaParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(org.polystat.j2eo.parser.JavaParser.StatementForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(org.polystat.j2eo.parser.JavaParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(org.polystat.j2eo.parser.JavaParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDo(org.polystat.j2eo.parser.JavaParser.StatementDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDo(org.polystat.j2eo.parser.JavaParser.StatementDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementTryBlock}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementTryBlock(org.polystat.j2eo.parser.JavaParser.StatementTryBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementTryBlock}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementTryBlock(org.polystat.j2eo.parser.JavaParser.StatementTryBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementTryResourceSpecification}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementTryResourceSpecification(org.polystat.j2eo.parser.JavaParser.StatementTryResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementTryResourceSpecification}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementTryResourceSpecification(org.polystat.j2eo.parser.JavaParser.StatementTryResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitch(org.polystat.j2eo.parser.JavaParser.StatementSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitch(org.polystat.j2eo.parser.JavaParser.StatementSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSynchronized}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSynchronized(org.polystat.j2eo.parser.JavaParser.StatementSynchronizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSynchronized}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSynchronized(org.polystat.j2eo.parser.JavaParser.StatementSynchronizedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(org.polystat.j2eo.parser.JavaParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(org.polystat.j2eo.parser.JavaParser.StatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementThrow}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementThrow(org.polystat.j2eo.parser.JavaParser.StatementThrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementThrow}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementThrow(org.polystat.j2eo.parser.JavaParser.StatementThrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(org.polystat.j2eo.parser.JavaParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(org.polystat.j2eo.parser.JavaParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinue(org.polystat.j2eo.parser.JavaParser.StatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinue(org.polystat.j2eo.parser.JavaParser.StatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementYield}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementYield(org.polystat.j2eo.parser.JavaParser.StatementYieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementYield}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementYield(org.polystat.j2eo.parser.JavaParser.StatementYieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSemi}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSemi(org.polystat.j2eo.parser.JavaParser.StatementSemiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSemi}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSemi(org.polystat.j2eo.parser.JavaParser.StatementSemiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(org.polystat.j2eo.parser.JavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(org.polystat.j2eo.parser.JavaParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSwitchExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitchExpression(org.polystat.j2eo.parser.JavaParser.StatementSwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSwitchExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitchExpression(org.polystat.j2eo.parser.JavaParser.StatementSwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIdentifierLabel}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIdentifierLabel(org.polystat.j2eo.parser.JavaParser.StatementIdentifierLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIdentifierLabel}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIdentifierLabel(org.polystat.j2eo.parser.JavaParser.StatementIdentifierLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(org.polystat.j2eo.parser.JavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(org.polystat.j2eo.parser.JavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(org.polystat.j2eo.parser.JavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(org.polystat.j2eo.parser.JavaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(org.polystat.j2eo.parser.JavaParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(org.polystat.j2eo.parser.JavaParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(org.polystat.j2eo.parser.JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(org.polystat.j2eo.parser.JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(org.polystat.j2eo.parser.JavaParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(org.polystat.j2eo.parser.JavaParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(org.polystat.j2eo.parser.JavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(org.polystat.j2eo.parser.JavaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(org.polystat.j2eo.parser.JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(org.polystat.j2eo.parser.JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(org.polystat.j2eo.parser.JavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(org.polystat.j2eo.parser.JavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(org.polystat.j2eo.parser.JavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(org.polystat.j2eo.parser.JavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(org.polystat.j2eo.parser.JavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(org.polystat.j2eo.parser.JavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(org.polystat.j2eo.parser.JavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(org.polystat.j2eo.parser.JavaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(org.polystat.j2eo.parser.JavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(org.polystat.j2eo.parser.JavaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(org.polystat.j2eo.parser.JavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(org.polystat.j2eo.parser.JavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(org.polystat.j2eo.parser.JavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(org.polystat.j2eo.parser.JavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpresion(org.polystat.j2eo.parser.JavaParser.CastExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpresion(org.polystat.j2eo.parser.JavaParser.CastExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodInvocation}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(org.polystat.j2eo.parser.JavaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodInvocation}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(org.polystat.j2eo.parser.JavaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceCreation}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceCreation(org.polystat.j2eo.parser.JavaParser.InstanceCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceCreation}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceCreation(org.polystat.j2eo.parser.JavaParser.InstanceCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpresion(org.polystat.j2eo.parser.JavaParser.PrimaryExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpresion(org.polystat.j2eo.parser.JavaParser.PrimaryExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(org.polystat.j2eo.parser.JavaParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(org.polystat.j2eo.parser.JavaParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(org.polystat.j2eo.parser.JavaParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(org.polystat.j2eo.parser.JavaParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code reference}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReference(org.polystat.j2eo.parser.JavaParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code reference}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReference(org.polystat.j2eo.parser.JavaParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(org.polystat.j2eo.parser.JavaParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(org.polystat.j2eo.parser.JavaParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(org.polystat.j2eo.parser.JavaParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(org.polystat.j2eo.parser.JavaParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodReference}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(org.polystat.j2eo.parser.JavaParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodReference}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(org.polystat.j2eo.parser.JavaParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(org.polystat.j2eo.parser.JavaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(org.polystat.j2eo.parser.JavaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(org.polystat.j2eo.parser.JavaParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(org.polystat.j2eo.parser.JavaParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(org.polystat.j2eo.parser.JavaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(org.polystat.j2eo.parser.JavaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceOfExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(org.polystat.j2eo.parser.JavaParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceOfExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(org.polystat.j2eo.parser.JavaParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(org.polystat.j2eo.parser.JavaParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(org.polystat.j2eo.parser.JavaParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(org.polystat.j2eo.parser.JavaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(org.polystat.j2eo.parser.JavaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(org.polystat.j2eo.parser.JavaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(org.polystat.j2eo.parser.JavaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(org.polystat.j2eo.parser.JavaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(org.polystat.j2eo.parser.JavaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(org.polystat.j2eo.parser.JavaParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(org.polystat.j2eo.parser.JavaParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterThisExpresion(org.polystat.j2eo.parser.JavaParser.ThisExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitThisExpresion(org.polystat.j2eo.parser.JavaParser.ThisExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(org.polystat.j2eo.parser.JavaParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(org.polystat.j2eo.parser.JavaParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(org.polystat.j2eo.parser.JavaParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(org.polystat.j2eo.parser.JavaParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpresion(org.polystat.j2eo.parser.JavaParser.IdentifierExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpresion}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpresion(org.polystat.j2eo.parser.JavaParser.IdentifierExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(org.polystat.j2eo.parser.JavaParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(org.polystat.j2eo.parser.JavaParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonWildcardTypeArgumentsExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsExpression(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonWildcardTypeArgumentsExpression}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsExpression(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(org.polystat.j2eo.parser.JavaParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(org.polystat.j2eo.parser.JavaParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabeledRule(org.polystat.j2eo.parser.JavaParser.SwitchLabeledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabeledRule(org.polystat.j2eo.parser.JavaParser.SwitchLabeledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGuardedPattern(org.polystat.j2eo.parser.JavaParser.GuardedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGuardedPattern(org.polystat.j2eo.parser.JavaParser.GuardedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRuleOutcome(org.polystat.j2eo.parser.JavaParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRuleOutcome(org.polystat.j2eo.parser.JavaParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(org.polystat.j2eo.parser.JavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(org.polystat.j2eo.parser.JavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(org.polystat.j2eo.parser.JavaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(org.polystat.j2eo.parser.JavaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(org.polystat.j2eo.parser.JavaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(org.polystat.j2eo.parser.JavaParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(org.polystat.j2eo.parser.JavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(org.polystat.j2eo.parser.JavaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(org.polystat.j2eo.parser.JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(org.polystat.j2eo.parser.JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(org.polystat.j2eo.parser.JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(org.polystat.j2eo.parser.JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(org.polystat.j2eo.parser.JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(org.polystat.j2eo.parser.JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(org.polystat.j2eo.parser.JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(org.polystat.j2eo.parser.JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(org.polystat.j2eo.parser.JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(org.polystat.j2eo.parser.JavaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(org.polystat.j2eo.parser.JavaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeClassOrInterfaceType}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeClassOrInterfaceType(org.polystat.j2eo.parser.JavaParser.TypeClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeClassOrInterfaceType}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeClassOrInterfaceType(org.polystat.j2eo.parser.JavaParser.TypeClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typePrimitiveType}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypePrimitiveType(org.polystat.j2eo.parser.JavaParser.TypePrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typePrimitiveType}
	 * labeled alternative in {@link org.polystat.j2eo.parser.JavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypePrimitiveType(org.polystat.j2eo.parser.JavaParser.TypePrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(org.polystat.j2eo.parser.JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(org.polystat.j2eo.parser.JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(org.polystat.j2eo.parser.JavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(org.polystat.j2eo.parser.JavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(org.polystat.j2eo.parser.JavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(org.polystat.j2eo.parser.JavaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(org.polystat.j2eo.parser.JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(org.polystat.j2eo.parser.JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(org.polystat.j2eo.parser.JavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link org.polystat.j2eo.parser.JavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaParser.ArgumentsContext ctx);
}