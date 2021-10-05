
//// Tokens ////////////////////////

%token <Token> LPAREN     //  (
%token <Token> RPAREN     //  )
%token <Token> LBRACE     //  {
%token <Token> RBRACE     //  }
%token <Token> LBRACKET   //  [
%token <Token> RBRACKET   //  ]
%token <Token> COMMA      //  ,
%token <Token> DOT        //  .
%token <Token> SEMICOLON  //  ;
%token <Token> COLON
%token <Token> DBL_COLON
%token <Token> STAR
%token <Token> SLASH
%token <Token> PERCENT
%token <Token> AMPERSAND    //  &
%token <Token> AT           //  @
%token <Token> LESS         //  <
%token <Token> GREATER      //  >
%token <Token> VERTICAL     //  |
%token <Token> PLUS         //  +
%token <Token> MINUS        //  -
%token <Token> ARROW        //  ->
%token <Token> DIAMOND      //  <>
%token <Token> QUESTION     //  ?
%token <Token> CARET        //  ^
%token <Token> EQUAL        //  =
%token <Token> TILDE        //  ~
%token <Token> EXCLAMATION  //  !

%token <Token> ELLIPSIS     //  ...

%token <Token> LESS_EQUAL          //  <=
%token <Token> GREATER_EQUAL       //  >=
%token <Token> STAR_EQUAL          //  *=
%token <Token> SLASH_EQUAL         //  /=
%token <Token> PERCENT_EQUAL       //  %=
%token <Token> PLUS_EQUAL          //  +=
%token <Token> MINUS_EQUAL         //  -=
%token <Token> LESS_LESS_EQUAL     //  <<=
%token <Token> GR_GR_EQUAL         //  >>=
%token <Token> GR_GR_GR_EQUAL      //  >>>=
%token <Token> AMP_EQUAL           //  &=
%token <Token> CARET_EQUAL         //  ^=
%token <Token> VERTICAL_EQUAL      //  |=

%token <Token> DBL_PLUS            //  ++
%token <Token> DBL_MINUS           //  --
%token <Token> DBL_VERTICAL        //  ||
%token <Token> DBL_AMPERSAND       //  &&
%token <Token> DBL_EQUAL           //  ==
%token <Token> NON_EQUAL           //  !=
%token <Token> DBL_LESS            //  <<
%token <Token> DBL_GREATER         //  >>
%token <Token> TRIPL_GREATER       //  >>>

%token <Token> IDENTIFIER
%token <Token> INTEGER_LITERAL
%token <Token> FLOATING_POINT_LITERAL
%token <Token> CHARACTER_LITERAL
%token <Token> STRING_LITERAL

%token <Token> ABSTRACT
%token <Token> ASSERT
%token <Token> BOOLEAN
%token <Token> BREAK
%token <Token> BYTE
%token <Token> CASE
%token <Token> CATCH
%token <Token> CHAR
%token <Token> CLASS
%token <Token> CONTINUE
%token <Token> DEFAULT
%token <Token> DO
%token <Token> DOUBLE
%token <Token> ELSE
%token <Token> ENUM
%token <Token> EXTENDS
%token <Token> FALSE
%token <Token> FINAL
%token <Token> FINALLY
%token <Token> FLOAT
%token <Token> FOR
%token <Token> IF
%token <Token> IMPLEMENTS
%token <Token> IMPORT
%token <Token> INSTANCEOF
%token <Token> INT
%token <Token> INTERFACE
%token <Token> LONG
%token <Token> MODULE
%token <Token> NEW
%token <Token> NULL
%token <Token> OPEN
%token <Token> PACKAGE
%token <Token> PRIVATE
%token <Token> PROTECTED
%token <Token> PUBLIC
%token <Token> RECORD
%token <Token> RETURN
%token <Token> SHORT
%token <Token> STATIC
%token <Token> STRICTFP
%token <Token> SUPER
%token <Token> SWITCH
%token <Token> SYNCHRONIZED
%token <Token> THIS
%token <Token> THROW
%token <Token> THROWS
%token <Token> TRANSIENT
%token <Token> TRANSITIVE
%token <Token> TRUE
%token <Token> TRY
%token <Token> VAR
%token <Token> VOID
%token <Token> VOLATILE
%token <Token> WHILE
%token <Token> YIELD

%start CompilationUnit


%language "Java"
%define api.parser.class {JavaParser}
%define api.parser.public
%define api.package {parser}
%define api.value.type {Entity}

%code imports { import lexer.*; }
%code imports { import tree.*; }
%code imports { import tree.Compilation.*; }
%code imports { import tree.Declaration.*; }
%code imports { import tree.Expression.*; }
%code imports { import tree.Expression.Primary.*; }
%code imports { import tree.Statement.*; }
%code imports { import tree.Type.*; }

// Nonterminal types
// =================

%nterm <CompoundName> CompoundName
%nterm <Annotation> Annotation
%nterm <Annotations> AnnotationSeq AnnotationSeqOpt
%nterm <AnnoParameterList> AnnoParameterList

%nterm <Token> StandardModifier
%nterm <StandardModifiers> StandardModifierSeq
%nterm <Modifiers> ModifierSeq ModifierSeqOpt

%nterm <tree.Compilation.CompilationUnit> CompilationUnit Package
%nterm <tree.Compilation.Module> Module

%nterm <tree.Declaration.ImportDeclaration> ImportDeclaration
%nterm <tree.Declaration.ImportDeclarations> ImportDeclarationSeq ImportDeclarationSeqOpt

%nterm <tree.Compilation.TopLevelComponent> TopLevelComponent
%nterm <tree.Compilation.TopLevelComponents> TopLevelComponentSeq TopLevelComponentSeqOpt

%nterm <Dims> Dims DimsOpt
%nterm <Dim> Dim

%nterm <tree.Type.TypeArgument> TypeArgument
%nterm <tree.Type.TypeArguments> TypeArguments TypeArgumentList TypeArgumentsOpt

%nterm <TypeParameter> TypeParameter
%nterm <TypeParameterTail> TypeParameterTail
%nterm <TypeParameters> TypeParameterList TypeParameters TypeParametersOpt

%nterm <tree.Declaration.Declaration> EnumDeclaration ClassDeclaration NormalClassDeclaration
                     InterfaceDeclaration NormalInterfaceDeclaration RecordDeclaration
                     AnnotationInterfaceDeclaration Pattern InterfaceMemberDeclaration
                     ClassBodyDeclaration PureBodyDeclaration FieldDeclaration MethodDeclaration
                     ConstantDeclaration InterfaceMethodDeclaration BlockDeclaration
                     LocalVariableDeclaration

%nterm <ConstructorDeclaration> ConstructorDeclaration
%nterm <Declarations> InterfaceMemberDeclarationSeq InterfaceBody ClassBodyDeclarationSeq ClassBody ClassBodyOpt

%nterm <tree.Type.Type> Type ClassExtendsOpt
%nterm <tree.Type.UnannotatedType> UnannotatedType
%nterm <Token> PrimitiveType AssignmentOperator Literal

%nterm <tree.Type.TypeList> TypeList TargetType ClassTypeList1 ClassTypeList2 ClassImplementsOpt
                            InterfaceExtends InterfaceExtendsOpt ThrowsOpt CatchType

