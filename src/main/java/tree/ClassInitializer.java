package tree;

// ClassBodyDeclaration
//     : ...
//     |        Block         // InstanceInitializer
//     | STATIC Block         // StaticInitializer
//     | ...
//     ;
public class ClassInitializer extends Declaration
{
    // Structure
    public BlockStatement block;
    public boolean signStatic;

    // Creation
    public ClassInitializer(BlockStatement b, boolean ss)
    {
        super(null,null,null);
        this.block = b;
        this.signStatic = ss;
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
