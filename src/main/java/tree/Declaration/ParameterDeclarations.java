package tree.Declaration;

import tree.Entity;
import java.util.ArrayList;

public class ParameterDeclarations extends Entity
{
    // Structure
    public ArrayList<ParameterDeclaration> parameters;

    // Creation
    public ParameterDeclarations(ParameterDeclaration par)
    {
        this.parameters = new ArrayList<>();
        this.parameters.add(par);
    }
    public ParameterDeclarations add(ParameterDeclaration par)
    {
        this.parameters.add(par);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
    }

    // Generation
    public void generateEO()
    {

    }
}
