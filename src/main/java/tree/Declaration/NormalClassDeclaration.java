package tree.Declaration;

import java.util.List;
import java.util.stream.Collectors;
import lexer.Token;
import lexer.TokenCode;
import tree.Entity;
import tree.Type.Type;
import tree.Type.TypeList;
import tree.Type.TypeParameters;

// NormalClassDeclaration
//    : /*ModifierSeqOpt*/ CLASS IDENTIFIER
//          TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody
//    ;
//
// ClassExtendsOpt
//    : // empty
//    | EXTENDS Type
//    ;
//
// ClassImplementsOpt
//    : // empty
//    | IMPLEMENTS ClassTypeList1
//    ;
//
// ClassBody
//    : LBRACE                         RBRACE
//    | LBRACE ClassBodyDeclarationSeq RBRACE
//    ;
//
//ClassBodyDeclarationSeq
//    :                         ClassBodyDeclaration
//    | ClassBodyDeclarationSeq ClassBodyDeclaration
//    ;
//
//ClassBodyDeclaration
//    : ModifierSeqOpt PureBodyDeclaration
//    |        Block           // InstanceInitializer
//    | STATIC Block           // StaticInitializer
//    | SEMICOLON
//    ;
public class NormalClassDeclaration extends ClassDeclaration {
    // Structure
    public TypeParameters typeParameters;
    public Type extendedType;
    public TypeList interfaces;
    public Declarations body;

    // Creation
    public NormalClassDeclaration(Token n,
                                  TypeParameters typePars,
                                  Type extType,
                                  TypeList ints,
                                  Declarations body) {
        super(null, n.image);
        this.typeParameters = typePars;
        this.extendedType = extType;
        this.interfaces = ints;
        this.body = body;

        if ( this.typeParameters != null ) this.typeParameters.parent = this;
        if ( this.extendedType != null )   this.extendedType.parent = this;
        if ( this.interfaces != null )     this.interfaces.parent = this;
        if ( this.body != null )           this.body.parent = this;
    }

    public List<VariableDeclaration> getStaticVariables() {
        return body.declarations.stream()
                .filter(dec -> dec instanceof VariableDeclaration)
                .filter(dec -> dec.modifiers.modifiers.modifiers.contains(TokenCode.Static))
                .map(dec -> (VariableDeclaration) dec)
                .collect(Collectors.toList());
    }

    public List<VariableDeclaration> getNonStaticVariables() {
        return body.declarations.stream()
                .filter(dec -> dec instanceof VariableDeclaration)
                .filter(dec -> !dec.modifiers.modifiers.modifiers.contains(TokenCode.Static))
                .map(dec -> (VariableDeclaration) dec)
                .collect(Collectors.toList());
    }

    public List<MethodDeclaration> getStaticMethods() {
        return body.declarations.stream()
                .filter(dec -> dec instanceof MethodDeclaration)
                .filter(dec -> dec.modifiers.modifiers.modifiers.contains(TokenCode.Static))
                .map(dec -> (MethodDeclaration) dec)
                .collect(Collectors.toList());
    }

    public List<MethodDeclaration> getNonStaticMethods() {
        return body.declarations.stream()
                .filter(dec -> dec instanceof MethodDeclaration)
                .filter(dec -> !dec.modifiers.modifiers.modifiers.contains(TokenCode.Static))
                .map(dec -> (MethodDeclaration) dec)
                .collect(Collectors.toList());
    }

    // Reporting
    public void report(int sh) {
        this.title("CLASS DECLARATION " + this.name, sh);
        if (this.typeParameters != null) {
            this.typeParameters.report(sh + Entity.shift);
        }
        if (this.extendedType != null) {
            this.title("SUPER", sh + Entity.shift);
            this.extendedType.report(sh + Entity.shift);
        }
        if (this.interfaces != null) {
            this.interfaces.report(sh + Entity.shift);
        }
        if (body != null) {
            body.report(sh + Entity.shift);
        }
    }

}
