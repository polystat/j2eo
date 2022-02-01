package tree.Declaration;

import java.util.ArrayList;
import tree.Entity;

public class Declarations extends Entity {
    // Structure
    public ArrayList<Declaration> declarations;

    // Creation
    public Declarations(Declaration d) {
        this.declarations = new ArrayList<>();
        deconstruct(d);
    }

    public Declarations add(Declaration d) {
        deconstruct(d);
        return this;
    }

    private void deconstruct(Declaration d) {
        if (d instanceof TypeAndDeclarators) {
            TypeAndDeclarators tds = (TypeAndDeclarators) d;
            for (VariableDeclarator declarator : tds.declarators.declarators) {
                VariableDeclaration variable =
                        new VariableDeclaration(declarator.name, d.modifiers, d.type, declarator.dims, declarator.initializer);
                this.declarations.add(variable);
                if (variable != null) {
                    variable.parent = this;
                }
            }
        } else {
            this.declarations.add(d);
            if (d != null) {
                d.parent = this;
            }
        }
    }

    // Reporting
    public void report(int sh) {
        for (Declaration d : declarations) {
            d.report(sh);
        }
    }

}
