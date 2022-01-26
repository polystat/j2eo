package tree.Declaration;

import tree.Dims;
import tree.Entity;
import tree.Modifiers;
import tree.Statement.Block;
import tree.Type.Type;
import tree.Type.TypeList;
import tree.Type.TypeParameters;

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
public class MethodDeclaration extends Declaration {
    // Structure
    // public Modifiers modifiers;
    public TypeParameters typeParameters;
    // public Type type;
    // public String name;
    // public ReceiverDeclaration receiver; -- this is a special kind of ParameterDeclaration
    public ParameterDeclarations parameters;
    public Dims dims;
    public TypeList exceptions;
    public Block methodBody;

    // Creation
    public MethodDeclaration(MethodHeader header, Block body) {
        super(null, header.declarator.name, header.type);
        this.typeParameters = header.typeParameters;
        this.parameters = header.declarator.parameters;
        this.dims = header.declarator.dims;
        this.exceptions = header.throwsClause;
        this.methodBody = body;

        if (this.typeParameters != null) {
            this.typeParameters.parent = this;
        }
        if (this.parameters != null) {
            this.parameters.parent = this;
        }
        if (this.dims != null) {
            this.dims.parent = this;
        }
        if (this.exceptions != null) {
            this.exceptions.parent = this;
        }
        if (this.methodBody != null) {
            this.methodBody.parent = this;
        }
    }

    public MethodDeclaration(Modifiers mods,
                             TypeParameters typePars,
                             Type t,
                             String n,
                             ParameterDeclarations pars,
                             Dims dims,
                             TypeList excs,
                             Block body) {
        super(mods, n, t);
        this.typeParameters = typePars;
        this.parameters = pars;
        this.dims = dims;
        this.exceptions = excs;
        this.methodBody = body;

        if (this.typeParameters != null) {
            this.typeParameters.parent = this;
        }
        if (this.parameters != null) {
            this.parameters.parent = this;
        }
        if (this.dims != null) {
            this.dims.parent = this;
        }
        if (this.exceptions != null) {
            this.exceptions.parent = this;
        }
        if (this.methodBody != null) {
            this.methodBody.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        this.title("METHOD " + name, sh);
        if (modifiers != null) {
            modifiers.report(sh + Entity.shift);
        }
        if (typeParameters != null) {
            typeParameters.report(sh + Entity.shift);
        }
        if (type != null) {
            type.report(sh + Entity.shift);
        } else {
            Entity.doShift(sh + Entity.shift);
            System.out.println("TYPE VOID");
        }
        // Dimensions! ---
        if (parameters != null) {
            parameters.report(sh + Entity.shift);
        }
        if (exceptions != null) {
            exceptions.report(sh + Entity.shift);
        }
        if (methodBody != null) {
            title("METHOD BODY", sh + Entity.shift);
            methodBody.report(sh + 2 * Entity.shift);
        }
    }

}
