package tree.Declaration;

import tree.*;
import tree.Type.Type;

import java.util.ArrayList;

// FormalParameter
//    : ModifierSeq UnannotatedType FormalParameterTail
//    |             UnannotatedType FormalParameterTail
//    ;
//
// FormalParameterTail
//        // Normal formal parameter
//      :                           IDENTIFIER DimsOpt
//      | AnnotationSeqOpt ELLIPSIS IDENTIFIER
//
//          // ReceiverParameter
//      |                THIS
//      | IDENTIFIER DOT THIS
//      ;
public class ReceiverDeclaration extends Declaration
{
    // Structure
    public Annotations annotations;
//  public Type type;
//  public String name;
    public boolean signThis;

    // Creation
    public ReceiverDeclaration(Annotations anns,
                               Type t,
                               String n,
                               boolean signThis)
    {
        super(null,n,t);
        this.annotations = anns;
        this.signThis = signThis;
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
