package tree;

import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | DO Statement WHILE LPAREN Expression RPAREN SEMICOLON // DoStatement
//    | ...
//    ;
public class DoStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Statement statement;
    public Expression condition;

    // Creation
    public DoStatement(ArrayList<String> ls, Statement stmt, Expression cond)
    {
        super(ls);
        this.statement = stmt;
        this.condition = cond;
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
