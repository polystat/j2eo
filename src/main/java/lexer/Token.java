package lexer;

import tree.Entity;

public class Token extends Entity {

    public Span span;
    public String image;
    public TokenCode code;
    public Object value;

    public Token(TokenCode c) {
        code = c;
    }

    public Token(TokenCode c, String i) {
        this(c);
        image = i;
    }

    public Token(TokenCode c, String i, Object v) {
        this(c, i);
        value = v;
    }

    public void setSpan(Span s) {
        span = s;
    }

    public void report() {
        span.report();
        System.out.print(" " + code.toString() + " ");
        if (image != null) {
            System.out.print(image + " ");
        }
        if (value != null) {
            System.out.print(value);
        }
    }
}