%nterm <AnnoElementValue> ElementValue

%nterm <tree.Expression.Expression> Expression ExpressionOpt Assignment AssignmentExpression ConditionalExpression
                    SwitchExpression PostfixExpression Primary UnaryExpression UnaryExpressionNotPlusMinus
                    InstanceofExpression CastExpression LambdaExpression
                    LeftHandSide FieldAccess ArrayAccess StatementExpression
                    MethodInvocation MethodReference ArrayCreationExpression ClassInstanceCreationExpression

%nterm<tree.Expression.Binary> ConditionalOrTail ConditionalOrExpression ConditionalAndExpression
               InclusiveOrExpression ExclusiveOrExpression AndExpression EqualityExpression RelationalExpression
               ShiftExpression AdditiveExpression MultiplicativeExpression

%nterm <StatementExpressions> StatementExpressionList StatementExpressionListOpt

%nterm <UnaryPrefix> PreIncrementExpression PreDecrementExpression
%nterm <UnaryPostfix> PostIncrementExpression PostDecrementExpression

%nterm <tree.Expression.ArgumentList> Arguments ArgumentList

%nterm <ParameterDeclaration> LambdaParameter FormalParameter
%nterm <ParameterDeclarations> LambdaParameters LambdaParameterList1 LambdaParameterList2 FormalParameterList
%nterm <ParameterTail> FormalParameterTail
%nterm <tree.Statement.Statement> Statement SimpleStatement LabeledStatement
                                  IfThenElseStatement WhileStatement ForStatement ElsePartOpt
                                  BasicForStatement EnhancedForStatement
%nterm <tree.Statement.Block> Block
%nterm <tree.Statement.BlockStatement> BlockStatement
%nterm <tree.Statement.BlockStatements> BlockStatementSeq

%nterm <CatchParameter> CatchFormalParameter
%nterm <CatchClause> CatchClause
%nterm <CatchClauses> Catches CatchesOpt

%nterm <ConstructorBody> ConstructorBody
%nterm <ConstructorDeclarator> ConstructorDeclarator
%nterm <ExplicitConstructorInvocation> ExplicitConstructorInvocation

%nterm <VariableDeclarator> VariableDeclarator
%nterm <VariableDeclarators> VariableDeclaratorList

%nterm <Initializer> ArrayInitializer VariableInitializerListOpt VariableInitializerList VariableInitializer

%nterm <SwitchBlock> SwitchBlock
%nterm <SwitchRule> SwitchRule
%nterm <SwitchRules> SwitchRuleSeq
%nterm <SwitchLabel> SwitchLabel CaseExpressionList
%nterm <SwitchLabels> SwitchLabelSeq

%%

//// Literals ////////////////////////////////////////////////

Literal
    : INTEGER_LITERAL         { $$ = $1; }
    | FLOATING_POINT_LITERAL  { $$ = $1; }
    | TRUE                    { $$ = $1; }  // BOOLEAN_LITERAL
    | FALSE                   { $$ = $1; }  // BOOLEAN_LITERAL
    | CHARACTER_LITERAL       { $$ = $1; }
    | STRING_LITERAL          { $$ = $1; }
//  | TextBlock                             // ???
    | NULL                    { $$ = $1; }  // NullLiteral
    ;

//// Basic Constructs ////////////////////////////////////////

CompoundName
    :                  IDENTIFIER { $$ = new CompoundName($1.image); }
    | CompoundName DOT IDENTIFIER { $$ = $1.add($3.image); }
    ;

ModifierSeqOpt
    : %empty       { $$ = null; }
    | ModifierSeq  { $$ = $1; }
    ;

ModifierSeq
    :               StandardModifierSeq { $$ = new Modifiers(null,$1); }
    | AnnotationSeq StandardModifierSeq { $$ = new Modifiers($1,$2); }
    ;

StandardModifierSeq
    :                     StandardModifier { $$ = new StandardModifiers($1); }
    | StandardModifierSeq StandardModifier { $$ = $1.add($2); }
    ;

StandardModifier
//  : Annotation
	: DEFAULT       { $$ = $1; }
    | FINAL         { $$ = $1; }
    | PUBLIC        { $$ = $1; }
    | PROTECTED     { $$ = $1; }
    | PRIVATE       { $$ = $1; }
    | ABSTRACT      { $$ = $1; }
    | STATIC        { $$ = $1; }
    | STRICTFP      { $$ = $1; }
    | SYNCHRONIZED  { $$ = $1; }
    | TRANSIENT     { $$ = $1; }
    | VOLATILE      { $$ = $1; }
    | OPEN          { $$ = $1; }  // for modules only
    ;

//// Compilation units, Packages and Modules ////////////////////

CompilationUnit
    : %empty                                        { $$ = null; }
    | Package                                       { $$ = $1; }
    | Module                                        { $$ = $1; }
    | ImportDeclarationSeqOpt TopLevelComponentSeq  { $$ = new SimpleCompilationUnit($1,$2); }
    ;

Package
    : PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt
                                                    { $$ = new tree.Compilation.Package($2,$4,$5); }
    ;

/////// Java modules are not supported (yet)
///////
Module
    : ModifierSeqOpt MODULE CompoundName LBRACE ModuleDirectiveSeqOpt RBRACE { $$ = null; }  // not implemented
    ;

ImportDeclarationSeqOpt
    : %empty                                     { $$ = null; }
    | ImportDeclarationSeq                       { $$ = $1; }
    ;

ImportDeclarationSeq
    :                         ImportDeclaration  { $$ = new ImportDeclarations($1); }
    | ImportDeclarationSeqOpt ImportDeclaration  { $$ = $1.add($2); }
    ;

ImportDeclaration
    : IMPORT        CompoundName          SEMICOLON  { $$ = new ImportDeclaration(false,$2,false); }
    | IMPORT STATIC CompoundName          SEMICOLON  { $$ = new ImportDeclaration(true,$3,false); }
    | IMPORT        CompoundName DOT STAR SEMICOLON  { $$ = new ImportDeclaration(false,$2,true); }
    | IMPORT STATIC CompoundName DOT STAR SEMICOLON  { $$ = new ImportDeclaration(true,$3,true); }
    ;

TopLevelComponentSeqOpt
    : %empty                { $$ = null; }
    | TopLevelComponentSeq  { $$ = $1; }
    ;

TopLevelComponentSeq
    :                      ModifierSeqOpt TopLevelComponent { $2.addModifiers($1); $$ = new TopLevelComponents($2); }
    | TopLevelComponentSeq ModifierSeqOpt TopLevelComponent { $3.addModifiers($2); $$ = $1.add($3); }
    ;

TopLevelComponent
    : ClassDeclaration     { $$ = $1; }
    | InterfaceDeclaration { $$ = $1; }
    ;

/////// Java modules are not supported (yet)
///////

ModuleDirectiveSeqOpt
    : %empty              //{ $$ = null; }
    | ModuleDirectiveSeq  //{ $$ = $1; }
    ;

ModuleDirectiveSeq
    :                    ModuleDirective
    | ModuleDirectiveSeq ModuleDirective
    ;

