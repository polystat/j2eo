package tree;

import java.util.ArrayList;

// TypeArgument
//    : Type
//    |               QUESTION WildcardBoundsOpt
//    | AnnotationSeq QUESTION WildcardBoundsOpt
//    ;
//
// WildcardBoundsOpt
//    :  // empty
//    | EXTENDS Type
//    | SUPER   Type
//    ;
public class TypeArgument extends Entity
{
    // Structure
    public Type type;
    public boolean signExtends;
    public boolean signSuper;
    public ArrayList<Annotation> annotations;

    // Creation
    public TypeArgument(Type t, int sign, ArrayList<Annotation> anns)
    {
        this.type = t;
        signExtends = false; signSuper = false;
        switch ( sign )
        {
            case 1: signExtends = true; break;
            case 2: signSuper = true; break;
        }
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
