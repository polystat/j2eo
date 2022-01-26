package tree.Declaration;

import tree.Dims;
import tree.Entity;
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
public class VariableDeclaration extends Declaration {
    // Structure
    // public Modifiers modifiers;  -- from the base class
    // public String name;          -- from the base class
    public Dims dims;

    // Either a single expression, or a list of initializers
    public Initializer initializer;

    // Creation
    public VariableDeclaration(String n,
                               Modifiers mods,
                               Type t,
                               Dims dims,
                               Initializer init) {
        super(mods, n, t);
        this.dims = dims;
        this.initializer = init;

        if (this.dims != null) {
            this.dims.parent = this;
        }
        if (this.initializer != null) {
            this.initializer.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        title("VARIABLE DECLARATION " + name, sh);
        if (modifiers != null) {
            modifiers.report(sh + Entity.shift);
        }
        if (type != null) {
            type.report(sh + Entity.shift);
        } else {
            Entity.doShift(sh + Entity.shift);
            System.out.println("VAR");
        }
        if (dims != null) {
            dims.report(sh + Entity.shift);
        }
        if (initializer != null) {
            initializer.report(sh + Entity.shift);
        }
    }

}
