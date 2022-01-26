package tree.Declaration;

import tree.Modifiers;
import tree.Statement.Block;
import tree.Type.TypeList;
import tree.Type.TypeParameters;

// ConstructorDeclaration
//    : /*ModifierSeqOpt*/ ConstructorDeclarator ThrowsOpt ConstructorBody
//    ;
//
//ConstructorDeclarator
//    : TypeParametersOpt IDENTIFIER LPAREN FormalParameterList/*FormalParameters*/ RPAREN
//    ;
//
//ConstructorBody
//    : LBRACE                                                 RBRACE
//    | LBRACE ExplicitConstructorInvocation                   RBRACE
//    | LBRACE                               BlockStatementSeq RBRACE
//    | LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE
//    ;
public class ConstructorDeclaration extends MethodDeclaration {
    // Structure: all from the base class
    // public Modifiers modifiers;
    // public TypeParameters typeParameters;
    // public Type type;                           // always null
    // public String name;                         // always null
    // public ReceiverDeclaration receiver;
    // public ParameterDeclarations parameters;
    // public Dims dims;                           // always null
    // public TypeList exceptions;
    public ExplicitConstructorInvocation invocation;
    //  public Block methodBody;

    // Creation
    public ConstructorDeclaration(Modifiers mods,
                                  TypeParameters typePars,
                                  ParameterDeclarations pars,
                                  TypeList excs,
                                  ExplicitConstructorInvocation inv,
                                  Block body) {
        super(mods, typePars, null, null, pars, null, excs, body);
        this.invocation = inv;

        if (this.invocation != null) {
            this.invocation.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        title("CONSTRUCTOR", sh);
    }

}
