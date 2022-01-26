package tree.Statement;

import java.util.ArrayList;
import tree.Entity;

public class SwitchBlocks extends Entity {
    // Structure
    public ArrayList<SwitchBlock> blocks;

    // Creation
    public SwitchBlocks(SwitchBlock block) {
        this.blocks = new ArrayList<>();
        this.blocks.add(block);
        if (block != null) {
            block.parent = this;
        }
    }

    public SwitchBlocks add(SwitchBlock block) {
        this.blocks.add(block);
        if (block != null) {
            block.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {

    }

}
