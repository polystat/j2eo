package tree.Statement;

import tree.Expression.*;
import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | SYNCHRONIZED LPAREN Expression RPAREN Block  // SynchronizedStatement
//    | ...
//    ;
public class Synchronized extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;
    public Block block;

    // Creation
    public Synchronized(ArrayList<String> ls, Expression expr, Block block)
    {
        super(ls);
        this.expression = expr;
        this.block = block;
    }

    // Reporting
    public void report(int sh)
    {
        super.report(sh);
    }

}
