package tree;

import java.util.ArrayList;

// UnannotatedType
//    : PrimitiveType
//    | CompoundName
//    | CompoundName TypeArguments
//    | UnannotatedType Dim    	  // ArrayType
//    ;
public class UnannotatedType extends Entity
{
    // Structure
    public ArrayList<Dim> dimensions;

    // Creation
    public UnannotatedType(ArrayList<Dim> dims)
    {
        this.dimensions = dims;
    }

    // Reporting
    public void report(int sh)
    {

    }

    // Generating
    public void generateEO()
    {

    }
}