package tree.Compilation;

import tree.CompoundName;
import tree.Declaration.ImportDeclarations;
import tree.Entity;

// Package
//    : PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt
//    ;
public class Package extends CompilationUnit {
    // Structure
    public CompoundName compoundName;
    public ImportDeclarations imports;
    public TopLevelComponents components;

    // Creation
    public Package(CompoundName cn, ImportDeclarations ims, TopLevelComponents cs) {
        this.compoundName = cn;
        this.imports = ims;
        this.components = cs;

        if ( this.compoundName != null ) this.compoundName.parent = this;
        if ( this.imports != null )      this.imports.parent = this;
        if ( this.components != null )   this.components.parent = this;
    }

    // Reporting
    public void report(int sh) {
        Entity.doShift(sh);
        System.out.print("PACKAGE ");
        compoundName.report(0);
        System.out.println();

        imports.report(sh);
        components.report(sh);
    }

}
