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

/* "src/main/java/parser/JavaParser.java":61  */

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

    /* Return YYSTR after stripping away unnecessary quotes and
       backslashes, so that it's suitable for yyerror.  The heuristic is
       that double-quoting is unnecessary unless the string contains an
       apostrophe, a comma, or backslash (other than backslash-backslash).
       YYSTR is taken from yytname.  */
    private static String yytnamerr_(String yystr)
    {
      if (yystr.charAt (0) == '"')
        {
          StringBuffer yyr = new StringBuffer();
          strip_quotes: for (int i = 1; i < yystr.length(); i++)
            switch (yystr.charAt(i))
              {
              case '\'':
              case ',':
                break strip_quotes;

              case '\\':
                if (yystr.charAt(++i) != '\\')
                  break strip_quotes;
                /* Fall through.  */
              default:
                yyr.append(yystr.charAt(i));
                break;

              case '"':
                return yyr.toString();
              }
        }
      return yystr;
    }

    /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
       First, the terminals, then, starting at \a YYNTOKENS_, nonterminals.  */
    private static final String[] yytname_ = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "\"end of file\"", "error", "\"invalid token\"", "LPAREN", "RPAREN",
  "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "COMMA", "DOT", "SEMICOLON",
  "COLON", "DBL_COLON", "STAR", "SLASH", "PERCENT", "AMPERSAND", "AT",
  "LESS", "GREATER", "VERTICAL", "PLUS", "MINUS", "ARROW", "DIAMOND",
  "QUESTION", "CARET", "EQUAL", "TILDE", "EXCLAMATION", "ELLIPSIS",
  "LESS_EQUAL", "GREATER_EQUAL", "STAR_EQUAL", "SLASH_EQUAL",
  "PERCENT_EQUAL", "PLUS_EQUAL", "MINUS_EQUAL", "LESS_LESS_EQUAL",
  "GR_GR_EQUAL", "GR_GR_GR_EQUAL", "AMP_EQUAL", "CARET_EQUAL",
  "VERTICAL_EQUAL", "DBL_PLUS", "DBL_MINUS", "DBL_VERTICAL",
  "DBL_AMPERSAND", "DBL_EQUAL", "TRIPL_EQUAL", "NON_EQUAL", "DBL_LESS",
  "DBL_GREATER", "TRIPL_GREATER", "IDENTIFIER", "INTEGER_LITERAL",
  "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL",
  "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
  "CHAR", "CLASS", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM",
  "EXTENDS", "FALSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF",
  "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG",
  "MODULE", "NATIVE", "NEW", "NULL", "OPEN", "PACKAGE", "PRIVATE",
  "PROTECTED", "PUBLIC", "RECORD", "RETURN", "SHORT", "STATIC", "STRICTFP",
  "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS",
  "TRANSIENT", "TRANSITIVE", "TRUE", "TRY", "VAR", "VOID", "VOLATILE",
  "WHILE", "YIELD", "SHORT_COMMENT", "LONG_COMMENT", "EOS", "\"requires\"",
  "\"exports\"", "\"to\"", "\"opens\"", "\"uses\"", "\"provides\"",
  "\"with\"", "$accept", "Literal", "CompoundName", "ModifierSeqOpt",
  "ModifierSeq", "StandardModifierSeq", "StandardModifier",
  "CompilationUnit", "Package", "Module", "ImportDeclarationSeqOpt",
  "ImportDeclarationSeq", "ImportDeclaration", "TopLevelComponentSeqOpt",
  "TopLevelComponentSeq", "TopLevelComponent", "ModuleDirectiveSeqOpt",
  "ModuleDirectiveSeq", "ModuleDirective", "ModuleNameList",
  "RequiresModifierSeqOpt", "Type", "UnannotatedType", "PrimitiveType",
  "ClassDeclaration", "NormalClassDeclaration", "TypeParametersOpt",
  "TypeParameters", "TypeParameterList", "TypeParameter",
  "TypeParameterTail", "ClassExtendsOpt", "ClassImplementsOpt",
  "ClassTypeList1", "ClassTypeList2", "ClassBodyOpt", "ClassBody",
  "ClassBodyDeclarationSeq", "ClassBodyDeclaration", "PureBodyDeclaration",
  "ConstructorDeclaration", "ConstructorDeclarator", "ConstructorBody",
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
      return yytnamerr_(yytname_[yycode_]);
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
    /* "src/main/resources/Java_16_Grammar.y":265  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 3: /* Literal: FLOATING_POINT_LITERAL  */
  if (yyn == 3)
    /* "src/main/resources/Java_16_Grammar.y":266  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 4: /* Literal: TRUE  */
  if (yyn == 4)
    /* "src/main/resources/Java_16_Grammar.y":267  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 5: /* Literal: FALSE  */
  if (yyn == 5)
    /* "src/main/resources/Java_16_Grammar.y":268  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 6: /* Literal: CHARACTER_LITERAL  */
  if (yyn == 6)
    /* "src/main/resources/Java_16_Grammar.y":269  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 7: /* Literal: STRING_LITERAL  */
  if (yyn == 7)
    /* "src/main/resources/Java_16_Grammar.y":270  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 8: /* Literal: NULL  */
  if (yyn == 8)
    /* "src/main/resources/Java_16_Grammar.y":272  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 9: /* CompoundName: IDENTIFIER  */
  if (yyn == 9)
    /* "src/main/resources/Java_16_Grammar.y":278  */
                                  { yyval = new CompoundName(((Token)(yystack.valueAt (0))).image); };
  break;


  case 10: /* CompoundName: CompoundName DOT IDENTIFIER  */
  if (yyn == 10)
    /* "src/main/resources/Java_16_Grammar.y":279  */
                                  { yyval = ((CompoundName)(yystack.valueAt (2))).add(((Token)(yystack.valueAt (0))).image); };
  break;


  case 11: /* ModifierSeqOpt: %empty  */
  if (yyn == 11)
    /* "src/main/resources/Java_16_Grammar.y":283  */
                   { yyval = null; };
  break;


  case 12: /* ModifierSeqOpt: ModifierSeq  */
  if (yyn == 12)
    /* "src/main/resources/Java_16_Grammar.y":284  */
                   { yyval = ((Modifiers)(yystack.valueAt (0))); };
  break;


  case 13: /* ModifierSeq: StandardModifierSeq  */
  if (yyn == 13)
    /* "src/main/resources/Java_16_Grammar.y":288  */
                                        { yyval = new Modifiers(null,((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 14: /* ModifierSeq: AnnotationSeq StandardModifierSeq  */
  if (yyn == 14)
    /* "src/main/resources/Java_16_Grammar.y":289  */
                                        { yyval = new Modifiers(((Annotations)(yystack.valueAt (1))),((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 15: /* StandardModifierSeq: StandardModifier  */
  if (yyn == 15)
    /* "src/main/resources/Java_16_Grammar.y":293  */
                                           { yyval = new StandardModifiers(((Token)(yystack.valueAt (0)))); };
  break;


  case 16: /* StandardModifierSeq: StandardModifierSeq StandardModifier  */
  if (yyn == 16)
    /* "src/main/resources/Java_16_Grammar.y":294  */
                                           { yyval = ((StandardModifiers)(yystack.valueAt (1))).add(((Token)(yystack.valueAt (0)))); };
  break;


  case 17: /* StandardModifier: DEFAULT  */
  if (yyn == 17)
    /* "src/main/resources/Java_16_Grammar.y":299  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 18: /* StandardModifier: FINAL  */
  if (yyn == 18)
    /* "src/main/resources/Java_16_Grammar.y":300  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 19: /* StandardModifier: PUBLIC  */
  if (yyn == 19)
    /* "src/main/resources/Java_16_Grammar.y":301  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 20: /* StandardModifier: PROTECTED  */
  if (yyn == 20)
    /* "src/main/resources/Java_16_Grammar.y":302  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 21: /* StandardModifier: PRIVATE  */
  if (yyn == 21)
    /* "src/main/resources/Java_16_Grammar.y":303  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 22: /* StandardModifier: ABSTRACT  */
  if (yyn == 22)
    /* "src/main/resources/Java_16_Grammar.y":304  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 23: /* StandardModifier: STATIC  */
  if (yyn == 23)
    /* "src/main/resources/Java_16_Grammar.y":305  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 24: /* StandardModifier: STRICTFP  */
  if (yyn == 24)
    /* "src/main/resources/Java_16_Grammar.y":306  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 25: /* StandardModifier: SYNCHRONIZED  */
  if (yyn == 25)
    /* "src/main/resources/Java_16_Grammar.y":307  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 26: /* StandardModifier: TRANSIENT  */
  if (yyn == 26)
    /* "src/main/resources/Java_16_Grammar.y":308  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 27: /* StandardModifier: VOLATILE  */
  if (yyn == 27)
    /* "src/main/resources/Java_16_Grammar.y":309  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 28: /* StandardModifier: OPEN  */
  if (yyn == 28)
    /* "src/main/resources/Java_16_Grammar.y":310  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 29: /* CompilationUnit: %empty  */
  if (yyn == 29)
    /* "src/main/resources/Java_16_Grammar.y":316  */
                                                    { yyval = null; };
  break;


  case 30: /* CompilationUnit: Package  */
  if (yyn == 30)
    /* "src/main/resources/Java_16_Grammar.y":317  */
                                                    { yyval = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); ast = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); };
  break;


  case 31: /* CompilationUnit: Module  */
  if (yyn == 31)
    /* "src/main/resources/Java_16_Grammar.y":318  */
                                                    { yyval = ((tree.Compilation.Module)(yystack.valueAt (0))); ast = ((tree.Compilation.Module)(yystack.valueAt (0))); };
  break;


  case 32: /* CompilationUnit: ImportDeclarationSeqOpt TopLevelComponentSeq  */
  if (yyn == 32)
    /* "src/main/resources/Java_16_Grammar.y":319  */
                                                    { ast = new SimpleCompilationUnit(((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 33: /* Package: PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt  */
  if (yyn == 33)
    /* "src/main/resources/Java_16_Grammar.y":324  */
                                                    { yyval = new tree.Compilation.Package(((CompoundName)(yystack.valueAt (3))),((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 34: /* Module: ModifierSeqOpt MODULE CompoundName LBRACE ModuleDirectiveSeqOpt RBRACE  */
  if (yyn == 34)
    /* "src/main/resources/Java_16_Grammar.y":330  */
                                                                             { yyval = null; };
  break;


  case 35: /* ImportDeclarationSeqOpt: %empty  */
  if (yyn == 35)
    /* "src/main/resources/Java_16_Grammar.y":334  */
                                                 { yyval = null; };
  break;


  case 36: /* ImportDeclarationSeqOpt: ImportDeclarationSeq  */
  if (yyn == 36)
    /* "src/main/resources/Java_16_Grammar.y":335  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (0))); };
  break;


  case 37: /* ImportDeclarationSeq: ImportDeclaration  */
  if (yyn == 37)
    /* "src/main/resources/Java_16_Grammar.y":339  */
                                                 { yyval = new ImportDeclarations(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 38: /* ImportDeclarationSeq: ImportDeclarationSeqOpt ImportDeclaration  */
  if (yyn == 38)
    /* "src/main/resources/Java_16_Grammar.y":340  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))).add(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 39: /* ImportDeclaration: IMPORT CompoundName SEMICOLON  */
  if (yyn == 39)
    /* "src/main/resources/Java_16_Grammar.y":344  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 40: /* ImportDeclaration: IMPORT STATIC CompoundName SEMICOLON  */
  if (yyn == 40)
    /* "src/main/resources/Java_16_Grammar.y":345  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 41: /* ImportDeclaration: IMPORT CompoundName DOT STAR SEMICOLON  */
  if (yyn == 41)
    /* "src/main/resources/Java_16_Grammar.y":346  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 42: /* ImportDeclaration: IMPORT STATIC CompoundName DOT STAR SEMICOLON  */
  if (yyn == 42)
    /* "src/main/resources/Java_16_Grammar.y":347  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 43: /* TopLevelComponentSeqOpt: %empty  */
  if (yyn == 43)
    /* "src/main/resources/Java_16_Grammar.y":351  */
                            { yyval = null; };
  break;


  case 44: /* TopLevelComponentSeqOpt: TopLevelComponentSeq  */
  if (yyn == 44)
    /* "src/main/resources/Java_16_Grammar.y":352  */
                            { yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (0))); };
  break;


  case 45: /* TopLevelComponentSeq: ModifierSeqOpt TopLevelComponent  */
  if (yyn == 45)
    /* "src/main/resources/Java_16_Grammar.y":356  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = new TopLevelComponents(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 46: /* TopLevelComponentSeq: TopLevelComponentSeq ModifierSeqOpt TopLevelComponent  */
  if (yyn == 46)
    /* "src/main/resources/Java_16_Grammar.y":357  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (2))).add(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 47: /* TopLevelComponent: ClassDeclaration  */
  if (yyn == 47)
    /* "src/main/resources/Java_16_Grammar.y":361  */
                           { yyval = new TopLevelComponent(((ClassDeclaration)(yystack.valueAt (0)))); };
  break;


  case 48: /* TopLevelComponent: InterfaceDeclaration  */
  if (yyn == 48)
    /* "src/main/resources/Java_16_Grammar.y":362  */
                           { yyval = new TopLevelComponent(((InterfaceDeclaration)(yystack.valueAt (0)))); };
  break;


  case 67: /* Type: UnannotatedType  */
  if (yyn == 67)
    /* "src/main/resources/Java_16_Grammar.y":409  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))); };
  break;


  case 68: /* Type: AnnotationSeq UnannotatedType  */
  if (yyn == 68)
    /* "src/main/resources/Java_16_Grammar.y":410  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))).addAnnotations(((Annotations)(yystack.valueAt (1)))); };
  break;


  case 69: /* UnannotatedType: PrimitiveType  */
  if (yyn == 69)
    /* "src/main/resources/Java_16_Grammar.y":414  */
                                 { yyval = new PrimitiveType(((Token)(yystack.valueAt (0)))); };
  break;


  case 70: /* UnannotatedType: CompoundName  */
  if (yyn == 70)
    /* "src/main/resources/Java_16_Grammar.y":416  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (0))),null); };
  break;


  case 71: /* UnannotatedType: CompoundName TypeArguments  */
  if (yyn == 71)
    /* "src/main/resources/Java_16_Grammar.y":417  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (1))),((tree.Type.TypeArguments)(yystack.valueAt (0)))); };
  break;


  case 72: /* UnannotatedType: UnannotatedType Dim  */
  if (yyn == 72)
    /* "src/main/resources/Java_16_Grammar.y":419  */
                                     { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (1))).addDimension(((Dim)(yystack.valueAt (0)))); };
  break;


  case 73: /* PrimitiveType: BYTE  */
  if (yyn == 73)
    /* "src/main/resources/Java_16_Grammar.y":428  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 74: /* PrimitiveType: SHORT  */
  if (yyn == 74)
    /* "src/main/resources/Java_16_Grammar.y":429  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 75: /* PrimitiveType: INT  */
  if (yyn == 75)
    /* "src/main/resources/Java_16_Grammar.y":430  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 76: /* PrimitiveType: LONG  */
  if (yyn == 76)
    /* "src/main/resources/Java_16_Grammar.y":431  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 77: /* PrimitiveType: CHAR  */
  if (yyn == 77)
    /* "src/main/resources/Java_16_Grammar.y":432  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 78: /* PrimitiveType: FLOAT  */
  if (yyn == 78)
    /* "src/main/resources/Java_16_Grammar.y":434  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 79: /* PrimitiveType: DOUBLE  */
  if (yyn == 79)
    /* "src/main/resources/Java_16_Grammar.y":435  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 80: /* PrimitiveType: BOOLEAN  */
  if (yyn == 80)
    /* "src/main/resources/Java_16_Grammar.y":436  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 81: /* ClassDeclaration: NormalClassDeclaration  */
  if (yyn == 81)
    /* "src/main/resources/Java_16_Grammar.y":457  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 82: /* ClassDeclaration: EnumDeclaration  */
  if (yyn == 82)
    /* "src/main/resources/Java_16_Grammar.y":458  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 83: /* ClassDeclaration: RecordDeclaration  */
  if (yyn == 83)
    /* "src/main/resources/Java_16_Grammar.y":459  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 84: /* NormalClassDeclaration: CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody  */
  if (yyn == 84)
    /* "src/main/resources/Java_16_Grammar.y":464  */
                              { yyval = new NormalClassDeclaration(((Token)(yystack.valueAt (4))),((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 85: /* TypeParametersOpt: %empty  */
  if (yyn == 85)
    /* "src/main/resources/Java_16_Grammar.y":468  */
                       { yyval = null; };
  break;


  case 86: /* TypeParametersOpt: TypeParameters  */
  if (yyn == 86)
    /* "src/main/resources/Java_16_Grammar.y":469  */
                       { yyval = ((TypeParameters)(yystack.valueAt (0))); };
  break;


  case 87: /* TypeParameters: LESS TypeParameterList GREATER  */
  if (yyn == 87)
    /* "src/main/resources/Java_16_Grammar.y":473  */
                                      { yyval = ((TypeParameters)(yystack.valueAt (1))); };
  break;


  case 88: /* TypeParameterList: TypeParameter  */
  if (yyn == 88)
    /* "src/main/resources/Java_16_Grammar.y":477  */
                                            { yyval = new TypeParameters(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 89: /* TypeParameterList: TypeParameterList COMMA TypeParameter  */
  if (yyn == 89)
    /* "src/main/resources/Java_16_Grammar.y":478  */
                                            { yyval = ((TypeParameters)(yystack.valueAt (2))).add(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 90: /* TypeParameter: AnnotationSeq TypeParameterTail  */
  if (yyn == 90)
    /* "src/main/resources/Java_16_Grammar.y":488  */
                                      { yyval = new TypeParameter(((Annotations)(yystack.valueAt (1))),((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 91: /* TypeParameter: TypeParameterTail  */
  if (yyn == 91)
    /* "src/main/resources/Java_16_Grammar.y":489  */
                                      { yyval = new TypeParameter(null,((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 92: /* TypeParameterTail: IDENTIFIER  */
  if (yyn == 92)
    /* "src/main/resources/Java_16_Grammar.y":493  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (0))),null); };
  break;


  case 93: /* TypeParameterTail: IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 93)
    /* "src/main/resources/Java_16_Grammar.y":494  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (3))),((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0)))); };
  break;


  case 94: /* TypeParameterTail: IDENTIFIER EXTENDS ClassTypeList2  */
  if (yyn == 94)
    /* "src/main/resources/Java_16_Grammar.y":495  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 95: /* ClassExtendsOpt: %empty  */
  if (yyn == 95)
    /* "src/main/resources/Java_16_Grammar.y":499  */
                    { yyval = null; };
  break;


  case 96: /* ClassExtendsOpt: EXTENDS Type  */
  if (yyn == 96)
    /* "src/main/resources/Java_16_Grammar.y":500  */
                    { yyval = ((tree.Type.Type)(yystack.valueAt (0))); };
  break;


  case 97: /* ClassImplementsOpt: %empty  */
  if (yyn == 97)
    /* "src/main/resources/Java_16_Grammar.y":504  */
                                 { yyval = null; };
  break;


  case 98: /* ClassImplementsOpt: IMPLEMENTS ClassTypeList1  */
  if (yyn == 98)
    /* "src/main/resources/Java_16_Grammar.y":505  */
                                 { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 99: /* ClassTypeList1: Type  */
  if (yyn == 99)
    /* "src/main/resources/Java_16_Grammar.y":509  */
                                { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 100: /* ClassTypeList1: ClassTypeList1 COMMA Type  */
  if (yyn == 100)
    /* "src/main/resources/Java_16_Grammar.y":510  */
                                { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 101: /* ClassTypeList2: Type  */
  if (yyn == 101)
    /* "src/main/resources/Java_16_Grammar.y":514  */
                                    { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 102: /* ClassTypeList2: ClassTypeList2 AMPERSAND Type  */
  if (yyn == 102)
    /* "src/main/resources/Java_16_Grammar.y":515  */
                                    { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 103: /* ClassBodyOpt: %empty  */
  if (yyn == 103)
    /* "src/main/resources/Java_16_Grammar.y":519  */
                    { yyval = null; };
  break;


  case 104: /* ClassBodyOpt: ClassBody  */
  if (yyn == 104)
    /* "src/main/resources/Java_16_Grammar.y":520  */
                    { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 105: /* ClassBody: LBRACE RBRACE  */
  if (yyn == 105)
    /* "src/main/resources/Java_16_Grammar.y":524  */
                                             { yyval = null; };
  break;


  case 106: /* ClassBody: LBRACE ClassBodyDeclarationSeq RBRACE  */
  if (yyn == 106)
    /* "src/main/resources/Java_16_Grammar.y":525  */
                                                 { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 107: /* ClassBodyDeclarationSeq: ClassBodyDeclaration  */
  if (yyn == 107)
    /* "src/main/resources/Java_16_Grammar.y":529  */
                                                   { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 108: /* ClassBodyDeclarationSeq: ClassBodyDeclarationSeq ClassBodyDeclaration  */
  if (yyn == 108)
    /* "src/main/resources/Java_16_Grammar.y":530  */
                                                   { yyval = ((Declarations)(yystack.valueAt (1))).add(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 109: /* ClassBodyDeclaration: ModifierSeqOpt PureBodyDeclaration  */
  if (yyn == 109)
    /* "src/main/resources/Java_16_Grammar.y":534  */
                                         { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); };
  break;


  case 110: /* ClassBodyDeclaration: Block  */
  if (yyn == 110)
    /* "src/main/resources/Java_16_Grammar.y":535  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),false); };
  break;


  case 111: /* ClassBodyDeclaration: STATIC Block  */
  if (yyn == 111)
    /* "src/main/resources/Java_16_Grammar.y":536  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),true); };
  break;


  case 112: /* ClassBodyDeclaration: SEMICOLON  */
  if (yyn == 112)
    /* "src/main/resources/Java_16_Grammar.y":537  */
                      { yyval = null; };
  break;


  case 113: /* PureBodyDeclaration: FieldDeclaration  */
  if (yyn == 113)
    /* "src/main/resources/Java_16_Grammar.y":541  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 114: /* PureBodyDeclaration: MethodDeclaration  */
  if (yyn == 114)
    /* "src/main/resources/Java_16_Grammar.y":542  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 115: /* PureBodyDeclaration: ClassDeclaration  */
  if (yyn == 115)
    /* "src/main/resources/Java_16_Grammar.y":543  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 116: /* PureBodyDeclaration: InterfaceDeclaration  */
  if (yyn == 116)
    /* "src/main/resources/Java_16_Grammar.y":544  */
                               { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 117: /* PureBodyDeclaration: ConstructorDeclaration  */
  if (yyn == 117)
    /* "src/main/resources/Java_16_Grammar.y":545  */
                               { yyval = ((ConstructorDeclaration)(yystack.valueAt (0))); };
  break;


  case 118: /* ConstructorDeclaration: ConstructorDeclarator ThrowsOpt ConstructorBody  */
  if (yyn == 118)
    /* "src/main/resources/Java_16_Grammar.y":552  */
                            { yyval = new ConstructorDeclaration(null,((ConstructorDeclarator)(yystack.valueAt (2))).typeParameters,((ConstructorDeclarator)(yystack.valueAt (2))).formalParameters,
                                                              ((tree.Type.TypeList)(yystack.valueAt (1))),((ConstructorBody)(yystack.valueAt (0))).invocation,((ConstructorBody)(yystack.valueAt (0))).block); };
  break;


  case 119: /* ConstructorDeclarator: TypeParametersOpt IDENTIFIER LPAREN FormalParameterList RPAREN  */
  if (yyn == 119)
    /* "src/main/resources/Java_16_Grammar.y":558  */
                                      { yyval = new ConstructorDeclarator(((TypeParameters)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (1)))); };
  break;


  case 120: /* ConstructorBody: LBRACE RBRACE  */
  if (yyn == 120)
    /* "src/main/resources/Java_16_Grammar.y":562  */
                                                                    { yyval = new ConstructorBody(null,null); };
  break;


  case 121: /* ConstructorBody: LBRACE ExplicitConstructorInvocation RBRACE  */
  if (yyn == 121)
    /* "src/main/resources/Java_16_Grammar.y":563  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (1))),null); };
  break;


  case 122: /* ConstructorBody: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 122)
    /* "src/main/resources/Java_16_Grammar.y":564  */
                                                                    { yyval = new ConstructorBody(null,new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 123: /* ConstructorBody: LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE  */
  if (yyn == 123)
    /* "src/main/resources/Java_16_Grammar.y":565  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (2))),new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 124: /* ExplicitConstructorInvocation: TypeArgumentsOpt THIS Arguments SEMICOLON  */
  if (yyn == 124)
    /* "src/main/resources/Java_16_Grammar.y":569  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),false,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 125: /* ExplicitConstructorInvocation: TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 125)
    /* "src/main/resources/Java_16_Grammar.y":570  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 126: /* ExplicitConstructorInvocation: CompoundName DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 126)
    /* "src/main/resources/Java_16_Grammar.y":571  */
                                                                  { Expression expr = new SimpleReference(((CompoundName)(yystack.valueAt (5))));
                                                                    yyval = new ExplicitConstructorInvocation(expr,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 127: /* ExplicitConstructorInvocation: Primary DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 127)
    /* "src/main/resources/Java_16_Grammar.y":573  */
                                                                  { yyval = new ExplicitConstructorInvocation(((tree.Expression.Expression)(yystack.valueAt (5))),((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 128: /* EnumDeclaration: ENUM IDENTIFIER ClassImplementsOpt EnumBody  */
  if (yyn == 128)
    /* "src/main/resources/Java_16_Grammar.y":579  */
                                                                     { yyval = new EnumDeclaration(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((EnumBody)(yystack.valueAt (0)))); };
  break;


  case 129: /* EnumBody: LBRACE EnumConstantListOpt EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 129)
    /* "src/main/resources/Java_16_Grammar.y":583  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (2))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 130: /* EnumBody: LBRACE EnumConstantListOpt COMMA EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 130)
    /* "src/main/resources/Java_16_Grammar.y":584  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (3))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 131: /* EnumConstantListOpt: %empty  */
  if (yyn == 131)
    /* "src/main/resources/Java_16_Grammar.y":588  */
                         { yyval = null; };
  break;


  case 132: /* EnumConstantListOpt: EnumConstantList  */
  if (yyn == 132)
    /* "src/main/resources/Java_16_Grammar.y":589  */
                         { yyval = ((Enumerators)(yystack.valueAt (0))); };
  break;


  case 133: /* EnumConstantList: EnumConstant  */
  if (yyn == 133)
    /* "src/main/resources/Java_16_Grammar.y":593  */
                                          { yyval = new Enumerators(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 134: /* EnumConstantList: EnumConstantList COMMA EnumConstant  */
  if (yyn == 134)
    /* "src/main/resources/Java_16_Grammar.y":594  */
                                          { yyval = ((Enumerators)(yystack.valueAt (2))).add(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 135: /* EnumConstant: AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 135)
    /* "src/main/resources/Java_16_Grammar.y":598  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 136: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments  */
  if (yyn == 136)
    /* "src/main/resources/Java_16_Grammar.y":599  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0))),null); };
  break;


  case 137: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments ClassBody  */
  if (yyn == 137)
    /* "src/main/resources/Java_16_Grammar.y":600  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (3))),((Token)(yystack.valueAt (2))),((tree.Expression.ArgumentList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 138: /* EnumBodyDeclarationsOpt: %empty  */
  if (yyn == 138)
    /* "src/main/resources/Java_16_Grammar.y":604  */
                                        { yyval = null; };
  break;


  case 139: /* EnumBodyDeclarationsOpt: SEMICOLON  */
  if (yyn == 139)
    /* "src/main/resources/Java_16_Grammar.y":605  */
                                        { yyval = null; };
  break;


  case 140: /* EnumBodyDeclarationsOpt: SEMICOLON ClassBodyDeclarationSeq  */
  if (yyn == 140)
    /* "src/main/resources/Java_16_Grammar.y":606  */
                                        { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 141: /* RecordDeclaration: RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody  */
  if (yyn == 141)
    /* "src/main/resources/Java_16_Grammar.y":612  */
                                                                                                        { yyval = null; };
  break;


  case 154: /* FieldDeclaration: UnannotatedType VariableDeclaratorList SEMICOLON  */
  if (yyn == 154)
    /* "src/main/resources/Java_16_Grammar.y":649  */
                                                  { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 155: /* VariableDeclaratorList: VariableDeclarator  */
  if (yyn == 155)
    /* "src/main/resources/Java_16_Grammar.y":653  */
                                                      { yyval = new VariableDeclarators(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 156: /* VariableDeclaratorList: VariableDeclaratorList COMMA VariableDeclarator  */
  if (yyn == 156)
    /* "src/main/resources/Java_16_Grammar.y":654  */
                                                      { yyval = ((VariableDeclarators)(yystack.valueAt (2))).add(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 157: /* VariableDeclarator: IDENTIFIER  */
  if (yyn == 157)
    /* "src/main/resources/Java_16_Grammar.y":658  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 158: /* VariableDeclarator: IDENTIFIER EQUAL Expression  */
  if (yyn == 158)
    /* "src/main/resources/Java_16_Grammar.y":659  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (2))),null,new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0))))); };
  break;


  case 159: /* VariableDeclarator: IDENTIFIER Dims  */
  if (yyn == 159)
    /* "src/main/resources/Java_16_Grammar.y":660  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),null); };
  break;


  case 160: /* VariableDeclarator: IDENTIFIER Dims EQUAL ArrayInitializer  */
  if (yyn == 160)
    /* "src/main/resources/Java_16_Grammar.y":661  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2))),((InitializerArray)(yystack.valueAt (0)))); };
  break;


  case 161: /* ArrayInitializer: LBRACE VariableInitializerListOpt RBRACE  */
  if (yyn == 161)
    /* "src/main/resources/Java_16_Grammar.y":665  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (1))); };
  break;


  case 162: /* ArrayInitializer: LBRACE VariableInitializerListOpt COMMA RBRACE  */
  if (yyn == 162)
    /* "src/main/resources/Java_16_Grammar.y":666  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (2))); };
  break;


  case 163: /* VariableInitializerListOpt: %empty  */
  if (yyn == 163)
    /* "src/main/resources/Java_16_Grammar.y":670  */
                                { yyval = null; };
  break;


  case 164: /* VariableInitializerListOpt: VariableInitializerList  */
  if (yyn == 164)
    /* "src/main/resources/Java_16_Grammar.y":671  */
                                { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 165: /* VariableInitializerList: VariableInitializer  */
  if (yyn == 165)
    /* "src/main/resources/Java_16_Grammar.y":675  */
                                                        { yyval = new InitializerArray(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 166: /* VariableInitializerList: VariableInitializerList COMMA VariableInitializer  */
  if (yyn == 166)
    /* "src/main/resources/Java_16_Grammar.y":676  */
                                                        { yyval = ((InitializerArray)(yystack.valueAt (2))).add(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 167: /* VariableInitializer: Expression  */
  if (yyn == 167)
    /* "src/main/resources/Java_16_Grammar.y":680  */
                        { yyval = new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 168: /* VariableInitializer: ArrayInitializer  */
  if (yyn == 168)
    /* "src/main/resources/Java_16_Grammar.y":681  */
                        { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 169: /* MethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 169)
    /* "src/main/resources/Java_16_Grammar.y":687  */
                              { yyval = new MethodDeclaration(((MethodHeader)(yystack.valueAt (1))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 170: /* MethodHeader: TypeParameters Type MethodDeclarator ThrowsOpt  */
  if (yyn == 170)
    /* "src/main/resources/Java_16_Grammar.y":697  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 171: /* MethodHeader: TypeParameters AnnotationSeq VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 171)
    /* "src/main/resources/Java_16_Grammar.y":698  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (4))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 172: /* MethodHeader: TypeParameters UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 172)
    /* "src/main/resources/Java_16_Grammar.y":699  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 173: /* MethodHeader: TypeParameters VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 173)
    /* "src/main/resources/Java_16_Grammar.y":700  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 174: /* MethodHeader: UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 174)
    /* "src/main/resources/Java_16_Grammar.y":701  */
                                                                              { yyval = new MethodHeader(null,((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 175: /* MethodHeader: VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 175)
    /* "src/main/resources/Java_16_Grammar.y":702  */
                                                                              { yyval = new MethodHeader(null,null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 176: /* MethodDeclarator: IDENTIFIER LPAREN RPAREN DimsOpt  */
  if (yyn == 176)
    /* "src/main/resources/Java_16_Grammar.y":711  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (3))),null,((Dims)(yystack.valueAt (0)))); };
  break;


  case 177: /* MethodDeclarator: IDENTIFIER LPAREN FormalParameterList RPAREN DimsOpt  */
  if (yyn == 177)
    /* "src/main/resources/Java_16_Grammar.y":712  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (2))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 178: /* FormalParameterList: FormalParameter  */
  if (yyn == 178)
    /* "src/main/resources/Java_16_Grammar.y":726  */
                                                { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 179: /* FormalParameterList: FormalParameterList COMMA FormalParameter  */
  if (yyn == 179)
    /* "src/main/resources/Java_16_Grammar.y":727  */
                                                { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0))));};
  break;


  case 180: /* FormalParameter: ModifierSeq UnannotatedType FormalParameterTail  */
  if (yyn == 180)
    /* "src/main/resources/Java_16_Grammar.y":731  */
                                                      { yyval = ParameterDeclaration.create(((Modifiers)(yystack.valueAt (2))),((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 181: /* FormalParameter: UnannotatedType FormalParameterTail  */
  if (yyn == 181)
    /* "src/main/resources/Java_16_Grammar.y":732  */
                                                      { yyval = ParameterDeclaration.create(null,((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 182: /* FormalParameterTail: IDENTIFIER DimsOpt  */
  if (yyn == 182)
    /* "src/main/resources/Java_16_Grammar.y":736  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),false,false); };
  break;


  case 183: /* FormalParameterTail: AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 183)
    /* "src/main/resources/Java_16_Grammar.y":737  */
                                                   { yyval = new ParameterTail(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (0))),null,true,false); };
  break;


  case 184: /* FormalParameterTail: THIS  */
  if (yyn == 184)
    /* "src/main/resources/Java_16_Grammar.y":738  */
                                                   { yyval = new ParameterTail(null,null,null,false,true); };
  break;


  case 185: /* FormalParameterTail: IDENTIFIER DOT THIS  */
  if (yyn == 185)
    /* "src/main/resources/Java_16_Grammar.y":739  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (2))),null,false,true); };
  break;


  case 186: /* ThrowsOpt: %empty  */
  if (yyn == 186)
    /* "src/main/resources/Java_16_Grammar.y":751  */
                             { yyval = null; };
  break;


  case 187: /* ThrowsOpt: THROWS ClassTypeList1  */
  if (yyn == 187)
    /* "src/main/resources/Java_16_Grammar.y":752  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 188: /* MethodBody: Block  */
  if (yyn == 188)
    /* "src/main/resources/Java_16_Grammar.y":756  */
                   { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 189: /* MethodBody: SEMICOLON  */
  if (yyn == 189)
    /* "src/main/resources/Java_16_Grammar.y":757  */
                   { yyval = null; };
  break;


  case 190: /* DimsOpt: %empty  */
  if (yyn == 190)
    /* "src/main/resources/Java_16_Grammar.y":763  */
                 { yyval = null; };
  break;


  case 191: /* DimsOpt: Dims  */
  if (yyn == 191)
    /* "src/main/resources/Java_16_Grammar.y":764  */
                 { yyval = ((Dims)(yystack.valueAt (0))); };
  break;


  case 192: /* Dims: Dim  */
  if (yyn == 192)
    /* "src/main/resources/Java_16_Grammar.y":768  */
                { yyval = new Dims(((Dim)(yystack.valueAt (0)))); };
  break;


  case 193: /* Dims: Dims Dim  */
  if (yyn == 193)
    /* "src/main/resources/Java_16_Grammar.y":769  */
                { yyval = ((Dims)(yystack.valueAt (1))).add(((Dim)(yystack.valueAt (0)))); };
  break;


  case 194: /* Dim: AnnotationSeq LBRACKET RBRACKET  */
  if (yyn == 194)
    /* "src/main/resources/Java_16_Grammar.y":773  */
                                      { yyval = new Dim(((Annotations)(yystack.valueAt (2)))); };
  break;


  case 195: /* Dim: LBRACKET RBRACKET  */
  if (yyn == 195)
    /* "src/main/resources/Java_16_Grammar.y":774  */
                                      { yyval = new Dim(null); };
  break;


  case 196: /* InterfaceDeclaration: NormalInterfaceDeclaration  */
  if (yyn == 196)
    /* "src/main/resources/Java_16_Grammar.y":780  */
                                      { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 197: /* InterfaceDeclaration: AnnotationInterfaceDeclaration  */
  if (yyn == 197)
    /* "src/main/resources/Java_16_Grammar.y":781  */
                                      { yyval = null; };
  break;


  case 198: /* NormalInterfaceDeclaration: INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody  */
  if (yyn == 198)
    /* "src/main/resources/Java_16_Grammar.y":786  */
                                         { yyval = new NormalInterfaceDeclaration(((Token)(yystack.valueAt (3))),((TypeParameters)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 199: /* InterfaceExtendsOpt: %empty  */
  if (yyn == 199)
    /* "src/main/resources/Java_16_Grammar.y":790  */
                        { yyval = null; };
  break;


  case 200: /* InterfaceExtendsOpt: InterfaceExtends  */
  if (yyn == 200)
    /* "src/main/resources/Java_16_Grammar.y":791  */
                        { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 201: /* InterfaceExtends: EXTENDS Type  */
  if (yyn == 201)
    /* "src/main/resources/Java_16_Grammar.y":795  */
                                   { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 202: /* InterfaceExtends: InterfaceExtends COMMA Type  */
  if (yyn == 202)
    /* "src/main/resources/Java_16_Grammar.y":796  */
                                   { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 203: /* InterfaceBody: LBRACE RBRACE  */
  if (yyn == 203)
    /* "src/main/resources/Java_16_Grammar.y":800  */
                                                  { yyval = null; };
  break;


  case 204: /* InterfaceBody: LBRACE InterfaceMemberDeclarationSeq RBRACE  */
  if (yyn == 204)
    /* "src/main/resources/Java_16_Grammar.y":801  */
                                                  { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 205: /* InterfaceMemberDeclarationSeq: ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 205)
    /* "src/main/resources/Java_16_Grammar.y":805  */
                                                                              { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 206: /* InterfaceMemberDeclarationSeq: InterfaceMemberDeclarationSeq ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 206)
    /* "src/main/resources/Java_16_Grammar.y":806  */
                                                                              { yyval = ((Declarations)(yystack.valueAt (2))).add(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 207: /* InterfaceMemberDeclaration: ConstantDeclaration  */
  if (yyn == 207)
    /* "src/main/resources/Java_16_Grammar.y":810  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 208: /* InterfaceMemberDeclaration: InterfaceMethodDeclaration  */
  if (yyn == 208)
    /* "src/main/resources/Java_16_Grammar.y":811  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 209: /* InterfaceMemberDeclaration: ClassDeclaration  */
  if (yyn == 209)
    /* "src/main/resources/Java_16_Grammar.y":812  */
                                  { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 210: /* InterfaceMemberDeclaration: InterfaceDeclaration  */
  if (yyn == 210)
    /* "src/main/resources/Java_16_Grammar.y":813  */
                                  { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 211: /* ConstantDeclaration: Type VariableDeclaratorList SEMICOLON  */
  if (yyn == 211)
    /* "src/main/resources/Java_16_Grammar.y":817  */
                                            { yyval = new TypeAndDeclarators(((tree.Type.Type)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 212: /* InterfaceMethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 212)
    /* "src/main/resources/Java_16_Grammar.y":821  */
                              { yyval = null; };
  break;


  case 213: /* AnnotationInterfaceDeclaration: AT INTERFACE IDENTIFIER AnnotationInterfaceBody  */
  if (yyn == 213)
    /* "src/main/resources/Java_16_Grammar.y":825  */
                                                      { yyval = null; };
  break;


  case 225: /* Block: LBRACE RBRACE  */
  if (yyn == 225)
    /* "src/main/resources/Java_16_Grammar.y":858  */
                                        { yyval = null; };
  break;


  case 226: /* Block: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 226)
    /* "src/main/resources/Java_16_Grammar.y":859  */
                                        { yyval = new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1)))); };
  break;


  case 227: /* BlockStatementSeq: BlockStatement  */
  if (yyn == 227)
    /* "src/main/resources/Java_16_Grammar.y":863  */
                                           { yyval = new BlockStatements(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 228: /* BlockStatementSeq: BlockStatementSeq BlockStatement  */
  if (yyn == 228)
    /* "src/main/resources/Java_16_Grammar.y":864  */
                                       { yyval = ((tree.Statement.BlockStatements)(yystack.valueAt (1))).add(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 229: /* BlockStatement: ModifierSeqOpt ClassDeclaration  */
  if (yyn == 229)
    /* "src/main/resources/Java_16_Grammar.y":880  */
                                                { yyval = new BlockStatement(((ClassDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 230: /* BlockStatement: ModifierSeqOpt NormalInterfaceDeclaration  */
  if (yyn == 230)
    /* "src/main/resources/Java_16_Grammar.y":881  */
                                                { yyval = new BlockStatement(((InterfaceDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 231: /* BlockStatement: ModifierSeqOpt LocalVariableDeclaration SEMICOLON  */
  if (yyn == 231)
    /* "src/main/resources/Java_16_Grammar.y":883  */
                                                { yyval = new BlockStatement(((tree.Declaration.Declaration)(yystack.valueAt (1))).addModifiers(((Modifiers)(yystack.valueAt (2))))); };
  break;


  case 232: /* BlockStatement: Statement  */
  if (yyn == 232)
    /* "src/main/resources/Java_16_Grammar.y":884  */
                                                { yyval = new BlockStatement(((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 233: /* LocalVariableDeclaration: UnannotatedType VariableDeclaratorList  */
  if (yyn == 233)
    /* "src/main/resources/Java_16_Grammar.y":888  */
                                             { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (1))),((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 234: /* LocalVariableDeclaration: VAR VariableDeclaratorList  */
  if (yyn == 234)
    /* "src/main/resources/Java_16_Grammar.y":889  */
                                             { yyval = new TypeAndDeclarators(null,((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 240: /* SimpleStatement: Block  */
  if (yyn == 240)
    /* "src/main/resources/Java_16_Grammar.y":901  */
                                        { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 241: /* SimpleStatement: SEMICOLON  */
  if (yyn == 241)
    /* "src/main/resources/Java_16_Grammar.y":902  */
                                            { yyval = null; };
  break;


  case 242: /* SimpleStatement: StatementExpression SEMICOLON  */
  if (yyn == 242)
    /* "src/main/resources/Java_16_Grammar.y":903  */
                                        { yyval = ((StatementExpression)(yystack.valueAt (1))); };
  break;


  case 243: /* SimpleStatement: ASSERT Expression SEMICOLON  */
  if (yyn == 243)
    /* "src/main/resources/Java_16_Grammar.y":905  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (1))),null); };
  break;


  case 244: /* SimpleStatement: ASSERT Expression COLON Expression SEMICOLON  */
  if (yyn == 244)
    /* "src/main/resources/Java_16_Grammar.y":906  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 245: /* SimpleStatement: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 245)
    /* "src/main/resources/Java_16_Grammar.y":908  */
                                                   { yyval = null; };
  break;


  case 246: /* SimpleStatement: DO Statement WHILE LPAREN Expression RPAREN SEMICOLON  */
  if (yyn == 246)
    /* "src/main/resources/Java_16_Grammar.y":909  */
                                                            { yyval = new Do(null,((tree.Statement.Statement)(yystack.valueAt (5))),((tree.Expression.Expression)(yystack.valueAt (2)))); };
  break;


  case 247: /* SimpleStatement: BREAK SEMICOLON  */
  if (yyn == 247)
    /* "src/main/resources/Java_16_Grammar.y":911  */
                                  { yyval = new Break(null,null); };
  break;


  case 248: /* SimpleStatement: BREAK IDENTIFIER SEMICOLON  */
  if (yyn == 248)
    /* "src/main/resources/Java_16_Grammar.y":912  */
                                  { yyval = new Break(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 249: /* SimpleStatement: CONTINUE SEMICOLON  */
  if (yyn == 249)
    /* "src/main/resources/Java_16_Grammar.y":914  */
                                      { yyval = new Continue(null,null); };
  break;


  case 250: /* SimpleStatement: CONTINUE IDENTIFIER SEMICOLON  */
  if (yyn == 250)
    /* "src/main/resources/Java_16_Grammar.y":915  */
                                      { yyval = new Continue(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 251: /* SimpleStatement: RETURN SEMICOLON  */
  if (yyn == 251)
    /* "src/main/resources/Java_16_Grammar.y":917  */
                                      { yyval = new Return(null,null); };
  break;


  case 252: /* SimpleStatement: RETURN Expression SEMICOLON  */
  if (yyn == 252)
    /* "src/main/resources/Java_16_Grammar.y":918  */
                                      { yyval = new Return(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 253: /* SimpleStatement: SYNCHRONIZED LPAREN Expression RPAREN Block  */
  if (yyn == 253)
    /* "src/main/resources/Java_16_Grammar.y":920  */
                                                   { yyval = new Synchronized(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 254: /* SimpleStatement: THROW Expression SEMICOLON  */
  if (yyn == 254)
    /* "src/main/resources/Java_16_Grammar.y":922  */
                                  { yyval = new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 255: /* SimpleStatement: YIELD Expression SEMICOLON  */
  if (yyn == 255)
    /* "src/main/resources/Java_16_Grammar.y":923  */
                                  { yyval = new Yield(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 256: /* SimpleStatement: TRY Block Catches  */
  if (yyn == 256)
    /* "src/main/resources/Java_16_Grammar.y":926  */
                                   { yyval = null; };
  break;


  case 257: /* SimpleStatement: TRY Block Catches Finally  */
  if (yyn == 257)
    /* "src/main/resources/Java_16_Grammar.y":927  */
                                   { yyval = null; };
  break;


  case 258: /* SimpleStatement: TRY Block Finally  */
  if (yyn == 258)
    /* "src/main/resources/Java_16_Grammar.y":928  */
                                   { yyval = null; };
  break;


  case 259: /* SimpleStatement: TRY ResourceSpecification Block CatchesOpt FinallyOpt  */
  if (yyn == 259)
    /* "src/main/resources/Java_16_Grammar.y":930  */
                                   { yyval = null; };
  break;


  case 260: /* LabeledStatement: IDENTIFIER COLON Statement  */
  if (yyn == 260)
    /* "src/main/resources/Java_16_Grammar.y":934  */
                                 { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))).addLabel(((Token)(yystack.valueAt (2)))); };
  break;


  case 261: /* StatementExpression: Assignment  */
  if (yyn == 261)
    /* "src/main/resources/Java_16_Grammar.y":938  */
                                   { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 262: /* StatementExpression: PreIncrementExpression  */
  if (yyn == 262)
    /* "src/main/resources/Java_16_Grammar.y":939  */
                                   { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 263: /* StatementExpression: PreDecrementExpression  */
  if (yyn == 263)
    /* "src/main/resources/Java_16_Grammar.y":940  */
                                   { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 264: /* StatementExpression: PostIncrementExpression  */
  if (yyn == 264)
    /* "src/main/resources/Java_16_Grammar.y":941  */
                                   { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 265: /* StatementExpression: PostDecrementExpression  */
  if (yyn == 265)
    /* "src/main/resources/Java_16_Grammar.y":942  */
                                   { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 266: /* StatementExpression: MethodInvocation  */
  if (yyn == 266)
    /* "src/main/resources/Java_16_Grammar.y":943  */
                                   { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 267: /* StatementExpression: ClassInstanceCreationExpression  */
  if (yyn == 267)
    /* "src/main/resources/Java_16_Grammar.y":944  */
                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 268: /* IfThenElseStatement: IF LPAREN Expression RPAREN Statement ElsePartOpt  */
  if (yyn == 268)
    /* "src/main/resources/Java_16_Grammar.y":948  */
                                                        { yyval = null; };
  break;


  case 269: /* ElsePartOpt: %empty  */
  if (yyn == 269)
    /* "src/main/resources/Java_16_Grammar.y":952  */
                      { yyval = null; };
  break;


  case 270: /* ElsePartOpt: ELSE Statement  */
  if (yyn == 270)
    /* "src/main/resources/Java_16_Grammar.y":953  */
                      { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 271: /* SwitchBlock: LBRACE SwitchRuleSeq RBRACE  */
  if (yyn == 271)
    /* "src/main/resources/Java_16_Grammar.y":957  */
                                                                   { yyval = null; };
  break;


  case 272: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeqOpt RBRACE  */
  if (yyn == 272)
    /* "src/main/resources/Java_16_Grammar.y":958  */
                                                                   { yyval = null; };
  break;


  case 273: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeqOpt SwitchLabelSeq RBRACE  */
  if (yyn == 273)
    /* "src/main/resources/Java_16_Grammar.y":959  */
                                                                   { yyval = null; };
  break;


  case 274: /* SwitchRuleSeq: SwitchRule  */
  if (yyn == 274)
    /* "src/main/resources/Java_16_Grammar.y":963  */
                               { yyval = new SwitchRules(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 275: /* SwitchRuleSeq: SwitchRuleSeq SwitchRule  */
  if (yyn == 275)
    /* "src/main/resources/Java_16_Grammar.y":964  */
                               { yyval = ((SwitchRules)(yystack.valueAt (1))).add(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 276: /* SwitchRule: SwitchLabel ARROW Expression SEMICOLON  */
  if (yyn == 276)
    /* "src/main/resources/Java_16_Grammar.y":968  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 277: /* SwitchRule: SwitchLabel ARROW Block  */
  if (yyn == 277)
    /* "src/main/resources/Java_16_Grammar.y":969  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 278: /* SwitchRule: SwitchLabel ARROW THROW Expression SEMICOLON  */
  if (yyn == 278)
    /* "src/main/resources/Java_16_Grammar.y":970  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (4))),new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1))))); };
  break;


  case 284: /* SwitchLabelSeq: SwitchLabel COLON  */
  if (yyn == 284)
    /* "src/main/resources/Java_16_Grammar.y":985  */
                                       { yyval = new SwitchLabels(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 285: /* SwitchLabelSeq: SwitchLabelSeq SwitchLabel COLON  */
  if (yyn == 285)
    /* "src/main/resources/Java_16_Grammar.y":986  */
                                       { yyval = ((SwitchLabels)(yystack.valueAt (2))).add(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 286: /* SwitchLabel: CASE CaseExpressionList  */
  if (yyn == 286)
    /* "src/main/resources/Java_16_Grammar.y":990  */
                               { yyval = ((SwitchLabel)(yystack.valueAt (0))); };
  break;


  case 287: /* SwitchLabel: DEFAULT  */
  if (yyn == 287)
    /* "src/main/resources/Java_16_Grammar.y":991  */
                                   { yyval = null; };
  break;


  case 288: /* CaseExpressionList: AssignmentExpression  */
  if (yyn == 288)
    /* "src/main/resources/Java_16_Grammar.y":995  */
                                                    { yyval = new SwitchLabel(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 289: /* CaseExpressionList: CaseExpressionList COMMA AssignmentExpression  */
  if (yyn == 289)
    /* "src/main/resources/Java_16_Grammar.y":996  */
                                                    { yyval = ((SwitchLabel)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 290: /* WhileStatement: WHILE LPAREN Expression RPAREN Statement  */
  if (yyn == 290)
    /* "src/main/resources/Java_16_Grammar.y":1003  */
                                                { yyval = new While(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 291: /* ForStatement: BasicForStatement  */
  if (yyn == 291)
    /* "src/main/resources/Java_16_Grammar.y":1007  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 292: /* ForStatement: EnhancedForStatement  */
  if (yyn == 292)
    /* "src/main/resources/Java_16_Grammar.y":1008  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 293: /* BasicForStatement: FOR LPAREN ForInitOpt SEMICOLON ExpressionOpt SEMICOLON StatementExpressionListOpt RPAREN Statement  */
  if (yyn == 293)
    /* "src/main/resources/Java_16_Grammar.y":1013  */
                          { yyval = null; };
  break;


  case 297: /* ExpressionOpt: %empty  */
  if (yyn == 297)
    /* "src/main/resources/Java_16_Grammar.y":1023  */
                  { yyval = null; };
  break;


  case 298: /* ExpressionOpt: Expression  */
  if (yyn == 298)
    /* "src/main/resources/Java_16_Grammar.y":1024  */
                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 299: /* StatementExpressionList: StatementExpression  */
  if (yyn == 299)
    /* "src/main/resources/Java_16_Grammar.y":1031  */
                                                        { yyval = ((StatementExpression)(yystack.valueAt (0))); };
  break;


  case 300: /* StatementExpressionList: StatementExpressionList COMMA StatementExpression  */
  if (yyn == 300)
    /* "src/main/resources/Java_16_Grammar.y":1032  */
                                                        { yyval = ((StatementExpressions)(yystack.valueAt (2))).add(((StatementExpression)(yystack.valueAt (0)))); };
  break;


  case 301: /* StatementExpressionListOpt: %empty  */
  if (yyn == 301)
    /* "src/main/resources/Java_16_Grammar.y":1036  */
                               { yyval = null; };
  break;


  case 302: /* StatementExpressionListOpt: StatementExpressionList  */
  if (yyn == 302)
    /* "src/main/resources/Java_16_Grammar.y":1037  */
                               { yyval = ((StatementExpressions)(yystack.valueAt (0))); };
  break;


  case 303: /* EnhancedForStatement: FOR LPAREN LocalVariableDeclaration COLON Expression RPAREN Statement  */
  if (yyn == 303)
    /* "src/main/resources/Java_16_Grammar.y":1041  */
                                                                            { yyval = null; };
  break;


  case 304: /* CatchesOpt: %empty  */
  if (yyn == 304)
    /* "src/main/resources/Java_16_Grammar.y":1045  */
               { yyval = null; };
  break;


  case 305: /* CatchesOpt: Catches  */
  if (yyn == 305)
    /* "src/main/resources/Java_16_Grammar.y":1046  */
               { yyval = ((CatchClauses)(yystack.valueAt (0))); };
  break;


  case 306: /* Catches: CatchClause  */
  if (yyn == 306)
    /* "src/main/resources/Java_16_Grammar.y":1050  */
                            { yyval = new CatchClauses(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 307: /* Catches: Catches CatchClause  */
  if (yyn == 307)
    /* "src/main/resources/Java_16_Grammar.y":1051  */
                            { yyval = ((CatchClauses)(yystack.valueAt (1))).add(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 308: /* CatchClause: CATCH LPAREN CatchFormalParameter RPAREN Block  */
  if (yyn == 308)
    /* "src/main/resources/Java_16_Grammar.y":1055  */
                                                     { yyval = new CatchClause(((CatchParameter)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 309: /* CatchFormalParameter: ModifierSeqOpt CatchType IDENTIFIER DimsOpt  */
  if (yyn == 309)
    /* "src/main/resources/Java_16_Grammar.y":1059  */
                                                  { yyval = new CatchParameter(((Modifiers)(yystack.valueAt (3))),((tree.Type.TypeList)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 310: /* CatchType: Type  */
  if (yyn == 310)
    /* "src/main/resources/Java_16_Grammar.y":1063  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 311: /* CatchType: CatchType VERTICAL Type  */
  if (yyn == 311)
    /* "src/main/resources/Java_16_Grammar.y":1064  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 322: /* Primary: Literal  */
  if (yyn == 322)
    /* "src/main/resources/Java_16_Grammar.y":1101  */
                                        { yyval = new Literal(((Token)(yystack.valueAt (0)))); };
  break;


  case 323: /* Primary: Type DimsOpt DOT CLASS  */
  if (yyn == 323)
    /* "src/main/resources/Java_16_Grammar.y":1102  */
                                        { yyval = new ClassLiteral(((tree.Type.Type)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2)))); };
  break;


  case 324: /* Primary: VOID DimsOpt DOT CLASS  */
  if (yyn == 324)
    /* "src/main/resources/Java_16_Grammar.y":1103  */
                                        { yyval = new ClassLiteral(null,((Dims)(yystack.valueAt (2)))); };
  break;


  case 325: /* Primary: THIS  */
  if (yyn == 325)
    /* "src/main/resources/Java_16_Grammar.y":1104  */
                                        { yyval = new This(null); };
  break;


  case 326: /* Primary: Type DOT THIS  */
  if (yyn == 326)
    /* "src/main/resources/Java_16_Grammar.y":1105  */
                                        { yyval = new This(((tree.Type.Type)(yystack.valueAt (2)))); };
  break;


  case 327: /* Primary: LPAREN Expression RPAREN  */
  if (yyn == 327)
    /* "src/main/resources/Java_16_Grammar.y":1106  */
                                        { yyval = new Parenthesized(((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 328: /* Primary: ClassInstanceCreationExpression  */
  if (yyn == 328)
    /* "src/main/resources/Java_16_Grammar.y":1107  */
                                        { yyval = null; };
  break;


  case 329: /* Primary: FieldAccess  */
  if (yyn == 329)
    /* "src/main/resources/Java_16_Grammar.y":1108  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 330: /* Primary: ArrayAccess  */
  if (yyn == 330)
    /* "src/main/resources/Java_16_Grammar.y":1109  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 331: /* Primary: MethodInvocation  */
  if (yyn == 331)
    /* "src/main/resources/Java_16_Grammar.y":1110  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 332: /* Primary: MethodReference  */
  if (yyn == 332)
    /* "src/main/resources/Java_16_Grammar.y":1111  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 333: /* Primary: ArrayCreationExpression  */
  if (yyn == 333)
    /* "src/main/resources/Java_16_Grammar.y":1112  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 334: /* ClassInstanceCreationExpression: UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 334)
    /* "src/main/resources/Java_16_Grammar.y":1122  */
                                                                  { yyval = null; };
  break;


  case 335: /* ClassInstanceCreationExpression: CompoundName DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 335)
    /* "src/main/resources/Java_16_Grammar.y":1123  */
                                                                  { yyval = null; };
  break;


  case 336: /* ClassInstanceCreationExpression: Primary DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 336)
    /* "src/main/resources/Java_16_Grammar.y":1124  */
                                                                  { yyval = null; };
  break;


  case 342: /* TypeArgumentsOpt: %empty  */
  if (yyn == 342)
    /* "src/main/resources/Java_16_Grammar.y":1142  */
                      { yyval = null; };
  break;


  case 343: /* TypeArgumentsOpt: TypeArguments  */
  if (yyn == 343)
    /* "src/main/resources/Java_16_Grammar.y":1143  */
                      { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (0))); };
  break;


  case 344: /* TypeArguments: LESS TypeArgumentList GREATER  */
  if (yyn == 344)
    /* "src/main/resources/Java_16_Grammar.y":1147  */
                                     { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (1))); };
  break;


  case 345: /* TypeArgumentList: TypeArgument  */
  if (yyn == 345)
    /* "src/main/resources/Java_16_Grammar.y":1151  */
                                           { yyval = new TypeArguments(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 346: /* TypeArgumentList: TypeArgumentList COMMA TypeArgument  */
  if (yyn == 346)
    /* "src/main/resources/Java_16_Grammar.y":1152  */
                                           { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (2))).add(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 347: /* TypeArgument: Type  */
  if (yyn == 347)
    /* "src/main/resources/Java_16_Grammar.y":1156  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),0,null); };
  break;


  case 348: /* TypeArgument: QUESTION  */
  if (yyn == 348)
    /* "src/main/resources/Java_16_Grammar.y":1157  */
                                               { yyval = new TypeArgument(null,1,null); };
  break;


  case 349: /* TypeArgument: QUESTION EXTENDS Type  */
  if (yyn == 349)
    /* "src/main/resources/Java_16_Grammar.y":1158  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),1,null); };
  break;


  case 350: /* TypeArgument: QUESTION SUPER Type  */
  if (yyn == 350)
    /* "src/main/resources/Java_16_Grammar.y":1159  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,null); };
  break;


  case 351: /* TypeArgument: AnnotationSeq QUESTION  */
  if (yyn == 351)
    /* "src/main/resources/Java_16_Grammar.y":1160  */
                                               { yyval = new TypeArgument(null,1,((Annotations)(yystack.valueAt (1)))); };
  break;


  case 352: /* TypeArgument: AnnotationSeq QUESTION EXTENDS Type  */
  if (yyn == 352)
    /* "src/main/resources/Java_16_Grammar.y":1161  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 353: /* TypeArgument: AnnotationSeq QUESTION SUPER Type  */
  if (yyn == 353)
    /* "src/main/resources/Java_16_Grammar.y":1162  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),3,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 354: /* FieldAccess: Primary DOT IDENTIFIER  */
  if (yyn == 354)
    /* "src/main/resources/Java_16_Grammar.y":1172  */
                                             { yyval = new FieldAccess(((tree.Expression.Expression)(yystack.valueAt (2))),  false,((Token)(yystack.valueAt (0)))); };
  break;


  case 355: /* FieldAccess: SUPER DOT IDENTIFIER  */
  if (yyn == 355)
    /* "src/main/resources/Java_16_Grammar.y":1173  */
                                             { yyval = new FieldAccess(null,true, ((Token)(yystack.valueAt (0)))); };
  break;


  case 356: /* FieldAccess: CompoundName DOT SUPER DOT IDENTIFIER  */
  if (yyn == 356)
    /* "src/main/resources/Java_16_Grammar.y":1174  */
                                             { yyval = new FieldAccess(new SimpleReference(((CompoundName)(yystack.valueAt (4)))),true,((Token)(yystack.valueAt (0)))); };
  break;


  case 357: /* ArrayAccess: CompoundName LBRACKET Expression RBRACKET  */
  if (yyn == 357)
    /* "src/main/resources/Java_16_Grammar.y":1178  */
                                                 { yyval = new ArrayAccess(new SimpleReference(((CompoundName)(yystack.valueAt (3)))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 358: /* ArrayAccess: Primary LBRACKET Expression RBRACKET  */
  if (yyn == 358)
    /* "src/main/resources/Java_16_Grammar.y":1179  */
                                                 { yyval = new ArrayAccess(((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 359: /* MethodInvocation: CompoundName Arguments  */
  if (yyn == 359)
    /* "src/main/resources/Java_16_Grammar.y":1183  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (1))));
                                                                         yyval = new MethodInvocation(ref,false,null,null,((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 360: /* MethodInvocation: CompoundName DOT TypeArguments IDENTIFIER Arguments  */
  if (yyn == 360)
    /* "src/main/resources/Java_16_Grammar.y":1185  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (4))));
                                                                         yyval = new MethodInvocation(ref,false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 361: /* MethodInvocation: Primary DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 361)
    /* "src/main/resources/Java_16_Grammar.y":1187  */
                                                                       { yyval = new MethodInvocation(((tree.Expression.Expression)(yystack.valueAt (4))),false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 362: /* MethodInvocation: SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 362)
    /* "src/main/resources/Java_16_Grammar.y":1188  */
                                                                       { yyval = new MethodInvocation(null,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 363: /* MethodInvocation: CompoundName DOT SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 363)
    /* "src/main/resources/Java_16_Grammar.y":1189  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (6))));
                                                                         yyval = new MethodInvocation(ref,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 364: /* Arguments: LPAREN RPAREN  */
  if (yyn == 364)
    /* "src/main/resources/Java_16_Grammar.y":1194  */
                                 { yyval = null; };
  break;


  case 365: /* Arguments: LPAREN ArgumentList RPAREN  */
  if (yyn == 365)
    /* "src/main/resources/Java_16_Grammar.y":1195  */
                                 { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (1))); };
  break;


  case 366: /* ArgumentList: Expression  */
  if (yyn == 366)
    /* "src/main/resources/Java_16_Grammar.y":1204  */
                                    { yyval = new ArgumentList(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 367: /* ArgumentList: ArgumentList COMMA Expression  */
  if (yyn == 367)
    /* "src/main/resources/Java_16_Grammar.y":1205  */
                                    { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 368: /* MethodReference: Primary DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 368)
    /* "src/main/resources/Java_16_Grammar.y":1210  */
                                                           { yyval = null; };
  break;


  case 369: /* MethodReference: Type DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 369)
    /* "src/main/resources/Java_16_Grammar.y":1211  */
                                                           { yyval = null; };
  break;


  case 370: /* MethodReference: SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 370)
    /* "src/main/resources/Java_16_Grammar.y":1212  */
                                                           { yyval = null; };
  break;


  case 371: /* MethodReference: Type DOT SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 371)
    /* "src/main/resources/Java_16_Grammar.y":1213  */
                                                           { yyval = null; };
  break;


  case 372: /* MethodReference: Type DBL_COLON TypeArgumentsOpt NEW  */
  if (yyn == 372)
    /* "src/main/resources/Java_16_Grammar.y":1214  */
                                                           { yyval = null; };
  break;


  case 373: /* ArrayCreationExpression: NEW Type DimExprs DimsOpt  */
  if (yyn == 373)
    /* "src/main/resources/Java_16_Grammar.y":1218  */
                                       { yyval = null; };
  break;


  case 374: /* ArrayCreationExpression: NEW Type Dims ArrayInitializer  */
  if (yyn == 374)
    /* "src/main/resources/Java_16_Grammar.y":1219  */
                                       { yyval = null; };
  break;


  case 379: /* Expression: LambdaExpression  */
  if (yyn == 379)
    /* "src/main/resources/Java_16_Grammar.y":1235  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 380: /* Expression: AssignmentExpression  */
  if (yyn == 380)
    /* "src/main/resources/Java_16_Grammar.y":1236  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 381: /* LambdaExpression: IDENTIFIER ARROW Expression  */
  if (yyn == 381)
    /* "src/main/resources/Java_16_Grammar.y":1241  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 382: /* LambdaExpression: IDENTIFIER ARROW Block  */
  if (yyn == 382)
    /* "src/main/resources/Java_16_Grammar.y":1243  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 383: /* LambdaExpression: LambdaParameters ARROW Expression  */
  if (yyn == 383)
    /* "src/main/resources/Java_16_Grammar.y":1244  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 384: /* LambdaExpression: LambdaParameters ARROW Block  */
  if (yyn == 384)
    /* "src/main/resources/Java_16_Grammar.y":1245  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 385: /* LambdaParameters: LPAREN RPAREN  */
  if (yyn == 385)
    /* "src/main/resources/Java_16_Grammar.y":1254  */
                                           { yyval = null; };
  break;


  case 386: /* LambdaParameters: LPAREN LambdaParameterList1 RPAREN  */
  if (yyn == 386)
    /* "src/main/resources/Java_16_Grammar.y":1255  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 387: /* LambdaParameters: LPAREN LambdaParameterList2 RPAREN  */
  if (yyn == 387)
    /* "src/main/resources/Java_16_Grammar.y":1256  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 388: /* LambdaParameterList1: IDENTIFIER  */
  if (yyn == 388)
    /* "src/main/resources/Java_16_Grammar.y":1261  */
                                             { yyval = new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 389: /* LambdaParameterList1: LambdaParameterList1 COMMA IDENTIFIER  */
  if (yyn == 389)
    /* "src/main/resources/Java_16_Grammar.y":1262  */
                                             { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 390: /* LambdaParameterList2: LambdaParameter  */
  if (yyn == 390)
    /* "src/main/resources/Java_16_Grammar.y":1266  */
                                                 { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 391: /* LambdaParameterList2: LambdaParameterList2 COMMA LambdaParameter  */
  if (yyn == 391)
    /* "src/main/resources/Java_16_Grammar.y":1267  */
                                                 { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 392: /* LambdaParameter: ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt  */
  if (yyn == 392)
    /* "src/main/resources/Java_16_Grammar.y":1278  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 393: /* LambdaParameter: ModifierSeqOpt VAR IDENTIFIER DimsOpt  */
  if (yyn == 393)
    /* "src/main/resources/Java_16_Grammar.y":1279  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),null,((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 394: /* LambdaParameter: ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 394)
    /* "src/main/resources/Java_16_Grammar.y":1281  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (4))),((tree.Type.UnannotatedType)(yystack.valueAt (3))),((Token)(yystack.valueAt (0))).image,((Annotations)(yystack.valueAt (2))),true,null); };
  break;


  case 395: /* AssignmentExpression: ConditionalExpression  */
  if (yyn == 395)
    /* "src/main/resources/Java_16_Grammar.y":1290  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 396: /* AssignmentExpression: Assignment  */
  if (yyn == 396)
    /* "src/main/resources/Java_16_Grammar.y":1291  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 397: /* Assignment: LeftHandSide AssignmentOperator Expression  */
  if (yyn == 397)
    /* "src/main/resources/Java_16_Grammar.y":1295  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 398: /* LeftHandSide: CompoundName  */
  if (yyn == 398)
    /* "src/main/resources/Java_16_Grammar.y":1299  */
                   { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 399: /* LeftHandSide: FieldAccess  */
  if (yyn == 399)
    /* "src/main/resources/Java_16_Grammar.y":1300  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 400: /* LeftHandSide: ArrayAccess  */
  if (yyn == 400)
    /* "src/main/resources/Java_16_Grammar.y":1301  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 401: /* AssignmentOperator: EQUAL  */
  if (yyn == 401)
    /* "src/main/resources/Java_16_Grammar.y":1305  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 402: /* AssignmentOperator: STAR_EQUAL  */
  if (yyn == 402)
    /* "src/main/resources/Java_16_Grammar.y":1306  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 403: /* AssignmentOperator: SLASH_EQUAL  */
  if (yyn == 403)
    /* "src/main/resources/Java_16_Grammar.y":1307  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 404: /* AssignmentOperator: PERCENT_EQUAL  */
  if (yyn == 404)
    /* "src/main/resources/Java_16_Grammar.y":1308  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 405: /* AssignmentOperator: PLUS_EQUAL  */
  if (yyn == 405)
    /* "src/main/resources/Java_16_Grammar.y":1309  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 406: /* AssignmentOperator: MINUS_EQUAL  */
  if (yyn == 406)
    /* "src/main/resources/Java_16_Grammar.y":1310  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 407: /* AssignmentOperator: LESS_LESS_EQUAL  */
  if (yyn == 407)
    /* "src/main/resources/Java_16_Grammar.y":1311  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 408: /* AssignmentOperator: GR_GR_EQUAL  */
  if (yyn == 408)
    /* "src/main/resources/Java_16_Grammar.y":1312  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 409: /* AssignmentOperator: GR_GR_GR_EQUAL  */
  if (yyn == 409)
    /* "src/main/resources/Java_16_Grammar.y":1313  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 410: /* AssignmentOperator: AMP_EQUAL  */
  if (yyn == 410)
    /* "src/main/resources/Java_16_Grammar.y":1314  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 411: /* AssignmentOperator: CARET_EQUAL  */
  if (yyn == 411)
    /* "src/main/resources/Java_16_Grammar.y":1315  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 412: /* AssignmentOperator: VERTICAL_EQUAL  */
  if (yyn == 412)
    /* "src/main/resources/Java_16_Grammar.y":1316  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 413: /* ConditionalExpression: ConditionalOrExpression ConditionalOrTail  */
  if (yyn == 413)
    /* "src/main/resources/Java_16_Grammar.y":1320  */
                                                { if ( ((tree.Expression.Binary)(yystack.valueAt (0))) == null ) yyval = ((tree.Expression.Expression)(yystack.valueAt (1)));
                                                  else              yyval = new Conditional(((tree.Expression.Expression)(yystack.valueAt (1))),((tree.Expression.Binary)(yystack.valueAt (0))).left,((tree.Expression.Binary)(yystack.valueAt (0))).right); };
  break;


  case 414: /* ConditionalOrTail: %empty  */
  if (yyn == 414)
    /* "src/main/resources/Java_16_Grammar.y":1325  */
                                                       { yyval = null; };
  break;


  case 415: /* ConditionalOrTail: QUESTION Expression COLON ConditionalExpression  */
  if (yyn == 415)
    /* "src/main/resources/Java_16_Grammar.y":1326  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 416: /* ConditionalOrTail: QUESTION Expression COLON LambdaExpression  */
  if (yyn == 416)
    /* "src/main/resources/Java_16_Grammar.y":1327  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 417: /* ConditionalOrExpression: ConditionalAndExpression  */
  if (yyn == 417)
    /* "src/main/resources/Java_16_Grammar.y":1331  */
                                                                    { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 418: /* ConditionalOrExpression: ConditionalOrExpression DBL_VERTICAL ConditionalAndExpression  */
  if (yyn == 418)
    /* "src/main/resources/Java_16_Grammar.y":1332  */
                                                                    { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 419: /* ConditionalAndExpression: InclusiveOrExpression  */
  if (yyn == 419)
    /* "src/main/resources/Java_16_Grammar.y":1336  */
                                                                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 420: /* ConditionalAndExpression: ConditionalAndExpression DBL_AMPERSAND InclusiveOrExpression  */
  if (yyn == 420)
    /* "src/main/resources/Java_16_Grammar.y":1337  */
                                                                   { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 421: /* InclusiveOrExpression: ExclusiveOrExpression  */
  if (yyn == 421)
    /* "src/main/resources/Java_16_Grammar.y":1341  */
                                                           { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 422: /* InclusiveOrExpression: InclusiveOrExpression VERTICAL ExclusiveOrExpression  */
  if (yyn == 422)
    /* "src/main/resources/Java_16_Grammar.y":1342  */
                                                           { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 423: /* ExclusiveOrExpression: AndExpression  */
  if (yyn == 423)
    /* "src/main/resources/Java_16_Grammar.y":1346  */
                                                { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 424: /* ExclusiveOrExpression: ExclusiveOrExpression CARET AndExpression  */
  if (yyn == 424)
    /* "src/main/resources/Java_16_Grammar.y":1347  */
                                                { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 425: /* AndExpression: EqualityExpression  */
  if (yyn == 425)
    /* "src/main/resources/Java_16_Grammar.y":1351  */
                                                 { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 426: /* AndExpression: AndExpression AMPERSAND EqualityExpression  */
  if (yyn == 426)
    /* "src/main/resources/Java_16_Grammar.y":1352  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 427: /* EqualityExpression: RelationalExpression  */
  if (yyn == 427)
    /* "src/main/resources/Java_16_Grammar.y":1356  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 428: /* EqualityExpression: EqualityExpression DBL_EQUAL RelationalExpression  */
  if (yyn == 428)
    /* "src/main/resources/Java_16_Grammar.y":1357  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 429: /* EqualityExpression: EqualityExpression NON_EQUAL RelationalExpression  */
  if (yyn == 429)
    /* "src/main/resources/Java_16_Grammar.y":1358  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 430: /* RelationalExpression: ShiftExpression  */
  if (yyn == 430)
    /* "src/main/resources/Java_16_Grammar.y":1362  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 431: /* RelationalExpression: RelationalExpression LESS ShiftExpression  */
  if (yyn == 431)
    /* "src/main/resources/Java_16_Grammar.y":1363  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 432: /* RelationalExpression: RelationalExpression GREATER ShiftExpression  */
  if (yyn == 432)
    /* "src/main/resources/Java_16_Grammar.y":1364  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 433: /* RelationalExpression: RelationalExpression LESS_EQUAL ShiftExpression  */
  if (yyn == 433)
    /* "src/main/resources/Java_16_Grammar.y":1365  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 434: /* RelationalExpression: RelationalExpression GREATER_EQUAL ShiftExpression  */
  if (yyn == 434)
    /* "src/main/resources/Java_16_Grammar.y":1366  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 435: /* RelationalExpression: InstanceofExpression  */
  if (yyn == 435)
    /* "src/main/resources/Java_16_Grammar.y":1367  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 436: /* InstanceofExpression: RelationalExpression INSTANCEOF Type  */
  if (yyn == 436)
    /* "src/main/resources/Java_16_Grammar.y":1371  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 437: /* InstanceofExpression: RelationalExpression INSTANCEOF Pattern  */
  if (yyn == 437)
    /* "src/main/resources/Java_16_Grammar.y":1372  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 438: /* ShiftExpression: AdditiveExpression  */
  if (yyn == 438)
    /* "src/main/resources/Java_16_Grammar.y":1376  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 439: /* ShiftExpression: ShiftExpression DBL_LESS AdditiveExpression  */
  if (yyn == 439)
    /* "src/main/resources/Java_16_Grammar.y":1377  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 440: /* ShiftExpression: ShiftExpression DBL_GREATER AdditiveExpression  */
  if (yyn == 440)
    /* "src/main/resources/Java_16_Grammar.y":1378  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 441: /* ShiftExpression: ShiftExpression TRIPL_GREATER AdditiveExpression  */
  if (yyn == 441)
    /* "src/main/resources/Java_16_Grammar.y":1379  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 442: /* AdditiveExpression: MultiplicativeExpression  */
  if (yyn == 442)
    /* "src/main/resources/Java_16_Grammar.y":1383  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 443: /* AdditiveExpression: AdditiveExpression PLUS MultiplicativeExpression  */
  if (yyn == 443)
    /* "src/main/resources/Java_16_Grammar.y":1384  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 444: /* AdditiveExpression: AdditiveExpression MINUS MultiplicativeExpression  */
  if (yyn == 444)
    /* "src/main/resources/Java_16_Grammar.y":1385  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 445: /* MultiplicativeExpression: UnaryExpression  */
  if (yyn == 445)
    /* "src/main/resources/Java_16_Grammar.y":1389  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 446: /* MultiplicativeExpression: MultiplicativeExpression STAR UnaryExpression  */
  if (yyn == 446)
    /* "src/main/resources/Java_16_Grammar.y":1390  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 447: /* MultiplicativeExpression: MultiplicativeExpression SLASH UnaryExpression  */
  if (yyn == 447)
    /* "src/main/resources/Java_16_Grammar.y":1391  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 448: /* MultiplicativeExpression: MultiplicativeExpression PERCENT UnaryExpression  */
  if (yyn == 448)
    /* "src/main/resources/Java_16_Grammar.y":1392  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 449: /* UnaryExpression: PreIncrementExpression  */
  if (yyn == 449)
    /* "src/main/resources/Java_16_Grammar.y":1396  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 450: /* UnaryExpression: PreDecrementExpression  */
  if (yyn == 450)
    /* "src/main/resources/Java_16_Grammar.y":1397  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 451: /* UnaryExpression: PLUS UnaryExpression  */
  if (yyn == 451)
    /* "src/main/resources/Java_16_Grammar.y":1398  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 452: /* UnaryExpression: MINUS UnaryExpression  */
  if (yyn == 452)
    /* "src/main/resources/Java_16_Grammar.y":1399  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 453: /* UnaryExpression: UnaryExpressionNotPlusMinus  */
  if (yyn == 453)
    /* "src/main/resources/Java_16_Grammar.y":1400  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 454: /* PreIncrementExpression: DBL_PLUS UnaryExpression  */
  if (yyn == 454)
    /* "src/main/resources/Java_16_Grammar.y":1404  */
                               { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 455: /* PreDecrementExpression: DBL_MINUS UnaryExpression  */
  if (yyn == 455)
    /* "src/main/resources/Java_16_Grammar.y":1408  */
                                 { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 457: /* UnaryExpressionNotPlusMinus: TILDE UnaryExpression  */
  if (yyn == 457)
    /* "src/main/resources/Java_16_Grammar.y":1413  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 458: /* UnaryExpressionNotPlusMinus: EXCLAMATION UnaryExpression  */
  if (yyn == 458)
    /* "src/main/resources/Java_16_Grammar.y":1414  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 459: /* UnaryExpressionNotPlusMinus: CastExpression  */
  if (yyn == 459)
    /* "src/main/resources/Java_16_Grammar.y":1415  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 460: /* UnaryExpressionNotPlusMinus: SwitchExpression  */
  if (yyn == 460)
    /* "src/main/resources/Java_16_Grammar.y":1416  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 461: /* PostfixExpression: Primary  */
  if (yyn == 461)
    /* "src/main/resources/Java_16_Grammar.y":1420  */
                               { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 462: /* PostfixExpression: CompoundName  */
  if (yyn == 462)
    /* "src/main/resources/Java_16_Grammar.y":1421  */
                               { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 463: /* PostfixExpression: PostIncrementExpression  */
  if (yyn == 463)
    /* "src/main/resources/Java_16_Grammar.y":1422  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 464: /* PostfixExpression: PostDecrementExpression  */
  if (yyn == 464)
    /* "src/main/resources/Java_16_Grammar.y":1423  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 465: /* PostIncrementExpression: PostfixExpression DBL_PLUS  */
  if (yyn == 465)
    /* "src/main/resources/Java_16_Grammar.y":1427  */
                                 { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 466: /* PostDecrementExpression: PostfixExpression DBL_MINUS  */
  if (yyn == 466)
    /* "src/main/resources/Java_16_Grammar.y":1431  */
                                  { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 467: /* CastExpression: TargetType UnaryExpression  */
  if (yyn == 467)
    /* "src/main/resources/Java_16_Grammar.y":1435  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 468: /* CastExpression: TargetType LambdaExpression  */
  if (yyn == 468)
    /* "src/main/resources/Java_16_Grammar.y":1436  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 469: /* TargetType: LPAREN TypeList RPAREN  */
  if (yyn == 469)
    /* "src/main/resources/Java_16_Grammar.y":1440  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (1))); };
  break;


  case 470: /* TypeList: Type  */
  if (yyn == 470)
    /* "src/main/resources/Java_16_Grammar.y":1444  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 471: /* TypeList: TypeList AMPERSAND Type  */
  if (yyn == 471)
    /* "src/main/resources/Java_16_Grammar.y":1445  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 472: /* SwitchExpression: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 472)
    /* "src/main/resources/Java_16_Grammar.y":1449  */
                                                  { yyval = new SwitchExpression(((tree.Expression.Expression)(yystack.valueAt (2))),((SwitchBlock)(yystack.valueAt (0)))); };
  break;


  case 473: /* AnnotationSeqOpt: %empty  */
  if (yyn == 473)
    /* "src/main/resources/Java_16_Grammar.y":1461  */
                       { yyval = null; };
  break;


  case 474: /* AnnotationSeqOpt: AnnotationSeq  */
  if (yyn == 474)
    /* "src/main/resources/Java_16_Grammar.y":1462  */
                       { yyval = ((Annotations)(yystack.valueAt (0))); };
  break;


  case 475: /* AnnotationSeq: Annotation  */
  if (yyn == 475)
    /* "src/main/resources/Java_16_Grammar.y":1466  */
                                { yyval = new Annotations(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 476: /* AnnotationSeq: AnnotationSeq Annotation  */
  if (yyn == 476)
    /* "src/main/resources/Java_16_Grammar.y":1467  */
                                { yyval = ((Annotations)(yystack.valueAt (1))).add(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 477: /* Annotation: AT CompoundName  */
  if (yyn == 477)
    /* "src/main/resources/Java_16_Grammar.y":1471  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (0))),(AnnoParameterList)null); };
  break;


  case 478: /* Annotation: AT CompoundName LPAREN RPAREN  */
  if (yyn == 478)
    /* "src/main/resources/Java_16_Grammar.y":1472  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (2))),(AnnoParameterList)null); };
  break;


  case 479: /* Annotation: AT CompoundName LPAREN AnnoParameterList RPAREN  */
  if (yyn == 479)
    /* "src/main/resources/Java_16_Grammar.y":1473  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),/*$4*/ (AnnoParameterList)null); };
  break;


  case 480: /* Annotation: AT CompoundName LPAREN ElementValue RPAREN  */
  if (yyn == 480)
    /* "src/main/resources/Java_16_Grammar.y":1474  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),(AnnoElementValue)null); };
  break;


  case 481: /* AnnoParameterList: IDENTIFIER EQUAL ElementValue  */
  if (yyn == 481)
    /* "src/main/resources/Java_16_Grammar.y":1478  */
                                                            { yyval = null; };
  break;


  case 482: /* AnnoParameterList: AnnoParameterList COMMA IDENTIFIER EQUAL ElementValue  */
  if (yyn == 482)
    /* "src/main/resources/Java_16_Grammar.y":1479  */
                                                            { yyval = null; };
  break;


  case 483: /* ElementValue: ConditionalExpression  */
  if (yyn == 483)
    /* "src/main/resources/Java_16_Grammar.y":1483  */
                                                 { yyval = null; };
  break;


  case 484: /* ElementValue: LBRACE ElementValueListOpt RBRACE  */
  if (yyn == 484)
    /* "src/main/resources/Java_16_Grammar.y":1484  */
                                                 { yyval = null; };
  break;


  case 485: /* ElementValue: LBRACE COMMA RBRACE  */
  if (yyn == 485)
    /* "src/main/resources/Java_16_Grammar.y":1485  */
                                                 { yyval = null; };
  break;


  case 486: /* ElementValue: Annotation  */
  if (yyn == 486)
    /* "src/main/resources/Java_16_Grammar.y":1486  */
                                                 { yyval = null; };
  break;



/* "src/main/java/parser/JavaParser.java":4207  */

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

  private static final short yypact_ninf_ = -694;
  private static final short yytable_ninf_ = -487;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
     393,    22,  -694,  -694,  -694,    -4,  -694,    22,  -694,  -694,
    -694,  -694,  -694,  -694,  -694,  -694,    45,  -694,  4381,  -694,
     244,  -694,  -694,   952,  -694,  -694,  2891,  -694,  -694,   394,
      22,    47,   425,    22,  -694,  -694,   212,  -694,  1082,  4381,
    -694,  2952,   174,   445,    65,  -694,   183,   374,   251,   350,
     391,   409,   437,  -694,  -694,  -694,  -694,  -694,  -694,  -694,
    -694,   212,  3612,  -694,  3018,  3678,  3678,  3678,  3678,  3678,
    3678,   482,  -694,  -694,  -694,  -694,  -694,  -694,  -694,  -694,
    -694,  -694,  -694,  -694,   460,  -694,  -694,   455,   496,  -694,
    -694,   353,  -694,   345,   376,   353,  -694,   424,  -694,  -694,
    -694,  -694,  -694,  -694,  -694,  -694,   297,   468,   514,   527,
     541,   305,   293,  -694,   430,   521,   535,  -694,  -694,  -694,
    -694,   562,  -694,  -694,  -694,  3612,  -694,   687,   411,   429,
     561,  -694,    96,  -694,   573,  1484,   443,   517,   569,   511,
     569,   569,  -694,  2840,   579,  4480,   376,   601,  1569,   615,
    -694,   581,  -694,  -694,  1923,  -694,   326,   605,  -694,   465,
    -694,  -694,  -694,  -694,  -694,  -694,  3150,   706,   146,   354,
     595,  -694,   203,   604,  3612,   617,   620,   353,  -694,   378,
    3216,  3612,    29,  -694,  -694,   398,   604,   622,  -694,  3612,
      50,   604,  3612,  3678,  -694,  3678,  3678,  3678,  3678,  3678,
    3678,  3678,  3678,  3678,  3678,   221,  3678,  3678,  3678,  3678,
    3678,  3678,  3678,  3678,  -694,  -694,  -694,  -694,   353,  -694,
     572,  -694,   641,  -694,  -694,  1581,    73,    22,    22,    22,
      22,   654,   443,  -694,   653,    28,   606,  -694,   687,   659,
     612,   675,  -694,   150,  1334,   463,   471,  -694,  4244,  3282,
    -694,  3282,  -694,  -694,  -694,  -694,  -694,  -694,  -694,  -694,
    -694,  -694,  -694,  -694,  3612,  -694,   687,  -694,  -694,  3150,
    -694,    77,  -694,   327,  -694,  2793,  3348,   322,   354,  -694,
     380,   677,   280,   629,   595,  -694,   633,   634,   686,  -694,
     623,  -694,   684,  -694,   487,  -694,   689,   604,   685,  -694,
     643,   681,  -694,   165,   631,   693,  -694,  -694,   647,   649,
     695,   468,   514,   527,   541,   305,   293,   293,   430,   430,
     430,   430,   670,  -694,    53,  -694,  -694,   521,   521,   521,
     535,   535,  -694,  -694,  -694,   680,  -694,   618,   610,    22,
      25,    31,   607,    18,  -694,  -694,  4121,  -694,   637,   379,
    -694,  -694,    28,   687,   511,  -694,   705,   185,  -694,   687,
     721,   719,   250,   511,   674,    82,  -694,   676,  -694,  2891,
    2166,  -694,  -694,  -694,  -694,  -694,  -694,  -694,   687,   687,
     706,  -694,   177,   722,  3414,  -694,  -694,  -694,  3480,   728,
     595,  -694,  -694,  -694,   677,  -694,   729,  -694,  -694,  -694,
    3612,  -694,   218,   677,   604,  -694,  -694,  -694,  -694,   677,
    -694,  3612,   143,   726,  -694,   726,  3150,  -694,  -694,   639,
    -694,    22,  -694,    22,  -694,    22,  -694,  1776,  4132,   687,
      28,  -694,  -694,  -694,   728,   687,   412,   730,  -694,   682,
    -694,  4160,  -694,   687,   502,  -694,   830,   739,   353,   353,
     714,   378,  -694,  -694,  3612,  -694,  -694,   734,  3612,    70,
      75,  2736,   744,   745,  3546,   749,   752,  3612,   566,   753,
    3612,  2005,  -694,  2280,  -694,  -694,  -694,  -694,   747,  -694,
    -694,  -694,  -694,  -694,    69,   415,  -694,  -694,  -694,   562,
     609,   621,  -694,  -694,  -694,   687,   687,  -694,  -694,   503,
     751,  -694,  -694,   759,   520,  -694,  -694,   720,  -694,   458,
    -694,  -694,  -694,   725,  -694,   727,  -694,  -694,  -694,  3612,
     303,   670,  -694,  -694,   771,   570,   574,   578,    94,   670,
      86,  -694,  -694,  -694,  -694,  -694,  -694,  1776,  -694,   766,
     740,   687,  -694,  -694,  -694,   758,  1610,   783,   595,   677,
    -694,  4299,  4193,  -694,  -694,   595,   171,  1631,  -694,  -694,
    -694,   748,  2736,   657,  -694,   790,  -694,   793,   752,   679,
    3740,  3612,  -694,   795,  3612,  3612,   812,  3924,   272,   797,
    3612,   813,    53,  -694,  -694,   817,  -694,  -694,  -694,  -694,
    -694,  -694,   816,  3414,  -694,  -694,  -694,   797,  4337,  4001,
    -694,  -694,  -694,  3678,  -694,    93,  -694,   118,  -694,  1710,
     329,   677,  -694,  -694,   824,  -694,    22,  -694,  -694,  -694,
     585,   829,  -694,   687,  -694,   827,  4040,  -694,  -694,   728,
     779,   220,  -694,  1373,   170,  -694,  -694,  -694,  -694,  -694,
    4299,  -694,  -694,   805,  -694,  4375,  -694,  4093,  -694,  -694,
    -694,  -694,  3612,  -694,  -694,   835,   828,  -694,   831,   832,
     839,  -694,   840,   862,  -694,   332,  -694,   402,  -694,   424,
     421,   836,   797,   272,  -694,  -694,   801,   865,  -694,  -694,
    -694,  -694,  -694,   229,  -694,   815,  1373,  -694,  -694,   765,
    -694,  -694,   170,  -694,  -694,  -694,   864,  -694,  -694,  -694,
     850,  -694,  -694,  1824,   863,   866,  1938,   871,  -694,  3084,
    -694,  -694,   771,  -694,   872,  -694,  -694,  -694,   874,   765,
     765,   779,   779,   220,  2118,  -694,  -694,  -694,  -694,   833,
     879,  -694,  -694,   876,  3612,  3612,  3612,  3802,  2736,   729,
     797,  -694,  3864,  2891,  -694,  -694,  -694,   820,   801,  2736,
     304,   589,   886,   687,   879,  -694,  3678,  -694,  -694,  3612,
    -694,   880,   353,  3980,  -694,  -694,   765,   765,   765,   779,
    -694,  2052,  -694,  -694,   889,   891,   888,  -694,  -694,   834,
    -694,  -694,  -694,  -694,   687,   897,  -694,  -694,  -694,  -694,
    4244,   705,  -694,  -694,   892,  -694,   838,   353,   830,    43,
     525,  -694,  -694,  -694,  -694,   765,  -694,   495,  2394,  2508,
     444,   431,   893,  2736,  3802,  2736,  -694,  -694,   232,   797,
     533,  -694,  3150,   894,  -694,    43,   285,  -694,  -694,   875,
     353,  4244,  -694,    29,  -694,  2622,  -694,    50,   677,   677,
    -694,  -694,   832,   907,  -694,   687,   353,  -694,  -694,  -694,
    -694,  -694,   808,  -694,   859,  -694,  -694,   814,   643,  -694,
       4,   908,   909,  2736,  -694,  -694,  -694,  -694,   677,   677,
    -694,  -694,  -694,   911,   912,  -694,  -694
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
       0,    30,    31,    11,    36,    37,     0,   475,     9,   477,
       0,     0,     0,     0,    16,     1,     0,    38,    11,    14,
     476,     0,     0,     0,     0,    39,    35,     0,     0,     0,
       0,     0,     0,    45,    47,    81,    82,    83,    48,   196,
     197,     0,     0,   478,   487,     0,     0,     0,     0,     0,
       0,     9,     2,     3,     6,     7,    80,    73,    77,    79,
       5,    78,    75,    76,     0,     8,    74,     0,     0,   325,
       4,   190,   322,   462,     0,    67,    69,   461,   328,   334,
     329,   330,   331,   332,   333,   483,   414,   417,   419,   421,
     423,   425,   427,   435,   430,   438,   442,   445,   449,   450,
     453,   456,   463,   464,   459,     0,   460,     0,   475,     0,
       0,    10,     0,    40,     0,    11,    49,     0,    85,    97,
      85,    85,    46,    11,     9,   462,   470,   329,   330,     0,
     379,     0,   380,   396,     0,   395,     0,     0,   488,     0,
     451,   452,   457,   458,   454,   455,     0,     0,    70,     0,
     473,   343,     0,   342,     0,     0,     0,   191,   192,     0,
       0,     0,     0,    71,   359,     0,   342,     0,    72,     0,
       0,   342,     0,     0,   413,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   465,   466,   468,   467,    68,   479,
       0,   480,     0,    41,    33,    11,    62,     0,     0,     0,
       0,     0,    50,    51,     0,     0,    95,    86,     0,     0,
     199,     0,   385,     9,     0,     0,     0,   390,     0,     0,
     327,     0,   401,   402,   403,   404,   405,   406,   407,   408,
     409,   410,   411,   412,     0,   469,     0,   485,   484,     0,
     481,   348,   347,     0,   345,     0,     0,     0,   190,   375,
       0,     0,   342,     0,   474,   355,     0,     0,     0,   195,
       0,   193,     0,   364,     0,   366,     0,   342,     0,   335,
       0,     0,   326,     0,     0,     0,   354,   336,     0,     0,
       0,   418,   420,   422,   424,   426,   428,   429,   431,   432,
     433,   434,     0,   436,    67,   321,   437,   439,   440,   441,
     443,   444,   446,   447,   448,     0,    42,    65,    63,     0,
       0,     0,     0,     0,    34,    52,    11,   213,    92,     0,
      88,    91,     0,     0,    97,    99,    98,   131,   128,     0,
       0,   200,   473,    97,     0,   473,   386,     0,   387,    11,
      11,   382,   381,   384,   383,   397,   471,   489,     0,     0,
       0,   344,   351,     0,   163,   374,   373,   376,     0,   103,
     473,   339,   338,   340,     0,   370,     0,   324,   194,   365,
       0,   357,     0,     0,   342,   369,   372,   323,   358,     0,
     368,     0,   157,   234,   155,   233,     0,    66,    64,     0,
      54,     0,    56,     0,    58,     0,   214,     0,    11,     0,
       0,    87,    90,    96,     0,     0,   138,   132,   133,     0,
     201,    11,   198,     0,     0,   144,     0,     0,   190,   190,
       0,   474,   389,   391,     0,   225,   241,     9,     0,     0,
       0,     0,     0,     0,     0,     0,    25,     0,     0,     0,
       0,     0,   240,    11,   227,   232,   235,   236,     0,   237,
     238,   239,   291,   292,   328,   331,   261,   262,   263,     0,
     264,   265,   349,   350,   346,     0,     0,   377,   168,     0,
     164,   165,   167,     0,    11,   337,   104,     0,   362,   279,
     472,   367,   356,     0,   360,     0,   361,   416,   415,     0,
     159,     0,   482,    53,    60,     0,     0,     0,     0,     0,
       0,   220,   221,   219,   216,   218,   215,     0,   101,    94,
       0,     0,    89,    84,   100,   138,    11,     0,   473,   135,
     203,     0,    11,   202,   142,   473,   473,    11,   141,   393,
     392,     0,     0,     0,   247,     0,   249,     0,     0,     0,
     294,     0,   251,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,   229,   230,     0,   226,   228,   242,   352,
     353,   161,     0,     0,   378,   105,   112,    23,     0,    11,
     107,   110,   341,     0,   287,     0,   274,     0,   280,    11,
       0,     0,   371,   158,     0,   156,     0,    55,    57,    59,
       0,     0,   217,     0,    93,     0,    11,   129,   134,   136,
       0,     0,   209,     0,     0,   210,   205,   207,   208,   204,
       0,   145,   146,     0,   148,     0,   152,    11,   150,   394,
     260,   243,     0,   248,   250,     0,   296,   299,     0,   295,
       0,   252,     0,     0,   254,    70,   319,     0,   317,     0,
     329,     0,     0,   256,   306,   258,   304,     0,   255,   231,
     162,   166,   111,     0,   115,     0,     0,   109,   117,   186,
     113,   114,     0,   116,   106,   108,   286,   288,   271,   275,
       0,   272,   281,    11,     0,    17,    11,     0,   284,     0,
     363,   160,    61,   211,     0,   102,   130,   137,     0,   186,
     186,     0,     0,     0,     0,   189,   212,   188,   206,     0,
       9,   149,   151,     0,     0,     0,   297,     0,     0,     0,
       0,   315,     0,    11,   314,   307,   257,   312,   305,     0,
     157,     0,     0,     0,     0,   169,     0,   273,   285,     0,
     277,     0,   190,     0,   175,   174,   186,   186,   186,     0,
     147,    11,   153,   244,     0,     0,     0,   298,   300,   269,
     245,   253,   316,   318,     0,     0,   259,   313,   290,   154,
       0,   187,   118,   289,     0,   276,   223,   190,     0,   473,
       0,   178,   173,   170,   172,   186,   120,   398,    11,    11,
     461,     0,     0,     0,   301,     0,   268,   310,     0,     0,
       0,   278,     0,     0,   176,   473,   190,   184,   181,     0,
     190,     0,   171,     0,   121,    11,   122,   342,     0,     0,
     246,   303,   302,     0,   270,     0,   190,   308,   119,   224,
     222,   180,     0,   182,     0,   177,   179,     0,   343,   123,
       0,     0,     0,     0,   311,   309,   185,   183,     0,     0,
     125,   124,   293,     0,     0,   126,   127
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -694,  -694,   652,    49,  -693,     1,    36,  -694,  -694,  -694,
     878,  -694,    10,  -694,   796,   867,  -694,  -694,   694,   179,
    -694,    23,   552,  -694,  -383,  -694,   156,  -506,  -694,   504,
     580,  -694,    37,   172,  -694,  -694,  -410,   387,  -525,  -694,
    -694,  -694,   181,  -694,  -694,  -694,  -694,  -694,   388,   392,
    -694,  -694,  -694,   383,  -694,  -694,   313,  -694,  -316,   419,
    -269,  -694,  -694,   358,  -694,  -543,  -609,   173,   130,   137,
    -534,   275,    -9,  -164,   -61,  -375,   493,  -694,  -694,  -694,
    -694,   328,  -504,  -694,  -694,  -694,  -694,   432,  -694,  -694,
     462,  -361,  -460,  -189,  -447,  -694,  -694,  -550,  -694,  -694,
     235,  -694,   371,  -694,   368,   375,  -478,  -694,  -694,  -694,
    -694,  -694,  -694,   164,  -694,  -694,  -694,   308,  -630,  -694,
    -694,  -694,  -636,  -694,  -694,   239,  -694,  -521,   516,  -172,
    -694,  -694,  -161,   -92,  -694,   608,    -2,   746,   540,  -277,
    -694,  -694,  -694,  -694,   707,   791,  -110,  -694,  -694,  -694,
     624,  -584,   603,  -694,  -694,   -38,  -694,  -694,   794,   799,
     800,   789,   792,   474,  -694,   241,   370,   461,   249,   655,
     738,  -694,   811,   825,   929,  -694,  -694,  -694,  -694,  -148,
       0,   -24,  -694,   -57,  -694
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short[] yydefgoto_ = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
      -1,    92,   145,   471,    17,    18,    19,    20,    21,    22,
      23,    24,    25,   224,    38,    53,   231,   232,   233,   525,
     339,    94,    95,    96,    54,    55,   685,   237,   349,   350,
     351,   354,   239,   356,   539,   505,   506,   599,   600,   687,
     688,   689,   772,   808,    56,   358,   436,   437,   438,   547,
      57,   363,   444,   445,   558,   647,   648,   690,   415,   414,
     498,   499,   500,   501,   691,   634,   720,   800,   801,   828,
     754,   726,   187,   177,   178,    58,    59,   360,   361,   442,
     552,   636,   533,   638,    60,   347,   428,   534,   535,   823,
     472,   706,   474,   666,   475,   476,   477,   478,   479,   816,
     510,   605,   606,   607,   608,   609,   707,   696,   480,   481,
     482,   658,   776,   659,   843,   483,   747,   673,   674,   785,
     818,   786,   675,   579,   667,   668,   326,    97,    98,    99,
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
      26,   183,    40,   105,   389,   277,   413,   158,   385,   473,
     299,   286,   287,   587,   569,   216,   325,   128,   307,   697,
     657,   719,   283,    26,   543,   303,   105,    39,    42,   308,
     309,   610,   646,    37,   188,    42,   420,   746,    26,   100,
     128,    42,   422,   745,   531,   633,     1,   637,   167,    16,
     175,    28,   532,   183,    34,   692,   669,    44,    45,   409,
     175,     1,   100,   100,   100,   100,   100,   100,   100,   167,
     798,     1,    36,  -267,   695,    34,   183,    28,  -267,   134,
    -267,   564,   176,   348,   131,   146,   566,    61,   583,   175,
     300,   179,   686,   175,   179,   179,    30,   798,   826,   698,
       1,   695,   692,    40,     1,   306,   869,   169,   412,   270,
     222,   787,   766,   767,   768,   650,   291,   508,   745,   297,
     131,   392,   646,   100,   701,   565,   514,   700,   105,   704,
     567,   298,   516,    33,   633,    26,   637,   449,   798,   686,
     297,   621,   128,   248,   425,    37,   179,   421,   827,    28,
     175,   131,   378,   423,   531,    40,    42,   188,   603,  -388,
     805,     1,   532,   604,   100,   167,   146,   275,   632,   280,
     284,   519,   793,   337,   249,   370,   635,   179,   175,   379,
     137,   725,   338,   603,    36,   764,   765,   778,   604,     1,
     272,   100,   244,   100,   100,   100,   100,   100,   100,   100,
     100,   100,   100,     1,   100,   100,   100,   100,   100,   100,
     100,   100,   377,   620,   446,   684,   291,   450,   179,   717,
     405,   669,   167,   693,    40,    26,   642,   175,   323,   131,
      48,   105,   802,   803,   804,   352,   175,   167,     1,     1,
    -473,   513,   507,   515,    35,   128,   587,     1,   520,    39,
     810,    40,   495,   845,  -143,   406,    40,   632,   285,  -143,
      40,   355,   684,   188,   657,   635,     5,   100,     1,   386,
     693,   832,   629,   512,    61,   718,    28,   179,   280,   496,
      49,   540,   585,    76,   750,    77,    50,   846,    78,   376,
     390,   779,   175,    79,   236,   852,   240,   241,    51,   167,
      81,   517,   788,     1,   188,   391,    82,   763,    83,    52,
     175,   175,   201,   202,   160,   161,   162,   163,   164,   165,
      86,     1,     1,   192,   179,   203,   204,   384,    40,   175,
     265,   614,   519,   322,   710,   180,   380,   137,   671,   181,
       1,   708,   182,   266,   193,   711,    26,   381,   180,   587,
     672,   167,   181,   709,   199,   182,   200,   284,   -70,   522,
     175,   276,   284,   -70,   167,   451,   841,   751,   844,    26,
     248,     1,     1,   518,   217,   587,   433,   205,   105,   136,
     275,   656,   440,   175,    42,   292,   185,   388,   430,   186,
     284,   434,   128,   -29,     1,   427,     1,    41,     1,   431,
     447,   492,   493,   272,    42,   138,   741,   446,   643,   100,
     809,     1,   179,   742,   100,  -486,   872,  -486,   244,  -266,
    -486,   545,  -486,   546,  -266,  -320,  -266,    40,    26,   541,
     352,   189,  -320,   219,   190,    42,    46,   191,   220,   559,
     560,    26,   318,   319,   320,   321,   139,   835,   179,   179,
     529,   189,   538,     2,   837,   132,   133,   191,   544,   291,
     332,   333,   334,     3,   140,   172,   553,   366,   173,   188,
       4,   268,   367,   248,   269,   368,     5,   537,     1,   167,
     369,   -11,   206,   207,   208,     6,     7,     8,     9,    10,
     551,   399,   141,    11,    12,   188,   400,    13,   180,   174,
     301,    14,   181,   302,    26,   833,   554,    15,   -70,   591,
     166,   555,   592,   -70,   167,    28,   195,    40,   589,   590,
     179,   188,    76,   603,    77,   370,   595,    78,   604,   830,
     179,   596,    79,   838,   831,   196,   839,   848,     1,    81,
    -462,  -462,   831,   209,   210,    82,    26,    83,   284,   211,
     212,   213,    26,   598,   197,   284,   451,    26,   198,    86,
     529,   861,   862,   226,   227,   221,   228,   229,   230,   577,
     188,   370,   234,   183,   529,   670,   327,   328,   329,   616,
       2,   617,   179,   616,   223,   618,   520,   616,   235,   619,
       3,   873,   874,   238,   521,   598,   713,     4,   521,    26,
     789,   640,   526,   249,   527,   251,   645,   214,   215,   248,
     811,   267,     6,     1,     8,     9,    10,    42,   424,   250,
     597,    12,   188,   167,    13,   289,    26,   335,    14,  -399,
     290,   179,   304,   724,    15,  -399,  -399,  -399,  -399,  -399,
    -399,  -399,  -399,  -399,  -399,  -399,   715,    26,   598,    42,
     523,   829,   336,    29,  -463,  -463,   722,    31,   346,    32,
     344,   299,   188,   529,   357,   307,  -464,  -464,   651,   652,
     330,   331,   857,   316,   317,   598,   860,   829,   362,   218,
     180,   353,    43,   179,   393,    47,   724,   359,   394,   395,
     396,   397,   398,    93,   404,   402,   645,   401,   403,   407,
      40,   408,   409,   248,   410,     1,   248,   411,   416,   722,
     418,   371,   429,   373,   435,   183,    93,    93,    93,    93,
      93,    93,    93,   179,     1,   412,   441,   417,   443,   448,
     497,   452,   271,   504,   509,   521,   168,   549,   188,   548,
     670,   858,    28,    26,   557,   561,   562,   570,   571,    76,
     179,    77,   574,   796,    78,   575,   580,   324,   588,    79,
     593,    28,   179,    26,   188,   849,    81,   594,    76,   546,
      77,   248,    82,    78,    83,   602,   355,    93,    79,   168,
     611,    42,   612,   623,   105,    81,    86,   101,   824,   627,
      26,    82,   784,    83,   655,   624,   365,   179,   128,   451,
     218,   653,   370,   649,   654,    86,   661,   817,   248,   248,
     101,   101,   101,   101,   101,   101,   101,   853,    93,   168,
     100,   855,   680,   664,   678,   451,   179,   218,   679,   384,
     179,    26,   714,   716,   718,   248,   729,   865,   734,   743,
     735,   737,   736,   738,   739,    93,   179,    93,    93,    93,
      93,    93,    93,    93,    93,    93,    93,   168,    93,    93,
      93,    93,    93,    93,    93,    93,   740,   671,   864,   749,
     752,   101,   753,   756,   709,   708,   762,   763,  -287,   340,
     341,   342,   343,   758,   771,    28,   484,   773,   770,   790,
     168,   795,    76,   812,    77,   813,   168,    78,   672,   814,
     168,   819,    79,   821,   840,   850,   854,   815,   822,    81,
     485,   863,   101,   866,   867,    82,   868,    83,   168,   870,
     871,    93,   875,   876,   135,   791,   345,   168,   142,    86,
     578,   225,   432,   626,   542,   792,   628,   625,   641,   101,
     615,   101,   101,   101,   101,   101,   101,   101,   101,   101,
     101,   681,   101,   101,   101,   101,   101,   101,   101,   101,
     732,   856,   851,   820,   584,   288,   601,   755,   728,   622,
       1,   295,   296,   486,   780,   702,   699,   484,   842,   530,
     305,   783,   703,   310,   748,   387,   314,   311,   494,   484,
     315,   419,     0,   453,   312,     0,   313,     0,   556,     0,
       0,   485,     0,     0,     0,   168,     0,     0,   601,     0,
       0,   168,     2,   485,     0,   101,     0,     0,     0,   601,
       0,     0,     3,   582,     0,   487,     0,     0,     0,     4,
     168,   168,   168,     0,     0,     5,     0,     0,     0,     0,
     372,   676,   374,     0,     6,     0,     8,     9,    10,     0,
       0,     0,    11,    12,     0,   375,    13,     0,     0,   682,
      14,   601,     0,    93,   486,     0,    15,   383,    93,     0,
       0,     0,     0,   524,     0,   524,   486,   524,   484,   168,
       0,   168,   -32,     0,     0,     0,   484,   168,   601,   530,
       0,     0,     0,   218,     0,   168,   727,     0,   168,     0,
       1,     0,   485,   631,     0,     0,     0,     0,   488,   601,
     485,     0,     0,     0,     0,     0,   487,     0,     0,     0,
       0,     0,   324,   168,     0,   484,     0,     0,   487,   324,
       0,     0,     0,     0,   744,     0,     0,     0,     0,     0,
       0,     0,     2,     0,     0,     0,     0,   168,   168,   485,
     683,     0,     3,     0,   727,     0,     0,   101,     0,     4,
       0,     0,   101,     0,     0,   486,     0,     0,     0,     0,
       0,   760,     0,   486,     6,   502,     8,     9,    10,   503,
      29,   489,    11,    12,     0,   723,    13,     0,     0,   168,
      14,   511,   631,   168,     0,   490,    15,   683,     0,   488,
       0,     0,   781,   168,     0,     0,     0,     0,     0,     0,
       0,   488,   486,     0,     0,     0,     0,   487,     0,   484,
       0,     0,   484,     0,     0,   487,     0,     0,     0,   665,
       0,     0,     0,     0,     0,     0,     0,     0,   723,     0,
       0,     0,     0,   485,     0,     0,   485,     0,     0,   563,
     168,     0,     0,   484,   484,   573,     0,     0,   576,     0,
       0,   581,     0,     0,   487,   484,     0,     0,   712,     0,
       0,     0,   489,     0,     0,   168,   218,   485,   485,     0,
       0,   847,     0,     0,   489,   168,   490,   484,     0,   485,
       0,     0,   168,     0,   324,     0,     0,   168,   490,   491,
     488,     0,     0,     0,     0,     0,   486,     0,   488,   486,
     613,   485,     0,     0,     0,   799,     0,     0,     0,     0,
       0,     0,     0,   101,   484,   484,     0,     0,     0,   484,
     484,   484,     0,     0,     0,     0,     0,     0,   168,     0,
     486,   486,   799,     0,     0,     0,     0,   488,   485,   485,
     825,   484,   486,   485,   485,   485,     0,     0,   487,     0,
       0,   487,   660,     0,     0,   662,   663,     0,     0,     0,
       0,   677,     0,   489,   486,   485,   168,     0,     0,   484,
       0,   489,     0,   799,   502,     0,     0,   490,     0,    28,
     491,     1,   487,   487,   665,   490,    76,     0,    77,     0,
       0,    78,   491,   485,   487,   168,    79,     0,     0,     0,
       0,   486,   486,    81,     0,   168,   486,   486,   486,    82,
     489,    83,     0,   807,     0,     0,   487,     0,    28,     0,
       0,     0,     0,    86,   490,    76,   168,    77,   486,     0,
      78,   488,   168,   733,   488,    79,   364,     0,     0,     0,
     168,     0,    81,     0,     0,     0,     0,     0,    82,     0,
      83,     0,     0,   487,   487,     0,   486,     0,   487,   487,
     487,     0,    86,     0,    93,   488,   488,     0,     0,     0,
       0,     0,     0,   168,   -43,     0,   721,   488,   101,     0,
     487,   491,     0,     0,     0,     0,     0,   168,     0,   491,
     761,     0,     1,     0,     0,     0,     0,     0,     0,   488,
       0,     0,     0,     0,   489,     0,     0,   489,   487,     0,
       0,     0,     0,     0,     0,   774,   775,   777,   490,     0,
       0,   490,     0,     0,     0,     0,     0,     0,   491,     0,
       0,     0,     0,     0,     2,     0,   488,   488,   489,   489,
     794,   488,   488,   488,     3,     0,     0,     0,     0,     0,
     489,     4,   490,   490,     0,     0,     0,     5,   101,     0,
       0,     0,     0,   488,   490,     0,     6,     0,     8,     9,
      10,   -44,   489,     0,    11,    12,     0,     0,    13,     0,
       0,     0,    14,     0,     0,     0,   490,  -400,    15,     1,
       0,   488,     0,  -400,  -400,  -400,  -400,  -400,  -400,  -400,
    -400,  -400,  -400,  -400,     0,   370,  -139,     0,     0,   489,
     489,   596,     0,     0,   489,   489,   489,     0,     1,     0,
       0,     0,   491,   490,   490,   491,   370,   644,   490,   490,
     490,     2,   596,     0,     0,     0,   489,     0,     0,     1,
       0,     3,     0,     0,     0,     0,     0,     0,     4,     0,
     490,     0,     0,     0,     0,     0,   491,   491,     0,     0,
       2,     0,     0,     6,   489,     8,     9,    10,   491,     0,
       3,    11,    12,     0,     0,    13,     0,     4,   490,    14,
       0,     2,     0,     0,     0,    15,     0,     0,     0,     0,
     491,     3,     6,     0,     8,     9,    10,     0,     4,     0,
     597,    12,     0,   454,    13,   370,  -282,     0,    14,     0,
       0,   456,     0,     6,    15,     8,     9,    10,     1,     0,
       0,   597,    12,     0,     0,    13,     0,   491,   491,    14,
       0,     0,   491,   491,   491,    15,     0,     0,     0,     0,
       0,     0,     0,     0,     0,    69,    70,     0,     0,     0,
       0,     0,     0,     0,   491,   457,    72,    73,    74,    75,
       2,   458,    76,   459,    77,   603,     0,    78,     0,   460,
     705,   461,    79,     0,     0,     0,    80,     4,     0,    81,
     462,   463,   491,     0,   528,    82,     0,    83,     0,     0,
      84,    85,     6,     0,     8,     9,    10,     0,   464,    86,
      11,    12,    87,   465,   466,    89,   467,     0,    14,     0,
      90,   468,     0,    91,    15,   469,   470,   454,     0,   370,
     757,    28,     0,     0,     0,   456,     0,     0,    76,     0,
      77,     0,     1,    78,    49,     0,     0,     0,    79,     0,
      50,     0,     0,     0,     0,    81,     0,     0,     0,     0,
       0,    82,    51,    83,     0,     0,     0,     0,     0,    69,
      70,     0,     0,    52,     0,    86,     0,     0,     0,   457,
      72,    73,    74,    75,     2,   458,    76,   459,    77,   603,
       0,    78,     0,   460,   705,   461,    79,     0,     0,     0,
      80,     4,     0,    81,   462,   463,     0,     0,     0,    82,
       0,    83,     0,     0,    84,    85,     6,     0,     8,     9,
      10,     0,   464,    86,    11,    12,    87,   465,   466,    89,
     467,     0,    14,     0,    90,   468,     0,    91,    15,   469,
     470,   454,     0,   370,  -283,     0,     0,     0,     0,   456,
       0,   252,     0,     0,     0,     0,     1,   253,   254,   255,
     256,   257,   258,   259,   260,   261,   262,   263,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    69,    70,     0,     0,     0,     0,     0,
       0,     0,     0,   457,    72,    73,    74,    75,     2,   458,
      76,   459,    77,  -283,     0,    78,     0,   460,     3,   461,
      79,     0,     0,     0,    80,     4,     0,    81,   462,   463,
       0,     0,     0,    82,     0,    83,     0,     0,    84,    85,
       6,     0,     8,     9,    10,     0,   464,    86,    11,    12,
      87,   465,   466,    89,   467,     0,    14,     0,    90,   468,
       0,    91,    15,   469,   470,   454,     0,   370,   806,     0,
      28,     0,     0,   456,     0,     0,     0,    76,     0,    77,
       1,   167,    78,    49,     0,     0,     0,    79,     0,    50,
       0,     0,     0,     0,    81,     0,     0,     0,     0,     0,
      82,    51,    83,     0,     0,     0,     0,    69,    70,     0,
       0,     0,    52,     0,    86,     0,     0,   457,    72,    73,
      74,    75,     2,   458,    76,   459,    77,   322,     0,    78,
       0,   460,     3,   461,    79,     0,     0,     0,    80,     4,
       0,    81,   462,   463,     0,     0,     1,    82,     0,    83,
       0,     0,    84,    85,     6,     0,     8,     9,    10,     0,
     464,    86,    11,    12,    87,   465,   466,    89,   467,     0,
      14,     0,    90,   468,     0,    91,    15,   469,   470,   454,
       0,   370,   455,    28,     0,     0,     0,   456,     0,     0,
      76,     0,    77,     0,     1,    78,     0,     0,     0,     0,
      79,     0,     0,     0,     0,     0,     0,    81,     0,     0,
       0,     0,     0,    82,     0,    83,     0,     0,     0,     0,
       0,    69,    70,     0,     0,     0,     0,    86,     0,     0,
       0,   457,    72,    73,    74,    75,     2,   458,    76,   459,
      77,   769,     0,    78,     0,   460,     3,   461,    79,     0,
       0,     0,    80,     4,     0,    81,   462,   463,     0,     0,
       0,    82,     0,    83,     0,     0,    84,    85,     6,     0,
       8,     9,    10,     0,   464,    86,    11,    12,    87,   465,
     466,    89,   467,     0,    14,     0,    90,   468,     0,    91,
      15,   469,   470,   454,     0,   370,   586,     0,     0,     0,
       0,   456,     0,     0,     0,     0,     0,     0,     1,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,    69,    70,     0,     0,     0,
       0,     0,     0,     0,     0,   457,    72,    73,    74,    75,
       2,   458,    76,   459,    77,     0,     0,    78,     0,   460,
       3,   461,    79,     0,     0,     0,    80,     4,     0,    81,
     462,   463,     0,     0,     0,    82,     0,    83,     0,     0,
      84,    85,     6,     0,     8,     9,    10,     0,   464,    86,
      11,    12,    87,   465,   466,    89,   467,     0,    14,     0,
      90,   468,     0,    91,    15,   469,   470,   454,     0,   370,
     834,     0,     0,     0,     0,   456,     0,     0,     0,     0,
       0,     0,     1,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    69,
      70,     0,     0,     0,     0,     0,     0,     0,     0,   457,
      72,    73,    74,    75,     2,   458,    76,   459,    77,     0,
       0,    78,     0,   460,     3,   461,    79,     0,     0,     0,
      80,     4,     0,    81,   462,   463,     0,     0,     0,    82,
       0,    83,     0,     0,    84,    85,     6,     0,     8,     9,
      10,     0,   464,    86,    11,    12,    87,   465,   466,    89,
     467,     0,    14,     0,    90,   468,     0,    91,    15,   469,
     470,   454,     0,   370,   836,     0,     0,     0,     0,   456,
       0,     0,     0,     0,     0,     0,     1,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    69,    70,     0,     0,     0,     0,     0,
       0,     0,     0,   457,    72,    73,    74,    75,     2,   458,
      76,   459,    77,     0,     0,    78,     0,   460,     3,   461,
      79,     0,     0,     0,    80,     4,     0,    81,   462,   463,
       0,     0,     0,    82,     0,    83,     0,     0,    84,    85,
       6,     0,     8,     9,    10,     0,   464,    86,    11,    12,
      87,   465,   466,    89,   467,     0,    14,     0,    90,   468,
       0,    91,    15,   469,   470,   454,     0,   370,   859,     0,
       0,     0,     0,   456,     0,     0,     0,     0,     0,     0,
       1,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    69,    70,     0,
       0,     0,     0,     0,     0,     0,     0,   457,    72,    73,
      74,    75,     2,   458,    76,   459,    77,     0,     0,    78,
       0,   460,     3,   461,    79,     0,     0,     0,    80,     4,
       0,    81,   462,   463,     0,     0,     0,    82,     0,    83,
       0,     0,    84,    85,     6,     0,     8,     9,    10,     0,
     464,    86,    11,    12,    87,   465,   466,    89,   467,     0,
      14,     0,    90,   468,     0,    91,    15,   469,   470,   454,
       0,   370,     0,     0,     0,     0,     0,   456,     0,     0,
       0,     0,     0,     0,     1,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,    69,    70,     0,     0,     0,     0,     0,     0,     0,
       0,   457,    72,    73,    74,    75,     0,   458,    76,   459,
      77,     0,     0,    78,     0,   460,     0,   461,    79,     0,
       0,     1,    80,     0,     0,    81,   462,   463,     0,   382,
       0,    82,     0,    83,     0,     0,    84,    85,     0,     0,
       0,     0,     0,     0,   464,    86,     0,     0,    87,   465,
     568,    89,   467,   143,   242,     0,    90,   468,    28,    91,
       0,   469,   470,     0,     0,    76,     0,    77,     1,     0,
      78,     0,    65,    66,     0,    79,     0,     0,     0,    67,
      68,     0,    81,     0,     0,     0,     0,     0,    82,     0,
      83,     0,     0,     0,     0,    69,    70,     0,     0,     0,
       0,     0,    86,     0,     0,   243,    72,    73,    74,    75,
       2,     0,    76,     0,    77,     0,     0,    78,     0,     1,
       3,     0,    79,     0,     0,     0,    80,     4,     0,    81,
       0,     0,     0,     0,     0,    82,     0,    83,     0,     0,
      84,    85,     6,     0,     8,     9,    10,     0,     0,    86,
      11,    12,    87,    88,    13,    89,     0,     0,    14,     0,
      90,     2,     0,    91,    15,    62,    63,    64,     0,     0,
       0,     3,     0,     0,     0,     0,     0,     0,     4,     0,
       1,     0,     0,     0,    65,    66,     0,     0,     0,     0,
       0,    67,    68,     6,     0,     8,     9,    10,     0,     0,
       0,    11,    12,     0,     0,    13,     0,    69,    70,    14,
       0,     0,     0,     0,     0,    15,     0,    71,    72,    73,
      74,    75,     0,     0,    76,     0,    77,     0,     0,    78,
       0,    62,     0,    64,    79,     0,     0,   157,    80,     0,
       0,    81,     0,     0,     0,     0,     1,    82,     0,    83,
      65,    66,    84,    85,     0,     0,     0,    67,    68,     0,
       0,    86,     0,     0,    87,    88,     0,    89,     0,     0,
       0,     0,    90,    69,    70,    91,     0,     0,     0,     0,
       0,     0,     0,    28,    72,    73,    74,    75,     0,     0,
      76,     0,    77,     0,     0,    78,     0,   143,     0,   370,
      79,     0,     0,     0,    80,     0,     0,    81,     0,     0,
       0,     0,     1,    82,     0,    83,    65,    66,    84,    85,
       0,     0,     0,    67,    68,     0,     0,    86,     0,     0,
      87,    88,     0,    89,     0,     0,     0,     0,    90,    69,
      70,    91,     0,     0,     0,     0,     0,     0,     0,   144,
      72,    73,    74,    75,     0,     0,    76,     0,    77,     0,
       0,    78,     0,    62,     0,    64,    79,     0,     0,     0,
      80,     0,     0,    81,     0,     0,     0,     0,     1,    82,
       0,    83,    65,    66,    84,    85,     0,     0,     0,    67,
      68,     0,     0,    86,     0,     0,    87,    88,     0,    89,
     759,     0,     0,     0,    90,    69,    70,    91,     0,     0,
       0,     0,     0,     0,     0,    28,    72,    73,    74,    75,
       0,     0,    76,     0,    77,     0,     0,    78,     0,   143,
     293,     0,    79,     0,     0,     0,    80,     0,     0,    81,
       0,     0,     0,     0,     1,    82,     0,    83,    65,    66,
      84,    85,     0,     0,     0,    67,    68,     0,     0,    86,
       0,     0,    87,    88,     0,    89,     0,     0,     0,     0,
      90,    69,    70,    91,     0,     0,     0,     0,     0,     0,
       0,   144,    72,    73,    74,    75,     0,     0,    76,     0,
      77,     0,     0,    78,     0,   143,     0,   370,    79,     0,
       0,     0,    80,     0,     0,    81,     0,     0,     0,     0,
       1,    82,     0,    83,    65,    66,    84,    85,     0,     0,
       0,    67,    68,     0,     0,    86,     0,     0,    87,    88,
       0,    89,     0,     0,     0,     0,    90,    69,    70,    91,
       0,     0,     0,     0,     0,     0,     0,   144,    72,    73,
      74,    75,     0,     0,    76,     0,    77,     0,     0,    78,
       0,   143,     0,     0,    79,     0,   289,     0,    80,     0,
       0,    81,     0,     0,     0,     0,     1,    82,     0,    83,
      65,    66,    84,    85,     0,     0,     0,    67,    68,     0,
       0,    86,     0,     0,    87,    88,     0,    89,     0,     0,
       0,     0,    90,    69,    70,    91,     0,     0,     0,     0,
       0,     0,     0,   144,    72,    73,    74,    75,     0,     0,
      76,     0,    77,     0,     0,    78,     0,   143,     0,   384,
      79,     0,     0,     0,    80,     0,     0,    81,     0,     0,
       0,     0,     1,    82,     0,    83,    65,    66,    84,    85,
       0,     0,     0,    67,    68,     0,     0,    86,     0,     0,
      87,    88,     0,    89,     0,     0,     0,     0,    90,    69,
      70,    91,     0,     0,     0,     0,     0,     0,     0,   144,
      72,    73,    74,    75,     0,     0,    76,     0,    77,     0,
       0,    78,     0,   143,     0,     0,    79,     0,   398,     0,
      80,     0,     0,    81,     0,     0,     0,     0,     1,    82,
       0,    83,    65,    66,    84,    85,     0,     0,     0,    67,
      68,     0,     0,    86,     0,     0,    87,    88,     0,    89,
       0,     0,     0,     0,    90,    69,    70,    91,     0,     0,
       0,     0,     0,     0,     0,   144,    72,    73,    74,    75,
       0,     0,    76,     0,    77,     0,     0,    78,     0,   143,
       0,     0,    79,     0,     0,     0,    80,   572,     0,    81,
       0,     0,     0,     0,     1,    82,     0,    83,    65,    66,
      84,    85,     0,     0,     0,    67,    68,     0,     0,    86,
       0,     0,    87,    88,     0,    89,     0,     0,     0,     0,
      90,    69,    70,    91,     0,     0,     0,     0,     0,     0,
       0,   144,    72,    73,    74,    75,     0,     0,    76,     0,
      77,     0,     0,    78,     0,   143,     0,     0,    79,     0,
       0,     0,    80,     0,     0,    81,     0,     0,     0,     0,
       1,    82,     0,    83,    65,    66,    84,    85,     0,     0,
       0,    67,    68,     0,     0,    86,     0,     0,    87,    88,
       0,    89,     0,     0,     0,     0,    90,    69,    70,    91,
       0,     0,     0,     0,     0,     0,     0,   144,    72,    73,
      74,    75,     0,     0,    76,     0,    77,     0,     0,    78,
       0,    62,     0,     0,    79,     0,     0,     0,    80,     0,
       0,    81,     0,     0,     0,     0,     1,    82,     0,    83,
      65,    66,    84,    85,     0,     0,     0,    67,    68,     0,
       0,    86,     0,     0,    87,    88,     0,    89,     0,     0,
       0,     0,    90,    69,    70,    91,     0,     0,     0,     0,
       0,     0,     0,    28,    72,    73,    74,    75,     0,     0,
      76,     0,    77,   454,     0,    78,     0,     0,     0,     0,
      79,     0,     0,     0,    80,     0,     0,    81,     1,     0,
       0,     0,     0,    82,     0,    83,     0,     0,    84,    85,
       0,     0,     0,     0,     0,     0,     0,    86,     0,     0,
      87,    88,     0,    89,     0,    69,    70,     0,    90,     0,
       0,    91,     0,     0,     0,    28,    72,    73,    74,    75,
       0,     0,    76,     0,    77,   454,     0,    78,     0,     0,
       0,     0,    79,     0,     0,     0,    80,     0,     0,    81,
       1,     0,     0,     0,     0,    82,     0,    83,     0,     0,
      84,    85,     0,     0,     0,     0,     0,     0,     0,    86,
       0,     0,    87,     0,     0,    89,     0,    69,    70,     0,
      90,     0,   322,    91,     0,     0,     0,    28,    72,    73,
      74,    75,     0,     0,    76,     0,    77,   454,   782,    78,
       0,     0,     0,     0,    79,     0,     0,     0,    80,     0,
       0,    81,     1,     0,     0,     0,     0,    82,     0,    83,
       0,     0,    84,    85,     0,     0,     0,     0,     0,     0,
       0,    86,     0,     0,    87,     0,     0,    89,     0,     0,
       0,     0,    90,     0,     0,    91,     0,     0,     0,    28,
      72,    73,    74,    75,     0,     0,    76,   454,    77,     0,
       0,    78,     0,     0,     0,     0,    79,     0,     0,     0,
      80,     0,     1,    81,     0,     0,     0,     0,     0,    82,
       0,    83,     0,     0,    84,    85,     0,     0,     0,     0,
       0,     0,     0,    86,     0,     0,    87,     0,     0,    89,
       0,     0,     0,     0,    90,     0,   322,    91,     0,    28,
      72,    73,    74,    75,   797,     0,    76,     0,    77,     0,
       0,    78,     0,     0,     0,     0,    79,     0,     1,     0,
      80,     0,     0,    81,     0,     0,   370,   694,     0,    82,
       0,    83,   596,     0,    84,    85,     0,     0,     0,     1,
       0,     0,     0,    86,     0,     0,    87,     0,     0,    89,
       0,     0,     0,     0,    90,    28,   322,    91,     0,     0,
       2,     0,    76,     0,    77,   370,  -140,    78,     0,     0,
       3,   596,    79,     0,     0,     0,     0,     4,     1,    81,
       0,     2,     0,     0,     0,    82,     0,    83,     0,     0,
       0,     3,     6,     0,     8,     9,    10,     0,     4,    86,
      11,    12,     0,     0,    13,     0,     0,     0,    14,     0,
       0,     0,     0,     6,    15,     8,     9,    10,   370,   731,
       2,   597,    12,     0,   596,    13,     0,     0,     0,    14,
       3,     1,     0,     0,     0,    15,     0,     4,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   426,     0,     0,
       0,     0,     6,     0,     8,     9,    10,     0,   536,     1,
     597,    12,     0,     0,    13,     0,     0,     0,    14,     0,
       1,     0,     0,     2,    15,     0,     0,     0,     0,     0,
       0,     0,     0,     3,     0,     0,   550,     0,     0,     0,
       4,     0,     0,     0,     0,     0,     0,     0,     1,     0,
       0,     2,     0,     0,     0,     6,     0,     8,     9,    10,
       0,     3,     2,   597,    12,     0,     0,    13,     4,   639,
       0,    14,     3,     0,     0,     0,     0,    15,     0,     4,
       0,     1,     0,     6,     0,     8,     9,    10,     0,     0,
       2,    11,    12,     0,     6,    13,     8,     9,    10,    14,
       3,     0,    11,    12,     0,    15,    13,     4,     0,     0,
      14,     0,     0,     0,     0,     0,    15,     0,     0,     0,
       0,     0,     6,     2,     8,     9,    10,     0,     0,     0,
      11,    12,     1,     3,    13,     0,     0,     0,    14,     0,
       4,     0,     0,     0,    15,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     6,     0,     8,     9,    10,
       0,     0,     0,    11,    12,     0,     0,    13,     0,    28,
       0,    14,     0,     0,     2,     0,    76,    15,    77,     0,
       0,    78,     0,     0,     3,     0,    79,   528,   235,     0,
       0,     4,     0,    81,     0,     0,     0,     0,     0,    82,
       0,    83,     0,     0,     0,     0,     6,     0,     8,     9,
      10,     0,     0,    86,    11,    12,     0,     0,    13,     0,
       0,     0,    14,     0,    28,    48,   235,     0,    15,     0,
       0,    76,     0,    77,     0,     0,    78,    49,     0,     0,
       0,    79,     0,    50,     0,     0,     0,     0,    81,     0,
       0,     0,     0,     0,    82,    51,    83,     0,     0,     0,
       0,     0,    28,    48,   235,     0,    52,     0,    86,    76,
       0,    77,     0,     0,    78,    49,     0,     0,     0,    79,
       0,    50,   630,     0,     0,     0,    81,     0,     0,     0,
       0,     0,    82,    51,    83,     0,     0,     0,     0,     0,
     730,     0,     0,     0,    52,     0,    86,    76,     0,    77,
       0,     2,    78,    49,     0,     0,     0,    79,     0,    50,
     630,     3,     0,     0,    81,     0,     0,     0,     4,     0,
      82,    51,    83,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    52,     6,    86,     8,     9,    10,     0,     0,
       0,    11,    12,   180,   -70,    13,     0,   181,   630,    14,
     182,     0,     0,   -70,     0,    15,     0,   -70,   -70,   167,
       0,     0,     0,     0,     0,     0,     0,     0,  -398,     0,
       0,     0,     0,     0,  -398,  -398,  -398,  -398,  -398,  -398,
    -398,  -398,  -398,  -398,  -398,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   -70
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
       0,    93,    26,    41,   281,   169,   322,    64,   277,   370,
     182,   172,   173,   473,   461,   125,   205,    41,   190,   603,
     570,   630,   170,    23,   434,   186,    64,    26,    10,   190,
     191,   509,   557,    23,    95,    10,    11,   673,    38,    41,
      64,    10,    11,   673,   427,   551,    18,   551,    19,     0,
       7,    55,   427,   145,    18,   598,   577,    10,    11,    55,
       7,    18,    64,    65,    66,    67,    68,    69,    70,    19,
     763,    18,    23,     4,   599,    39,   168,    55,     9,    14,
      11,    11,    91,    55,    55,    62,    11,    38,   471,     7,
     182,    91,   598,     7,    94,    95,   100,   790,    55,     6,
      18,   626,   645,   127,    18,    55,   102,    84,    55,   166,
      14,   747,   721,   722,   723,   562,   177,   394,   748,    90,
      55,   282,   647,   125,     6,    55,   403,   605,   166,   607,
      55,   102,   409,    88,   640,   135,   640,    55,   831,   645,
      90,    55,   166,   143,   126,   135,   146,   122,   105,    55,
       7,    55,    75,   122,   537,   179,    10,   218,    65,     9,
     769,    18,   537,    70,   166,    19,   143,   167,   551,   169,
     170,    28,   756,   100,    24,     5,   551,   177,     7,   102,
      86,    11,   109,    65,   135,   719,   720,   737,    70,    18,
     167,   193,   143,   195,   196,   197,   198,   199,   200,   201,
     202,   203,   204,    18,   206,   207,   208,   209,   210,   211,
     212,   213,   269,   529,   362,   598,   277,   365,   218,   629,
      55,   742,    19,   598,   248,   225,    55,     7,   205,    55,
      18,   269,   766,   767,   768,   235,     7,    19,    18,    18,
      55,   402,   390,   404,     0,   269,   706,    18,   412,   248,
     771,   275,    75,    21,     4,    90,   280,   640,    55,     9,
     284,   238,   645,   324,   814,   640,    83,   269,    18,   278,
     645,   805,   549,    55,   225,    55,    55,   277,   278,   102,
      68,   429,   471,    62,    55,    64,    74,    55,    67,   266,
      10,   738,     7,    72,   138,    10,   140,   141,    86,    19,
      79,   411,   749,    18,   365,    25,    85,     3,    87,    97,
       7,     7,    19,    20,    65,    66,    67,    68,    69,    70,
      99,    18,    18,    26,   324,    32,    33,     5,   352,     7,
       4,    28,    28,   112,   611,     3,     9,    86,    66,     7,
      18,    12,    10,    17,    47,   614,   346,    20,     3,   809,
      78,    19,     7,    24,    49,    10,    51,   357,    13,   416,
       7,     7,   362,    18,    19,   365,   813,   683,   815,   369,
     370,    18,    18,   411,   125,   835,   353,    84,   416,     5,
     380,   570,   359,     7,    10,     7,    10,     7,     9,    13,
     390,   354,   416,     0,    18,   346,    18,     3,    18,    20,
     363,   378,   379,   380,    10,    55,     4,   555,   556,   411,
     771,    18,   412,    11,   416,     4,   863,     6,   369,     4,
       9,     9,    11,    11,     9,     4,    11,   451,   428,   429,
     430,     7,    11,     4,    10,    10,    11,    13,     9,   448,
     449,   441,   201,   202,   203,   204,    55,   808,   448,   449,
     427,     7,   429,    60,    10,    10,    11,    13,   435,   520,
     211,   212,   213,    70,    55,    10,   443,     4,    13,   530,
      77,     6,     9,   473,     9,     4,    83,   428,    18,    19,
       9,    88,    52,    53,    54,    92,    93,    94,    95,    96,
     441,     4,    55,   100,   101,   556,     9,   104,     3,     3,
     102,   108,     7,   105,   504,    10,     4,   114,    13,     6,
      28,     9,     9,    18,    19,    55,    48,   541,   495,   496,
     520,   582,    62,    65,    64,     5,     6,    67,    70,     4,
     530,    11,    72,   102,     9,    21,   105,     4,    18,    79,
      45,    46,     9,    22,    23,    85,   546,    87,   548,    14,
      15,    16,   552,   504,    27,   555,   556,   557,    17,    99,
     537,   838,   839,   120,   121,     4,   123,   124,   125,     3,
     631,     5,    55,   665,   551,   577,   206,   207,   208,     9,
      60,    11,   582,     9,    11,    11,   750,     9,    19,    11,
      70,   868,   869,    82,     9,   546,    11,    77,     9,   599,
      11,   552,   423,    24,   425,    24,   557,    45,    46,   609,
     771,     6,    92,    18,    94,    95,    96,    10,    11,     4,
     100,   101,   683,    19,   104,     8,   626,    55,   108,    28,
      10,   631,    10,   633,   114,    34,    35,    36,    37,    38,
      39,    40,    41,    42,    43,    44,   623,   647,   599,    10,
      11,   799,    11,     1,    45,    46,   633,     5,     5,     7,
       6,   833,   723,   640,     5,   837,    45,    46,    11,    12,
     209,   210,   833,   199,   200,   626,   837,   825,     3,   127,
       3,    75,    30,   683,    55,    33,   686,    75,    55,    55,
       4,    68,     8,    41,    13,    10,   647,     8,    55,    68,
     724,     8,    55,   703,    55,    18,   706,    12,    28,   686,
     100,   249,    75,   251,     9,   807,    64,    65,    66,    67,
      68,    69,    70,   723,    18,    55,     5,   109,     9,    55,
       8,    55,    26,     5,     5,     9,    84,    55,   799,     9,
     742,   833,    55,   743,     5,    31,    12,     3,     3,    62,
     750,    64,     3,   762,    67,     3,     3,   205,    11,    72,
       9,    55,   762,   763,   825,   822,    79,     8,    62,    11,
      64,   771,    85,    67,    87,    55,   753,   125,    72,   127,
      55,    10,    55,    17,   822,    79,    99,    41,   797,     6,
     790,    85,   743,    87,   115,    55,   244,   797,   822,   799,
     248,    11,     5,    55,    11,    99,    11,   784,   808,   809,
      64,    65,    66,    67,    68,    69,    70,   826,   166,   167,
     822,   830,     6,    11,    11,   825,   826,   275,    11,     5,
     830,   831,     3,     6,    55,   835,    31,   846,     3,     3,
      12,     9,    11,     4,     4,   193,   846,   195,   196,   197,
     198,   199,   200,   201,   202,   203,   204,   205,   206,   207,
     208,   209,   210,   211,   212,   213,     4,    66,   845,     4,
      55,   125,   107,     9,    24,    12,     4,     3,    12,   227,
     228,   229,   230,    12,     5,    55,   370,    11,    55,     3,
     238,    11,    62,     4,    64,     4,   244,    67,    78,    11,
     248,     4,    72,    11,    11,    11,    31,    73,    70,    79,
     370,     4,   166,   105,    55,    85,   102,    87,   266,    11,
      11,   269,    11,    11,    46,   753,   232,   275,    61,    99,
     468,   135,   352,   546,   430,   754,   548,   545,   555,   193,
     521,   195,   196,   197,   198,   199,   200,   201,   202,   203,
     204,   593,   206,   207,   208,   209,   210,   211,   212,   213,
     647,   831,   825,   790,   471,   174,   504,   692,   640,   537,
      18,   180,   181,   370,   739,   607,   605,   461,   814,   427,
     189,   742,   607,   192,   676,   278,   197,   193,   380,   473,
     198,   339,    -1,   369,   195,    -1,   196,    -1,   446,    -1,
      -1,   461,    -1,    -1,    -1,   353,    -1,    -1,   546,    -1,
      -1,   359,    60,   473,    -1,   269,    -1,    -1,    -1,   557,
      -1,    -1,    70,   471,    -1,   370,    -1,    -1,    -1,    77,
     378,   379,   380,    -1,    -1,    83,    -1,    -1,    -1,    -1,
     249,   579,   251,    -1,    92,    -1,    94,    95,    96,    -1,
      -1,    -1,   100,   101,    -1,   264,   104,    -1,    -1,   597,
     108,   599,    -1,   411,   461,    -1,   114,   276,   416,    -1,
      -1,    -1,    -1,   421,    -1,   423,   473,   425,   562,   427,
      -1,   429,     0,    -1,    -1,    -1,   570,   435,   626,   537,
      -1,    -1,    -1,   541,    -1,   443,   634,    -1,   446,    -1,
      18,    -1,   562,   551,    -1,    -1,    -1,    -1,   370,   647,
     570,    -1,    -1,    -1,    -1,    -1,   461,    -1,    -1,    -1,
      -1,    -1,   570,   471,    -1,   609,    -1,    -1,   473,   577,
      -1,    -1,    -1,    -1,   672,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    60,    -1,    -1,    -1,    -1,   495,   496,   609,
     598,    -1,    70,    -1,   692,    -1,    -1,   411,    -1,    77,
      -1,    -1,   416,    -1,    -1,   562,    -1,    -1,    -1,    -1,
      -1,   709,    -1,   570,    92,   384,    94,    95,    96,   388,
     528,   370,   100,   101,    -1,   633,   104,    -1,    -1,   537,
     108,   400,   640,   541,    -1,   370,   114,   645,    -1,   461,
      -1,    -1,   740,   551,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,   473,   609,    -1,    -1,    -1,    -1,   562,    -1,   703,
      -1,    -1,   706,    -1,    -1,   570,    -1,    -1,    -1,   577,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   686,    -1,
      -1,    -1,    -1,   703,    -1,    -1,   706,    -1,    -1,   458,
     598,    -1,    -1,   737,   738,   464,    -1,    -1,   467,    -1,
      -1,   470,    -1,    -1,   609,   749,    -1,    -1,   616,    -1,
      -1,    -1,   461,    -1,    -1,   623,   724,   737,   738,    -1,
      -1,   819,    -1,    -1,   473,   633,   461,   771,    -1,   749,
      -1,    -1,   640,    -1,   742,    -1,    -1,   645,   473,   370,
     562,    -1,    -1,    -1,    -1,    -1,   703,    -1,   570,   706,
     519,   771,    -1,    -1,    -1,   763,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,   577,   808,   809,    -1,    -1,    -1,   813,
     814,   815,    -1,    -1,    -1,    -1,    -1,    -1,   686,    -1,
     737,   738,   790,    -1,    -1,    -1,    -1,   609,   808,   809,
     798,   835,   749,   813,   814,   815,    -1,    -1,   703,    -1,
      -1,   706,   571,    -1,    -1,   574,   575,    -1,    -1,    -1,
      -1,   580,    -1,   562,   771,   835,   724,    -1,    -1,   863,
      -1,   570,    -1,   831,   593,    -1,    -1,   562,    -1,    55,
     461,    18,   737,   738,   742,   570,    62,    -1,    64,    -1,
      -1,    67,   473,   863,   749,   753,    72,    -1,    -1,    -1,
      -1,   808,   809,    79,    -1,   763,   813,   814,   815,    85,
     609,    87,    -1,   771,    -1,    -1,   771,    -1,    55,    -1,
      -1,    -1,    -1,    99,   609,    62,   784,    64,   835,    -1,
      67,   703,   790,   652,   706,    72,   112,    -1,    -1,    -1,
     798,    -1,    79,    -1,    -1,    -1,    -1,    -1,    85,    -1,
      87,    -1,    -1,   808,   809,    -1,   863,    -1,   813,   814,
     815,    -1,    99,    -1,   822,   737,   738,    -1,    -1,    -1,
      -1,    -1,    -1,   831,     0,    -1,   113,   749,   742,    -1,
     835,   562,    -1,    -1,    -1,    -1,    -1,   845,    -1,   570,
     709,    -1,    18,    -1,    -1,    -1,    -1,    -1,    -1,   771,
      -1,    -1,    -1,    -1,   703,    -1,    -1,   706,   863,    -1,
      -1,    -1,    -1,    -1,    -1,   734,   735,   736,   703,    -1,
      -1,   706,    -1,    -1,    -1,    -1,    -1,    -1,   609,    -1,
      -1,    -1,    -1,    -1,    60,    -1,   808,   809,   737,   738,
     759,   813,   814,   815,    70,    -1,    -1,    -1,    -1,    -1,
     749,    77,   737,   738,    -1,    -1,    -1,    83,   822,    -1,
      -1,    -1,    -1,   835,   749,    -1,    92,    -1,    94,    95,
      96,     0,   771,    -1,   100,   101,    -1,    -1,   104,    -1,
      -1,    -1,   108,    -1,    -1,    -1,   771,    28,   114,    18,
      -1,   863,    -1,    34,    35,    36,    37,    38,    39,    40,
      41,    42,    43,    44,    -1,     5,     6,    -1,    -1,   808,
     809,    11,    -1,    -1,   813,   814,   815,    -1,    18,    -1,
      -1,    -1,   703,   808,   809,   706,     5,     6,   813,   814,
     815,    60,    11,    -1,    -1,    -1,   835,    -1,    -1,    18,
      -1,    70,    -1,    -1,    -1,    -1,    -1,    -1,    77,    -1,
     835,    -1,    -1,    -1,    -1,    -1,   737,   738,    -1,    -1,
      60,    -1,    -1,    92,   863,    94,    95,    96,   749,    -1,
      70,   100,   101,    -1,    -1,   104,    -1,    77,   863,   108,
      -1,    60,    -1,    -1,    -1,   114,    -1,    -1,    -1,    -1,
     771,    70,    92,    -1,    94,    95,    96,    -1,    77,    -1,
     100,   101,    -1,     3,   104,     5,     6,    -1,   108,    -1,
      -1,    11,    -1,    92,   114,    94,    95,    96,    18,    -1,
      -1,   100,   101,    -1,    -1,   104,    -1,   808,   809,   108,
      -1,    -1,   813,   814,   815,   114,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,   835,    55,    56,    57,    58,    59,
      60,    61,    62,    63,    64,    65,    -1,    67,    -1,    69,
      70,    71,    72,    -1,    -1,    -1,    76,    77,    -1,    79,
      80,    81,   863,    -1,    18,    85,    -1,    87,    -1,    -1,
      90,    91,    92,    -1,    94,    95,    96,    -1,    98,    99,
     100,   101,   102,   103,   104,   105,   106,    -1,   108,    -1,
     110,   111,    -1,   113,   114,   115,   116,     3,    -1,     5,
       6,    55,    -1,    -1,    -1,    11,    -1,    -1,    62,    -1,
      64,    -1,    18,    67,    68,    -1,    -1,    -1,    72,    -1,
      74,    -1,    -1,    -1,    -1,    79,    -1,    -1,    -1,    -1,
      -1,    85,    86,    87,    -1,    -1,    -1,    -1,    -1,    45,
      46,    -1,    -1,    97,    -1,    99,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    60,    61,    62,    63,    64,    65,
      -1,    67,    -1,    69,    70,    71,    72,    -1,    -1,    -1,
      76,    77,    -1,    79,    80,    81,    -1,    -1,    -1,    85,
      -1,    87,    -1,    -1,    90,    91,    92,    -1,    94,    95,
      96,    -1,    98,    99,   100,   101,   102,   103,   104,   105,
     106,    -1,   108,    -1,   110,   111,    -1,   113,   114,   115,
     116,     3,    -1,     5,     6,    -1,    -1,    -1,    -1,    11,
      -1,    28,    -1,    -1,    -1,    -1,    18,    34,    35,    36,
      37,    38,    39,    40,    41,    42,    43,    44,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    60,    61,
      62,    63,    64,    65,    -1,    67,    -1,    69,    70,    71,
      72,    -1,    -1,    -1,    76,    77,    -1,    79,    80,    81,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    90,    91,
      92,    -1,    94,    95,    96,    -1,    98,    99,   100,   101,
     102,   103,   104,   105,   106,    -1,   108,    -1,   110,   111,
      -1,   113,   114,   115,   116,     3,    -1,     5,     6,    -1,
      55,    -1,    -1,    11,    -1,    -1,    -1,    62,    -1,    64,
      18,    19,    67,    68,    -1,    -1,    -1,    72,    -1,    74,
      -1,    -1,    -1,    -1,    79,    -1,    -1,    -1,    -1,    -1,
      85,    86,    87,    -1,    -1,    -1,    -1,    45,    46,    -1,
      -1,    -1,    97,    -1,    99,    -1,    -1,    55,    56,    57,
      58,    59,    60,    61,    62,    63,    64,   112,    -1,    67,
      -1,    69,    70,    71,    72,    -1,    -1,    -1,    76,    77,
      -1,    79,    80,    81,    -1,    -1,    18,    85,    -1,    87,
      -1,    -1,    90,    91,    92,    -1,    94,    95,    96,    -1,
      98,    99,   100,   101,   102,   103,   104,   105,   106,    -1,
     108,    -1,   110,   111,    -1,   113,   114,   115,   116,     3,
      -1,     5,     6,    55,    -1,    -1,    -1,    11,    -1,    -1,
      62,    -1,    64,    -1,    18,    67,    -1,    -1,    -1,    -1,
      72,    -1,    -1,    -1,    -1,    -1,    -1,    79,    -1,    -1,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    -1,    -1,
      -1,    45,    46,    -1,    -1,    -1,    -1,    99,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    60,    61,    62,    63,
      64,   113,    -1,    67,    -1,    69,    70,    71,    72,    -1,
      -1,    -1,    76,    77,    -1,    79,    80,    81,    -1,    -1,
      -1,    85,    -1,    87,    -1,    -1,    90,    91,    92,    -1,
      94,    95,    96,    -1,    98,    99,   100,   101,   102,   103,
     104,   105,   106,    -1,   108,    -1,   110,   111,    -1,   113,
     114,   115,   116,     3,    -1,     5,     6,    -1,    -1,    -1,
      -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      60,    61,    62,    63,    64,    -1,    -1,    67,    -1,    69,
      70,    71,    72,    -1,    -1,    -1,    76,    77,    -1,    79,
      80,    81,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,
      90,    91,    92,    -1,    94,    95,    96,    -1,    98,    99,
     100,   101,   102,   103,   104,   105,   106,    -1,   108,    -1,
     110,   111,    -1,   113,   114,   115,   116,     3,    -1,     5,
       6,    -1,    -1,    -1,    -1,    11,    -1,    -1,    -1,    -1,
      -1,    -1,    18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,
      46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    60,    61,    62,    63,    64,    -1,
      -1,    67,    -1,    69,    70,    71,    72,    -1,    -1,    -1,
      76,    77,    -1,    79,    80,    81,    -1,    -1,    -1,    85,
      -1,    87,    -1,    -1,    90,    91,    92,    -1,    94,    95,
      96,    -1,    98,    99,   100,   101,   102,   103,   104,   105,
     106,    -1,   108,    -1,   110,   111,    -1,   113,   114,   115,
     116,     3,    -1,     5,     6,    -1,    -1,    -1,    -1,    11,
      -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    60,    61,
      62,    63,    64,    -1,    -1,    67,    -1,    69,    70,    71,
      72,    -1,    -1,    -1,    76,    77,    -1,    79,    80,    81,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    90,    91,
      92,    -1,    94,    95,    96,    -1,    98,    99,   100,   101,
     102,   103,   104,   105,   106,    -1,   108,    -1,   110,   111,
      -1,   113,   114,   115,   116,     3,    -1,     5,     6,    -1,
      -1,    -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,
      18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    60,    61,    62,    63,    64,    -1,    -1,    67,
      -1,    69,    70,    71,    72,    -1,    -1,    -1,    76,    77,
      -1,    79,    80,    81,    -1,    -1,    -1,    85,    -1,    87,
      -1,    -1,    90,    91,    92,    -1,    94,    95,    96,    -1,
      98,    99,   100,   101,   102,   103,   104,   105,   106,    -1,
     108,    -1,   110,   111,    -1,   113,   114,   115,   116,     3,
      -1,     5,    -1,    -1,    -1,    -1,    -1,    11,    -1,    -1,
      -1,    -1,    -1,    -1,    18,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    -1,    61,    62,    63,
      64,    -1,    -1,    67,    -1,    69,    -1,    71,    72,    -1,
      -1,    18,    76,    -1,    -1,    79,    80,    81,    -1,    26,
      -1,    85,    -1,    87,    -1,    -1,    90,    91,    -1,    -1,
      -1,    -1,    -1,    -1,    98,    99,    -1,    -1,   102,   103,
     104,   105,   106,     3,     4,    -1,   110,   111,    55,   113,
      -1,   115,   116,    -1,    -1,    62,    -1,    64,    18,    -1,
      67,    -1,    22,    23,    -1,    72,    -1,    -1,    -1,    29,
      30,    -1,    79,    -1,    -1,    -1,    -1,    -1,    85,    -1,
      87,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,
      -1,    -1,    99,    -1,    -1,    55,    56,    57,    58,    59,
      60,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,    18,
      70,    -1,    72,    -1,    -1,    -1,    76,    77,    -1,    79,
      -1,    -1,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,
      90,    91,    92,    -1,    94,    95,    96,    -1,    -1,    99,
     100,   101,   102,   103,   104,   105,    -1,    -1,   108,    -1,
     110,    60,    -1,   113,   114,     3,     4,     5,    -1,    -1,
      -1,    70,    -1,    -1,    -1,    -1,    -1,    -1,    77,    -1,
      18,    -1,    -1,    -1,    22,    23,    -1,    -1,    -1,    -1,
      -1,    29,    30,    92,    -1,    94,    95,    96,    -1,    -1,
      -1,   100,   101,    -1,    -1,   104,    -1,    45,    46,   108,
      -1,    -1,    -1,    -1,    -1,   114,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,     3,    -1,     5,    72,    -1,    -1,     9,    76,    -1,
      -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,
      22,    23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,
      -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,
      -1,    -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,
      62,    -1,    64,    -1,    -1,    67,    -1,     3,    -1,     5,
      72,    -1,    -1,    -1,    76,    -1,    -1,    79,    -1,    -1,
      -1,    -1,    18,    85,    -1,    87,    22,    23,    90,    91,
      -1,    -1,    -1,    29,    30,    -1,    -1,    99,    -1,    -1,
     102,   103,    -1,   105,    -1,    -1,    -1,    -1,   110,    45,
      46,   113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    -1,    -1,    62,    -1,    64,    -1,
      -1,    67,    -1,     3,    -1,     5,    72,    -1,    -1,    -1,
      76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,    85,
      -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,    29,
      30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,
     106,    -1,    -1,    -1,   110,    45,    46,   113,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,
       4,    -1,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,
      -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,
      90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,
      -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,
     110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    -1,    -1,    62,    -1,
      64,    -1,    -1,    67,    -1,     3,    -1,     5,    72,    -1,
      -1,    -1,    76,    -1,    -1,    79,    -1,    -1,    -1,    -1,
      18,    85,    -1,    87,    22,    23,    90,    91,    -1,    -1,
      -1,    29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,
      -1,   105,    -1,    -1,    -1,    -1,   110,    45,    46,   113,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,     3,    -1,    -1,    72,    -1,     8,    -1,    76,    -1,
      -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,
      22,    23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,
      -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,
      -1,    -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,
      62,    -1,    64,    -1,    -1,    67,    -1,     3,    -1,     5,
      72,    -1,    -1,    -1,    76,    -1,    -1,    79,    -1,    -1,
      -1,    -1,    18,    85,    -1,    87,    22,    23,    90,    91,
      -1,    -1,    -1,    29,    30,    -1,    -1,    99,    -1,    -1,
     102,   103,    -1,   105,    -1,    -1,    -1,    -1,   110,    45,
      46,   113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    -1,    -1,    62,    -1,    64,    -1,
      -1,    67,    -1,     3,    -1,    -1,    72,    -1,     8,    -1,
      76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,    85,
      -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,    29,
      30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,
      -1,    -1,    -1,    -1,   110,    45,    46,   113,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,
      -1,    -1,    72,    -1,    -1,    -1,    76,    11,    -1,    79,
      -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,
      90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,
      -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,
     110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    -1,    -1,    62,    -1,
      64,    -1,    -1,    67,    -1,     3,    -1,    -1,    72,    -1,
      -1,    -1,    76,    -1,    -1,    79,    -1,    -1,    -1,    -1,
      18,    85,    -1,    87,    22,    23,    90,    91,    -1,    -1,
      -1,    29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,
      -1,   105,    -1,    -1,    -1,    -1,   110,    45,    46,   113,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,     3,    -1,    -1,    72,    -1,    -1,    -1,    76,    -1,
      -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,
      22,    23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,
      -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,
      -1,    -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,
      62,    -1,    64,     3,    -1,    67,    -1,    -1,    -1,    -1,
      72,    -1,    -1,    -1,    76,    -1,    -1,    79,    18,    -1,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    90,    91,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    99,    -1,    -1,
     102,   103,    -1,   105,    -1,    45,    46,    -1,   110,    -1,
      -1,   113,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,     3,    -1,    67,    -1,    -1,
      -1,    -1,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,
      18,    -1,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,
      90,    91,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    99,
      -1,    -1,   102,    -1,    -1,   105,    -1,    45,    46,    -1,
     110,    -1,   112,   113,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,    -1,    64,     3,     4,    67,
      -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,    76,    -1,
      -1,    79,    18,    -1,    -1,    -1,    -1,    85,    -1,    87,
      -1,    -1,    90,    91,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    99,    -1,    -1,   102,    -1,    -1,   105,    -1,    -1,
      -1,    -1,   110,    -1,    -1,   113,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    -1,    -1,    62,     3,    64,    -1,
      -1,    67,    -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,
      76,    -1,    18,    79,    -1,    -1,    -1,    -1,    -1,    85,
      -1,    87,    -1,    -1,    90,    91,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    99,    -1,    -1,   102,    -1,    -1,   105,
      -1,    -1,    -1,    -1,   110,    -1,   112,   113,    -1,    55,
      56,    57,    58,    59,     4,    -1,    62,    -1,    64,    -1,
      -1,    67,    -1,    -1,    -1,    -1,    72,    -1,    18,    -1,
      76,    -1,    -1,    79,    -1,    -1,     5,     6,    -1,    85,
      -1,    87,    11,    -1,    90,    91,    -1,    -1,    -1,    18,
      -1,    -1,    -1,    99,    -1,    -1,   102,    -1,    -1,   105,
      -1,    -1,    -1,    -1,   110,    55,   112,   113,    -1,    -1,
      60,    -1,    62,    -1,    64,     5,     6,    67,    -1,    -1,
      70,    11,    72,    -1,    -1,    -1,    -1,    77,    18,    79,
      -1,    60,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,
      -1,    70,    92,    -1,    94,    95,    96,    -1,    77,    99,
     100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,    -1,
      -1,    -1,    -1,    92,   114,    94,    95,    96,     5,     6,
      60,   100,   101,    -1,    11,   104,    -1,    -1,    -1,   108,
      70,    18,    -1,    -1,    -1,   114,    -1,    77,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,     6,    -1,    -1,
      -1,    -1,    92,    -1,    94,    95,    96,    -1,     6,    18,
     100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,    -1,
      18,    -1,    -1,    60,   114,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    70,    -1,    -1,     6,    -1,    -1,    -1,
      77,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,
      -1,    60,    -1,    -1,    -1,    92,    -1,    94,    95,    96,
      -1,    70,    60,   100,   101,    -1,    -1,   104,    77,     6,
      -1,   108,    70,    -1,    -1,    -1,    -1,   114,    -1,    77,
      -1,    18,    -1,    92,    -1,    94,    95,    96,    -1,    -1,
      60,   100,   101,    -1,    92,   104,    94,    95,    96,   108,
      70,    -1,   100,   101,    -1,   114,   104,    77,    -1,    -1,
     108,    -1,    -1,    -1,    -1,    -1,   114,    -1,    -1,    -1,
      -1,    -1,    92,    60,    94,    95,    96,    -1,    -1,    -1,
     100,   101,    18,    70,   104,    -1,    -1,    -1,   108,    -1,
      77,    -1,    -1,    -1,   114,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    92,    -1,    94,    95,    96,
      -1,    -1,    -1,   100,   101,    -1,    -1,   104,    -1,    55,
      -1,   108,    -1,    -1,    60,    -1,    62,   114,    64,    -1,
      -1,    67,    -1,    -1,    70,    -1,    72,    18,    19,    -1,
      -1,    77,    -1,    79,    -1,    -1,    -1,    -1,    -1,    85,
      -1,    87,    -1,    -1,    -1,    -1,    92,    -1,    94,    95,
      96,    -1,    -1,    99,   100,   101,    -1,    -1,   104,    -1,
      -1,    -1,   108,    -1,    55,    18,    19,    -1,   114,    -1,
      -1,    62,    -1,    64,    -1,    -1,    67,    68,    -1,    -1,
      -1,    72,    -1,    74,    -1,    -1,    -1,    -1,    79,    -1,
      -1,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,    -1,
      -1,    -1,    55,    18,    19,    -1,    97,    -1,    99,    62,
      -1,    64,    -1,    -1,    67,    68,    -1,    -1,    -1,    72,
      -1,    74,   113,    -1,    -1,    -1,    79,    -1,    -1,    -1,
      -1,    -1,    85,    86,    87,    -1,    -1,    -1,    -1,    -1,
      55,    -1,    -1,    -1,    97,    -1,    99,    62,    -1,    64,
      -1,    60,    67,    68,    -1,    -1,    -1,    72,    -1,    74,
     113,    70,    -1,    -1,    79,    -1,    -1,    -1,    77,    -1,
      85,    86,    87,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    97,    92,    99,    94,    95,    96,    -1,    -1,
      -1,   100,   101,     3,     4,   104,    -1,     7,   113,   108,
      10,    -1,    -1,    13,    -1,   114,    -1,    17,    18,    19,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    28,    -1,
      -1,    -1,    -1,    -1,    34,    35,    36,    37,    38,    39,
      40,    41,    42,    43,    44,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55
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
     306,   307,    55,   277,     3,     6,    11,    55,    61,    63,
      69,    71,    80,    81,    98,   103,   104,   106,   111,   115,
     116,   130,   217,   218,   219,   221,   222,   223,   224,   225,
     235,   236,   237,   242,   255,   265,   279,   296,   297,   299,
     300,   301,   148,   148,   262,    75,   102,     8,   187,   188,
     189,   190,   272,   272,     5,   162,   163,   306,   266,     5,
     227,   272,    55,   259,   266,   259,   266,   273,   282,    28,
     200,     9,   310,    11,   129,   146,   146,   146,    18,   148,
     149,   151,   202,   209,   214,   215,     6,   130,   148,   161,
     306,   307,   156,   163,   148,     9,    11,   176,     9,    55,
       6,   130,   207,   148,     4,     9,   149,     5,   181,   199,
     199,    31,    12,   272,    11,    55,    11,    55,   104,   221,
       3,     3,    11,   272,     3,     3,   272,     3,   217,   250,
       3,   272,   149,   151,   203,   220,     6,   219,    11,   148,
     148,     6,     9,     9,     8,     6,    11,   100,   130,   164,
     165,   217,    55,    65,    70,   228,   229,   230,   231,   232,
     233,    55,    55,   272,    28,   186,     9,    11,    11,    11,
     185,    55,   214,    17,    55,   176,   164,     6,   175,   266,
     113,   149,   151,   154,   192,   202,   208,   209,   210,     6,
     130,   180,    55,   306,     6,   130,   165,   182,   183,    55,
     221,    11,    12,    11,    11,   115,   220,   224,   238,   240,
     272,    11,   272,   272,    11,   129,   220,   251,   252,   254,
     263,    66,    78,   244,   245,   249,   217,   272,    11,    11,
       6,   190,   217,   149,   151,   153,   154,   166,   167,   168,
     184,   191,   192,   202,     6,   165,   234,   278,     6,   229,
     233,     6,   231,   232,   233,    70,   218,   233,    12,    24,
     266,   187,   129,    11,     3,   148,     6,   163,    55,   193,
     193,   113,   148,   149,   307,    11,   198,   217,   208,    31,
      55,     6,   183,   272,     3,    12,    11,     9,     4,     4,
       4,     4,    11,     3,   217,   245,   249,   243,   244,     4,
      55,   185,    55,   107,   197,   198,     9,     6,    12,   106,
     217,   272,     4,     3,   197,   197,   193,   193,   193,   113,
      55,     5,   169,    11,   272,   272,   239,   272,   224,   221,
     227,   217,     4,   252,   130,   246,   248,   249,   221,    11,
       3,   160,   169,   278,   272,    11,   199,     4,   131,   149,
     194,   195,   197,   197,   197,   193,     6,   129,   170,   218,
     254,   259,     4,     4,    11,    73,   226,   148,   247,     4,
     194,    11,    70,   216,   199,   149,    55,   105,   196,   306,
       4,     9,   197,    10,     6,   218,     6,    10,   102,   105,
      11,   221,   240,   241,   221,    21,    55,   217,     4,   310,
      11,   196,    10,   199,    31,   199,   195,   259,   260,     6,
     259,   266,   266,     4,   148,   199,   105,    55,   102,   102,
      11,    11,   221,   266,   266,    11,    11
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
     223,   224,   224,   224,   224,   224,   224,   224,   225,   226,
     226,   227,   227,   227,   228,   228,   229,   229,   229,   230,
     230,   230,   231,   231,   232,   232,   233,   233,   234,   234,
     235,   236,   236,   237,   238,   238,   238,   239,   239,   240,
     240,   241,   241,   242,   243,   243,   244,   244,   245,   246,
     247,   247,   248,   248,   249,   250,   250,   251,   251,   252,
     252,   253,   254,   254,   254,   254,   254,   254,   254,   254,
     254,   254,   254,   254,   255,   255,   255,   256,   257,   257,
     258,   258,   259,   259,   260,   261,   261,   262,   262,   262,
     262,   262,   262,   262,   263,   263,   263,   264,   264,   265,
     265,   265,   265,   265,   266,   266,   267,   267,   268,   268,
     268,   268,   268,   269,   269,   270,   270,   271,   271,   272,
     272,   273,   273,   273,   273,   274,   274,   274,   275,   275,
     276,   276,   277,   277,   277,   278,   278,   279,   280,   280,
     280,   281,   281,   281,   281,   281,   281,   281,   281,   281,
     281,   281,   281,   282,   283,   283,   283,   284,   284,   285,
     285,   286,   286,   287,   287,   288,   288,   289,   289,   289,
     290,   290,   290,   290,   290,   290,   291,   291,   292,   292,
     292,   292,   293,   293,   293,   294,   294,   294,   294,   295,
     295,   295,   295,   295,   296,   297,   298,   298,   298,   298,
     298,   299,   299,   299,   299,   300,   301,   302,   302,   303,
     304,   304,   305,   306,   306,   307,   307,   308,   308,   308,
     308,   309,   309,   310,   310,   310,   310,   311,   311,   311
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
       3,     1,     1,     1,     1,     1,     1,     1,     6,     0,
       2,     3,     3,     4,     1,     2,     4,     3,     5,     0,
       1,     2,     1,     2,     2,     3,     2,     1,     1,     3,
       5,     1,     1,     9,     0,     1,     1,     0,     1,     1,
       3,     0,     1,     7,     0,     1,     1,     2,     5,     4,
       1,     3,     0,     1,     2,     3,     4,     1,     3,     1,
       1,     1,     1,     4,     4,     1,     3,     3,     1,     1,
       1,     1,     1,     1,     1,     3,     3,     5,     2,     2,
       2,     4,     0,     1,     3,     1,     3,     1,     1,     3,
       3,     2,     4,     4,     3,     3,     5,     4,     4,     2,
       5,     5,     5,     7,     2,     3,     1,     3,     4,     4,
       4,     6,     4,     4,     4,     1,     2,     3,     4,     1,
       1,     3,     3,     3,     3,     2,     3,     3,     1,     3,
       1,     3,     4,     4,     5,     1,     1,     3,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     2,     0,     4,     4,     1,     3,     1,
       3,     1,     3,     1,     3,     1,     3,     1,     3,     3,
       1,     3,     3,     3,     3,     1,     3,     3,     1,     3,
       3,     3,     1,     3,     3,     1,     3,     3,     3,     1,
       1,     2,     2,     1,     2,     2,     1,     2,     2,     1,
       1,     1,     1,     1,     1,     2,     2,     2,     2,     3,
       1,     3,     5,     0,     1,     1,     2,     2,     4,     5,
       5,     3,     5,     1,     3,     3,     1,     0,     1,     3
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


  private static final int YYLAST_ = 4535;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 35;
  private static final int YYNTOKENS_ = 127;

/* Unqualified %code blocks.  */
/* "src/main/resources/Java_16_Grammar.y":149  */

    public CompilationUnit ast;

/* "src/main/java/parser/JavaParser.java":6092  */

}
/* "src/main/resources/Java_16_Grammar.y":1495  */


