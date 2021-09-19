package tree.Declaration;

import tree.Entity;
import tree.Type.TypeList;

// Intermediate class: won't appear in the AST.
//
// ConstructorDeclarator
//    : TypeParametersOpt IDENTIFIER LPAREN FormalParameterList/*FormalParameters*/ RPAREN
//    ;
public class ConstructorDeclarator extends Entity
{
    // Structure
    public TypeList typeParameters;
    public ParameterDeclarations formalParameters;

    // Creation
    public ConstructorDeclarator(TypeList tpars, ParameterDeclarations pars)
    {
        this.typeParameters = tpars;
        this.formalParameters = pars;
    }

    // Reporting
    public void report(int sh)
    {
        // Empty
    }

    // Generation
    public void generateEO()
    {
        // Empty
    }
}
