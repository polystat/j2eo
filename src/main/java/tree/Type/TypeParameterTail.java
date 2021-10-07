package tree.Type;

import lexer.*;
import tree.*;

// TypeParameterTail
//    : IDENTIFIER
//    | IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER
//    | IDENTIFIER EXTENDS ClassTypeList2
//    ;
public class TypeParameterTail extends Entity
{
    // Structure
    public String identifier;

    // Either extending identifier with annotations OR type list
    public Annotations extAnnotations;
    public String extending;
    public TypeList types;

    // Creation
    public TypeParameterTail(Token id, Annotations extAnns, Token ext)
    {
        this.identifier = id.image;
        this.extAnnotations = extAnns;
        this.extending = ext.image;
        this.types = null;
    }
    public TypeParameterTail(Token id, TypeList types)
    {
        this.identifier = id.image;
        this.extAnnotations = null;
        this.extending = null;
        this.types = types;
    }

    // Reporting
    public void report(int sh)
    {

    }

}
