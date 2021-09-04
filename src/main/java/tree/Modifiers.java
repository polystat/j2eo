package tree;

import java.util.ArrayList;

// ModifierSeq
//    :               StandardModifierSeq
//    | AnnotationSeq StandardModifierSeq
//    ;
//
// StandardModifierSeq
//    :                     StandardModifier
//    | StandardModifierSeq StandardModifier
//    ;
//
// StandardModifier
//     //    : Annotation
//	  : DEFAULT
//    | FINAL
//    | PUBLIC
//    | PROTECTED
//    | PRIVATE
//    | ABSTRACT
//    | STATIC
//    | STRICTFP
//    | SYNCHRONIZED
//    | TRANSIENT
//    | VOLATILE
//    | OPEN  // for modules only
//    ;
public class Modifiers extends Entity
{
    public enum modifier
    {
        mod_default,
        mod_final,
        mod_public,
        mod_protected,
        mod_private,
        mod_abstract,
        mod_static,
        mod_strictfp,
        mod_synchronized,
        mod_transient,
        mod_volatile,
        mod_open
    }

    // Structure
    public Annotations annotations;
    public ArrayList<modifier> modifiers;

    // Creation
    public Modifiers(Annotations anns, ArrayList<modifier> mods)
    {
        this.annotations = anns;
        this.modifiers = mods;
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
