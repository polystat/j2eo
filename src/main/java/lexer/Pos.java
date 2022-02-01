package lexer;

/**
 * Represents a position of a token inside a source code.
 */
public class Pos {

    private long line;
    private int symbol;

    public Pos(long l, int p) {
        line = l;
        symbol = p;
    }

    void report() {
        System.out.print(getLine() + ":" + getSymbol());
    }

    public long getLine() {
        return line;
    }

    public void setLine(long line) {
        this.line = line;
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }
}
