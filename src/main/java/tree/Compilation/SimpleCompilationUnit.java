package tree.Compilation;

import tree.Declaration.ImportDeclarations;

// CompilationUnit
//    : %empty
//    | Package
//    | Module
//    | ImportDeclarationSeqOpt TopLevelComponentSeq <=====
//    ;
public class SimpleCompilationUnit extends CompilationUnit {
    // Structure
    public ImportDeclarations imports;
    public TopLevelComponents components;

    // Creation
    public SimpleCompilationUnit(ImportDeclarations ids, TopLevelComponents tlcs) {
        this.imports = ids;
        this.components = tlcs;

        if (this.imports != null) {
            this.imports.parent = this;
        }
        if (this.components != null) {
            this.components.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        if (imports != null) {
            imports.report(sh);
        }
        if (components != null) {
            components.report(sh);
        }
    }

}
