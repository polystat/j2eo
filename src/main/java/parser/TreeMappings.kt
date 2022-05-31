package parser

import lexer.Token
import lexer.TokenCode
import org.antlr.v4.runtime.tree.TerminalNode
import parser.JavaParser.*
import tree.*
import tree.Compilation.*
import tree.Declaration.*
import tree.Expression.*
import tree.Expression.Primary.*
import tree.Statement.*
import tree.Type.*
import java.util.TimeZone

fun CompilationUnitContext.toCompilationUnit(): CompilationUnit {
    val imports = ArrayList(importDeclaration().map { it.toImportDeclaration() })
    val importDecls = ImportDeclarations(imports.removeFirstOrNull())
    imports.forEach { importDecls.add(it) }
    importDecls.imports.removeIf { it == null }

    val typeDecls = ArrayList(typeDeclaration().mapNotNull { it.toTopLevelComponent() }) // FIXME: should be no nulls
    val topLevelCmpnts = TopLevelComponents(typeDecls.removeFirstOrNull())
    typeDecls.forEach { topLevelCmpnts.add(it) }
    topLevelCmpnts.components.removeIf { it == null }

    return SimpleCompilationUnit(
        importDecls,
        topLevelCmpnts
    )
}

fun TypeDeclarationContext.toTopLevelComponent(): TopLevelComponent? =
    if (classDeclaration() != null) {
        TopLevelComponent(classDeclaration().toClassDeclaration())
    } else {
        null // throw java.lang.Exception("Cannot translate") // FIXME
    }

fun ClassDeclarationContext.toClassDeclaration(): ClassDeclaration =
    NormalClassDeclaration(
        identifier().toToken(),
        typeParameters()?.toTypeParameters(),
        typeType()?.toType(),
        typeList(0)?.toTypeList(), // TODO: use this.typeList(1) for PERMITS (Java 17)
        classBody().toDeclarations()
    )

fun ClassBodyContext.toDeclarations(): Declarations {
    val clsBodyDecls = ArrayList(
        this.classBodyDeclaration().mapNotNull { it.toDeclaration() }.flatten()
    )
    val decls = Declarations(clsBodyDecls.removeFirstOrNull())
    clsBodyDecls.forEach { decls.add(it) }
    decls.declarations.removeIf { it == null }
    return decls
}

fun ClassBodyDeclarationContext.toDeclaration(): List<Declaration>? =
    memberDeclaration()?.toDeclaration(modifier())
        ?: block()?.toDeclaration(STATIC())

fun MemberDeclarationContext.toDeclaration(modifiers: List<ModifierContext>?): List<Declaration>? =
    if (methodDeclaration() != null) { listOf(methodDeclaration().toDeclaration(modifiers)) } else { null } ?:
    if (classDeclaration() != null) { listOf(classDeclaration().toClassDeclaration()) } else { null } ?:
    fieldDeclaration()?.toDeclaration(modifiers) ?:
    if (constructorDeclaration() != null) { listOf(constructorDeclaration().toDeclaration(modifiers)) } else { null }
// FIXME: support other declarations

fun ConstructorDeclarationContext.toDeclaration(modifiers: List<ModifierContext>?): Declaration {
    val excsTypes = qualifiedNameList()?.qualifiedName()?.map { TypeName(it.toCompoundName(), null) }

    var excsTypeList: TypeList? = null
    if (excsTypes != null) {
        excsTypeList = TypeList(null)
        excsTypeList.types = ArrayList(excsTypes)
    }

    return ConstructorDeclaration(
        modifiers.getModifiers(),
        null,
        formalParameters().toParameterDeclarations(),
        excsTypeList,
        null, /* FIXME (WHY DO WE SHOULD EXPLICIT DISTINGUISH SUPER CALL?) */
        constructorBody.toBlock()
    )
}

fun FieldDeclarationContext.toDeclaration(modifiers: List<ModifierContext>?): List<Declaration> {
    val variableDeclarators = variableDeclarators().toVariableDeclarators()
    val type = typeType()?.toType()
    val trueModifiers = modifiers.getModifiers()
    return variableDeclarators.declarators
        .map {
            VariableDeclaration(
                it.name,
                trueModifiers,
                type,
                it.dims,
                it.initializer
            )
        }
}

