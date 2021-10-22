package translator;

import eotree.EOAnonExpr;
import eotree.EODot;
import tree.Expression.Expression;

import java.util.Optional;

public class Expressions {
    public static EOAnonExpr mapExpression(Expression expr) {
        return new EOAnonExpr(
                new EODot(Optional.empty(), "Expr UUID: " + expr.unique)
        );
    }
}
