package tree.Expression.Primary;

import tree.Entity;
import tree.Type.Type;

// Primary
//    : ...
//    |          THIS
//    | Type DOT THIS
//    | ...
public class This extends Primary
{
    // Empty structure
    public Type type; // if non-null then "qualified this"

    // Creation
    public This(Type t)
    {
        this.type = t;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("THIS");
        if ( type != null )
            type.report(sh+Entity.shift);
    }

}
