package tree;

import java.util.ArrayList;

// FormalParameter
//    : ModifierSeq UnannotatedType FormalParameterTail
//    |             UnannotatedType FormalParameterTail
//    ;
//
// FormalParameterTail
//        // Normal formal parameter
//    :                           IDENTIFIER DimsOpt
//    | AnnotationSeqOpt ELLIPSIS IDENTIFIER
//
//        // ReceiverParameter
//    |                THIS
//    | IDENTIFIER DOT THIS
//    ;
public class ParameterDeclaration extends Declaration
{
    // Structure
//  public Modifiers modifiers;
//  public Type type;
//  public String name;
    public ArrayList<Annotation> ellAnnotations;
    public boolean signEllipsis;
    public ArrayList<Dim> dims;

    // Creation
    public ParameterDeclaration(Modifiers mods,
                                Type t,
                                String n,
                                ArrayList<Annotation> ellAnns,
                                boolean signEll,
                                ArrayList<Dim> dims)
    {
        super(mods,n,t);
        this.ellAnnotations = ellAnns;
        this.signEllipsis = signEll;
        this.dims = dims;
    }

    // Reporting
    public void report(int csh)
    {

    }

    // Generation
    public void generateEO()
    {

    }

}
