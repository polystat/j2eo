package tree.Statement;

import tree.Entity;
import tree.Expression.Expression;

// SwitchBlock
//    : LBRACE SwitchRuleSeq RBRACE
//    | ...
//    ;
//
// SwitchRuleSeq
//    :               SwitchRule
//    | SwitchRuleSeq SwitchRule
//    ;
//
// SwitchRule
//    : SwitchLabel ARROW Expression SEMICOLON
//    | SwitchLabel ARROW Block
//    | SwitchLabel ARROW THROW Expression SEMICOLON // ThrowStatement
//    ;
//
// SwitchLabel
//    : CASE CaseExpressionList
//    | DEFAULT
//    ;
//
// CaseExpressionList
//    :                          AssignmentExpression
//    | CaseExpressionList COMMA AssignmentExpression
//    ;
public class SwitchRule extends Entity {
    // ONE of the following values:
    public Expression expression;
    public Block block;
    public Throw throwStatement;
    // Structure
    SwitchLabel label;

    // Creation: three cases
    public SwitchRule(SwitchLabel l, Expression expr) {
        this.label = l;
        this.expression = expr;
        this.block = null;
        this.throwStatement = null;

        if (this.label != null) {
            this.label.parent = this;
        }
        if (this.expression != null) {
            this.expression.parent = this;
        }
    }

    public SwitchRule(SwitchLabel l, Block block) {
        this.label = l;
        this.block = block;
        this.throwStatement = null;

        if (this.label != null) {
            this.label.parent = this;
        }
        if (this.block != null) {
            this.block.parent = this;
        }
    }

    public SwitchRule(SwitchLabel l, Throw thrwStmt) {
        this.label = l;
        this.expression = null;
        this.block = null;
        this.throwStatement = thrwStmt;

        if (this.label != null) {
            this.label.parent = this;
        }
        if (this.throwStatement != null) {
            this.throwStatement.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }

}

