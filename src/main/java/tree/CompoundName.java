package tree;

import java.util.ArrayList;

// %nterm <CompoundName> CompoundName
//
// CompoundName
//    :                  IDENTIFIER { $$ = new CompoundName($1.image); }
//    | CompoundName DOT IDENTIFIER { $$ = $1.add($3.image); }
//    ;
public class CompoundName extends Entity
{
    // Structure
    public ArrayList<String> names;

    // Creation
    public CompoundName(String first)
    {
        names = new ArrayList<>();
        names.add(first);
    }

    // Adding
    public CompoundName add(String next)
    {
        names.add(next);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        for (int i=1; i<=names.size(); i++)
        {
            System.out.print(names.get(i));
            if ( i < names.size() )
                System.out.print(".");
        }
    }

    // Generation
    public void generateEO()
    {

    }
}
