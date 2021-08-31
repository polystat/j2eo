package tree;

import java.util.ArrayList;

// TypeParameter
//    : AnnotationSeq TypeParameterTail
//    |               TypeParameterTail
//    ;
//
//TypeParameterTail
//    : IDENTIFIER
//    | IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER
//    | IDENTIFIER EXTENDS ClassTypeList2
//    ;
public class TypeParameter extends Entity
{
    // Structure
    public String name;
    public ArrayList<Annotation> annotations;
    public String extendingName;
    public ArrayList<Type> extendingTypes;

    // Creation
    public TypeParameter(String n,
                         ArrayList<Annotation> anns,
                         String en,
                         ArrayList<Type> extTypes)
    {
        this.name = n;
        this.annotations = anns;
        this.extendingName = en;
        this.extendingTypes = extTypes;
    }

    // Reporting
    public void report(int sh)
    {

    }

    // Generation
    public void generateEO()
    {

    }
}
