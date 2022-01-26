package tree.Declaration;

import tree.Modifiers;
import tree.Type.TypeParameters;

// RecordDeclaration
//    : /*ModifierSeqOpt*/ RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody
//    ;
//
// RecordHeader
//    : LPAREN RecordComponentListOpt RPAREN
//    ;
//
// RecordComponentListOpt
//    :  // empty
//    |                              RecordComponent
//    | RecordComponentListOpt COMMA RecordComponent
//    ;
//
// RecordComponent
//    : AnnotationSeqOpt UnannotatedType                           IDENTIFIER
//    | AnnotationSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER // VariableArityRecordComponent
//    ;
//
// RecordBody
//    : LBRACE                          RBRACE
//    | LBRACE RecordBodyDeclarationSeq RBRACE
//    ;
//
// RecordBodyDeclarationSeq
//    :                          RecordBodyDeclaration
//    | RecordBodyDeclarationSeq RecordBodyDeclaration
//    ;
//
// RecordBodyDeclaration
//    : ClassBodyDeclaration
//    | ModifierSeqOpt IDENTIFIER ConstructorBody // CompactConstructorDeclaration
//    ;
public class RecordDeclaration extends ClassDeclaration {
    // Structure
    public TypeParameters typeParameters;
    public RecordComponents recordComponents;
    public Declarations body;
    // public CompactConstructor  !!!!!!!!!!!!!!!!!!!!!!!!

    // Creation
    public RecordDeclaration(String n,
                             Modifiers mods,
                             TypeParameters typePars,
                             RecordComponents recordComps,
                             Declarations body) {
        super(mods, n);
        this.modifiers = mods;
        this.typeParameters = typePars;
        this.recordComponents = recordComps;
        this.body = body;

        if (this.modifiers != null) {
            this.modifiers.parent = this;
        }
        if (this.typeParameters != null) {
            this.typeParameters.parent = null;
        }
        if (this.recordComponents != null) {
            this.recordComponents.parent = this;
        }
        if (this.body != null) {
            this.body.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {

    }

}
