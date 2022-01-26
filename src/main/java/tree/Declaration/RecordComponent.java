package tree.Declaration;

import tree.Annotations;
import tree.Modifiers;
import tree.Type.Type;

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
public class RecordComponent extends Declaration {
    // Structure
    // public Modifiers modifiers;
    // public String name;
    // public Type type;
    public Annotations ellAnnotations;
    public boolean signEllipsis;

    // Creation
    public RecordComponent(Modifiers mods,
                           String n,
                           Type t,
                           Annotations ellAnns,
                           boolean ell) {
        super(mods, n, t);
        this.ellAnnotations = ellAnns;
        this.signEllipsis = ell;

        if (this.ellAnnotations != null) {
            this.ellAnnotations.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }

}
