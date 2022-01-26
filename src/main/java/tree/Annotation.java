package tree;

// Annotation
//    : AT CompoundName
//    | AT CompoundName LPAREN                   RPAREN
//    | AT CompoundName LPAREN AnnoParameterList RPAREN
//    | AT CompoundName LPAREN ElementValue      RPAREN
//    ;
public class Annotation extends Entity {
    // Structure
    public CompoundName compoundName;
    public AnnoParameterList annoParameterList;

    // Creation
    public Annotation(CompoundName cn, AnnoParameterList apl) {
        this.compoundName = cn;
        this.annoParameterList = apl;

        if (this.compoundName != null) {
            this.compoundName.parent = this;
        }
        if (this.annoParameterList != null) {
            this.annoParameterList.parent = this;
        }
    }

    public Annotation(CompoundName cn, AnnoElementValue aev) {
        this.compoundName = cn;
        this.annoParameterList = new AnnoParameterList();
        // this.annoParameterList.add

        if (this.compoundName != null) {
            this.compoundName.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        Entity.doShift(sh);
        System.out.print("ANNOTATION ");
        compoundName.report(0);
        System.out.println();
        annoParameterList.report(sh + Entity.shift);
    }

}
