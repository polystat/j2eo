package tree.Expression;

import tree.*;

public class SimpleReference extends Expression
{
    // Structure
    public CompoundName compoundName;

    // Creation
    public SimpleReference(CompoundName cn)
    {
        this.compoundName = cn;
    }

    // Reporting
    public void report(int sh)
    {
        compoundName.report(sh);
    }

}
