package tree.Declaration;

import java.util.ArrayList;
import tree.Entity;

// Intermediate class; won't appear in the AST
//
public class VariableDeclarators extends Entity {
    // Structure
    public ArrayList<VariableDeclarator> declarators;

    // Creation
    public VariableDeclarators(VariableDeclarator decl) {
        this.declarators = new ArrayList<>();
        this.declarators.add(decl);

        if (decl != null) {
            decl.parent = this;
        }
    }

    public VariableDeclarators add(VariableDeclarator decl) {
        this.declarators.add(decl);
        if (decl != null) {
            decl.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        // Empty
    }

}
