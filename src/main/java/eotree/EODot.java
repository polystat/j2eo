package eotree;

import java.util.Optional;

public class EODot extends EOExpr {
    public Optional<EOExpr> src;
    public String           name;

    public EODot(Optional<EOExpr> src, String name) {
        this.src = src;
        this.name = name;
    }

    @Override
    public String generateEO(int indent) {
        return
                src
                        .map(eoExpr -> eoExpr.generateEO(indent) + ".")
                        .orElse(indent(indent))
                + name;
    }
}
