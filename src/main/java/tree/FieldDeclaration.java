package tree;

import java.util.ArrayList;

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
public class FieldDeclaration extends Declaration
{
    // Structure
    public Modifiers modifiers;
    public ArrayList<Dim> dims;

    // Either a single expression, or a list of initializers
    public Initializer initializer;

    // Creation
    public FieldDeclaration(String n,
                            Modifiers mods,
                            Type t,
                            ArrayList<Dim> dims,
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

    // Generation
    public void generateEO()
    {

    }
}
