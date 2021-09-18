package tree.Statement;

import tree.Declaration.Declaration;
import tree.Entity;

// BlockStatement
//    : ModifierSeqOpt BlockDeclaration
//    | Statement
//    ;
public class BlockStatement extends Entity
{
    // Structure: either a declaration OR a statement
    public Declaration declaration;
    public Statement statement;

    // Creation
    public BlockStatement(Declaration d)
    {
        this.declaration = d;
        this.statement = null;
    }
    public BlockStatement(Statement stmt)
    {
        this.declaration = null;
        this.statement = stmt;
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
