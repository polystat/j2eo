package tree.Declaration;

import tree.Type.*;

// Intermediate class - wont't appear in the AST

public class TypeAndDeclarators extends Declaration
{
    // Structure
//  public Type type; -- in the base class
    public VariableDeclarators declarators;

    // Creation
    public TypeAndDeclarators(Type t, VariableDeclarators vds)
    {
        super(null,null,t);
        this.declarators = vds;
    }

    // Reporting
    public void report(int sh) { }
    // Generation
    public void generateEO() { }
}
