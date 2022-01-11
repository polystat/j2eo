package tree.Compilation;

import tree.Declaration.ClassDeclaration;
import tree.Declaration.Declaration;
import tree.Declaration.InterfaceDeclaration;
import tree.Entity;
import tree.Modifiers;

// TopLevelComponent
//    : ClassDeclaration
//    | InterfaceDeclaration
//    ;
public class TopLevelComponent extends Entity {
    // Structure: either first OR second
    public ClassDeclaration classDecl;
    public InterfaceDeclaration interfaceDecl;

    // Creation
    public TopLevelComponent(ClassDeclaration cd) {
        this.classDecl = cd;
    }

    public TopLevelComponent(InterfaceDeclaration id) {
        this.interfaceDecl = id;
    }

    public void addModifiers(Modifiers mods) {
        Declaration decl = classDecl != null ? classDecl : interfaceDecl;
        decl.modifiers = mods;
    }

    // Reporting
    public void report(int sh) {
        if (this.classDecl != null) {
            this.classDecl.report(sh);
        } else {
            this.interfaceDecl.report(sh);
        }
    }

}
