package lexer;

import parser.JavaParser.Lexer;

public enum TokenCode {

    DUMMY(Lexer.YYUNDEF),

    EOS(Lexer.YYEOF),
    ERROR(Lexer.YYerror),
    ShortComment(Lexer.SHORT_COMMENT),
    LongComment(Lexer.LONG_COMMENT),

    // Phantom        (Lexer.PHANTOM),

    Identifier(Lexer.IDENTIFIER),
    IntegerLiteral(Lexer.INTEGER_LITERAL),
    FloatingLiteral(Lexer.FLOATING_POINT_LITERAL),
    StringLiteral(Lexer.STRING_LITERAL),

    LeftParenth(Lexer.LPAREN),            //  (
    RightParenth(Lexer.RPAREN),            //  )
    LeftBracket(Lexer.LBRACKET),          //  [
    RightBracket(Lexer.RBRACKET),          //  ]
    LeftBrace(Lexer.LBRACE),            //  {
    RightBrace(Lexer.RBRACE),            //  }

    At(Lexer.AT),                //  @
    Dot(Lexer.DOT),               //  .
    Ellipsis(Lexer.ELLIPSIS),          //  ...
    Colon(Lexer.COLON),             //  :
    DoubleColon(Lexer.DBL_COLON),         //  ::
    Semicolon(Lexer.SEMICOLON),         //  ;
    Comma(Lexer.COMMA),             //  ,
    Question(Lexer.QUESTION),          //  ?
    Tilde(Lexer.TILDE),             //  ~

    Plus(Lexer.PLUS),              //  +
    PlusPlus(Lexer.DBL_PLUS),          //  ++
    PlusAssign(Lexer.PLUS_EQUAL),        //  +=
    Minus(Lexer.MINUS),             //  -
    MinusMinus(Lexer.DBL_MINUS),         //  --
    MinusAssign(Lexer.MINUS_EQUAL),       //  -=
    Arrow(Lexer.ARROW),             //  ->
    Slash(Lexer.SLASH),             //  /
    SlashAssign(Lexer.SLASH_EQUAL),       //  /=
    Star(Lexer.STAR),              //  *
    StarAssign(Lexer.STAR_EQUAL),        //  *=
    Percent(Lexer.PERCENT),           //  %
    PercentAssign(Lexer.PERCENT_EQUAL),     //  %=
    Caret(Lexer.CARET),             //  ^
    CaretAssign(Lexer.CARET_EQUAL),       //  ^=
    // BackSlash      (Lexer.BACKSLASH),         //  \
    Ampersand(Lexer.AMPERSAND),         //  &
    AmpersandAssign(Lexer.AMP_EQUAL),         //  &=
    DoubleAmpersand(Lexer.DBL_AMPERSAND),     //  &&
    Vertical(Lexer.VERTICAL),          //  |
    VerticalAssign(Lexer.VERTICAL_EQUAL),    //  |=
    DoubleVertical(Lexer.DBL_VERTICAL),      //  ||

    Assign(Lexer.EQUAL),             //  =
    Less(Lexer.LESS),              //  <
    LessEqual(Lexer.LESS_EQUAL),        //  <=
    Greater(Lexer.GREATER),           //  >
    GreaterEqual(Lexer.GREATER_EQUAL),     //  >=
    Equal(Lexer.DBL_EQUAL),         //  ==
    EqualDeep(Lexer.TRIPL_EQUAL),       //  ===
    Negation(Lexer.EXCLAMATION),       //  !
    NonEqual(Lexer.NON_EQUAL),         //  !=

    LeftShift(Lexer.DBL_LESS),          //  <<
    LeftShiftAssign(Lexer.LESS_LESS_EQUAL),   //  <<=
    RightShift(Lexer.DBL_GREATER),       //  >>
    RightShiftAssign(Lexer.GR_GR_EQUAL),      //  >>=
    ArithmRightShift(Lexer.TRIPL_GREATER),    //  >>>
    ArithmRightShiftAssign(Lexer.GR_GR_GR_EQUAL), // >>>=

