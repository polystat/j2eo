package eotree;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EOObject extends EOExpr {
    public List<EOBndName>     freeAttrs;
    public Optional<EOBndName> varargAttr;
    public List<EOBndExpr>     bndAttrs;

    public EOObject(List<EOBndName> freeAttrs,
                    Optional<EOBndName> varargAttr,
                    List<EOBndExpr> bndAttrs) {
        this.freeAttrs = freeAttrs;
        this.varargAttr = varargAttr;
        this.bndAttrs = bndAttrs;
    }

    @Override
    public String generateEO(int indent) {
        return indent(indent) + "[" +
               freeAttrs.stream()
                       .map(attr -> attr.generateEO(indent))
                       .collect(Collectors.joining(" ")) +
               (varargAttr
                       .map(attr -> " " + attr.generateEO(indent) + "...")
                       .orElse("")) +
               "]\n" +
               bndAttrs.stream()
                       .map(attr -> attr.generateEO(indent + 1))
                       .collect(Collectors.joining("\n"));
    }
}
