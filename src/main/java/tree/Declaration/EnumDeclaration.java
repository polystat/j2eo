package tree.Declaration;

import tree.Expression.*;
import tree.Modifiers;

import java.util.ArrayList;

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
//  public Modifiers modifiers;
    public ArrayList<String> enumerators;
    public ArrayList<Expression> initializers;
    public ArrayList<Declaration> body;

    // Creation
    public EnumDeclaration(String n,
                           Modifiers mods,
                           ArrayList<String> enums,
                           ArrayList<Expression> inits,
                           ArrayList<Declaration> body)
    {
        super(mods,n);
        this.modifiers = mods;
        this.enumerators = enums;
        this.initializers = inits;
        this.body = body;
    }

    // Reporting
    public void report(int sh)
    {

    }

}