ModuleDirective
    : "requires" RequiresModifierSeqOpt CompoundName SEMICOLON
	| "exports"  CompoundName                        SEMICOLON
	| "exports"  CompoundName "to" ModuleNameList    SEMICOLON
	| "opens"    CompoundName                        SEMICOLON
	| "opens"    CompoundName "to" ModuleNameList    SEMICOLON
    | "uses"     CompoundName                        SEMICOLON
	| "provides" CompoundName "with" ModuleNameList  SEMICOLON
    ;

ModuleNameList
    :                      CompoundName
    | ModuleNameList COMMA CompoundName
    ;

RequiresModifierSeqOpt
    : %empty
    | TRANSITIVE
    | TRANSITIVE STATIC
	| STATIC
	| STATIC TRANSITIVE
    ;

//// Types //////////////////////////

// Type
//    : PrimitiveType
//    | ReferenceType
//    ;

Type
    :               UnannotatedType { $$ = $1; }
    | AnnotationSeq UnannotatedType { $$ = $2.addAnnotations($1); }
    ;

UnannotatedType
    : PrimitiveType              { $$ = new PrimitiveType($1); }
	  // ReferenceType
    | CompoundName               { $$ = new TypeName($1,null); }
    | CompoundName TypeArguments { $$ = new TypeName($1,$2); }
	  // ArrayType
	| UnannotatedType Dim        { $$ = $1.addDimension($2); }
    ;

//PrimitiveType
//  : AnnotationSeqOpt UnannPrimitiveType
//  ;

PrimitiveType
      // NumericType -- IntegralType
    : BYTE       { $$ = $1; }
    | SHORT      { $$ = $1; }
    | INT        { $$ = $1; }
    | LONG       { $$ = $1; }
    | CHAR       { $$ = $1; }
	  // NumericType -- FloatingPointType
    | FLOAT      { $$ = $1; }
    | DOUBLE     { $$ = $1; }
    | BOOLEAN    { $$ = $1; }
    ;

//ReferenceType
// : ClassType  // class or interface type
// | AnnotationSeqOpt IDENTIFIER // TypeVariable
// | ArrayType
// ;

//ClassType
//  :  CompoundName
//  |  CompoundName TypeArguments
//  ;

//ArrayType
//  : Type Dims
//  ;

//// Classes ////////////////////////

ClassDeclaration
    : NormalClassDeclaration   { $$ = $1; }
    | EnumDeclaration          { $$ = $1; }
    | RecordDeclaration        { $$ = $1; }
    ;

NormalClassDeclaration
    : /*ModifierSeqOpt*/ CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody
                              { $$ = new NormalClassDeclaration($2,$3,$4,$5,$6); }
    ;

TypeParametersOpt
    : %empty           { $$ = null; }
    | TypeParameters   { $$ = $1; }
    ;

TypeParameters
    : LESS TypeParameterList GREATER  { $$ = $2; }
    ;

TypeParameterList
    :                         TypeParameter { $$ = new TypeParameters($1); }
    | TypeParameterList COMMA TypeParameter { $$ = $1.add($3); }
    ;

//TypeParameter
//    : AnnotationSeqOpt IDENTIFIER
//    | AnnotationSeqOpt IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER
//    | AnnotationSeqOpt IDENTIFIER EXTENDS ClassTypeList2
//    ;

TypeParameter
    : AnnotationSeq TypeParameterTail { $$ = new TypeParameter($1,$2); }
    |               TypeParameterTail { $$ = new TypeParameter(null,$1); }
    ;

TypeParameterTail
    : IDENTIFIER                                      { $$ = new TypeParameterTail($1,null); }
    | IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER  { $$ = new TypeParameterTail($1,$3,$4); }
    | IDENTIFIER EXTENDS ClassTypeList2               { $$ = new TypeParameterTail($1,$3); }
    ;

ClassExtendsOpt
    : %empty        { $$ = null; }
    | EXTENDS Type  { $$ = $2; }
    ;

ClassImplementsOpt
    : %empty                     { $$ = null; }
    | IMPLEMENTS ClassTypeList1  { $$ = $2; }
    ;

ClassTypeList1
    :                      Type { $$ = new TypeList($1); }
    | ClassTypeList1 COMMA Type { $$ = $1.add($3); }
    ;

ClassTypeList2
    :                          Type { $$ = new TypeList($1); }
    | ClassTypeList2 AMPERSAND Type { $$ = $1.add($3); }
    ;

ClassBodyOpt
    : %empty        { $$ = null; }
    | ClassBody     { $$ = $1; }
    ;

ClassBody
    : LBRACE                         RBRACE  { $$ = null; }
	| LBRACE ClassBodyDeclarationSeq RBRACE  { $$ = $2; }
    ;

ClassBodyDeclarationSeq
    :                         ClassBodyDeclaration { $$ = new Declarations($1); }
    | ClassBodyDeclarationSeq ClassBodyDeclaration { $$ = $1.add($2); }
    ;

ClassBodyDeclaration
    : ModifierSeqOpt PureBodyDeclaration { $$ = $2.addModifiers($1); }
    |        Block    { $$ = new ClassInitializer($1,false); }     // InstanceInitializer
    | STATIC Block    { $$ = new ClassInitializer($2,true); }      // StaticInitializer
    | SEMICOLON       { $$ = null; }
 	;

PureBodyDeclaration
    : FieldDeclaration         { $$ = $1; }  // ClassMemberDeclaration
    | MethodDeclaration        { $$ = $1; }  // ClassMemberDeclaration
    | ClassDeclaration         { $$ = $1; }  // ClassMemberDeclaration
    | InterfaceDeclaration     { $$ = $1; }  // ClassMemberDeclaration
    | ConstructorDeclaration   { $$ = $1; }
    ;

//// Constructors ///////////////////////////////////////

ConstructorDeclaration
    : /*ModifierSeqOpt*/ ConstructorDeclarator ThrowsOpt ConstructorBody
                            { $$ = new ConstructorDeclaration(null,$1.typeParameters,$1.formalParameters,
                                                              $2,$3.invocation,$3.block); }
    ;

ConstructorDeclarator
    : TypeParametersOpt IDENTIFIER LPAREN FormalParameterList/*FormalParameters*/ RPAREN
                                      { $$ = new ConstructorDeclarator($1,$4); }
    ;

ConstructorBody
    : LBRACE                                                 RBRACE { $$ = new ConstructorBody(null,null); }
    | LBRACE ExplicitConstructorInvocation                   RBRACE { $$ = new ConstructorBody($2,null); }
    | LBRACE                               BlockStatementSeq RBRACE { $$ = new ConstructorBody(null,new Block(null,$2)); }
    | LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE { $$ = new ConstructorBody($2,new Block(null,$3)); }
    ;

ExplicitConstructorInvocation
    :                  TypeArgumentsOpt THIS  Arguments SEMICOLON { $$ = new ExplicitConstructorInvocation(null,$1,false,$3); }
    |                  TypeArgumentsOpt SUPER Arguments SEMICOLON { $$ = new ExplicitConstructorInvocation(null,$1,true,$3); }
    | CompoundName DOT TypeArgumentsOpt SUPER Arguments SEMICOLON { Expression expr = new SimpleReference($1);
                                                                    $$ = new ExplicitConstructorInvocation(expr,$3,true,$5); }
    | Primary      DOT TypeArgumentsOpt SUPER Arguments SEMICOLON { $$ = new ExplicitConstructorInvocation($1,$3,true,$5); }
    ;

