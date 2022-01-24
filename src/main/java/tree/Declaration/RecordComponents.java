package tree.Declaration;

import tree.Entity;
import java.util.ArrayList;

public class RecordComponents extends Entity
{
    //Structure
    public ArrayList<RecordComponent> recordComps;

    // Creation
    public RecordComponents(RecordComponent comp)
    {
        this.recordComps = new ArrayList<>();
        this.recordComps.add(comp);
        if ( comp != null ) comp.parent = this;
    }
    public RecordComponents add(RecordComponent comp)
    {
        this.recordComps.add(comp);
        if ( comp != null ) comp.parent = this;
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        // Empty
    }

}
