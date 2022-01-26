package tree.Declaration;

import tree.Entity;

// This is intermediate class -- won't appear in the AST
//
// EnumBody
//    : LBRACE EnumConstantListOpt       EnumBodyDeclarationsOpt RBRACE
//    | LBRACE EnumConstantListOpt COMMA EnumBodyDeclarationsOpt RBRACE
//    ;
public class EnumBody extends Entity {
    // Structure
    public Enumerators enumerators;
    public Declarations declarations;

    // Creation
    public EnumBody(Enumerators ens, Declarations decls) {
        this.enumerators = ens;
        this.declarations = decls;

        if (this.enumerators != null) {
            this.enumerators.parent = this;
        }
        if (this.declarations != null) {
            this.declarations.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        // Empty; not needed
    }
}
