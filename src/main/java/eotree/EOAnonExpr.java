package eotree;

public class EOAnonExpr extends EOBnd {
    public EOAnonExpr(EOExpr expr) {
        super(expr);
    }

    @Override
    public String generateEO(int indent) {
        return expr.generateEO(indent);
    }
}
