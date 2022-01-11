package tree.Type;

import java.util.ArrayList;
import tree.Entity;

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
public class TypeArguments extends Entity {
    // Structure
    public ArrayList<TypeArgument> arguments;

    // Creation
    public TypeArguments(TypeArgument arg) {
        this.arguments = new ArrayList<>();
        this.arguments.add(arg);
    }

    public TypeArguments add(TypeArgument arg) {
        this.arguments.add(arg);
        return this;
    }

    // Reporting
    public void report(int sh) {
        title("TYPE ARGUMENTS", sh);
        for (TypeArgument arg : arguments) {
            arg.report(sh + Entity.shift);
        }
    }

}
