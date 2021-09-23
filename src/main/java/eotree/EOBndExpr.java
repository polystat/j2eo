package eotree;

public class EOBndExpr extends EOBnd {
    public EOBndName bndName;

    public EOBndExpr(EOExpr expr) {
        super(expr);
    }

    @Override
    public String generateEO(int indent) {
        return expr.generateEO(indent) + " > " + bndName;
    }
}
