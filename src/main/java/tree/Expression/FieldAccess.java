package tree.Expression;

import tree.Entity;
import lexer.Token;

// FieldAccess
//    : Primary                DOT IDENTIFIER
//    |                  SUPER DOT IDENTIFIER
//    | CompoundName DOT SUPER DOT IDENTIFIER
//    ;
public class FieldAccess extends Expression
{
    // Structure
    public Expression expression; // Primary or SimpleReference
    public boolean superSign;
    public String identifier;

    // Creation
    public FieldAccess(Expression expr, boolean ss, Token id)
    {
        this.expression = expr;
        this.superSign = ss;
        this.identifier = id.image;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        if ( expression != null )
        {
            expression.report(0);
            if ( superSign ) System.out.print(".");
        }
        else if ( superSign )
        {
            System.out.print("SUPER."+identifier);
        }
    }

    // Generation
    public void generateEO()
    {

    }
}
