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
        this.declarations.add(d);
    }
    public Declarations add(Declaration d)
    {
        this.declarations.add(d);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        for (Declaration d: declarations)
        {
            d.report(sh);
        }
    }

    // Generation
    public void generateEO()
    {

    }
}
