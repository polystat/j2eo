package parser

import lexer.Token
import lexer.TokenCode
import org.antlr.v4.runtime.tree.TerminalNode
import parser.JavaParser.*
import tree.*
import tree.Compilation.*
import tree.Declaration.*
import tree.Expression.*
import tree.Expression.Primary.Literal
import tree.Expression.Primary.MethodInvocation
import tree.Expression.Primary.Parenthesized
import tree.Expression.Primary.This
import tree.Statement.*
import tree.Type.*

fun CompilationUnitContext.toCompilationUnit(): CompilationUnit =
    SimpleCompilationUnit(
        ImportDeclarations(ArrayList(importDeclaration().map { it.toImportDeclaration() })),
        TopLevelComponents(ArrayList(typeDeclaration().mapNotNull { it.toTopLevelComponent() })) // FIXME: should be no nulls
    )

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

fun ClassBodyContext.toDeclarations(): Declarations =
    Declarations(ArrayList(this.classBodyDeclaration().map { it.toDeclaration() }.filterNotNull()))

fun ClassBodyDeclarationContext.toDeclaration(): Declaration? =
    memberDeclaration()?.toDeclaration(modifier())
        ?: block()?.toDeclaration(STATIC())
        ?: null

fun MemberDeclarationContext.toDeclaration(modifiers: List<ModifierContext>?): Declaration? =
    methodDeclaration()?.toDeclaration()
    // FIXME: support other declarations
        ?: null

fun MethodDeclarationContext.toDeclaration(): Declaration =
    MethodDeclaration(
        null /* FIXME */,
        null /* FIXME */,
        typeTypeOrVoid().toType() /* FIXME */,
        identifier().text /* FIXME */,
        formalParameters().toParameterDeclarations() /* FIXME */,
        null /* FIXME */,
        null /* FIXME */,
        methodBody().toBlock() /* FIXME */
    )

fun MethodBodyContext.toBlock(): Block =
    block()?.toBlock() ?: Block(ArrayList(), BlockStatements(ArrayList()))

fun FormalParametersContext.toParameterDeclarations(): ParameterDeclarations? =
    formalParameterList()?.toParameterDeclarations()

fun FormalParameterListContext.toParameterDeclarations(): ParameterDeclarations =
    ParameterDeclarations(ArrayList(formalParameter().map { it.toParameterDeclaration() }))

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

fun BlockContext.toDeclaration(isStatic: TerminalNode?): Declaration =
    ClassInitializer(this.toBlock(), isStatic != null)

fun BlockContext.toBlock(): Block =
    Block(
        null /* TODO: always null? */,
        BlockStatements(ArrayList(this.blockStatement().map { it.toBlockStatement() }))
    )

fun Declaration.toBlockStatement(): BlockStatement = BlockStatement(this)
fun Statement.toBlockStatement(): BlockStatement = BlockStatement(this)

fun BlockStatementContext.toBlockStatement(): BlockStatement? =
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
        is StatementBreakContext -> Break(null, identifier()?.toToken())
        is StatementContinueContext -> Continue(null, identifier()?.toToken())
        is StatementForContext -> StatementExpression(null, SimpleReference(CompoundName("for_loop_placeholder"))) /* FIXME */
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
            ?: null
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
        DOT -> Token(TokenCode.Dot)
        INC -> Token(TokenCode.PlusPlus)
        DEC -> Token(TokenCode.MinusMinus)
        INSTANCEOF -> Token(TokenCode.Instanceof)
        QUESTION -> Token(TokenCode.Question)
        else -> throw Exception("unsupported token: $text ($type)")
    }

fun CompoundName.toExpression(): Expression = SimpleReference(this)

fun ExpressionContext.toBinaryExpression() : Binary? {
    val expr0 = expression(0)?.toExpression()
    val expr1 = expression(1)?.toExpression()
    val operand = terminal(0)?.symbol
    return if (expr0 != null && expr1 != null && operand != null)
        Binary(expr0, expr1, operand.toToken())
    else
        null
}

fun ExpressionContext.toUnaryPrefixPostfix() : Expression? {
    val expr = expression(0)?.toExpression()
    val operand = terminal(0)?.symbol
    return if (expr != null && operand != null) {
        if (prefix != null) {
            UnaryPrefix(operand.toToken(), expr)
        } else if (postfix != null) {
            UnaryPostfix(operand.toToken(), expr)
        } else {
            null
        }
    } else {
        null
    }
}

