package tree.Type;

import tree.Entity;
import java.util.ArrayList;

// TypeArgumentsOpt
//    :  // empty
//    | TypeArguments
//    ;
//
// TypeArguments
//    : LESS TypeArgumentList GREATER
//    ;
//
// TypeArgumentList
//    :                        TypeArgument
//    | TypeArgumentList COMMA TypeArgument
//    ;
public class TypeArguments extends Entity
{
    // Structure
    public ArrayList<TypeArgument> arguments;

    // Creation
    public TypeArguments(TypeArgument arg)
    {
        this.arguments = new ArrayList<>();
        this.arguments.add(arg);
    }
    public TypeArguments add(TypeArgument arg)
    {
        this.arguments.add(arg);
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("TYPE ARGUMENTS");
        for ( TypeArgument arg: arguments)
        {
            arg.report(sh+Entity.shift);
            System.out.println();
        }
    }

    // Generation
    public void generateEO()
    {

    }
}
