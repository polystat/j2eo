package tree;

import java.util.ArrayList;

public class SwitchBlock extends Entity
{
    // Structure
    public ArrayList<SwitchLabel> labels;
    public BlockStatement block;

    // Creation
    public SwitchBlock(ArrayList<SwitchLabel> ls, BlockStatement block)
    {
        this.labels = ls;
        this.block = block;
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
