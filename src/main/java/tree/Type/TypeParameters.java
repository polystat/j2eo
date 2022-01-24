package tree.Type;

import java.util.ArrayList;
import tree.Entity;

public class TypeParameters extends Entity {
    // Structure
    public ArrayList<TypeParameter> typeParameters;

    // Creation
    public TypeParameters(TypeParameter tpar) {
        this.typeParameters = new ArrayList<>();
        this.typeParameters.add(tpar);
        if ( tpar != null ) tpar.parent = this;
    }

    public TypeParameters add(TypeParameter tpar) {
        this.typeParameters.add(tpar);
        if ( tpar != null ) tpar.parent = this;
        return this;
    }

    // Reporting
    public void report(int sh) {
        if (typeParameters.size() == 0) {
            return;
        }
        this.title("TYPE PARAMETERS", sh);
        for (TypeParameter tp : typeParameters) {
            tp.report(sh + Entity.shift);
        }
    }

}
