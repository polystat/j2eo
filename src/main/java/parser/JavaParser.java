/* A Bison parser, made by GNU Bison 3.7.4.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015, 2018-2020 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* DO NOT RELY ON FEATURES THAT ARE NOT DOCUMENTED in the manual,
   especially those whose name start with YY_ or yy_.  They are
   private implementation details that can be changed or removed.  */

package parser;



import java.text.MessageFormat;
/* "%code imports" blocks.  */
/* "src/main/resources/Java_16_Grammar.y":140  */
 import lexer.*; 
/* "src/main/resources/Java_16_Grammar.y":141  */
 import tree.*; 
/* "src/main/resources/Java_16_Grammar.y":142  */
 import tree.Compilation.*; 
/* "src/main/resources/Java_16_Grammar.y":143  */
 import tree.Declaration.*; 
/* "src/main/resources/Java_16_Grammar.y":144  */
 import tree.Expression.*; 
/* "src/main/resources/Java_16_Grammar.y":145  */
 import tree.Expression.Primary.*; 
/* "src/main/resources/Java_16_Grammar.y":146  */
 import tree.Statement.*; 
/* "src/main/resources/Java_16_Grammar.y":147  */
 import tree.Type.*; 
/* "src/main/resources/Java_16_Grammar.y":148  */
 @SuppressWarnings("PMD") 

/* "src/main/java/parser/JavaParser.java":63  */

