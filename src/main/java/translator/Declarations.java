package translator;

import eotree.EOBnd;
import eotree.EOBndExpr;
import tree.Declaration.Declaration;
import tree.Declaration.MethodDeclaration;

public class Declarations {

    public static EOBndExpr mapDeclaration(Declaration dec) {
        if (dec instanceof MethodDeclaration) {
            return Methods.mapMethodDeclaration((MethodDeclaration) dec);
        } else
            throw new IllegalArgumentException("Declaration of type " +
                                               dec.getClass().getSimpleName()
                                               + " is not supported yet");

    }
}