fun TerminalNode.toTypeModifier(): TokenCode? {
    return when(symbol.type) {
        PUBLIC -> TokenCode.Public
        PRIVATE -> TokenCode.Private
        STATIC -> TokenCode.Static
        PROTECTED -> TokenCode.Protected
        ABSTRACT -> TokenCode.Abstract
        FINAL -> TokenCode.Final
        STRICTFP -> TokenCode.Strictfp
        else -> null
    }
}

fun ClassOrInterfaceModifierContext.terminalNode() : TerminalNode? {
    for (o in children) {
        if (o is TerminalNode) {
            return o;
        }
    }
    return null
}

fun List<ModifierContext>?.getModifiers(): Modifiers? {
    if (this == null) {
        return null
    }
    val tokenModifiers = mapNotNull { it.classOrInterfaceModifier()?.terminalNode()?.toTypeModifier() }
    if (tokenModifiers.isNotEmpty()) {
        val standardModifiers = StandardModifiers(Token(tokenModifiers[0]))
        for (i in 1 until tokenModifiers.size) {
            standardModifiers.add(Token(tokenModifiers[i]))
        }
        return Modifiers(null, standardModifiers)
    }
    return null
}

fun MethodDeclarationContext.toDeclaration(modifiers: List<ModifierContext>?): Declaration =
    MethodDeclaration(
        modifiers.getModifiers(),
        null /* FIXME */,
        typeTypeOrVoid().toType() /* FIXME */,
        identifier().text /* FIXME */,
        formalParameters().toParameterDeclarations() /* FIXME */,
        null /* FIXME */,
        null /* FIXME */,
        methodBody().toBlock() /* FIXME */
    )

fun MethodBodyContext.toBlock(): Block =
    if (block() == null) {
        val blockStmnts = BlockStatements(null)
        blockStmnts.blockStatements.removeIf { it == null }
        Block(ArrayList(), blockStmnts)
    } else {
        block().toBlock()
    }

fun FormalParametersContext.toParameterDeclarations(): ParameterDeclarations? =
    formalParameterList()?.toParameterDeclarations()

fun FormalParameterListContext.toParameterDeclarations(): ParameterDeclarations {
    val formalParams = ArrayList(formalParameter().map { it.toParameterDeclaration() })
    val paramDecls = ParameterDeclarations(formalParams.removeFirstOrNull())
    formalParams.forEach { paramDecls.add(it) }
    paramDecls.parameters.removeIf { it == null }
    return paramDecls
}

fun FormalParameterContext.toParameterDeclaration(): ParameterDeclaration =
    ParameterDeclaration(
        null, // FIXME: Modifiers(ArrayList(variableModifier().map { it.toModifier() })),
        typeType().toType(),
        variableDeclaratorId().text,
        null, // FIXME
        false, // see LastParameterContext for true
        null // FIXME
    )

fun TypeTypeOrVoidContext.toType(): Type? = typeType()?.toType()

fun BlockContext.toDeclaration(isStatic: TerminalNode?): List<Declaration> =
    listOf(ClassInitializer(this.toBlock(), isStatic != null))

fun BlockContext.toBlock(): Block {
    val blockStmntsLst = ArrayList(this.blockStatement().map { it.toBlockStatement() })
    val blockStmnts = BlockStatements(blockStmntsLst.removeFirstOrNull())
    blockStmntsLst.forEach { blockStmnts.add(it) }
    blockStmnts.blockStatements.removeIf { it == null }
    return Block(null /* TODO: always null? */, blockStmnts)
}

fun Declaration.toBlockStatement(): BlockStatement = BlockStatement(this)
fun Statement.toBlockStatement(): BlockStatement = BlockStatement(this)

