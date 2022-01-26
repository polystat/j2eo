package tree.Type;

import lexer.Token;
import tree.Annotations;
import tree.Entity;

// TypeParameterTail
//    : IDENTIFIER
//    | IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER
//    | IDENTIFIER EXTENDS ClassTypeList2
//    ;
public class TypeParameterTail extends Entity {
    // Structure
    public String identifier;

    // Either extending identifier with annotations OR type list
    public Annotations extAnnotations;
    public String extending;
    public TypeList types;

    // Creation
    public TypeParameterTail(Token id, Annotations extAnns, Token ext) {
        this.identifier = id.image;
        this.extAnnotations = extAnns;
        this.extending = ext.image;
        this.types = null;

        if (this.extAnnotations != null) {
            this.extAnnotations.parent = this;
        }
    }

    public TypeParameterTail(Token id, TypeList types) {
        this.identifier = id.image;
        this.types = types;

        if (this.types != null) {
            this.types.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }

}
