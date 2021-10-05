package tree;

// AnnoParameterList
//    :                         IDENTIFIER EQUAL ElementValue
//    | AnnoParameterList COMMA IDENTIFIER EQUAL ElementValue
//    ;
//
// ElementValue
//    : ConditionalExpression
//    | LBRACE ElementValueListOpt        RBRACE
//    | LBRACE                      COMMA RBRACE
//    | Annotation
//    ;
//
// ElementValueListOpt
//    :  //empty
//    |                           ElementValue
//    | ElementValueListOpt COMMA ElementValue
//    ;
public class AnnoParameterList extends Entity
{
}
