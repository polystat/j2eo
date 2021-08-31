package tree;

import java.util.ArrayList;

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
    public ArrayList<TypeParameter> typeParameters;
//  public Type type;
//  public String name;
    public ReceiverDeclaration receiver;
    public ArrayList<ParameterDeclaration> parameters;
    public ArrayList<Dim> dims;
    public ArrayList<Type> exceptions;
    public BlockStatement methodBody;

    // Creation
    public MethodDeclaration(Modifiers mods,
                             ArrayList<TypeParameter> typePars,
                             Type t,
                             String n,
                             ReceiverDeclaration r,
                             ArrayList<ParameterDeclaration> pars,
                             ArrayList<Dim> dims,
                             ArrayList<Type> excs,
                             BlockStatement body)
    {
        super(mods,n,t);
        this.typeParameters = typePars;
        this.parameters = pars;
        this.receiver = r;
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