fun BlockStatementContext.toBlockStatement(): BlockStatement =
    localVariableDeclaration()?.toDeclaration()?.toBlockStatement()
        ?: statement()?.toStatement()?.toBlockStatement()
        ?: localTypeDeclaration()?.toDeclaration()?.toBlockStatement()
        ?: throw Exception("Unsupported block statement: $this") /* FIXME */

fun LocalTypeDeclarationContext.toDeclaration(): Declaration =
    classDeclaration()?.toClassDeclaration()
        ?: throw Exception() /* FIXME */

fun StatementContext.toStatement(): Statement =
    when (this) {
        is StatementWhileContext -> While(
            null /* FIXME */,
            parExpression().expression().toExpression(),
            statement().toStatement()
        )
        is StatementIfContext -> IfThenElse(
            null,
            parExpression().expression().toExpression(),
            statement(0).toStatement(),
            statement(1)?.toStatement()
        )
        is StatementExpressionContext -> StatementExpression(
            null,
            expression().toExpression()
        )
        is StatementAssertContext -> Assert(
            null,
            this.expression(0).toExpression(),
            this.expression(1)?.toExpression()
        )
        is StatementBreakContext -> Break(null, Token(TokenCode.Break))
        is StatementContinueContext -> Continue(null, Token(TokenCode.Continue))
        is StatementForContext -> StatementExpression(
            null,
            SimpleReference(CompoundName("for_loop_placeholder"))
        ) /* FIXME */
        is StatementBlockLabelContext -> block().toBlock()
        is StatementDoContext -> Do(null, statement().toStatement(), parExpression().expression().toExpression())
        is StatementReturnContext -> Return(null, expression()?.toExpression())
        is StatementIdentifierLabelContext -> StatementExpression(
            null,
            SimpleReference(CompoundName("identifier_label_placeholder"))
        ) /* FIXME */
        is StatementSemiContext -> StatementExpression(
            null,
            SimpleReference(CompoundName("semi_noop_placeholder"))
        ) /* FIXME */
        is StatementSwitchContext -> StatementExpression(
            null,
            SimpleReference(CompoundName("switch_statement_placeholder"))
        ) /* FIXME */
        is StatementSwitchExpressionContext -> StatementExpression(null, switchExpression().toExpression())
        /* Switch(null,
        this.parExpression().expression().toExpression(),
        SwitchBlocks(ArrayList(switchBlockStatementGroup().map { it.toSwitchBlock() })),
        0 /* FIXME: switchLabels */
    ) */
        is StatementTryResourceSpecificationContext -> StatementExpression(
            null,
            SimpleReference(CompoundName("try_resource_placeholder"))
        ) /* FIXME */
        is StatementTryBlockContext -> StatementExpression(
            null,
            SimpleReference(CompoundName("try_block_placeholder"))
        ) /* FIXME */
        else -> StatementExpression(null, SimpleReference(CompoundName("statement_placeholder"))) /* FIXME */
        // else -> throw Exception("Unsupported statement") /* FIXME */
    }

fun SwitchExpressionContext.toExpression(): Expression =
    SimpleReference(CompoundName("switch_expression_placeholder")) /* FIXME */
/* FIXME:
SwitchExpression(
    parExpression().expression().toExpression(),
    ???
) */

fun SwitchBlockStatementGroupContext.toSwitchBlock(): SwitchBlock =
    SwitchBlock(
        ArrayList(this.switchLabel().map { it.toSwitchLabel() }),
        null
    )

fun SwitchLabelContext.toSwitchLabel(): SwitchLabel =
    SwitchLabel(
        constantExpression?.toExpression()
            ?: enumConstantName?.toCompoundName()?.toExpression()
    )

