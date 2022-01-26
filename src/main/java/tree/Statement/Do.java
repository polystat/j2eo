package tree.Statement;

import java.util.ArrayList;
import tree.Expression.Expression;

// SimpleStatement
//    : ...
//    | DO Statement WHILE LPAREN Expression RPAREN SEMICOLON // DoStatement
//    | ...
//    ;
public class Do extends Statement {
    // Structure
    // public ArrayList<String> labels;
    public Statement statement;
    public Expression condition;

    // Creation
    public Do(ArrayList<String> ls, Statement stmt, Expression cond) {
        super(ls);
        this.statement = stmt;
        this.condition = cond;

        if (this.statement != null) {
            this.statement.parent = this;
        }
        if (this.condition != null) {
            this.condition.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
    }

}
