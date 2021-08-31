package tree;

import java.util.ArrayList;

// PrimitiveType
//             // NumericType -- IntegralType
//    : BYTE
//    | SHORT
//    | INT
//    | LONG
//    | CHAR
//	           // NumericType -- FloatingPointType
//    | FLOAT
//    | DOUBLE
//    | BOOLEAN
//    ;
public class PrimitiveType extends UnannotatedType
{
    public enum primitive
    {
        type_byte,
        type_short,
        type_int,
        type_long,
        type_char,
        type_float,
        type_double,
        type_boolean
    }

    // Contents
    public primitive typeCode;

    // Creation
    public PrimitiveType(primitive pt, ArrayList<Dim> dims)
    {
        super(dims);
        this.typeCode = pt;
    }

    // Reporting
    public void report(int sh)
    {
        for(Dim d : super.dimensions)
        {
            d.report(sh);
            sh++;
        }
        Entity.doShift(sh);
        this.outUnique();
        System.out.print(typeCode.toString());
    }

    // Generation
    public void generateEO()
    {

    }
}