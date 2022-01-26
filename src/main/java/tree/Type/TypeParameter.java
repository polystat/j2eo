package tree.Type;

import tree.Annotations;
import tree.Entity;

// TypeParameter
//    : AnnotationSeq TypeParameterTail
//    |               TypeParameterTail
//    ;
//
// TypeParameterTail
//    : IDENTIFIER
//    | IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER
//    | IDENTIFIER EXTENDS ClassTypeList2
//    ;
public class TypeParameter extends Entity {
    // Structure
    public Annotations annotations;
    public String name;

    public Annotations extAnnotations;
    public String extendingName;
    public TypeList extendingTypes;

    // Creation
    public TypeParameter(Annotations anns, TypeParameterTail tail) {
        this.annotations = anns;
        this.name = tail.identifier;
        this.extAnnotations = tail.extAnnotations;
        this.extendingName = tail.extending;
        this.extendingTypes = tail.types;

        if (this.annotations != null) {
            this.annotations.parent = this;
        }
        if (this.extAnnotations != null) {
            this.extAnnotations.parent = this;
        }
        if (this.extendingTypes != null) {
            this.extendingTypes.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }

}
