package tree;

import lexer.Token;
import lexer.TokenCode;
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
    // Structure
    public ArrayList<TokenCode> modifiers;

    // Creation
    public StandardModifiers(Token token)
    {
        this.modifiers = new ArrayList<>();
        this.modifiers.add(token.code);
    }

    public StandardModifiers add(Token token)
    {
        this.modifiers.add(token.code);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        for (TokenCode m: this.modifiers)
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

