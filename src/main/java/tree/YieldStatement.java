package tree;

import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | YIELD Expression SEMICOLON      // YieldStatement
//    | ...
//    ;
public class YieldStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;

    // Creation
    public YieldStatement(ArrayList<String> ls, Expression expr)
    {
        super(ls);
        this.expression = expr;
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
