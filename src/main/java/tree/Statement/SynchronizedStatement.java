package tree.Statement;

import tree.Statement.Block;
import tree.Expression.*;
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
    public ArrayList<Block> block;

    // Creation
    public SynchronizedStatement(ArrayList<String> ls,
                                 Expression expr,
                                 ArrayList<Block> block)
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
