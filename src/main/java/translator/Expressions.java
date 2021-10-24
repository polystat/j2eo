package translator;

import eotree.EOAnonExpr;
import tree.Expression.Expression;
import tree.Expression.Primary.Literal;
import tree.Expression.Primary.MethodInvocation;


public class Expressions {
    public static EOAnonExpr mapExpression(Expression expr) {
        if (expr instanceof MethodInvocation){
            return new EOAnonExpr(MethodInvocations.mapMethodInvocation((MethodInvocation) expr));
        } else if (expr instanceof Literal){
            return new EOAnonExpr(Literals.mapLiteral((Literal) expr));
        }

        throw new IllegalArgumentException("Only MethodInvocation & Literal are supported!");
    }
}
