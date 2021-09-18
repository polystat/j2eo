package tree.Statement;

import tree.ResourceSpecification;
import java.util.ArrayList;

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
public class Try extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public ResourceSpecification resSpec;
    public Block block;
    public ArrayList<CatchClause> catches;
    public Block finallyBlock;

    // Creation
    public Try(ArrayList<String> ls,
               ResourceSpecification res,
               Block b,
               ArrayList<CatchClause> cs,
               Block finb)
    {
        super(ls);
        this.resSpec = res;
        this.block = b;
        this.catches = cs;
        this.finallyBlock = finb;
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
