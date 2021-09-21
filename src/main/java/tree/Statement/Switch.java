package tree.Statement;

import tree.Expression.*;

import java.util.ArrayList;

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
public class Switch extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public Expression expression;

    // Either "rules" OR "blocks"
    public ArrayList<SwitchRule> rules;
    public ArrayList<SwitchBlock> blocks;

    // Creation
    public Switch(ArrayList<String> ls,Expression expr,ArrayList<SwitchRule> rs)
    {
        super(ls);
        this.expression = expr;
        this.rules = rs;
        this.blocks = null;
    }
    public Switch(ArrayList<String> ls,Expression expr,ArrayList<SwitchBlock> bs,int useless)
    {
        super(ls);
        this.expression = expr;
        this.rules = null;
        this.blocks = bs;
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