fun org.antlr.v4.runtime.Token.toCompoundName(): CompoundName = CompoundName(text)
fun org.antlr.v4.runtime.Token.toToken(): Token =
    when (type) {
        ADD -> Token(TokenCode.Plus)
        MUL -> Token(TokenCode.Star)
        SUB -> Token(TokenCode.Minus)
        DIV -> Token(TokenCode.Slash)
        ADD_ASSIGN -> Token(TokenCode.PlusAssign)
        MUL_ASSIGN -> Token(TokenCode.StarAssign)
        SUB_ASSIGN -> Token(TokenCode.MinusAssign)
        DIV_ASSIGN -> Token(TokenCode.SlashAssign)
        ASSIGN -> Token(TokenCode.Assign)
        EQUAL -> Token(TokenCode.Equal)
        OR -> Token(TokenCode.DoubleVertical)
        AND -> Token(TokenCode.DoubleAmpersand)
        BITAND -> Token(TokenCode.Ampersand)
        OR_ASSIGN -> Token(TokenCode.VerticalAssign)
        BITOR -> Token(TokenCode.Vertical)
        CARET -> Token(TokenCode.Caret)
        GE -> Token(TokenCode.GreaterEqual)
        LE -> Token(TokenCode.LessEqual)
        GT -> Token(TokenCode.Greater)
        LT -> Token(TokenCode.Less)
        AND_ASSIGN -> Token(TokenCode.AmpersandAssign)
        NOTEQUAL -> Token(TokenCode.NonEqual)
        MOD -> Token(TokenCode.Percent)
        XOR_ASSIGN -> Token(TokenCode.CaretAssign)
        LSHIFT_ASSIGN -> Token(TokenCode.LeftShiftAssign)
        RSHIFT_ASSIGN -> Token(TokenCode.RightShiftAssign)
        DOT -> Token(TokenCode.Dot)
        INSTANCEOF -> Token(TokenCode.Instanceof)
        QUESTION -> Token(TokenCode.Question)
        INC -> Token(TokenCode.PlusPlus)
        DEC -> Token(TokenCode.MinusMinus)
        VAR -> Token(TokenCode.Var)
        BANG -> Token(TokenCode.Negation)
        TILDE -> Token(TokenCode.Tilde)
        MOD_ASSIGN -> Token(TokenCode.PercentAssign)
        URSHIFT_ASSIGN -> Token(TokenCode.ArithmRightShiftAssign)
        else -> throw Exception("unsupported token: $text ($type)")
    }

fun CompoundName.toExpression(): Expression = SimpleReference(this)

fun ExpressionContext.toExpression(): Expression {
    return when (this) {
        is BinaryExpressionContext -> Binary(
            expression(0).toExpression(),
            expression(1).toExpression(),
            bop?.toToken() ?:
            if (LT().size == 2) { Token(TokenCode.LeftShift) } else { null } ?:
            if (GT().size == 2) { Token(TokenCode.RightShift) } else { null } ?:
            if (GT().size == 3) { Token(TokenCode.ArithmRightShift) } else { null }
        )
        is PrefixExpressionContext -> UnaryPrefix(prefix.toToken(), expression().toExpression())
        is PostfixExpressionContext -> UnaryPostfix(postfix.toToken(), expression().toExpression())
        is ArrayAccessContext -> ArrayAccess(expression(0).toExpression(), expression(1).toExpression())
        is CastExpresionContext -> Cast(TypeList(typeType(0).toType()), expression().toExpression())
        is InstanceOfExpressionContext -> InstanceOf(expression().toExpression(), typeType()?.toType()) /* FIXME */
        is InstanceCreationContext -> creator().toExpression()
        is MethodInvocationContext -> methodCall().toExpression(null)
        is PrimaryExpresionContext -> primary().toExpression()
        is ReferenceContext -> toExpression()
        else -> SimpleReference(CompoundName("expression_placeholder"))
    }
}

fun ReferenceContext.toExpression(): Expression {
    val expr = expression().toExpression()

    val identifier = identifier()
    if (identifier != null) {
        return FieldAccess(expr, false, identifier.toToken())
    }

    val methodCall = methodCall()
    if (methodCall != null) {
        return methodCall.toExpression(expr)
    }

    val thisSign = THIS()
    if (thisSign != null) {
        return FieldAccess(expr, false, Token(TokenCode.This)) /* FIXME: No idea how it can be possible */
    }

    val innerCreator = innerCreator()
    if (innerCreator != null) {
        return innerCreator.toInstanceCreationQualified(expr)
    }

    val superSuffix = superSuffix()
    if (superSuffix != null){
        return SimpleReference(CompoundName("super_suffix_placeholder")) /* FIXME: No idea what it is*/
    }

    val explicitGenericInvocation = explicitGenericInvocation()
    if (explicitGenericInvocation != null) {
        return SimpleReference(CompoundName("explicit_generic_invocation_placeholder")) /* FIXME: No idea what it is*/
    }

    return SimpleReference(CompoundName("reference_placeholder"))
}

