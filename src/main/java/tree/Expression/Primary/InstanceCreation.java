package tree.Expression.Primary;

// Primary
//    : ...
//    | ClassInstanceCreationExpression
//    | ...
//
// ClassInstanceCreationExpression
//    :                  UnqualifiedClassInstanceCreationExpression
//    | CompoundName DOT UnqualifiedClassInstanceCreationExpression
//    | Primary      DOT UnqualifiedClassInstanceCreationExpression
//    ;
//
// UnqualifiedClassInstanceCreationExpression
//    : NEW TypeArgumentsOpt ClassOrInterfaceTypeToInstantiate Arguments ClassBodyOpt
//    ;
//
// ClassOrInterfaceTypeToInstantiate
//    : AnnotatedCompoundName TypeArgumentsOpt
//    | AnnotatedCompoundName DIAMOND
//    ;
//
// AnnotatedCompoundName
//    :                           AnnotationSeqOpt /*AnnotationOpt*/ IDENTIFIER
//    | AnnotatedCompoundName DOT AnnotationSeqOpt /*AnnotationOpt*/ IDENTIFIER
//    ;
public class InstanceCreation extends Primary {
}
