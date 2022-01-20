package tree.Declaration;

import tree.CompoundName;
import tree.Entity;

// ImportDeclaration
//    : IMPORT StaticOpt CompoundName          SEMICOLON
//    | IMPORT StaticOpt CompoundName DOT STAR SEMICOLON
//    ;
//
// StaticOpt
//    : // empty
//    | STATIC
//    ;
public class ImportDeclaration extends Entity
{
    // Structure
    public boolean signStatic;
    public CompoundName compoundName;
    public boolean signStar;

    // Creation
    public ImportDeclaration(boolean stat, CompoundName cn, boolean star)
    {
        this.signStatic = stat;
        this.compoundName = cn;
        this.signStar = star;

        if ( this.compoundName != null ) this.compoundName.parent = this;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.print("IMPORT ");
        if ( this.signStatic ) System.out.print("STATIC ");
        compoundName.report(0);
        if ( this.signStar ) System.out.print(".*");
        System.out.println();
    }

}
