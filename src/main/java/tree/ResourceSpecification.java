package tree;

// ResourceSpecification
//    : LPAREN ResourceSeq           RPAREN
//    | LPAREN ResourceSeq SEMICOLON RPAREN
//    ;
//
// ResourceSeq
//    :                       Resource
//    | ResourceSeq SEMICOLON Resource
//    ;
//
// Resource
//    : LocalVariableDeclaration
//    | FieldAccess  // VariableAccess? - doesn't exist in the grammar?
//    ;
public class ResourceSpecification extends Entity
{
}
