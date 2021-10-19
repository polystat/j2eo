package tree.Declaration;

import tree.Dims;
import tree.Initializer;
import tree.Modifiers;
import tree.Type.Type;

// ConstantDeclaration
//    : Type VariableDeclaratorList SEMICOLON
//    ;
//
// LocalVariableDeclaration
//    : UnannotatedType VariableDeclaratorList
//    | VAR             VariableDeclaratorList
//    ;
//
// FieldDeclaration
//    : /*ModifierSeqOpt*/ UnannotatedType VariableDeclaratorList SEMICOLON
//    ;
//
// VariableDeclaratorList
//    :                              VariableDeclarator
//    | VariableDeclaratorList COMMA VariableDeclarator
//    ;
//
// VariableDeclarator
//    : IDENTIFIER
//    | IDENTIFIER      EQUAL Expression
//    | IDENTIFIER Dims
//    | IDENTIFIER Dims EQUAL ArrayInitializer
//    ;
public class VariableDeclaration extends Declaration
{
    // Structure
    public Modifiers modifiers;
    public Dims dims;

    // Either a single expression, or a list of initializers
    public Initializer initializer;

    // Creation
    public VariableDeclaration(String n,
                               Modifiers mods,
                               Type t,
                               Dims dims,
                               Initializer init)
    {
        super(mods,n,t);
        this.dims = dims;
        this.initializer = init;
    }

    // Reporting
    public void report(int sh)
    {

    }

}
