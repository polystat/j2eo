package tree.Compilation;

import tree.Entity;
import java.util.ArrayList;

// TopLevelComponentSeq
//    :                      ModifierSeqOpt TopLevelComponent
//    | TopLevelComponentSeq ModifierSeqOpt TopLevelComponent
//    ;
public class TopLevelComponents extends Entity
{
    // Structure
    public ArrayList<TopLevelComponent> components;

    // Creation
    public TopLevelComponents(TopLevelComponent tlc)
    {
        this.components = new ArrayList<>();
        this.components.add(tlc);
    }
    public TopLevelComponents add(TopLevelComponent tlc)
    {
        this.components.add(tlc);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        for (TopLevelComponent tlc: components)
        {
            tlc.report(sh);
        }
    }

    // Generation
    public void generateEO()
    {

    }
}
