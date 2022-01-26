package tree.Type;

import tree.Annotations;
import tree.Entity;

// TypeArgument
//    : Type                                     { $$ = new TypeArgument($1,0,null); }
//    |               QUESTION                   { $$ = new TypeArgument(null,1,null); }
//    |               QUESTION EXTENDS Type      { $$ = new TypeArgument($3,1,null); }
//    |               QUESTION SUPER   Type      { $$ = new TypeArgument($3,2,null); }
//    | AnnotationSeq QUESTION                   { $$ = new TypeArgument(null,1,$1); }
//    | AnnotationSeq QUESTION EXTENDS Type      { $$ = new TypeArgument($4,2,$1); }
//    | AnnotationSeq QUESTION SUPER   Type      { $$ = new TypeArgument($4,3,$1); }
//    ;
public class TypeArgument extends Entity {
    // Structure
    public Type type;
    public boolean signExtends;
    public boolean signSuper;
    public Annotations annotations;

    // Creation
    public TypeArgument(Type t, int sign, Annotations anns) {
        this.type = t;
        signExtends = false;
        signSuper = false;
        switch (sign) {
            case 1 -> signExtends = true;
            case 2 -> signSuper = true;
            default -> {
            }
        }
        this.annotations = anns;

        if (this.type != null) {
            this.type.parent = this;
        }
        if (this.annotations != null) {
            this.annotations.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        if (type != null) {
            type.report(sh);
        }
        // TODO: the rest
    }

}
