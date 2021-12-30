package tree.Declaration;

import tree.Entity;
import tree.Type.*;

// Intermediate class - won't appear in the AST

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
        if ( Entity.debug ) System.out.println("Type with declarator(s) taken");
    }

    // Reporting
    public void report(int sh) { }
}
