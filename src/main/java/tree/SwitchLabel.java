package tree;

import java.util.ArrayList;

public class SwitchLabel extends Entity
{
    // Structure
    public ArrayList<Expression> cases;

    // Creation
    public SwitchLabel(ArrayList<Expression> cs)
    {
        this.cases = cs;
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
