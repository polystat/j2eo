package tree.Statement;

import java.util.ArrayList;
import tree.Expression.Expression;

// SimpleStatement
//    : ...
//    | SWITCH LPAREN Expression RPAREN SwitchBlock  // SwitchStatement
//    | ...
//    ;
//
// SwitchBlock
//    : LBRACE SwitchRuleSeq                                  RBRACE
//    | LBRACE SwitchBlockStatementGroupSeqOpt                RBRACE
//    | LBRACE SwitchBlockStatementGroupSeqOpt SwitchLabelSeq RBRACE
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
// SwitchBlockStatementGroupSeqOpt
//    :  // empty
//    |                                 SwitchBlockStatementGroup
//    | SwitchBlockStatementGroupSeqOpt SwitchBlockStatementGroup
//    ;
//
// SwitchBlockStatementGroup
//    : SwitchLabelSeq
//    | SwitchLabelSeq BlockStatementSeq
//    ;
//
// SwitchLabelSeq
//    :                SwitchLabel COLON
//    | SwitchLabelSeq SwitchLabel COLON
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
public class Switch extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public Expression expression;

    // Either "rules" OR "blocks"
    public SwitchRules rules;
    public SwitchBlocks blocks;

    // Creation
    public Switch(ArrayList<String> ls, Expression expr, SwitchRules rs) {
        super(ls);
        this.expression = expr;
        this.rules = rs;
        this.blocks = null;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        if (this.rules != null) {
            this.rules.parent = this;
        }
    }

    public Switch(ArrayList<String> ls, Expression expr, SwitchBlocks bs, int useless) {
        super(ls);
        this.expression = expr;
        this.blocks = bs;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        if (this.blocks != null) {
            this.blocks.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
    }

}
