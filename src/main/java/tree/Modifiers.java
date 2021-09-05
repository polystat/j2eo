package tree;

import java.util.ArrayList;

// ModifierSeq
//    :               StandardModifierSeq
//    | AnnotationSeq StandardModifierSeq
//    ;
public class Modifiers extends Entity
{
    // Structure
    public Annotations annotations;
    public Modifiers modifiers;

    // Creation
    public Modifiers(Annotations anns, Modifiers mods)
    {
        this.annotations = anns;
        this.modifiers = mods;
    }

    // Reporting
    public void report(int sh)
    {
        if ( annotations != null )
        {
            annotations.report(sh);
            System.out.println();
        }
        modifiers.report(sh);
        System.out.println();
    }

    // Generation
    public void generateEO()
    {

    }
}
