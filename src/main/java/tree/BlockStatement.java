package tree;

import java.util.ArrayList;

// Block
//    : LBRACE                   RBRACE
//    | LBRACE BlockStatementSeq RBRACE
//    ;
//
//BlockStatementSeq
//	:                     BlockStatement
//    | BlockStatementSeq BlockStatement
//    ;
//
//BlockStatement
//    : ModifierSeqOpt BlockDeclaration
//    | Statement
//    ;
public class BlockStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public ArrayList<BlockStatementElem> block;

    // Creation
    public BlockStatement(ArrayList<String> ls, ArrayList<BlockStatementElem> block)
    {
        super(ls);
        this.block = block;
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
