package tree;

import java.util.ArrayList;

// TopLevelComponent
//    : ClassDeclaration
//    | InterfaceDeclaration
//    ;
public class TopLevelComponent  extends Entity
{
    void f()
    {
        ArrayList<String> l = new ArrayList<String>();
        l.add("AA");
        l.add("BB");
    }
}
