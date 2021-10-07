package tree.Declaration;

import tree.Entity;
import java.util.*;

public class Declarations extends Entity
{
    // Structure
    public ArrayList<Declaration> declarations;

    // Creation
    public Declarations(Declaration d)
    {
        this.declarations = new ArrayList<>();
        deconstruct(d);
    }
    public Declarations add(Declaration d)
    {
        deconstruct(d);
        return this;
    }
    private void deconstruct(Declaration d)
    {
        if ( d instanceof TypeAndDeclarators )
        {
            TypeAndDeclarators tds = (TypeAndDeclarators)d;
            for (VariableDeclarator declarator: tds.declarators.declarators)
            {
                VariableDeclaration variable =
                        new VariableDeclaration(tds.name,d.modifiers,d.type,declarator.dims,declarator.initializer);
                this.declarations.add(variable);
            }
        }
        else
            this.declarations.add(d);
    }

    // Reporting
    public void report(int sh)
    {
        for (Declaration d: declarations)
        {
            d.report(sh);
        }
    }

}
