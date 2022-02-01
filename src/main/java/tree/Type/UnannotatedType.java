package tree.Type;

import tree.Annotations;
import tree.Dim;
import tree.Dims;

// UnannotatedType
//    : PrimitiveType
//    | CompoundName
//    | CompoundName TypeArguments
//    | UnannotatedType Dim        // ArrayType
//    ;
public class UnannotatedType extends Type {
    // Structure
    public Dims dimensions;

    // Creation
    public UnannotatedType(Annotations anns) {
        super(anns);
        dimensions = new Dims();
        // Empty
    }

    public UnannotatedType addDimension(Dim dim) {
        this.dimensions.add(dim);
        if (dim != null) {
            dim.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        // empty
    }

}