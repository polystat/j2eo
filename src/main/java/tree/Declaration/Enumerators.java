package tree.Declaration;

import tree.Entity;
import java.util.ArrayList;

// EnumConstantListOpt
//    : %empty
//    : EnumConstantList
//    ;
//
// EnumConstantList
//    :                           EnumConstant
//    | EnumConstantListOpt COMMA EnumConstant
//    ;
public class Enumerators extends Entity
{
    // Structure
    public ArrayList<Enumerator> enumerators;

    // Creation
    public Enumerators(Enumerator en)
    {
        this.enumerators = new ArrayList<>();
        this.enumerators.add(en);

        if ( en != null ) en.parent = this;
    }
    public Enumerators add(Enumerator en)
    {
        this.enumerators.add(en);
        if ( en != null ) en.parent = this;
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        for (Enumerator e: enumerators)
        {
            e.report(sh);
        }
    }
}
