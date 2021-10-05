package eotree;

public class EOBndExpr extends EOBnd {
    public EOBndName bndName;

    public EOBndExpr(EOExpr expr, EOBndName bndName) {
        super(expr);
        this.bndName = bndName;
    }

    @Override
    public String generateEO(int indent) {
        return expr.generateEO(indent) + " > " + bndName.generateEO(0);
    }
}
