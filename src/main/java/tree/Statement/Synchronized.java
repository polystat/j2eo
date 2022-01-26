package tree.Statement;

import java.util.ArrayList;
import tree.Expression.Expression;

// SimpleStatement
//    : ...
//    | SYNCHRONIZED LPAREN Expression RPAREN Block  // SynchronizedStatement
//    | ...
//    ;
public class Synchronized extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public Expression expression;
    public Block block;

    // Creation
    public Synchronized(ArrayList<String> ls, Expression expr, Block block) {
        super(ls);
        this.expression = expr;
        this.block = block;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        if (this.block != null) {
            this.block.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
    }

}
