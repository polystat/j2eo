// Generated from JavaParser.g4 by ANTLR 4.7.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JavaParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JavaParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(JavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(JavaParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCommonBodyDeclaration(JavaParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JavaParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JavaParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIList(JavaParser.LambdaLVTIListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIParameter(JavaParser.LambdaLVTIParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JavaParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(JavaParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(JavaParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(JavaParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(JavaParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(JavaParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(JavaParser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(JavaParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(JavaParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(JavaParser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#recordHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordHeader(JavaParser.RecordHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#recordComponentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponentList(JavaParser.RecordComponentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#recordComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponent(JavaParser.RecordComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#recordBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordBody(JavaParser.RecordBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBlockLabel}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlockLabel(JavaParser.StatementBlockLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssert}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssert(JavaParser.StatementAssertContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(JavaParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(JavaParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(JavaParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(JavaParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementTryBlock}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTryBlock(JavaParser.StatementTryBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementTryResourceSpecification}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTryResourceSpecification(JavaParser.StatementTryResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(JavaParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSynchronized}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSynchronized(JavaParser.StatementSynchronizedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(JavaParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementThrow}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementThrow(JavaParser.StatementThrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(JavaParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(JavaParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementYield}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementYield(JavaParser.StatementYieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSemi}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSemi(JavaParser.StatementSemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementExpression}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitchExpression}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitchExpression(JavaParser.StatementSwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIdentifierLabel}
	 * labeled alternative in {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIdentifierLabel(JavaParser.StatementIdentifierLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JavaParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(JavaParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JavaParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(JavaParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JavaParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpresion}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpresion(JavaParser.CastExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvocation}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(JavaParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceCreation}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceCreation(JavaParser.InstanceCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpresion}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpresion(JavaParser.PrimaryExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(JavaParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(JavaParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reference}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(JavaParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(JavaParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(JavaParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodReference}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(JavaParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(JavaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(JavaParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(JavaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instanceOfExpression}
	 * labeled alternative in {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceOfExpression(JavaParser.InstanceOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(JavaParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JavaParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JavaParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JavaParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(JavaParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpresion}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpresion(JavaParser.ThisExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(JavaParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(JavaParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpresion}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpresion(JavaParser.IdentifierExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classExpression}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExpression(JavaParser.ClassExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonWildcardTypeArgumentsExpression}
	 * labeled alternative in {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsExpression(JavaParser.NonWildcardTypeArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(JavaParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabeledRule(JavaParser.SwitchLabeledRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#guardedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedPattern(JavaParser.GuardedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchRuleOutcome(JavaParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JavaParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(JavaParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JavaParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(JavaParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeClassOrInterfaceType}
	 * labeled alternative in {@link JavaParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeClassOrInterfaceType(JavaParser.TypeClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typePrimitiveType}
	 * labeled alternative in {@link JavaParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePrimitiveType(JavaParser.TypePrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(JavaParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaParser.ArgumentsContext ctx);
}