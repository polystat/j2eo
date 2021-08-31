package tree;

import java.util.ArrayList;

// UnannotatedType
//       : ...
//       | CompoundName
//       | CompoundName TypeArguments
//       | ...
//       ;
// TypeArguments
//       : LESS TypeArgumentList GREATER
//       ;
public class TypeName extends UnannotatedType
{
    // Structure
    public ArrayList<String> compoundName;
    public ArrayList<TypeArgument> typeArguments;

    // Creation
    public TypeName(ArrayList<String> cn, ArrayList<Dim> dims, ArrayList<TypeArgument> targs)
    {
        super(dims);
        this.compoundName = cn;
        this.typeArguments = targs;
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