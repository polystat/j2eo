package tree;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

// The root class of the entire hierarchy for Java types.
//
// Type
//    :               UnannotatedType
//    | AnnotationSeq UnannotatedType
//    ;
public class Type extends Entity
{
    // Structure
    public ArrayList<Annotation> annotations;
    public UnannotatedType unannotatedType;

    // Creation
    public Type(ArrayList<Annotation> annSeq, UnannotatedType utype)
    {
        this.annotations = annSeq;
        this.unannotatedType = utype;
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