package eotree;

import java.util.List;
import java.util.stream.Collectors;

public class EOCopy extends EOExpr {
    EOExpr      trg;
    List<EOBnd> args;

    public EOCopy(EOExpr trg, List<EOBnd> args) {
        this.trg = trg;
        this.args = args;
    }

    @Override
    public String generateEO(int indent) {
        return trg + args.stream()
                .map(arg -> " " + arg.generateEO(indent))
                .collect(Collectors.joining());
    }
}
