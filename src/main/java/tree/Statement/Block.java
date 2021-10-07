package tree.Statement;

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
//  public ArrayList<String> labels;
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

    }

}
