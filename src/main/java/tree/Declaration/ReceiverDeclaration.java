package tree.Declaration;

import tree.Annotations;
import tree.Entity;
import tree.Type.Type;

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
//      |                THIS         <<<========
//      | IDENTIFIER DOT THIS         <<<========
//      ;
public class ReceiverDeclaration extends ParameterDeclaration {
    // Structure
    public Annotations annotations;
    // public Type type;
    // public String name;

    // Creation
    public ReceiverDeclaration(Annotations anns, Type t, String n) {
        super(null, t, n, null, false, null);
        this.annotations = anns;

        if ( this.annotations != null ) this.annotations.parent = this;
    }

    // Reporting
    public void report(int sh) {
        String n = (name != null) ? name + ".THIS" : "THIS";
        title("RECEIVER " + n, sh);
        type.report(sh + Entity.shift);
        if (annotations != null) {
            annotations.report(sh + Entity.shift);
        }
    }

}