/**
 * A Bison parser, automatically generated from <tt>src/main/resources/Java_16_Grammar.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class JavaParser
{
  /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.7.4";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";



  /**
   * True if verbose error messages are enabled.
   */
  private boolean yyErrorVerbose = true;

  /**
   * Whether verbose error messages are enabled.
   */
  public final boolean getErrorVerbose() { return yyErrorVerbose; }

  /**
   * Set the verbosity of error messages.
   * @param verbose True to request verbose error messages.
   */
  public final void setErrorVerbose(boolean verbose)
  { yyErrorVerbose = verbose; }




  public enum SymbolKind
  {
    S_YYEOF(0),                    /* "end of file"  */
    S_YYerror(1),                  /* error  */
    S_YYUNDEF(2),                  /* "invalid token"  */
    S_LPAREN(3),                   /* LPAREN  */
    S_RPAREN(4),                   /* RPAREN  */
    S_LBRACE(5),                   /* LBRACE  */
    S_RBRACE(6),                   /* RBRACE  */
    S_LBRACKET(7),                 /* LBRACKET  */
    S_RBRACKET(8),                 /* RBRACKET  */
    S_COMMA(9),                    /* COMMA  */
    S_DOT(10),                     /* DOT  */
    S_SEMICOLON(11),               /* SEMICOLON  */
    S_COLON(12),                   /* COLON  */
    S_DBL_COLON(13),               /* DBL_COLON  */
    S_STAR(14),                    /* STAR  */
    S_SLASH(15),                   /* SLASH  */
    S_PERCENT(16),                 /* PERCENT  */
    S_AMPERSAND(17),               /* AMPERSAND  */
    S_AT(18),                      /* AT  */
    S_LESS(19),                    /* LESS  */
    S_GREATER(20),                 /* GREATER  */
    S_VERTICAL(21),                /* VERTICAL  */
    S_PLUS(22),                    /* PLUS  */
    S_MINUS(23),                   /* MINUS  */
    S_ARROW(24),                   /* ARROW  */
    S_DIAMOND(25),                 /* DIAMOND  */
    S_QUESTION(26),                /* QUESTION  */
    S_CARET(27),                   /* CARET  */
    S_EQUAL(28),                   /* EQUAL  */
    S_TILDE(29),                   /* TILDE  */
    S_EXCLAMATION(30),             /* EXCLAMATION  */
    S_ELLIPSIS(31),                /* ELLIPSIS  */
    S_LESS_EQUAL(32),              /* LESS_EQUAL  */
    S_GREATER_EQUAL(33),           /* GREATER_EQUAL  */
    S_STAR_EQUAL(34),              /* STAR_EQUAL  */
    S_SLASH_EQUAL(35),             /* SLASH_EQUAL  */
    S_PERCENT_EQUAL(36),           /* PERCENT_EQUAL  */
    S_PLUS_EQUAL(37),              /* PLUS_EQUAL  */
    S_MINUS_EQUAL(38),             /* MINUS_EQUAL  */
    S_LESS_LESS_EQUAL(39),         /* LESS_LESS_EQUAL  */
    S_GR_GR_EQUAL(40),             /* GR_GR_EQUAL  */
    S_GR_GR_GR_EQUAL(41),          /* GR_GR_GR_EQUAL  */
    S_AMP_EQUAL(42),               /* AMP_EQUAL  */
    S_CARET_EQUAL(43),             /* CARET_EQUAL  */
    S_VERTICAL_EQUAL(44),          /* VERTICAL_EQUAL  */
    S_DBL_PLUS(45),                /* DBL_PLUS  */
    S_DBL_MINUS(46),               /* DBL_MINUS  */
    S_DBL_VERTICAL(47),            /* DBL_VERTICAL  */
    S_DBL_AMPERSAND(48),           /* DBL_AMPERSAND  */
    S_DBL_EQUAL(49),               /* DBL_EQUAL  */
    S_TRIPL_EQUAL(50),             /* TRIPL_EQUAL  */
    S_NON_EQUAL(51),               /* NON_EQUAL  */
    S_DBL_LESS(52),                /* DBL_LESS  */
    S_DBL_GREATER(53),             /* DBL_GREATER  */
    S_TRIPL_GREATER(54),           /* TRIPL_GREATER  */
    S_IDENTIFIER(55),              /* IDENTIFIER  */
    S_INTEGER_LITERAL(56),         /* INTEGER_LITERAL  */
    S_FLOATING_POINT_LITERAL(57),  /* FLOATING_POINT_LITERAL  */
    S_CHARACTER_LITERAL(58),       /* CHARACTER_LITERAL  */
    S_STRING_LITERAL(59),          /* STRING_LITERAL  */
    S_ABSTRACT(60),                /* ABSTRACT  */
    S_ASSERT(61),                  /* ASSERT  */
    S_BOOLEAN(62),                 /* BOOLEAN  */
    S_BREAK(63),                   /* BREAK  */
    S_BYTE(64),                    /* BYTE  */
    S_CASE(65),                    /* CASE  */
    S_CATCH(66),                   /* CATCH  */
    S_CHAR(67),                    /* CHAR  */
    S_CLASS(68),                   /* CLASS  */
    S_CONTINUE(69),                /* CONTINUE  */
    S_DEFAULT(70),                 /* DEFAULT  */
    S_DO(71),                      /* DO  */
    S_DOUBLE(72),                  /* DOUBLE  */
    S_ELSE(73),                    /* ELSE  */
    S_ENUM(74),                    /* ENUM  */
    S_EXTENDS(75),                 /* EXTENDS  */
    S_FALSE(76),                   /* FALSE  */
    S_FINAL(77),                   /* FINAL  */
    S_FINALLY(78),                 /* FINALLY  */
    S_FLOAT(79),                   /* FLOAT  */
    S_FOR(80),                     /* FOR  */
    S_IF(81),                      /* IF  */
    S_IMPLEMENTS(82),              /* IMPLEMENTS  */
    S_IMPORT(83),                  /* IMPORT  */
    S_INSTANCEOF(84),              /* INSTANCEOF  */
    S_INT(85),                     /* INT  */
    S_INTERFACE(86),               /* INTERFACE  */
    S_LONG(87),                    /* LONG  */
    S_MODULE(88),                  /* MODULE  */
    S_NATIVE(89),                  /* NATIVE  */
    S_NEW(90),                     /* NEW  */
    S_NULL(91),                    /* NULL  */
    S_OPEN(92),                    /* OPEN  */
    S_PACKAGE(93),                 /* PACKAGE  */
    S_PRIVATE(94),                 /* PRIVATE  */
    S_PROTECTED(95),               /* PROTECTED  */
    S_PUBLIC(96),                  /* PUBLIC  */
    S_RECORD(97),                  /* RECORD  */
    S_RETURN(98),                  /* RETURN  */
    S_SHORT(99),                   /* SHORT  */
    S_STATIC(100),                 /* STATIC  */
    S_STRICTFP(101),               /* STRICTFP  */
    S_SUPER(102),                  /* SUPER  */
    S_SWITCH(103),                 /* SWITCH  */
    S_SYNCHRONIZED(104),           /* SYNCHRONIZED  */
    S_THIS(105),                   /* THIS  */
    S_THROW(106),                  /* THROW  */
    S_THROWS(107),                 /* THROWS  */
    S_TRANSIENT(108),              /* TRANSIENT  */
    S_TRANSITIVE(109),             /* TRANSITIVE  */
    S_TRUE(110),                   /* TRUE  */
    S_TRY(111),                    /* TRY  */
    S_VAR(112),                    /* VAR  */
    S_VOID(113),                   /* VOID  */
    S_VOLATILE(114),               /* VOLATILE  */
    S_WHILE(115),                  /* WHILE  */
    S_YIELD(116),                  /* YIELD  */
    S_SHORT_COMMENT(117),          /* SHORT_COMMENT  */
    S_LONG_COMMENT(118),           /* LONG_COMMENT  */
    S_EOS(119),                    /* EOS  */
    S_120_requires_(120),          /* "requires"  */
    S_121_exports_(121),           /* "exports"  */
    S_122_to_(122),                /* "to"  */
    S_123_opens_(123),             /* "opens"  */
    S_124_uses_(124),              /* "uses"  */
    S_125_provides_(125),          /* "provides"  */
    S_126_with_(126),              /* "with"  */
    S_YYACCEPT(127),               /* $accept  */
    S_Literal(128),                /* Literal  */
    S_CompoundName(129),           /* CompoundName  */
    S_ModifierSeqOpt(130),         /* ModifierSeqOpt  */
    S_ModifierSeq(131),            /* ModifierSeq  */
    S_StandardModifierSeq(132),    /* StandardModifierSeq  */
    S_StandardModifier(133),       /* StandardModifier  */
    S_CompilationUnit(134),        /* CompilationUnit  */
    S_Package(135),                /* Package  */
    S_Module(136),                 /* Module  */
    S_ImportDeclarationSeqOpt(137), /* ImportDeclarationSeqOpt  */
    S_ImportDeclarationSeq(138),   /* ImportDeclarationSeq  */
    S_ImportDeclaration(139),      /* ImportDeclaration  */
    S_TopLevelComponentSeqOpt(140), /* TopLevelComponentSeqOpt  */
    S_TopLevelComponentSeq(141),   /* TopLevelComponentSeq  */
    S_TopLevelComponent(142),      /* TopLevelComponent  */
    S_ModuleDirectiveSeqOpt(143),  /* ModuleDirectiveSeqOpt  */
    S_ModuleDirectiveSeq(144),     /* ModuleDirectiveSeq  */
    S_ModuleDirective(145),        /* ModuleDirective  */
    S_ModuleNameList(146),         /* ModuleNameList  */
    S_RequiresModifierSeqOpt(147), /* RequiresModifierSeqOpt  */
    S_Type(148),                   /* Type  */
    S_UnannotatedType(149),        /* UnannotatedType  */
    S_PrimitiveType(150),          /* PrimitiveType  */
    S_ClassDeclaration(151),       /* ClassDeclaration  */
    S_NormalClassDeclaration(152), /* NormalClassDeclaration  */
    S_TypeParametersOpt(153),      /* TypeParametersOpt  */
    S_TypeParameters(154),         /* TypeParameters  */
    S_TypeParameterList(155),      /* TypeParameterList  */
    S_TypeParameter(156),          /* TypeParameter  */
    S_TypeParameterTail(157),      /* TypeParameterTail  */
    S_ClassExtendsOpt(158),        /* ClassExtendsOpt  */
    S_ClassImplementsOpt(159),     /* ClassImplementsOpt  */
    S_ClassTypeList1(160),         /* ClassTypeList1  */
    S_ClassTypeList2(161),         /* ClassTypeList2  */
    S_ClassBodyOpt(162),           /* ClassBodyOpt  */
    S_ClassBody(163),              /* ClassBody  */
    S_ClassBodyDeclarationSeq(164), /* ClassBodyDeclarationSeq  */
    S_ClassBodyDeclaration(165),   /* ClassBodyDeclaration  */
    S_PureBodyDeclaration(166),    /* PureBodyDeclaration  */
    S_ConstructorDeclaration(167), /* ConstructorDeclaration  */
    S_ConstructorDeclarator(168),  /* ConstructorDeclarator  */
    S_ConstructorBody(169),        /* ConstructorBody  */
    S_ExplicitConstructorInvocation(170), /* ExplicitConstructorInvocation  */
    S_EnumDeclaration(171),        /* EnumDeclaration  */
    S_EnumBody(172),               /* EnumBody  */
    S_EnumConstantListOpt(173),    /* EnumConstantListOpt  */
    S_EnumConstantList(174),       /* EnumConstantList  */
    S_EnumConstant(175),           /* EnumConstant  */
    S_EnumBodyDeclarationsOpt(176), /* EnumBodyDeclarationsOpt  */
    S_RecordDeclaration(177),      /* RecordDeclaration  */
    S_RecordHeader(178),           /* RecordHeader  */
    S_RecordComponentListOpt(179), /* RecordComponentListOpt  */
    S_RecordComponent(180),        /* RecordComponent  */
    S_RecordBody(181),             /* RecordBody  */
    S_RecordBodyDeclarationSeq(182), /* RecordBodyDeclarationSeq  */
    S_RecordBodyDeclaration(183),  /* RecordBodyDeclaration  */
    S_FieldDeclaration(184),       /* FieldDeclaration  */
    S_VariableDeclaratorList(185), /* VariableDeclaratorList  */
    S_VariableDeclarator(186),     /* VariableDeclarator  */
    S_ArrayInitializer(187),       /* ArrayInitializer  */
    S_VariableInitializerListOpt(188), /* VariableInitializerListOpt  */
    S_VariableInitializerList(189), /* VariableInitializerList  */
    S_VariableInitializer(190),    /* VariableInitializer  */
    S_MethodDeclaration(191),      /* MethodDeclaration  */
    S_MethodHeader(192),           /* MethodHeader  */
    S_MethodDeclarator(193),       /* MethodDeclarator  */
    S_FormalParameterList(194),    /* FormalParameterList  */
    S_FormalParameter(195),        /* FormalParameter  */
    S_FormalParameterTail(196),    /* FormalParameterTail  */
    S_ThrowsOpt(197),              /* ThrowsOpt  */
    S_MethodBody(198),             /* MethodBody  */
    S_DimsOpt(199),                /* DimsOpt  */
    S_Dims(200),                   /* Dims  */
    S_Dim(201),                    /* Dim  */
    S_InterfaceDeclaration(202),   /* InterfaceDeclaration  */
    S_NormalInterfaceDeclaration(203), /* NormalInterfaceDeclaration  */
    S_InterfaceExtendsOpt(204),    /* InterfaceExtendsOpt  */
    S_InterfaceExtends(205),       /* InterfaceExtends  */
    S_InterfaceBody(206),          /* InterfaceBody  */
    S_InterfaceMemberDeclarationSeq(207), /* InterfaceMemberDeclarationSeq  */
    S_InterfaceMemberDeclaration(208), /* InterfaceMemberDeclaration  */
    S_ConstantDeclaration(209),    /* ConstantDeclaration  */
    S_InterfaceMethodDeclaration(210), /* InterfaceMethodDeclaration  */
    S_AnnotationInterfaceDeclaration(211), /* AnnotationInterfaceDeclaration  */
    S_AnnotationInterfaceBody(212), /* AnnotationInterfaceBody  */
    S_AnnotationInterfaceMemberDeclarationSeq(213), /* AnnotationInterfaceMemberDeclarationSeq  */
    S_AnnotationInterfaceMemberDeclaration(214), /* AnnotationInterfaceMemberDeclaration  */
    S_AnnotationInterfaceElementDeclaration(215), /* AnnotationInterfaceElementDeclaration  */
    S_DefaultValueOpt(216),        /* DefaultValueOpt  */
    S_Block(217),                  /* Block  */
    S_BlockStatementSeq(218),      /* BlockStatementSeq  */
    S_BlockStatement(219),         /* BlockStatement  */
    S_LocalVariableDeclaration(220), /* LocalVariableDeclaration  */
    S_Statement(221),              /* Statement  */
    S_SimpleStatement(222),        /* SimpleStatement  */
    S_LabeledStatement(223),       /* LabeledStatement  */
    S_StatementExpression(224),    /* StatementExpression  */
    S_IfThenElseStatement(225),    /* IfThenElseStatement  */
    S_ElsePartOpt(226),            /* ElsePartOpt  */
    S_SwitchBlock(227),            /* SwitchBlock  */
    S_SwitchRuleSeq(228),          /* SwitchRuleSeq  */
    S_SwitchRule(229),             /* SwitchRule  */
    S_SwitchBlockStatementGroupSeqOpt(230), /* SwitchBlockStatementGroupSeqOpt  */
    S_SwitchBlockStatementGroup(231), /* SwitchBlockStatementGroup  */
    S_SwitchLabelSeq(232),         /* SwitchLabelSeq  */
    S_SwitchLabel(233),            /* SwitchLabel  */
    S_CaseExpressionList(234),     /* CaseExpressionList  */
    S_WhileStatement(235),         /* WhileStatement  */
    S_ForStatement(236),           /* ForStatement  */
    S_BasicForStatement(237),      /* BasicForStatement  */
    S_ForInitOpt(238),             /* ForInitOpt  */
    S_ExpressionOpt(239),          /* ExpressionOpt  */
    S_StatementExpressionList(240), /* StatementExpressionList  */
    S_StatementExpressionListOpt(241), /* StatementExpressionListOpt  */
    S_EnhancedForStatement(242),   /* EnhancedForStatement  */
    S_CatchesOpt(243),             /* CatchesOpt  */
    S_Catches(244),                /* Catches  */
    S_CatchClause(245),            /* CatchClause  */
    S_CatchFormalParameter(246),   /* CatchFormalParameter  */
    S_CatchType(247),              /* CatchType  */
    S_FinallyOpt(248),             /* FinallyOpt  */
    S_Finally(249),                /* Finally  */
    S_ResourceSpecification(250),  /* ResourceSpecification  */
    S_ResourceSeq(251),            /* ResourceSeq  */
    S_Resource(252),               /* Resource  */
    S_Pattern(253),                /* Pattern  */
    S_Primary(254),                /* Primary  */
    S_ClassInstanceCreationExpression(255), /* ClassInstanceCreationExpression  */
    S_UnqualifiedClassInstanceCreationExpression(256), /* UnqualifiedClassInstanceCreationExpression  */
    S_ClassOrInterfaceTypeToInstantiate(257), /* ClassOrInterfaceTypeToInstantiate  */
    S_AnnotatedCompoundName(258),  /* AnnotatedCompoundName  */
    S_TypeArgumentsOpt(259),       /* TypeArgumentsOpt  */
    S_TypeArguments(260),          /* TypeArguments  */
    S_TypeArgumentList(261),       /* TypeArgumentList  */
    S_TypeArgument(262),           /* TypeArgument  */
    S_FieldAccess(263),            /* FieldAccess  */
    S_ArrayAccess(264),            /* ArrayAccess  */
    S_MethodInvocation(265),       /* MethodInvocation  */
    S_Arguments(266),              /* Arguments  */
    S_ArgumentList(267),           /* ArgumentList  */
    S_MethodReference(268),        /* MethodReference  */
    S_ArrayCreationExpression(269), /* ArrayCreationExpression  */
    S_DimExprs(270),               /* DimExprs  */
    S_DimExpr(271),                /* DimExpr  */
    S_Expression(272),             /* Expression  */
    S_LambdaExpression(273),       /* LambdaExpression  */
    S_LambdaParameters(274),       /* LambdaParameters  */
    S_LambdaParameterList1(275),   /* LambdaParameterList1  */
    S_LambdaParameterList2(276),   /* LambdaParameterList2  */
    S_LambdaParameter(277),        /* LambdaParameter  */
    S_AssignmentExpression(278),   /* AssignmentExpression  */
    S_Assignment(279),             /* Assignment  */
    S_LeftHandSide(280),           /* LeftHandSide  */
    S_AssignmentOperator(281),     /* AssignmentOperator  */
    S_ConditionalExpression(282),  /* ConditionalExpression  */
    S_ConditionalOrTail(283),      /* ConditionalOrTail  */
    S_ConditionalOrExpression(284), /* ConditionalOrExpression  */
    S_ConditionalAndExpression(285), /* ConditionalAndExpression  */
    S_InclusiveOrExpression(286),  /* InclusiveOrExpression  */
    S_ExclusiveOrExpression(287),  /* ExclusiveOrExpression  */
    S_AndExpression(288),          /* AndExpression  */
    S_EqualityExpression(289),     /* EqualityExpression  */
    S_RelationalExpression(290),   /* RelationalExpression  */
    S_InstanceofExpression(291),   /* InstanceofExpression  */
    S_ShiftExpression(292),        /* ShiftExpression  */
    S_AdditiveExpression(293),     /* AdditiveExpression  */
    S_MultiplicativeExpression(294), /* MultiplicativeExpression  */
    S_UnaryExpression(295),        /* UnaryExpression  */
    S_PreIncrementExpression(296), /* PreIncrementExpression  */
    S_PreDecrementExpression(297), /* PreDecrementExpression  */
    S_UnaryExpressionNotPlusMinus(298), /* UnaryExpressionNotPlusMinus  */
    S_PostfixExpression(299),      /* PostfixExpression  */
    S_PostIncrementExpression(300), /* PostIncrementExpression  */
    S_PostDecrementExpression(301), /* PostDecrementExpression  */
    S_CastExpression(302),         /* CastExpression  */
    S_TargetType(303),             /* TargetType  */
    S_TypeList(304),               /* TypeList  */
    S_SwitchExpression(305),       /* SwitchExpression  */
    S_AnnotationSeqOpt(306),       /* AnnotationSeqOpt  */
    S_AnnotationSeq(307),          /* AnnotationSeq  */
    S_Annotation(308),             /* Annotation  */
    S_AnnoParameterList(309),      /* AnnoParameterList  */
    S_ElementValue(310),           /* ElementValue  */
    S_ElementValueListOpt(311);    /* ElementValueListOpt  */


    private final int yycode_;

    SymbolKind (int n) {
      this.yycode_ = n;
    }

    private static final SymbolKind[] values_ = {
      SymbolKind.S_YYEOF,
      SymbolKind.S_YYerror,
      SymbolKind.S_YYUNDEF,
      SymbolKind.S_LPAREN,
      SymbolKind.S_RPAREN,
      SymbolKind.S_LBRACE,
      SymbolKind.S_RBRACE,
      SymbolKind.S_LBRACKET,
      SymbolKind.S_RBRACKET,
      SymbolKind.S_COMMA,
      SymbolKind.S_DOT,
      SymbolKind.S_SEMICOLON,
      SymbolKind.S_COLON,
      SymbolKind.S_DBL_COLON,
      SymbolKind.S_STAR,
      SymbolKind.S_SLASH,
      SymbolKind.S_PERCENT,
      SymbolKind.S_AMPERSAND,
      SymbolKind.S_AT,
      SymbolKind.S_LESS,
      SymbolKind.S_GREATER,
      SymbolKind.S_VERTICAL,
      SymbolKind.S_PLUS,
      SymbolKind.S_MINUS,
      SymbolKind.S_ARROW,
      SymbolKind.S_DIAMOND,
      SymbolKind.S_QUESTION,
      SymbolKind.S_CARET,
      SymbolKind.S_EQUAL,
      SymbolKind.S_TILDE,
      SymbolKind.S_EXCLAMATION,
      SymbolKind.S_ELLIPSIS,
      SymbolKind.S_LESS_EQUAL,
      SymbolKind.S_GREATER_EQUAL,
      SymbolKind.S_STAR_EQUAL,
      SymbolKind.S_SLASH_EQUAL,
      SymbolKind.S_PERCENT_EQUAL,
      SymbolKind.S_PLUS_EQUAL,
      SymbolKind.S_MINUS_EQUAL,
      SymbolKind.S_LESS_LESS_EQUAL,
      SymbolKind.S_GR_GR_EQUAL,
      SymbolKind.S_GR_GR_GR_EQUAL,
      SymbolKind.S_AMP_EQUAL,
      SymbolKind.S_CARET_EQUAL,
      SymbolKind.S_VERTICAL_EQUAL,
      SymbolKind.S_DBL_PLUS,
      SymbolKind.S_DBL_MINUS,
      SymbolKind.S_DBL_VERTICAL,
      SymbolKind.S_DBL_AMPERSAND,
      SymbolKind.S_DBL_EQUAL,
      SymbolKind.S_TRIPL_EQUAL,
      SymbolKind.S_NON_EQUAL,
      SymbolKind.S_DBL_LESS,
      SymbolKind.S_DBL_GREATER,
      SymbolKind.S_TRIPL_GREATER,
      SymbolKind.S_IDENTIFIER,
      SymbolKind.S_INTEGER_LITERAL,
      SymbolKind.S_FLOATING_POINT_LITERAL,
      SymbolKind.S_CHARACTER_LITERAL,
      SymbolKind.S_STRING_LITERAL,
      SymbolKind.S_ABSTRACT,
      SymbolKind.S_ASSERT,
      SymbolKind.S_BOOLEAN,
      SymbolKind.S_BREAK,
      SymbolKind.S_BYTE,
      SymbolKind.S_CASE,
      SymbolKind.S_CATCH,
      SymbolKind.S_CHAR,
      SymbolKind.S_CLASS,
      SymbolKind.S_CONTINUE,
      SymbolKind.S_DEFAULT,
      SymbolKind.S_DO,
      SymbolKind.S_DOUBLE,
      SymbolKind.S_ELSE,
      SymbolKind.S_ENUM,
      SymbolKind.S_EXTENDS,
      SymbolKind.S_FALSE,
      SymbolKind.S_FINAL,
      SymbolKind.S_FINALLY,
      SymbolKind.S_FLOAT,
      SymbolKind.S_FOR,
      SymbolKind.S_IF,
      SymbolKind.S_IMPLEMENTS,
      SymbolKind.S_IMPORT,
      SymbolKind.S_INSTANCEOF,
      SymbolKind.S_INT,
      SymbolKind.S_INTERFACE,
      SymbolKind.S_LONG,
      SymbolKind.S_MODULE,
      SymbolKind.S_NATIVE,
      SymbolKind.S_NEW,
      SymbolKind.S_NULL,
      SymbolKind.S_OPEN,
      SymbolKind.S_PACKAGE,
      SymbolKind.S_PRIVATE,
      SymbolKind.S_PROTECTED,
      SymbolKind.S_PUBLIC,
      SymbolKind.S_RECORD,
      SymbolKind.S_RETURN,
      SymbolKind.S_SHORT,
      SymbolKind.S_STATIC,
      SymbolKind.S_STRICTFP,
      SymbolKind.S_SUPER,
      SymbolKind.S_SWITCH,
      SymbolKind.S_SYNCHRONIZED,
      SymbolKind.S_THIS,
      SymbolKind.S_THROW,
      SymbolKind.S_THROWS,
      SymbolKind.S_TRANSIENT,
      SymbolKind.S_TRANSITIVE,
      SymbolKind.S_TRUE,
      SymbolKind.S_TRY,
      SymbolKind.S_VAR,
      SymbolKind.S_VOID,
      SymbolKind.S_VOLATILE,
      SymbolKind.S_WHILE,
      SymbolKind.S_YIELD,
      SymbolKind.S_SHORT_COMMENT,
      SymbolKind.S_LONG_COMMENT,
      SymbolKind.S_EOS,
      SymbolKind.S_120_requires_,
      SymbolKind.S_121_exports_,
      SymbolKind.S_122_to_,
      SymbolKind.S_123_opens_,
      SymbolKind.S_124_uses_,
      SymbolKind.S_125_provides_,
      SymbolKind.S_126_with_,
      SymbolKind.S_YYACCEPT,
      SymbolKind.S_Literal,
      SymbolKind.S_CompoundName,
      SymbolKind.S_ModifierSeqOpt,
      SymbolKind.S_ModifierSeq,
      SymbolKind.S_StandardModifierSeq,
      SymbolKind.S_StandardModifier,
      SymbolKind.S_CompilationUnit,
      SymbolKind.S_Package,
      SymbolKind.S_Module,
      SymbolKind.S_ImportDeclarationSeqOpt,
      SymbolKind.S_ImportDeclarationSeq,
      SymbolKind.S_ImportDeclaration,
      SymbolKind.S_TopLevelComponentSeqOpt,
      SymbolKind.S_TopLevelComponentSeq,
      SymbolKind.S_TopLevelComponent,
      SymbolKind.S_ModuleDirectiveSeqOpt,
      SymbolKind.S_ModuleDirectiveSeq,
      SymbolKind.S_ModuleDirective,
      SymbolKind.S_ModuleNameList,
      SymbolKind.S_RequiresModifierSeqOpt,
      SymbolKind.S_Type,
      SymbolKind.S_UnannotatedType,
      SymbolKind.S_PrimitiveType,
      SymbolKind.S_ClassDeclaration,
      SymbolKind.S_NormalClassDeclaration,
      SymbolKind.S_TypeParametersOpt,
      SymbolKind.S_TypeParameters,
      SymbolKind.S_TypeParameterList,
      SymbolKind.S_TypeParameter,
      SymbolKind.S_TypeParameterTail,
      SymbolKind.S_ClassExtendsOpt,
      SymbolKind.S_ClassImplementsOpt,
      SymbolKind.S_ClassTypeList1,
      SymbolKind.S_ClassTypeList2,
      SymbolKind.S_ClassBodyOpt,
      SymbolKind.S_ClassBody,
      SymbolKind.S_ClassBodyDeclarationSeq,
      SymbolKind.S_ClassBodyDeclaration,
      SymbolKind.S_PureBodyDeclaration,
      SymbolKind.S_ConstructorDeclaration,
      SymbolKind.S_ConstructorDeclarator,
      SymbolKind.S_ConstructorBody,
      SymbolKind.S_ExplicitConstructorInvocation,
      SymbolKind.S_EnumDeclaration,
      SymbolKind.S_EnumBody,
      SymbolKind.S_EnumConstantListOpt,
      SymbolKind.S_EnumConstantList,
      SymbolKind.S_EnumConstant,
      SymbolKind.S_EnumBodyDeclarationsOpt,
      SymbolKind.S_RecordDeclaration,
      SymbolKind.S_RecordHeader,
      SymbolKind.S_RecordComponentListOpt,
      SymbolKind.S_RecordComponent,
      SymbolKind.S_RecordBody,
      SymbolKind.S_RecordBodyDeclarationSeq,
      SymbolKind.S_RecordBodyDeclaration,
      SymbolKind.S_FieldDeclaration,
      SymbolKind.S_VariableDeclaratorList,
      SymbolKind.S_VariableDeclarator,
      SymbolKind.S_ArrayInitializer,
      SymbolKind.S_VariableInitializerListOpt,
      SymbolKind.S_VariableInitializerList,
      SymbolKind.S_VariableInitializer,
      SymbolKind.S_MethodDeclaration,
      SymbolKind.S_MethodHeader,
      SymbolKind.S_MethodDeclarator,
      SymbolKind.S_FormalParameterList,
      SymbolKind.S_FormalParameter,
      SymbolKind.S_FormalParameterTail,
      SymbolKind.S_ThrowsOpt,
      SymbolKind.S_MethodBody,
      SymbolKind.S_DimsOpt,
      SymbolKind.S_Dims,
      SymbolKind.S_Dim,
      SymbolKind.S_InterfaceDeclaration,
      SymbolKind.S_NormalInterfaceDeclaration,
      SymbolKind.S_InterfaceExtendsOpt,
      SymbolKind.S_InterfaceExtends,
      SymbolKind.S_InterfaceBody,
      SymbolKind.S_InterfaceMemberDeclarationSeq,
      SymbolKind.S_InterfaceMemberDeclaration,
      SymbolKind.S_ConstantDeclaration,
      SymbolKind.S_InterfaceMethodDeclaration,
      SymbolKind.S_AnnotationInterfaceDeclaration,
      SymbolKind.S_AnnotationInterfaceBody,
      SymbolKind.S_AnnotationInterfaceMemberDeclarationSeq,
      SymbolKind.S_AnnotationInterfaceMemberDeclaration,
      SymbolKind.S_AnnotationInterfaceElementDeclaration,
      SymbolKind.S_DefaultValueOpt,
      SymbolKind.S_Block,
      SymbolKind.S_BlockStatementSeq,
      SymbolKind.S_BlockStatement,
      SymbolKind.S_LocalVariableDeclaration,
      SymbolKind.S_Statement,
      SymbolKind.S_SimpleStatement,
      SymbolKind.S_LabeledStatement,
      SymbolKind.S_StatementExpression,
      SymbolKind.S_IfThenElseStatement,
      SymbolKind.S_ElsePartOpt,
      SymbolKind.S_SwitchBlock,
      SymbolKind.S_SwitchRuleSeq,
      SymbolKind.S_SwitchRule,
      SymbolKind.S_SwitchBlockStatementGroupSeqOpt,
      SymbolKind.S_SwitchBlockStatementGroup,
      SymbolKind.S_SwitchLabelSeq,
      SymbolKind.S_SwitchLabel,
      SymbolKind.S_CaseExpressionList,
      SymbolKind.S_WhileStatement,
      SymbolKind.S_ForStatement,
      SymbolKind.S_BasicForStatement,
      SymbolKind.S_ForInitOpt,
      SymbolKind.S_ExpressionOpt,
      SymbolKind.S_StatementExpressionList,
      SymbolKind.S_StatementExpressionListOpt,
      SymbolKind.S_EnhancedForStatement,
      SymbolKind.S_CatchesOpt,
      SymbolKind.S_Catches,
      SymbolKind.S_CatchClause,
      SymbolKind.S_CatchFormalParameter,
      SymbolKind.S_CatchType,
      SymbolKind.S_FinallyOpt,
      SymbolKind.S_Finally,
      SymbolKind.S_ResourceSpecification,
      SymbolKind.S_ResourceSeq,
      SymbolKind.S_Resource,
      SymbolKind.S_Pattern,
      SymbolKind.S_Primary,
      SymbolKind.S_ClassInstanceCreationExpression,
      SymbolKind.S_UnqualifiedClassInstanceCreationExpression,
      SymbolKind.S_ClassOrInterfaceTypeToInstantiate,
      SymbolKind.S_AnnotatedCompoundName,
      SymbolKind.S_TypeArgumentsOpt,
      SymbolKind.S_TypeArguments,
      SymbolKind.S_TypeArgumentList,
      SymbolKind.S_TypeArgument,
      SymbolKind.S_FieldAccess,
      SymbolKind.S_ArrayAccess,
      SymbolKind.S_MethodInvocation,
      SymbolKind.S_Arguments,
      SymbolKind.S_ArgumentList,
      SymbolKind.S_MethodReference,
      SymbolKind.S_ArrayCreationExpression,
      SymbolKind.S_DimExprs,
      SymbolKind.S_DimExpr,
      SymbolKind.S_Expression,
      SymbolKind.S_LambdaExpression,
      SymbolKind.S_LambdaParameters,
      SymbolKind.S_LambdaParameterList1,
      SymbolKind.S_LambdaParameterList2,
      SymbolKind.S_LambdaParameter,
      SymbolKind.S_AssignmentExpression,
      SymbolKind.S_Assignment,
      SymbolKind.S_LeftHandSide,
      SymbolKind.S_AssignmentOperator,
      SymbolKind.S_ConditionalExpression,
      SymbolKind.S_ConditionalOrTail,
      SymbolKind.S_ConditionalOrExpression,
      SymbolKind.S_ConditionalAndExpression,
      SymbolKind.S_InclusiveOrExpression,
      SymbolKind.S_ExclusiveOrExpression,
      SymbolKind.S_AndExpression,
      SymbolKind.S_EqualityExpression,
      SymbolKind.S_RelationalExpression,
      SymbolKind.S_InstanceofExpression,
      SymbolKind.S_ShiftExpression,
      SymbolKind.S_AdditiveExpression,
      SymbolKind.S_MultiplicativeExpression,
      SymbolKind.S_UnaryExpression,
      SymbolKind.S_PreIncrementExpression,
      SymbolKind.S_PreDecrementExpression,
      SymbolKind.S_UnaryExpressionNotPlusMinus,
      SymbolKind.S_PostfixExpression,
      SymbolKind.S_PostIncrementExpression,
      SymbolKind.S_PostDecrementExpression,
      SymbolKind.S_CastExpression,
      SymbolKind.S_TargetType,
      SymbolKind.S_TypeList,
      SymbolKind.S_SwitchExpression,
      SymbolKind.S_AnnotationSeqOpt,
      SymbolKind.S_AnnotationSeq,
      SymbolKind.S_Annotation,
      SymbolKind.S_AnnoParameterList,
      SymbolKind.S_ElementValue,
      SymbolKind.S_ElementValueListOpt
    };

    static final SymbolKind get(int code) {
      return values_[code];
    }

    public final int getCode() {
      return this.yycode_;
    }

    /* YYNAMES_[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
       First, the terminals, then, starting at \a YYNTOKENS_, nonterminals.  */
    private static final String[] yynames_ = yynames_init();
  private static final String[] yynames_init()
  {
    return new String[]
    {
  "end of file", "error", "invalid token", "LPAREN", "RPAREN", "LBRACE",
  "RBRACE", "LBRACKET", "RBRACKET", "COMMA", "DOT", "SEMICOLON", "COLON",
  "DBL_COLON", "STAR", "SLASH", "PERCENT", "AMPERSAND", "AT", "LESS",
  "GREATER", "VERTICAL", "PLUS", "MINUS", "ARROW", "DIAMOND", "QUESTION",
  "CARET", "EQUAL", "TILDE", "EXCLAMATION", "ELLIPSIS", "LESS_EQUAL",
  "GREATER_EQUAL", "STAR_EQUAL", "SLASH_EQUAL", "PERCENT_EQUAL",
  "PLUS_EQUAL", "MINUS_EQUAL", "LESS_LESS_EQUAL", "GR_GR_EQUAL",
  "GR_GR_GR_EQUAL", "AMP_EQUAL", "CARET_EQUAL", "VERTICAL_EQUAL",
  "DBL_PLUS", "DBL_MINUS", "DBL_VERTICAL", "DBL_AMPERSAND", "DBL_EQUAL",
  "TRIPL_EQUAL", "NON_EQUAL", "DBL_LESS", "DBL_GREATER", "TRIPL_GREATER",
  "IDENTIFIER", "INTEGER_LITERAL", "FLOATING_POINT_LITERAL",
  "CHARACTER_LITERAL", "STRING_LITERAL", "ABSTRACT", "ASSERT", "BOOLEAN",
  "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONTINUE", "DEFAULT",
  "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
  "FLOAT", "FOR", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT",
  "INTERFACE", "LONG", "MODULE", "NATIVE", "NEW", "NULL", "OPEN",
  "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RECORD", "RETURN", "SHORT",
  "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW",
  "THROWS", "TRANSIENT", "TRANSITIVE", "TRUE", "TRY", "VAR", "VOID",
  "VOLATILE", "WHILE", "YIELD", "SHORT_COMMENT", "LONG_COMMENT", "EOS",
  "requires", "exports", "to", "opens", "uses", "provides", "with",
  "$accept", "Literal", "CompoundName", "ModifierSeqOpt", "ModifierSeq",
  "StandardModifierSeq", "StandardModifier", "CompilationUnit", "Package",
  "Module", "ImportDeclarationSeqOpt", "ImportDeclarationSeq",
  "ImportDeclaration", "TopLevelComponentSeqOpt", "TopLevelComponentSeq",
  "TopLevelComponent", "ModuleDirectiveSeqOpt", "ModuleDirectiveSeq",
  "ModuleDirective", "ModuleNameList", "RequiresModifierSeqOpt", "Type",
  "UnannotatedType", "PrimitiveType", "ClassDeclaration",
  "NormalClassDeclaration", "TypeParametersOpt", "TypeParameters",
  "TypeParameterList", "TypeParameter", "TypeParameterTail",
  "ClassExtendsOpt", "ClassImplementsOpt", "ClassTypeList1",
  "ClassTypeList2", "ClassBodyOpt", "ClassBody", "ClassBodyDeclarationSeq",
  "ClassBodyDeclaration", "PureBodyDeclaration", "ConstructorDeclaration",
  "ConstructorDeclarator", "ConstructorBody",
  "ExplicitConstructorInvocation", "EnumDeclaration", "EnumBody",
  "EnumConstantListOpt", "EnumConstantList", "EnumConstant",
  "EnumBodyDeclarationsOpt", "RecordDeclaration", "RecordHeader",
  "RecordComponentListOpt", "RecordComponent", "RecordBody",
  "RecordBodyDeclarationSeq", "RecordBodyDeclaration", "FieldDeclaration",
  "VariableDeclaratorList", "VariableDeclarator", "ArrayInitializer",
  "VariableInitializerListOpt", "VariableInitializerList",
  "VariableInitializer", "MethodDeclaration", "MethodHeader",
  "MethodDeclarator", "FormalParameterList", "FormalParameter",
  "FormalParameterTail", "ThrowsOpt", "MethodBody", "DimsOpt", "Dims",
  "Dim", "InterfaceDeclaration", "NormalInterfaceDeclaration",
  "InterfaceExtendsOpt", "InterfaceExtends", "InterfaceBody",
  "InterfaceMemberDeclarationSeq", "InterfaceMemberDeclaration",
  "ConstantDeclaration", "InterfaceMethodDeclaration",
  "AnnotationInterfaceDeclaration", "AnnotationInterfaceBody",
  "AnnotationInterfaceMemberDeclarationSeq",
  "AnnotationInterfaceMemberDeclaration",
  "AnnotationInterfaceElementDeclaration", "DefaultValueOpt", "Block",
  "BlockStatementSeq", "BlockStatement", "LocalVariableDeclaration",
  "Statement", "SimpleStatement", "LabeledStatement",
  "StatementExpression", "IfThenElseStatement", "ElsePartOpt",
  "SwitchBlock", "SwitchRuleSeq", "SwitchRule",
  "SwitchBlockStatementGroupSeqOpt", "SwitchBlockStatementGroup",
  "SwitchLabelSeq", "SwitchLabel", "CaseExpressionList", "WhileStatement",
  "ForStatement", "BasicForStatement", "ForInitOpt", "ExpressionOpt",
  "StatementExpressionList", "StatementExpressionListOpt",
  "EnhancedForStatement", "CatchesOpt", "Catches", "CatchClause",
  "CatchFormalParameter", "CatchType", "FinallyOpt", "Finally",
  "ResourceSpecification", "ResourceSeq", "Resource", "Pattern", "Primary",
  "ClassInstanceCreationExpression",
  "UnqualifiedClassInstanceCreationExpression",
  "ClassOrInterfaceTypeToInstantiate", "AnnotatedCompoundName",
  "TypeArgumentsOpt", "TypeArguments", "TypeArgumentList", "TypeArgument",
  "FieldAccess", "ArrayAccess", "MethodInvocation", "Arguments",
  "ArgumentList", "MethodReference", "ArrayCreationExpression", "DimExprs",
  "DimExpr", "Expression", "LambdaExpression", "LambdaParameters",
  "LambdaParameterList1", "LambdaParameterList2", "LambdaParameter",
  "AssignmentExpression", "Assignment", "LeftHandSide",
  "AssignmentOperator", "ConditionalExpression", "ConditionalOrTail",
  "ConditionalOrExpression", "ConditionalAndExpression",
  "InclusiveOrExpression", "ExclusiveOrExpression", "AndExpression",
  "EqualityExpression", "RelationalExpression", "InstanceofExpression",
  "ShiftExpression", "AdditiveExpression", "MultiplicativeExpression",
  "UnaryExpression", "PreIncrementExpression", "PreDecrementExpression",
  "UnaryExpressionNotPlusMinus", "PostfixExpression",
  "PostIncrementExpression", "PostDecrementExpression", "CastExpression",
  "TargetType", "TypeList", "SwitchExpression", "AnnotationSeqOpt",
  "AnnotationSeq", "Annotation", "AnnoParameterList", "ElementValue",
  "ElementValueListOpt", null
    };
  }

    /* The user-facing name of this symbol.  */
    public final String getName() {
      return yynames_[yycode_];
    }
  };


  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>JavaParser</tt>.
   */
  public interface Lexer {
    /* Token kinds.  */
    /** Token "end of file", to be returned by the scanner.  */
    static final int YYEOF = 0;
    /** Token error, to be returned by the scanner.  */
    static final int YYerror = 256;
    /** Token "invalid token", to be returned by the scanner.  */
    static final int YYUNDEF = 257;
    /** Token LPAREN, to be returned by the scanner.  */
    static final int LPAREN = 258;
    /** Token RPAREN, to be returned by the scanner.  */
    static final int RPAREN = 259;
    /** Token LBRACE, to be returned by the scanner.  */
    static final int LBRACE = 260;
    /** Token RBRACE, to be returned by the scanner.  */
    static final int RBRACE = 261;
    /** Token LBRACKET, to be returned by the scanner.  */
    static final int LBRACKET = 262;
    /** Token RBRACKET, to be returned by the scanner.  */
    static final int RBRACKET = 263;
    /** Token COMMA, to be returned by the scanner.  */
    static final int COMMA = 264;
    /** Token DOT, to be returned by the scanner.  */
    static final int DOT = 265;
    /** Token SEMICOLON, to be returned by the scanner.  */
    static final int SEMICOLON = 266;
    /** Token COLON, to be returned by the scanner.  */
    static final int COLON = 267;
    /** Token DBL_COLON, to be returned by the scanner.  */
    static final int DBL_COLON = 268;
    /** Token STAR, to be returned by the scanner.  */
    static final int STAR = 269;
    /** Token SLASH, to be returned by the scanner.  */
    static final int SLASH = 270;
    /** Token PERCENT, to be returned by the scanner.  */
    static final int PERCENT = 271;
    /** Token AMPERSAND, to be returned by the scanner.  */
    static final int AMPERSAND = 272;
    /** Token AT, to be returned by the scanner.  */
    static final int AT = 273;
    /** Token LESS, to be returned by the scanner.  */
    static final int LESS = 274;
    /** Token GREATER, to be returned by the scanner.  */
    static final int GREATER = 275;
    /** Token VERTICAL, to be returned by the scanner.  */
    static final int VERTICAL = 276;
    /** Token PLUS, to be returned by the scanner.  */
    static final int PLUS = 277;
    /** Token MINUS, to be returned by the scanner.  */
    static final int MINUS = 278;
    /** Token ARROW, to be returned by the scanner.  */
    static final int ARROW = 279;
    /** Token DIAMOND, to be returned by the scanner.  */
    static final int DIAMOND = 280;
    /** Token QUESTION, to be returned by the scanner.  */
    static final int QUESTION = 281;
    /** Token CARET, to be returned by the scanner.  */
    static final int CARET = 282;
    /** Token EQUAL, to be returned by the scanner.  */
    static final int EQUAL = 283;
    /** Token TILDE, to be returned by the scanner.  */
    static final int TILDE = 284;
    /** Token EXCLAMATION, to be returned by the scanner.  */
    static final int EXCLAMATION = 285;
    /** Token ELLIPSIS, to be returned by the scanner.  */
    static final int ELLIPSIS = 286;
    /** Token LESS_EQUAL, to be returned by the scanner.  */
    static final int LESS_EQUAL = 287;
    /** Token GREATER_EQUAL, to be returned by the scanner.  */
    static final int GREATER_EQUAL = 288;
    /** Token STAR_EQUAL, to be returned by the scanner.  */
    static final int STAR_EQUAL = 289;
    /** Token SLASH_EQUAL, to be returned by the scanner.  */
    static final int SLASH_EQUAL = 290;
    /** Token PERCENT_EQUAL, to be returned by the scanner.  */
    static final int PERCENT_EQUAL = 291;
    /** Token PLUS_EQUAL, to be returned by the scanner.  */
    static final int PLUS_EQUAL = 292;
    /** Token MINUS_EQUAL, to be returned by the scanner.  */
    static final int MINUS_EQUAL = 293;
    /** Token LESS_LESS_EQUAL, to be returned by the scanner.  */
    static final int LESS_LESS_EQUAL = 294;
    /** Token GR_GR_EQUAL, to be returned by the scanner.  */
    static final int GR_GR_EQUAL = 295;
    /** Token GR_GR_GR_EQUAL, to be returned by the scanner.  */
    static final int GR_GR_GR_EQUAL = 296;
    /** Token AMP_EQUAL, to be returned by the scanner.  */
    static final int AMP_EQUAL = 297;
    /** Token CARET_EQUAL, to be returned by the scanner.  */
    static final int CARET_EQUAL = 298;
    /** Token VERTICAL_EQUAL, to be returned by the scanner.  */
    static final int VERTICAL_EQUAL = 299;
    /** Token DBL_PLUS, to be returned by the scanner.  */
    static final int DBL_PLUS = 300;
    /** Token DBL_MINUS, to be returned by the scanner.  */
    static final int DBL_MINUS = 301;
    /** Token DBL_VERTICAL, to be returned by the scanner.  */
    static final int DBL_VERTICAL = 302;
    /** Token DBL_AMPERSAND, to be returned by the scanner.  */
    static final int DBL_AMPERSAND = 303;
    /** Token DBL_EQUAL, to be returned by the scanner.  */
    static final int DBL_EQUAL = 304;
    /** Token TRIPL_EQUAL, to be returned by the scanner.  */
    static final int TRIPL_EQUAL = 305;
    /** Token NON_EQUAL, to be returned by the scanner.  */
    static final int NON_EQUAL = 306;
    /** Token DBL_LESS, to be returned by the scanner.  */
    static final int DBL_LESS = 307;
    /** Token DBL_GREATER, to be returned by the scanner.  */
    static final int DBL_GREATER = 308;
    /** Token TRIPL_GREATER, to be returned by the scanner.  */
    static final int TRIPL_GREATER = 309;
    /** Token IDENTIFIER, to be returned by the scanner.  */
    static final int IDENTIFIER = 310;
    /** Token INTEGER_LITERAL, to be returned by the scanner.  */
    static final int INTEGER_LITERAL = 311;
    /** Token FLOATING_POINT_LITERAL, to be returned by the scanner.  */
    static final int FLOATING_POINT_LITERAL = 312;
    /** Token CHARACTER_LITERAL, to be returned by the scanner.  */
    static final int CHARACTER_LITERAL = 313;
    /** Token STRING_LITERAL, to be returned by the scanner.  */
    static final int STRING_LITERAL = 314;
    /** Token ABSTRACT, to be returned by the scanner.  */
    static final int ABSTRACT = 315;
    /** Token ASSERT, to be returned by the scanner.  */
    static final int ASSERT = 316;
    /** Token BOOLEAN, to be returned by the scanner.  */
    static final int BOOLEAN = 317;
    /** Token BREAK, to be returned by the scanner.  */
    static final int BREAK = 318;
    /** Token BYTE, to be returned by the scanner.  */
    static final int BYTE = 319;
    /** Token CASE, to be returned by the scanner.  */
    static final int CASE = 320;
    /** Token CATCH, to be returned by the scanner.  */
    static final int CATCH = 321;
    /** Token CHAR, to be returned by the scanner.  */
    static final int CHAR = 322;
    /** Token CLASS, to be returned by the scanner.  */
    static final int CLASS = 323;
    /** Token CONTINUE, to be returned by the scanner.  */
    static final int CONTINUE = 324;
    /** Token DEFAULT, to be returned by the scanner.  */
    static final int DEFAULT = 325;
    /** Token DO, to be returned by the scanner.  */
    static final int DO = 326;
    /** Token DOUBLE, to be returned by the scanner.  */
    static final int DOUBLE = 327;
    /** Token ELSE, to be returned by the scanner.  */
    static final int ELSE = 328;
    /** Token ENUM, to be returned by the scanner.  */
    static final int ENUM = 329;
    /** Token EXTENDS, to be returned by the scanner.  */
    static final int EXTENDS = 330;
    /** Token FALSE, to be returned by the scanner.  */
    static final int FALSE = 331;
    /** Token FINAL, to be returned by the scanner.  */
    static final int FINAL = 332;
    /** Token FINALLY, to be returned by the scanner.  */
    static final int FINALLY = 333;
    /** Token FLOAT, to be returned by the scanner.  */
    static final int FLOAT = 334;
    /** Token FOR, to be returned by the scanner.  */
    static final int FOR = 335;
    /** Token IF, to be returned by the scanner.  */
    static final int IF = 336;
    /** Token IMPLEMENTS, to be returned by the scanner.  */
    static final int IMPLEMENTS = 337;
    /** Token IMPORT, to be returned by the scanner.  */
    static final int IMPORT = 338;
    /** Token INSTANCEOF, to be returned by the scanner.  */
    static final int INSTANCEOF = 339;
    /** Token INT, to be returned by the scanner.  */
    static final int INT = 340;
    /** Token INTERFACE, to be returned by the scanner.  */
    static final int INTERFACE = 341;
    /** Token LONG, to be returned by the scanner.  */
    static final int LONG = 342;
    /** Token MODULE, to be returned by the scanner.  */
    static final int MODULE = 343;
    /** Token NATIVE, to be returned by the scanner.  */
    static final int NATIVE = 344;
    /** Token NEW, to be returned by the scanner.  */
    static final int NEW = 345;
    /** Token NULL, to be returned by the scanner.  */
    static final int NULL = 346;
    /** Token OPEN, to be returned by the scanner.  */
    static final int OPEN = 347;
    /** Token PACKAGE, to be returned by the scanner.  */
    static final int PACKAGE = 348;
    /** Token PRIVATE, to be returned by the scanner.  */
    static final int PRIVATE = 349;
    /** Token PROTECTED, to be returned by the scanner.  */
    static final int PROTECTED = 350;
    /** Token PUBLIC, to be returned by the scanner.  */
    static final int PUBLIC = 351;
    /** Token RECORD, to be returned by the scanner.  */
    static final int RECORD = 352;
    /** Token RETURN, to be returned by the scanner.  */
    static final int RETURN = 353;
    /** Token SHORT, to be returned by the scanner.  */
    static final int SHORT = 354;
    /** Token STATIC, to be returned by the scanner.  */
    static final int STATIC = 355;
    /** Token STRICTFP, to be returned by the scanner.  */
    static final int STRICTFP = 356;
    /** Token SUPER, to be returned by the scanner.  */
    static final int SUPER = 357;
    /** Token SWITCH, to be returned by the scanner.  */
    static final int SWITCH = 358;
    /** Token SYNCHRONIZED, to be returned by the scanner.  */
    static final int SYNCHRONIZED = 359;
    /** Token THIS, to be returned by the scanner.  */
    static final int THIS = 360;
    /** Token THROW, to be returned by the scanner.  */
    static final int THROW = 361;
    /** Token THROWS, to be returned by the scanner.  */
    static final int THROWS = 362;
    /** Token TRANSIENT, to be returned by the scanner.  */
    static final int TRANSIENT = 363;
    /** Token TRANSITIVE, to be returned by the scanner.  */
    static final int TRANSITIVE = 364;
    /** Token TRUE, to be returned by the scanner.  */
    static final int TRUE = 365;
    /** Token TRY, to be returned by the scanner.  */
    static final int TRY = 366;
    /** Token VAR, to be returned by the scanner.  */
    static final int VAR = 367;
    /** Token VOID, to be returned by the scanner.  */
    static final int VOID = 368;
    /** Token VOLATILE, to be returned by the scanner.  */
    static final int VOLATILE = 369;
    /** Token WHILE, to be returned by the scanner.  */
    static final int WHILE = 370;
    /** Token YIELD, to be returned by the scanner.  */
    static final int YIELD = 371;
    /** Token SHORT_COMMENT, to be returned by the scanner.  */
    static final int SHORT_COMMENT = 372;
    /** Token LONG_COMMENT, to be returned by the scanner.  */
    static final int LONG_COMMENT = 373;
    /** Token EOS, to be returned by the scanner.  */
    static final int EOS = 374;

    /** Deprecated, use YYEOF instead.  */
    public static final int EOF = YYEOF;


    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Entity getLVal();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex() throws java.io.IOException;

    /**
     * Emit an errorin a user-defined way.
     *
     *
     * @param msg The string for the error message.
     */
     void yyerror(String msg);


  }


  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;





  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public JavaParser (Lexer yylexer)
  {

    this.yylexer = yylexer;

  }



  private int yynerrs = 0;

  /**
   * The number of syntax errors so far.
   */
  public final int getNumberOfErrors () { return yynerrs; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror(String msg) {
      yylexer.yyerror(msg);
  }



  private final class YYStack {
    private int[] stateStack = new int[16];
    private Entity[] valueStack = new Entity[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Entity value) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;

          Entity[] newValueStack = new Entity[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (0 < num) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Entity valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out) {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yyLRGotoState (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - YYNTOKENS_] + yystate;
    if (0 <= yyr && yyr <= YYLAST_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - YYNTOKENS_];
  }

  private int yyaction(int yyn, YYStack yystack, int yylen)
  {
    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    Entity yyval = (0 < yylen) ? yystack.valueAt(yylen - 1) : yystack.valueAt(0);

    switch (yyn)
      {
          case 2: /* Literal: INTEGER_LITERAL  */
  if (yyn == 2)
    /* "src/main/resources/Java_16_Grammar.y":266  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 3: /* Literal: FLOATING_POINT_LITERAL  */
  if (yyn == 3)
    /* "src/main/resources/Java_16_Grammar.y":267  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 4: /* Literal: TRUE  */
  if (yyn == 4)
    /* "src/main/resources/Java_16_Grammar.y":268  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 5: /* Literal: FALSE  */
  if (yyn == 5)
    /* "src/main/resources/Java_16_Grammar.y":269  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 6: /* Literal: CHARACTER_LITERAL  */
  if (yyn == 6)
    /* "src/main/resources/Java_16_Grammar.y":270  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 7: /* Literal: STRING_LITERAL  */
  if (yyn == 7)
    /* "src/main/resources/Java_16_Grammar.y":271  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 8: /* Literal: NULL  */
  if (yyn == 8)
    /* "src/main/resources/Java_16_Grammar.y":273  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 9: /* CompoundName: IDENTIFIER  */
  if (yyn == 9)
    /* "src/main/resources/Java_16_Grammar.y":279  */
                                  { yyval = new CompoundName(((Token)(yystack.valueAt (0))).image); };
  break;


  case 10: /* CompoundName: CompoundName DOT IDENTIFIER  */
  if (yyn == 10)
    /* "src/main/resources/Java_16_Grammar.y":280  */
                                  { yyval = ((CompoundName)(yystack.valueAt (2))).add(((Token)(yystack.valueAt (0))).image); };
  break;


  case 11: /* ModifierSeqOpt: %empty  */
  if (yyn == 11)
    /* "src/main/resources/Java_16_Grammar.y":284  */
                   { yyval = null; };
  break;


  case 12: /* ModifierSeqOpt: ModifierSeq  */
  if (yyn == 12)
    /* "src/main/resources/Java_16_Grammar.y":285  */
                   { yyval = ((Modifiers)(yystack.valueAt (0))); };
  break;


  case 13: /* ModifierSeq: StandardModifierSeq  */
  if (yyn == 13)
    /* "src/main/resources/Java_16_Grammar.y":289  */
                                        { yyval = new Modifiers(null,((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 14: /* ModifierSeq: AnnotationSeq StandardModifierSeq  */
  if (yyn == 14)
    /* "src/main/resources/Java_16_Grammar.y":290  */
                                        { yyval = new Modifiers(((Annotations)(yystack.valueAt (1))),((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 15: /* StandardModifierSeq: StandardModifier  */
  if (yyn == 15)
    /* "src/main/resources/Java_16_Grammar.y":294  */
                                           { yyval = new StandardModifiers(((Token)(yystack.valueAt (0)))); };
  break;


  case 16: /* StandardModifierSeq: StandardModifierSeq StandardModifier  */
  if (yyn == 16)
    /* "src/main/resources/Java_16_Grammar.y":295  */
                                           { yyval = ((StandardModifiers)(yystack.valueAt (1))).add(((Token)(yystack.valueAt (0)))); };
  break;


  case 17: /* StandardModifier: DEFAULT  */
  if (yyn == 17)
    /* "src/main/resources/Java_16_Grammar.y":300  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 18: /* StandardModifier: FINAL  */
  if (yyn == 18)
    /* "src/main/resources/Java_16_Grammar.y":301  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 19: /* StandardModifier: PUBLIC  */
  if (yyn == 19)
    /* "src/main/resources/Java_16_Grammar.y":302  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 20: /* StandardModifier: PROTECTED  */
  if (yyn == 20)
    /* "src/main/resources/Java_16_Grammar.y":303  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 21: /* StandardModifier: PRIVATE  */
  if (yyn == 21)
    /* "src/main/resources/Java_16_Grammar.y":304  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 22: /* StandardModifier: ABSTRACT  */
  if (yyn == 22)
    /* "src/main/resources/Java_16_Grammar.y":305  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 23: /* StandardModifier: STATIC  */
  if (yyn == 23)
    /* "src/main/resources/Java_16_Grammar.y":306  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 24: /* StandardModifier: STRICTFP  */
  if (yyn == 24)
    /* "src/main/resources/Java_16_Grammar.y":307  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 25: /* StandardModifier: SYNCHRONIZED  */
  if (yyn == 25)
    /* "src/main/resources/Java_16_Grammar.y":308  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 26: /* StandardModifier: TRANSIENT  */
  if (yyn == 26)
    /* "src/main/resources/Java_16_Grammar.y":309  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 27: /* StandardModifier: VOLATILE  */
  if (yyn == 27)
    /* "src/main/resources/Java_16_Grammar.y":310  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 28: /* StandardModifier: OPEN  */
  if (yyn == 28)
    /* "src/main/resources/Java_16_Grammar.y":311  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 29: /* CompilationUnit: %empty  */
  if (yyn == 29)
    /* "src/main/resources/Java_16_Grammar.y":317  */
                                                    { yyval = null; };
  break;


  case 30: /* CompilationUnit: Package  */
  if (yyn == 30)
    /* "src/main/resources/Java_16_Grammar.y":318  */
                                                    { yyval = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); ast = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); };
  break;


  case 31: /* CompilationUnit: Module  */
  if (yyn == 31)
    /* "src/main/resources/Java_16_Grammar.y":319  */
                                                    { yyval = ((tree.Compilation.Module)(yystack.valueAt (0))); ast = ((tree.Compilation.Module)(yystack.valueAt (0))); };
  break;


  case 32: /* CompilationUnit: ImportDeclarationSeqOpt TopLevelComponentSeq  */
  if (yyn == 32)
    /* "src/main/resources/Java_16_Grammar.y":320  */
                                                    { ast = new SimpleCompilationUnit(((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 33: /* Package: PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt  */
  if (yyn == 33)
    /* "src/main/resources/Java_16_Grammar.y":325  */
                                                    { yyval = new tree.Compilation.Package(((CompoundName)(yystack.valueAt (3))),((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 34: /* Module: ModifierSeqOpt MODULE CompoundName LBRACE ModuleDirectiveSeqOpt RBRACE  */
  if (yyn == 34)
    /* "src/main/resources/Java_16_Grammar.y":331  */
                                                                             { yyval = null; };
  break;


  case 35: /* ImportDeclarationSeqOpt: %empty  */
  if (yyn == 35)
    /* "src/main/resources/Java_16_Grammar.y":335  */
                                                 { yyval = null; };
  break;


  case 36: /* ImportDeclarationSeqOpt: ImportDeclarationSeq  */
  if (yyn == 36)
    /* "src/main/resources/Java_16_Grammar.y":336  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (0))); };
  break;


  case 37: /* ImportDeclarationSeq: ImportDeclaration  */
  if (yyn == 37)
    /* "src/main/resources/Java_16_Grammar.y":340  */
                                                 { yyval = new ImportDeclarations(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 38: /* ImportDeclarationSeq: ImportDeclarationSeqOpt ImportDeclaration  */
  if (yyn == 38)
    /* "src/main/resources/Java_16_Grammar.y":341  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))).add(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 39: /* ImportDeclaration: IMPORT CompoundName SEMICOLON  */
  if (yyn == 39)
    /* "src/main/resources/Java_16_Grammar.y":345  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 40: /* ImportDeclaration: IMPORT STATIC CompoundName SEMICOLON  */
  if (yyn == 40)
    /* "src/main/resources/Java_16_Grammar.y":346  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 41: /* ImportDeclaration: IMPORT CompoundName DOT STAR SEMICOLON  */
  if (yyn == 41)
    /* "src/main/resources/Java_16_Grammar.y":347  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 42: /* ImportDeclaration: IMPORT STATIC CompoundName DOT STAR SEMICOLON  */
  if (yyn == 42)
    /* "src/main/resources/Java_16_Grammar.y":348  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 43: /* TopLevelComponentSeqOpt: %empty  */
  if (yyn == 43)
    /* "src/main/resources/Java_16_Grammar.y":352  */
                            { yyval = null; };
  break;


  case 44: /* TopLevelComponentSeqOpt: TopLevelComponentSeq  */
  if (yyn == 44)
    /* "src/main/resources/Java_16_Grammar.y":353  */
                            { yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (0))); };
  break;


  case 45: /* TopLevelComponentSeq: ModifierSeqOpt TopLevelComponent  */
  if (yyn == 45)
    /* "src/main/resources/Java_16_Grammar.y":357  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = new TopLevelComponents(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 46: /* TopLevelComponentSeq: TopLevelComponentSeq ModifierSeqOpt TopLevelComponent  */
  if (yyn == 46)
    /* "src/main/resources/Java_16_Grammar.y":358  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (2))).add(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 47: /* TopLevelComponent: ClassDeclaration  */
  if (yyn == 47)
    /* "src/main/resources/Java_16_Grammar.y":362  */
                           { yyval = new TopLevelComponent(((ClassDeclaration)(yystack.valueAt (0)))); };
  break;


  case 48: /* TopLevelComponent: InterfaceDeclaration  */
  if (yyn == 48)
    /* "src/main/resources/Java_16_Grammar.y":363  */
                           { yyval = new TopLevelComponent(((InterfaceDeclaration)(yystack.valueAt (0)))); };
  break;


  case 67: /* Type: UnannotatedType  */
  if (yyn == 67)
    /* "src/main/resources/Java_16_Grammar.y":410  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))); };
  break;


  case 68: /* Type: AnnotationSeq UnannotatedType  */
  if (yyn == 68)
    /* "src/main/resources/Java_16_Grammar.y":411  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))).addAnnotations(((Annotations)(yystack.valueAt (1)))); };
  break;


  case 69: /* UnannotatedType: PrimitiveType  */
  if (yyn == 69)
    /* "src/main/resources/Java_16_Grammar.y":415  */
                                 { yyval = new PrimitiveType(((Token)(yystack.valueAt (0)))); };
  break;


  case 70: /* UnannotatedType: CompoundName  */
  if (yyn == 70)
    /* "src/main/resources/Java_16_Grammar.y":417  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (0))),null); };
  break;


  case 71: /* UnannotatedType: CompoundName TypeArguments  */
  if (yyn == 71)
    /* "src/main/resources/Java_16_Grammar.y":418  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (1))),((tree.Type.TypeArguments)(yystack.valueAt (0)))); };
  break;


  case 72: /* UnannotatedType: UnannotatedType Dim  */
  if (yyn == 72)
    /* "src/main/resources/Java_16_Grammar.y":420  */
                                     { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (1))).addDimension(((Dim)(yystack.valueAt (0)))); };
  break;


  case 73: /* PrimitiveType: BYTE  */
  if (yyn == 73)
    /* "src/main/resources/Java_16_Grammar.y":429  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 74: /* PrimitiveType: SHORT  */
  if (yyn == 74)
    /* "src/main/resources/Java_16_Grammar.y":430  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 75: /* PrimitiveType: INT  */
  if (yyn == 75)
    /* "src/main/resources/Java_16_Grammar.y":431  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 76: /* PrimitiveType: LONG  */
  if (yyn == 76)
    /* "src/main/resources/Java_16_Grammar.y":432  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 77: /* PrimitiveType: CHAR  */
  if (yyn == 77)
    /* "src/main/resources/Java_16_Grammar.y":433  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 78: /* PrimitiveType: FLOAT  */
  if (yyn == 78)
    /* "src/main/resources/Java_16_Grammar.y":435  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 79: /* PrimitiveType: DOUBLE  */
  if (yyn == 79)
    /* "src/main/resources/Java_16_Grammar.y":436  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 80: /* PrimitiveType: BOOLEAN  */
  if (yyn == 80)
    /* "src/main/resources/Java_16_Grammar.y":437  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 81: /* ClassDeclaration: NormalClassDeclaration  */
  if (yyn == 81)
    /* "src/main/resources/Java_16_Grammar.y":458  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 82: /* ClassDeclaration: EnumDeclaration  */
  if (yyn == 82)
    /* "src/main/resources/Java_16_Grammar.y":459  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 83: /* ClassDeclaration: RecordDeclaration  */
  if (yyn == 83)
    /* "src/main/resources/Java_16_Grammar.y":460  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 84: /* NormalClassDeclaration: CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody  */
  if (yyn == 84)
    /* "src/main/resources/Java_16_Grammar.y":465  */
                              { yyval = new NormalClassDeclaration(((Token)(yystack.valueAt (4))),((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 85: /* TypeParametersOpt: %empty  */
  if (yyn == 85)
    /* "src/main/resources/Java_16_Grammar.y":469  */
                       { yyval = null; };
  break;


  case 86: /* TypeParametersOpt: TypeParameters  */
  if (yyn == 86)
    /* "src/main/resources/Java_16_Grammar.y":470  */
                       { yyval = ((TypeParameters)(yystack.valueAt (0))); };
  break;


  case 87: /* TypeParameters: LESS TypeParameterList GREATER  */
  if (yyn == 87)
    /* "src/main/resources/Java_16_Grammar.y":474  */
                                      { yyval = ((TypeParameters)(yystack.valueAt (1))); };
  break;


  case 88: /* TypeParameterList: TypeParameter  */
  if (yyn == 88)
    /* "src/main/resources/Java_16_Grammar.y":478  */
                                            { yyval = new TypeParameters(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 89: /* TypeParameterList: TypeParameterList COMMA TypeParameter  */
  if (yyn == 89)
    /* "src/main/resources/Java_16_Grammar.y":479  */
                                            { yyval = ((TypeParameters)(yystack.valueAt (2))).add(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 90: /* TypeParameter: AnnotationSeq TypeParameterTail  */
  if (yyn == 90)
    /* "src/main/resources/Java_16_Grammar.y":489  */
                                      { yyval = new TypeParameter(((Annotations)(yystack.valueAt (1))),((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 91: /* TypeParameter: TypeParameterTail  */
  if (yyn == 91)
    /* "src/main/resources/Java_16_Grammar.y":490  */
                                      { yyval = new TypeParameter(null,((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 92: /* TypeParameterTail: IDENTIFIER  */
  if (yyn == 92)
    /* "src/main/resources/Java_16_Grammar.y":494  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (0))),null); };
  break;


  case 93: /* TypeParameterTail: IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 93)
    /* "src/main/resources/Java_16_Grammar.y":495  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (3))),((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0)))); };
  break;


  case 94: /* TypeParameterTail: IDENTIFIER EXTENDS ClassTypeList2  */
  if (yyn == 94)
    /* "src/main/resources/Java_16_Grammar.y":496  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 95: /* ClassExtendsOpt: %empty  */
  if (yyn == 95)
    /* "src/main/resources/Java_16_Grammar.y":500  */
                    { yyval = null; };
  break;


  case 96: /* ClassExtendsOpt: EXTENDS Type  */
  if (yyn == 96)
    /* "src/main/resources/Java_16_Grammar.y":501  */
                    { yyval = ((tree.Type.Type)(yystack.valueAt (0))); };
  break;


  case 97: /* ClassImplementsOpt: %empty  */
  if (yyn == 97)
    /* "src/main/resources/Java_16_Grammar.y":505  */
                                 { yyval = null; };
  break;


  case 98: /* ClassImplementsOpt: IMPLEMENTS ClassTypeList1  */
  if (yyn == 98)
    /* "src/main/resources/Java_16_Grammar.y":506  */
                                 { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 99: /* ClassTypeList1: Type  */
  if (yyn == 99)
    /* "src/main/resources/Java_16_Grammar.y":510  */
                                { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 100: /* ClassTypeList1: ClassTypeList1 COMMA Type  */
  if (yyn == 100)
    /* "src/main/resources/Java_16_Grammar.y":511  */
                                { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 101: /* ClassTypeList2: Type  */
  if (yyn == 101)
    /* "src/main/resources/Java_16_Grammar.y":515  */
                                    { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 102: /* ClassTypeList2: ClassTypeList2 AMPERSAND Type  */
  if (yyn == 102)
    /* "src/main/resources/Java_16_Grammar.y":516  */
                                    { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 103: /* ClassBodyOpt: %empty  */
  if (yyn == 103)
    /* "src/main/resources/Java_16_Grammar.y":520  */
                    { yyval = null; };
  break;


  case 104: /* ClassBodyOpt: ClassBody  */
  if (yyn == 104)
    /* "src/main/resources/Java_16_Grammar.y":521  */
                    { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 105: /* ClassBody: LBRACE RBRACE  */
  if (yyn == 105)
    /* "src/main/resources/Java_16_Grammar.y":525  */
                                             { yyval = null; };
  break;


  case 106: /* ClassBody: LBRACE ClassBodyDeclarationSeq RBRACE  */
  if (yyn == 106)
    /* "src/main/resources/Java_16_Grammar.y":526  */
                                                 { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 107: /* ClassBodyDeclarationSeq: ClassBodyDeclaration  */
  if (yyn == 107)
    /* "src/main/resources/Java_16_Grammar.y":530  */
                                                   { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 108: /* ClassBodyDeclarationSeq: ClassBodyDeclarationSeq ClassBodyDeclaration  */
  if (yyn == 108)
    /* "src/main/resources/Java_16_Grammar.y":531  */
                                                   { yyval = ((Declarations)(yystack.valueAt (1))).add(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 109: /* ClassBodyDeclaration: ModifierSeqOpt PureBodyDeclaration  */
  if (yyn == 109)
    /* "src/main/resources/Java_16_Grammar.y":535  */
                                         { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); };
  break;


  case 110: /* ClassBodyDeclaration: Block  */
  if (yyn == 110)
    /* "src/main/resources/Java_16_Grammar.y":536  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),false); };
  break;


  case 111: /* ClassBodyDeclaration: STATIC Block  */
  if (yyn == 111)
    /* "src/main/resources/Java_16_Grammar.y":537  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),true); };
  break;


  case 112: /* ClassBodyDeclaration: SEMICOLON  */
  if (yyn == 112)
    /* "src/main/resources/Java_16_Grammar.y":538  */
                      { yyval = null; };
  break;


  case 113: /* PureBodyDeclaration: FieldDeclaration  */
  if (yyn == 113)
    /* "src/main/resources/Java_16_Grammar.y":542  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 114: /* PureBodyDeclaration: MethodDeclaration  */
  if (yyn == 114)
    /* "src/main/resources/Java_16_Grammar.y":543  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 115: /* PureBodyDeclaration: ClassDeclaration  */
  if (yyn == 115)
    /* "src/main/resources/Java_16_Grammar.y":544  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 116: /* PureBodyDeclaration: InterfaceDeclaration  */
  if (yyn == 116)
    /* "src/main/resources/Java_16_Grammar.y":545  */
                               { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 117: /* PureBodyDeclaration: ConstructorDeclaration  */
  if (yyn == 117)
    /* "src/main/resources/Java_16_Grammar.y":546  */
                               { yyval = ((ConstructorDeclaration)(yystack.valueAt (0))); };
  break;


  case 118: /* ConstructorDeclaration: ConstructorDeclarator ThrowsOpt ConstructorBody  */
  if (yyn == 118)
    /* "src/main/resources/Java_16_Grammar.y":553  */
                            { yyval = new ConstructorDeclaration(null,((ConstructorDeclarator)(yystack.valueAt (2))).typeParameters,((ConstructorDeclarator)(yystack.valueAt (2))).formalParameters,
                                                              ((tree.Type.TypeList)(yystack.valueAt (1))),((ConstructorBody)(yystack.valueAt (0))).invocation,((ConstructorBody)(yystack.valueAt (0))).block); };
  break;


  case 119: /* ConstructorDeclarator: TypeParametersOpt IDENTIFIER LPAREN FormalParameterList RPAREN  */
  if (yyn == 119)
    /* "src/main/resources/Java_16_Grammar.y":559  */
                                      { yyval = new ConstructorDeclarator(((TypeParameters)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (1)))); };
  break;


  case 120: /* ConstructorBody: LBRACE RBRACE  */
  if (yyn == 120)
    /* "src/main/resources/Java_16_Grammar.y":563  */
                                                                    { yyval = new ConstructorBody(null,null); };
  break;


  case 121: /* ConstructorBody: LBRACE ExplicitConstructorInvocation RBRACE  */
  if (yyn == 121)
    /* "src/main/resources/Java_16_Grammar.y":564  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (1))),null); };
  break;


  case 122: /* ConstructorBody: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 122)
    /* "src/main/resources/Java_16_Grammar.y":565  */
                                                                    { yyval = new ConstructorBody(null,new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 123: /* ConstructorBody: LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE  */
  if (yyn == 123)
    /* "src/main/resources/Java_16_Grammar.y":566  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (2))),new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 124: /* ExplicitConstructorInvocation: TypeArgumentsOpt THIS Arguments SEMICOLON  */
  if (yyn == 124)
    /* "src/main/resources/Java_16_Grammar.y":570  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),false,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 125: /* ExplicitConstructorInvocation: TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 125)
    /* "src/main/resources/Java_16_Grammar.y":571  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 126: /* ExplicitConstructorInvocation: CompoundName DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 126)
    /* "src/main/resources/Java_16_Grammar.y":572  */
                                                                  { Expression expr = new SimpleReference(((CompoundName)(yystack.valueAt (5))));
                                                                    yyval = new ExplicitConstructorInvocation(expr,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 127: /* ExplicitConstructorInvocation: Primary DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 127)
    /* "src/main/resources/Java_16_Grammar.y":574  */
                                                                  { yyval = new ExplicitConstructorInvocation(((tree.Expression.Expression)(yystack.valueAt (5))),((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 128: /* EnumDeclaration: ENUM IDENTIFIER ClassImplementsOpt EnumBody  */
  if (yyn == 128)
    /* "src/main/resources/Java_16_Grammar.y":580  */
                                                                     { yyval = new EnumDeclaration(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((EnumBody)(yystack.valueAt (0)))); };
  break;


  case 129: /* EnumBody: LBRACE EnumConstantListOpt EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 129)
    /* "src/main/resources/Java_16_Grammar.y":584  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (2))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 130: /* EnumBody: LBRACE EnumConstantListOpt COMMA EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 130)
    /* "src/main/resources/Java_16_Grammar.y":585  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (3))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 131: /* EnumConstantListOpt: %empty  */
  if (yyn == 131)
    /* "src/main/resources/Java_16_Grammar.y":589  */
                         { yyval = null; };
  break;


  case 132: /* EnumConstantListOpt: EnumConstantList  */
  if (yyn == 132)
    /* "src/main/resources/Java_16_Grammar.y":590  */
                         { yyval = ((Enumerators)(yystack.valueAt (0))); };
  break;


  case 133: /* EnumConstantList: EnumConstant  */
  if (yyn == 133)
    /* "src/main/resources/Java_16_Grammar.y":594  */
                                          { yyval = new Enumerators(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 134: /* EnumConstantList: EnumConstantList COMMA EnumConstant  */
  if (yyn == 134)
    /* "src/main/resources/Java_16_Grammar.y":595  */
                                          { yyval = ((Enumerators)(yystack.valueAt (2))).add(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 135: /* EnumConstant: AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 135)
    /* "src/main/resources/Java_16_Grammar.y":599  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 136: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments  */
  if (yyn == 136)
    /* "src/main/resources/Java_16_Grammar.y":600  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0))),null); };
  break;


  case 137: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments ClassBody  */
  if (yyn == 137)
    /* "src/main/resources/Java_16_Grammar.y":601  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (3))),((Token)(yystack.valueAt (2))),((tree.Expression.ArgumentList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 138: /* EnumBodyDeclarationsOpt: %empty  */
  if (yyn == 138)
    /* "src/main/resources/Java_16_Grammar.y":605  */
                                        { yyval = null; };
  break;


  case 139: /* EnumBodyDeclarationsOpt: SEMICOLON  */
  if (yyn == 139)
    /* "src/main/resources/Java_16_Grammar.y":606  */
                                        { yyval = null; };
  break;


  case 140: /* EnumBodyDeclarationsOpt: SEMICOLON ClassBodyDeclarationSeq  */
  if (yyn == 140)
    /* "src/main/resources/Java_16_Grammar.y":607  */
                                        { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 141: /* RecordDeclaration: RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody  */
  if (yyn == 141)
    /* "src/main/resources/Java_16_Grammar.y":613  */
                                                                                                        { yyval = null; };
  break;


  case 154: /* FieldDeclaration: UnannotatedType VariableDeclaratorList SEMICOLON  */
  if (yyn == 154)
    /* "src/main/resources/Java_16_Grammar.y":650  */
                                                  { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 155: /* VariableDeclaratorList: VariableDeclarator  */
  if (yyn == 155)
    /* "src/main/resources/Java_16_Grammar.y":654  */
                                                      { yyval = new VariableDeclarators(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 156: /* VariableDeclaratorList: VariableDeclaratorList COMMA VariableDeclarator  */
  if (yyn == 156)
    /* "src/main/resources/Java_16_Grammar.y":655  */
                                                      { yyval = ((VariableDeclarators)(yystack.valueAt (2))).add(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 157: /* VariableDeclarator: IDENTIFIER  */
  if (yyn == 157)
    /* "src/main/resources/Java_16_Grammar.y":659  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 158: /* VariableDeclarator: IDENTIFIER EQUAL Expression  */
  if (yyn == 158)
    /* "src/main/resources/Java_16_Grammar.y":660  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (2))),null,new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0))))); };
  break;


  case 159: /* VariableDeclarator: IDENTIFIER Dims  */
  if (yyn == 159)
    /* "src/main/resources/Java_16_Grammar.y":661  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),null); };
  break;


  case 160: /* VariableDeclarator: IDENTIFIER Dims EQUAL ArrayInitializer  */
  if (yyn == 160)
    /* "src/main/resources/Java_16_Grammar.y":662  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2))),((InitializerArray)(yystack.valueAt (0)))); };
  break;


  case 161: /* ArrayInitializer: LBRACE VariableInitializerListOpt RBRACE  */
  if (yyn == 161)
    /* "src/main/resources/Java_16_Grammar.y":666  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (1))); };
  break;


  case 162: /* ArrayInitializer: LBRACE VariableInitializerListOpt COMMA RBRACE  */
  if (yyn == 162)
    /* "src/main/resources/Java_16_Grammar.y":667  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (2))); };
  break;


  case 163: /* VariableInitializerListOpt: %empty  */
  if (yyn == 163)
    /* "src/main/resources/Java_16_Grammar.y":671  */
                                { yyval = null; };
  break;


  case 164: /* VariableInitializerListOpt: VariableInitializerList  */
  if (yyn == 164)
    /* "src/main/resources/Java_16_Grammar.y":672  */
                                { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 165: /* VariableInitializerList: VariableInitializer  */
  if (yyn == 165)
    /* "src/main/resources/Java_16_Grammar.y":676  */
                                                        { yyval = new InitializerArray(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 166: /* VariableInitializerList: VariableInitializerList COMMA VariableInitializer  */
  if (yyn == 166)
    /* "src/main/resources/Java_16_Grammar.y":677  */
                                                        { yyval = ((InitializerArray)(yystack.valueAt (2))).add(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 167: /* VariableInitializer: Expression  */
  if (yyn == 167)
    /* "src/main/resources/Java_16_Grammar.y":681  */
                        { yyval = new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 168: /* VariableInitializer: ArrayInitializer  */
  if (yyn == 168)
    /* "src/main/resources/Java_16_Grammar.y":682  */
                        { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 169: /* MethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 169)
    /* "src/main/resources/Java_16_Grammar.y":688  */
                              { yyval = new MethodDeclaration(((MethodHeader)(yystack.valueAt (1))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 170: /* MethodHeader: TypeParameters Type MethodDeclarator ThrowsOpt  */
  if (yyn == 170)
    /* "src/main/resources/Java_16_Grammar.y":698  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 171: /* MethodHeader: TypeParameters AnnotationSeq VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 171)
    /* "src/main/resources/Java_16_Grammar.y":699  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (4))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 172: /* MethodHeader: TypeParameters UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 172)
    /* "src/main/resources/Java_16_Grammar.y":700  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 173: /* MethodHeader: TypeParameters VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 173)
    /* "src/main/resources/Java_16_Grammar.y":701  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 174: /* MethodHeader: UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 174)
    /* "src/main/resources/Java_16_Grammar.y":702  */
                                                                              { yyval = new MethodHeader(null,((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 175: /* MethodHeader: VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 175)
    /* "src/main/resources/Java_16_Grammar.y":703  */
                                                                              { yyval = new MethodHeader(null,null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 176: /* MethodDeclarator: IDENTIFIER LPAREN RPAREN DimsOpt  */
  if (yyn == 176)
    /* "src/main/resources/Java_16_Grammar.y":712  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (3))),null,((Dims)(yystack.valueAt (0)))); };
  break;


  case 177: /* MethodDeclarator: IDENTIFIER LPAREN FormalParameterList RPAREN DimsOpt  */
  if (yyn == 177)
    /* "src/main/resources/Java_16_Grammar.y":713  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (2))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 178: /* FormalParameterList: FormalParameter  */
  if (yyn == 178)
    /* "src/main/resources/Java_16_Grammar.y":727  */
                                                { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 179: /* FormalParameterList: FormalParameterList COMMA FormalParameter  */
  if (yyn == 179)
    /* "src/main/resources/Java_16_Grammar.y":728  */
                                                { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0))));};
  break;


  case 180: /* FormalParameter: ModifierSeq UnannotatedType FormalParameterTail  */
  if (yyn == 180)
    /* "src/main/resources/Java_16_Grammar.y":732  */
                                                      { yyval = ParameterDeclaration.create(((Modifiers)(yystack.valueAt (2))),((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 181: /* FormalParameter: UnannotatedType FormalParameterTail  */
  if (yyn == 181)
    /* "src/main/resources/Java_16_Grammar.y":733  */
                                                      { yyval = ParameterDeclaration.create(null,((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 182: /* FormalParameterTail: IDENTIFIER DimsOpt  */
  if (yyn == 182)
    /* "src/main/resources/Java_16_Grammar.y":737  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),false,false); };
  break;


  case 183: /* FormalParameterTail: AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 183)
    /* "src/main/resources/Java_16_Grammar.y":738  */
                                                   { yyval = new ParameterTail(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (0))),null,true,false); };
  break;


  case 184: /* FormalParameterTail: THIS  */
  if (yyn == 184)
    /* "src/main/resources/Java_16_Grammar.y":739  */
                                                   { yyval = new ParameterTail(null,null,null,false,true); };
  break;


  case 185: /* FormalParameterTail: IDENTIFIER DOT THIS  */
  if (yyn == 185)
    /* "src/main/resources/Java_16_Grammar.y":740  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (2))),null,false,true); };
  break;


  case 186: /* ThrowsOpt: %empty  */
  if (yyn == 186)
    /* "src/main/resources/Java_16_Grammar.y":752  */
                             { yyval = null; };
  break;


  case 187: /* ThrowsOpt: THROWS ClassTypeList1  */
  if (yyn == 187)
    /* "src/main/resources/Java_16_Grammar.y":753  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 188: /* MethodBody: Block  */
  if (yyn == 188)
    /* "src/main/resources/Java_16_Grammar.y":757  */
                   { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 189: /* MethodBody: SEMICOLON  */
  if (yyn == 189)
    /* "src/main/resources/Java_16_Grammar.y":758  */
                   { yyval = null; };
  break;


  case 190: /* DimsOpt: %empty  */
  if (yyn == 190)
    /* "src/main/resources/Java_16_Grammar.y":764  */
                 { yyval = null; };
  break;


  case 191: /* DimsOpt: Dims  */
  if (yyn == 191)
    /* "src/main/resources/Java_16_Grammar.y":765  */
                 { yyval = ((Dims)(yystack.valueAt (0))); };
  break;


  case 192: /* Dims: Dim  */
  if (yyn == 192)
    /* "src/main/resources/Java_16_Grammar.y":769  */
                { yyval = new Dims(((Dim)(yystack.valueAt (0)))); };
  break;


  case 193: /* Dims: Dims Dim  */
  if (yyn == 193)
    /* "src/main/resources/Java_16_Grammar.y":770  */
                { yyval = ((Dims)(yystack.valueAt (1))).add(((Dim)(yystack.valueAt (0)))); };
  break;


  case 194: /* Dim: AnnotationSeq LBRACKET RBRACKET  */
  if (yyn == 194)
    /* "src/main/resources/Java_16_Grammar.y":774  */
                                      { yyval = new Dim(((Annotations)(yystack.valueAt (2)))); };
  break;


  case 195: /* Dim: LBRACKET RBRACKET  */
  if (yyn == 195)
    /* "src/main/resources/Java_16_Grammar.y":775  */
                                      { yyval = new Dim(null); };
  break;


  case 196: /* InterfaceDeclaration: NormalInterfaceDeclaration  */
  if (yyn == 196)
    /* "src/main/resources/Java_16_Grammar.y":781  */
                                      { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 197: /* InterfaceDeclaration: AnnotationInterfaceDeclaration  */
  if (yyn == 197)
    /* "src/main/resources/Java_16_Grammar.y":782  */
                                      { yyval = null; };
  break;


  case 198: /* NormalInterfaceDeclaration: INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody  */
  if (yyn == 198)
    /* "src/main/resources/Java_16_Grammar.y":787  */
                                         { yyval = new NormalInterfaceDeclaration(((Token)(yystack.valueAt (3))),((TypeParameters)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 199: /* InterfaceExtendsOpt: %empty  */
  if (yyn == 199)
    /* "src/main/resources/Java_16_Grammar.y":791  */
                        { yyval = null; };
  break;


  case 200: /* InterfaceExtendsOpt: InterfaceExtends  */
  if (yyn == 200)
    /* "src/main/resources/Java_16_Grammar.y":792  */
                        { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 201: /* InterfaceExtends: EXTENDS Type  */
  if (yyn == 201)
    /* "src/main/resources/Java_16_Grammar.y":796  */
                                   { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 202: /* InterfaceExtends: InterfaceExtends COMMA Type  */
  if (yyn == 202)
    /* "src/main/resources/Java_16_Grammar.y":797  */
                                   { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 203: /* InterfaceBody: LBRACE RBRACE  */
  if (yyn == 203)
    /* "src/main/resources/Java_16_Grammar.y":801  */
                                                  { yyval = null; };
  break;


  case 204: /* InterfaceBody: LBRACE InterfaceMemberDeclarationSeq RBRACE  */
  if (yyn == 204)
    /* "src/main/resources/Java_16_Grammar.y":802  */
                                                  { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 205: /* InterfaceMemberDeclarationSeq: ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 205)
    /* "src/main/resources/Java_16_Grammar.y":806  */
                                                                              { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 206: /* InterfaceMemberDeclarationSeq: InterfaceMemberDeclarationSeq ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 206)
    /* "src/main/resources/Java_16_Grammar.y":807  */
                                                                              { yyval = ((Declarations)(yystack.valueAt (2))).add(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 207: /* InterfaceMemberDeclaration: ConstantDeclaration  */
  if (yyn == 207)
    /* "src/main/resources/Java_16_Grammar.y":811  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 208: /* InterfaceMemberDeclaration: InterfaceMethodDeclaration  */
  if (yyn == 208)
    /* "src/main/resources/Java_16_Grammar.y":812  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 209: /* InterfaceMemberDeclaration: ClassDeclaration  */
  if (yyn == 209)
    /* "src/main/resources/Java_16_Grammar.y":813  */
                                  { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 210: /* InterfaceMemberDeclaration: InterfaceDeclaration  */
  if (yyn == 210)
    /* "src/main/resources/Java_16_Grammar.y":814  */
                                  { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 211: /* ConstantDeclaration: Type VariableDeclaratorList SEMICOLON  */
  if (yyn == 211)
    /* "src/main/resources/Java_16_Grammar.y":818  */
                                            { yyval = new TypeAndDeclarators(((tree.Type.Type)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 212: /* InterfaceMethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 212)
    /* "src/main/resources/Java_16_Grammar.y":822  */
                              { yyval = null; };
  break;


  case 213: /* AnnotationInterfaceDeclaration: AT INTERFACE IDENTIFIER AnnotationInterfaceBody  */
  if (yyn == 213)
    /* "src/main/resources/Java_16_Grammar.y":826  */
                                                      { yyval = null; };
  break;


  case 225: /* Block: LBRACE RBRACE  */
  if (yyn == 225)
    /* "src/main/resources/Java_16_Grammar.y":859  */
                                        { yyval = null; };
  break;


  case 226: /* Block: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 226)
    /* "src/main/resources/Java_16_Grammar.y":860  */
                                        { yyval = new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1)))); };
  break;


  case 227: /* BlockStatementSeq: BlockStatement  */
  if (yyn == 227)
    /* "src/main/resources/Java_16_Grammar.y":864  */
                                           { yyval = new BlockStatements(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 228: /* BlockStatementSeq: BlockStatementSeq BlockStatement  */
  if (yyn == 228)
    /* "src/main/resources/Java_16_Grammar.y":865  */
                                       { yyval = ((tree.Statement.BlockStatements)(yystack.valueAt (1))).add(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 229: /* BlockStatement: ModifierSeqOpt ClassDeclaration  */
  if (yyn == 229)
    /* "src/main/resources/Java_16_Grammar.y":881  */
                                                { yyval = new BlockStatement(((ClassDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 230: /* BlockStatement: ModifierSeqOpt NormalInterfaceDeclaration  */
  if (yyn == 230)
    /* "src/main/resources/Java_16_Grammar.y":882  */
                                                { yyval = new BlockStatement(((InterfaceDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 231: /* BlockStatement: ModifierSeqOpt LocalVariableDeclaration SEMICOLON  */
  if (yyn == 231)
    /* "src/main/resources/Java_16_Grammar.y":884  */
                                                { yyval = new BlockStatement(((tree.Declaration.Declaration)(yystack.valueAt (1))).addModifiers(((Modifiers)(yystack.valueAt (2))))); };
  break;


  case 232: /* BlockStatement: Statement  */
  if (yyn == 232)
    /* "src/main/resources/Java_16_Grammar.y":885  */
                                                { yyval = new BlockStatement(((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 233: /* LocalVariableDeclaration: UnannotatedType VariableDeclaratorList  */
  if (yyn == 233)
    /* "src/main/resources/Java_16_Grammar.y":889  */
                                             { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (1))),((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 234: /* LocalVariableDeclaration: VAR VariableDeclaratorList  */
  if (yyn == 234)
    /* "src/main/resources/Java_16_Grammar.y":890  */
                                             { yyval = new TypeAndDeclarators(null,((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 240: /* SimpleStatement: Block  */
  if (yyn == 240)
    /* "src/main/resources/Java_16_Grammar.y":902  */
                                        { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 241: /* SimpleStatement: SEMICOLON  */
  if (yyn == 241)
    /* "src/main/resources/Java_16_Grammar.y":903  */
                                            { yyval = null; };
  break;


  case 242: /* SimpleStatement: StatementExpression SEMICOLON  */
  if (yyn == 242)
    /* "src/main/resources/Java_16_Grammar.y":904  */
                                        { yyval = ((StatementExpression)(yystack.valueAt (1))); };
  break;


  case 243: /* SimpleStatement: ASSERT Expression SEMICOLON  */
  if (yyn == 243)
    /* "src/main/resources/Java_16_Grammar.y":906  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (1))),null); };
  break;


  case 244: /* SimpleStatement: ASSERT Expression COLON Expression SEMICOLON  */
  if (yyn == 244)
    /* "src/main/resources/Java_16_Grammar.y":907  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 245: /* SimpleStatement: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 245)
    /* "src/main/resources/Java_16_Grammar.y":909  */
                                                   { yyval = null; };
  break;


  case 246: /* SimpleStatement: DO Statement WHILE LPAREN Expression RPAREN SEMICOLON  */
  if (yyn == 246)
    /* "src/main/resources/Java_16_Grammar.y":910  */
                                                            { yyval = new Do(null,((tree.Statement.Statement)(yystack.valueAt (5))),((tree.Expression.Expression)(yystack.valueAt (2)))); };
  break;


  case 247: /* SimpleStatement: BREAK SEMICOLON  */
  if (yyn == 247)
    /* "src/main/resources/Java_16_Grammar.y":912  */
                                  { yyval = new Break(null,null); };
  break;


  case 248: /* SimpleStatement: BREAK IDENTIFIER SEMICOLON  */
  if (yyn == 248)
    /* "src/main/resources/Java_16_Grammar.y":913  */
                                  { yyval = new Break(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 249: /* SimpleStatement: CONTINUE SEMICOLON  */
  if (yyn == 249)
    /* "src/main/resources/Java_16_Grammar.y":915  */
                                      { yyval = new Continue(null,null); };
  break;


  case 250: /* SimpleStatement: CONTINUE IDENTIFIER SEMICOLON  */
  if (yyn == 250)
    /* "src/main/resources/Java_16_Grammar.y":916  */
                                      { yyval = new Continue(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 251: /* SimpleStatement: RETURN SEMICOLON  */
  if (yyn == 251)
    /* "src/main/resources/Java_16_Grammar.y":918  */
                                      { yyval = new Return(null,null); };
  break;


  case 252: /* SimpleStatement: RETURN Expression SEMICOLON  */
  if (yyn == 252)
    /* "src/main/resources/Java_16_Grammar.y":919  */
                                      { yyval = new Return(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 253: /* SimpleStatement: SYNCHRONIZED LPAREN Expression RPAREN Block  */
  if (yyn == 253)
    /* "src/main/resources/Java_16_Grammar.y":921  */
                                                   { yyval = new Synchronized(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 254: /* SimpleStatement: THROW Expression SEMICOLON  */
  if (yyn == 254)
    /* "src/main/resources/Java_16_Grammar.y":923  */
                                  { yyval = new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 255: /* SimpleStatement: YIELD Expression SEMICOLON  */
  if (yyn == 255)
    /* "src/main/resources/Java_16_Grammar.y":924  */
                                  { yyval = new Yield(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 256: /* SimpleStatement: TRY Block Catches  */
  if (yyn == 256)
    /* "src/main/resources/Java_16_Grammar.y":927  */
                                   { yyval = null; };
  break;


  case 257: /* SimpleStatement: TRY Block Catches Finally  */
  if (yyn == 257)
    /* "src/main/resources/Java_16_Grammar.y":928  */
                                   { yyval = null; };
  break;


  case 258: /* SimpleStatement: TRY Block Finally  */
  if (yyn == 258)
    /* "src/main/resources/Java_16_Grammar.y":929  */
                                   { yyval = null; };
  break;


  case 259: /* SimpleStatement: TRY ResourceSpecification Block CatchesOpt FinallyOpt  */
  if (yyn == 259)
    /* "src/main/resources/Java_16_Grammar.y":931  */
                                   { yyval = null; };
  break;


  case 260: /* SimpleStatement: error SEMICOLON  */
  if (yyn == 260)
    /* "src/main/resources/Java_16_Grammar.y":932  */
                                   { yyval = null; };
  break;


  case 261: /* LabeledStatement: IDENTIFIER COLON Statement  */
  if (yyn == 261)
    /* "src/main/resources/Java_16_Grammar.y":936  */
                                 { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))).addLabel(((Token)(yystack.valueAt (2)))); };
  break;


  case 262: /* StatementExpression: Assignment  */
  if (yyn == 262)
    /* "src/main/resources/Java_16_Grammar.y":940  */
                                   { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 263: /* StatementExpression: PreIncrementExpression  */
  if (yyn == 263)
    /* "src/main/resources/Java_16_Grammar.y":941  */
                                   { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 264: /* StatementExpression: PreDecrementExpression  */
  if (yyn == 264)
    /* "src/main/resources/Java_16_Grammar.y":942  */
                                   { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 265: /* StatementExpression: PostIncrementExpression  */
  if (yyn == 265)
    /* "src/main/resources/Java_16_Grammar.y":943  */
                                   { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 266: /* StatementExpression: PostDecrementExpression  */
  if (yyn == 266)
    /* "src/main/resources/Java_16_Grammar.y":944  */
                                   { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 267: /* StatementExpression: MethodInvocation  */
  if (yyn == 267)
    /* "src/main/resources/Java_16_Grammar.y":945  */
                                   { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 268: /* StatementExpression: ClassInstanceCreationExpression  */
  if (yyn == 268)
    /* "src/main/resources/Java_16_Grammar.y":946  */
                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 269: /* IfThenElseStatement: IF LPAREN Expression RPAREN Statement ElsePartOpt  */
  if (yyn == 269)
    /* "src/main/resources/Java_16_Grammar.y":950  */
                                                        { yyval = new IfThenElse(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Statement.Statement)(yystack.valueAt (1))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 270: /* ElsePartOpt: %empty  */
  if (yyn == 270)
    /* "src/main/resources/Java_16_Grammar.y":954  */
                      { yyval = null; };
  break;


  case 271: /* ElsePartOpt: ELSE Statement  */
  if (yyn == 271)
    /* "src/main/resources/Java_16_Grammar.y":955  */
                      { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 272: /* SwitchBlock: LBRACE SwitchRuleSeq RBRACE  */
  if (yyn == 272)
    /* "src/main/resources/Java_16_Grammar.y":959  */
                                                                   { yyval = null; };
  break;


  case 273: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeqOpt RBRACE  */
  if (yyn == 273)
    /* "src/main/resources/Java_16_Grammar.y":960  */
                                                                   { yyval = null; };
  break;


  case 274: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeqOpt SwitchLabelSeq RBRACE  */
  if (yyn == 274)
    /* "src/main/resources/Java_16_Grammar.y":961  */
                                                                   { yyval = null; };
  break;


  case 275: /* SwitchRuleSeq: SwitchRule  */
  if (yyn == 275)
    /* "src/main/resources/Java_16_Grammar.y":965  */
                               { yyval = new SwitchRules(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 276: /* SwitchRuleSeq: SwitchRuleSeq SwitchRule  */
  if (yyn == 276)
    /* "src/main/resources/Java_16_Grammar.y":966  */
                               { yyval = ((SwitchRules)(yystack.valueAt (1))).add(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 277: /* SwitchRule: SwitchLabel ARROW Expression SEMICOLON  */
  if (yyn == 277)
    /* "src/main/resources/Java_16_Grammar.y":970  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 278: /* SwitchRule: SwitchLabel ARROW Block  */
  if (yyn == 278)
    /* "src/main/resources/Java_16_Grammar.y":971  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 279: /* SwitchRule: SwitchLabel ARROW THROW Expression SEMICOLON  */
  if (yyn == 279)
    /* "src/main/resources/Java_16_Grammar.y":972  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (4))),new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1))))); };
  break;


  case 285: /* SwitchLabelSeq: SwitchLabel COLON  */
  if (yyn == 285)
    /* "src/main/resources/Java_16_Grammar.y":987  */
                                       { yyval = new SwitchLabels(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 286: /* SwitchLabelSeq: SwitchLabelSeq SwitchLabel COLON  */
  if (yyn == 286)
    /* "src/main/resources/Java_16_Grammar.y":988  */
                                       { yyval = ((SwitchLabels)(yystack.valueAt (2))).add(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 287: /* SwitchLabel: CASE CaseExpressionList  */
  if (yyn == 287)
    /* "src/main/resources/Java_16_Grammar.y":992  */
                               { yyval = ((SwitchLabel)(yystack.valueAt (0))); };
  break;


  case 288: /* SwitchLabel: DEFAULT  */
  if (yyn == 288)
    /* "src/main/resources/Java_16_Grammar.y":993  */
                                   { yyval = null; };
  break;


  case 289: /* CaseExpressionList: AssignmentExpression  */
  if (yyn == 289)
    /* "src/main/resources/Java_16_Grammar.y":997  */
                                                    { yyval = new SwitchLabel(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 290: /* CaseExpressionList: CaseExpressionList COMMA AssignmentExpression  */
  if (yyn == 290)
    /* "src/main/resources/Java_16_Grammar.y":998  */
                                                    { yyval = ((SwitchLabel)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 291: /* WhileStatement: WHILE LPAREN Expression RPAREN Statement  */
  if (yyn == 291)
    /* "src/main/resources/Java_16_Grammar.y":1005  */
                                                { yyval = new While(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 292: /* ForStatement: BasicForStatement  */
  if (yyn == 292)
    /* "src/main/resources/Java_16_Grammar.y":1009  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 293: /* ForStatement: EnhancedForStatement  */
  if (yyn == 293)
    /* "src/main/resources/Java_16_Grammar.y":1010  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 294: /* BasicForStatement: FOR LPAREN ForInitOpt SEMICOLON ExpressionOpt SEMICOLON StatementExpressionListOpt RPAREN Statement  */
  if (yyn == 294)
    /* "src/main/resources/Java_16_Grammar.y":1015  */
                          { yyval = null; };
  break;


  case 298: /* ExpressionOpt: %empty  */
  if (yyn == 298)
    /* "src/main/resources/Java_16_Grammar.y":1025  */
                  { yyval = null; };
  break;


  case 299: /* ExpressionOpt: Expression  */
  if (yyn == 299)
    /* "src/main/resources/Java_16_Grammar.y":1026  */
                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 300: /* StatementExpressionList: StatementExpression  */
  if (yyn == 300)
    /* "src/main/resources/Java_16_Grammar.y":1033  */
                                                        { yyval = ((StatementExpression)(yystack.valueAt (0))); };
  break;


  case 301: /* StatementExpressionList: StatementExpressionList COMMA StatementExpression  */
  if (yyn == 301)
    /* "src/main/resources/Java_16_Grammar.y":1034  */
                                                        { yyval = ((StatementExpressions)(yystack.valueAt (2))).add(((StatementExpression)(yystack.valueAt (0)))); };
  break;


  case 302: /* StatementExpressionListOpt: %empty  */
  if (yyn == 302)
    /* "src/main/resources/Java_16_Grammar.y":1038  */
                               { yyval = null; };
  break;


  case 303: /* StatementExpressionListOpt: StatementExpressionList  */
  if (yyn == 303)
    /* "src/main/resources/Java_16_Grammar.y":1039  */
                               { yyval = ((StatementExpressions)(yystack.valueAt (0))); };
  break;


  case 304: /* EnhancedForStatement: FOR LPAREN LocalVariableDeclaration COLON Expression RPAREN Statement  */
  if (yyn == 304)
    /* "src/main/resources/Java_16_Grammar.y":1043  */
                                                                            { yyval = null; };
  break;


  case 305: /* CatchesOpt: %empty  */
  if (yyn == 305)
    /* "src/main/resources/Java_16_Grammar.y":1047  */
               { yyval = null; };
  break;


  case 306: /* CatchesOpt: Catches  */
  if (yyn == 306)
    /* "src/main/resources/Java_16_Grammar.y":1048  */
               { yyval = ((CatchClauses)(yystack.valueAt (0))); };
  break;


  case 307: /* Catches: CatchClause  */
  if (yyn == 307)
    /* "src/main/resources/Java_16_Grammar.y":1052  */
                            { yyval = new CatchClauses(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 308: /* Catches: Catches CatchClause  */
  if (yyn == 308)
    /* "src/main/resources/Java_16_Grammar.y":1053  */
                            { yyval = ((CatchClauses)(yystack.valueAt (1))).add(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 309: /* CatchClause: CATCH LPAREN CatchFormalParameter RPAREN Block  */
  if (yyn == 309)
    /* "src/main/resources/Java_16_Grammar.y":1057  */
                                                     { yyval = new CatchClause(((CatchParameter)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 310: /* CatchFormalParameter: ModifierSeqOpt CatchType IDENTIFIER DimsOpt  */
  if (yyn == 310)
    /* "src/main/resources/Java_16_Grammar.y":1061  */
                                                  { yyval = new CatchParameter(((Modifiers)(yystack.valueAt (3))),((tree.Type.TypeList)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 311: /* CatchType: Type  */
  if (yyn == 311)
    /* "src/main/resources/Java_16_Grammar.y":1065  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 312: /* CatchType: CatchType VERTICAL Type  */
  if (yyn == 312)
    /* "src/main/resources/Java_16_Grammar.y":1066  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 323: /* Primary: Literal  */
  if (yyn == 323)
    /* "src/main/resources/Java_16_Grammar.y":1103  */
                                        { yyval = new Literal(((Token)(yystack.valueAt (0)))); };
  break;


  case 324: /* Primary: Type DimsOpt DOT CLASS  */
  if (yyn == 324)
    /* "src/main/resources/Java_16_Grammar.y":1104  */
                                        { yyval = new ClassLiteral(((tree.Type.Type)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2)))); };
  break;


  case 325: /* Primary: VOID DimsOpt DOT CLASS  */
  if (yyn == 325)
    /* "src/main/resources/Java_16_Grammar.y":1105  */
                                        { yyval = new ClassLiteral(null,((Dims)(yystack.valueAt (2)))); };
  break;


  case 326: /* Primary: THIS  */
  if (yyn == 326)
    /* "src/main/resources/Java_16_Grammar.y":1106  */
                                        { yyval = new This(null); };
  break;


  case 327: /* Primary: Type DOT THIS  */
  if (yyn == 327)
    /* "src/main/resources/Java_16_Grammar.y":1107  */
                                        { yyval = new This(((tree.Type.Type)(yystack.valueAt (2)))); };
  break;


  case 328: /* Primary: LPAREN Expression RPAREN  */
  if (yyn == 328)
    /* "src/main/resources/Java_16_Grammar.y":1108  */
                                        { yyval = new Parenthesized(((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 329: /* Primary: ClassInstanceCreationExpression  */
  if (yyn == 329)
    /* "src/main/resources/Java_16_Grammar.y":1109  */
                                        { yyval = null; };
  break;


  case 330: /* Primary: FieldAccess  */
  if (yyn == 330)
    /* "src/main/resources/Java_16_Grammar.y":1110  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 331: /* Primary: ArrayAccess  */
  if (yyn == 331)
    /* "src/main/resources/Java_16_Grammar.y":1111  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 332: /* Primary: MethodInvocation  */
  if (yyn == 332)
    /* "src/main/resources/Java_16_Grammar.y":1112  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 333: /* Primary: MethodReference  */
  if (yyn == 333)
    /* "src/main/resources/Java_16_Grammar.y":1113  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 334: /* Primary: ArrayCreationExpression  */
  if (yyn == 334)
    /* "src/main/resources/Java_16_Grammar.y":1114  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 335: /* ClassInstanceCreationExpression: UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 335)
    /* "src/main/resources/Java_16_Grammar.y":1124  */
                                                                  { yyval = null; };
  break;


  case 336: /* ClassInstanceCreationExpression: CompoundName DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 336)
    /* "src/main/resources/Java_16_Grammar.y":1125  */
                                                                  { yyval = null; };
  break;


  case 337: /* ClassInstanceCreationExpression: Primary DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 337)
    /* "src/main/resources/Java_16_Grammar.y":1126  */
                                                                  { yyval = null; };
  break;


  case 343: /* TypeArgumentsOpt: %empty  */
  if (yyn == 343)
    /* "src/main/resources/Java_16_Grammar.y":1144  */
                      { yyval = null; };
  break;


  case 344: /* TypeArgumentsOpt: TypeArguments  */
  if (yyn == 344)
    /* "src/main/resources/Java_16_Grammar.y":1145  */
                      { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (0))); };
  break;


  case 345: /* TypeArguments: LESS TypeArgumentList GREATER  */
  if (yyn == 345)
    /* "src/main/resources/Java_16_Grammar.y":1149  */
                                     { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (1))); };
  break;


  case 346: /* TypeArgumentList: TypeArgument  */
  if (yyn == 346)
    /* "src/main/resources/Java_16_Grammar.y":1153  */
                                           { yyval = new TypeArguments(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 347: /* TypeArgumentList: TypeArgumentList COMMA TypeArgument  */
  if (yyn == 347)
    /* "src/main/resources/Java_16_Grammar.y":1154  */
                                           { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (2))).add(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 348: /* TypeArgument: Type  */
  if (yyn == 348)
    /* "src/main/resources/Java_16_Grammar.y":1158  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),0,null); };
  break;


  case 349: /* TypeArgument: QUESTION  */
  if (yyn == 349)
    /* "src/main/resources/Java_16_Grammar.y":1159  */
                                               { yyval = new TypeArgument(null,1,null); };
  break;


  case 350: /* TypeArgument: QUESTION EXTENDS Type  */
  if (yyn == 350)
    /* "src/main/resources/Java_16_Grammar.y":1160  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),1,null); };
  break;


  case 351: /* TypeArgument: QUESTION SUPER Type  */
  if (yyn == 351)
    /* "src/main/resources/Java_16_Grammar.y":1161  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,null); };
  break;


  case 352: /* TypeArgument: AnnotationSeq QUESTION  */
  if (yyn == 352)
    /* "src/main/resources/Java_16_Grammar.y":1162  */
                                               { yyval = new TypeArgument(null,1,((Annotations)(yystack.valueAt (1)))); };
  break;


  case 353: /* TypeArgument: AnnotationSeq QUESTION EXTENDS Type  */
  if (yyn == 353)
    /* "src/main/resources/Java_16_Grammar.y":1163  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 354: /* TypeArgument: AnnotationSeq QUESTION SUPER Type  */
  if (yyn == 354)
    /* "src/main/resources/Java_16_Grammar.y":1164  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),3,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 355: /* FieldAccess: Primary DOT IDENTIFIER  */
  if (yyn == 355)
    /* "src/main/resources/Java_16_Grammar.y":1174  */
                                             { yyval = new FieldAccess(((tree.Expression.Expression)(yystack.valueAt (2))),  false,((Token)(yystack.valueAt (0)))); };
  break;


  case 356: /* FieldAccess: SUPER DOT IDENTIFIER  */
  if (yyn == 356)
    /* "src/main/resources/Java_16_Grammar.y":1175  */
                                             { yyval = new FieldAccess(null,true, ((Token)(yystack.valueAt (0)))); };
  break;


  case 357: /* FieldAccess: CompoundName DOT SUPER DOT IDENTIFIER  */
  if (yyn == 357)
    /* "src/main/resources/Java_16_Grammar.y":1176  */
                                             { yyval = new FieldAccess(new SimpleReference(((CompoundName)(yystack.valueAt (4)))),true,((Token)(yystack.valueAt (0)))); };
  break;


  case 358: /* ArrayAccess: CompoundName LBRACKET Expression RBRACKET  */
  if (yyn == 358)
    /* "src/main/resources/Java_16_Grammar.y":1180  */
                                                 { yyval = new ArrayAccess(new SimpleReference(((CompoundName)(yystack.valueAt (3)))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 359: /* ArrayAccess: Primary LBRACKET Expression RBRACKET  */
  if (yyn == 359)
    /* "src/main/resources/Java_16_Grammar.y":1181  */
                                                 { yyval = new ArrayAccess(((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 360: /* MethodInvocation: CompoundName Arguments  */
  if (yyn == 360)
    /* "src/main/resources/Java_16_Grammar.y":1185  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (1))));
                                                                         yyval = new MethodInvocation(ref,false,null,null,((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 361: /* MethodInvocation: CompoundName DOT TypeArguments IDENTIFIER Arguments  */
  if (yyn == 361)
    /* "src/main/resources/Java_16_Grammar.y":1187  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (4))));
                                                                         yyval = new MethodInvocation(ref,false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 362: /* MethodInvocation: Primary DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 362)
    /* "src/main/resources/Java_16_Grammar.y":1189  */
                                                                       { yyval = new MethodInvocation(((tree.Expression.Expression)(yystack.valueAt (4))),false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 363: /* MethodInvocation: SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 363)
    /* "src/main/resources/Java_16_Grammar.y":1190  */
                                                                       { yyval = new MethodInvocation(null,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 364: /* MethodInvocation: CompoundName DOT SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 364)
    /* "src/main/resources/Java_16_Grammar.y":1191  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (6))));
                                                                         yyval = new MethodInvocation(ref,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 365: /* Arguments: LPAREN RPAREN  */
  if (yyn == 365)
    /* "src/main/resources/Java_16_Grammar.y":1196  */
                                 { yyval = null; };
  break;


  case 366: /* Arguments: LPAREN ArgumentList RPAREN  */
  if (yyn == 366)
    /* "src/main/resources/Java_16_Grammar.y":1197  */
                                 { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (1))); };
  break;


  case 367: /* ArgumentList: Expression  */
  if (yyn == 367)
    /* "src/main/resources/Java_16_Grammar.y":1206  */
                                    { yyval = new ArgumentList(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 368: /* ArgumentList: ArgumentList COMMA Expression  */
  if (yyn == 368)
    /* "src/main/resources/Java_16_Grammar.y":1207  */
                                    { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 369: /* MethodReference: Primary DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 369)
    /* "src/main/resources/Java_16_Grammar.y":1212  */
                                                           { yyval = null; };
  break;


  case 370: /* MethodReference: Type DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 370)
    /* "src/main/resources/Java_16_Grammar.y":1213  */
                                                           { yyval = null; };
  break;


  case 371: /* MethodReference: SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 371)
    /* "src/main/resources/Java_16_Grammar.y":1214  */
                                                           { yyval = null; };
  break;


  case 372: /* MethodReference: Type DOT SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 372)
    /* "src/main/resources/Java_16_Grammar.y":1215  */
                                                           { yyval = null; };
  break;


  case 373: /* MethodReference: Type DBL_COLON TypeArgumentsOpt NEW  */
  if (yyn == 373)
    /* "src/main/resources/Java_16_Grammar.y":1216  */
                                                           { yyval = null; };
  break;


  case 374: /* ArrayCreationExpression: NEW Type DimExprs DimsOpt  */
  if (yyn == 374)
    /* "src/main/resources/Java_16_Grammar.y":1220  */
                                       { yyval = null; };
  break;


  case 375: /* ArrayCreationExpression: NEW Type Dims ArrayInitializer  */
  if (yyn == 375)
    /* "src/main/resources/Java_16_Grammar.y":1221  */
                                       { yyval = null; };
  break;


  case 380: /* Expression: LambdaExpression  */
  if (yyn == 380)
    /* "src/main/resources/Java_16_Grammar.y":1237  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 381: /* Expression: AssignmentExpression  */
  if (yyn == 381)
    /* "src/main/resources/Java_16_Grammar.y":1238  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 382: /* LambdaExpression: IDENTIFIER ARROW Expression  */
  if (yyn == 382)
    /* "src/main/resources/Java_16_Grammar.y":1243  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 383: /* LambdaExpression: IDENTIFIER ARROW Block  */
  if (yyn == 383)
    /* "src/main/resources/Java_16_Grammar.y":1245  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 384: /* LambdaExpression: LambdaParameters ARROW Expression  */
  if (yyn == 384)
    /* "src/main/resources/Java_16_Grammar.y":1246  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 385: /* LambdaExpression: LambdaParameters ARROW Block  */
  if (yyn == 385)
    /* "src/main/resources/Java_16_Grammar.y":1247  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 386: /* LambdaParameters: LPAREN RPAREN  */
  if (yyn == 386)
    /* "src/main/resources/Java_16_Grammar.y":1256  */
                                           { yyval = null; };
  break;


  case 387: /* LambdaParameters: LPAREN LambdaParameterList1 RPAREN  */
  if (yyn == 387)
    /* "src/main/resources/Java_16_Grammar.y":1257  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 388: /* LambdaParameters: LPAREN LambdaParameterList2 RPAREN  */
  if (yyn == 388)
    /* "src/main/resources/Java_16_Grammar.y":1258  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 389: /* LambdaParameterList1: IDENTIFIER  */
  if (yyn == 389)
    /* "src/main/resources/Java_16_Grammar.y":1263  */
                                             { yyval = new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 390: /* LambdaParameterList1: LambdaParameterList1 COMMA IDENTIFIER  */
  if (yyn == 390)
    /* "src/main/resources/Java_16_Grammar.y":1264  */
                                             { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 391: /* LambdaParameterList2: LambdaParameter  */
  if (yyn == 391)
    /* "src/main/resources/Java_16_Grammar.y":1268  */
                                                 { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 392: /* LambdaParameterList2: LambdaParameterList2 COMMA LambdaParameter  */
  if (yyn == 392)
    /* "src/main/resources/Java_16_Grammar.y":1269  */
                                                 { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 393: /* LambdaParameter: ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt  */
  if (yyn == 393)
    /* "src/main/resources/Java_16_Grammar.y":1280  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 394: /* LambdaParameter: ModifierSeqOpt VAR IDENTIFIER DimsOpt  */
  if (yyn == 394)
    /* "src/main/resources/Java_16_Grammar.y":1281  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),null,((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 395: /* LambdaParameter: ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 395)
    /* "src/main/resources/Java_16_Grammar.y":1283  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (4))),((tree.Type.UnannotatedType)(yystack.valueAt (3))),((Token)(yystack.valueAt (0))).image,((Annotations)(yystack.valueAt (2))),true,null); };
  break;


  case 396: /* AssignmentExpression: ConditionalExpression  */
  if (yyn == 396)
    /* "src/main/resources/Java_16_Grammar.y":1292  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 397: /* AssignmentExpression: Assignment  */
  if (yyn == 397)
    /* "src/main/resources/Java_16_Grammar.y":1293  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 398: /* Assignment: LeftHandSide AssignmentOperator Expression  */
  if (yyn == 398)
    /* "src/main/resources/Java_16_Grammar.y":1297  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 399: /* LeftHandSide: CompoundName  */
  if (yyn == 399)
    /* "src/main/resources/Java_16_Grammar.y":1301  */
                   { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 400: /* LeftHandSide: FieldAccess  */
  if (yyn == 400)
    /* "src/main/resources/Java_16_Grammar.y":1302  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 401: /* LeftHandSide: ArrayAccess  */
  if (yyn == 401)
    /* "src/main/resources/Java_16_Grammar.y":1303  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 402: /* AssignmentOperator: EQUAL  */
  if (yyn == 402)
    /* "src/main/resources/Java_16_Grammar.y":1307  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 403: /* AssignmentOperator: STAR_EQUAL  */
  if (yyn == 403)
    /* "src/main/resources/Java_16_Grammar.y":1308  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 404: /* AssignmentOperator: SLASH_EQUAL  */
  if (yyn == 404)
    /* "src/main/resources/Java_16_Grammar.y":1309  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 405: /* AssignmentOperator: PERCENT_EQUAL  */
  if (yyn == 405)
    /* "src/main/resources/Java_16_Grammar.y":1310  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 406: /* AssignmentOperator: PLUS_EQUAL  */
  if (yyn == 406)
    /* "src/main/resources/Java_16_Grammar.y":1311  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 407: /* AssignmentOperator: MINUS_EQUAL  */
  if (yyn == 407)
    /* "src/main/resources/Java_16_Grammar.y":1312  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 408: /* AssignmentOperator: LESS_LESS_EQUAL  */
  if (yyn == 408)
    /* "src/main/resources/Java_16_Grammar.y":1313  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 409: /* AssignmentOperator: GR_GR_EQUAL  */
  if (yyn == 409)
    /* "src/main/resources/Java_16_Grammar.y":1314  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 410: /* AssignmentOperator: GR_GR_GR_EQUAL  */
  if (yyn == 410)
    /* "src/main/resources/Java_16_Grammar.y":1315  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 411: /* AssignmentOperator: AMP_EQUAL  */
  if (yyn == 411)
    /* "src/main/resources/Java_16_Grammar.y":1316  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 412: /* AssignmentOperator: CARET_EQUAL  */
  if (yyn == 412)
    /* "src/main/resources/Java_16_Grammar.y":1317  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 413: /* AssignmentOperator: VERTICAL_EQUAL  */
  if (yyn == 413)
    /* "src/main/resources/Java_16_Grammar.y":1318  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 414: /* ConditionalExpression: ConditionalOrExpression ConditionalOrTail  */
  if (yyn == 414)
    /* "src/main/resources/Java_16_Grammar.y":1322  */
                                                { if ( ((tree.Expression.Binary)(yystack.valueAt (0))) == null ) yyval = ((tree.Expression.Expression)(yystack.valueAt (1)));
                                                  else              yyval = new Conditional(((tree.Expression.Expression)(yystack.valueAt (1))),((tree.Expression.Binary)(yystack.valueAt (0))).left,((tree.Expression.Binary)(yystack.valueAt (0))).right); };
  break;


  case 415: /* ConditionalOrTail: %empty  */
  if (yyn == 415)
    /* "src/main/resources/Java_16_Grammar.y":1327  */
                                                       { yyval = null; };
  break;


  case 416: /* ConditionalOrTail: QUESTION Expression COLON ConditionalExpression  */
  if (yyn == 416)
    /* "src/main/resources/Java_16_Grammar.y":1328  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 417: /* ConditionalOrTail: QUESTION Expression COLON LambdaExpression  */
  if (yyn == 417)
    /* "src/main/resources/Java_16_Grammar.y":1329  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 418: /* ConditionalOrExpression: ConditionalAndExpression  */
  if (yyn == 418)
    /* "src/main/resources/Java_16_Grammar.y":1333  */
                                                                    { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 419: /* ConditionalOrExpression: ConditionalOrExpression DBL_VERTICAL ConditionalAndExpression  */
  if (yyn == 419)
    /* "src/main/resources/Java_16_Grammar.y":1334  */
                                                                    { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 420: /* ConditionalAndExpression: InclusiveOrExpression  */
  if (yyn == 420)
    /* "src/main/resources/Java_16_Grammar.y":1338  */
                                                                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 421: /* ConditionalAndExpression: ConditionalAndExpression DBL_AMPERSAND InclusiveOrExpression  */
  if (yyn == 421)
    /* "src/main/resources/Java_16_Grammar.y":1339  */
                                                                   { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 422: /* InclusiveOrExpression: ExclusiveOrExpression  */
  if (yyn == 422)
    /* "src/main/resources/Java_16_Grammar.y":1343  */
                                                           { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 423: /* InclusiveOrExpression: InclusiveOrExpression VERTICAL ExclusiveOrExpression  */
  if (yyn == 423)
    /* "src/main/resources/Java_16_Grammar.y":1344  */
                                                           { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 424: /* ExclusiveOrExpression: AndExpression  */
  if (yyn == 424)
    /* "src/main/resources/Java_16_Grammar.y":1348  */
                                                { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 425: /* ExclusiveOrExpression: ExclusiveOrExpression CARET AndExpression  */
  if (yyn == 425)
    /* "src/main/resources/Java_16_Grammar.y":1349  */
                                                { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 426: /* AndExpression: EqualityExpression  */
  if (yyn == 426)
    /* "src/main/resources/Java_16_Grammar.y":1353  */
                                                 { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 427: /* AndExpression: AndExpression AMPERSAND EqualityExpression  */
  if (yyn == 427)
    /* "src/main/resources/Java_16_Grammar.y":1354  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 428: /* EqualityExpression: RelationalExpression  */
  if (yyn == 428)
    /* "src/main/resources/Java_16_Grammar.y":1358  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 429: /* EqualityExpression: EqualityExpression DBL_EQUAL RelationalExpression  */
  if (yyn == 429)
    /* "src/main/resources/Java_16_Grammar.y":1359  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 430: /* EqualityExpression: EqualityExpression NON_EQUAL RelationalExpression  */
  if (yyn == 430)
    /* "src/main/resources/Java_16_Grammar.y":1360  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 431: /* RelationalExpression: ShiftExpression  */
  if (yyn == 431)
    /* "src/main/resources/Java_16_Grammar.y":1364  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 432: /* RelationalExpression: RelationalExpression LESS ShiftExpression  */
  if (yyn == 432)
    /* "src/main/resources/Java_16_Grammar.y":1365  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 433: /* RelationalExpression: RelationalExpression GREATER ShiftExpression  */
  if (yyn == 433)
    /* "src/main/resources/Java_16_Grammar.y":1366  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 434: /* RelationalExpression: RelationalExpression LESS_EQUAL ShiftExpression  */
  if (yyn == 434)
    /* "src/main/resources/Java_16_Grammar.y":1367  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 435: /* RelationalExpression: RelationalExpression GREATER_EQUAL ShiftExpression  */
  if (yyn == 435)
    /* "src/main/resources/Java_16_Grammar.y":1368  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 436: /* RelationalExpression: InstanceofExpression  */
  if (yyn == 436)
    /* "src/main/resources/Java_16_Grammar.y":1369  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 437: /* InstanceofExpression: RelationalExpression INSTANCEOF Type  */
  if (yyn == 437)
    /* "src/main/resources/Java_16_Grammar.y":1373  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 438: /* InstanceofExpression: RelationalExpression INSTANCEOF Pattern  */
  if (yyn == 438)
    /* "src/main/resources/Java_16_Grammar.y":1374  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 439: /* ShiftExpression: AdditiveExpression  */
  if (yyn == 439)
    /* "src/main/resources/Java_16_Grammar.y":1378  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 440: /* ShiftExpression: ShiftExpression DBL_LESS AdditiveExpression  */
  if (yyn == 440)
    /* "src/main/resources/Java_16_Grammar.y":1379  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 441: /* ShiftExpression: ShiftExpression DBL_GREATER AdditiveExpression  */
  if (yyn == 441)
    /* "src/main/resources/Java_16_Grammar.y":1380  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 442: /* ShiftExpression: ShiftExpression TRIPL_GREATER AdditiveExpression  */
  if (yyn == 442)
    /* "src/main/resources/Java_16_Grammar.y":1381  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 443: /* AdditiveExpression: MultiplicativeExpression  */
  if (yyn == 443)
    /* "src/main/resources/Java_16_Grammar.y":1385  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 444: /* AdditiveExpression: AdditiveExpression PLUS MultiplicativeExpression  */
  if (yyn == 444)
    /* "src/main/resources/Java_16_Grammar.y":1386  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 445: /* AdditiveExpression: AdditiveExpression MINUS MultiplicativeExpression  */
  if (yyn == 445)
    /* "src/main/resources/Java_16_Grammar.y":1387  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 446: /* MultiplicativeExpression: UnaryExpression  */
  if (yyn == 446)
    /* "src/main/resources/Java_16_Grammar.y":1391  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 447: /* MultiplicativeExpression: MultiplicativeExpression STAR UnaryExpression  */
  if (yyn == 447)
    /* "src/main/resources/Java_16_Grammar.y":1392  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 448: /* MultiplicativeExpression: MultiplicativeExpression SLASH UnaryExpression  */
  if (yyn == 448)
    /* "src/main/resources/Java_16_Grammar.y":1393  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 449: /* MultiplicativeExpression: MultiplicativeExpression PERCENT UnaryExpression  */
  if (yyn == 449)
    /* "src/main/resources/Java_16_Grammar.y":1394  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 450: /* UnaryExpression: PreIncrementExpression  */
  if (yyn == 450)
    /* "src/main/resources/Java_16_Grammar.y":1398  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 451: /* UnaryExpression: PreDecrementExpression  */
  if (yyn == 451)
    /* "src/main/resources/Java_16_Grammar.y":1399  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 452: /* UnaryExpression: PLUS UnaryExpression  */
  if (yyn == 452)
    /* "src/main/resources/Java_16_Grammar.y":1400  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 453: /* UnaryExpression: MINUS UnaryExpression  */
  if (yyn == 453)
    /* "src/main/resources/Java_16_Grammar.y":1401  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 454: /* UnaryExpression: UnaryExpressionNotPlusMinus  */
  if (yyn == 454)
    /* "src/main/resources/Java_16_Grammar.y":1402  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 455: /* PreIncrementExpression: DBL_PLUS UnaryExpression  */
  if (yyn == 455)
    /* "src/main/resources/Java_16_Grammar.y":1406  */
                               { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 456: /* PreDecrementExpression: DBL_MINUS UnaryExpression  */
  if (yyn == 456)
    /* "src/main/resources/Java_16_Grammar.y":1410  */
                                 { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 458: /* UnaryExpressionNotPlusMinus: TILDE UnaryExpression  */
  if (yyn == 458)
    /* "src/main/resources/Java_16_Grammar.y":1415  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 459: /* UnaryExpressionNotPlusMinus: EXCLAMATION UnaryExpression  */
  if (yyn == 459)
    /* "src/main/resources/Java_16_Grammar.y":1416  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 460: /* UnaryExpressionNotPlusMinus: CastExpression  */
  if (yyn == 460)
    /* "src/main/resources/Java_16_Grammar.y":1417  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 461: /* UnaryExpressionNotPlusMinus: SwitchExpression  */
  if (yyn == 461)
    /* "src/main/resources/Java_16_Grammar.y":1418  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 462: /* PostfixExpression: Primary  */
  if (yyn == 462)
    /* "src/main/resources/Java_16_Grammar.y":1422  */
                               { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 463: /* PostfixExpression: CompoundName  */
  if (yyn == 463)
    /* "src/main/resources/Java_16_Grammar.y":1423  */
                               { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 464: /* PostfixExpression: PostIncrementExpression  */
  if (yyn == 464)
    /* "src/main/resources/Java_16_Grammar.y":1424  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 465: /* PostfixExpression: PostDecrementExpression  */
  if (yyn == 465)
    /* "src/main/resources/Java_16_Grammar.y":1425  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 466: /* PostIncrementExpression: PostfixExpression DBL_PLUS  */
  if (yyn == 466)
    /* "src/main/resources/Java_16_Grammar.y":1429  */
                                 { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 467: /* PostDecrementExpression: PostfixExpression DBL_MINUS  */
  if (yyn == 467)
    /* "src/main/resources/Java_16_Grammar.y":1433  */
                                  { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 468: /* CastExpression: TargetType UnaryExpression  */
  if (yyn == 468)
    /* "src/main/resources/Java_16_Grammar.y":1437  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 469: /* CastExpression: TargetType LambdaExpression  */
  if (yyn == 469)
    /* "src/main/resources/Java_16_Grammar.y":1438  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 470: /* TargetType: LPAREN TypeList RPAREN  */
  if (yyn == 470)
    /* "src/main/resources/Java_16_Grammar.y":1442  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (1))); };
  break;


  case 471: /* TypeList: Type  */
  if (yyn == 471)
    /* "src/main/resources/Java_16_Grammar.y":1446  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 472: /* TypeList: TypeList AMPERSAND Type  */
  if (yyn == 472)
    /* "src/main/resources/Java_16_Grammar.y":1447  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 473: /* SwitchExpression: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 473)
    /* "src/main/resources/Java_16_Grammar.y":1451  */
                                                  { yyval = new SwitchExpression(((tree.Expression.Expression)(yystack.valueAt (2))),((SwitchBlock)(yystack.valueAt (0)))); };
  break;


  case 474: /* AnnotationSeqOpt: %empty  */
  if (yyn == 474)
    /* "src/main/resources/Java_16_Grammar.y":1463  */
                       { yyval = null; };
  break;


  case 475: /* AnnotationSeqOpt: AnnotationSeq  */
  if (yyn == 475)
    /* "src/main/resources/Java_16_Grammar.y":1464  */
                       { yyval = ((Annotations)(yystack.valueAt (0))); };
  break;


  case 476: /* AnnotationSeq: Annotation  */
  if (yyn == 476)
    /* "src/main/resources/Java_16_Grammar.y":1468  */
                                { yyval = new Annotations(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 477: /* AnnotationSeq: AnnotationSeq Annotation  */
  if (yyn == 477)
    /* "src/main/resources/Java_16_Grammar.y":1469  */
                                { yyval = ((Annotations)(yystack.valueAt (1))).add(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 478: /* Annotation: AT CompoundName  */
  if (yyn == 478)
    /* "src/main/resources/Java_16_Grammar.y":1473  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (0))),(AnnoParameterList)null); };
  break;


  case 479: /* Annotation: AT CompoundName LPAREN RPAREN  */
  if (yyn == 479)
    /* "src/main/resources/Java_16_Grammar.y":1474  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (2))),(AnnoParameterList)null); };
  break;


  case 480: /* Annotation: AT CompoundName LPAREN AnnoParameterList RPAREN  */
  if (yyn == 480)
    /* "src/main/resources/Java_16_Grammar.y":1475  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),/*$4*/ (AnnoParameterList)null); };
  break;


  case 481: /* Annotation: AT CompoundName LPAREN ElementValue RPAREN  */
  if (yyn == 481)
    /* "src/main/resources/Java_16_Grammar.y":1476  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),(AnnoElementValue)null); };
  break;


  case 482: /* AnnoParameterList: IDENTIFIER EQUAL ElementValue  */
  if (yyn == 482)
    /* "src/main/resources/Java_16_Grammar.y":1480  */
                                                            { yyval = null; };
  break;


  case 483: /* AnnoParameterList: AnnoParameterList COMMA IDENTIFIER EQUAL ElementValue  */
  if (yyn == 483)
    /* "src/main/resources/Java_16_Grammar.y":1481  */
                                                            { yyval = null; };
  break;


  case 484: /* ElementValue: ConditionalExpression  */
  if (yyn == 484)
    /* "src/main/resources/Java_16_Grammar.y":1485  */
                                                 { yyval = null; };
  break;


  case 485: /* ElementValue: LBRACE ElementValueListOpt RBRACE  */
  if (yyn == 485)
    /* "src/main/resources/Java_16_Grammar.y":1486  */
                                                 { yyval = null; };
  break;


  case 486: /* ElementValue: LBRACE COMMA RBRACE  */
  if (yyn == 486)
    /* "src/main/resources/Java_16_Grammar.y":1487  */
                                                 { yyval = null; };
  break;


  case 487: /* ElementValue: Annotation  */
  if (yyn == 487)
    /* "src/main/resources/Java_16_Grammar.y":1488  */
                                                 { yyval = null; };
  break;



/* "src/main/java/parser/JavaParser.java":4182  */

        default: break;
      }

    yystack.pop(yylen);
    yylen = 0;
    /* Shift the result of the reduction.  */
    int yystate = yyLRGotoState(yystack.stateAt(0), yyr1_[yyn]);
    yystack.push(yystate, yyval);
    return YYNEWSTATE;
  }




  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse() throws java.io.IOException

  {


    /* Lookahead token kind.  */
    int yychar = YYEMPTY_;
    /* Lookahead symbol kind.  */
    SymbolKind yytoken = null;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;



    /* Semantic value of the lookahead.  */
    Entity yylval = null;

    yyerrstatus_ = 0;
    yynerrs = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval);



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:

        /* Accept?  */
        if (yystate == YYFINAL_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyPactValueIsDefault (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == YYEMPTY_)
          {

            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal();

          }

        /* Convert token to internal form.  */
        yytoken = yytranslate_ (yychar);

        if (yytoken == SymbolKind.S_YYerror)
          {
            // The scanner already issued an error message, process directly
            // to error recovery.  But do not keep the error token as
            // lookahead, it is too special and may lead us to an endless
            // loop in error recovery. */
            yychar = Lexer.YYUNDEF;
            yytoken = SymbolKind.S_YYUNDEF;
            label = YYERRLAB1;
          }
        else
          {
            /* If the proper action on seeing token YYTOKEN is to reduce or to
               detect an error, take that action.  */
            yyn += yytoken.getCode();
            if (yyn < 0 || YYLAST_ < yyn || yycheck_[yyn] != yytoken.getCode())
              label = YYDEFAULT;

            /* <= 0 means reduce or error.  */
            else if ((yyn = yytable_[yyn]) <= 0)
              {
                if (yyTableValueIsError (yyn))
                  label = YYERRLAB;
                else
                  {
                    yyn = -yyn;
                    label = YYREDUCE;
                  }
              }

            else
              {
                /* Shift the lookahead token.  */
                /* Discard the token being shifted.  */
                yychar = YYEMPTY_;

                /* Count tokens shifted since error; after three, turn off error
                   status.  */
                if (yyerrstatus_ > 0)
                  --yyerrstatus_;

                yystate = yyn;
                yystack.push (yystate, yylval);
                label = YYNEWSTATE;
              }
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction(yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs;
            if (yychar == YYEMPTY_)
              yytoken = null;
            yyreportSyntaxError (new Context (yystack, yytoken));
          }

        if (yyerrstatus_ == 3)
          {
            /* If just tried and failed to reuse lookahead token after an
               error, discard it.  */

            if (yychar <= Lexer.YYEOF)
              {
                /* Return failure if at end of input.  */
                if (yychar == Lexer.YYEOF)
                  return false;
              }
            else
              yychar = YYEMPTY_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        // Pop stack until we find a state that shifts the error token.
        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yyPactValueIsDefault (yyn))
              {
                yyn += SymbolKind.S_YYerror.getCode();
                if (0 <= yyn && yyn <= YYLAST_
                    && yycheck_[yyn] == SymbolKind.S_YYerror.getCode())
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;


            yystack.pop ();
            yystate = yystack.stateAt (0);
          }

        if (label == YYABORT)
          /* Leave the switch.  */
          break;



        /* Shift the error token.  */

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  /**
   * Information needed to get the list of expected tokens and to forge
   * a syntax error diagnostic.
   */
  public static final class Context
  {
    Context (YYStack stack, SymbolKind token)
    {
      yystack = stack;
      yytoken = token;
    }

    private YYStack yystack;


    /**
     * The symbol kind of the lookahead token.
     */
    public final SymbolKind getToken ()
    {
      return yytoken;
    }

    private SymbolKind yytoken;
    static final int NTOKENS = JavaParser.YYNTOKENS_;

    /**
     * Put in YYARG at most YYARGN of the expected tokens given the
     * current YYCTX, and return the number of tokens stored in YYARG.  If
     * YYARG is null, return the number of expected tokens (guaranteed to
     * be less than YYNTOKENS).
     */
    int getExpectedTokens (SymbolKind yyarg[], int yyargn)
    {
      return getExpectedTokens (yyarg, 0, yyargn);
    }

    int getExpectedTokens (SymbolKind yyarg[], int yyoffset, int yyargn)
    {
      int yycount = yyoffset;
      int yyn = yypact_[this.yystack.stateAt (0)];
      if (!yyPactValueIsDefault (yyn))
        {
          /* Start YYX at -YYN if negative to avoid negative
             indexes in YYCHECK.  In other words, skip the first
             -YYN actions for this state because they are default
             actions.  */
          int yyxbegin = yyn < 0 ? -yyn : 0;
          /* Stay within bounds of both yycheck and yytname.  */
          int yychecklim = YYLAST_ - yyn + 1;
          int yyxend = yychecklim < NTOKENS ? yychecklim : NTOKENS;
          for (int yyx = yyxbegin; yyx < yyxend; ++yyx)
            if (yycheck_[yyx + yyn] == yyx && yyx != SymbolKind.S_YYerror.getCode()
                && !yyTableValueIsError(yytable_[yyx + yyn]))
              {
                if (yyarg == null)
                  yycount += 1;
                else if (yycount == yyargn)
                  return 0; // FIXME: this is incorrect.
                else
                  yyarg[yycount++] = SymbolKind.get(yyx);
              }
        }
      if (yyarg != null && yycount == yyoffset && yyoffset < yyargn)
        yyarg[yycount] = null;
      return yycount - yyoffset;
    }
  }


  private int yysyntaxErrorArguments (Context yyctx, SymbolKind[] yyarg, int yyargn)
  {
    /* There are many possibilities here to consider:
       - If this state is a consistent state with a default action,
         then the only way this function was invoked is if the
         default action is an error action.  In that case, don't
         check for expected tokens because there are none.
       - The only way there can be no lookahead present (in tok) is
         if this state is a consistent state with a default action.
         Thus, detecting the absence of a lookahead is sufficient to
         determine that there is no unexpected or expected token to
         report.  In that case, just report a simple "syntax error".
       - Don't assume there isn't a lookahead just because this
         state is a consistent state with a default action.  There
         might have been a previous inconsistent state, consistent
         state with a non-default action, or user semantic action
         that manipulated yychar.  (However, yychar is currently out
         of scope during semantic actions.)
       - Of course, the expected token list depends on states to
         have correct lookahead information, and it depends on the
         parser not to perform extra reductions after fetching a
         lookahead from the scanner and before detecting a syntax
         error.  Thus, state merging (from LALR or IELR) and default
         reductions corrupt the expected token list.  However, the
         list is correct for canonical LR with one exception: it
         will still contain any token that will not be accepted due
         to an error action in a later state.
    */
    int yycount = 0;
    if (yyctx.getToken() != null)
      {
        if (yyarg != null)
          yyarg[yycount] = yyctx.getToken();
        yycount += 1;
        yycount += yyctx.getExpectedTokens(yyarg, 1, yyargn);
      }
    return yycount;
  }


  /**
   * Build and emit a "syntax error" message in a user-defined way.
   *
   * @param ctx  The context of the error.
   */
  private void yyreportSyntaxError(Context yyctx) {
      if (yyErrorVerbose) {
          final int argmax = 5;
          SymbolKind[] yyarg = new SymbolKind[argmax];
          int yycount = yysyntaxErrorArguments(yyctx, yyarg, argmax);
          String[] yystr = new String[yycount];
          for (int yyi = 0; yyi < yycount; ++yyi) {
              yystr[yyi] = yyarg[yyi].getName();
          }
          String yyformat;
          switch (yycount) {
              default:
              case 0: yyformat = "syntax error"; break;
              case 1: yyformat = "syntax error, unexpected {0}"; break;
              case 2: yyformat = "syntax error, unexpected {0}, expecting {1}"; break;
              case 3: yyformat = "syntax error, unexpected {0}, expecting {1} or {2}"; break;
              case 4: yyformat = "syntax error, unexpected {0}, expecting {1} or {2} or {3}"; break;
              case 5: yyformat = "syntax error, unexpected {0}, expecting {1} or {2} or {3} or {4}"; break;
          }
          yyerror(new MessageFormat(yyformat).format(yystr));
      } else {
          yyerror("syntax error");
      }
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yyPactValueIsDefault (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yyTableValueIsError (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final short yypact_ninf_ = -709;
  private static final short yytable_ninf_ = -488;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
     400,    33,  -709,  -709,  -709,    -3,  -709,    33,  -709,  -709,
    -709,  -709,  -709,  -709,  -709,  -709,   -10,  -709,   950,  -709,
     242,  -709,  -709,   512,  -709,  -709,  1706,  -709,  -709,   263,
      33,   387,   559,    33,  -709,  -709,   185,  -709,  1161,   950,
    -709,  3039,   103,   563,   166,  -709,   191,   437,   237,   306,
     322,   326,   370,  -709,  -709,  -709,  -709,  -709,  -709,  -709,
    -709,   185,  3699,  -709,  3105,  3765,  3765,  3765,  3765,  3765,
    3765,   435,  -709,  -709,  -709,  -709,  -709,  -709,  -709,  -709,
    -709,  -709,  -709,  -709,  4307,  -709,  -709,   332,   464,  -709,
    -709,   312,  -709,   462,   381,   312,  -709,   496,  -709,  -709,
    -709,  -709,  -709,  -709,  -709,  -709,    46,   423,   470,   471,
     498,   372,   155,  -709,   391,   587,   440,  -709,  -709,  -709,
    -709,   572,  -709,  -709,  -709,  3699,  -709,  1452,   413,   401,
     540,  -709,   175,  -709,   544,   908,   439,   511,   532,   509,
     532,   532,  -709,  2927,   590,  4484,   381,  1996,  2228,   621,
    -709,   603,  -709,  -709,  2344,  -709,    70,   628,  -709,   354,
    -709,  -709,  -709,  -709,  -709,  -709,  3237,  2880,   238,   333,
     578,  -709,   160,   617,  3699,   631,   637,   312,  -709,   336,
    3303,  3699,    61,  -709,  -709,   432,   617,   640,  -709,  3699,
      41,   617,  3699,  3765,  -709,  3765,  3765,  3765,  3765,  3765,
    3765,  3765,  3765,  3765,  3765,   627,  3765,  3765,  3765,  3765,
    3765,  3765,  3765,  3765,  -709,  -709,  -709,  -709,   312,  -709,
     596,  -709,   642,  -709,  -709,  1281,   172,    33,    33,    33,
      33,   648,   439,  -709,   655,    59,   593,  -709,  1452,   657,
     594,   660,  -709,    66,  1659,   469,   475,  -709,  4303,  3369,
    -709,  3369,  -709,  -709,  -709,  -709,  -709,  -709,  -709,  -709,
    -709,  -709,  -709,  -709,  3699,  -709,  1452,  -709,  -709,  3237,
    -709,    -4,  -709,   366,  -709,  2891,  3435,   334,   333,  -709,
     377,   663,   239,   615,   578,  -709,   616,   618,   670,  -709,
     607,  -709,   671,  -709,   481,  -709,   675,   617,   676,  -709,
     635,   679,  -709,    14,   625,   688,  -709,  -709,   643,   645,
     685,   423,   470,   471,   498,   372,   155,   155,   391,   391,
     391,   391,   646,  -709,    63,  -709,  -709,   587,   587,   587,
     440,   440,  -709,  -709,  -709,   681,  -709,   595,   610,    33,
      26,    32,   611,    15,  -709,  -709,  1334,  -709,   638,   395,
    -709,  -709,    59,  1452,   509,  -709,   706,   215,  -709,  1452,
     711,   708,   307,   509,   672,   165,  -709,   673,  -709,  1706,
    2243,  -709,  -709,  -709,  -709,  -709,  -709,  -709,  1452,  1452,
    2880,  -709,    69,   721,  3501,  -709,  -709,  -709,  3567,   725,
     578,  -709,  -709,  -709,   663,  -709,   726,  -709,  -709,  -709,
    3699,  -709,   221,   663,   617,  -709,  -709,  -709,  -709,   663,
    -709,  3699,   279,   723,  -709,   723,  3237,  -709,  -709,   619,
    -709,    33,  -709,    33,  -709,    33,  -709,  1850,  1568,  1452,
      59,  -709,  -709,  -709,   725,  1452,   527,   724,  -709,   680,
    -709,  4208,  -709,  1452,   493,  -709,   250,   731,   312,   312,
     710,   336,  -709,  -709,   732,  3699,  -709,  -709,   734,  3699,
      62,    94,  2823,   741,   744,  3633,   746,   747,  3699,   545,
     750,  3699,  2080,  -709,  2359,  -709,  -709,  -709,  -709,   737,
    -709,  -709,  -709,  -709,  -709,   453,   478,  -709,  -709,  -709,
     572,   586,   592,  -709,  -709,  -709,  1452,  1452,  -709,  -709,
     536,   728,  -709,  -709,   743,  1517,  -709,  -709,   699,  -709,
     446,  -709,  -709,  -709,   702,  -709,   703,  -709,  -709,  -709,
    3699,   281,   646,  -709,  -709,   749,   543,   574,   581,    34,
     646,   174,  -709,  -709,  -709,  -709,  -709,  -709,  1850,  -709,
     751,   705,  1452,  -709,  -709,  -709,   758,  1579,   755,   578,
     663,  -709,  2991,  4247,  -709,  -709,   578,   220,  4088,  -709,
    -709,  -709,   707,  -709,  2823,   630,  -709,   759,  -709,   760,
     747,   659,  3827,  3699,  -709,   761,  3699,  3699,   764,  4011,
     240,   771,  3699,   766,    63,  -709,  -709,   769,  -709,  -709,
    -709,  -709,  -709,  -709,   777,  3501,  -709,  -709,  -709,   771,
    4358,  4127,  -709,  -709,  -709,  3765,  -709,    45,  -709,    80,
    -709,  1779,   309,   663,  -709,  -709,   779,  -709,    33,  -709,
    -709,  -709,   588,   782,  -709,  1452,  -709,   781,  4180,  -709,
    -709,   725,   733,   245,  -709,  1023,   415,  -709,  -709,  -709,
    -709,  -709,  2991,  -709,  -709,   762,  -709,  4396,  -709,  4219,
    -709,  -709,  -709,  -709,  3699,  -709,  -709,   788,   783,  -709,
     786,   785,   794,  -709,   798,   799,  -709,   364,  -709,   344,
    -709,   496,   385,   801,   771,   240,  -709,  -709,   739,   802,
    -709,  -709,  -709,  -709,  -709,   247,  -709,   752,  1023,  -709,
    -709,   701,  -709,  -709,   415,  -709,  -709,  -709,   815,  -709,
    -709,  -709,   805,  -709,  -709,  1895,   813,   814,  2011,   818,
    -709,  3171,  -709,  -709,   749,  -709,   827,  -709,  -709,  -709,
     831,   701,   701,   733,   733,   245,  1643,  -709,  -709,  -709,
    -709,   780,   833,  -709,  -709,   825,  3699,  3699,  3699,  3889,
    2823,   726,   771,  -709,  3951,  1706,  -709,  -709,  -709,   763,
     739,  2823,   280,   591,   837,  1452,   833,  -709,  3765,  -709,
    -709,  3699,  -709,   832,   312,  4067,  -709,  -709,   701,   701,
     701,   733,  -709,  2127,  -709,  -709,   838,   840,   834,  -709,
    -709,   773,  -709,  -709,  -709,  -709,  1452,   864,  -709,  -709,
    -709,  -709,  4303,   706,  -709,  -709,   858,  -709,   804,   312,
     250,    28,   513,  -709,  -709,  -709,  -709,   701,  -709,   522,
    2475,  2591,   500,   441,   860,  2823,  3889,  2823,  -709,  -709,
     131,   771,   524,  -709,  3237,   861,  -709,    28,   158,  -709,
    -709,   844,   312,  4303,  -709,    61,  -709,  2707,  -709,    41,
     663,   663,  -709,  -709,   785,   872,  -709,  1452,   312,  -709,
    -709,  -709,  -709,  -709,   772,  -709,   823,  -709,  -709,   778,
     635,  -709,     4,   868,   874,  2823,  -709,  -709,  -709,  -709,
     663,   663,  -709,  -709,  -709,   876,   878,  -709,  -709
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final short[] yydefact_ = yydefact_init();
  private static final short[] yydefact_init()
  {
    return new short[]
    {
      35,     0,    22,    17,    18,     0,    28,     0,    21,    20,
      19,    23,    24,    25,    26,    27,     0,    12,    13,    15,
       0,    30,    31,    11,    36,    37,     0,   476,     9,   478,
       0,     0,     0,     0,    16,     1,     0,    38,    11,    14,
     477,     0,     0,     0,     0,    39,    35,     0,     0,     0,
       0,     0,     0,    45,    47,    81,    82,    83,    48,   196,
     197,     0,     0,   479,   488,     0,     0,     0,     0,     0,
       0,     9,     2,     3,     6,     7,    80,    73,    77,    79,
       5,    78,    75,    76,     0,     8,    74,     0,     0,   326,
       4,   190,   323,   463,     0,    67,    69,   462,   329,   335,
     330,   331,   332,   333,   334,   484,   415,   418,   420,   422,
     424,   426,   428,   436,   431,   439,   443,   446,   450,   451,
     454,   457,   464,   465,   460,     0,   461,     0,   476,     0,
       0,    10,     0,    40,     0,    11,    49,     0,    85,    97,
      85,    85,    46,    11,     9,   463,   471,   330,   331,     0,
     380,     0,   381,   397,     0,   396,     0,     0,   489,     0,
     452,   453,   458,   459,   455,   456,     0,     0,    70,     0,
     474,   344,     0,   343,     0,     0,     0,   191,   192,     0,
       0,     0,     0,    71,   360,     0,   343,     0,    72,     0,
       0,   343,     0,     0,   414,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   466,   467,   469,   468,    68,   480,
       0,   481,     0,    41,    33,    11,    62,     0,     0,     0,
       0,     0,    50,    51,     0,     0,    95,    86,     0,     0,
     199,     0,   386,     9,     0,     0,     0,   391,     0,     0,
     328,     0,   402,   403,   404,   405,   406,   407,   408,   409,
     410,   411,   412,   413,     0,   470,     0,   486,   485,     0,
     482,   349,   348,     0,   346,     0,     0,     0,   190,   376,
       0,     0,   343,     0,   475,   356,     0,     0,     0,   195,
       0,   193,     0,   365,     0,   367,     0,   343,     0,   336,
       0,     0,   327,     0,     0,     0,   355,   337,     0,     0,
       0,   419,   421,   423,   425,   427,   429,   430,   432,   433,
     434,   435,     0,   437,    67,   322,   438,   440,   441,   442,
     444,   445,   447,   448,   449,     0,    42,    65,    63,     0,
       0,     0,     0,     0,    34,    52,    11,   213,    92,     0,
      88,    91,     0,     0,    97,    99,    98,   131,   128,     0,
       0,   200,   474,    97,     0,   474,   387,     0,   388,    11,
       0,   383,   382,   385,   384,   398,   472,   490,     0,     0,
       0,   345,   352,     0,   163,   375,   374,   377,     0,   103,
     474,   340,   339,   341,     0,   371,     0,   325,   194,   366,
       0,   358,     0,     0,   343,   370,   373,   324,   359,     0,
     369,     0,   157,   234,   155,   233,     0,    66,    64,     0,
      54,     0,    56,     0,    58,     0,   214,     0,    11,     0,
       0,    87,    90,    96,     0,     0,   138,   132,   133,     0,
     201,    11,   198,     0,     0,   144,     0,     0,   190,   190,
       0,   475,   390,   392,     0,     0,   225,   241,     9,     0,
       0,     0,     0,     0,     0,     0,     0,    25,     0,     0,
       0,     0,     0,   240,     0,   227,   232,   235,   236,     0,
     237,   238,   239,   292,   293,   329,   332,   262,   263,   264,
       0,   265,   266,   350,   351,   347,     0,     0,   378,   168,
       0,   164,   165,   167,     0,    11,   338,   104,     0,   363,
     280,   473,   368,   357,     0,   361,     0,   362,   417,   416,
       0,   159,     0,   483,    53,    60,     0,     0,     0,     0,
       0,     0,   220,   221,   219,   216,   218,   215,     0,   101,
      94,     0,     0,    89,    84,   100,   138,    11,     0,   474,
     135,   203,     0,    11,   202,   142,   474,   474,    11,   141,
     394,   393,     0,   260,     0,     0,   247,     0,   249,     0,
       0,     0,   295,     0,   251,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   229,   230,     0,   226,   228,
     242,   353,   354,   161,     0,     0,   379,   105,   112,    23,
       0,    11,   107,   110,   342,     0,   288,     0,   275,     0,
     281,     0,     0,     0,   372,   158,     0,   156,     0,    55,
      57,    59,     0,     0,   217,     0,    93,     0,    11,   129,
     134,   136,     0,     0,   209,     0,     0,   210,   205,   207,
     208,   204,     0,   145,   146,     0,   148,     0,   152,    11,
     150,   395,   261,   243,     0,   248,   250,     0,   297,   300,
       0,   296,     0,   252,     0,     0,   254,    70,   320,     0,
     318,     0,   330,     0,     0,   256,   307,   258,   305,     0,
     255,   231,   162,   166,   111,     0,   115,     0,     0,   109,
     117,   186,   113,   114,     0,   116,   106,   108,   287,   289,
     272,   276,     0,   273,   282,     0,     0,    17,     0,     0,
     285,     0,   364,   160,    61,   211,     0,   102,   130,   137,
       0,   186,   186,     0,     0,     0,     0,   189,   212,   188,
     206,     0,     9,   149,   151,     0,     0,     0,   298,     0,
       0,     0,     0,   316,     0,    11,   315,   308,   257,   313,
     306,     0,   157,     0,     0,     0,     0,   169,     0,   274,
     286,     0,   278,     0,   190,     0,   175,   174,   186,   186,
     186,     0,   147,     0,   153,   244,     0,     0,     0,   299,
     301,   270,   245,   253,   317,   319,     0,     0,   259,   314,
     291,   154,     0,   187,   118,   290,     0,   277,   223,   190,
       0,   474,     0,   178,   173,   170,   172,   186,   120,   399,
       0,     0,   462,     0,     0,     0,   302,     0,   269,   311,
       0,     0,     0,   279,     0,     0,   176,   474,   190,   184,
     181,     0,   190,     0,   171,     0,   121,     0,   122,   343,
       0,     0,   246,   304,   303,     0,   271,     0,   190,   309,
     119,   224,   222,   180,     0,   182,     0,   177,   179,     0,
     344,   123,     0,     0,     0,     0,   312,   310,   185,   183,
       0,     0,   125,   124,   294,     0,     0,   126,   127
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -709,  -709,   654,    18,  -708,   -14,   295,  -709,  -709,  -709,
     845,  -709,    24,  -709,   768,   829,  -709,  -709,   661,   180,
    -709,    23,   459,  -709,  -315,  -709,   386,  -521,  -709,   465,
     542,  -709,   -53,   141,  -709,  -709,  -412,   350,  -509,  -709,
    -709,  -709,   143,  -709,  -709,  -709,  -709,  -709,   352,   360,
    -709,  -709,  -709,   351,  -709,  -709,   260,  -709,  -313,   390,
    -272,  -709,  -709,   318,  -709,  -539,  -587,   123,    83,    90,
    -668,   224,    -9,  -165,   -45,  -316,   449,  -709,  -709,  -709,
    -709,   282,  -508,  -709,  -709,  -709,  -709,   389,  -709,  -709,
    -243,  -357,  -458,  -204,  -404,  -709,  -709,  -561,  -709,  -709,
     184,  -709,   321,  -709,   323,   324,  -480,  -709,  -709,  -709,
    -709,  -709,  -709,   114,  -709,  -709,  -709,   256,  -620,  -709,
    -709,  -709,  -627,  -709,  -709,   192,  -709,  -559,   426,  -163,
    -709,  -709,  -158,   -69,  -709,   555,    -2,   748,   606,  -247,
    -709,  -709,  -709,  -709,   662,   730,  -115,  -709,  -709,  -709,
     568,  -576,   745,  -709,  -709,   -38,  -709,  -709,   770,   767,
     742,   756,   774,   444,  -709,   231,   373,   447,   225,   754,
     790,  -709,   875,   938,   962,  -709,  -709,  -709,  -709,  -149,
       0,   -24,  -709,   -57,  -709
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short[] yydefgoto_ = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
      -1,    92,   145,   472,    17,    18,    19,    20,    21,    22,
      23,    24,    25,   224,    38,    53,   231,   232,   233,   526,
     339,    94,    95,    96,    54,    55,   687,   237,   349,   350,
     351,   354,   239,   356,   540,   506,   507,   601,   602,   689,
     690,   691,   774,   810,    56,   358,   436,   437,   438,   548,
      57,   363,   444,   445,   559,   649,   650,   692,   415,   414,
     499,   500,   501,   502,   693,   636,   722,   802,   803,   830,
     756,   728,   187,   177,   178,    58,    59,   360,   361,   442,
     553,   638,   534,   640,    60,   347,   428,   535,   536,   825,
     473,   708,   475,   668,   476,   477,   478,   479,   480,   818,
     511,   607,   608,   609,   610,   611,   709,   698,   481,   482,
     483,   660,   778,   661,   845,   484,   749,   675,   676,   787,
     820,   788,   677,   581,   669,   670,   326,    97,    98,    99,
     281,   282,   170,   171,   273,   274,   147,   148,   102,   184,
     294,   103,   104,   278,   279,   149,   150,   151,   245,   246,
     247,   152,   153,   154,   264,   155,   194,   106,   107,   108,
     109,   110,   111,   112,   113,   114,   115,   116,   117,   118,
     119,   120,   121,   122,   123,   124,   125,   156,   126,   439,
     127,    27,   129,   130,   159
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final short[] yytable_ = yytable_init();
  private static final short[] yytable_init()
  {
    return new short[]
    {
      26,   325,    40,   105,   277,   385,   371,   158,   373,   413,
     216,   659,    39,   474,   286,   287,   589,   128,    16,   299,
     671,   283,   544,    26,   183,    42,   105,   307,   303,   699,
     612,   635,   308,   309,   389,   175,    42,   420,    26,   100,
     128,    36,    42,   422,   639,   721,     1,    37,   748,   648,
     188,   700,    28,   766,   767,   747,    61,   800,   571,   409,
     167,   694,   100,   100,   100,   100,   100,   100,   100,   405,
     175,   378,   192,   566,   265,  -389,   183,     1,    33,   688,
     167,     1,   176,   828,   800,   146,   703,   266,    28,    28,
     249,   179,   697,   193,   179,   179,   306,    30,   379,   183,
     804,   805,   806,    40,   406,   568,   871,   169,   694,   270,
     605,   533,   532,   300,   348,   606,   131,   567,   412,   697,
     137,   635,   789,   100,   392,   800,   688,   702,   105,   706,
     747,   297,   291,   829,   639,    26,   768,   769,   770,   834,
     648,   425,   128,   248,   496,   605,   179,   509,   421,   569,
     606,   297,   847,    36,   423,    40,   515,   585,   131,    37,
     652,   244,   517,   298,   100,   175,   146,   275,   854,   280,
     284,   497,   175,   188,   201,   202,     1,   179,   780,   167,
     134,   175,   795,     1,   807,   671,   848,   203,   204,   222,
     272,   100,     1,   100,   100,   100,   100,   100,   100,   100,
     100,   100,   100,    48,   100,   100,   100,   100,   100,   100,
     100,   100,   377,   446,   812,   285,   450,   622,   179,   719,
     449,   131,   533,   532,    40,    26,   580,   175,   323,   623,
     131,   105,   291,     1,    39,   352,   637,   634,     1,   205,
     167,   508,    35,    61,   514,   128,   516,   521,    42,   390,
     589,    40,   175,    49,   175,   659,    40,   167,   167,    50,
      40,   355,   603,     1,   391,     1,    41,   100,   587,   386,
    -474,    51,   337,    42,     5,   644,   513,   179,   280,   188,
     541,   338,    52,   765,   695,   686,   175,   175,   175,   376,
     160,   161,   162,   163,   164,   165,   518,     1,     1,     1,
     720,   434,   752,   631,   603,    28,   673,   520,   520,   616,
     447,  -143,    76,    34,    77,   603,  -143,    78,   674,   175,
     188,   710,    79,   137,   179,     1,   637,   634,    40,    81,
       1,   695,   686,   711,    34,    82,   781,    83,   678,   384,
     276,   175,   172,   292,   713,   173,    26,   790,   743,    86,
     217,     1,     1,   589,     1,   744,   684,   284,   603,   523,
     268,   138,   284,   269,   427,   451,   712,   180,   658,    26,
     248,   181,   753,   519,   182,   380,   433,   139,   105,   589,
     275,   140,   440,   167,   388,   603,   381,   244,   175,  -321,
     284,   185,   128,   729,   186,     1,  -321,    44,    45,     1,
     -29,   493,   494,   272,   430,   219,   603,   446,   645,   100,
     220,   843,   179,   846,   100,   431,   811,  -487,     1,  -487,
     370,   199,  -487,   200,  -487,   141,   727,    40,    26,   542,
     352,   746,   318,   319,   320,   321,   332,   333,   334,   560,
     561,    26,   136,   206,   207,   208,   538,    42,   179,   179,
     530,   729,   539,   837,   211,   212,   213,  -268,   545,   552,
       2,   874,  -268,   166,  -268,   180,   554,   174,   762,   181,
       3,   195,   182,   366,   248,   -70,   291,     4,   367,   368,
     -70,   167,  -267,     5,   369,   399,   188,  -267,   -11,  -267,
     400,   196,     6,     7,     8,     9,    10,   555,   197,   783,
      11,    12,   556,   189,    13,    26,   190,   189,    14,   191,
     839,   605,   188,   191,    15,   198,   606,   832,    40,   591,
     592,   179,   833,   600,   236,   180,   240,   241,   850,   181,
       1,   179,   835,   833,   301,   -70,   546,   302,   547,   188,
     -70,   167,   593,   840,   221,   594,   841,    26,   579,   284,
     370,   235,   618,    26,   619,   223,   284,   451,    26,   226,
     227,   530,   228,   229,   230,   600,   234,  -463,  -463,    42,
      46,   642,     2,   132,   133,   530,   647,   672,   849,   327,
     328,   329,     3,   618,   179,   620,   218,   521,   188,     4,
     618,   238,   621,   863,   864,     5,     1,   522,   183,   715,
     522,    26,   791,   527,     6,   528,     8,     9,    10,   209,
     210,   248,    11,    12,   249,   813,    13,   214,   215,   600,
      14,    42,   424,   875,   876,   250,    15,   251,    26,    42,
     524,  -464,  -464,   179,   267,   726,   167,  -465,  -465,   289,
     188,   653,   654,   316,   317,     1,   600,   290,   717,    26,
     304,   335,   831,   336,   344,    29,   330,   331,   724,    31,
     346,    32,   357,   362,   324,   530,   180,   647,   353,   359,
     393,   394,   299,   395,   396,   397,   307,   859,   831,   398,
     188,   862,    28,   401,    43,   179,   402,    47,   726,    76,
     403,    77,   404,   407,    78,    93,   408,   411,   409,    79,
     410,   412,    40,   365,   417,   248,    81,   218,   248,   416,
     418,   724,    82,   429,    83,   435,   441,   443,    93,    93,
      93,    93,    93,    93,    93,   179,    86,   448,   452,   498,
     505,   510,   522,   549,   218,   550,   558,   595,   168,   322,
     183,   562,   672,   563,   572,    26,   564,   573,   590,   576,
     577,   596,   179,   582,   604,   798,   188,   613,   614,    42,
     626,   629,   651,   786,   179,    26,   860,   851,   625,   547,
     655,   656,   663,   248,   657,   666,   370,   680,   355,    93,
     681,   168,   188,   682,   384,   716,   105,   718,   720,   101,
     826,   736,    26,   731,   739,   737,   485,   738,   740,   179,
     128,   451,   741,   742,   745,   673,   751,   754,   755,   819,
     248,   248,   101,   101,   101,   101,   101,   101,   101,   855,
      93,   168,   100,   857,   758,   710,  -288,   451,   179,   711,
     760,   764,   179,    26,   765,   772,   775,   248,   773,   867,
     792,   674,   814,   797,   815,   816,   817,    93,   179,    93,
      93,    93,    93,    93,    93,    93,    93,    93,    93,   168,
      93,    93,    93,    93,    93,    93,    93,    93,   821,   823,
     866,   842,   852,   101,   824,   856,   865,   868,   869,   872,
     870,   340,   341,   342,   343,   873,   531,   877,   485,   878,
     142,   135,   168,   345,   432,   543,   793,   628,   168,   794,
     485,   630,   168,   225,   288,   557,   627,   643,   -43,   734,
     295,   296,   617,   683,   101,   822,   858,   853,   757,   305,
     168,   586,   310,    93,   730,   782,     1,   624,   701,   168,
     844,   584,   704,   705,   750,   495,   785,   453,   313,     0,
     387,   101,     0,   101,   101,   101,   101,   101,   101,   101,
     101,   101,   101,   314,   101,   101,   101,   101,   101,   101,
     101,   101,   312,   311,     0,     0,     0,     0,     2,     0,
       0,     0,   315,     0,     0,     0,   486,     0,     3,   372,
       0,   374,     0,     0,     0,     4,     0,     0,     0,     0,
     485,     5,     0,   419,   375,     0,     0,   531,   485,     0,
       6,   218,     8,     9,    10,     0,   383,   168,    11,    12,
       2,   633,    13,   168,     0,     0,    14,   101,     0,     0,
       3,     0,    15,     0,     0,     0,     0,     4,     0,     0,
       0,   324,   168,   168,   168,     0,     0,   485,   324,     0,
       0,     1,     6,     0,     8,     9,    10,     0,     0,     0,
      11,    12,     0,     0,    13,     0,     0,     0,    14,   685,
       0,     0,     0,     0,    15,    93,     0,     0,   486,     0,
      93,     0,     0,     0,     0,   525,     0,   525,    28,   525,
     486,   168,     0,   168,     0,    76,     0,    77,     0,   168,
      78,     0,     0,     0,   725,    79,     0,   168,     0,     0,
     168,   633,    81,     0,     0,     0,   685,     0,    82,     0,
      83,     0,     0,     0,   503,   487,     0,     0,   504,     0,
       0,     0,    86,     0,   488,     0,   168,     0,     0,     0,
     512,   485,     0,     0,   485,     0,   723,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   725,     0,     0,
     168,   168,     0,     0,     0,     0,     0,     0,     0,   101,
     489,   -32,     0,     0,   101,   485,   485,     0,     0,     0,
     486,     0,     0,     0,     0,     0,     0,   485,   486,     1,
       0,     0,     0,    29,     0,   218,     0,     0,     0,   565,
       0,     0,   168,     0,     0,   575,   168,     0,   578,   485,
       0,   583,     0,   324,     0,     0,   168,   487,     0,     0,
       0,     0,     0,     0,     0,     0,   488,   486,     0,   487,
       0,     2,     0,     0,   801,     0,     0,     0,   488,     0,
       0,     3,     0,   667,     0,     0,   485,   485,     4,     0,
       0,   485,   485,   485,     0,   490,     0,     0,     0,     0,
     615,   801,   489,     6,   168,     8,     9,    10,     0,   827,
       0,    11,    12,   485,   489,    13,     0,     0,     0,    14,
       0,     0,   714,     0,     0,    15,     0,     0,     0,   168,
       0,   -44,     0,     0,     0,     0,     0,     0,     0,   168,
       0,   485,   801,     0,     0,     0,   168,     0,     0,     1,
       0,   168,     0,   662,     0,     0,   664,   665,   491,   487,
       0,   486,   679,     0,   486,     0,     0,   487,   488,     0,
       0,     0,     0,     0,     0,   503,   488,   101,     0,     0,
       0,     0,   492,     0,     0,     0,     0,   490,     0,     0,
     426,     2,   168,     0,     0,   486,   486,     0,     0,   490,
       0,     3,     1,     0,   489,     0,   487,   486,     4,     0,
       0,     0,   489,     0,     0,   488,     0,     0,     0,     0,
       0,     0,     0,     6,     0,     8,     9,    10,     0,   486,
     168,    11,    12,     0,   735,    13,     0,     0,     0,    14,
       0,     0,     0,     0,     2,    15,     0,     0,   667,     0,
     491,   489,     0,     0,     3,     0,     0,     0,     0,   168,
       0,     4,   491,     0,     0,     0,   486,   486,     0,   168,
       0,   486,   486,   486,   492,     0,     6,   809,     8,     9,
      10,     0,     0,     0,    11,    12,   492,     0,    13,   490,
     168,   763,    14,   486,     0,     0,   168,   490,    15,     0,
     487,     0,     0,   487,   168,     0,     0,     0,     0,   488,
       0,     0,   488,     0,     0,     0,   776,   777,   779,     0,
       1,   486,     0,     0,     0,     0,     0,     0,    93,     0,
       0,     0,     0,     0,   487,   487,   490,   168,     0,     0,
       0,   796,   101,   488,   488,   489,   487,     0,   489,     0,
       0,   168,   491,     0,     0,   488,     0,    28,     0,     0,
     491,     0,     0,     0,    76,     0,    77,     0,   487,    78,
       0,     0,   370,   597,    79,     0,   492,   488,   598,   489,
     489,    81,     0,     0,   492,     1,     0,    82,     0,    83,
       0,   489,     0,     0,     0,     0,     0,     0,     0,   491,
       0,    86,     0,     0,     0,   487,   487,     0,     0,     0,
     487,   487,   487,   489,   488,   488,     0,     0,     0,   488,
     488,   488,   101,   492,   537,     0,     0,     2,     0,     0,
     490,     0,   487,   490,   370,  -139,     1,     3,     0,     0,
     598,   488,     0,     0,     4,     0,     0,     1,     0,     0,
     489,   489,     0,     0,     0,   489,   489,   489,     0,     6,
     487,     8,     9,    10,   490,   490,     0,   599,    12,   488,
       0,    13,     0,     0,     0,    14,   490,   489,     2,     0,
       0,    15,     0,     0,     0,     0,     0,     0,     3,     2,
       0,     0,     0,   491,     0,     4,   491,     0,   490,     3,
       0,     0,     0,     0,     0,   489,     4,     0,     0,     0,
       6,     1,     8,     9,    10,     0,     0,   492,    11,    12,
     492,     6,    13,     8,     9,    10,    14,   491,   491,   599,
      12,     0,    15,    13,     0,   490,   490,    14,     0,   491,
     490,   490,   490,    15,     0,     0,     0,     0,    28,     0,
       0,   492,   492,     0,     0,    76,     0,    77,     0,     0,
      78,   491,   490,   492,    28,    79,     0,     0,     0,     0,
       0,    76,    81,    77,     1,     0,    78,     0,    82,     0,
      83,    79,     0,     0,     0,   492,     0,     0,    81,     0,
     490,     0,    86,     0,    82,     0,    83,     0,   491,   491,
       0,     0,     0,   491,   491,   491,   771,     0,    86,     0,
       0,     0,     0,     0,     0,     0,     2,     0,     0,     0,
       0,   364,   492,   492,     0,   491,     3,   492,   492,   492,
     454,     0,   455,     4,   370,  -283,     0,     0,     0,     0,
     457,     0,     0,     0,     0,     0,     0,     1,     6,   492,
       8,     9,    10,   491,     0,     0,    11,    12,     0,     0,
      13,     0,     0,     0,    14,     0,     0,     0,     0,     0,
      15,     0,     0,     0,    69,    70,     0,   492,     0,     0,
       0,     0,     0,     0,   458,    72,    73,    74,    75,     2,
     459,    76,   460,    77,   605,     0,    78,   -11,   461,   707,
     462,    79,     0,   -11,     0,    80,     4,     0,    81,   463,
     464,     0,     0,     0,    82,   -11,    83,     0,   529,    84,
      85,     6,     0,     8,     9,    10,   -11,   465,    86,    11,
      12,    87,   466,   467,    89,   468,     0,    14,     0,    90,
     469,   -11,    91,    15,   470,   471,   454,     0,   455,     0,
     370,   759,     0,     0,     0,    28,   457,     0,     0,     0,
       0,     0,    76,     1,    77,     0,     0,    78,    49,     0,
       0,     0,    79,     0,    50,     0,     0,     0,     0,    81,
       0,     0,     0,     0,     0,    82,    51,    83,     0,     0,
      69,    70,     0,     0,     0,     0,     0,    52,     0,    86,
     458,    72,    73,    74,    75,     2,   459,    76,   460,    77,
     605,     0,    78,   -11,   461,   707,   462,    79,     0,   -11,
       0,    80,     4,     0,    81,   463,   464,     0,     0,     0,
      82,   -11,    83,     0,     0,    84,    85,     6,     0,     8,
       9,    10,   -11,   465,    86,    11,    12,    87,   466,   467,
      89,   468,     0,    14,     0,    90,   469,   -11,    91,    15,
     470,   471,   454,     0,   455,     0,   370,  -284,     0,     0,
       0,     0,   457,     0,  -400,     0,     0,     0,     0,     1,
    -400,  -400,  -400,  -400,  -400,  -400,  -400,  -400,  -400,  -400,
    -400,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    69,    70,     0,     0,
       0,     0,     0,     0,     0,     0,   458,    72,    73,    74,
      75,     2,   459,    76,   460,    77,  -284,     0,    78,   -11,
     461,     3,   462,    79,     0,   -11,     0,    80,     4,     0,
      81,   463,   464,     0,     0,     0,    82,   -11,    83,     0,
       0,    84,    85,     6,     0,     8,     9,    10,   -11,   465,
      86,    11,    12,    87,   466,   467,    89,   468,     0,    14,
       0,    90,   469,   -11,    91,    15,   470,   471,   454,     0,
     455,     0,   370,   808,     0,    28,     0,     0,   457,     0,
       0,     0,    76,     0,    77,     1,   167,    78,    49,     0,
       0,     0,    79,     0,    50,     0,     0,     0,     0,    81,
       0,     0,     0,     0,     0,    82,    51,    83,     0,     0,
       0,     0,    69,    70,     0,     0,     0,    52,     0,    86,
       0,     0,   458,    72,    73,    74,    75,     2,   459,    76,
     460,    77,   322,     0,    78,   -11,   461,     3,   462,    79,
       0,   -11,     0,    80,     4,     0,    81,   463,   464,     0,
       0,     0,    82,   -11,    83,     0,     0,    84,    85,     6,
       0,     8,     9,    10,   -11,   465,    86,    11,    12,    87,
     466,   467,    89,   468,     0,    14,     0,    90,   469,   -11,
      91,    15,   470,   471,   454,     0,   455,     0,   370,   456,
       0,     0,     0,     0,   457,     0,  -401,     0,     0,     0,
       0,     1,  -401,  -401,  -401,  -401,  -401,  -401,  -401,  -401,
    -401,  -401,  -401,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,    69,    70,
       0,     0,     0,     0,     0,     0,     0,     0,   458,    72,
      73,    74,    75,     2,   459,    76,   460,    77,     0,     0,
      78,   -11,   461,     3,   462,    79,     0,   -11,     0,    80,
       4,     0,    81,   463,   464,     0,     0,     0,    82,   -11,
      83,     0,     0,    84,    85,     6,     0,     8,     9,    10,
     -11,   465,    86,    11,    12,    87,   466,   467,    89,   468,
       0,    14,     0,    90,   469,   -11,    91,    15,   470,   471,
     454,     0,   455,     0,   370,   588,     0,     0,     0,     0,
     457,     0,   252,     0,     0,     0,     0,     1,   253,   254,
     255,   256,   257,   258,   259,   260,   261,   262,   263,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    69,    70,     0,     0,     0,     0,
       0,     0,     0,     0,   458,    72,    73,    74,    75,     2,
     459,    76,   460,    77,     0,     0,    78,   -11,   461,     3,
     462,    79,     0,   -11,     0,    80,     4,     0,    81,   463,
     464,     0,     0,     0,    82,   -11,    83,     0,     0,    84,
      85,     6,     0,     8,     9,    10,   -11,   465,    86,    11,
      12,    87,   466,   467,    89,   468,     0,    14,     0,    90,
     469,   -11,    91,    15,   470,   471,   454,     0,   455,     0,
     370,   836,     0,     0,     0,     0,   457,     0,     0,     0,
       0,     0,     0,     1,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
      69,    70,     0,     0,     0,     0,     0,     0,     0,     0,
     458,    72,    73,    74,    75,     2,   459,    76,   460,    77,
       0,     0,    78,   -11,   461,     3,   462,    79,     0,   -11,
       0,    80,     4,     0,    81,   463,   464,     0,     0,     0,
      82,   -11,    83,     0,     0,    84,    85,     6,     0,     8,
       9,    10,   -11,   465,    86,    11,    12,    87,   466,   467,
      89,   468,     0,    14,     0,    90,   469,   -11,    91,    15,
     470,   471,   454,     0,   455,     0,   370,   838,     0,     0,
       0,     0,   457,     0,     0,     0,     0,     0,     0,     1,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    69,    70,     0,     0,
       0,     0,     0,     0,     0,     0,   458,    72,    73,    74,
      75,     2,   459,    76,   460,    77,     0,     0,    78,   -11,
     461,     3,   462,    79,     0,   -11,     0,    80,     4,     0,
      81,   463,   464,     0,     0,     0,    82,   -11,    83,     0,
       0,    84,    85,     6,     0,     8,     9,    10,   -11,   465,
      86,    11,    12,    87,   466,   467,    89,   468,     0,    14,
       0,    90,   469,   -11,    91,    15,   470,   471,   454,     0,
     455,     0,   370,   861,     0,     0,     0,     0,   457,     0,
       0,     0,     0,     0,     0,     1,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    69,    70,     0,     0,     0,     0,     0,     0,
       0,     0,   458,    72,    73,    74,    75,     2,   459,    76,
     460,    77,     0,     0,    78,   -11,   461,     3,   462,    79,
       0,   -11,     0,    80,     4,     0,    81,   463,   464,     0,
       0,     0,    82,   -11,    83,     0,     0,    84,    85,     6,
       0,     8,     9,    10,   -11,   465,    86,    11,    12,    87,
     466,   467,    89,   468,     0,    14,     0,    90,   469,   -11,
      91,    15,   470,   471,   454,     0,   455,     0,   370,     0,
       0,     0,     0,     0,   457,     0,     0,     0,     0,     0,
       0,     1,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,    69,    70,
       0,     0,     0,     0,     0,     0,     0,     0,   458,    72,
      73,    74,    75,     0,   459,    76,   460,    77,     0,     0,
      78,     0,   461,     0,   462,    79,     0,     0,     1,    80,
       0,     0,    81,   463,   464,     0,   271,     0,    82,     1,
      83,     0,     0,    84,    85,     0,     0,   382,     0,     0,
       0,   465,    86,     0,     0,    87,   466,   570,    89,   468,
     143,   242,     0,    90,   469,    28,    91,     0,   470,   471,
       0,     0,    76,     0,    77,     1,    28,    78,     0,    65,
      66,     0,    79,    76,     0,    77,    67,    68,    78,    81,
       0,     0,     0,    79,     0,    82,     0,    83,     0,     0,
      81,     0,    69,    70,     0,     0,    82,     0,    83,    86,
       0,     0,   243,    72,    73,    74,    75,     2,     0,    76,
      86,    77,     0,     0,    78,     0,     0,     3,     0,    79,
       0,     0,     0,    80,     4,     0,    81,     0,     0,   529,
     235,     0,    82,     0,    83,     0,     0,    84,    85,     6,
       0,     8,     9,    10,     0,     0,    86,    11,    12,    87,
      88,    13,    89,     0,     0,    14,     0,    90,     0,     0,
      91,    15,    62,    63,    64,     0,    28,     0,     0,     0,
       0,     0,     0,    76,     0,    77,     0,     1,    78,    49,
       0,    65,    66,    79,     0,    50,     0,     0,    67,    68,
      81,     0,     0,     0,     0,     0,    82,    51,    83,     0,
       0,     0,     0,     0,    69,    70,     0,     0,    52,     0,
      86,     0,     0,     0,    71,    72,    73,    74,    75,     0,
       0,    76,     0,    77,   632,     0,    78,     0,    62,     0,
      64,    79,     0,     0,   157,    80,     0,     0,    81,     0,
       0,     0,     0,     1,    82,     0,    83,    65,    66,    84,
      85,     0,     0,     0,    67,    68,     0,     0,    86,     0,
       0,    87,    88,     0,    89,     0,     0,     0,     0,    90,
      69,    70,    91,     0,     0,     0,     0,     0,     0,     0,
      28,    72,    73,    74,    75,     0,     0,    76,     0,    77,
       0,     0,    78,     0,   143,     0,   370,    79,     0,     0,
       0,    80,     0,     0,    81,     0,     0,     0,     0,     1,
      82,     0,    83,    65,    66,    84,    85,     0,     0,     0,
      67,    68,     0,     0,    86,     0,     0,    87,    88,     0,
      89,     0,     0,     0,     0,    90,    69,    70,    91,     0,
       0,     0,     0,     0,     0,     0,   144,    72,    73,    74,
      75,     0,     0,    76,     0,    77,     0,     0,    78,     0,
      62,     0,    64,    79,     0,     0,     0,    80,     0,     0,
      81,     0,     0,     0,     0,     1,    82,     0,    83,    65,
      66,    84,    85,     0,     0,     0,    67,    68,     0,     0,
      86,     0,     0,    87,    88,     0,    89,   761,     0,     0,
       0,    90,    69,    70,    91,     0,     0,     0,     0,     0,
       0,     0,    28,    72,    73,    74,    75,     0,     0,    76,
       0,    77,     0,     0,    78,     0,   143,   293,     0,    79,
       0,     0,     0,    80,     0,     0,    81,     0,     0,     0,
       0,     1,    82,     0,    83,    65,    66,    84,    85,     0,
       0,     0,    67,    68,     0,     0,    86,     0,     0,    87,
      88,     0,    89,     0,     0,     0,     0,    90,    69,    70,
      91,     0,     0,     0,     0,     0,     0,     0,   144,    72,
      73,    74,    75,     0,     0,    76,     0,    77,     0,     0,
      78,     0,   143,     0,   370,    79,     0,     0,     0,    80,
       0,     0,    81,     0,     0,     0,     0,     1,    82,     0,
      83,    65,    66,    84,    85,     0,     0,     0,    67,    68,
       0,     0,    86,     0,     0,    87,    88,     0,    89,     0,
       0,     0,     0,    90,    69,    70,    91,     0,     0,     0,
       0,     0,     0,     0,   144,    72,    73,    74,    75,     0,
       0,    76,     0,    77,     0,     0,    78,     0,   143,     0,
       0,    79,     0,   289,     0,    80,     0,     0,    81,     0,
       0,     0,     0,     1,    82,     0,    83,    65,    66,    84,
      85,     0,     0,     0,    67,    68,     0,     0,    86,     0,
       0,    87,    88,     0,    89,     0,     0,     0,     0,    90,
      69,    70,    91,     0,     0,     0,     0,     0,     0,     0,
     144,    72,    73,    74,    75,     0,     0,    76,     0,    77,
       0,     0,    78,     0,   143,     0,   384,    79,     0,     0,
       0,    80,     0,     0,    81,     0,     0,     0,     0,     1,
      82,     0,    83,    65,    66,    84,    85,     0,     0,     0,
      67,    68,     0,     0,    86,     0,     0,    87,    88,     0,
      89,     0,     0,     0,     0,    90,    69,    70,    91,     0,
       0,     0,     0,     0,     0,     0,   144,    72,    73,    74,
      75,     0,     0,    76,     0,    77,     0,     0,    78,     0,
     143,     0,     0,    79,     0,   398,     0,    80,     0,     0,
      81,     0,     0,     0,     0,     1,    82,     0,    83,    65,
      66,    84,    85,     0,     0,     0,    67,    68,     0,     0,
      86,     0,     0,    87,    88,     0,    89,     0,     0,     0,
       0,    90,    69,    70,    91,     0,     0,     0,     0,     0,
       0,     0,   144,    72,    73,    74,    75,     0,     0,    76,
       0,    77,     0,     0,    78,     0,   143,     0,     0,    79,
       0,     0,     0,    80,   574,     0,    81,     0,     0,     0,
       0,     1,    82,     0,    83,    65,    66,    84,    85,     0,
       0,     0,    67,    68,     0,     0,    86,     0,     0,    87,
      88,     0,    89,     0,     0,     0,     0,    90,    69,    70,
      91,     0,     0,     0,     0,     0,     0,     0,   144,    72,
      73,    74,    75,     0,     0,    76,     0,    77,     0,     0,
      78,     0,   143,     0,     0,    79,     0,     0,     0,    80,
       0,     0,    81,     0,     0,     0,     0,     1,    82,     0,
      83,    65,    66,    84,    85,     0,     0,     0,    67,    68,
       0,     0,    86,     0,     0,    87,    88,     0,    89,     0,
       0,     0,     0,    90,    69,    70,    91,     0,     0,     0,
       0,     0,     0,     0,   144,    72,    73,    74,    75,     0,
       0,    76,     0,    77,     0,     0,    78,     0,    62,     0,
       0,    79,     0,     0,     0,    80,     0,     0,    81,     0,
       0,     0,     0,     1,    82,     0,    83,    65,    66,    84,
      85,     0,     0,     0,    67,    68,     0,     0,    86,     0,
       0,    87,    88,     0,    89,     0,     0,     0,     0,    90,
      69,    70,    91,     0,     0,     0,     0,     0,     0,     0,
      28,    72,    73,    74,    75,     0,     0,    76,     0,    77,
     455,     0,    78,     0,     0,     0,     0,    79,     0,     0,
       0,    80,     0,     0,    81,     1,     0,     0,     0,     0,
      82,     0,    83,     0,     0,    84,    85,     0,     0,     0,
       0,     0,     0,     0,    86,     0,     0,    87,    88,     0,
      89,     0,    69,    70,     0,    90,     0,     0,    91,     0,
       0,     0,    28,    72,    73,    74,    75,     0,     0,    76,
       0,    77,   455,     0,    78,     0,     0,     0,     0,    79,
       0,     0,     0,    80,     0,     0,    81,     1,     0,     0,
       0,     0,    82,     0,    83,     0,     0,    84,    85,     0,
       0,     0,     0,     0,     0,     0,    86,     0,     0,    87,
       0,     0,    89,     0,    69,    70,     0,    90,     0,   322,
      91,     0,     0,     0,    28,    72,    73,    74,    75,     0,
       0,    76,     0,    77,   455,   784,    78,     0,     0,     0,
       0,    79,     0,     0,     0,    80,     0,     0,    81,     1,
       0,     0,     0,     0,    82,     0,    83,     0,     0,    84,
      85,     0,     0,     0,     0,     0,     0,     0,    86,     0,
       0,    87,     0,     0,    89,     0,     0,     0,     0,    90,
       0,     0,    91,     0,     0,     0,    28,    72,    73,    74,
      75,     0,     0,    76,   455,    77,     0,     0,    78,     0,
       0,     0,     0,    79,     0,     0,     0,    80,     0,     1,
      81,     0,     0,     0,     0,     0,    82,     0,    83,     0,
       0,    84,    85,     0,     0,     0,     0,     0,     0,     0,
      86,     0,     0,    87,     0,     0,    89,     0,     0,     0,
       0,    90,     0,   322,    91,     0,    28,    72,    73,    74,
      75,   799,     0,    76,     0,    77,     0,     0,    78,     0,
       0,     0,     0,    79,     0,     1,     0,    80,     0,     0,
      81,     0,     0,   370,   646,     0,    82,     0,    83,   598,
       0,    84,    85,     0,     0,     0,     1,     0,     0,     0,
      86,     0,     0,    87,     0,     0,    89,     0,     0,     0,
       0,    90,    28,   322,    91,     0,     0,     2,     0,    76,
       0,    77,   370,   696,    78,     0,     0,     3,   598,    79,
       0,     0,     0,     0,     4,     1,    81,     0,     2,     0,
       0,     0,    82,     0,    83,     0,     0,     0,     3,     6,
       0,     8,     9,    10,     0,     4,    86,    11,    12,     0,
       0,    13,     0,     0,     0,    14,     0,     0,     0,     0,
       6,    15,     8,     9,    10,   370,  -140,     2,   599,    12,
       0,   598,    13,     0,     0,     0,    14,     3,     1,     0,
       0,     0,    15,     0,     4,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   551,     0,     0,     0,     0,     6,
       0,     8,     9,    10,   370,   733,     1,   599,    12,     0,
     598,    13,     0,     0,     0,    14,     0,     1,     0,     0,
       2,    15,     0,     0,     0,     0,     0,     0,     0,     0,
       3,     0,     0,   641,     0,     0,     0,     4,     0,     0,
       0,     0,     0,     0,     0,     1,     0,     0,     2,     0,
       0,     0,     6,     0,     8,     9,    10,     0,     3,     2,
     599,    12,     0,     0,    13,     4,     0,     0,    14,     3,
       0,     0,     0,     0,    15,     0,     4,     0,     0,     0,
       6,     0,     8,     9,    10,     0,     0,     2,    11,    12,
       0,     6,    13,     8,     9,    10,    14,     3,     0,   599,
      12,     1,    15,    13,     4,     1,   167,    14,     0,     0,
       0,     0,     0,    15,     0,     0,     0,     0,     0,     6,
       0,     8,     9,    10,     0,     0,     0,    11,    12,     0,
       0,    13,     0,     0,     0,    14,     0,     0,    28,     0,
       0,    15,    28,     2,     0,    76,     0,    77,     0,    76,
      78,    77,     0,     3,    78,    79,    48,   235,     0,    79,
       4,     0,    81,     0,     0,     0,    81,     0,    82,     0,
      83,     0,    82,     0,    83,     6,     0,     8,     9,    10,
       0,     0,    86,    11,    12,     0,    86,    13,     0,     0,
       0,    14,     0,    28,    48,   235,     0,    15,     0,     0,
      76,     0,    77,     0,     0,    78,    49,     0,     0,     0,
      79,     0,    50,     0,     0,     0,     0,    81,     0,     0,
       0,     0,     0,    82,    51,    83,     0,     0,     0,     0,
       0,   732,     0,     0,     0,    52,     0,    86,    76,     0,
      77,     0,     0,    78,    49,     0,     0,     0,    79,     0,
      50,   632,     0,     0,     0,    81,     0,     0,     0,     0,
       0,    82,    51,    83,     0,     0,     0,   180,   -70,     0,
       0,   181,     0,    52,   182,    86,     0,   -70,     0,     0,
       0,   -70,   -70,   167,     0,     0,     0,     0,     0,   632,
       0,     0,  -399,     0,     0,     0,     0,     0,  -399,  -399,
    -399,  -399,  -399,  -399,  -399,  -399,  -399,  -399,  -399,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   -70
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
       0,   205,    26,    41,   169,   277,   249,    64,   251,   322,
     125,   572,    26,   370,   172,   173,   474,    41,     0,   182,
     579,   170,   434,    23,    93,    10,    64,   190,   186,   605,
     510,   552,   190,   191,   281,     7,    10,    11,    38,    41,
      64,    23,    10,    11,   552,   632,    18,    23,   675,   558,
      95,     6,    55,   721,   722,   675,    38,   765,   462,    55,
      19,   600,    64,    65,    66,    67,    68,    69,    70,    55,
       7,    75,    26,    11,     4,     9,   145,    18,    88,   600,
      19,    18,    91,    55,   792,    62,     6,    17,    55,    55,
      24,    91,   601,    47,    94,    95,    55,   100,   102,   168,
     768,   769,   770,   127,    90,    11,   102,    84,   647,   166,
      65,   427,   427,   182,    55,    70,    55,    55,    55,   628,
      86,   642,   749,   125,   282,   833,   647,   607,   166,   609,
     750,    90,   177,   105,   642,   135,   723,   724,   725,   807,
     649,   126,   166,   143,    75,    65,   146,   394,   122,    55,
      70,    90,    21,   135,   122,   179,   403,   472,    55,   135,
     564,   143,   409,   102,   166,     7,   143,   167,    10,   169,
     170,   102,     7,   218,    19,    20,    18,   177,   739,    19,
      14,     7,   758,    18,   771,   744,    55,    32,    33,    14,
     167,   193,    18,   195,   196,   197,   198,   199,   200,   201,
     202,   203,   204,    18,   206,   207,   208,   209,   210,   211,
     212,   213,   269,   362,   773,    55,   365,   530,   218,   631,
      55,    55,   538,   538,   248,   225,   469,     7,   205,    55,
      55,   269,   277,    18,   248,   235,   552,   552,    18,    84,
      19,   390,     0,   225,   402,   269,   404,   412,    10,    10,
     708,   275,     7,    68,     7,   816,   280,    19,    19,    74,
     284,   238,   505,    18,    25,    18,     3,   269,   472,   278,
      55,    86,   100,    10,    83,    55,    55,   277,   278,   324,
     429,   109,    97,     3,   600,   600,     7,     7,     7,   266,
      65,    66,    67,    68,    69,    70,   411,    18,    18,    18,
      55,   354,    55,   550,   547,    55,    66,    28,    28,    28,
     363,     4,    62,    18,    64,   558,     9,    67,    78,     7,
     365,    12,    72,    86,   324,    18,   642,   642,   352,    79,
      18,   647,   647,    24,    39,    85,   740,    87,   581,     5,
       7,     7,    10,     7,   616,    13,   346,   751,     4,    99,
     125,    18,    18,   811,    18,    11,   599,   357,   601,   416,
       6,    55,   362,     9,   346,   365,   613,     3,   572,   369,
     370,     7,   685,   411,    10,     9,   353,    55,   416,   837,
     380,    55,   359,    19,     7,   628,    20,   369,     7,     4,
     390,    10,   416,   636,    13,    18,    11,    10,    11,    18,
       0,   378,   379,   380,     9,     4,   649,   556,   557,   411,
       9,   815,   412,   817,   416,    20,   773,     4,    18,     6,
       5,    49,     9,    51,    11,    55,    11,   451,   428,   429,
     430,   674,   201,   202,   203,   204,   211,   212,   213,   448,
     449,   441,     5,    52,    53,    54,   428,    10,   448,   449,
     427,   694,   429,   810,    14,    15,    16,     4,   435,   441,
      60,   865,     9,    28,    11,     3,   443,     3,   711,     7,
      70,    48,    10,     4,   474,    13,   521,    77,     9,     4,
      18,    19,     4,    83,     9,     4,   531,     9,    88,    11,
       9,    21,    92,    93,    94,    95,    96,     4,    27,   742,
     100,   101,     9,     7,   104,   505,    10,     7,   108,    13,
      10,    65,   557,    13,   114,    17,    70,     4,   542,   496,
     497,   521,     9,   505,   138,     3,   140,   141,     4,     7,
      18,   531,    10,     9,   102,    13,     9,   105,    11,   584,
      18,    19,     6,   102,     4,     9,   105,   547,     3,   549,
       5,    19,     9,   553,    11,    11,   556,   557,   558,   120,
     121,   538,   123,   124,   125,   547,    55,    45,    46,    10,
      11,   553,    60,    10,    11,   552,   558,   579,   821,   206,
     207,   208,    70,     9,   584,    11,   127,   752,   633,    77,
       9,    82,    11,   840,   841,    83,    18,     9,   667,    11,
       9,   601,    11,   423,    92,   425,    94,    95,    96,    22,
      23,   611,   100,   101,    24,   773,   104,    45,    46,   601,
     108,    10,    11,   870,   871,     4,   114,    24,   628,    10,
      11,    45,    46,   633,     6,   635,    19,    45,    46,     8,
     685,    11,    12,   199,   200,    18,   628,    10,   625,   649,
      10,    55,   801,    11,     6,     1,   209,   210,   635,     5,
       5,     7,     5,     3,   205,   642,     3,   649,    75,    75,
      55,    55,   835,    55,     4,    68,   839,   835,   827,     8,
     725,   839,    55,     8,    30,   685,    10,    33,   688,    62,
      55,    64,    13,    68,    67,    41,     8,    12,    55,    72,
      55,    55,   726,   244,   109,   705,    79,   248,   708,    28,
     100,   688,    85,    75,    87,     9,     5,     9,    64,    65,
      66,    67,    68,    69,    70,   725,    99,    55,    55,     8,
       5,     5,     9,     9,   275,    55,     5,     9,    84,   112,
     809,    31,   744,    11,     3,   745,    12,     3,    11,     3,
       3,     8,   752,     3,    55,   764,   801,    55,    55,    10,
      55,     6,    55,   745,   764,   765,   835,   824,    17,    11,
      11,    11,    11,   773,   115,    11,     5,    11,   755,   125,
      11,   127,   827,     6,     5,     3,   824,     6,    55,    41,
     799,     3,   792,    31,     9,    12,   370,    11,     4,   799,
     824,   801,     4,     4,     3,    66,     4,    55,   107,   786,
     810,   811,    64,    65,    66,    67,    68,    69,    70,   828,
     166,   167,   824,   832,     9,    12,    12,   827,   828,    24,
      12,     4,   832,   833,     3,    55,    11,   837,     5,   848,
       3,    78,     4,    11,     4,    11,    73,   193,   848,   195,
     196,   197,   198,   199,   200,   201,   202,   203,   204,   205,
     206,   207,   208,   209,   210,   211,   212,   213,     4,    11,
     847,    11,    11,   125,    70,    31,     4,   105,    55,    11,
     102,   227,   228,   229,   230,    11,   427,    11,   462,    11,
      61,    46,   238,   232,   352,   430,   755,   547,   244,   756,
     474,   549,   248,   135,   174,   446,   546,   556,     0,   649,
     180,   181,   522,   595,   166,   792,   833,   827,   694,   189,
     266,   472,   192,   269,   642,   741,    18,   538,   607,   275,
     816,   472,   609,   609,   678,   380,   744,   369,   196,    -1,
     278,   193,    -1,   195,   196,   197,   198,   199,   200,   201,
     202,   203,   204,   197,   206,   207,   208,   209,   210,   211,
     212,   213,   195,   193,    -1,    -1,    -1,    -1,    60,    -1,
      -1,    -1,   198,    -1,    -1,    -1,   370,    -1,    70,   249,
      -1,   251,    -1,    -1,    -1,    77,    -1,    -1,    -1,    -1,
     564,    83,    -1,   339,   264,    -1,    -1,   538,   572,    -1,
      92,   542,    94,    95,    96,    -1,   276,   353,   100,   101,
      60,   552,   104,   359,    -1,    -1,   108,   269,    -1,    -1,
      70,    -1,   114,    -1,    -1,    -1,    -1,    77,    -1,    -1,
      -1,   572,   378,   379,   380,    -1,    -1,   611,   579,    -1,
      -1,    18,    92,    -1,    94,    95,    96,    -1,    -1,    -1,
     100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,   600,
      -1,    -1,    -1,    -1,   114,   411,    -1,    -1,   462,    -1,
     416,    -1,    -1,    -1,    -1,   421,    -1,   423,    55,   425,
     474,   427,    -1,   429,    -1,    62,    -1,    64,    -1,   435,
      67,    -1,    -1,    -1,   635,    72,    -1,   443,    -1,    -1,
     446,   642,    79,    -1,    -1,    -1,   647,    -1,    85,    -1,
      87,    -1,    -1,    -1,   384,   370,    -1,    -1,   388,    -1,
      -1,    -1,    99,    -1,   370,    -1,   472,    -1,    -1,    -1,
     400,   705,    -1,    -1,   708,    -1,   113,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,   688,    -1,    -1,
     496,   497,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   411,
     370,     0,    -1,    -1,   416,   739,   740,    -1,    -1,    -1,
     564,    -1,    -1,    -1,    -1,    -1,    -1,   751,   572,    18,
      -1,    -1,    -1,   529,    -1,   726,    -1,    -1,    -1,   459,
      -1,    -1,   538,    -1,    -1,   465,   542,    -1,   468,   773,
      -1,   471,    -1,   744,    -1,    -1,   552,   462,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,   462,   611,    -1,   474,
      -1,    60,    -1,    -1,   765,    -1,    -1,    -1,   474,    -1,
      -1,    70,    -1,   579,    -1,    -1,   810,   811,    77,    -1,
      -1,   815,   816,   817,    -1,   370,    -1,    -1,    -1,    -1,
     520,   792,   462,    92,   600,    94,    95,    96,    -1,   800,
      -1,   100,   101,   837,   474,   104,    -1,    -1,    -1,   108,
      -1,    -1,   618,    -1,    -1,   114,    -1,    -1,    -1,   625,
      -1,     0,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   635,
      -1,   865,   833,    -1,    -1,    -1,   642,    -1,    -1,    18,
      -1,   647,    -1,   573,    -1,    -1,   576,   577,   370,   564,
      -1,   705,   582,    -1,   708,    -1,    -1,   572,   564,    -1,
      -1,    -1,    -1,    -1,    -1,   595,   572,   579,    -1,    -1,
      -1,    -1,   370,    -1,    -1,    -1,    -1,   462,    -1,    -1,
       6,    60,   688,    -1,    -1,   739,   740,    -1,    -1,   474,
      -1,    70,    18,    -1,   564,    -1,   611,   751,    77,    -1,
      -1,    -1,   572,    -1,    -1,   611,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,   773,
     726,   100,   101,    -1,   654,   104,    -1,    -1,    -1,   108,
      -1,    -1,    -1,    -1,    60,   114,    -1,    -1,   744,    -1,
     462,   611,    -1,    -1,    70,    -1,    -1,    -1,    -1,   755,
      -1,    77,   474,    -1,    -1,    -1,   810,   811,    -1,   765,
      -1,   815,   816,   817,   462,    -1,    92,   773,    94,    95,
      96,    -1,    -1,    -1,   100,   101,   474,    -1,   104,   564,
     786,   711,   108,   837,    -1,    -1,   792,   572,   114,    -1,
     705,    -1,    -1,   708,   800,    -1,    -1,    -1,    -1,   705,
      -1,    -1,   708,    -1,    -1,    -1,   736,   737,   738,    -1,
      18,   865,    -1,    -1,    -1,    -1,    -1,    -1,   824,    -1,
      -1,    -1,    -1,    -1,   739,   740,   611,   833,    -1,    -1,
      -1,   761,   744,   739,   740,   705,   751,    -1,   708,    -1,
      -1,   847,   564,    -1,    -1,   751,    -1,    55,    -1,    -1,
     572,    -1,    -1,    -1,    62,    -1,    64,    -1,   773,    67,
      -1,    -1,     5,     6,    72,    -1,   564,   773,    11,   739,
     740,    79,    -1,    -1,   572,    18,    -1,    85,    -1,    87,
      -1,   751,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   611,
      -1,    99,    -1,    -1,    -1,   810,   811,    -1,    -1,    -1,
     815,   816,   817,   773,   810,   811,    -1,    -1,    -1,   815,
     816,   817,   824,   611,     6,    -1,    -1,    60,    -1,    -1,
     705,    -1,   837,   708,     5,     6,    18,    70,    -1,    -1,
      11,   837,    -1,    -1,    77,    -1,    -1,    18,    -1,    -1,
     810,   811,    -1,    -1,    -1,   815,   816,   817,    -1,    92,
     865,    94,    95,    96,   739,   740,    -1,   100,   101,   865,
      -1,   104,    -1,    -1,    -1,   108,   751,   837,    60,    -1,
      -1,   114,    -1,    -1,    -1,    -1,    -1,    -1,    70,    60,
      -1,    -1,    -1,   705,    -1,    77,   708,    -1,   773,    70,
      -1,    -1,    -1,    -1,    -1,   865,    77,    -1,    -1,    -1,
      92,    18,    94,    95,    96,    -1,    -1,   705,   100,   101,
     708,    92,   104,    94,    95,    96,   108,   739,   740,   100,
     101,    -1,   114,   104,    -1,   810,   811,   108,    -1,   751,
     815,   816,   817,   114,    -1,    -1,    -1,    -1,    55,    -1,
      -1,   739,   740,    -1,    -1,    62,    -1,    64,    -1,    -1,
      67,   773,   837,   751,    55,    72,    -1,    -1,    -1,    -1,
      -1,    62,    79,    64,    18,    -1,    67,    -1,    85,    -1,
      87,    72,    -1,    -1,    -1,   773,    -1,    -1,    79,    -1,
     865,    -1,    99,    -1,    85,    -1,    87,    -1,   810,   811,
      -1,    -1,    -1,   815,   816,   817,   113,    -1,    99,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    60,    -1,    -1,    -1,
      -1,   112,   810,   811,    -1,   837,    70,   815,   816,   817,
       1,    -1,     3,    77,     5,     6,    -1,    -1,    -1,    -1,
      11,    -1,    -1,    -1,    -1,    -1,    -1,    18,    92,   837,
      94,    95,    96,   865,    -1,    -1,   100,   101,    -1,    -1,
     104,    -1,    -1,    -1,   108,    -1,    -1,    -1,    -1,    -1,
     114,    -1,    -1,    -1,    45,    46,    -1,   865,    -1,    -1,
      -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,    60,
      61,    62,    63,    64,    65,    -1,    67,    68,    69,    70,
      71,    72,    -1,    74,    -1,    76,    77,    -1,    79,    80,
      81,    -1,    -1,    -1,    85,    86,    87,    -1,    18,    90,
      91,    92,    -1,    94,    95,    96,    97,    98,    99,   100,
     101,   102,   103,   104,   105,   106,    -1,   108,    -1,   110,
     111,   112,   113,   114,   115,   116,     1,    -1,     3,    -1,
       5,     6,    -1,    -1,    -1,    55,    11,    -1,    -1,    -1,
      -1,    -1,    62,    18,    64,    -1,    -1,    67,    68,    -1,
      -1,    -1,    72,    -1,    74,    -1,    -1,    -1,    -1,    79,
      -1,    -1,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,
      45,    46,    -1,    -1,    -1,    -1,    -1,    97,    -1,    99,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    -1,    67,    68,    69,    70,    71,    72,    -1,    74,
      -1,    76,    77,    -1,    79,    80,    81,    -1,    -1,    -1,
      85,    86,    87,    -1,    -1,    90,    91,    92,    -1,    94,
      95,    96,    97,    98,    99,   100,   101,   102,   103,   104,
     105,   106,    -1,   108,    -1,   110,   111,   112,   113,   114,
     115,   116,     1,    -1,     3,    -1,     5,     6,    -1,    -1,
      -1,    -1,    11,    -1,    28,    -1,    -1,    -1,    -1,    18,
      34,    35,    36,    37,    38,    39,    40,    41,    42,    43,
      44,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    60,    61,    62,    63,    64,    65,    -1,    67,    68,
      69,    70,    71,    72,    -1,    74,    -1,    76,    77,    -1,
      79,    80,    81,    -1,    -1,    -1,    85,    86,    87,    -1,
      -1,    90,    91,    92,    -1,    94,    95,    96,    97,    98,
      99,   100,   101,   102,   103,   104,   105,   106,    -1,   108,
      -1,   110,   111,   112,   113,   114,   115,   116,     1,    -1,
       3,    -1,     5,     6,    -1,    55,    -1,    -1,    11,    -1,
      -1,    -1,    62,    -1,    64,    18,    19,    67,    68,    -1,
      -1,    -1,    72,    -1,    74,    -1,    -1,    -1,    -1,    79,
      -1,    -1,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,
      -1,    -1,    45,    46,    -1,    -1,    -1,    97,    -1,    99,
      -1,    -1,    55,    56,    57,    58,    59,    60,    61,    62,
      63,    64,   112,    -1,    67,    68,    69,    70,    71,    72,
      -1,    74,    -1,    76,    77,    -1,    79,    80,    81,    -1,
      -1,    -1,    85,    86,    87,    -1,    -1,    90,    91,    92,
      -1,    94,    95,    96,    97,    98,    99,   100,   101,   102,
     103,   104,   105,   106,    -1,   108,    -1,   110,   111,   112,
     113,   114,   115,   116,     1,    -1,     3,    -1,     5,     6,
      -1,    -1,    -1,    -1,    11,    -1,    28,    -1,    -1,    -1,
      -1,    18,    34,    35,    36,    37,    38,    39,    40,    41,
      42,    43,    44,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,
      57,    58,    59,    60,    61,    62,    63,    64,    -1,    -1,
      67,    68,    69,    70,    71,    72,    -1,    74,    -1,    76,
      77,    -1,    79,    80,    81,    -1,    -1,    -1,    85,    86,
      87,    -1,    -1,    90,    91,    92,    -1,    94,    95,    96,
      97,    98,    99,   100,   101,   102,   103,   104,   105,   106,
      -1,   108,    -1,   110,   111,   112,   113,   114,   115,   116,
       1,    -1,     3,    -1,     5,     6,    -1,    -1,    -1,    -1,
      11,    -1,    28,    -1,    -1,    -1,    -1,    18,    34,    35,
      36,    37,    38,    39,    40,    41,    42,    43,    44,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,    60,
      61,    62,    63,    64,    -1,    -1,    67,    68,    69,    70,
      71,    72,    -1,    74,    -1,    76,    77,    -1,    79,    80,
      81,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,    90,
      91,    92,    -1,    94,    95,    96,    97,    98,    99,   100,
     101,   102,   103,   104,   105,   106,    -1,   108,    -1,   110,
     111,   112,   113,   114,   115,   116,     1,    -1,     3,    -1,
       5,     6,    -1,    -1,    -1,    -1,    11,    -1,    -1,    -1,
      -1,    -1,    -1,    18,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      45,    46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      -1,    -1,    67,    68,    69,    70,    71,    72,    -1,    74,
      -1,    76,    77,    -1,    79,    80,    81,    -1,    -1,    -1,
      85,    86,    87,    -1,    -1,    90,    91,    92,    -1,    94,
      95,    96,    97,    98,    99,   100,   101,   102,   103,   104,
     105,   106,    -1,   108,    -1,   110,   111,   112,   113,   114,
     115,   116,     1,    -1,     3,    -1,     5,     6,    -1,    -1,
      -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,    18,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    60,    61,    62,    63,    64,    -1,    -1,    67,    68,
      69,    70,    71,    72,    -1,    74,    -1,    76,    77,    -1,
      79,    80,    81,    -1,    -1,    -1,    85,    86,    87,    -1,
      -1,    90,    91,    92,    -1,    94,    95,    96,    97,    98,
      99,   100,   101,   102,   103,   104,   105,   106,    -1,   108,
      -1,   110,   111,   112,   113,   114,   115,   116,     1,    -1,
       3,    -1,     5,     6,    -1,    -1,    -1,    -1,    11,    -1,
      -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    60,    61,    62,
      63,    64,    -1,    -1,    67,    68,    69,    70,    71,    72,
      -1,    74,    -1,    76,    77,    -1,    79,    80,    81,    -1,
      -1,    -1,    85,    86,    87,    -1,    -1,    90,    91,    92,
      -1,    94,    95,    96,    97,    98,    99,   100,   101,   102,
     103,   104,   105,   106,    -1,   108,    -1,   110,   111,   112,
     113,   114,   115,   116,     1,    -1,     3,    -1,     5,    -1,
      -1,    -1,    -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,
      -1,    18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,
      57,    58,    59,    -1,    61,    62,    63,    64,    -1,    -1,
      67,    -1,    69,    -1,    71,    72,    -1,    -1,    18,    76,
      -1,    -1,    79,    80,    81,    -1,    26,    -1,    85,    18,
      87,    -1,    -1,    90,    91,    -1,    -1,    26,    -1,    -1,
      -1,    98,    99,    -1,    -1,   102,   103,   104,   105,   106,
       3,     4,    -1,   110,   111,    55,   113,    -1,   115,   116,
      -1,    -1,    62,    -1,    64,    18,    55,    67,    -1,    22,
      23,    -1,    72,    62,    -1,    64,    29,    30,    67,    79,
      -1,    -1,    -1,    72,    -1,    85,    -1,    87,    -1,    -1,
      79,    -1,    45,    46,    -1,    -1,    85,    -1,    87,    99,
      -1,    -1,    55,    56,    57,    58,    59,    60,    -1,    62,
      99,    64,    -1,    -1,    67,    -1,    -1,    70,    -1,    72,
      -1,    -1,    -1,    76,    77,    -1,    79,    -1,    -1,    18,
      19,    -1,    85,    -1,    87,    -1,    -1,    90,    91,    92,
      -1,    94,    95,    96,    -1,    -1,    99,   100,   101,   102,
     103,   104,   105,    -1,    -1,   108,    -1,   110,    -1,    -1,
     113,   114,     3,     4,     5,    -1,    55,    -1,    -1,    -1,
      -1,    -1,    -1,    62,    -1,    64,    -1,    18,    67,    68,
      -1,    22,    23,    72,    -1,    74,    -1,    -1,    29,    30,
      79,    -1,    -1,    -1,    -1,    -1,    85,    86,    87,    -1,
      -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    97,    -1,
      99,    -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,
      -1,    62,    -1,    64,   113,    -1,    67,    -1,     3,    -1,
       5,    72,    -1,    -1,     9,    76,    -1,    -1,    79,    -1,
      -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,    90,
      91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,    -1,
      -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,   110,
      45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      55,    56,    57,    58,    59,    -1,    -1,    62,    -1,    64,
      -1,    -1,    67,    -1,     3,    -1,     5,    72,    -1,    -1,
      -1,    76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,
      85,    -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,
      29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,
     105,    -1,    -1,    -1,    -1,   110,    45,    46,   113,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
       3,    -1,     5,    72,    -1,    -1,    -1,    76,    -1,    -1,
      79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,
      23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,
      99,    -1,    -1,   102,   103,    -1,   105,   106,    -1,    -1,
      -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,    62,
      -1,    64,    -1,    -1,    67,    -1,     3,     4,    -1,    72,
      -1,    -1,    -1,    76,    -1,    -1,    79,    -1,    -1,    -1,
      -1,    18,    85,    -1,    87,    22,    23,    90,    91,    -1,
      -1,    -1,    29,    30,    -1,    -1,    99,    -1,    -1,   102,
     103,    -1,   105,    -1,    -1,    -1,    -1,   110,    45,    46,
     113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,
      57,    58,    59,    -1,    -1,    62,    -1,    64,    -1,    -1,
      67,    -1,     3,    -1,     5,    72,    -1,    -1,    -1,    76,
      -1,    -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,
      87,    22,    23,    90,    91,    -1,    -1,    -1,    29,    30,
      -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,
      -1,    -1,    -1,   110,    45,    46,   113,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,
      -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,    -1,
      -1,    72,    -1,     8,    -1,    76,    -1,    -1,    79,    -1,
      -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,    90,
      91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,    -1,
      -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,   110,
      45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      55,    56,    57,    58,    59,    -1,    -1,    62,    -1,    64,
      -1,    -1,    67,    -1,     3,    -1,     5,    72,    -1,    -1,
      -1,    76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,
      85,    -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,
      29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,
     105,    -1,    -1,    -1,    -1,   110,    45,    46,   113,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
       3,    -1,    -1,    72,    -1,     8,    -1,    76,    -1,    -1,
      79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,
      23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,
      99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,
      -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,    62,
      -1,    64,    -1,    -1,    67,    -1,     3,    -1,    -1,    72,
      -1,    -1,    -1,    76,    11,    -1,    79,    -1,    -1,    -1,
      -1,    18,    85,    -1,    87,    22,    23,    90,    91,    -1,
      -1,    -1,    29,    30,    -1,    -1,    99,    -1,    -1,   102,
     103,    -1,   105,    -1,    -1,    -1,    -1,   110,    45,    46,
     113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,
      57,    58,    59,    -1,    -1,    62,    -1,    64,    -1,    -1,
      67,    -1,     3,    -1,    -1,    72,    -1,    -1,    -1,    76,
      -1,    -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,
      87,    22,    23,    90,    91,    -1,    -1,    -1,    29,    30,
      -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,
      -1,    -1,    -1,   110,    45,    46,   113,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,
      -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,    -1,
      -1,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,    -1,
      -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,    90,
      91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,    -1,
      -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,   110,
      45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      55,    56,    57,    58,    59,    -1,    -1,    62,    -1,    64,
       3,    -1,    67,    -1,    -1,    -1,    -1,    72,    -1,    -1,
      -1,    76,    -1,    -1,    79,    18,    -1,    -1,    -1,    -1,
      85,    -1,    87,    -1,    -1,    90,    91,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,
     105,    -1,    45,    46,    -1,   110,    -1,    -1,   113,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,    62,
      -1,    64,     3,    -1,    67,    -1,    -1,    -1,    -1,    72,
      -1,    -1,    -1,    76,    -1,    -1,    79,    18,    -1,    -1,
      -1,    -1,    85,    -1,    87,    -1,    -1,    90,    91,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    99,    -1,    -1,   102,
      -1,    -1,   105,    -1,    45,    46,    -1,   110,    -1,   112,
     113,    -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,
      -1,    62,    -1,    64,     3,     4,    67,    -1,    -1,    -1,
      -1,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,    18,
      -1,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    90,
      91,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    99,    -1,
      -1,   102,    -1,    -1,   105,    -1,    -1,    -1,    -1,   110,
      -1,    -1,   113,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    -1,    -1,    62,     3,    64,    -1,    -1,    67,    -1,
      -1,    -1,    -1,    72,    -1,    -1,    -1,    76,    -1,    18,
      79,    -1,    -1,    -1,    -1,    -1,    85,    -1,    87,    -1,
      -1,    90,    91,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      99,    -1,    -1,   102,    -1,    -1,   105,    -1,    -1,    -1,
      -1,   110,    -1,   112,   113,    -1,    55,    56,    57,    58,
      59,     4,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
      -1,    -1,    -1,    72,    -1,    18,    -1,    76,    -1,    -1,
      79,    -1,    -1,     5,     6,    -1,    85,    -1,    87,    11,
      -1,    90,    91,    -1,    -1,    -1,    18,    -1,    -1,    -1,
      99,    -1,    -1,   102,    -1,    -1,   105,    -1,    -1,    -1,
      -1,   110,    55,   112,   113,    -1,    -1,    60,    -1,    62,
      -1,    64,     5,     6,    67,    -1,    -1,    70,    11,    72,
      -1,    -1,    -1,    -1,    77,    18,    79,    -1,    60,    -1,
      -1,    -1,    85,    -1,    87,    -1,    -1,    -1,    70,    92,
      -1,    94,    95,    96,    -1,    77,    99,   100,   101,    -1,
      -1,   104,    -1,    -1,    -1,   108,    -1,    -1,    -1,    -1,
      92,   114,    94,    95,    96,     5,     6,    60,   100,   101,
      -1,    11,   104,    -1,    -1,    -1,   108,    70,    18,    -1,
      -1,    -1,   114,    -1,    77,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,     6,    -1,    -1,    -1,    -1,    92,
      -1,    94,    95,    96,     5,     6,    18,   100,   101,    -1,
      11,   104,    -1,    -1,    -1,   108,    -1,    18,    -1,    -1,
      60,   114,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      70,    -1,    -1,     6,    -1,    -1,    -1,    77,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,    60,    -1,
      -1,    -1,    92,    -1,    94,    95,    96,    -1,    70,    60,
     100,   101,    -1,    -1,   104,    77,    -1,    -1,   108,    70,
      -1,    -1,    -1,    -1,   114,    -1,    77,    -1,    -1,    -1,
      92,    -1,    94,    95,    96,    -1,    -1,    60,   100,   101,
      -1,    92,   104,    94,    95,    96,   108,    70,    -1,   100,
     101,    18,   114,   104,    77,    18,    19,   108,    -1,    -1,
      -1,    -1,    -1,   114,    -1,    -1,    -1,    -1,    -1,    92,
      -1,    94,    95,    96,    -1,    -1,    -1,   100,   101,    -1,
      -1,   104,    -1,    -1,    -1,   108,    -1,    -1,    55,    -1,
      -1,   114,    55,    60,    -1,    62,    -1,    64,    -1,    62,
      67,    64,    -1,    70,    67,    72,    18,    19,    -1,    72,
      77,    -1,    79,    -1,    -1,    -1,    79,    -1,    85,    -1,
      87,    -1,    85,    -1,    87,    92,    -1,    94,    95,    96,
      -1,    -1,    99,   100,   101,    -1,    99,   104,    -1,    -1,
      -1,   108,    -1,    55,    18,    19,    -1,   114,    -1,    -1,
      62,    -1,    64,    -1,    -1,    67,    68,    -1,    -1,    -1,
      72,    -1,    74,    -1,    -1,    -1,    -1,    79,    -1,    -1,
      -1,    -1,    -1,    85,    86,    87,    -1,    -1,    -1,    -1,
      -1,    55,    -1,    -1,    -1,    97,    -1,    99,    62,    -1,
      64,    -1,    -1,    67,    68,    -1,    -1,    -1,    72,    -1,
      74,   113,    -1,    -1,    -1,    79,    -1,    -1,    -1,    -1,
      -1,    85,    86,    87,    -1,    -1,    -1,     3,     4,    -1,
      -1,     7,    -1,    97,    10,    99,    -1,    13,    -1,    -1,
      -1,    17,    18,    19,    -1,    -1,    -1,    -1,    -1,   113,
      -1,    -1,    28,    -1,    -1,    -1,    -1,    -1,    34,    35,
      36,    37,    38,    39,    40,    41,    42,    43,    44,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final short[] yystos_ = yystos_init();
  private static final short[] yystos_init()
  {
    return new short[]
    {
       0,    18,    60,    70,    77,    83,    92,    93,    94,    95,
      96,   100,   101,   104,   108,   114,   130,   131,   132,   133,
     134,   135,   136,   137,   138,   139,   307,   308,    55,   129,
     100,   129,   129,    88,   133,     0,   130,   139,   141,   132,
     308,     3,    10,   129,    10,    11,    11,   129,    18,    68,
      74,    86,    97,   142,   151,   152,   171,   177,   202,   203,
     211,   130,     3,     4,     5,    22,    23,    29,    30,    45,
      46,    55,    56,    57,    58,    59,    62,    64,    67,    72,
      76,    79,    85,    87,    90,    91,    99,   102,   103,   105,
     110,   113,   128,   129,   148,   149,   150,   254,   255,   256,
     263,   264,   265,   268,   269,   282,   284,   285,   286,   287,
     288,   289,   290,   291,   292,   293,   294,   295,   296,   297,
     298,   299,   300,   301,   302,   303,   305,   307,   308,   309,
     310,    55,    10,    11,    14,   137,     5,    86,    55,    55,
      55,    55,   142,     3,    55,   129,   148,   263,   264,   272,
     273,   274,   278,   279,   280,   282,   304,     9,   310,   311,
     295,   295,   295,   295,   295,   295,    28,    19,   129,   148,
     259,   260,    10,    13,     3,     7,   199,   200,   201,   307,
       3,     7,    10,   260,   266,    10,    13,   199,   201,     7,
      10,    13,    26,    47,   283,    48,    21,    27,    17,    49,
      51,    19,    20,    32,    33,    84,    52,    53,    54,    22,
      23,    14,    15,    16,    45,    46,   273,   295,   149,     4,
       9,     4,    14,    11,   140,   141,   120,   121,   123,   124,
     125,   143,   144,   145,    55,    19,   153,   154,    82,   159,
     153,   153,     4,    55,   130,   275,   276,   277,   307,    24,
       4,    24,    28,    34,    35,    36,    37,    38,    39,    40,
      41,    42,    43,    44,   281,     4,    17,     6,     6,     9,
     310,    26,   148,   261,   262,   307,     7,   200,   270,   271,
     307,   257,   258,   306,   307,    55,   259,   259,   272,     8,
      10,   201,     7,     4,   267,   272,   272,    90,   102,   256,
     260,   102,   105,   259,    10,   272,    55,   256,   259,   259,
     272,   285,   286,   287,   288,   289,   290,   290,   292,   292,
     292,   292,   112,   148,   149,   220,   253,   293,   293,   293,
     294,   294,   295,   295,   295,    55,    11,   100,   109,   147,
     129,   129,   129,   129,     6,   145,     5,   212,    55,   155,
     156,   157,   307,    75,   158,   148,   160,     5,   172,    75,
     204,   205,     3,   178,   112,   149,     4,     9,     4,     9,
       5,   217,   272,   217,   272,   272,   148,   310,    75,   102,
       9,    20,    26,   272,     5,   187,   199,   271,     7,   266,
      10,    25,   259,    55,    55,    55,     4,    68,     8,     4,
       9,     8,    10,    55,    13,    55,    90,    68,     8,    55,
      55,    12,    55,   185,   186,   185,    28,   109,   100,   129,
      11,   122,    11,   122,    11,   126,     6,   130,   213,    75,
       9,    20,   157,   148,   159,     9,   173,   174,   175,   306,
     148,     5,   206,     9,   179,   180,   306,   159,    55,    55,
     306,   307,    55,   277,     1,     3,     6,    11,    55,    61,
      63,    69,    71,    80,    81,    98,   103,   104,   106,   111,
     115,   116,   130,   217,   218,   219,   221,   222,   223,   224,
     225,   235,   236,   237,   242,   255,   265,   279,   296,   297,
     299,   300,   301,   148,   148,   262,    75,   102,     8,   187,
     188,   189,   190,   272,   272,     5,   162,   163,   306,   266,
       5,   227,   272,    55,   259,   266,   259,   266,   273,   282,
      28,   200,     9,   310,    11,   129,   146,   146,   146,    18,
     148,   149,   151,   202,   209,   214,   215,     6,   130,   148,
     161,   306,   307,   156,   163,   148,     9,    11,   176,     9,
      55,     6,   130,   207,   148,     4,     9,   149,     5,   181,
     199,   199,    31,    11,    12,   272,    11,    55,    11,    55,
     104,   221,     3,     3,    11,   272,     3,     3,   272,     3,
     217,   250,     3,   272,   149,   151,   203,   220,     6,   219,
      11,   148,   148,     6,     9,     9,     8,     6,    11,   100,
     130,   164,   165,   217,    55,    65,    70,   228,   229,   230,
     231,   232,   233,    55,    55,   272,    28,   186,     9,    11,
      11,    11,   185,    55,   214,    17,    55,   176,   164,     6,
     175,   266,   113,   149,   151,   154,   192,   202,   208,   209,
     210,     6,   130,   180,    55,   306,     6,   130,   165,   182,
     183,    55,   221,    11,    12,    11,    11,   115,   220,   224,
     238,   240,   272,    11,   272,   272,    11,   129,   220,   251,
     252,   254,   263,    66,    78,   244,   245,   249,   217,   272,
      11,    11,     6,   190,   217,   149,   151,   153,   154,   166,
     167,   168,   184,   191,   192,   202,     6,   165,   234,   278,
       6,   229,   233,     6,   231,   232,   233,    70,   218,   233,
      12,    24,   266,   187,   129,    11,     3,   148,     6,   163,
      55,   193,   193,   113,   148,   149,   307,    11,   198,   217,
     208,    31,    55,     6,   183,   272,     3,    12,    11,     9,
       4,     4,     4,     4,    11,     3,   217,   245,   249,   243,
     244,     4,    55,   185,    55,   107,   197,   198,     9,     6,
      12,   106,   217,   272,     4,     3,   197,   197,   193,   193,
     193,   113,    55,     5,   169,    11,   272,   272,   239,   272,
     224,   221,   227,   217,     4,   252,   130,   246,   248,   249,
     221,    11,     3,   160,   169,   278,   272,    11,   199,     4,
     131,   149,   194,   195,   197,   197,   197,   193,     6,   129,
     170,   218,   254,   259,     4,     4,    11,    73,   226,   148,
     247,     4,   194,    11,    70,   216,   199,   149,    55,   105,
     196,   306,     4,     9,   197,    10,     6,   218,     6,    10,
     102,   105,    11,   221,   240,   241,   221,    21,    55,   217,
       4,   310,    11,   196,    10,   199,    31,   199,   195,   259,
     260,     6,   259,   266,   266,     4,   148,   199,   105,    55,
     102,   102,    11,    11,   221,   266,   266,    11,    11
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short[] yyr1_ = yyr1_init();
  private static final short[] yyr1_init()
  {
    return new short[]
    {
       0,   127,   128,   128,   128,   128,   128,   128,   128,   129,
     129,   130,   130,   131,   131,   132,   132,   133,   133,   133,
     133,   133,   133,   133,   133,   133,   133,   133,   133,   134,
     134,   134,   134,   135,   136,   137,   137,   138,   138,   139,
     139,   139,   139,   140,   140,   141,   141,   142,   142,   143,
     143,   144,   144,   145,   145,   145,   145,   145,   145,   145,
     146,   146,   147,   147,   147,   147,   147,   148,   148,   149,
     149,   149,   149,   150,   150,   150,   150,   150,   150,   150,
     150,   151,   151,   151,   152,   153,   153,   154,   155,   155,
     156,   156,   157,   157,   157,   158,   158,   159,   159,   160,
     160,   161,   161,   162,   162,   163,   163,   164,   164,   165,
     165,   165,   165,   166,   166,   166,   166,   166,   167,   168,
     169,   169,   169,   169,   170,   170,   170,   170,   171,   172,
     172,   173,   173,   174,   174,   175,   175,   175,   176,   176,
     176,   177,   178,   179,   179,   179,   180,   180,   181,   181,
     182,   182,   183,   183,   184,   185,   185,   186,   186,   186,
     186,   187,   187,   188,   188,   189,   189,   190,   190,   191,
     192,   192,   192,   192,   192,   192,   193,   193,   194,   194,
     195,   195,   196,   196,   196,   196,   197,   197,   198,   198,
     199,   199,   200,   200,   201,   201,   202,   202,   203,   204,
     204,   205,   205,   206,   206,   207,   207,   208,   208,   208,
     208,   209,   210,   211,   212,   212,   213,   213,   214,   214,
     214,   214,   215,   216,   216,   217,   217,   218,   218,   219,
     219,   219,   219,   220,   220,   221,   221,   221,   221,   221,
     222,   222,   222,   222,   222,   222,   222,   222,   222,   222,
     222,   222,   222,   222,   222,   222,   222,   222,   222,   222,
     222,   223,   224,   224,   224,   224,   224,   224,   224,   225,
     226,   226,   227,   227,   227,   228,   228,   229,   229,   229,
     230,   230,   230,   231,   231,   232,   232,   233,   233,   234,
     234,   235,   236,   236,   237,   238,   238,   238,   239,   239,
     240,   240,   241,   241,   242,   243,   243,   244,   244,   245,
     246,   247,   247,   248,   248,   249,   250,   250,   251,   251,
     252,   252,   253,   254,   254,   254,   254,   254,   254,   254,
     254,   254,   254,   254,   254,   255,   255,   255,   256,   257,
     257,   258,   258,   259,   259,   260,   261,   261,   262,   262,
     262,   262,   262,   262,   262,   263,   263,   263,   264,   264,
     265,   265,   265,   265,   265,   266,   266,   267,   267,   268,
     268,   268,   268,   268,   269,   269,   270,   270,   271,   271,
     272,   272,   273,   273,   273,   273,   274,   274,   274,   275,
     275,   276,   276,   277,   277,   277,   278,   278,   279,   280,
     280,   280,   281,   281,   281,   281,   281,   281,   281,   281,
     281,   281,   281,   281,   282,   283,   283,   283,   284,   284,
     285,   285,   286,   286,   287,   287,   288,   288,   289,   289,
     289,   290,   290,   290,   290,   290,   290,   291,   291,   292,
     292,   292,   292,   293,   293,   293,   294,   294,   294,   294,
     295,   295,   295,   295,   295,   296,   297,   298,   298,   298,
     298,   298,   299,   299,   299,   299,   300,   301,   302,   302,
     303,   304,   304,   305,   306,   306,   307,   307,   308,   308,
     308,   308,   309,   309,   310,   310,   310,   310,   311,   311,
     311
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte[] yyr2_ = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     1,     1,     1,     1,     1,     1,     1,     1,
       3,     0,     1,     1,     2,     1,     2,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     0,
       1,     1,     2,     5,     6,     0,     1,     1,     2,     3,
       4,     5,     6,     0,     1,     2,     3,     1,     1,     0,
       1,     1,     2,     4,     3,     5,     3,     5,     3,     5,
       1,     3,     0,     1,     2,     1,     2,     1,     2,     1,
       1,     2,     2,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     6,     0,     1,     3,     1,     3,
       2,     1,     1,     4,     3,     0,     2,     0,     2,     1,
       3,     1,     3,     0,     1,     2,     3,     1,     2,     2,
       1,     2,     1,     1,     1,     1,     1,     1,     3,     5,
       2,     3,     3,     4,     4,     4,     6,     6,     4,     4,
       5,     0,     1,     1,     3,     2,     3,     4,     0,     1,
       2,     6,     3,     0,     1,     3,     3,     5,     2,     3,
       1,     2,     1,     3,     3,     1,     3,     1,     3,     2,
       4,     3,     4,     0,     1,     1,     3,     1,     1,     2,
       4,     5,     4,     4,     3,     3,     4,     5,     1,     3,
       3,     2,     2,     3,     1,     3,     0,     2,     1,     1,
       0,     1,     1,     2,     3,     2,     1,     1,     5,     0,
       1,     2,     3,     2,     3,     2,     3,     1,     1,     1,
       1,     3,     2,     4,     2,     3,     2,     3,     1,     1,
       1,     1,     7,     0,     2,     2,     3,     1,     2,     2,
       2,     3,     1,     2,     2,     1,     1,     1,     1,     1,
       1,     1,     2,     3,     5,     5,     7,     2,     3,     2,
       3,     2,     3,     5,     3,     3,     3,     4,     3,     5,
       2,     3,     1,     1,     1,     1,     1,     1,     1,     6,
       0,     2,     3,     3,     4,     1,     2,     4,     3,     5,
       0,     1,     2,     1,     2,     2,     3,     2,     1,     1,
       3,     5,     1,     1,     9,     0,     1,     1,     0,     1,
       1,     3,     0,     1,     7,     0,     1,     1,     2,     5,
       4,     1,     3,     0,     1,     2,     3,     4,     1,     3,
       1,     1,     1,     1,     4,     4,     1,     3,     3,     1,
       1,     1,     1,     1,     1,     1,     3,     3,     5,     2,
       2,     2,     4,     0,     1,     3,     1,     3,     1,     1,
       3,     3,     2,     4,     4,     3,     3,     5,     4,     4,
       2,     5,     5,     5,     7,     2,     3,     1,     3,     4,
       4,     4,     6,     4,     4,     4,     1,     2,     3,     4,
       1,     1,     3,     3,     3,     3,     2,     3,     3,     1,
       3,     1,     3,     4,     4,     5,     1,     1,     3,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     2,     0,     4,     4,     1,     3,
       1,     3,     1,     3,     1,     3,     1,     3,     1,     3,
       3,     1,     3,     3,     3,     3,     1,     3,     3,     1,
       3,     3,     3,     1,     3,     3,     1,     3,     3,     3,
       1,     1,     2,     2,     1,     2,     2,     1,     2,     2,
       1,     1,     1,     1,     1,     1,     2,     2,     2,     2,
       3,     1,     3,     5,     0,     1,     1,     2,     2,     4,
       5,     5,     3,     5,     1,     3,     3,     1,     0,     1,
       3
    };
  }




  /* YYTRANSLATE_(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
     as returned by yylex, with out-of-bounds checking.  */
  private static final SymbolKind yytranslate_(int t)
  {
    // Last valid token kind.
    int code_max = 381;
    if (t <= 0)
      return SymbolKind.S_YYEOF;
    else if (t <= code_max)
      return SymbolKind.get(yytranslate_table_[t]);
    else
      return SymbolKind.S_YYUNDEF;
  }
  private static final byte[] yytranslate_table_ = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    78,    79,    80,    81,    82,    83,    84,
      85,    86,    87,    88,    89,    90,    91,    92,    93,    94,
      95,    96,    97,    98,    99,   100,   101,   102,   103,   104,
     105,   106,   107,   108,   109,   110,   111,   112,   113,   114,
     115,   116,   117,   118,   119,   120,   121,   122,   123,   124,
     125,   126
    };
  }


  private static final int YYLAST_ = 4539;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 35;
  private static final int YYNTOKENS_ = 127;

/* Unqualified %code blocks.  */
/* "src/main/resources/Java_16_Grammar.y":150  */

    public CompilationUnit ast;

/* "src/main/java/parser/JavaParser.java":6069  */

}
/* "src/main/resources/Java_16_Grammar.y":1497  */


