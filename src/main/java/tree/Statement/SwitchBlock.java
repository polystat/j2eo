package tree.Statement;

import java.util.ArrayList;
import tree.Entity;

public class SwitchBlock extends Entity {
    // Structure
    public ArrayList<SwitchLabel> labels;
    public Block block;

    // Creation
    public SwitchBlock(ArrayList<SwitchLabel> ls, Block block) {
        this.labels = ls;
        this.block = block;

        if (this.block != null) {
            this.block.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }

}
