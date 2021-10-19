package tree.Declaration;

import tree.Entity;
import java.util.ArrayList;

// ImportDeclarationSeqOpt
//    :  // empty
//    |                         ImportDeclaration
//    | ImportDeclarationSeqOpt ImportDeclaration
//    ;
public class ImportDeclarations extends Entity
{
    // Structure
    public ArrayList<ImportDeclaration> imports;

    // Creation
    public ImportDeclarations(ImportDeclaration id)
    {
        this.imports = new ArrayList<>();
        this.imports.add(id);
    }
    public ImportDeclarations add(ImportDeclaration id)
    {
        imports.add(id);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        for (ImportDeclaration id: imports)
        {
            id.report(sh);
        }
    }

}
