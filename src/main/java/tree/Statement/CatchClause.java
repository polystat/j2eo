package tree.Statement;

import tree.Entity;
import tree.Modifiers;
import tree.Type.Type;

import java.util.ArrayList;

// CatchClause
//    : CATCH LPAREN CatchFormalParameter RPAREN Block
//    ;
//
// CatchFormalParameter
//    : ModifierSeqOpt CatchType IDENTIFIER DimsOpt
//    ;
//
// CatchType
//    :                    Type
//    | CatchType VERTICAL Type
//    ;
public class CatchClause extends Entity
{
    // Structure
    public Modifiers modifiers;
    public ArrayList<Type> types;
    public String identifier;
    public Block block;

    // Creation
    public CatchClause(Modifiers mods, ArrayList<Type> ts, String id, Block b)
    {
        this.modifiers = mods;
        this.types = ts;
        this.identifier = id;
        this.block = b;
    }

    // Reporting
    public void report(int sh)
    {

    }

    // Generation
    public void generateEO()
    {

    }
}
