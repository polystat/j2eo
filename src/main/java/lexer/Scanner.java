package lexer;

import java.nio.file.Files;
import java.nio.file.Paths;
import parser.JavaParser;
import tree.Entity;

/**
 * Used to parse source code into a stream of tokens.
 */
public class Scanner implements JavaParser.Lexer {

    private static final char charZero = '\0';
    private static final Token noToken = new Token(TokenCode.DUMMY);
    private char[] sourceText;

    // Machinery for reading bytes from the source ///////////////////////
    // private int currentLine = 0;
    // private int currentPos = 0;
    private int globalPos = -1;
    private char currentChar = charZero;
    private Token lastToken;
    private Token currentToken;

    public void read(String src) {
        sourceText = src.toCharArray();
    }

    // PUBLIC SCANNER INTERFACE /////////////////////////////

    public boolean readFile(String path) {
        try {
            String text = Files.readString(Paths.get(path));
            text = text.replace("\r\n", "\n").replace("\r", "n");
            sourceText = text.toCharArray();  //.getChars(StandardCharsets.UTF_8);
            return true;
        } catch (Exception exc) {
            System.err.println(exc.getMessage());
            return false;
        }
    }

    private char getChar() {
        if (currentChar == charZero) {
            globalPos++;
            if (globalPos >= sourceText.length) {
                return charZero;
            }
            currentChar = sourceText[globalPos];
        }
        return currentChar;
    }

    private void forgetChar() {
        currentChar = charZero;
    }

    public int yylex() {
        lastToken = get();

        if (Entity.debug) {
            System.out.print(lastToken.code);
            if (lastToken.code == TokenCode.Identifier) {
                System.out.print(" " + lastToken.image);
            }
            System.out.println();
        }
        return lastToken.code.value();
    }

    /////////////////////////////////////////////////////////////


    // Detecting the current token //////////////////////////////

    public Token getLVal() {
        return lastToken;
    }

    @Override
    public void yyerror(String msg) {
        System.err.println(msg);
    }

    public Token get() {
        // if ( currentToken == null ) currentToken = getToken();

        while (true) {
            currentToken = getToken();
            switch (currentToken.code) {
                case ShortComment:
                case LongComment:
                    continue;
                default:
                    return currentToken;
            }
        }
    }

    public void forget() {
        currentToken = noToken;
    }

