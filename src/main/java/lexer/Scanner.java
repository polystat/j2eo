package lexer;

import parser.JavaParser;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Scanner implements JavaParser.Lexer
{
    private static String sourcePath;
    private static char[] sourceText;

    public static boolean read(String path)
    {
        sourcePath = path;
        try {
            String text = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
            sourceText = text.toCharArray();  //.getChars(StandardCharsets.UTF_8);
            return true;
        }
        catch(Exception exc)
        {
            System.out.println(exc.getMessage());
            return false;
        }
    }

    // Machinery for reading bytes from the source ///////////////////////

    private static int currentLine = 0;
    private static int currentPos = 0;
    private static int globalPos = -1;
    private static char currentChar = '\0';

    private static char getChar()
    {
        if ( currentChar == '\0' )
        {
            globalPos++;
            if ( globalPos >= sourceText.length ) return '\0';
            currentChar = sourceText[globalPos];
        }
        return currentChar;
    }

    private static void forgetChar()
    {
        currentChar = '\0';
    }

    // PUBLIC SCANNER INTERFACE /////////////////////////////

    private Token lastToken;

    public int yylex()
    {
        lastToken = getToken();

        System.out.println(lastToken.code);

        return lastToken.code.value();
    }

    public Token getLVal()
    {
        return lastToken;
    }

    @Override
    public void yyerror(String msg) {
        System.out.println(msg);
    }

    /////////////////////////////////////////////////////////////


    // Detecting the current token //////////////////////////////

    private static Token currentToken;
    public static Token get()
    {
        if ( currentToken == null ) currentToken = getToken();
        return currentToken;
    }
    public static void forget()
    {
        currentToken = null;
    }

    private static Token getToken()
    {
        char ch;
        TokenCode code;
        String image;
        Token token;

        while ( true )
        {
            ch = getChar();
            if ( ch == '\0' ) { return new Token(TokenCode.EOS,""); }
            if ( ch == ' '  ) {                currentPos++;   forgetChar(); continue; }
            if ( ch == '\t' ) {                currentPos++;   forgetChar(); continue; }
            if ( ch == '\n' ) { currentLine++; currentPos = 0; forgetChar(); continue; }
            if ( ch == '\r' ) {                currentPos = 0; forgetChar(); continue; }
            break;
        }
        switch ( ch )
        {
            case '"':  // String literal
                forgetChar();
                String str = "";
                while ( true )
                {
                    ch = getChar();
                    if ( ch == '"' )
                    {
                        forgetChar();
                        break;
                    }
                    str += ""+ch;
                    forgetChar();
                }
                code = TokenCode.StringLiteral;
                image = str;
                break;
            case ':' :  //  :  ::
                forgetChar(); ch = getChar();
                if ( ch == ':' ) { forgetChar(); code = TokenCode.DoubleColon; image = "::"; }
                else             {               code = TokenCode.Colon; image = ":"; }
                break;

            case '.':   //  .  ...
                forgetChar(); ch = getChar();
                if ( ch == '.')
                {
                    forgetChar(); ch = getChar();
                    if ( ch == '.' ) { forgetChar(); code = TokenCode.Ellipsis; image = "..."; }
                    else             {               code = TokenCode.ERROR; image ="..";  }
                }
                else                 {               code = TokenCode.Dot; image = "."; }
                break;

            // One-char tokens
            case '?': forgetChar(); code = TokenCode.Question;     image = "?"; break;
            case ';': forgetChar(); code = TokenCode.Semicolon;    image = ";"; break;
            case ',': forgetChar(); code = TokenCode.Comma;        image = ","; break;
            case '(': forgetChar(); code = TokenCode.LeftParenth;  image = "("; break;
            case ')': forgetChar(); code = TokenCode.RightParenth; image = ")"; break;
            case '[': forgetChar(); code = TokenCode.LeftBracket;  image = "["; break;
            case ']': forgetChar(); code = TokenCode.RightBracket; image = "]"; break;
            case '{': forgetChar(); code = TokenCode.LeftBrace ;   image = "{"; break;
            case '}': forgetChar(); code = TokenCode.RightBrace;   image = "}"; break;
            case '@': forgetChar(); code = TokenCode.At;           image = "@"; break;
            case '~': forgetChar(); code = TokenCode.Tilde;        image = "~"; break;

            case '*':  //  *  *=
                forgetChar(); ch = getChar();
                if ( ch == '=' ) { forgetChar(); code = TokenCode.StarAssign; image = "*="; }
                else             {               code = TokenCode.Star; image = "*"; }
                break;

            case '/':  //  /  /=  //  /*
                forgetChar(); ch = getChar();
                switch ( ch ) {
                    case '=' : forgetChar(); code = TokenCode.SlashAssign;  image = "/="; break;
                    case '/' : forgetChar(); code = TokenCode.ShortComment; image = "//" + scanShortComment(); break;
                    case '*' : forgetChar(); code = TokenCode.LongComment;  image = "/*" + scanLongComment(); break;
                    default  :               code = TokenCode.Slash;        image = "/"; break;
                }
                break;

            case '%':  //  %  %=
                forgetChar(); ch = getChar();
                if ( ch == '=' ) { forgetChar(); code = TokenCode.PercentAssign; image = "%="; }
                else             {               code = TokenCode.Percent;       image = "%"; }
                break;

            case '+':  //  +  +=  ++
                forgetChar(); ch = getChar();
                switch ( ch ) {
                    case '+': forgetChar(); code = TokenCode.PlusPlus; image = "++"; break;
                    case '=': forgetChar(); code = TokenCode.PlusAssign; image = "+="; break;
                    default:                code = TokenCode.Plus; image = "+"; break;
                }
                break;

            case '-':  //  -  -=  --  ->
                forgetChar(); ch = getChar();
                switch ( ch ) {
                    case '=': forgetChar(); code = TokenCode.MinusAssign; image = "-="; break;
                    case '-': forgetChar(); code = TokenCode.MinusMinus; image = "--"; break;
                    case '>': forgetChar(); code = TokenCode.Arrow; image = "->"; break;
                    default:                code = TokenCode.Minus; image = "-"; break;
                }
                break;

            case '=':  //  =  ==  ===
                forgetChar(); ch = getChar();
                if ( ch == '=' ) {
                    forgetChar(); ch = getChar();
                    if ( ch == '=' ) { forgetChar(); code = TokenCode.EqualDeep; image = "==="; }
                    else             {               code = TokenCode.Equal; image = "=="; }
                }
                else { code = TokenCode.Assign; image = "="; }
                break;

            case '<':  //  <  <=  <<  <<=
                forgetChar(); ch = getChar();
                switch ( ch ) {
                    case '<':
                        forgetChar(); ch = getChar();
                        if ( ch == '=' ) { forgetChar(); code = TokenCode.LeftShiftAssign; image = "<<="; }
                        else             {               code = TokenCode.LeftShift; image = "<<"; }
                        break;
                    case '=':
                        forgetChar(); code = TokenCode.LessEqual; image = "<="; break;
                    default:          code = TokenCode.Less; image = "<"; break;
                }
                break;

            case '>':  //  >  >=  >>  >>=  >>>  >>>=
                forgetChar(); ch = getChar();
                switch ( ch ) {
                    case '=': forgetChar(); code = TokenCode.GreaterEqual; image = ">="; break;
                    case '>' :
                        forgetChar(); ch = getChar();
                        switch ( ch ) {
                            case '>':
                                forgetChar(); ch = getChar();
                                if ( ch == '=' ) { forgetChar(); code = TokenCode.ArithmRightShiftAssign; image = ">>>="; }
                                else             {               code = TokenCode.ArithmRightShift; image = ">>>"; }
                                break;
                            case '=':
                                forgetChar(); code = TokenCode.RightShiftAssign; image = ">>=";  break;
                            default:          code = TokenCode.RightShift; image = ">>"; break;
                        }
                        break;
                    default:
                        code = TokenCode.Greater; image = ">"; break;
                }
                break;

            case '|':  //  |  ||  |=
                forgetChar(); ch = getChar();
                switch ( ch ) {
                    case '|': forgetChar(); code = TokenCode.DoubleVertical; image = "||"; break;
                    case '=': forgetChar(); code = TokenCode.VerticalAssign; image = "|="; break;
                    default:                code = TokenCode.Vertical; image = "|"; break;
                }
                break;

            case '&':  //  &  &&  &=
                forgetChar(); ch = getChar();
                switch ( ch ) {
                    case '&': forgetChar(); code = TokenCode.DoubleAmpersand; image = "&&"; break;
                    case '=': forgetChar(); code = TokenCode.AmpersandAssign; image = "&="; break;
                    default:                code = TokenCode.Ampersand; image = "&"; break;
                }
                break;

            case '^':  //  ^  ^=
                forgetChar(); ch = getChar();
                if ( ch == '=' ) { forgetChar(); code = TokenCode.CaretAssign; image = "^="; }
                else             {               code = TokenCode.Caret; image = "^"; }
                break;

            case '!':  //  !  !=
                forgetChar(); ch = getChar();
                if ( ch == '=' ) { forgetChar(); code = TokenCode.NonEqual; image = "!="; }
                else             {               code = TokenCode.Negation; image = "!"; }
                break;

            default:
                if ( Character.isJavaIdentifierStart(ch) )
                {
                    String identifier = "" + ch;
                    while ( true )
                    {
                        forgetChar(); ch = getChar();
                        if ( Character.isJavaIdentifierPart(ch) )
                            identifier = identifier.concat(""+ch);
                        else  {
                            // forgetChar();
                            break;
                        }
                    }
                    image = identifier;
                    code = detectKeyword(identifier);
                }
                else if ( Character.isDigit(ch) )
                {
                    String literal = "" + ch;
                    while ( true )
                    {
                        forgetChar(); ch = getChar();
                        if ( Character.isDigit(ch) )
                            literal = literal.concat(""+ch);
                        else {
                            forgetChar();
                            break;
                        }
                    }
                    ch = getChar();
                    if ( ch == '.' )
                    {
                        literal = literal.concat(".");
                        forgetChar(); ch = getChar();
                        while ( true )
                        {
                            if ( Character.isDigit(ch) )
                                literal = literal.concat(""+ch);
                            else {
                                forgetChar(); break;
                            }
                        }
                        code = TokenCode.FloatingLiteral;
                    }
                    else
                        code = TokenCode.IntegerLiteral;
                    image = literal;
                }
                else {
                    code = TokenCode.ERROR;
                    image = "" + ch;
                }
                break;
        }
        token = new Token(code,image);
        return token;
    }

    private static String scanShortComment()
    {
        return "";
    }

    private static String scanLongComment()
    {
        return "";
    }

    private static TokenCode detectKeyword(String identifier)
    {
        switch ( identifier ) {
            case "abstract" : return TokenCode.Abstract;
            case "assert"   : return TokenCode.Assert;
            case "boolean"  : return TokenCode.Boolean;
            case "break"    : return TokenCode.Break;
            case "byte"     : return TokenCode.Byte;
            case "catch"    : return TokenCode.Catch;
            case "case"     : return TokenCode.Case;
            case "char"     : return TokenCode.Char;
            case "class"    : return TokenCode.Class;
 //         case "const"    : return TokenCode.Const;   // not actually used
            case "continue" : return TokenCode.Continue;
            case "default"  : return TokenCode.Default;
            case "do"       : return TokenCode.Do;
            case "double"   : return TokenCode.Double;
            case "else"     : return TokenCode.Else;
            case "enum"     : return TokenCode.Enum;
            case "extends"  : return TokenCode.Extends;
            case "final"    : return TokenCode.Final;
            case "finally"  : return TokenCode.Finally;
            case "float"    : return TokenCode.Float;
            case "for"      : return TokenCode.For;
 //         case "goto"     : return TokenCode.Goto; // not actually used
            case "if"       : return TokenCode.If;
            case "implements": return TokenCode.Implements;
            case "import"   : return TokenCode.Import;
            case "instanceof": return TokenCode.Instanceof;
            case "int"      : return TokenCode.Int;
            case "interface": return TokenCode.Interface;
            case "long"     : return TokenCode.Long;
            case "native"   : return TokenCode.Native;
            case "new"      : return TokenCode.New;
            case "package"  : return TokenCode.Package;
            case "private"  : return TokenCode.Private;
            case "protected": return TokenCode.Protected;
            case "public"   : return TokenCode.Public;
            case "return"   : return TokenCode.Return;
            case "short"    : return TokenCode.Short;
            case "static"   : return TokenCode.Static;
            case "strictfp" : return TokenCode.Strictfp;
            case "super"    : return TokenCode.Super;
            case "synchronized": return TokenCode.Synchronized;
            case "switch"   : return TokenCode.Switch;
            case "this"     : return TokenCode.This;
            case "throw"    : return TokenCode.Throw;
            case "throws"   : return TokenCode.Throws;
            case "transient": return TokenCode.Transient;
            case "try"      : return TokenCode.Try;
            case "void"     : return TokenCode.Void;
            case "volatile" : return TokenCode.Volatile;
            case "while"    : return TokenCode.While;

            case "true"     : return TokenCode.True;
            case "false"    : return TokenCode.False;
            case "null"     : return TokenCode.Null;
            case "var"      : return TokenCode.Var;
            case "yield"    : return TokenCode.Yield;
            case "record"   : return TokenCode.Record;

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

                    Yield,
                    Record,
            */

            default: return TokenCode.Identifier;
        }
    }
}
