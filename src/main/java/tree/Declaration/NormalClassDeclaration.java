package tree.Declaration;

import lexer.*;
import tree.Modifiers;
import tree.Type.*;
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
    public TypeParameters typeParameters;
    public Type extendedType;
    public TypeList interfaces;
    public Declarations body;

    // Creation
    public NormalClassDeclaration(Token n,
                                  TypeParameters typePars,
                                  Type extType,
                                  TypeList ints,
                                  Declarations body)
    {
        super(null,n.image);
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
