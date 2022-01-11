package tree.Expression;

import tree.Declaration.ParameterDeclarations;
import tree.Statement.Block;

// LambdaExpression
//    : IDENTIFIER       ARROW LambdaBody
//    | LambdaParameters ARROW LambdaBody
//    ;
//
// LambdaParameters
//    : LPAREN                      RPAREN
//    | LPAREN LambdaParameterList1 RPAREN
//    | LPAREN LambdaParameterList2 RPAREN
// // | IDENTIFIER
//    ;
//
// LambdaParameterList1
//    :                            IDENTIFIER
//    | LambdaParameterList1 COMMA IDENTIFIER
//    ;
//
// LambdaParameterList2
//    :                            LambdaParameter
//    | LambdaParameterList2 COMMA LambdaParameter
//    ;
//
// LambdaParameter
// // :                                IDENTIFIER
//    : ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt
//    | ModifierSeqOpt VAR             IDENTIFIER DimsOpt
//    | ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  // VariableArityParameter
//    ;
public class Lambda extends Expression {
    // Structure
    public ParameterDeclarations parameters;
    // One of these two!
    public Expression expression;
    public Block block;

    // Creation
    public Lambda(ParameterDeclarations pars, Expression expr) {
        this.parameters = pars;
        this.expression = expr;
    }

    public Lambda(ParameterDeclarations pars, Block block) {
        this.parameters = pars;
        this.block = block;
    }

    // Reporting
    public void report(int sh) {

    }

}