    Abstract(Lexer.ABSTRACT),
    Assert(Lexer.ASSERT),
    Boolean(Lexer.BOOLEAN),
    Break(Lexer.BREAK),
    Byte(Lexer.BYTE),
    Case(Lexer.CASE),
    Catch(Lexer.CATCH),
    Char(Lexer.CHAR),
    Class(Lexer.CLASS),
    //  Const          (Lexer.CONST),       // not actually used
    Continue(Lexer.CONTINUE),
    Default(Lexer.DEFAULT),
    Do(Lexer.DO),
    Double(Lexer.DOUBLE),
    Else(Lexer.ELSE),
    Enum(Lexer.ENUM),
    Extends(Lexer.EXTENDS),
    Final(Lexer.FINAL),
    Finally(Lexer.FINALLY),
    Float(Lexer.FLOAT),
    For(Lexer.FOR),
    //  Goto           (Lexer.GOTO),       // not actually used
    If(Lexer.IF),
    Implements(Lexer.IMPLEMENTS),
    Import(Lexer.IMPORT),
    Instanceof(Lexer.INSTANCEOF),
    Int(Lexer.INT),
    Interface(Lexer.INTERFACE),
    Long(Lexer.LONG),
    Native(Lexer.NATIVE),
    New(Lexer.NEW),
    Package(Lexer.PACKAGE),
    Private(Lexer.PRIVATE),
    Protected(Lexer.PROTECTED),
    Public(Lexer.PUBLIC),
    Return(Lexer.RETURN),
    Short(Lexer.SHORT),
    Static(Lexer.STATIC),
    Strictfp(Lexer.STRICTFP),
    Super(Lexer.SUPER),
    Synchronized(Lexer.SYNCHRONIZED),
    Switch(Lexer.SWITCH),
    This(Lexer.THIS),
    Throw(Lexer.THROW),
    Throws(Lexer.THROWS),
    Transient(Lexer.TRANSIENT),
    Try(Lexer.TRY),
    Void(Lexer.VOID),
    Volatile(Lexer.VOLATILE),
    While(Lexer.WHILE),
    //  Underscore     (Lexer.UNDERSCORE),        // _ for future use

    // Restricted keywords
    //
    // A further ten character sequences are restricted keywords:
    //
    //   open, module, requires, transitive, exports, opens, to, uses, provides, and with.
    //
    // These character sequences are tokenized as keywords solely where they appear as
    // terminals in the ModuleDeclaration, ModuleDirective, and RequiresModifier
    // productions (§7.7). They are tokenized as identifiers everywhere else, for
    // compatibility with programs written before the introduction of restricted keywords.
    // There is one exception: immediately to the right of the character sequence
    // requires in the ModuleDirective production, the character sequence transitive
    // is tokenized as a keyword unless it is followed by a separator, in which case it is
    // tokenized as an identifier.
    /*
    open,
    module,
    requires,
    transitive,
    exports,
    opens,
    to,
    uses,
    provides,
    with,
    */
    // A variety of character sequences are sometimes assumed, incorrectly, to be keywords:
    //
    //  • true and false are not keywords, but rather boolean literals (§3.10.3).
    //  • null is not a keyword, but rather the null literal (§3.10.8).
    //  • var, yield, and record are not keywords, but rather restricted identifiers (§3.8).
    //
    // var has special meaning as the type of a local variable declaration (§14.4) and the
    // type of a lambda formal parameter (§15.27.1). yield has special meaning in a yield
    // statement (§14.21); all invocations of a method named yield must be qualified so as
    // to be distinguished from a yield statement. record has special meaning
    // in a record declaration (§8.10).

    True(Lexer.FALSE),
    False(Lexer.FALSE),
    Null(Lexer.NULL),

    Var(Lexer.VAR),
    Yield(Lexer.YIELD),
    Record(Lexer.RECORD);

    private final int value;

    TokenCode(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