//// EnumDeclaration ////////////////////////////////////

EnumDeclaration
    : /*ModifierSeqOpt*/ ENUM IDENTIFIER ClassImplementsOpt EnumBody { $$ = null; }
    ;

EnumBody
    : LBRACE EnumConstantListOpt       EnumBodyDeclarationsOpt RBRACE
    | LBRACE EnumConstantListOpt COMMA EnumBodyDeclarationsOpt RBRACE
    ;

EnumConstantListOpt
    : %empty
    |                           EnumConstant
    | EnumConstantListOpt COMMA EnumConstant
    ;

EnumConstant
    : AnnotationSeqOpt IDENTIFIER Arguments
    | AnnotationSeqOpt IDENTIFIER Arguments ClassBody
    ;

EnumBodyDeclarationsOpt
    : %empty
    | SEMICOLON
    | SEMICOLON ClassBodyDeclarationSeq
    ;

//// RecordDeclaration //////////////////////////////////

RecordDeclaration
    : /*ModifierSeqOpt*/ RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody { $$ = null; }
    ;

RecordHeader
    : LPAREN RecordComponentListOpt RPAREN
    ;

RecordComponentListOpt
    : %empty
    |                              RecordComponent
    | RecordComponentListOpt COMMA RecordComponent
    ;

RecordComponent
    : AnnotationSeqOpt UnannotatedType IDENTIFIER
    | AnnotationSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER // VariableArityRecordComponent
    ;

RecordBody
    : LBRACE                          RBRACE
    | LBRACE RecordBodyDeclarationSeq RBRACE
    ;

RecordBodyDeclarationSeq
    :                          RecordBodyDeclaration
    | RecordBodyDeclarationSeq RecordBodyDeclaration
    ;

RecordBodyDeclaration
    : ClassBodyDeclaration
    | ModifierSeqOpt IDENTIFIER ConstructorBody // CompactConstructorDeclaration
    ;

//// FieldDeclaration ///////////////////////////////////

FieldDeclaration
    : /*ModifierSeqOpt*/ UnannotatedType VariableDeclaratorList SEMICOLON { $$ = new TypeAndDeclarators($1,$2); }
    ;

VariableDeclaratorList
    :                              VariableDeclarator { $$ = new VariableDeclarators($1); }
    | VariableDeclaratorList COMMA VariableDeclarator { $$ = $1.add($3); }
    ;

VariableDeclarator
    : IDENTIFIER                              { $$ = new VariableDeclarator($1,null,null); }
    | IDENTIFIER      EQUAL Expression        { $$ = new VariableDeclarator($1,null,$3); }
    | IDENTIFIER Dims                         { $$ = new VariableDeclarator($1,$2,null); }
    | IDENTIFIER Dims EQUAL ArrayInitializer  { $$ = new VariableDeclarator($1,$2,$4); }
    ;

ArrayInitializer
    : LBRACE VariableInitializerListOpt       RBRACE { $$ = $2; }
    | LBRACE VariableInitializerListOpt COMMA RBRACE { $$ = $2; }
    ;

VariableInitializerListOpt
    : %empty                    { $$ = null; }
    | VariableInitializerList   { $$ = $1; }
    ;

VariableInitializerList
    :                               VariableInitializer { $$ = new InitializerArray($1); }
    | VariableInitializerList COMMA VariableInitializer { $$ = $1.add($3); }
    ;

VariableInitializer
    : Expression        { $$ = new InitializerSimple($1); }
    | ArrayInitializer  { $$ = $1; }
    ;

//// MethodDeclaration ////////////////////////////////

MethodDeclaration
    : MethodHeader MethodBody { $$ = null; }  // not implemented yet
	;

//MethodHeader
//    : TypeParameters AnnotationSeq Result MethodDeclarator ThrowsOpt
//    | TypeParameters               Result MethodDeclarator ThrowsOpt
//    |                              Result MethodDeclarator ThrowsOpt
//    ;

MethodHeader
    : TypeParameters               Type            MethodDeclarator ThrowsOpt
    | TypeParameters AnnotationSeq VOID            MethodDeclarator ThrowsOpt
    | TypeParameters               UnannotatedType MethodDeclarator ThrowsOpt
    | TypeParameters               VOID            MethodDeclarator ThrowsOpt
    |                              UnannotatedType MethodDeclarator ThrowsOpt
    |                              VOID            MethodDeclarator ThrowsOpt
    ;

//Result
//    : UnannotatedType
//    | VOID
//    ;

MethodDeclarator
    : IDENTIFIER LPAREN                                          RPAREN DimsOpt
    | IDENTIFIER LPAREN FormalParameterList /*FormalParameters*/ RPAREN DimsOpt
    ;

//FormalParameters
//    : ReceiverParameter COMMA FormalParameterList
//    |                         FormalParameterList
//    ;
//
//ReceiverParameter
//    : AnnotationSeqOpt UnannotatedType                THIS
//    | AnnotationSeqOpt UnannotatedType IDENTIFIER DOT THIS
//    ;

FormalParameterList
    :                           FormalParameter { $$ = new ParameterDeclarations($1); }
    | FormalParameterList COMMA FormalParameter { $$ = $1.add($3);}
    ;

FormalParameter
    : ModifierSeq UnannotatedType FormalParameterTail { $$ = ParameterDeclaration.create($1,$2,$3); }
    |             UnannotatedType FormalParameterTail { $$ = ParameterDeclaration.create(null,$1,$2); }
    ;

FormalParameterTail
    :                           IDENTIFIER DimsOpt { $$ = new ParameterTail(null,$1,$2,false,false); }
    | AnnotationSeqOpt ELLIPSIS IDENTIFIER         { $$ = new ParameterTail($1,$3,null,true,false); }
    |                  THIS                        { $$ = new ParameterTail(null,null,null,false,true); } // receiver
    | IDENTIFIER DOT   THIS                        { $$ = new ParameterTail(null,$1,null,false,true); }   // receiver
    ;

//FormalParameter
//    : ModifierSeqOpt UnannotatedType                           IDENTIFIER DimsOpt
//    | ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER // VariableArityParameter
//
//    | AnnotationSeqOpt UnannotatedType                THIS
//    | AnnotationSeqOpt UnannotatedType IDENTIFIER DOT THIS
//    ;

ThrowsOpt
    : %empty                 { $$ = null; }
    | THROWS ClassTypeList1  { $$ = $2; }
    ;

MethodBody
    : Block
    | SEMICOLON
    ;

////             //////////////////////////////////

DimsOpt
    : %empty     { $$ = null; }
    | Dims       { $$ = $1; }
    ;

Dims
    :      Dim  { $$ = new Dims($1); }
    | Dims Dim  { $$ = $1.add($2); }
    ;

Dim
    : AnnotationSeq LBRACKET RBRACKET { $$ = new Dim($1); }
    |               LBRACKET RBRACKET { $$ = new Dim(null); }
    ;

