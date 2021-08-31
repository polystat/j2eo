package lexer;

public class Pos
{
    public long line;
    public int pos;

    public Pos(long l, int p)
    {
        line = l;
        pos = p;
    }

    void report()
    {
        System.out.print(line+":"+pos);
    }
}
