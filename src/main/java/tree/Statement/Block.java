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
        if ( labels != null && labels.size() > 0 )
        {
            String labs = "LABELS: ";
            for (int i=0; i<labels.size(); i++ )
                labs += labels.get(i) + " ";
            Entity.doShift(sh);
            System.out.println(labs);
        }
        if ( block != null ) block.report(sh);
    }

}
