package tree;

import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | THROW Expression SEMICOLON      // ThrowStatement
//    | ...
//    ;
public class ThrowStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;

    // Creation
    public ThrowStatement(ArrayList<String> ls, Expression expr)
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
