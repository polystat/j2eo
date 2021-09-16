package tree.Statement;

import tree.Entity;
import java.util.ArrayList;

public class BlockStatements extends Entity
{
    // Structure
    public ArrayList<BlockStatement> blockStatements;

    // Creation
    public BlockStatements(BlockStatement elem)
    {
        this.blockStatements = new ArrayList<>();
        this.blockStatements.add(elem);
    }
    public BlockStatements add(BlockStatement elem)
    {
        this.blockStatements.add(elem);
        return this;
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
