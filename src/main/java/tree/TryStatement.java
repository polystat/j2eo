package tree;

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
public class TryStatement extends Statement
{
    // Structure
//  public ArrayList<String> labels;
    public ResourceSpecification resSpec;
    public BlockStatement block;
    public ArrayList<CatchClause> catches;
    public BlockStatement finallyBlock;

    // Creation
    public TryStatement(ArrayList<String> ls,
                        ResourceSpecification res,
                        BlockStatement b,
                        ArrayList<CatchClause> cs,
                        BlockStatement finb)
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
