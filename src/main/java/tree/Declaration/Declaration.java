package tree.Declaration;

import tree.Entity;
import tree.Modifiers;
import tree.Type.Type;

// ClassDeclaration
//    : NormalClassDeclaration
//    | EnumDeclaration
//    | RecordDeclaration
//    ;
//
// ClassBodyDeclaration
//    : ModifierSeqOpt PureBodyDeclaration
//    |        Block         // InstanceInitializer
//    | STATIC Block         // StaticInitializer
//    | SEMICOLON
// 	;
//
// PureBodyDeclaration
//    : FieldDeclaration
//    | MethodDeclaration
//    | ClassDeclaration
//    | InterfaceDeclaration
//    | ConstructorDeclaration
//    ;
//
// BlockDeclaration
//    : ClassDeclaration
//    | NormalInterfaceDeclaration
//    | LocalVariableDeclaration SEMICOLON
//    ;
//
//LocalVariableDeclaration
//    : UnannotatedType VariableDeclaratorList
//    | VAR             VariableDeclaratorList
//    ;
public class Declaration extends Entity
{
    // Structure: properties common to (almost) all
    // kinds of declarations.
    public Modifiers modifiers;
    public String name;
    public Type type;

    // Creation
    public Declaration(Modifiers mods, String n, Type t)
    {
        this.modifiers = mods;
        this.name = n;
        this.type = t;
    }
    public Declaration addModifiers(Modifiers mods)
    {
        this.modifiers = mods;
        return this;
    }

    // Reporting
    public void report(int sg)
    {

    }

}
