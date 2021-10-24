package tree.Expression.Primary;

import lexer.Token;
import tree.CompoundName;
import tree.Entity;
import tree.Expression.ArgumentList;
import tree.Expression.Expression;
import tree.Expression.SimpleReference;
import tree.Type.*;

// MethodInvocation
//    :                                             IDENTIFIER Arguments
//    | CompoundName           DOT TypeArgumentsOpt IDENTIFIER Arguments
//    | Primary                DOT TypeArgumentsOpt IDENTIFIER Arguments
//    |                  SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments
//    | CompoundName DOT SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments
//    ;
public class MethodInvocation extends Primary
{
    // Structure
    public Expression qualifier; // SimpleReference or Primary
    public boolean superSign;
    public TypeArguments typeArguments;
    public String name; // callee; can be null
    public ArgumentList arguments;

    // Creation
    public MethodInvocation(Expression q, boolean ss, TypeArguments targs, Token name, ArgumentList args)
    {
        this.qualifier = q;
        this.superSign = ss;
        this.typeArguments = targs;
        if ( name != null ) this.name = name.image;
        this.arguments = args;
    }

    // Reporting
    public void report(int sh)
    {
        String t = "METHOD INVOCATION: ";
        if ( superSign ) t += "SUPER ";
        if ( name != null )
        {
            t += name;
            title(t,sh);
        }
        else if ( qualifier != null && qualifier instanceof SimpleReference )
        {
            CompoundName cn = ((SimpleReference)qualifier).compoundName;
            Entity.doShift(sh);
            System.out.print(t);
            cn.report(0);
            System.out.println();
        }
        if ( name != null && qualifier != null )
        {
            Entity.doShift(sh);
            System.out.println("Qualifier:");
            qualifier.report(sh+Entity.shift);
        }
        if ( typeArguments != null )
        {
            Entity.doShift(sh+Entity.shift);
            System.out.println("Type arguments:");
            typeArguments.report(sh+2*Entity.shift);
        }
        if ( arguments != null )
        {
            arguments.title("Arguments:",sh+Entity.shift);
            arguments.report(sh+2*Entity.shift);
        }
    }

}
