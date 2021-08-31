package tree;

import java.util.ArrayList;

// Package
//    : PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt
//    ;
public class Package extends CompilationUnit
{
    // Structure
    public ArrayList<String> compoundName;
    public ArrayList<ImportDeclaration> imports;
    public ArrayList<TopLevelComponent> components;

    // Creation
    public Package(ArrayList<String> cn,
                   ArrayList<ImportDeclaration> ims,
                   ArrayList<TopLevelComponent> cs)
    {
        this.compoundName = cn;
        this.imports = ims;
        this.components = cs;
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
