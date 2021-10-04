package tree.Declaration;

import tree.Entity;
import java.util.ArrayList;

// Intermediate class; won't appear in the AST
//
public class VariableDeclarators extends Entity
{
    // Structure
    public ArrayList<VariableDeclarator> declarators;

    // Creation
    public VariableDeclarators(VariableDeclarator decl)
    {
        this.declarators = new ArrayList<>();
        this.declarators.add(decl);
    }
    public VariableDeclarators add(VariableDeclarator decl)
    {
        this.declarators.add(decl);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        // Empty
    }

    // Generation
    public void generateEO()
    {
        // Empty
    }
}
