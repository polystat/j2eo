package tree;

import java.util.ArrayList;

// Dim
//    : AnnotationSeq LBRACKET RBRACKET
//    |               LBRACKET RBRACKET
//    ;
public class Dim extends Entity
{
    // Structure
    public ArrayList<Annotation> annotations;

    // Creation
    public Dim(ArrayList<Annotation> anns)
    {
        this.annotations = anns;
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
