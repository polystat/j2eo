package translator;

import eotree.data.EOData;
import eotree.data.EOFloatData;
import eotree.data.EOIntData;
import eotree.data.EOStringData;
import lexer.TokenCode;
import tree.Expression.Primary.Literal;


public class Literals {
    public static EOData mapLiteral(Literal literal) {
        if (literal.code == TokenCode.StringLiteral){
            return new EOStringData((String) literal.value);
        } else if (literal.code == TokenCode.FloatingLiteral){
            return new EOFloatData(((Number) literal.value).floatValue());
        } else if (literal.code == TokenCode.IntegerLiteral){
            return new EOIntData(((Number) literal.value).intValue());
        }

        return null;
    }
}
