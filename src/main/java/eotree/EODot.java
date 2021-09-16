package eotree;

public class EODot extends EOExpr {
    EOExpr src;
    String name;

    public EODot(EOExpr src, String name) {
        this.src = src;
        this.name = name;
    }

    @Override
    public String generateEO(int indent) {
        return src.generateEO(indent) + "." + name;
    }
}
