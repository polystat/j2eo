package tree.Expression;

import tree.*;
import tree.Type.Type;
import tree.Declaration.*;

// InstanceofExpression
//    : RelationalExpression INSTANCEOF Type
//    | RelationalExpression INSTANCEOF Pattern
//    ;
public class InstanceOf extends Expression
{
    // Structure
    public Expression expression;
    // Either type OR declaration
    public Type type;
    public Declaration declaration;

    // Creation
    public InstanceOf(Expression expr, Type type)
    {
        this.expression = expr;
        this.type = type;
        this.declaration = null;
    }
    public InstanceOf(Expression expr, Declaration decl)
    {
        this.expression = expr;
        this.type = null;
        this.declaration = decl;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("INSTANCEOF");
        expression.report(sh+Entity.shift);
        if ( type != null ) type.report(sh+Entity.shift);
        else                declaration.report(sh+Entity.shift);
    }

    // Generation
    public void generateEO()
    {

    }

}
