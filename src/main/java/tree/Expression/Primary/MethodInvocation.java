package tree.Expression.Primary;

import lexer.Token;
import tree.Entity;
import tree.Expression.ArgumentList;
import tree.Expression.Expression;
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
    public String name; // callee
    public ArgumentList arguments;

    // Creation
    public MethodInvocation(Expression q, boolean ss, TypeArguments targs, Token name, ArgumentList args)
    {
        this.qualifier = q;
        this.superSign = ss;
        this.typeArguments = targs;
        this.name = name.image;
        this.arguments = args;
    }

    // Reporting
    public void report(int sh)
    {
        String t = "METHOD INVOCATION: ";
        if ( superSign ) t += "SUPER ";
        title(t+name,sh);
        if ( qualifier != null )
        {
            Entity.doShift(sh);
            System.out.println("Qualifier:");
            qualifier.report(sh+Entity.shift);
        }
        if ( typeArguments != null )
        {
            Entity.doShift(sh+Entity.shift);
            System.out.println("Type arguments:");
            typeArguments.report(sh+Entity.shift);
        }
        if ( arguments != null )
        {
            Entity.doShift(sh+Entity.shift);
            System.out.println("Arguments:");
            arguments.report(sh+Entity.shift);
        }
    }

}
