package tree.Declaration;

import tree.*;
import tree.Dim;
import tree.Modifiers;
import tree.Type.*;
import lexer.Token;

import java.util.ArrayList;

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
public class ParameterDeclaration extends Declaration
{
    // Structure
//  public Modifiers modifiers;
//  public Type type;
//  public String name;
    public Annotations ellAnnotations;
    public boolean signEllipsis;
    public Dims dims;

    // Creation
    public ParameterDeclaration(Modifiers mods,
                                Type t,
                                String n,
                                Annotations ellAnns,
                                boolean signEll,
                                Dims dims)
    {
        super(mods,n,t);
        this.ellAnnotations = ellAnns;
        this.signEllipsis = signEll;
        this.dims = dims;
    }
    public ParameterDeclaration(Token token)
    {
        this(null,null,token.image,null,false,null);
    }


    // Reporting
    public void report(int csh)
    {

    }

    // Generation
    public void generateEO()
    {

    }

}
