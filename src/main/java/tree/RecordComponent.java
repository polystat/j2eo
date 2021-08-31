package tree;

import java.util.ArrayList;

// RecordComponentListOpt
//    :  // empty
//    |                              RecordComponent
//    | RecordComponentListOpt COMMA RecordComponent
//    ;
//
// RecordComponent
//    : AnnotationSeqOpt UnannotatedType                           IDENTIFIER
//    | AnnotationSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER // VariableArityRecordComponent
//    ;
public class RecordComponent extends Declaration
{
    // Structure
//  public Modifiers modifiers;
//  public String name;
//  public Type type;
    public ArrayList<Annotation> ellAnnotations;
    public boolean signEllipsis;

    // Creation
    public RecordComponent(Modifiers mods,
                           String n,
                           Type t,
                           ArrayList<Annotation> eAnns,
                           boolean ell)
    {
        super(mods,n,t);
        this.ellAnnotations = eAnns;
        this.signEllipsis = ell;
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
