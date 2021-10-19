package tree.Type;

import tree.Annotations;
import tree.Dim;

// UnannotatedType
//    : PrimitiveType
//    | CompoundName
//    | CompoundName TypeArguments
//    | UnannotatedType Dim    	  // ArrayType
//    ;
public class UnannotatedType extends Type
{
    // Structure
    public Dim dimension;

    // Creation
    public UnannotatedType(Annotations anns)
    {
        super(anns);
        // Empty
    }
    public UnannotatedType addDimension(Dim dim)
    {
        this.dimension = dim;
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        super.report(sh);
        dimension.report(0);
    }

}