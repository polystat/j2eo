package tree.Declaration;

import lexer.*;
import tree.Entity;
import tree.Type.*;

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
        this.title("CLASS DECLARATION "+this.name,sh);
        if ( this.typeParameters != null )
            this.typeParameters.report(sh+Entity.shift);
        if ( this.extendedType != null )
        {
            this.title("SUPER",sh+Entity.shift);
            this.extendedType.report(sh+Entity.shift);
        }
        if ( this.interfaces != null )
            this.interfaces.report(sh+Entity.shift);
        if ( body != null )
            body.report(sh+Entity.shift);
    }

}
