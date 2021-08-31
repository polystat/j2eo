package tree;

import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | RETURN            SEMICOLON            // ReturnStatement
//    | RETURN Expression SEMICOLON            // ReturnStatement
//	  | ...
//    ;
public class ReturnStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;

    // Creation
    public ReturnStatement(ArrayList<String> ls, Expression expr)
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
