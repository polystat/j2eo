package tree;

import java.util.ArrayList;

// Statement
//    : ...
//    | IfThenElseStatement
//    | ...
//    ;
//
// IfThenElseStatement
//    : IF LPAREN Expression RPAREN Statement ElsePartOpt
//    ;
//
// ElsePartOpt
//    :  // empty
//    | ELSE Statement
//    ;
public class IfThenElseStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression condition;
    public Statement thenPart;
    public Statement elsePart;

    // Creation
    public IfThenElseStatement(ArrayList<String> ls, Expression c, Statement t, Statement e)
    {
        super(ls);
        this.condition = c;
        this.thenPart = t;
        this.elsePart = e;
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
