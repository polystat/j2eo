package translator;

import eotree.EOBnd;
import eotree.EOBndExpr;
import tree.Declaration.ClassDeclaration;
import tree.Declaration.Declaration;
import tree.Declaration.MethodDeclaration;
import tree.Declaration.NormalClassDeclaration;

public class Declarations {

    public static EOBndExpr mapDeclaration(Declaration dec) {
        if (dec instanceof MethodDeclaration) {
            return Methods.mapMethodDeclaration((MethodDeclaration) dec);
        }
        else if (dec instanceof NormalClassDeclaration) {
            return (EOBndExpr) Classes.mapClass((ClassDeclaration) dec);
        } else
            throw new IllegalArgumentException("Declaration of type " +
                                               dec.getClass().getSimpleName()
                                               + " is not supported yet");

    }
}
