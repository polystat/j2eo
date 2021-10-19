package tree.Statement;

import tree.Entity;
import tree.Expression.*;
import java.util.ArrayList;

// SimpleStatement
//    : ...
//    | YIELD Expression SEMICOLON      // YieldStatement
//    | ...
//    ;
public class Yield extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;

    // Creation
    public Yield(ArrayList<String> ls, Expression expr)
    {
        super(ls);
        this.expression = expr;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("YIELD");
        expression.report(sh+Entity.shift);
    }

}
