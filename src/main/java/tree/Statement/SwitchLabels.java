package tree.Statement;

import tree.Entity;
import java.util.ArrayList;

public class SwitchLabels extends Entity
{
    // Structure
    public ArrayList<SwitchLabel> labels;

    // Creation
    public SwitchLabels(SwitchLabel label)
    {
        this.labels = new ArrayList<>();
        this.labels.add(label);
        if ( label != null ) label.parent = this;
    }
    public SwitchLabels add(SwitchLabel label)
    {
        this.labels.add(label);
        if ( label != null ) label.parent = this;
        return this;
    }

    // Reporting
    public void report(int sh)
    {

    }

}
