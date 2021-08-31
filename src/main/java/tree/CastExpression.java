package tree;

import java.util.ArrayList;

// CastExpression
//    : TargetType UnaryExpression
//    | TargetType LambdaExpression
//    ;
//
// TargetType
//    : LPAREN TypeList RPAREN
//    ;
//
// TypeList
//    :                    Type
//    | TypeList AMPERSAND Type
//    ;
public class CastExpression extends Expression
{
    // Structure
    public ArrayList<Type> targetType;
    public Expression expression;

    // Creation
    public CastExpression(ArrayList<Type> tt, Expression expr)
    {
        this.targetType = tt;
        this.expression = expr;
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
