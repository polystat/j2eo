package tree.Statement;

import tree.Entity;
import tree.Expression.*;

import java.util.ArrayList;

public class SwitchLabel extends Entity
{
    // Structure
    public ArrayList<Expression> cases;

    // Creation
    public SwitchLabel(Expression cs)
    {
        this.cases = new ArrayList<>();
        this.cases.add(cs);
    }
    public SwitchLabel add(Expression cs)
    {
        this.cases.add(cs);
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
