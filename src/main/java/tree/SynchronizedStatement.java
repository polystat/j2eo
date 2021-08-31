package tree;

import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | SYNCHRONIZED LPAREN Expression RPAREN Block  // SynchronizedStatement
//    | ...
//    ;
public class SynchronizedStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;
    public ArrayList<BlockStatement> block;

    // Creation
    public SynchronizedStatement(ArrayList<String> ls,
                                 Expression expr,
                                 ArrayList<BlockStatement> block)
    {
        super(ls);
        this.expression = expr;
        this.block = block;
    }

    // Reporting
    public void report(int sh)
    {
    }

    // Generation
    public void generateEO()
    {

    }
}
