package tree.Declaration;

import tree.Statement.Block;

// ClassBodyDeclaration
//     : ...
//     |        Block         // InstanceInitializer
//     | STATIC Block         // StaticInitializer
//     | ...
//     ;
public class ClassInitializer extends Declaration {
    // Structure
    public Block block;
    public boolean signStatic;

    // Creation
    public ClassInitializer(Block b, boolean ss) {
        super(null, null, null);
        this.block = b;
        this.signStatic = ss;

        if (this.block != null) {
            this.block.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }

}