//// InterfaceDeclaration ////////////////////////

InterfaceDeclaration
    : NormalInterfaceDeclaration      { $$ = $1; }
    | AnnotationInterfaceDeclaration  { $$ = null; }  // not implemented
    ;

NormalInterfaceDeclaration
    : INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody
                                         { $$ = new NormalInterfaceDeclaration($2,$3,$4,$5); }
    ;

InterfaceExtendsOpt
    : %empty            { $$ = null; }
    | InterfaceExtends  { $$ = $1; }
    ;

InterfaceExtends
    : EXTENDS Type                 { $$ = new TypeList($2); }
    | InterfaceExtends COMMA Type  { $$ = $1.add($3); }
    ;

InterfaceBody
    : LBRACE                               RBRACE { $$ = null; }
    | LBRACE InterfaceMemberDeclarationSeq RBRACE { $$ = $2; }
    ;

InterfaceMemberDeclarationSeq
    :                               ModifierSeqOpt InterfaceMemberDeclaration { $$ = new Declarations($2.addModifiers($1)); }
    | InterfaceMemberDeclarationSeq ModifierSeqOpt InterfaceMemberDeclaration { $$ = $1.add($3.addModifiers($2)); }
    ;

InterfaceMemberDeclaration
    : ConstantDeclaration         { $$ = $1; }
    | InterfaceMethodDeclaration  { $$ = $1; }
    | ClassDeclaration            { $$ = $1; }
    | InterfaceDeclaration        { $$ = $1; }
    ;

ConstantDeclaration
    : Type VariableDeclaratorList SEMICOLON { $$ = new TypeAndDeclarators($1,$2); }
    ;

InterfaceMethodDeclaration
    : MethodHeader MethodBody { $$ = null; } // not implemented yet
    ;

AnnotationInterfaceDeclaration
    : AT INTERFACE IDENTIFIER AnnotationInterfaceBody { $$ = null; }
    ;

AnnotationInterfaceBody
    : LBRACE                                         RBRACE
    | LBRACE AnnotationInterfaceMemberDeclarationSeq RBRACE
    ;

AnnotationInterfaceMemberDeclarationSeq
    :                                         ModifierSeqOpt AnnotationInterfaceMemberDeclaration
    | AnnotationInterfaceMemberDeclarationSeq ModifierSeqOpt AnnotationInterfaceMemberDeclaration
    ;

AnnotationInterfaceMemberDeclaration
    : AnnotationInterfaceElementDeclaration
    | ConstantDeclaration
    | ClassDeclaration
    | InterfaceDeclaration
    ;

AnnotationInterfaceElementDeclaration
    : UnannotatedType IDENTIFIER LPAREN RPAREN DimsOpt DefaultValueOpt SEMICOLON
    ;

DefaultValueOpt
    : %empty
    | DEFAULT ElementValue
    ;

//// Blocks & Statements /////////////////////////////////////

Block
    : LBRACE                   RBRACE { $$ = null; }
    | LBRACE BlockStatementSeq RBRACE { $$ = $2; }
    ;

BlockStatementSeq
	:                   BlockStatement { $$ = new BlockStatements($1); }
    | BlockStatementSeq BlockStatement { $$ = $1.add($2); }
    ;

BlockStatement
    : ModifierSeqOpt BlockDeclaration { $$ = new BlockStatement($2.addModifiers($1)); }
    | Statement                       { $$ = $1; }
    ;

BlockDeclaration
    : ClassDeclaration                   { $$ = $1; } // LocalClassOrInterfaceDeclaration
    | NormalInterfaceDeclaration         { $$ = $1; } // LocalClassOrInterfaceDeclaration
    | LocalVariableDeclaration SEMICOLON { $$ = $1; } // LocalVariableDeclarationStatement
    ;

LocalVariableDeclaration
    : UnannotatedType VariableDeclaratorList { $$ = new TypeAndDeclarators($1,$2); }
    | VAR             VariableDeclaratorList { $$ = new TypeAndDeclarators(null,$2); }
    ;

Statement
    : SimpleStatement
    | LabeledStatement
    | IfThenElseStatement
    | WhileStatement
    | ForStatement
    ;

SimpleStatement
    : Block                             { $$ = $1; }
	| SEMICOLON                         { $$ = null; }                         // EmptyStatement
    | StatementExpression SEMICOLON     { $$ = new StatementExpression($1); }  // ExpressionStatement

    | ASSERT Expression                  SEMICOLON { $$ = new Assert(null,$2,null); } // AssertStatement
    | ASSERT Expression COLON Expression SEMICOLON { $$ = new Assert(null,$2,$4); }   // AssertStatement

    | SWITCH LPAREN Expression RPAREN SwitchBlock  { $$ = null; } // not implemented yet  // SwitchStatement
    | DO Statement WHILE LPAREN Expression RPAREN SEMICOLON { $$ = new Do(null,$2,$5); } // DoStatement

    | BREAK            SEMICOLON  { $$ = new Break(null,null); }           // BreakStatement
    | BREAK IDENTIFIER SEMICOLON  { $$ = new Break(null,$2); }             // BreakStatement

    | CONTINUE             SEMICOLON  { $$ = new Continue(null,null); }       // ContinueStatement
    | CONTINUE IDENTIFIER  SEMICOLON  { $$ = new Continue(null,$2); }         // ContinueStatement

    | RETURN            SEMICOLON     { $$ = new Return(null,null); }         // ReturnStatement
    | RETURN Expression SEMICOLON     { $$ = new Return(null,$2); }           // ReturnStatement

    | SYNCHRONIZED LPAREN Expression RPAREN Block  { $$ = new Synchronized(null,$3,$5); } // SynchronizedStatement

    | THROW Expression SEMICOLON  { $$ = new Throw(null,$2); }    // ThrowStatement
    | YIELD Expression SEMICOLON  { $$ = new Yield(null,$2); }    // YieldStatement

      // TryStatement
    | TRY Block Catches            { $$ = null; } // not implemented yet
    | TRY Block Catches Finally    { $$ = null; } // not implemented yet
    | TRY Block         Finally    { $$ = null; } // not implemented yet
    | TRY ResourceSpecification Block CatchesOpt FinallyOpt // TryWithResourcesStatement
                                   { $$ = null; } // not implemented yet
    ;

LabeledStatement
    : IDENTIFIER COLON Statement { $$ = $3.addLabel($1); }
    ;

StatementExpression
    : Assignment                   { $$ = $1; }
    | PreIncrementExpression       { $$ = $1; }
    | PreDecrementExpression       { $$ = $1; }
    | PostIncrementExpression      { $$ = $1; }
    | PostDecrementExpression      { $$ = $1; }
    | MethodInvocation             { $$ = $1; }
    | ClassInstanceCreationExpression  { $$ = $1; }
    ;

IfThenElseStatement
    : IF LPAREN Expression RPAREN Statement ElsePartOpt { $$ = null; } // not implemented yet
    ;

ElsePartOpt
    : %empty          { $$ = null; }
    | ELSE Statement  { $$ = $2; }
    ;