fun InnerCreatorContext.toInstanceCreationQualified(expr: Expression): InstanceCreationQualified {
    val instanceCreation = InstanceCreation(
        null, // No type arguments for now
        TypeName(
            CompoundName(identifier().text),
            null // No type arguments for now
        ),
        classCreatorRest().arguments()?.toArgList(),
        classCreatorRest().classBody()?.toDeclarations()
    )
    return when (expr) {
        is SimpleReference -> InstanceCreationQualified(expr.compoundName, instanceCreation)
        is Primary -> InstanceCreationQualified(expr, instanceCreation)
        else -> InstanceCreationQualified(
            CompoundName("unknown_expr_${expr.javaClass.simpleName}"), instanceCreation
        )
    }
}

fun CreatorContext.toExpression(): Expression {
    val arrayCreatorRestContext = arrayCreatorRest()
    val classCreatorRestContext = classCreatorRest()

    val createdNameContext = createdName()
    val createdNameIdentifiers = createdNameContext.identifier()
    val primitiveTypeContext = createdNameContext.primitiveType()

    return if (classCreatorRestContext != null) {
        InstanceCreation(
            null, // No type arguments for now
            TypeName(
                CompoundName(createdNameIdentifiers.map { it.IDENTIFIER().text }.toList()),
                null // No type arguments for now
            ),
            classCreatorRestContext.arguments()?.toArgList(),
            classCreatorRestContext.classBody()?.toDeclarations()
        )
    } else if (arrayCreatorRestContext != null) {
        ArrayCreation(
            primitiveTypeContext?.toType()
                ?: TypeName(
                    CompoundName(createdNameIdentifiers.map { it.IDENTIFIER().text }.toList()),
                    null // No type arguments for now
                ),
            arrayCreatorRestContext.arrayInitializer()?.toInitializerArray() ?: InitializerArray(
                InitializerSimple(arrayCreatorRestContext.expression(0).toExpression())
            )
        )
    } else {
        SimpleReference(CompoundName("unknown_creator_context_placeholder"))
    }
}

fun ArgumentsContext.toArgList(): ArgumentList {
    return if (expressionList() == null) {
        val args = ArgumentList(null)
        args.arguments.removeIf { it == null }
        args
    } else {
        val argsLst = ArrayList(expressionList().expression().map { it.toExpression() }.toList())
        val args = ArgumentList(argsLst.removeFirstOrNull())
        argsLst.forEach { args.add(it) }
        args.arguments.removeIf { it == null }
        args
    }
}

fun MethodCallContext.toExpression(expr: Expression?): Expression {
    val exprLst = if (expressionList() == null)
        listOf()
    else
        expressionList().expression().map { it.toExpression() }.toList()
    val argList = ArgumentList(exprLst.firstOrNull())
    exprLst.drop(1).forEach { argList.add(it) }
    argList.arguments.removeIf { it == null }
    return MethodInvocation(
        expr,
        SUPER() != null,
        null, // TODO: type arguments are somewhere else
        identifier()?.toToken() ?:
        if (SUPER() != null) {Token(TokenCode.Super, "super")} else { null } ?:
        if (THIS() != null) {Token(TokenCode.This, "this")} else { null },
        /* FIXME (SHOULD BE IMPLEMENTED IN ANOTHER WAY) */
        argList
    )
}

fun IdentifierContext.toExpression() : Expression =
        SimpleReference(CompoundName(IDENTIFIER()?.text ?: "var")) // A specific case

