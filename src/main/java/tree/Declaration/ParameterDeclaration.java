package tree.Declaration;

import lexer.Token;
import tree.Annotations;
import tree.Dims;
import tree.Entity;
import tree.Modifiers;
import tree.Type.Type;

// FormalParameter
//    : ModifierSeq UnannotatedType FormalParameterTail
//    |             UnannotatedType FormalParameterTail
//    ;
//
// FormalParameterTail
//        // Normal formal parameter
//    :                           IDENTIFIER DimsOpt
//    | AnnotationSeqOpt ELLIPSIS IDENTIFIER
//
//        // ReceiverParameter
//    |                THIS
//    | IDENTIFIER DOT THIS
//    ;
public class ParameterDeclaration extends Declaration {
    // Structure
    // public Modifiers modifiers;
    // public Type type;
    // public String name;
    public Annotations ellAnnotations;
    public boolean signEllipsis;
    public Dims dims;

    // Creation
    public ParameterDeclaration(Modifiers mods,
                                Type t,
                                String n,
                                Annotations ellAnns,
                                boolean signEll,
                                Dims dims) {
        super(mods, n, t);
        this.ellAnnotations = ellAnns;
        this.signEllipsis = signEll;
        this.dims = dims;

        this.ellAnnotations.parent = this;
        this.dims.parent = this;
    }

    public ParameterDeclaration(Token token) {
        // For the single lambda parameter
        this(null, null, token.image, null, false, null);
    }

    public static ParameterDeclaration create(Modifiers mods, Type type, ParameterTail tail) {
        if (tail.thisSign) {
            // this is the receiver declaration
            return createReceiver(mods, type, tail.identifier);
        } else {
            // this is a usual parameter declaration
            return createParameter(
                    mods,
                    type,
                    tail.identifier,
                    tail.annotations,
                    tail.ellipsisSign,
                    tail.dims);
        }
    }

    private static ParameterDeclaration createParameter(Modifiers mods, Type t, String n,
                                                        Annotations ellAnns, boolean signEll, Dims dims) {
        return new ParameterDeclaration(mods, t, n, ellAnns, signEll, dims);
    }

    private static ReceiverDeclaration createReceiver(Modifiers mods, Type t, String n) {
        ReceiverDeclaration receiver = new ReceiverDeclaration(null, t, n);
        receiver.modifiers = mods;
        receiver.signEllipsis = false;

        if ( receiver.modifiers != null ) receiver.modifiers.parent = receiver;
        return receiver;
    }

    // Reporting
    public void report(int sh) {
        title("PARAMETER " + name, sh);
        if (super.modifiers != null) {
            super.modifiers.report(sh + Entity.shift);
        }
        if (super.type != null) {
            super.type.report(sh + Entity.shift);
        }
    }

}
