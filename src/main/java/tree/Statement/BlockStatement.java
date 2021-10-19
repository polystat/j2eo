package tree.Statement;

import tree.Declaration.Declaration;
import tree.Expression.*;

// BlockStatement
//    : ModifierSeqOpt BlockDeclaration
//    | Statement
//    ;
public class BlockStatement extends Statement
{
    // Structure: either a declaration OR a statement OR an expression
    public Declaration declaration;
    public Statement statement;
    public Expression expression;

    // Creation
    public BlockStatement(Declaration d)
    {
        super(null);
        this.declaration = d;
        this.statement = null;
        this.expression = null;
    }
    public BlockStatement(Statement stmt)
    {
        super(null);
        this.declaration = null;
        this.statement = stmt;
        this.expression = null;
    }
    public BlockStatement(Expression expr)
    {
        super(null);
        this.declaration = null;
        this.statement = null;
        this.expression = expr;
    }

    // Reporting
    public void report(int sh)
    {
        if ( declaration != null ) { declaration.report(sh); return; }
        if ( statement != null ) { statement.report(sh); return; }
        if ( expression != null ) { expression.report(sh); return; }
    }

}
