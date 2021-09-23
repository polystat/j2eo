package tree.Statement;

import tree.Entity;
import tree.Expression.*;
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
public class IfThenElse extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression condition;
    public Statement thenPart;
    public Statement elsePart;

    // Creation
    public IfThenElse(ArrayList<String> ls, Expression c, Statement t, Statement e)
    {
        super(ls);
        this.condition = c;
        this.thenPart = t;
        this.elsePart = e;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("IF");
        condition.report(sh+Entity.shift);
        System.out.println();
        Entity.doShift(sh);
        System.out.println("THEN");
        thenPart.report(sh+Entity.shift);
        if ( elsePart != null )
        {
            Entity.doShift(sh);
            System.out.println("ELSE");
            elsePart.report(sh+Entity.shift);
        }
    }

    // Generation
    public void generateEO()
    {

    }
}
