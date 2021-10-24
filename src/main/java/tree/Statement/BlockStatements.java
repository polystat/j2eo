package tree.Statement;

import tree.Declaration.TypeAndDeclarators;
import tree.Declaration.VariableDeclaration;
import tree.Declaration.VariableDeclarator;
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
        deconstruct(elem);
    }
    public BlockStatements add(BlockStatement elem)
    {
        deconstruct(elem);
        return this;
    }
    private void deconstruct(BlockStatement stmt)
    {
        if ( stmt != null && stmt.declaration != null && stmt.declaration instanceof TypeAndDeclarators)
        {
            TypeAndDeclarators tds = (TypeAndDeclarators)stmt.declaration;
            for (VariableDeclarator declarator: tds.declarators.declarators)
            {
                VariableDeclaration variable =
                        new VariableDeclaration(declarator.name,tds.modifiers,tds.type,declarator.dims,declarator.initializer);
                this.blockStatements.add(new BlockStatement(variable));
            }
        }
        else
            this.blockStatements.add(stmt);
    }

    // Reporting
    public void report(int sh)
    {
        for (BlockStatement stmt: blockStatements )
        {
            if ( stmt != null ) stmt.report(sh);
        }
    }

}
