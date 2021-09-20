package tree.Declaration;

import tree.Entity;
import tree.Statement.*;

// ConstructorBody
//    : LBRACE                                                 RBRACE
//    | LBRACE ExplicitConstructorInvocation                   RBRACE
//    | LBRACE                               BlockStatementSeq RBRACE
//    | LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE
//    ;
public class ConstructorBody extends Entity
{
    // Structure
    public ExplicitConstructorInvocation invocation;
    public Block block;

    // Creation
    public ConstructorBody(ExplicitConstructorInvocation inv, Block block)
    {
        this.invocation = inv;
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
