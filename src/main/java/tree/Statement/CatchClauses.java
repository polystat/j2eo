package tree.Statement;

import java.util.ArrayList;
import tree.Entity;

// CatchesOpt
//    : %empty
//    | Catches
//    ;
//
//Catches
//    :         CatchClause
//    | Catches CatchClause
//    ;
public class CatchClauses extends Entity {
    // Structure
    public ArrayList<CatchClause> catchClauses;

    // Creation
    public CatchClauses(CatchClause clause) {
        this.catchClauses = new ArrayList<>();
        this.catchClauses.add(clause);
        if (clause != null) {
            clause.parent = this;
        }
    }

    public CatchClauses add(CatchClause clause) {
        this.catchClauses.add(clause);
        if (clause != null) {
            clause.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {

    }

}
