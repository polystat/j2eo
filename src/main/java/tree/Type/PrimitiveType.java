package tree.Type;

import lexer.Token;
import lexer.TokenCode;

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
    }

    // Reporting
    public void report(int sh)
    {
        System.out.print(typeCode.toString());
    }

    // Generation
    public void generateEO()
    {

    }
}