SwitchBlock
    : LBRACE SwitchRuleSeq                                  RBRACE { $$ = null; } // not implemented yet
    | LBRACE SwitchBlockStatementGroupSeqOpt                RBRACE { $$ = null; } // not implemented yet
    | LBRACE SwitchBlockStatementGroupSeqOpt SwitchLabelSeq RBRACE { $$ = null; } // not implemented yet
    ;

SwitchRuleSeq
    :               SwitchRule { $$ = new SwitchRules($1); }
    | SwitchRuleSeq SwitchRule { $$ = $1.add($2); }
    ;

SwitchRule
    : SwitchLabel ARROW Expression SEMICOLON        { $$ = new SwitchRule($1,$3); }
    | SwitchLabel ARROW Block                       { $$ = new SwitchRule($1,$3); }
    | SwitchLabel ARROW THROW Expression SEMICOLON  { $$ = new SwitchRule($1,new Throw(null,$4)); } // ThrowStatement
    ;

SwitchBlockStatementGroupSeqOpt
    : %empty
    |                                 SwitchBlockStatementGroup
    | SwitchBlockStatementGroupSeqOpt SwitchBlockStatementGroup
    ;

SwitchBlockStatementGroup
    : SwitchLabelSeq
    | SwitchLabelSeq BlockStatementSeq
    ;

SwitchLabelSeq
    :                SwitchLabel COLON { $$ = new SwitchLables($2); }
    | SwitchLabelSeq SwitchLabel COLON { $$ = $1.add($2); }
    ;

SwitchLabel
    : CASE CaseExpressionList  { $$ = $2; }
	| DEFAULT                  { $$ = null; }
    ;

CaseExpressionList
    :                          AssignmentExpression { $$ = new SwitchLabel($1); }
    | CaseExpressionList COMMA AssignmentExpression { $$ = $1.add($3); }
    ;

//CaseConstant
//    : Expression // ConditionalExpression

WhileStatement
    : WHILE LPAREN Expression RPAREN Statement  { $$ = new While(null,$3,$5); }
    ;

ForStatement
    : BasicForStatement    { $$ = $1; }
    | EnhancedForStatement { $$ = $1; }
    ;

BasicForStatement
    : FOR LPAREN ForInitOpt SEMICOLON ExpressionOpt SEMICOLON StatementExpressionListOpt RPAREN Statement
                          { $$ = null; } // not implemented yet
    ;

ForInitOpt
    : %empty
    | StatementExpressionList
    | LocalVariableDeclaration
    ;

ExpressionOpt
    : %empty      { $$ = null; }
    | Expression  { $$ = $1; }
    ;

// ForUpdate
//    : StatementExpressionList

StatementExpressionList
    :                               StatementExpression { $$ = new StatementExpressions($1); }
    | StatementExpressionList COMMA StatementExpression { $$ = $1.add($3); }
    ;

StatementExpressionListOpt
    : %empty                   { $$ = null; }
    | StatementExpressionList  { $$ = $1; }
    ;

EnhancedForStatement
    : FOR LPAREN LocalVariableDeclaration COLON Expression RPAREN Statement { $$ = null; } // not implemented yet
    ;

CatchesOpt
    : %empty   { $$ = null; }
    | Catches  { $$ = $1; }
    ;

Catches
    :         CatchClause   { $$ = new CatchClauses($1); }
    | Catches CatchClause   { $$ = $1.add($2); }
    ;

CatchClause
    : CATCH LPAREN CatchFormalParameter RPAREN Block { $$ = new CatchClause($3,$5); }
    ;

CatchFormalParameter
    : ModifierSeqOpt CatchType IDENTIFIER DimsOpt { $$ = new CatchParameter($1,$2,$3,$4); }
    ;

CatchType
    :                    Type { $$ = new TypeList($1); }
    | CatchType VERTICAL Type { $$ = $1.add($3); }
    ;

FinallyOpt
    : %empty
    | Finally
    ;

Finally
    : FINALLY Block
    ;

ResourceSpecification
    : LPAREN ResourceSeq           RPAREN
    | LPAREN ResourceSeq SEMICOLON RPAREN
    ;

ResourceSeq
    :                       Resource
    | ResourceSeq SEMICOLON Resource
    ;

Resource
    : LocalVariableDeclaration
    | FieldAccess  // VariableAccess? - doesn't exist in the grammar?
    ;

Pattern
    : LocalVariableDeclaration  // TypePattern

//// Primaries /////////////////////////////////

// Primary:
//    PrimaryNoNewArray
//    ArrayCreationExpression

Primary
    : Literal                           { $$ = $1; }
    | Type DimsOpt DOT CLASS            { $$ = new ClassLiteral($1,$2); }   // ClassLiteral
    | VOID DimsOpt DOT CLASS            { $$ = new ClassLiteral(null,$2); } // ClassLiteral
    | THIS                              { $$ = new This(null); }
    | Type DOT THIS                     { $$ = new This($1); }
    | LPAREN Expression RPAREN          { $$ = new Parenthesized($2); }
    | ClassInstanceCreationExpression   { $$ = null; } // not implemented yet
    | FieldAccess                       { $$ = $1; }
    | ArrayAccess                       { $$ = $1; }
    | MethodInvocation                  { $$ = $1; }  // not implemented yet
    | MethodReference                   { $$ = $1; }  // not implemented yet
    | ArrayCreationExpression           { $$ = $1; }  // not implemented yet
    ;

//ClassLiteral:
//	TypeName	 { [ ] }	. class
//	NumericType { [ ] }	. class
//	boolean	 { [ ] }	. class
//	void			. class

ClassInstanceCreationExpression
    :                  UnqualifiedClassInstanceCreationExpression { $$ = null; } // not implemented yet
    | CompoundName DOT UnqualifiedClassInstanceCreationExpression { $$ = null; } // not implemented yet
    | Primary      DOT UnqualifiedClassInstanceCreationExpression { $$ = null; } // not implemented yet
    ;

UnqualifiedClassInstanceCreationExpression
    : NEW TypeArgumentsOpt ClassOrInterfaceTypeToInstantiate Arguments ClassBodyOpt
    ;

ClassOrInterfaceTypeToInstantiate
    : AnnotatedCompoundName TypeArgumentsOpt
    | AnnotatedCompoundName DIAMOND
    ;

AnnotatedCompoundName
    :                           AnnotationSeqOpt /*AnnotationOpt*/ IDENTIFIER
    | AnnotatedCompoundName DOT AnnotationSeqOpt /*AnnotationOpt*/ IDENTIFIER
    ;

TypeArgumentsOpt
    : %empty          { $$ = null; }
    | TypeArguments   { $$ = $1; }
    ;

TypeArguments
    : LESS TypeArgumentList GREATER  { $$ = $2; }
    ;

TypeArgumentList
    :                        TypeArgument  { $$ = new TypeArguments($1); }
    | TypeArgumentList COMMA TypeArgument  { $$ = $1.add($3); }
    ;

