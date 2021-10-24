package tree.Statement;

import tree.Entity;

import java.util.ArrayList;

// Block
//    : LBRACE                   RBRACE
//    | LBRACE BlockStatementSeq RBRACE
//    ;
//
// BlockStatementSeq
//	:                     BlockStatement
//    | BlockStatementSeq BlockStatement
//    ;
//
// BlockStatement
//    : ModifierSeqOpt BlockDeclaration
//    | Statement
//    ;
public class Block extends Statement
{
    // Structure
//  public ArrayList<String> labels; -- from the base class
    public BlockStatements block;

    // Creation
    public Block(ArrayList<String> ls, BlockStatements block)
    {
        super(ls);
        this.block = block;
    }

    // Reporting
    public void report(int sh)
    {
        super.report(sh);
        if ( block != null ) block.report(sh);
    }

}
