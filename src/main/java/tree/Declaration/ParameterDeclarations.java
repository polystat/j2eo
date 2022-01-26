package tree.Declaration;

import java.util.ArrayList;
import tree.Entity;

public class ParameterDeclarations extends Entity {
    // Structure
    public ArrayList<ParameterDeclaration> parameters;

    // Creation
    public ParameterDeclarations(ParameterDeclaration par) {
        this.parameters = new ArrayList<>();
        this.parameters.add(par);
        if (par != null) {
            par.parent = this;
        }
    }

    public ParameterDeclarations add(ParameterDeclaration par) {
        this.parameters.add(par);
        if (par != null) {
            par.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        for (ParameterDeclaration p : parameters) {
            p.report(sh);
        }
    }

}
