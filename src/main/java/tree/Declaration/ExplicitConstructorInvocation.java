package tree.Declaration;

import tree.Entity;
import tree.Expression.*;
import tree.Type.*;

// Intermediate class: won't appear in the AST
//
// ExplicitConstructorInvocation
//    :                  TypeArgumentsOpt THIS  Arguments SEMICOLON
//    |                  TypeArgumentsOpt SUPER Arguments SEMICOLON
//    | CompoundName DOT TypeArgumentsOpt SUPER Arguments SEMICOLON
//    | Primary      DOT TypeArgumentsOpt SUPER Arguments SEMICOLON
//    ;
public class ExplicitConstructorInvocation extends Entity
{
    // Structure
    public Expression expression;
    public TypeArguments typeArguments;
    public boolean thisORsuper;
    public ArgumentList arguments;

    // Creation
    public ExplicitConstructorInvocation(Expression expr, TypeArguments targs, boolean ts, ArgumentList args)
    {
        this.expression = expr;
        this.typeArguments = targs;
        this.thisORsuper = ts;
        this.arguments = args;
    }

    // Reporting
    public void report(int sh)
    {

    }

}
