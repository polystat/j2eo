package eotree;

public abstract class EOBnd extends EONode {
    public EOExpr expr;

    public EOBnd(EOExpr expr) {
        this.expr = expr;
    }
}
