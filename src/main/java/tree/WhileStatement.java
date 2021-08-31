package tree;

import java.util.ArrayList;

// WhileStatement
//    : WHILE LPAREN Expression RPAREN Statement
//    ;
public class WhileStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression condition;
    public Statement statement;

    // Creation
    public WhileStatement(ArrayList<String> ls, Expression c, Statement s)
    {
        super(ls);
        this.condition = c;
        this.statement = s;
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
