package tree.Declaration;

import java.util.ArrayList;
import tree.Entity;

// ImportDeclarationSeqOpt
//    :  // empty
//    |                         ImportDeclaration
//    | ImportDeclarationSeqOpt ImportDeclaration
//    ;
public class ImportDeclarations extends Entity {
    // Structure
    public ArrayList<ImportDeclaration> imports;

    // Creation
    public ImportDeclarations(ImportDeclaration id) {
        this.imports = new ArrayList<>();
        this.imports.add(id);

        if (id != null) {
            id.parent = this;
        }
    }

    public ImportDeclarations add(ImportDeclaration id) {
        imports.add(id);
        if (id != null) {
            id.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        for (ImportDeclaration id : imports) {
            id.report(sh);
        }
    }

}
