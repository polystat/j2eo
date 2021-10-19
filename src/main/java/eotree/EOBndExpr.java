package eotree;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EOBndExpr extends EOBnd {
    public EOBndName bndName;

    public EOBndExpr(EOExpr expr, EOBndName bndName) {
        super(expr);
        this.bndName = bndName;
    }

    @Override
    public String generateEO(int indent) {
        var lines = expr.generateEO(indent).split("\n");
        // Append attribute name to the first line
        return Stream.concat(
                Arrays.stream(lines)
                        .findFirst()
                        .map(line -> line + " > " + bndName.generateEO(0))
                        .stream(),
                Arrays.stream(lines)
                        .skip(1)
        ).collect(Collectors.joining("\n"));
    }
}
