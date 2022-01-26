package tree.Statement;

import java.util.ArrayList;
import tree.Entity;
import tree.Expression.Expression;

// WhileStatement
//    : WHILE LPAREN Expression RPAREN Statement
//    ;
public class While extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public Expression condition;
    public Statement statement;

    // Creation
    public While(ArrayList<String> ls, Expression c, Statement s) {
        super(ls);
        this.condition = c;
        this.statement = s;

        if (this.condition != null) {
            this.condition.parent = this;
        }
        if (this.statement != null) {
            this.statement.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
        Entity.doShift(sh);
        System.out.println("WHILE");
        condition.report(sh + Entity.shift);
        statement.report(sh + Entity.shift);
    }

}
