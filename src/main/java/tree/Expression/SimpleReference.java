package tree.Expression;

import tree.CompoundName;
import tree.Entity;

public class SimpleReference extends Expression {
    // Structure
    public CompoundName compoundName;

    // Creation
    public SimpleReference(CompoundName cn) {
        this.compoundName = cn;
    }

    // Reporting
    public void report(int sh) {
        Entity.doShift(sh);
        System.out.print(this.unique + ":REFERENCE TO ");
        compoundName.report(sh);
        System.out.println();
    }

}
