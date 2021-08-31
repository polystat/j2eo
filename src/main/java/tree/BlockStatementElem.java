package tree;

// BlockStatement
//    : ModifierSeqOpt BlockDeclaration
//    | Statement
//    ;
public class BlockStatementElem extends Entity
{
    // Structure: either a declaration OR a statement
    public Declaration declaration;
    public Statement statement;

    // Creation
    public BlockStatementElem(Declaration d)
    {
        this.declaration = d;
        this.statement = null;
    }
    public BlockStatementElem(Statement stmt)
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
