package tree.Declaration;

import tree.Modifiers;

// ClassDeclaration
//    : NormalClassDeclaration
//    | EnumDeclaration
//    | RecordDeclaration
//    ;
public class ClassDeclaration extends Declaration {
    // NO structure

    // Creation
    public ClassDeclaration(Modifiers mods, String n) {
        super(mods, n, null);
    }

    // NO reporting

    // NO generation
}
