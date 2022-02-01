package tree.Statement;

import java.util.ArrayList;
import tree.ResourceSpecification;

// SimpleStatement
//    : ...
//    | TRY Block Catches
//    | TRY Block Catches Finally
//    | TRY Block         Finally
//    | TRY ResourceSpecification Block CatchesOpt FinallyOpt // TryWithResourcesStatement
//    ;
//
// Finally
//    : FINALLY Block
//    ;
public class Try extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public ResourceSpecification resSpec;
    public Block block;
    public CatchClauses catches;
    public Block finallyBlock;

    // Creation
    public Try(ArrayList<String> ls,
               ResourceSpecification res,
               Block b,
               CatchClauses cs,
               Block finb) {
        super(ls);
        this.resSpec = res;
        this.block = b;
        this.catches = cs;
        this.finallyBlock = finb;

        if (this.resSpec != null) {
            this.resSpec.parent = this;
        }
        if (this.block != null) {
            this.block.parent = this;
        }
        if (this.catches != null) {
            this.catches.parent = this;
        }
        if (this.finallyBlock != null) {
            this.finallyBlock.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);

    }

}
