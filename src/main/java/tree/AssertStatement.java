package tree;

import java.util.ArrayList;

// SimpleStatement
//     ...
//    | ASSERT Expression                  SEMICOLON // AssertStatement
//    | ASSERT Expression COLON Expression SEMICOLON // AssertStatement
//    | ...
//    ;
public class AssertStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;
    public Expression expression2;

    // Creation
    public AssertStatement(ArrayList<String> ls, Expression expr, Expression expr2)
    {
        super(ls);
        this.expression = expr;
        this.expression2 = expr2;
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
