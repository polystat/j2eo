package tree.Type;

import tree.Entity;

import java.util.ArrayList;

// ClassTypeList1
//    :                      Type
//    | ClassTypeList1 COMMA Type
//    ;
//
// ClassTypeList2
//    :                          Type
//    | ClassTypeList2 AMPERSAND Type
//    ;
public class TypeList extends Entity
{
    // Structure
    public ArrayList<Type> types;

    // Creation
    public TypeList(Type t)
    {
        this.types = new ArrayList<>();
        this.types.add(t);
    }
    public TypeList add(Type t)
    {
        this.types.add(t);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        for (Type t: types)
        {
            t.report(sh);
        }

    }

}
