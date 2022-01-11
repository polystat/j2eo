package tree.Statement;

import tree.Declaration.CatchParameter;
import tree.Entity;

// CatchClause
//    : CATCH LPAREN CatchFormalParameter RPAREN Block
//    ;
public class CatchClause extends Entity {
    // Structure
    public CatchParameter catchParameter;
    public Block block;

    // Creation
    public CatchClause(CatchParameter catchPar, Block b) {
        this.catchParameter = catchPar;
        this.block = b;
    }

    // Reporting
    public void report(int sh) {

    }

}
