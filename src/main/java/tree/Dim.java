package tree;

// Dim
//    : AnnotationSeq LBRACKET RBRACKET
//    |               LBRACKET RBRACKET
//    ;
public class Dim extends Entity {
    // Structure
    public Annotations annotations;

    // Creation
    public Dim(Annotations anns) {
        this.annotations = anns;
        if (this.annotations != null) {
            this.annotations.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        annotations.report(sh);
        System.out.print("[]");
    }

}
