package tree.Declaration;

import lexer.Token;
import tree.Annotations;
import tree.Dims;
import tree.Entity;

// Intermediate class; won't appear in the AST
//
// FormalParameterTail
//    :                           IDENTIFIER DimsOpt
//    | AnnotationSeqOpt ELLIPSIS IDENTIFIER
//    |                  THIS  // receiver
//    | IDENTIFIER DOT   THIS  // receiver
//    ;
public class ParameterTail extends Entity {
    // Structure
    public Annotations annotations;
    public String identifier;
    public Dims dims;
    public boolean ellipsisSign;
    public boolean thisSign;

    // Creation
    public ParameterTail(Annotations anns, Token id, Dims dims, boolean ellSign, boolean thisSign) {
        this.annotations = anns;
        this.identifier = id.image;
        this.dims = dims;
        this.ellipsisSign = ellSign;
        this.thisSign = thisSign;

        if (this.annotations != null) {
            this.annotations.parent = this;
        }
        if (this.dims != null) {
            this.dims.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        // empty
    }

}
