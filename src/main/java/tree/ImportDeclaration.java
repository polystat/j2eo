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
    public ArrayList<String> compoundName;
    public boolean signStar;

    // Creation
    public ImportDeclaration(boolean stat, ArrayList<String> cn, boolean star)
    {
        this.signStatic = stat;
        this.compoundName = cn;
        this.signStar = star;
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
