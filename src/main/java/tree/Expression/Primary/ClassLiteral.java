package tree.Expression.Primary;

import tree.Dims;
import tree.Entity;
import tree.Type.Type;

// Primary
//    : ...
//    | Type DimsOpt DOT CLASS // ClassLiteral
//    | VOID DimsOpt DOT CLASS // ClassLiteral
//    | ...
public class ClassLiteral extends Literal {
    // Structure
    public Type type;  // VOID, if type==null
    public Dims dims;

    // Creation
    public ClassLiteral(Type t, Dims d) {
        super(null);
        this.type = t;
        this.dims = d;

        if (this.type != null) {
            this.type.parent = this;
        }
        if (this.dims != null) {
            this.dims.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        // Stub
        Entity.doShift(sh);
        System.out.println("CLASS LITERAL");
    }

}
