package tree.Declaration;

import tree.*;
import tree.Statement.Block;
import tree.Type.*;

// MethodDeclaration
//    : MethodHeader MethodBody
//    ;
//
// MethodHeader
//    : TypeParameters               Type            MethodDeclarator ThrowsOpt
//    | TypeParameters AnnotationSeq VOID            MethodDeclarator ThrowsOpt
//    | TypeParameters               UnannotatedType MethodDeclarator ThrowsOpt
//    | TypeParameters               VOID            MethodDeclarator ThrowsOpt
//    |                              UnannotatedType MethodDeclarator ThrowsOpt
//    |                              VOID            MethodDeclarator ThrowsOpt
//    ;
//
// MethodDeclarator
//    : IDENTIFIER LPAREN                     RPAREN DimsOpt
//    | IDENTIFIER LPAREN FormalParameterList RPAREN DimsOpt
//    ;
//
// ThrowsOpt
//    :  // empty
//    | THROWS ClassTypeList1
//    ;
public class MethodDeclaration extends Declaration
{
    // Structure
//  public Modifiers modifiers;
    public TypeParameters typeParameters;
//  public Type type;
//  public String name;
//  public ReceiverDeclaration receiver; -- this is a special kind of ParameterDeclaration
    public ParameterDeclarations parameters;
    public Dims dims;
    public TypeList exceptions;
    public Block methodBody;

    // Creation
    public MethodDeclaration(Modifiers mods,
                             TypeParameters typePars,
                             Type t,
                             String n,
                             ParameterDeclarations pars,
                             Dims dims,
                             TypeList excs,
                             Block body)
    {
        super(mods,n,t);
        this.typeParameters = typePars;
        this.parameters = pars;
        this.dims = dims;
        this.exceptions = excs;
        this.methodBody = body;
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
