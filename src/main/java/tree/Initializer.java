package tree;

import tree.Expression.*;
import java.util.ArrayList;

// ArrayInitializer
//    : LBRACE VariableInitializerListOpt       RBRACE
//    | LBRACE VariableInitializerListOpt COMMA RBRACE
//    ;
//
// VariableInitializerListOpt
//    :  // empty
//    | VariableInitializerList
//    ;
//
// VariableInitializerList
//    :                               VariableInitializer
//    | VariableInitializerList COMMA VariableInitializer
//    ;
//
// VariableInitializer
//    : Expression
//    | ArrayInitializer
//    ;
public class Initializer extends Entity
{
    // Structure
    public Expression             singleInitializer;
    public ArrayList<Initializer> arrayInitializer;

    // Creation
    public Initializer(Expression single)
    {
        this.singleInitializer = single;
        this.arrayInitializer = null;
    }
    public Initializer(ArrayList<Initializer> array)
    {
        this.singleInitializer = null;
        this.arrayInitializer = array;
    }

    // Reporting
    public void report(int sh)
    {

    }

    // Generation
    public void generateEO()
    {

    }

}
