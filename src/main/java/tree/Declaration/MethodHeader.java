package tree.Declaration;

import tree.Entity;
import tree.Statement.Throw;
import tree.Type.Type;
import tree.Type.TypeList;
import tree.Type.TypeParameters;

// The intermediate class - won't appera in the AST
//
// MethodHeader
//    : TypeParameters               Type            MethodDeclarator ThrowsOpt
//    | TypeParameters AnnotationSeq VOID            MethodDeclarator ThrowsOpt
//    | TypeParameters               UnannotatedType MethodDeclarator ThrowsOpt
//    | TypeParameters               VOID            MethodDeclarator ThrowsOpt
//    |                              UnannotatedType MethodDeclarator ThrowsOpt
//    |                              VOID            MethodDeclarator ThrowsOpt
//    ;
public class MethodHeader extends Entity
{
    // Structure
    public TypeParameters typeParameters;
    public Type type;  // together with annotations?
    public MethodDeclarator declarator;
    public TypeList throwsClause;

    public MethodHeader(TypeParameters tpars, Type type, MethodDeclarator methodDecl, TypeList thr)
    {
        this.typeParameters = tpars;
        this.type = type;
        this.declarator = methodDecl;
        this.throwsClause = thr;
    }

    // Reporting
    public void report(int sh)
    {

    }
}
