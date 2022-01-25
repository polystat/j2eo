package tree.Declaration;

import lexer.*;
import tree.Entity;
import tree.Type.*;

// NormalInterfaceDeclaration
//    : INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody
//    ;
public class NormalInterfaceDeclaration extends InterfaceDeclaration
{
    // Structure
 // public String identifier;
    public TypeParameters typeParameters;
    public TypeList extendingInterfaces;
    public Declarations interfaceBody;

    // Creation
    public NormalInterfaceDeclaration(Token id, TypeParameters typePars, TypeList extTypes, Declarations body)
    {
        super(null,id.image);
        this.typeParameters = typePars;
        this.extendingInterfaces = extTypes;
        this.interfaceBody = body;

        if ( this.typeParameters != null )      this.typeParameters.parent = this;
        if ( this.extendingInterfaces != null ) this.extendingInterfaces.parent = this;
        if ( this.interfaceBody != null )       this.interfaceBody.parent = this;
    }

    // Reporting
    public void report(int sh)
    {
        Entity.doShift(sh);
        System.out.println("INTERFACE "+super.name);
        if ( typeParameters != null ) typeParameters.report(sh+Entity.shift);
        if ( extendingInterfaces != null ) extendingInterfaces.report(sh+Entity.shift);
        if ( interfaceBody != null ) interfaceBody.report(sh+Entity.shift);
    }

}