    private Token getToken() {
        char ch;
        TokenCode code;
        String image;
        Token token;

        // if ( Entity.inBlock && Entity.unAnnotatedTypeTaken )
        // {
        //     Entity.unAnnotatedTypeTaken = false;
        //     return new Token(TokenCode.Phantom,"");
        // }

        while (true) {
            ch = getChar();
            if (ch == charZero) {
                return new Token(TokenCode.EOS, "");
            }
            if (ch == ' ' || ch == '\t') {
                // currentPos++;
                forgetChar();
                continue;
            }
            if (ch == '\n') {
                // currentLine++;
                // currentPos = 0;
                forgetChar();
                continue;
            }
            if (ch == '\r') {
                // currentPos = 0;
                forgetChar();
                continue;
            }
            break;
        }

        switch (ch) {
            case '"':  // String literal
                forgetChar();
                StringBuilder str = new StringBuilder();
                while (true) {
                    ch = getChar();
                    if (ch == '"') {
                        forgetChar();
                        break;
                    }
                    str.append(ch);
                    forgetChar();
                }
                code = TokenCode.StringLiteral;
                image = str.toString();
                break;
            case ':':  //  :  ::
                forgetChar();
                ch = getChar();
                if (ch == ':') {
                    forgetChar();
                    code = TokenCode.DoubleColon;
                    image = "::";
                } else {
                    code = TokenCode.Colon;
                    image = ":";
                }
                break;

            case '.':   //  .  ...
                forgetChar();
                ch = getChar();
                if (ch == '.') {
                    forgetChar();
                    ch = getChar();
                    if (ch == '.') {
                        forgetChar();
                        code = TokenCode.Ellipsis;
                        image = "...";
                    } else {
                        code = TokenCode.ERROR;
                        image = "..";
                    }
                } else {
                    code = TokenCode.Dot;
                    image = ".";
                }
                break;

            // One-char tokens
            case '?':
                forgetChar();
                code = TokenCode.Question;
                image = "?";
                break;
            case ';':
                forgetChar();
                code = TokenCode.Semicolon;
                image = ";";
                break;
            case ',':
                forgetChar();
                code = TokenCode.Comma;
                image = ",";
                break;
            case '(':
                forgetChar();
                code = TokenCode.LeftParenth;
                image = "(";
                break;
            case ')':
                forgetChar();
                code = TokenCode.RightParenth;
                image = ")";
                break;
            case '[':
                forgetChar();
                code = TokenCode.LeftBracket;
                image = "[";
                break;
            case ']':
                forgetChar();
                code = TokenCode.RightBracket;
                image = "]";
                break;
            case '{':
                forgetChar();
                code = TokenCode.LeftBrace;
                image = "{";
                break;
            case '}':
                forgetChar();
                code = TokenCode.RightBrace;
                image = "}";
                break;
            case '@':
                forgetChar();
                code = TokenCode.At;
                image = "@";
                break;
            case '~':
                forgetChar();
                code = TokenCode.Tilde;
                image = "~";
                break;
            case '*':  //  *  *=
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    code = TokenCode.StarAssign;
                    image = "*=";
                } else {
                    code = TokenCode.Star;
                    image = "*";
                }
                break;
            case '/':  //  /  /=  //  /*
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '=' -> {
                        forgetChar();
                        code = TokenCode.SlashAssign;
                        image = "/=";
                    }
                    case '/' -> {
                        forgetChar();
                        code = TokenCode.ShortComment;
                        image = "//" + scanShortComment();
                    }
                    case '*' -> {
                        forgetChar();
                        code = TokenCode.LongComment;
                        image = "/*" + scanLongComment();
                    }
                    default -> {
                        code = TokenCode.Slash;
                        image = "/";
                    }
                }
                break;
            case '%':  //  %  %=
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    code = TokenCode.PercentAssign;
                    image = "%=";
                } else {
                    code = TokenCode.Percent;
                    image = "%";
                }
                break;
            case '+':  //  +  +=  ++
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '+' -> {
                        forgetChar();
                        code = TokenCode.PlusPlus;
                        image = "++";
                    }
                    case '=' -> {
                        forgetChar();
                        code = TokenCode.PlusAssign;
                        image = "+=";
                    }
                    default -> {
                        code = TokenCode.Plus;
                        image = "+";
                    }
                }
                break;
            case '-':  //  -  -=  --  ->
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '=' -> {
                        forgetChar();
                        code = TokenCode.MinusAssign;
                        image = "-=";
                    }
                    case '-' -> {
                        forgetChar();
                        code = TokenCode.MinusMinus;
                        image = "--";
                    }
                    case '>' -> {
                        forgetChar();
                        code = TokenCode.Arrow;
                        image = "->";
                    }
                    default -> {
                        code = TokenCode.Minus;
                        image = "-";
                    }
                }
                break;
            case '=':  //  =  ==  ===
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    ch = getChar();
                    if (ch == '=') {
                        forgetChar();
                        code = TokenCode.EqualDeep;
                        image = "===";
                    } else {
                        code = TokenCode.Equal;
                        image = "==";
                    }
                } else {
                    code = TokenCode.Assign;
                    image = "=";
                }
                break;
            case '<':  //  <  <=  <<  <<=
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '<' -> {
                        forgetChar();
                        ch = getChar();
                        if (ch == '=') {
                            forgetChar();
                            code = TokenCode.LeftShiftAssign;
                            image = "<<=";
                        } else {
                            code = TokenCode.LeftShift;
                            image = "<<";
                        }
                    }
                    case '=' -> {
                        forgetChar();
                        code = TokenCode.LessEqual;
                        image = "<=";
                    }
                    default -> {
                        code = TokenCode.Less;
                        image = "<";
                    }
                }
                break;
            case '>':  //  >  >=  >>  >>=  >>>  >>>=
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '=' -> {
                        forgetChar();
                        code = TokenCode.GreaterEqual;
                        image = ">=";
                    }
                    case '>' -> {
                        forgetChar();
                        ch = getChar();
                        switch (ch) {
                            case '>' -> {
                                forgetChar();
                                ch = getChar();
                                if (ch == '=') {
                                    forgetChar();
                                    code = TokenCode.ArithmRightShiftAssign;
                                    image = ">>>=";
                                } else {
                                    code = TokenCode.ArithmRightShift;
                                    image = ">>>";
                                }
                            }
                            case '=' -> {
                                forgetChar();
                                code = TokenCode.RightShiftAssign;
                                image = ">>=";
                            }
                            default -> {
                                code = TokenCode.RightShift;
                                image = ">>";
                            }
                        }
                    }
                    default -> {
                        code = TokenCode.Greater;
                        image = ">";
                    }
                }
                break;

            case '|':  //  |  ||  |=
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '|' -> {
                        forgetChar();
                        code = TokenCode.DoubleVertical;
                        image = "||";
                    }
                    case '=' -> {
                        forgetChar();
                        code = TokenCode.VerticalAssign;
                        image = "|=";
                    }
                    default -> {
                        code = TokenCode.Vertical;
                        image = "|";
                    }
                }
                break;

            case '&':  //  &  &&  &=
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '&' -> {
                        forgetChar();
                        code = TokenCode.DoubleAmpersand;
                        image = "&&";
                    }
                    case '=' -> {
                        forgetChar();
                        code = TokenCode.AmpersandAssign;
                        image = "&=";
                    }
                    default -> {
                        code = TokenCode.Ampersand;
                        image = "&";
                    }
                }
                break;
            case '^':  //  ^  ^=
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    code = TokenCode.CaretAssign;
                    image = "^=";
                } else {
                    code = TokenCode.Caret;
                    image = "^";
                }
                break;
            case '!':  //  !  !=
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    code = TokenCode.NonEqual;
                    image = "!=";
                } else {
                    code = TokenCode.Negation;
                    image = "!";
                }
                break;

            default:
                if (Character.isJavaIdentifierStart(ch)) {
                    String identifier = "" + ch;
                    while (true) {
                        forgetChar();
                        ch = getChar();
                        if (Character.isJavaIdentifierPart(ch)) {
                            identifier += ch;
                        } else {
                            // forgetChar();
                            break;
                        }
                    }
                    image = identifier;
                    code = detectKeyword(identifier);
                } else if (Character.isDigit(ch)) {
                    String literal = "" + ch;
                    while (true) {
                        forgetChar();
                        ch = getChar();
                        if (Character.isDigit(ch)) {
                            literal = literal.concat("" + ch);
                        } else {
                            // forgetChar();
                            break;
                        }
                    }
                    ch = getChar();
                    if (ch == '.') {
                        literal = literal.concat(".");
                        forgetChar();
                        ch = getChar();
                        while (true) {
                            if (Character.isDigit(ch)) {
                                literal = literal.concat("" + ch);
                            } else {
                                forgetChar();
                                break;
                            }
                        }
                        code = TokenCode.FloatingLiteral;
                    } else {
                        code = TokenCode.IntegerLiteral;
                    }
                    image = literal;
                } else {
                    code = TokenCode.ERROR;
                    image = "" + ch;
                }
                break;
        }
        token = new Token(code, image);
        return token;
    }

    private String scanShortComment() {
        StringBuilder comment = new StringBuilder();
        while (true) {
            char ch = getChar();
            forgetChar();
            if (ch == '\n') {
                break;
            }
            comment.append(ch);
        }
        return comment.toString();
    }

    private String scanLongComment() {
        StringBuilder comment = new StringBuilder();
        while (true) {
            char ch = getChar();
            forgetChar();
            if (ch == '*') {
                forgetChar();
                ch = getChar();
                if (ch == '/') {
                    forgetChar();
                    break;
                } else {
                    comment.append("*").append(ch);
                }
            } else {
                comment.append(ch);
            }
        }
        return comment.toString();
    }

    private TokenCode detectKeyword(String identifier) {
        return switch (identifier) {
            case "abstract" -> TokenCode.Abstract;
            case "assert" -> TokenCode.Assert;
            case "boolean" -> TokenCode.Boolean;
            case "break" -> TokenCode.Break;
            case "byte" -> TokenCode.Byte;
            case "catch" -> TokenCode.Catch;
            case "case" -> TokenCode.Case;
            case "char" -> TokenCode.Char;
            case "class" -> TokenCode.Class;
            //         case "const"    : return TokenCode.Const;   // not actually used
            case "continue" -> TokenCode.Continue;
            case "default" -> TokenCode.Default;
            case "do" -> TokenCode.Do;
            case "double" -> TokenCode.Double;
            case "else" -> TokenCode.Else;
            case "enum" -> TokenCode.Enum;
            case "extends" -> TokenCode.Extends;
            case "final" -> TokenCode.Final;
            case "finally" -> TokenCode.Finally;
            case "float" -> TokenCode.Float;
            case "for" -> TokenCode.For;
            //         case "goto"     : return TokenCode.Goto; // not actually used
            case "if" -> TokenCode.If;
            case "implements" -> TokenCode.Implements;
            case "import" -> TokenCode.Import;
            case "instanceof" -> TokenCode.Instanceof;
            case "int" -> TokenCode.Int;
            case "interface" -> TokenCode.Interface;
            case "long" -> TokenCode.Long;
            case "native" -> TokenCode.Native;
            case "new" -> TokenCode.New;
            case "package" -> TokenCode.Package;
            case "private" -> TokenCode.Private;
            case "protected" -> TokenCode.Protected;
            case "public" -> TokenCode.Public;
            case "return" -> TokenCode.Return;
            case "short" -> TokenCode.Short;
            case "static" -> TokenCode.Static;
            case "strictfp" -> TokenCode.Strictfp;
            case "super" -> TokenCode.Super;
            case "synchronized" -> TokenCode.Synchronized;
            case "switch" -> TokenCode.Switch;
            case "this" -> TokenCode.This;
            case "throw" -> TokenCode.Throw;
            case "throws" -> TokenCode.Throws;
            case "transient" -> TokenCode.Transient;
            case "try" -> TokenCode.Try;
            case "void" -> TokenCode.Void;
            case "volatile" -> TokenCode.Volatile;
            case "while" -> TokenCode.While;
            case "true" -> TokenCode.True;
            case "false" -> TokenCode.False;
            case "null" -> TokenCode.Null;
            case "var" -> TokenCode.Var;
            case "yield" -> TokenCode.Yield;
            case "record" -> TokenCode.Record;

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

            default -> TokenCode.Identifier;
        };
    }
}
