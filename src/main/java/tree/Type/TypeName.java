package tree.Type;

import tree.CompoundName;

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
    public CompoundName compoundName;
    public TypeArguments typeArguments;

    // Creation
    public TypeName(CompoundName cn, TypeArguments targs)
    {
        super(null);
        this.compoundName = cn;
        this.typeArguments = targs;
    }

    // Reporting
    public void report(int sh)
    {
        compoundName.report(0);
        if ( typeArguments == null ) return;
        typeArguments.report(0);
    }

}