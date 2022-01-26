package tree.Type;

import java.util.ArrayList;
import tree.Entity;

// ClassTypeList1
//    :                      Type
//    | ClassTypeList1 COMMA Type
//    ;
//
// ClassTypeList2
//    :                          Type
//    | ClassTypeList2 AMPERSAND Type
//    ;
public class TypeList extends Entity {
    // Structure
    public ArrayList<Type> types;

    // Creation
    public TypeList(Type t) {
        this.types = new ArrayList<>();
        this.types.add(t);
        if (t != null) {
            t.parent = this;
        }
    }

    public TypeList add(Type t) {
        this.types.add(t);
        if (t != null) {
            t.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        for (Type t : types) {
            t.report(sh);
        }

    }

}
