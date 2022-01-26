package tree.Declaration;

import lexer.Token;
import tree.Dims;
import tree.Entity;

// Intermediate class - won't appear in the AST
//
// MethodDeclarator
//    : IDENTIFIER LPAREN                                          RPAREN DimsOpt
//    | IDENTIFIER LPAREN FormalParameterList /*FormalParameters*/ RPAREN DimsOpt
//    ;
public class MethodDeclarator extends Entity {
    // Structure
    public String name;
    public ParameterDeclarations parameters;
    public Dims dims;

    // Creation
    public MethodDeclarator(Token token, ParameterDeclarations pars, Dims dims) {
        this.name = token.image;
        this.parameters = pars;
        this.dims = dims;

        if (this.parameters != null) {
            this.parameters.parent = this;
        }
        if (this.dims != null) {
            this.dims.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }
}
