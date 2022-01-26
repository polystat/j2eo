package tree;

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
public class Initializer extends Entity {
    // NO structure

    // NO creation

    // Reporting
    public void report(int sh) {

    }

}
