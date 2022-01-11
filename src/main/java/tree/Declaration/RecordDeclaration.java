package tree.Declaration;

import java.util.ArrayList;
import tree.Modifiers;
import tree.Type.TypeParameter;

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
    public ArrayList<TypeParameter> typeParameters;
    public ArrayList<RecordComponent> recordComponents;
    public ArrayList<Declaration> body;
    // public CompactConstructor  !!!!!!!!!!!!!!!!!!!!!!!!

    // Creation
    public RecordDeclaration(String n,
                             Modifiers mods,
                             ArrayList<TypeParameter> typePars,
                             ArrayList<RecordComponent> recordComps,
                             ArrayList<Declaration> body) {
        super(mods, n);
        this.modifiers = mods;
        this.typeParameters = typePars;
        this.recordComponents = recordComps;
        this.body = body;
    }

    // Reporting
    public void report(int sh) {

    }

}
