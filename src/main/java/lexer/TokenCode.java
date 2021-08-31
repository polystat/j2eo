package lexer;

public enum TokenCode
{
    EOS,
    ERROR,
    ShortComment,
    LongComment,

    Identifier,
    IntegerLiteral,
    FloatingLiteral,

    LeftParenth,       //  (
    RightParenth,      //  )
    LeftBracket,       //  [
    RightBracket,      //  ]
    LeftBrace,         //  {
    RightBrace,        //  }

    At,                //  @
    Dot,               //  .
    Ellipsis,          //  ...
    Colon,             //  :
    DoubleColon,       //  ::
    Semicolon,         //  ;
    Comma,             //  ,
    Question,          //  ?
    Tilde,             //  ~

    Plus,              //  +
    PlusPlus,          //  ++
    PlusAssign,        //  +=
    Minus,             //  -
    MinusMinus,        //  --
    MinusAssign,       //  -=
    Arrow,             //  ->
    Slash,             //  /
    SlashAssign,       //  /=
    Star,              //  *
    StarAssign,        //  *=
    Percent,           //  %
    PercentAssign,     //  %=
    Caret,             //  ^
    CaretAssign,       //  ^=
 // BackSlash,         //  \
    Ampersand,         //  &
    AmpersandAssign,   //  &=
    DoubleAmpersand,   //  &&
    Vertical,          //  |
    VerticalAssign,    //  |=
    DoubleVertical,    //  ||

    Assign,            //  =
    Less,              //  <
    LessEqual,         //  <=
    Greater,           //  >
    GreaterEqual,      //  >=
    Equal,             //  ==
    EqualDeep,         //  ===
    Negation,          //  !
    NonEqual,          //  !=

    LeftShift,         //  <<
    LeftShiftAssign,   //  <<=
    RightShift,        //  >>
    RightShiftAssign,  //  >>=
    ArithmRightShift,  //  >>>
    ArithmRightShiftAssign, // >>>=

    Abstract,
    Assert,
    Base,
    Boolean,
    Break,
    Byte,
    Case,
    Catch,
    Char,
    Class,
    Const,       // not actually used
    Continue,
    Default,
    Do,
    Double,
    Else,
    Enum,
    Extends,
    Final,
    Finally,
    Float,
    For,
    Goto,       // not actually used
    If,
    Implements,
    Import,
    Instanceof,
    Int,
    Interface,
    Long,
    Native,
    Package,
    Private,
    Protected,
    Public,
    New,
    Return,
    Short,
    Static,
    Strictfp,
    Super,
    Synchronized,
    Switch,
    This,
    Throw,
    Throws,
    Transient,
    Try,
    Void,
    Volatile,
    While,
    Underscore,        // _ for future use

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

    // A variety of character sequences are sometimes assumed, incorrectly, to be keywords:
    //
    //  • true and false are not keywords, but rather boolean literals (§3.10.3).
    //  • null is not a keyword, but rather the null literal (§3.10.8).
    //  • var, yield, and record are not keywords, but rather restricted identifiers (§3.8).
    //
    // var has special meaning as the type of a local variable declaration (§14.4) and the
    // type of a lambda formal parameter (§15.27.1). yield has special meaning in a yield
    // statement (§14.21); all invocations of a method named yield must be qualified so as
    // to be distinguished from a yield statement. record has special meaning in a record declaration (§8.10).

    True,
    False,
    Null,

    Var,
    Yield,
    Record,
}
