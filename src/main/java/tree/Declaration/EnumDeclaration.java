package tree.Declaration;

import lexer.Token;
import tree.Entity;
import tree.Expression.*;
import tree.Modifiers;
import tree.Type.TypeList;

// EnumDeclaration
//    : /*ModifierSeqOpt*/ ENUM IDENTIFIER ClassImplementsOpt EnumBody
//    ;
//
//EnumBody
//    : LBRACE EnumConstantListOpt       EnumBodyDeclarationsOpt RBRACE
//    | LBRACE EnumConstantListOpt COMMA EnumBodyDeclarationsOpt RBRACE
//    ;
//
//EnumConstantListOpt
//    :  // empty
//    |                           EnumConstant
//    | EnumConstantListOpt COMMA EnumConstant
//    ;
//
//EnumConstant
//    : AnnotationSeqOpt IDENTIFIER Arguments
//    | AnnotationSeqOpt IDENTIFIER Arguments ClassBody
//    ;
//
//EnumBodyDeclarationsOpt
//    :  // empty
//    | SEMICOLON
//    | SEMICOLON ClassBodyDeclarationSeq
//    ;
public class EnumDeclaration extends ClassDeclaration
{
    // Structure
//  public Modifiers modifiers;  -- in the base class
//  public String name;          -- in the base class
    public TypeList implemented;
    public Enumerators enumerators;
    public Declarations body;

    // Creation
    public EnumDeclaration(Token n, TypeList impls, EnumBody body)
    {
        super(null,n.image);
        this.implemented = impls;
        this.enumerators = body.enumerators;
        this.body = body.declarations;

        if ( this.implemented != null ) this.implemented.parent = this;
        if ( this.enumerators != null ) this.enumerators.parent = this;
        if ( this.body != null )        this.body.parent = this;
    }

    // Reporting
    public void report(int sh)
    {
        title("ENUM DECLARATION "+name,sh);
        if ( implemented != null )
        {
            Entity.doShift(sh+Entity.shift);
            System.out.println("BASES:");
            implemented.report(sh+2*Entity.shift);
        }
        if ( enumerators != null )
        {
            Entity.doShift(sh+Entity.shift);
            System.out.println("ENUMERATORS:");
            enumerators.report(sh+2*Entity.shift);
        }
        if ( body != null )
        {
            Entity.doShift(sh+Entity.shift);
            System.out.println("ENUM BODY:");
            body.report(sh+2*Entity.shift);
        }
    }

}
