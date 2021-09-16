package tree.Declaration;

import tree.Modifiers;
import tree.Type.Type;
import tree.Type.TypeParameter;

import java.util.ArrayList;

// NormalClassDeclaration
//    : /*ModifierSeqOpt*/ CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody
//    ;
//
// ClassExtendsOpt
//    : // empty
//    | EXTENDS Type
//    ;
//
// ClassImplementsOpt
//    : // empty
//    | IMPLEMENTS ClassTypeList1
//    ;
//
// ClassBody
//    : LBRACE                         RBRACE
//	  | LBRACE ClassBodyDeclarationSeq RBRACE
//    ;
//
//ClassBodyDeclarationSeq
//    :                         ClassBodyDeclaration
//    | ClassBodyDeclarationSeq ClassBodyDeclaration
//    ;
//
//ClassBodyDeclaration
//    : ModifierSeqOpt PureBodyDeclaration
//    |        Block           // InstanceInitializer
//    | STATIC Block           // StaticInitializer
//    | SEMICOLON
// 	;
public class NormalClassDeclaration extends ClassDeclaration
{
    // Structure
    public ArrayList<TypeParameter> typeParameters;
    public Type extendedType;
    public ArrayList<Type> interfaces;
    public ArrayList<Declaration> body;

    // Creation
    public NormalClassDeclaration(Modifiers mods,
                                  String n,
                                  ArrayList<TypeParameter> typePars,
                                  Type extType,
                                  ArrayList<Type> ints,
                                  ArrayList<Declaration> body)
    {
        super(mods,n);
        this.modifiers = mods;
        this.typeParameters = typePars;
        this.extendedType = extType;
        this.interfaces = ints;
        this.body = body;
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
