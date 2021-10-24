package tree.Type;

import lexer.Scanner;
import lexer.Token;
import lexer.TokenCode;
import tree.Entity;

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
    // Structure
    public TokenCode typeCode;

    // Creation
    public PrimitiveType(Token token)
    {
        super(null);
        this.typeCode = token.code;

        System.out.println("Primitive type accepted");
    }

    // Reporting
    public void report(int sh)
    {
        title("TYPE "+typeCode.toString(),sh);
        if ( super.annotations != null )
            super.annotations.report(sh+ Entity.shift);
        if ( super.dimensions != null && super.dimensions.dimensions.size() > 0 )
            super.dimensions.report(sh+ Entity.shift);
    }
}