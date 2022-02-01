package tree;

// ModifierSeq
//    :               StandardModifierSeq
//    | AnnotationSeq StandardModifierSeq
//    ;
public class Modifiers extends Entity {
    // Structure
    public Annotations annotations;
    public StandardModifiers modifiers;

    // Creation
    public Modifiers(Annotations anns, StandardModifiers mods) {
        this.annotations = anns;
        this.modifiers = mods;

        if (this.annotations != null) {
            this.annotations.parent = this;
        }
        if (this.modifiers != null) {
            this.modifiers.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        if (annotations != null) {
            annotations.report(sh);
            System.out.println();
        }
        modifiers.report(sh);
        // System.out.println();
    }

}
