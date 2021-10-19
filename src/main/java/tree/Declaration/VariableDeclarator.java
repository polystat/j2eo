package tree.Declaration;

import lexer.*;
import tree.*;

// Intermediate class: won't appear in the AST
//
// VariableDeclarator
//    : IDENTIFIER
//    | IDENTIFIER      EQUAL Expression
//    | IDENTIFIER Dims
//    | IDENTIFIER Dims EQUAL ArrayInitializer
//    ;
public class VariableDeclarator extends Entity
{
    // Structure
    public String name;
    public Dims dims;
    public Initializer initializer;

    // Creation
    public VariableDeclarator(Token id, Dims dims, Initializer init)
    {
        this.name = id.image;
        this.dims = dims;
        this.initializer = init;
    }

    // Reporting
    public void report(int sh)
    {
        // Empty
    }

}
