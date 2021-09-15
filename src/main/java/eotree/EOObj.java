package eotree;

import java.util.List;

public class EOObj<T> extends EOExpr<T> {
    List<EOLazyName> freeAttrs;
    List<EOLazyName> varargAttrs;
    List<EOBndExpr<T>> bndAttrs;
}
