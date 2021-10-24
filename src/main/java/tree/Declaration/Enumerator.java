package tree.Declaration;

import lexer.Token;
import tree.Annotations;
import tree.Entity;
import tree.Expression.ArgumentList;

// EnumConstant
//    : AnnotationSeqOpt IDENTIFIER Arguments
//    | AnnotationSeqOpt IDENTIFIER Arguments ClassBody
//    ;
public class Enumerator extends Entity
{
    // Structure
    public Annotations annotations;
    public String name;
    public ArgumentList arguments;
    public Declarations enumBody;

    // Creation
    public Enumerator(Annotations anns, Token name, ArgumentList args, Declarations body)
    {
        this.annotations = anns;
        this.name = name.image;
        this.arguments = args;
        this.enumBody = body;
    }

    // Reporting
    public void report(int sh)
    {
        title("ENUM CONSTANT "+name,sh);
        if ( arguments != null )
        {
            Entity.doShift(sh+Entity.shift);
            System.out.println("ARGUMENTS:");
            arguments.report(sh+2*Entity.shift);
        }
        if ( enumBody != null )
            enumBody.report(sh+Entity.shift);
    }
}
