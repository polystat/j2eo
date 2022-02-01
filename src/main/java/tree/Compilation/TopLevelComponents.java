package tree.Compilation;

import java.util.ArrayList;
import tree.Entity;

// TopLevelComponentSeq
//    :                      ModifierSeqOpt TopLevelComponent
//    | TopLevelComponentSeq ModifierSeqOpt TopLevelComponent
//    ;
public class TopLevelComponents extends Entity {
    // Structure
    public ArrayList<TopLevelComponent> components;

    // Creation
    public TopLevelComponents(TopLevelComponent tlc) {
        this.components = new ArrayList<>();
        this.components.add(tlc);

        if (tlc != null) {
            tlc.parent = this;
        }
    }

    public TopLevelComponents add(TopLevelComponent tlc) {
        this.components.add(tlc);
        if (tlc != null) {
            tlc.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        for (TopLevelComponent tlc : components) {
            tlc.report(sh);
        }
    }

}
