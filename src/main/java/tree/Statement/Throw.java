package tree.Statement;

import tree.Entity;
import tree.Expression.*;
import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | THROW Expression SEMICOLON      // ThrowStatement
//    | ...
//    ;
public class Throw extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;

    // Creation
    public Throw(ArrayList<String> ls, Expression expr)
    {
        super(ls);
        this.expression = expr;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("THROW");
        if ( expression != null )
            expression.report(sh+Entity.shift);
    }

    // Generation
    public void generateEO()
    {

    }
}
