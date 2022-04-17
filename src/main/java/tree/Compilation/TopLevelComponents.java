package tree.Compilation;

import java.lang.reflect.Array;
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

    public TopLevelComponents(ArrayList<TopLevelComponent> components) {
        this.components = components;
        for (var tlc : components) {
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
