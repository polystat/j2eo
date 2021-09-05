package tree;

import java.util.ArrayList;

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

    // Generation
    public void generateEO()
    {

    }
}
