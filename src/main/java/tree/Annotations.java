package tree;

import java.util.ArrayList;

public class Annotations extends Entity
{
    // Structure
    public ArrayList<Annotation> annotations;

    // Creation
    public Annotations(Annotation ann)
    {
        this.annotations = new ArrayList<Annotation>();
        this.annotations.add(ann);
    }
    public Annotations add(Annotation ann)
    {
        this.annotations.add(ann);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        for ( Annotation ann: annotations)
        {
            ann.report(sh);
        }
    }

}