fun PrimaryContext.toExpression(): Expression =
    when (this) {
        is ParenthesizedExpressionContext -> Parenthesized(expression().toExpression())
        is LiteralExpressionContext -> literal().toLiteral()
        is IdentifierExpresionContext -> SimpleReference(CompoundName(identifier().text ?: "var"))
        is ThisExpresionContext -> This(null)
        is SuperExpressionContext -> SimpleReference(CompoundName("super"))
        else -> SimpleReference(CompoundName("primary_expression_placeholder_${this.javaClass.simpleName}"))
    }
/* FIXME: typeOrVoid . CLASS */
/* FIXME: nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments) */

fun LiteralContext.toLiteral(): Literal =
    BOOL_LITERAL()?.text?.let { txt ->
        Literal(
            Token(
                if (txt == "true") {
                    TokenCode.True
                } else {
                    TokenCode.False
                }
            )
        )
    } ?: integerLiteral()?.DECIMAL_LITERAL()?.let { n -> Literal(Token(TokenCode.IntegerLiteral, n.text)) }
    ?: NULL_LITERAL()?.let { _ -> Literal(Token(TokenCode.Null)) }
    ?: floatLiteral()?.let { x -> Literal(Token(TokenCode.FloatingLiteral, x.text)) }
    ?: STRING_LITERAL()?.let { s -> Literal(Token(TokenCode.StringLiteral, s.text.drop(1).dropLast(1))) } ?: Literal(
        Token(TokenCode.IntegerLiteral, "123456")
    ) ?: /* FIXME: support other literals */
    throw Exception("unsupported literal $text") /* FIXME */

fun LocalVariableDeclarationContext.toDeclaration(): Declaration =
    TypeAndDeclarators(
        typeType()?.toType(),
        if (identifier() != null) {
            identifier().toVariableDeclarators(expression())
        } else {
            variableDeclarators().toVariableDeclarators()
        }
    )

fun IdentifierContext.toVariableDeclarators(expression: ExpressionContext): VariableDeclarators =
    VariableDeclarators(this.toVariableDeclarator(expression))

fun IdentifierContext.toVariableDeclarator(expression: ExpressionContext): VariableDeclarator =
    VariableDeclarator(this.toToken(), null, InitializerSimple(expression.toExpression()))

fun VariableDeclaratorsContext.toVariableDeclarators(): VariableDeclarators {
    val varDeclsLst = ArrayList(this.variableDeclarator().map { it.toVariableDeclarator() })
    val varDecls = VariableDeclarators(varDeclsLst.removeFirstOrNull())
    varDeclsLst.forEach { varDecls.add(it) }
    varDecls.declarators.removeIf { it == null }
    return varDecls
}

fun VariableDeclaratorContext.toVariableDeclarator(): VariableDeclarator {
    // val dimLst = ArrayList<Dim>(variableDeclaratorId().LBRACK().size)
    val dims = Dims()
    return VariableDeclarator(
        this.variableDeclaratorId().identifier().toToken(),
        dims,
        this.variableInitializer()?.toInitializer()
    )
}

fun VariableInitializerContext.toInitializer(): Initializer =
    arrayInitializer()?.toInitializerArray()
        ?: InitializerSimple(expression().toExpression())

fun ArrayInitializerContext.toInitializerArray(): InitializerArray {
    val varInitLst = ArrayList(variableInitializer().map { it.toInitializer() })
    val initArr = InitializerArray(varInitLst.removeFirstOrNull())
    varInitLst.forEach { initArr.add(it) }
    initArr.initializers.removeIf { it == null }
    return initArr
}

fun TypeParametersContext.toTypeParameters(): TypeParameters {
    val typeLst = ArrayList(this.typeParameter().map { it.toTypeParameter() })
    val typeParams = TypeParameters(typeLst.removeFirstOrNull())
    typeLst.forEach { typeParams.add(it) }
    typeParams.typeParameters.removeIf { it == null }
    return typeParams
}

fun TypeParameterContext.toTypeParameter(): TypeParameter =
    TypeParameter(null /* FIXME */, TypeParameterTail(this.identifier().toToken(), null /* FIXME */))