TypeArgument
    : Type                                     { $$ = new TypeArgument($1,0,null); }
    |               QUESTION                   { $$ = new TypeArgument(null,1,null); }
    |               QUESTION EXTENDS Type      { $$ = new TypeArgument($3,1,null); }
    |               QUESTION SUPER   Type      { $$ = new TypeArgument($3,2,null); }
    | AnnotationSeq QUESTION                   { $$ = new TypeArgument(null,1,$1); }
    | AnnotationSeq QUESTION EXTENDS Type      { $$ = new TypeArgument($4,2,$1); }
    | AnnotationSeq QUESTION SUPER   Type      { $$ = new TypeArgument($4,3,$1); }
    ;
/*
WildcardBoundsOpt
    : %empty
    | EXTENDS Type
    | SUPER   Type
    ;
*/
FieldAccess
    : Primary                DOT IDENTIFIER  { $$ = new FieldAccess($1,  false,$3); }
    |                  SUPER DOT IDENTIFIER  { $$ = new FieldAccess(null,true, $3); }
    | CompoundName DOT SUPER DOT IDENTIFIER  { $$ = new FieldAccess(new SimpleReference($1),true,$5); }
    ;

ArrayAccess
    : CompoundName LBRACKET Expression RBRACKET  { $$ = new ArrayAccess(new SimpleReference($1),$3); }
    | Primary      LBRACKET Expression RBRACKET  { $$ = new ArrayAccess($1,$3); }
    ;

MethodInvocation
    :                                             IDENTIFIER Arguments { $$ = null; } // not implemented yet
    | CompoundName           DOT TypeArgumentsOpt IDENTIFIER Arguments { $$ = null; } // not implemented yet
    | Primary                DOT TypeArgumentsOpt IDENTIFIER Arguments { $$ = null; } // not implemented yet
    |                  SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments { $$ = null; } // not implemented yet
    | CompoundName DOT SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments { $$ = null; } // not implemented yet
    ;

Arguments
    : LPAREN              RPAREN { $$ = null; }
    | LPAREN ArgumentList RPAREN { $$ = $2; }
    ;

//ArgumentListOpt
//    :  // empty
//    | ArgumentList
//    ;

ArgumentList
    :                    Expression { $$ = new ArgumentList($1); }
    | ArgumentList COMMA Expression { $$ = $1.add($3); }
    ;

MethodReference
    : CompoundName      DBL_COLON TypeArgumentsOpt IDENTIFIER { $$ = null; } // not implemented yet
    | Primary           DBL_COLON TypeArgumentsOpt IDENTIFIER { $$ = null; } // not implemented yet
    | Type              DBL_COLON TypeArgumentsOpt IDENTIFIER { $$ = null; } // not implemented yet
    |             SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER { $$ = null; } // not implemented yet
    | Type    DOT SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER { $$ = null; } // not implemented yet
    | Type              DBL_COLON TypeArgumentsOpt NEW        { $$ = null; } // not implemented yet
    ;

ArrayCreationExpression
    : NEW Type DimExprs DimsOpt        { $$ = null; } // not implemented yet
    | NEW Type Dims ArrayInitializer   { $$ = null; } // not implemented yet
    ;

DimExprs
    :          DimExpr
    | DimExprs DimExpr
    ;

DimExpr
    :               LBRACKET Expression RBRACKET
    | AnnotationSeq LBRACKET Expression RBRACKET
    ;

//// Expressions //////////////////////////////////////////////////

Expression
    : LambdaExpression      { $$ = $1; }
    | AssignmentExpression  { $$ = $1; }
    ;

LambdaExpression
    : IDENTIFIER       ARROW Expression
                        { $$ = new Lambda(new ParameterDeclarations(new ParameterDeclaration($1)),$3); }
    | IDENTIFIER       ARROW Block
                        { $$ = new Lambda(new ParameterDeclarations(new ParameterDeclaration($1)),$3); }
    | LambdaParameters ARROW Expression  { $$ = new Lambda($1,$3); }
    | LambdaParameters ARROW Block       { $$ = new Lambda($1,$3); }
    ;

//LambdaBody
//   : Expression
//   | Block
//   ;

LambdaParameters
    : LPAREN                      RPAREN   { $$ = null; }
    | LPAREN LambdaParameterList1 RPAREN   { $$ = $2; }
    | LPAREN LambdaParameterList2 RPAREN   { $$ = $2; }
//  | IDENTIFIER
    ;

LambdaParameterList1
    :                            IDENTIFIER  { $$ = new ParameterDeclarations(new ParameterDeclaration($1)); }
    | LambdaParameterList1 COMMA IDENTIFIER  { $$ = $1.add(new ParameterDeclaration($3)); }
    ;

LambdaParameterList2
    :                            LambdaParameter { $$ = new ParameterDeclarations($1); }
    | LambdaParameterList2 COMMA LambdaParameter { $$ = $1.add($3); }
    ;

//LambdaParameter
//    :                                    IDENTIFIER
//    | ModifierSeqOpt LambdaParameterType IDENTIFIER DimsOpt
//    | ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  // VariableArityParameter
//    ;

LambdaParameter
//  :                                IDENTIFIER
    : ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt  { $$ = new ParameterDeclaration($1,$2,$3.image,null,false,$4); }
    | ModifierSeqOpt VAR             IDENTIFIER DimsOpt  { $$ = new ParameterDeclaration($1,null,$3.image,null,false,$4); }
    | ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER
                                                         { $$ = new ParameterDeclaration($1,$2,$5.image,$3,true,null); }
                                                         // VariableArityParameter
    ;

//LambdaParameterType
//    : UnannotatedType
//    | VAR
//    ;

AssignmentExpression
    : ConditionalExpression  { $$ = $1; }
    | Assignment             { $$ = $1; }
    ;

Assignment
    : LeftHandSide AssignmentOperator Expression { $$ = new Binary($1,$3,$2); }
    ;

LeftHandSide
    : CompoundName { $$ = new SimpleReference($1); }
    | FieldAccess  { $$ = $1; }
    | ArrayAccess  { $$ = $1; }
    ;

AssignmentOperator
    : EQUAL             { $$ = $1; }  //  =
    | STAR_EQUAL        { $$ = $1; }  //  *=
    | SLASH_EQUAL       { $$ = $1; }  //  /=
    | PERCENT_EQUAL     { $$ = $1; }  //  %=
    | PLUS_EQUAL        { $$ = $1; }  //  +=
    | MINUS_EQUAL       { $$ = $1; }  //  -=
    | LESS_LESS_EQUAL   { $$ = $1; }  //  <<=
    | GR_GR_EQUAL       { $$ = $1; }  //  >>=
    | GR_GR_GR_EQUAL    { $$ = $1; }  //  >>>=
    | AMP_EQUAL         { $$ = $1; }  //  &=
    | CARET_EQUAL       { $$ = $1; }  //  ^=
    | VERTICAL_EQUAL    { $$ = $1; }  //  |=
    ;

ConditionalExpression
    : ConditionalOrExpression ConditionalOrTail { if ( $2 == null ) $$ = $1;
                                                  else              $$ = new Conditional($1,$2.left,$2.right); }
    ;

ConditionalOrTail
    : %empty                                           { $$ = null; }
    | QUESTION Expression COLON ConditionalExpression  { $$ = new Binary($2,$4,null); }
    | QUESTION Expression COLON LambdaExpression       { $$ = new Binary($2,$4,null); }
    ;

