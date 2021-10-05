package lexer;

import tree.*;

public class Token extends Entity
{
    public Span span;
    public String image;
    public TokenCode code;
    public Object value;

    public Token(TokenCode c) { code = c; }
    public Token(TokenCode c, String i) { this(c); image = i; }
    public Token(TokenCode c, String i, Object v) { this(c,i); value = v; }

    public void setSpan(Span s) { span = s; }

    public void report()
    {
        span.report();                                  System.out.print(" ");
        System.out.print(code.toString());              System.out.print(" ");
        if ( image != null ) { System.out.print(image); System.out.print(" "); }
        if ( value != null ) System.out.print(value);
    }
}

