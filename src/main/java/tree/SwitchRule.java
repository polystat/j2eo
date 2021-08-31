package tree;

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
public class SwitchRule extends Entity
{
    // Structure
    SwitchLabel label;

    // One of the following values:
    public Expression expression;
    public BlockStatement block;
    public ThrowStatement throwStatement;

    // Creation: three cases
    public SwitchRule(SwitchLabel l,Expression expr)
    {
        this.label = l;
        this.expression = expr;
        this.block = null;
        this.throwStatement = null;
    }
    public SwitchRule(SwitchLabel l,BlockStatement block)
    {
        this.label = l;
        this.expression = null;
        this.block = block;
        this.throwStatement = null;
    }
    public SwitchRule(SwitchLabel l,ThrowStatement tStmt)
    {
        this.label = l;
        this.expression = null;
        this.block = null;
        this.throwStatement = tStmt;
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

