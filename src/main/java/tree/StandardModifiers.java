package tree;

import java.util.ArrayList;

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
public class StandardModifiers extends Entity
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
    public ArrayList<modifier> modifiers;

    // Creation
    public StandardModifiers(modifier m)
    {
        this.modifiers = new ArrayList<>();
        this.modifiers.add(m);
    }

    public StandardModifiers add(modifier m)
    {
        this.modifiers.add(m);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        for (modifier m: this.modifiers)
        {
            System.out.print(m.toString());
            System.out.print(" ");
        }
        System.out.println();
    }

    // Generation
    public void generateEO()
    {

    }
}

