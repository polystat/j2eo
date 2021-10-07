package tree.Type;

import tree.*;

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
public class TypeParameter extends Entity
{
    // Structure
    public Annotations annotations;
    public String name;

    public Annotations extAnnotations;
    public String extendingName;
    public TypeList extendingTypes;

    // Creation
    public TypeParameter(Annotations anns, TypeParameterTail tail)
    {
        this.annotations = anns;
        this.name = tail.identifier;
        this.extAnnotations = tail.extAnnotations;
        this.extendingName = tail.extending;
        this.extendingTypes = tail.types;
    }

    // Reporting
    public void report(int sh)
    {

    }

}
