package tree;

import lexer.Span;
import lexer.Token;

// The root class of the whole hierarchy of classes
// representing various Java constructs.
public class Entity
{
    // Entity's unique number
    public long unique;
    // Text coordinates of the entity
    public Span span;

    // All entities created by the program are assigned unique numbers.
    private static long count = 0;

    // Constructors
    public Entity()
    {
        count++;
        unique = count;
    }
    public Entity(Span span)
    {
        this();
        this.span = span;
    }
    public Entity(Token token)
    {
        this();
        this.span = token.span;
    }

    // Machinery for reporting

    public static final int shift = 4;

    public void outUnique()
    {
        System.out.print(unique);
        System.out.print(":");
    }

    public static void doShift(int sh)
    {
        for (int i = 1; i<=sh; i++)
            System.out.print(" ");
    }

    public void title(String n, int sh)
    {
        doShift(sh);
        outUnique();
        System.out.println(n);
    }

    public void report(int sh)
    {

    }

    public void generateEO()
    {

    }
}
