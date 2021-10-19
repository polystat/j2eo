package tree.Statement;

import tree.Entity;
import tree.Expression.*;
import java.util.ArrayList;

// SimpleStatement
//     ...
//    | ASSERT Expression                  SEMICOLON // AssertStatement
//    | ASSERT Expression COLON Expression SEMICOLON // AssertStatement
//    | ...
//    ;
public class Assert extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;
    public Expression expression2;

    // Creation
    public Assert(ArrayList<String> ls, Expression expr, Expression expr2)
    {
        super(ls);
        this.expression = expr;
        this.expression2 = expr2;
    }

    // Reporting
    public void report(int sh)
    {
        title("ASSERT",sh);
        expression.report(sh+Entity.shift);
        if ( expression2 != null )
        {
            System.out.println();
            Entity.doShift(sh);
            System.out.println("DIAG");
            expression2.report(sh+Entity.shift);
        }
    }

}
