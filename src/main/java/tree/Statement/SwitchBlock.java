package tree.Statement;

import tree.Entity;
import java.util.ArrayList;

public class SwitchBlock extends Entity
{
    // Structure
    public ArrayList<SwitchLabel> labels;
    public Block block;

    // Creation
    public SwitchBlock(ArrayList<SwitchLabel> ls, Block block)
    {
        this.labels = ls;
        this.block = block;

        if ( this.block != null ) this.block.parent = this;
    }

    // Reporting
    public void report(int sh)
    {

    }

}
