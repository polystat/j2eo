package eotree;

import java.util.List;
import java.util.stream.Collectors;

public class EOCopy extends EOExpr {
    public EOExpr      trg;
    public List<EOBnd> args;

    public EOCopy(EOExpr trg, List<EOBnd> args) {
        this.trg = trg;
        this.args = args;
    }

    @Override
    public String generateEO(int indent) {
        return trg.generateEO(indent) + args.stream()
                .map(arg -> "\n" + arg.generateEO(indent + 1))
                .collect(Collectors.joining());
    }
}