fun ExpressionContext.toExpression() : Expression =
    if (bop != null) {
        val expr0 =
            expression(0)?.toExpression() ?: primary()?.toExpression() ?: identifier()?.toExpression()
        val expr1 =
                expression(1)?.toExpression() ?:
                primary()?.toExpression() ?:
                identifier()?.toExpression() ?:
                methodCall()?.toExpression(expr0) ?:
                SimpleReference(CompoundName("expression_placeholder")) /* FIXME */
        if (bop.text == ".") {
            when (expr1) {
                is MethodInvocation -> expr1
                is SimpleReference -> FieldAccess(
                    expr0,
                    SUPER() != null,
                    Token(TokenCode.Identifier, expr1.compoundName.names[0]) // FIXME: questionable
                )
                else -> SimpleReference(CompoundName("expression_placeholder_bop_dot")) /* FIXME */
            }
        } else if (bop.type in DOT..URSHIFT_ASSIGN) {
            this.toBinaryExpression() ?:
            SimpleReference(CompoundName("expression_placeholder")) /* FIXME */
        } else {
            Binary(expr0, expr1, bop.toToken())
//            SimpleReference(CompoundName("expression_placeholder_not_bop_dot")) /* FIXME */
        }
        // if (expression(1) != null && expression(2) == null) {
        //     Binary(expression(0).toExpression(), expression(1).toExpression(), bop.toToken())
        // } else {
        //     SimpleReference(CompoundName("expression_placeholder")) /* FIXME */
        // }
    } else {
        this.toUnaryPrefixPostfix() ?:
        expression(0)?.toExpression() ?:
        primary()?.toExpression() ?:
        identifier()?.toExpression() ?:
        methodCall()?.toExpression(null) ?:
        SimpleReference(CompoundName("expression_placeholder")) /* FIXME */
    }

fun MethodCallContext.toExpression(expr: Expression?): Expression {
    val args = ArgumentList(
        expressionList()?.expression()?.map {
            it.toExpression()
        }?.toList() ?: listOf()
    )
    return MethodInvocation(
        expr,
        SUPER() != null,
        null, // TODO: type arguments are somewhere else
        identifier().toToken(),
        args
    )
}

fun IdentifierContext.toExpression(): Expression =
    // TODO: fix this
    SimpleReference(CompoundName(IDENTIFIER()?.text ?: "no_identifier"))


fun PrimaryContext.toParenthesized(): Parenthesized? =
    if (LPAREN() != null && RPAREN() != null) {
        val expr = expression()?.toExpression()
        if (expr != null) {
            Parenthesized(expr)
        } else {
            null
        }
    } else {
        null
    }

fun PrimaryContext.toExpression() : Expression? =
    this.toParenthesized() ?:
    expression()?.toExpression() ?:
    identifier()?.toExpression() ?:
    THIS()?.let { _ -> This(null) } ?:
    /* FIXME: super */
    literal()?.toLiteral() ?: identifier()?.let { id -> SimpleReference(CompoundName(id.text)) }
/* FIXME: typeOrVoid . CLASS */
/* FIXME: nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments) */

fun LiteralContext.toLiteral(): Literal? =
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

fun LocalVariableDeclarationContext.toDeclaration(): Declaration? =
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

fun VariableDeclaratorsContext.toVariableDeclarators(): VariableDeclarators =
    VariableDeclarators(ArrayList(this.variableDeclarator().map { it.toVariableDeclarator() }))

fun VariableDeclaratorContext.toVariableDeclarator(): VariableDeclarator =
    VariableDeclarator(
        this.variableDeclaratorId().identifier().toToken(),
        Dims(ArrayList<Dim>(variableDeclaratorId().LBRACK().size)),
        this.variableInitializer()?.toInitializer()
    )

fun VariableInitializerContext.toInitializer(): Initializer =
    arrayInitializer()?.toInitializerArray()
        ?: InitializerSimple(expression().toExpression())

fun ArrayInitializerContext.toInitializerArray(): InitializerArray =
    InitializerArray(ArrayList(variableInitializer().map { it.toInitializer() }))

fun TypeParametersContext.toTypeParameters(): TypeParameters =
    TypeParameters(ArrayList(this.typeParameter().map { it.toTypeParameter() }))

fun TypeParameterContext.toTypeParameter(): TypeParameter =
    TypeParameter(null /* FIXME */, TypeParameterTail(this.identifier().toToken(), null /* FIXME */))

fun TypeListContext.toTypeList(): TypeList =
    TypeList(ArrayList(this.typeType().map { it.toType() }))

fun TypeTypeContext.toType(): Type =
    when (this) {
        is TypeClassOrInterfaceTypeContext -> this.toType()
        is TypePrimitiveTypeContext -> this.toType()
        else -> throw Exception("not supported") // FIXME: impossible?
    }

fun TypePrimitiveTypeContext.toType(): Type =
    primitiveType().toType() // FIXME: annotations and more?

fun TerminalNode.toPrimitiveType(): PrimitiveType? =
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

fun TypeClassOrInterfaceTypeContext.toType(): Type =
    this.classOrInterfaceType().toType() // FIXME

fun ClassOrInterfaceTypeContext.toType(): Type =
    TypeName(
        CompoundName(this.identifier().map { it.text }),
        this.typeArguments().lastOrNull()
            ?.toTypeArguments()   // FIXME: we use last() since we do not support types like A<B>.C<D>
    )

fun TypeArgumentsContext.toTypeArguments(): TypeArguments =
    TypeArguments(ArrayList(typeArgument().map { it.toTypeArgument() }))

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