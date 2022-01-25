package tree.Statement;

import tree.Entity;
import java.util.ArrayList;

public class SwitchRules extends Entity
{
    // Structure
    public ArrayList<SwitchRule> rules;

    // Creation
    public SwitchRules(SwitchRule rule)
    {
        this.rules = new ArrayList<>();
        this.rules.add(rule);
        if ( rule != null ) rule.parent = this;
    }
    public SwitchRules add(SwitchRule rule)
    {
        this.rules.add(rule);
        if ( rule != null ) rule.parent = this;
        return this;
    }

    // Reporting
    public void report(int sh)
    {

    }

}