ConditionalOrExpression
    :                                      ConditionalAndExpression { $$ = $1; }
    | ConditionalOrExpression DBL_VERTICAL ConditionalAndExpression { $$ = new Binary($1,$3,$2); }
    ;

ConditionalAndExpression
    :                                        InclusiveOrExpression { $$ = $1; }
    | ConditionalAndExpression DBL_AMPERSAND InclusiveOrExpression { $$ = new Binary($1,$3,$2); }
    ;

InclusiveOrExpression
    :                                ExclusiveOrExpression { $$ = $1; }
    | InclusiveOrExpression VERTICAL ExclusiveOrExpression { $$ = new Binary($1,$3,$2); }
    ;

ExclusiveOrExpression
    :                             AndExpression { $$ = $1; }
    | ExclusiveOrExpression CARET AndExpression { $$ = new Binary($1,$3,$2); }
    ;

AndExpression
    :                         EqualityExpression { $$ = $1; }
    | AndExpression AMPERSAND EqualityExpression { $$ = new Binary($1,$3,$2); }
    ;

EqualityExpression
    :                              RelationalExpression { $$ = $1; }
    | EqualityExpression DBL_EQUAL RelationalExpression { $$ = new Binary($1,$3,$2); }
    | EqualityExpression NON_EQUAL RelationalExpression { $$ = new Binary($1,$3,$2); }
    ;

RelationalExpression
    :                                    ShiftExpression { $$ = $1; }
    | RelationalExpression LESS          ShiftExpression { $$ = new Binary($1,$3,$2); }
    | RelationalExpression GREATER       ShiftExpression { $$ = new Binary($1,$3,$2); }
    | RelationalExpression LESS_EQUAL    ShiftExpression { $$ = new Binary($1,$3,$2); }
    | RelationalExpression GREATER_EQUAL ShiftExpression { $$ = new Binary($1,$3,$2); }
    | InstanceofExpression                               { $$ = $1; }
    ;

InstanceofExpression
    : RelationalExpression INSTANCEOF Type     { $$ = new InstanceOf($1,$3); }
    | RelationalExpression INSTANCEOF Pattern  { $$ = new InstanceOf($1,$3); }
    ;

ShiftExpression
    :                               AdditiveExpression { $$ = $1; }
    | ShiftExpression DBL_LESS      AdditiveExpression { $$ = new Binary($1,$3,$2); }
    | ShiftExpression DBL_GREATER   AdditiveExpression { $$ = new Binary($1,$3,$2); }
    | ShiftExpression TRIPL_GREATER AdditiveExpression { $$ = new Binary($1,$3,$2); }
    ;

AdditiveExpression
    :                          MultiplicativeExpression { $$ = $1; }
    | AdditiveExpression PLUS  MultiplicativeExpression { $$ = new Binary($1,$3,$2); }
    | AdditiveExpression MINUS MultiplicativeExpression { $$ = new Binary($1,$3,$2); }
    ;

MultiplicativeExpression
    :                                  UnaryExpression { $$ = $1; }
    | MultiplicativeExpression STAR    UnaryExpression { $$ = new Binary($1,$3,$2); }
    | MultiplicativeExpression SLASH   UnaryExpression { $$ = new Binary($1,$3,$2); }
    | MultiplicativeExpression PERCENT UnaryExpression { $$ = new Binary($1,$3,$2); }
    ;

UnaryExpression
    : PreIncrementExpression      { $$ = $1; }
    | PreDecrementExpression      { $$ = $1; }
    | PLUS UnaryExpression        { $$ = new UnaryPrefix($1,$2); }
    | MINUS UnaryExpression       { $$ = new UnaryPrefix($1,$2); }
    | UnaryExpressionNotPlusMinus { $$ = $1; }
    ;

PreIncrementExpression
    : DBL_PLUS UnaryExpression { $$ = new UnaryPrefix($1,$2); }
    ;

PreDecrementExpression
    : DBL_MINUS UnaryExpression  { $$ = new UnaryPrefix($1,$2); }
    ;

UnaryExpressionNotPlusMinus
    : PostfixExpression
    | TILDE       UnaryExpression { $$ = new UnaryPrefix($1,$2); }
    | EXCLAMATION UnaryExpression { $$ = new UnaryPrefix($1,$2); }
    | CastExpression              { $$ = $1; }
    | SwitchExpression            { $$ = $1; }
    ;

PostfixExpression
    : Primary                  { $$ = $1; }
    | CompoundName             { $$ = new SimpleReference($1); } // ExpressionName
    | PostIncrementExpression  { $$ = $1; }
    | PostDecrementExpression  { $$ = $1; }
    ;

PostIncrementExpression
    : PostfixExpression DBL_PLUS { $$ = new UnaryPostfix($2,$1); }
    ;

PostDecrementExpression
    : PostfixExpression DBL_MINUS { $$ = new UnaryPostfix($2,$1); }
    ;

CastExpression
    : TargetType UnaryExpression   { $$ = new Cast($1,$2); }
    | TargetType LambdaExpression  { $$ = new Cast($1,$2); }
    ;

TargetType
    : LPAREN TypeList RPAREN { $$ = $2; }
    ;

TypeList
    :                    Type { $$ = new TypeList($1); }
    | TypeList AMPERSAND Type { $$ = $1.add($3); }
    ;

SwitchExpression
    : SWITCH LPAREN Expression RPAREN SwitchBlock { $$ = new SwitchExpression($3,$5); }
    ;


//// Annotations /////////////////////////////////
/*
AnnotationOpt
    : // empty
    | Annotation
    ;
*/
AnnotationSeqOpt
    : %empty           { $$ = null; }
    | AnnotationSeq    { $$ = $1; }
    ;

AnnotationSeq
    :               Annotation  { $$ = new Annotations($1); }
    | AnnotationSeq Annotation  { $$ = $1.add($2); }
    ;

Annotation
    : AT CompoundName                                  { $$ = new Annotation($2,(AnnoParameterList)null); }
    | AT CompoundName LPAREN                   RPAREN  { $$ = new Annotation($2,(AnnoParameterList)null); }
    | AT CompoundName LPAREN AnnoParameterList RPAREN  { $$ = new Annotation($2,/*$4*/ (AnnoParameterList)null); }   // not implemented
    | AT CompoundName LPAREN ElementValue      RPAREN  { $$ = new Annotation($2,(AnnoElementValue)null); } // not implemented
    ;

AnnoParameterList
    :                         IDENTIFIER EQUAL ElementValue { $$ = null; } // not implemented yet
    | AnnoParameterList COMMA IDENTIFIER EQUAL ElementValue { $$ = null; } // not implemented yet
    ;

ElementValue
    : ConditionalExpression                      { $$ = null; }  // not implemented yet
    | LBRACE ElementValueListOpt        RBRACE   { $$ = null; }  // not implemented yet
    | LBRACE                      COMMA RBRACE   { $$ = null; }  // not implemented yet
    | Annotation                                 { $$ = null; }  // not implemented yet
    ;

ElementValueListOpt
    : %empty
    |                           ElementValue
    | ElementValueListOpt COMMA ElementValue
    ;

%%