fun TypeListContext.toTypeList(): TypeList {
    val typeArr = ArrayList(this.typeType().map { it.toType() })
    val typeLst = TypeList(typeArr.removeFirstOrNull())
    typeArr.forEach { typeLst.add(it) }
    typeLst.types.removeIf { it == null }
    return typeLst
}

fun TypeTypeContext.toType(): Type =
    when (this) {
        is TypeClassOrInterfaceTypeContext -> this.toType()
        is TypePrimitiveTypeContext -> this.toType()
        else -> throw Exception("not supported") // FIXME: impossible?
    }

fun TypePrimitiveTypeContext.toType(): Type {
    val leftBrackets = LBRACK()
    val rnType = primitiveType().toType() as PrimitiveType

    for (leftBracket in leftBrackets) {
        rnType.addDimension(Dim(null, null))
    }

    return rnType // FIXME: annotations?
}

fun TerminalNode.toPrimitiveType(): PrimitiveType =
    when (this.symbol.type) {
        BOOLEAN -> PrimitiveType(Token(TokenCode.Boolean))
        CHAR -> PrimitiveType(Token(TokenCode.Char))
        BYTE -> PrimitiveType(Token(TokenCode.Byte))
        SHORT -> PrimitiveType(Token(TokenCode.Short))
        INT -> PrimitiveType(Token(TokenCode.Int))
        LONG -> PrimitiveType(Token(TokenCode.Long))
        FLOAT -> PrimitiveType(Token(TokenCode.Float))
        DOUBLE -> PrimitiveType(Token(TokenCode.Double))
        else -> throw Exception("Unknown primitive type: " + this.symbol)
    }

fun PrimitiveTypeContext.toType(): Type =
    BOOLEAN()?.toPrimitiveType()
        ?: CHAR()?.toPrimitiveType()
        ?: BYTE()?.toPrimitiveType()
        ?: SHORT()?.toPrimitiveType()
        ?: INT()?.toPrimitiveType()
        ?: LONG()?.toPrimitiveType()
        ?: FLOAT()?.toPrimitiveType()
        ?: DOUBLE()?.toPrimitiveType()
        ?: throw Exception("Unsupported primitive type: $this")

fun TypeClassOrInterfaceTypeContext.toType(): Type {
    val leftBrackets = LBRACK()
    val rnType = classOrInterfaceType().toType() as TypeName

    for (leftBracket in leftBrackets) {
        rnType.addDimension(Dim(null, null))
    }

    return rnType // FIXME: annotations?
}

fun ClassOrInterfaceTypeContext.toType(): Type =
    TypeName(
        CompoundName(this.identifier().map { it.text }),
        this.typeArguments().lastOrNull()
            ?.toTypeArguments()   // FIXME: we use last() since we do not support types like A<B>.C<D>
    )

fun TypeArgumentsContext.toTypeArguments(): TypeArguments {
    val typeArgsLst = ArrayList(typeArgument().map { it.toTypeArgument() })
    val typeArgs = TypeArguments(typeArgsLst.removeFirstOrNull())
    typeArgsLst.forEach { typeArgs.add(it) }
    typeArgs.arguments.removeIf { it == null }
    return typeArgs
}

fun TypeArgumentContext.toTypeArgument(): TypeArgument =
    TypeArgument(typeType()?.toType(), 0 /* FIXME */, null)

fun IdentifierContext.toToken(): Token = Token(TokenCode.Identifier, this.text)

fun QualifiedNameContext.toCompoundName(): CompoundName =
    CompoundName(identifier().map { it.text })

fun PackageDeclarationContext.toPackage(): Package =
    Package(
        qualifiedName().toCompoundName(),
        null, /* FIXME */
        null, /* FIXME */
    )

//fun ExpressionContext.toExpression(): Expression =
//    when (this) {
//
//    }

fun ImportDeclarationContext.toImportDeclaration(): ImportDeclaration =
    ImportDeclaration(
        STATIC()?.text == "static",
        qualifiedName().toCompoundName(),
        false /* FIXME */
    )
