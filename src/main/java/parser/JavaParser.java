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
    S_ImportDeclarationSeqOpt(136), /* ImportDeclarationSeqOpt  */
    S_ImportDeclarationSeq(137),   /* ImportDeclarationSeq  */
    S_ImportDeclaration(138),      /* ImportDeclaration  */
    S_TopLevelComponentSeqOpt(139), /* TopLevelComponentSeqOpt  */
    S_TopLevelComponentSeq(140),   /* TopLevelComponentSeq  */
    S_TopLevelComponent(141),      /* TopLevelComponent  */
    S_Type(142),                   /* Type  */
    S_UnannotatedType(143),        /* UnannotatedType  */
    S_PrimitiveType(144),          /* PrimitiveType  */
    S_ClassDeclaration(145),       /* ClassDeclaration  */
    S_NormalClassDeclaration(146), /* NormalClassDeclaration  */
    S_TypeParametersOpt(147),      /* TypeParametersOpt  */
    S_TypeParameters(148),         /* TypeParameters  */
    S_TypeParameterList(149),      /* TypeParameterList  */
    S_TypeParameter(150),          /* TypeParameter  */
    S_TypeParameterTail(151),      /* TypeParameterTail  */
    S_ClassExtendsOpt(152),        /* ClassExtendsOpt  */
    S_ClassImplementsOpt(153),     /* ClassImplementsOpt  */
    S_ClassTypeList1(154),         /* ClassTypeList1  */
    S_ClassTypeList2(155),         /* ClassTypeList2  */
    S_ClassBodyOpt(156),           /* ClassBodyOpt  */
    S_ClassBody(157),              /* ClassBody  */
    S_ClassBodyDeclarationSeq(158), /* ClassBodyDeclarationSeq  */
    S_ClassBodyDeclaration(159),   /* ClassBodyDeclaration  */
    S_PureBodyDeclaration(160),    /* PureBodyDeclaration  */
    S_ConstructorDeclaration(161), /* ConstructorDeclaration  */
    S_ConstructorDeclarator(162),  /* ConstructorDeclarator  */
    S_ConstructorBody(163),        /* ConstructorBody  */
    S_ExplicitConstructorInvocation(164), /* ExplicitConstructorInvocation  */
    S_EnumDeclaration(165),        /* EnumDeclaration  */
    S_EnumBody(166),               /* EnumBody  */
    S_EnumConstantListOpt(167),    /* EnumConstantListOpt  */
    S_EnumConstantList(168),       /* EnumConstantList  */
    S_EnumConstant(169),           /* EnumConstant  */
    S_EnumBodyDeclarationsOpt(170), /* EnumBodyDeclarationsOpt  */
    S_RecordDeclaration(171),      /* RecordDeclaration  */
    S_RecordHeader(172),           /* RecordHeader  */
    S_RecordComponentListOpt(173), /* RecordComponentListOpt  */
    S_RecordComponent(174),        /* RecordComponent  */
    S_RecordBody(175),             /* RecordBody  */
    S_RecordBodyDeclarationSeq(176), /* RecordBodyDeclarationSeq  */
    S_RecordBodyDeclaration(177),  /* RecordBodyDeclaration  */
    S_FieldDeclaration(178),       /* FieldDeclaration  */
    S_VariableDeclaratorList(179), /* VariableDeclaratorList  */
    S_VariableDeclarator(180),     /* VariableDeclarator  */
    S_ArrayInitializer(181),       /* ArrayInitializer  */
    S_VariableInitializerListOpt(182), /* VariableInitializerListOpt  */
    S_VariableInitializerList(183), /* VariableInitializerList  */
    S_VariableInitializer(184),    /* VariableInitializer  */
    S_MethodDeclaration(185),      /* MethodDeclaration  */
    S_MethodHeader(186),           /* MethodHeader  */
    S_MethodDeclarator(187),       /* MethodDeclarator  */
    S_FormalParameterList(188),    /* FormalParameterList  */
    S_FormalParameter(189),        /* FormalParameter  */
    S_FormalParameterTail(190),    /* FormalParameterTail  */
    S_ThrowsOpt(191),              /* ThrowsOpt  */
    S_MethodBody(192),             /* MethodBody  */
    S_DimsOpt(193),                /* DimsOpt  */
    S_Dims(194),                   /* Dims  */
    S_Dim(195),                    /* Dim  */
    S_InterfaceDeclaration(196),   /* InterfaceDeclaration  */
    S_NormalInterfaceDeclaration(197), /* NormalInterfaceDeclaration  */
    S_InterfaceExtendsOpt(198),    /* InterfaceExtendsOpt  */
    S_InterfaceExtends(199),       /* InterfaceExtends  */
    S_InterfaceBody(200),          /* InterfaceBody  */
    S_InterfaceMemberDeclarationSeq(201), /* InterfaceMemberDeclarationSeq  */
    S_InterfaceMemberDeclaration(202), /* InterfaceMemberDeclaration  */
    S_ConstantDeclaration(203),    /* ConstantDeclaration  */
    S_InterfaceMethodDeclaration(204), /* InterfaceMethodDeclaration  */
    S_AnnotationInterfaceDeclaration(205), /* AnnotationInterfaceDeclaration  */
    S_AnnotationInterfaceBody(206), /* AnnotationInterfaceBody  */
    S_AnnotationInterfaceMemberDeclarationSeq(207), /* AnnotationInterfaceMemberDeclarationSeq  */
    S_AnnotationInterfaceMemberDeclaration(208), /* AnnotationInterfaceMemberDeclaration  */
    S_AnnotationInterfaceElementDeclaration(209), /* AnnotationInterfaceElementDeclaration  */
    S_DefaultValueOpt(210),        /* DefaultValueOpt  */
    S_Block(211),                  /* Block  */
    S_BlockStatementSeq(212),      /* BlockStatementSeq  */
    S_BlockStatement(213),         /* BlockStatement  */
    S_LocalVariableDeclaration(214), /* LocalVariableDeclaration  */
    S_Statement(215),              /* Statement  */
    S_SimpleStatement(216),        /* SimpleStatement  */
    S_LabeledStatement(217),       /* LabeledStatement  */
    S_StatementExpression(218),    /* StatementExpression  */
    S_IfThenElseStatement(219),    /* IfThenElseStatement  */
    S_ElsePartOpt(220),            /* ElsePartOpt  */
    S_SwitchBlock(221),            /* SwitchBlock  */
    S_SwitchRuleSeq(222),          /* SwitchRuleSeq  */
    S_SwitchRule(223),             /* SwitchRule  */
    S_SwitchBlockStatementGroupSeqOpt(224), /* SwitchBlockStatementGroupSeqOpt  */
    S_SwitchBlockStatementGroup(225), /* SwitchBlockStatementGroup  */
    S_SwitchLabelSeq(226),         /* SwitchLabelSeq  */
    S_SwitchLabel(227),            /* SwitchLabel  */
    S_CaseExpressionList(228),     /* CaseExpressionList  */
    S_WhileStatement(229),         /* WhileStatement  */
    S_ForStatement(230),           /* ForStatement  */
    S_BasicForStatement(231),      /* BasicForStatement  */
    S_ForInitOpt(232),             /* ForInitOpt  */
    S_ExpressionOpt(233),          /* ExpressionOpt  */
    S_StatementExpressionList(234), /* StatementExpressionList  */
    S_StatementExpressionListOpt(235), /* StatementExpressionListOpt  */
    S_EnhancedForStatement(236),   /* EnhancedForStatement  */
    S_CatchesOpt(237),             /* CatchesOpt  */
    S_Catches(238),                /* Catches  */
    S_CatchClause(239),            /* CatchClause  */
    S_CatchFormalParameter(240),   /* CatchFormalParameter  */
    S_CatchType(241),              /* CatchType  */
    S_FinallyOpt(242),             /* FinallyOpt  */
    S_Finally(243),                /* Finally  */
    S_ResourceSpecification(244),  /* ResourceSpecification  */
    S_ResourceSeq(245),            /* ResourceSeq  */
    S_Resource(246),               /* Resource  */
    S_Pattern(247),                /* Pattern  */
    S_Primary(248),                /* Primary  */
    S_ClassInstanceCreationExpression(249), /* ClassInstanceCreationExpression  */
    S_UnqualifiedClassInstanceCreationExpression(250), /* UnqualifiedClassInstanceCreationExpression  */
    S_ClassOrInterfaceTypeToInstantiate(251), /* ClassOrInterfaceTypeToInstantiate  */
    S_AnnotatedCompoundName(252),  /* AnnotatedCompoundName  */
    S_TypeArgumentsOpt(253),       /* TypeArgumentsOpt  */
    S_TypeArguments(254),          /* TypeArguments  */
    S_TypeArgumentList(255),       /* TypeArgumentList  */
    S_TypeArgument(256),           /* TypeArgument  */
    S_FieldAccess(257),            /* FieldAccess  */
    S_ArrayAccess(258),            /* ArrayAccess  */
    S_MethodInvocation(259),       /* MethodInvocation  */
    S_Arguments(260),              /* Arguments  */
    S_ArgumentList(261),           /* ArgumentList  */
    S_MethodReference(262),        /* MethodReference  */
    S_ArrayCreationExpression(263), /* ArrayCreationExpression  */
    S_DimExprs(264),               /* DimExprs  */
    S_DimExpr(265),                /* DimExpr  */
    S_Expression(266),             /* Expression  */
    S_LambdaExpression(267),       /* LambdaExpression  */
    S_LambdaParameters(268),       /* LambdaParameters  */
    S_LambdaParameterList1(269),   /* LambdaParameterList1  */
    S_LambdaParameterList2(270),   /* LambdaParameterList2  */
    S_LambdaParameter(271),        /* LambdaParameter  */
    S_AssignmentExpression(272),   /* AssignmentExpression  */
    S_Assignment(273),             /* Assignment  */
    S_LeftHandSide(274),           /* LeftHandSide  */
    S_AssignmentOperator(275),     /* AssignmentOperator  */
    S_ConditionalExpression(276),  /* ConditionalExpression  */
    S_ConditionalOrTail(277),      /* ConditionalOrTail  */
    S_ConditionalOrExpression(278), /* ConditionalOrExpression  */
    S_ConditionalAndExpression(279), /* ConditionalAndExpression  */
    S_InclusiveOrExpression(280),  /* InclusiveOrExpression  */
    S_ExclusiveOrExpression(281),  /* ExclusiveOrExpression  */
    S_AndExpression(282),          /* AndExpression  */
    S_EqualityExpression(283),     /* EqualityExpression  */
    S_RelationalExpression(284),   /* RelationalExpression  */
    S_InstanceofExpression(285),   /* InstanceofExpression  */
    S_ShiftExpression(286),        /* ShiftExpression  */
    S_AdditiveExpression(287),     /* AdditiveExpression  */
    S_MultiplicativeExpression(288), /* MultiplicativeExpression  */
    S_UnaryExpression(289),        /* UnaryExpression  */
    S_PreIncrementExpression(290), /* PreIncrementExpression  */
    S_PreDecrementExpression(291), /* PreDecrementExpression  */
    S_UnaryExpressionNotPlusMinus(292), /* UnaryExpressionNotPlusMinus  */
    S_PostfixExpression(293),      /* PostfixExpression  */
    S_PostIncrementExpression(294), /* PostIncrementExpression  */
    S_PostDecrementExpression(295), /* PostDecrementExpression  */
    S_CastExpression(296),         /* CastExpression  */
    S_TargetType(297),             /* TargetType  */
    S_TypeList(298),               /* TypeList  */
    S_SwitchExpression(299),       /* SwitchExpression  */
    S_AnnotationSeqOpt(300),       /* AnnotationSeqOpt  */
    S_AnnotationSeq(301),          /* AnnotationSeq  */
    S_Annotation(302),             /* Annotation  */
    S_AnnoParameterList(303),      /* AnnoParameterList  */
    S_ElementValue(304),           /* ElementValue  */
    S_ElementValueListOpt(305);    /* ElementValueListOpt  */


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
      SymbolKind.S_ImportDeclarationSeqOpt,
      SymbolKind.S_ImportDeclarationSeq,
      SymbolKind.S_ImportDeclaration,
      SymbolKind.S_TopLevelComponentSeqOpt,
      SymbolKind.S_TopLevelComponentSeq,
      SymbolKind.S_TopLevelComponent,
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
  "ImportDeclarationSeqOpt", "ImportDeclarationSeq", "ImportDeclaration",
  "TopLevelComponentSeqOpt", "TopLevelComponentSeq", "TopLevelComponent",
  "Type", "UnannotatedType", "PrimitiveType", "ClassDeclaration",
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


  case 31: /* CompilationUnit: ImportDeclarationSeqOpt TopLevelComponentSeq  */
  if (yyn == 31)
    /* "src/main/resources/Java_16_Grammar.y":320  */
                                                    { ast = new SimpleCompilationUnit(((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 32: /* Package: PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt  */
  if (yyn == 32)
    /* "src/main/resources/Java_16_Grammar.y":325  */
                                                    { yyval = new tree.Compilation.Package(((CompoundName)(yystack.valueAt (3))),((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 33: /* ImportDeclarationSeqOpt: %empty  */
  if (yyn == 33)
    /* "src/main/resources/Java_16_Grammar.y":335  */
                                                 { yyval = null; };
  break;


  case 34: /* ImportDeclarationSeqOpt: ImportDeclarationSeq  */
  if (yyn == 34)
    /* "src/main/resources/Java_16_Grammar.y":336  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (0))); };
  break;


  case 35: /* ImportDeclarationSeq: ImportDeclaration  */
  if (yyn == 35)
    /* "src/main/resources/Java_16_Grammar.y":340  */
                                                 { yyval = new ImportDeclarations(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 36: /* ImportDeclarationSeq: ImportDeclarationSeqOpt ImportDeclaration  */
  if (yyn == 36)
    /* "src/main/resources/Java_16_Grammar.y":341  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))).add(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 37: /* ImportDeclaration: IMPORT CompoundName SEMICOLON  */
  if (yyn == 37)
    /* "src/main/resources/Java_16_Grammar.y":345  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 38: /* ImportDeclaration: IMPORT STATIC CompoundName SEMICOLON  */
  if (yyn == 38)
    /* "src/main/resources/Java_16_Grammar.y":346  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 39: /* ImportDeclaration: IMPORT CompoundName DOT STAR SEMICOLON  */
  if (yyn == 39)
    /* "src/main/resources/Java_16_Grammar.y":347  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 40: /* ImportDeclaration: IMPORT STATIC CompoundName DOT STAR SEMICOLON  */
  if (yyn == 40)
    /* "src/main/resources/Java_16_Grammar.y":348  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 41: /* TopLevelComponentSeqOpt: %empty  */
  if (yyn == 41)
    /* "src/main/resources/Java_16_Grammar.y":352  */
                            { yyval = null; };
  break;


  case 42: /* TopLevelComponentSeqOpt: TopLevelComponentSeq  */
  if (yyn == 42)
    /* "src/main/resources/Java_16_Grammar.y":353  */
                            { yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (0))); };
  break;


  case 43: /* TopLevelComponentSeq: ModifierSeqOpt TopLevelComponent  */
  if (yyn == 43)
    /* "src/main/resources/Java_16_Grammar.y":357  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = new TopLevelComponents(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 44: /* TopLevelComponentSeq: TopLevelComponentSeq ModifierSeqOpt TopLevelComponent  */
  if (yyn == 44)
    /* "src/main/resources/Java_16_Grammar.y":358  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (2))).add(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 45: /* TopLevelComponent: ClassDeclaration  */
  if (yyn == 45)
    /* "src/main/resources/Java_16_Grammar.y":362  */
                           { yyval = new TopLevelComponent(((ClassDeclaration)(yystack.valueAt (0)))); };
  break;


  case 46: /* TopLevelComponent: InterfaceDeclaration  */
  if (yyn == 46)
    /* "src/main/resources/Java_16_Grammar.y":363  */
                           { yyval = new TopLevelComponent(((InterfaceDeclaration)(yystack.valueAt (0)))); };
  break;


  case 47: /* Type: UnannotatedType  */
  if (yyn == 47)
    /* "src/main/resources/Java_16_Grammar.y":410  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))); };
  break;


  case 48: /* Type: AnnotationSeq UnannotatedType  */
  if (yyn == 48)
    /* "src/main/resources/Java_16_Grammar.y":411  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))).addAnnotations(((Annotations)(yystack.valueAt (1)))); };
  break;


  case 49: /* UnannotatedType: PrimitiveType  */
  if (yyn == 49)
    /* "src/main/resources/Java_16_Grammar.y":415  */
                                 { yyval = new PrimitiveType(((Token)(yystack.valueAt (0)))); };
  break;


  case 50: /* UnannotatedType: CompoundName  */
  if (yyn == 50)
    /* "src/main/resources/Java_16_Grammar.y":417  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (0))),null); };
  break;


  case 51: /* UnannotatedType: CompoundName TypeArguments  */
  if (yyn == 51)
    /* "src/main/resources/Java_16_Grammar.y":418  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (1))),((tree.Type.TypeArguments)(yystack.valueAt (0)))); };
  break;


  case 52: /* UnannotatedType: UnannotatedType Dim  */
  if (yyn == 52)
    /* "src/main/resources/Java_16_Grammar.y":420  */
                                     { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (1))).addDimension(((Dim)(yystack.valueAt (0)))); };
  break;


  case 53: /* PrimitiveType: BYTE  */
  if (yyn == 53)
    /* "src/main/resources/Java_16_Grammar.y":429  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 54: /* PrimitiveType: SHORT  */
  if (yyn == 54)
    /* "src/main/resources/Java_16_Grammar.y":430  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 55: /* PrimitiveType: INT  */
  if (yyn == 55)
    /* "src/main/resources/Java_16_Grammar.y":431  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 56: /* PrimitiveType: LONG  */
  if (yyn == 56)
    /* "src/main/resources/Java_16_Grammar.y":432  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 57: /* PrimitiveType: CHAR  */
  if (yyn == 57)
    /* "src/main/resources/Java_16_Grammar.y":433  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 58: /* PrimitiveType: FLOAT  */
  if (yyn == 58)
    /* "src/main/resources/Java_16_Grammar.y":435  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 59: /* PrimitiveType: DOUBLE  */
  if (yyn == 59)
    /* "src/main/resources/Java_16_Grammar.y":436  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 60: /* PrimitiveType: BOOLEAN  */
  if (yyn == 60)
    /* "src/main/resources/Java_16_Grammar.y":437  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 61: /* ClassDeclaration: NormalClassDeclaration  */
  if (yyn == 61)
    /* "src/main/resources/Java_16_Grammar.y":458  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 62: /* ClassDeclaration: EnumDeclaration  */
  if (yyn == 62)
    /* "src/main/resources/Java_16_Grammar.y":459  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 63: /* ClassDeclaration: RecordDeclaration  */
  if (yyn == 63)
    /* "src/main/resources/Java_16_Grammar.y":460  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 64: /* NormalClassDeclaration: ModifierSeqOpt CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody  */
  if (yyn == 64)
    /* "src/main/resources/Java_16_Grammar.y":465  */
                              { yyval = new NormalClassDeclaration(((Token)(yystack.valueAt (4))),((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 65: /* TypeParametersOpt: %empty  */
  if (yyn == 65)
    /* "src/main/resources/Java_16_Grammar.y":469  */
                       { yyval = null; };
  break;


  case 66: /* TypeParametersOpt: TypeParameters  */
  if (yyn == 66)
    /* "src/main/resources/Java_16_Grammar.y":470  */
                       { yyval = ((TypeParameters)(yystack.valueAt (0))); };
  break;


  case 67: /* TypeParameters: LESS TypeParameterList GREATER  */
  if (yyn == 67)
    /* "src/main/resources/Java_16_Grammar.y":474  */
                                      { yyval = ((TypeParameters)(yystack.valueAt (1))); };
  break;


  case 68: /* TypeParameterList: TypeParameter  */
  if (yyn == 68)
    /* "src/main/resources/Java_16_Grammar.y":478  */
                                            { yyval = new TypeParameters(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 69: /* TypeParameterList: TypeParameterList COMMA TypeParameter  */
  if (yyn == 69)
    /* "src/main/resources/Java_16_Grammar.y":479  */
                                            { yyval = ((TypeParameters)(yystack.valueAt (2))).add(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 70: /* TypeParameter: AnnotationSeq TypeParameterTail  */
  if (yyn == 70)
    /* "src/main/resources/Java_16_Grammar.y":489  */
                                      { yyval = new TypeParameter(((Annotations)(yystack.valueAt (1))),((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 71: /* TypeParameter: TypeParameterTail  */
  if (yyn == 71)
    /* "src/main/resources/Java_16_Grammar.y":490  */
                                      { yyval = new TypeParameter(null,((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 72: /* TypeParameterTail: IDENTIFIER  */
  if (yyn == 72)
    /* "src/main/resources/Java_16_Grammar.y":494  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (0))),null); };
  break;


  case 73: /* TypeParameterTail: IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 73)
    /* "src/main/resources/Java_16_Grammar.y":495  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (3))),((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0)))); };
  break;


  case 74: /* TypeParameterTail: IDENTIFIER EXTENDS ClassTypeList2  */
  if (yyn == 74)
    /* "src/main/resources/Java_16_Grammar.y":496  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 75: /* ClassExtendsOpt: %empty  */
  if (yyn == 75)
    /* "src/main/resources/Java_16_Grammar.y":500  */
                    { yyval = null; };
  break;


  case 76: /* ClassExtendsOpt: EXTENDS Type  */
  if (yyn == 76)
    /* "src/main/resources/Java_16_Grammar.y":501  */
                    { yyval = ((tree.Type.Type)(yystack.valueAt (0))); };
  break;


  case 77: /* ClassImplementsOpt: %empty  */
  if (yyn == 77)
    /* "src/main/resources/Java_16_Grammar.y":505  */
                                 { yyval = null; };
  break;


  case 78: /* ClassImplementsOpt: IMPLEMENTS ClassTypeList1  */
  if (yyn == 78)
    /* "src/main/resources/Java_16_Grammar.y":506  */
                                 { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 79: /* ClassTypeList1: Type  */
  if (yyn == 79)
    /* "src/main/resources/Java_16_Grammar.y":510  */
                                { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 80: /* ClassTypeList1: ClassTypeList1 COMMA Type  */
  if (yyn == 80)
    /* "src/main/resources/Java_16_Grammar.y":511  */
                                { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 81: /* ClassTypeList2: Type  */
  if (yyn == 81)
    /* "src/main/resources/Java_16_Grammar.y":515  */
                                    { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 82: /* ClassTypeList2: ClassTypeList2 AMPERSAND Type  */
  if (yyn == 82)
    /* "src/main/resources/Java_16_Grammar.y":516  */
                                    { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 83: /* ClassBodyOpt: %empty  */
  if (yyn == 83)
    /* "src/main/resources/Java_16_Grammar.y":520  */
                    { yyval = null; };
  break;


  case 84: /* ClassBodyOpt: ClassBody  */
  if (yyn == 84)
    /* "src/main/resources/Java_16_Grammar.y":521  */
                    { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 85: /* ClassBody: LBRACE RBRACE  */
  if (yyn == 85)
    /* "src/main/resources/Java_16_Grammar.y":525  */
                                             { yyval = null; };
  break;


  case 86: /* ClassBody: LBRACE ClassBodyDeclarationSeq RBRACE  */
  if (yyn == 86)
    /* "src/main/resources/Java_16_Grammar.y":526  */
                                                 { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 87: /* ClassBodyDeclarationSeq: ClassBodyDeclaration  */
  if (yyn == 87)
    /* "src/main/resources/Java_16_Grammar.y":530  */
                                                   { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 88: /* ClassBodyDeclarationSeq: ClassBodyDeclarationSeq ClassBodyDeclaration  */
  if (yyn == 88)
    /* "src/main/resources/Java_16_Grammar.y":531  */
                                                   { yyval = ((Declarations)(yystack.valueAt (1))).add(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 89: /* ClassBodyDeclaration: ModifierSeqOpt PureBodyDeclaration  */
  if (yyn == 89)
    /* "src/main/resources/Java_16_Grammar.y":535  */
                                         { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); };
  break;


  case 90: /* ClassBodyDeclaration: Block  */
  if (yyn == 90)
    /* "src/main/resources/Java_16_Grammar.y":536  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),false); };
  break;


  case 91: /* ClassBodyDeclaration: STATIC Block  */
  if (yyn == 91)
    /* "src/main/resources/Java_16_Grammar.y":537  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),true); };
  break;


  case 92: /* ClassBodyDeclaration: SEMICOLON  */
  if (yyn == 92)
    /* "src/main/resources/Java_16_Grammar.y":538  */
                      { yyval = null; };
  break;


  case 93: /* PureBodyDeclaration: FieldDeclaration  */
  if (yyn == 93)
    /* "src/main/resources/Java_16_Grammar.y":542  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 94: /* PureBodyDeclaration: MethodDeclaration  */
  if (yyn == 94)
    /* "src/main/resources/Java_16_Grammar.y":543  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 95: /* PureBodyDeclaration: ClassDeclaration  */
  if (yyn == 95)
    /* "src/main/resources/Java_16_Grammar.y":544  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 96: /* PureBodyDeclaration: InterfaceDeclaration  */
  if (yyn == 96)
    /* "src/main/resources/Java_16_Grammar.y":545  */
                               { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 97: /* PureBodyDeclaration: ConstructorDeclaration  */
  if (yyn == 97)
    /* "src/main/resources/Java_16_Grammar.y":546  */
                               { yyval = ((ConstructorDeclaration)(yystack.valueAt (0))); };
  break;


  case 98: /* ConstructorDeclaration: ConstructorDeclarator ThrowsOpt ConstructorBody  */
  if (yyn == 98)
    /* "src/main/resources/Java_16_Grammar.y":553  */
                            { yyval = new ConstructorDeclaration(null,((ConstructorDeclarator)(yystack.valueAt (2))).typeParameters,((ConstructorDeclarator)(yystack.valueAt (2))).formalParameters,
                                                              ((tree.Type.TypeList)(yystack.valueAt (1))),((ConstructorBody)(yystack.valueAt (0))).invocation,((ConstructorBody)(yystack.valueAt (0))).block); };
  break;


  case 99: /* ConstructorDeclarator: TypeParametersOpt IDENTIFIER LPAREN FormalParameterList RPAREN  */
  if (yyn == 99)
    /* "src/main/resources/Java_16_Grammar.y":559  */
                                      { yyval = new ConstructorDeclarator(((TypeParameters)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (1)))); };
  break;


  case 100: /* ConstructorBody: LBRACE RBRACE  */
  if (yyn == 100)
    /* "src/main/resources/Java_16_Grammar.y":563  */
                                                                    { yyval = new ConstructorBody(null,null); };
  break;


  case 101: /* ConstructorBody: LBRACE ExplicitConstructorInvocation RBRACE  */
  if (yyn == 101)
    /* "src/main/resources/Java_16_Grammar.y":564  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (1))),null); };
  break;


  case 102: /* ConstructorBody: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 102)
    /* "src/main/resources/Java_16_Grammar.y":565  */
                                                                    { yyval = new ConstructorBody(null,new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 103: /* ConstructorBody: LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE  */
  if (yyn == 103)
    /* "src/main/resources/Java_16_Grammar.y":566  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (2))),new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 104: /* ExplicitConstructorInvocation: TypeArgumentsOpt THIS Arguments SEMICOLON  */
  if (yyn == 104)
    /* "src/main/resources/Java_16_Grammar.y":570  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),false,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 105: /* ExplicitConstructorInvocation: TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 105)
    /* "src/main/resources/Java_16_Grammar.y":571  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 106: /* ExplicitConstructorInvocation: CompoundName DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 106)
    /* "src/main/resources/Java_16_Grammar.y":572  */
                                                                  { Expression expr = new SimpleReference(((CompoundName)(yystack.valueAt (5))));
                                                                    yyval = new ExplicitConstructorInvocation(expr,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 107: /* ExplicitConstructorInvocation: Primary DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 107)
    /* "src/main/resources/Java_16_Grammar.y":574  */
                                                                  { yyval = new ExplicitConstructorInvocation(((tree.Expression.Expression)(yystack.valueAt (5))),((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 108: /* EnumDeclaration: ENUM IDENTIFIER ClassImplementsOpt EnumBody  */
  if (yyn == 108)
    /* "src/main/resources/Java_16_Grammar.y":580  */
                                                                     { yyval = new EnumDeclaration(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((EnumBody)(yystack.valueAt (0)))); };
  break;


  case 109: /* EnumBody: LBRACE EnumConstantListOpt EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 109)
    /* "src/main/resources/Java_16_Grammar.y":584  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (2))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 110: /* EnumBody: LBRACE EnumConstantListOpt COMMA EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 110)
    /* "src/main/resources/Java_16_Grammar.y":585  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (3))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 111: /* EnumConstantListOpt: %empty  */
  if (yyn == 111)
    /* "src/main/resources/Java_16_Grammar.y":589  */
                         { yyval = null; };
  break;


  case 112: /* EnumConstantListOpt: EnumConstantList  */
  if (yyn == 112)
    /* "src/main/resources/Java_16_Grammar.y":590  */
                         { yyval = ((Enumerators)(yystack.valueAt (0))); };
  break;


  case 113: /* EnumConstantList: EnumConstant  */
  if (yyn == 113)
    /* "src/main/resources/Java_16_Grammar.y":594  */
                                          { yyval = new Enumerators(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 114: /* EnumConstantList: EnumConstantList COMMA EnumConstant  */
  if (yyn == 114)
    /* "src/main/resources/Java_16_Grammar.y":595  */
                                          { yyval = ((Enumerators)(yystack.valueAt (2))).add(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 115: /* EnumConstant: AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 115)
    /* "src/main/resources/Java_16_Grammar.y":599  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 116: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments  */
  if (yyn == 116)
    /* "src/main/resources/Java_16_Grammar.y":600  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0))),null); };
  break;


  case 117: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments ClassBody  */
  if (yyn == 117)
    /* "src/main/resources/Java_16_Grammar.y":601  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (3))),((Token)(yystack.valueAt (2))),((tree.Expression.ArgumentList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 118: /* EnumBodyDeclarationsOpt: %empty  */
  if (yyn == 118)
    /* "src/main/resources/Java_16_Grammar.y":605  */
                                        { yyval = null; };
  break;


  case 119: /* EnumBodyDeclarationsOpt: SEMICOLON  */
  if (yyn == 119)
    /* "src/main/resources/Java_16_Grammar.y":606  */
                                        { yyval = null; };
  break;


  case 120: /* EnumBodyDeclarationsOpt: SEMICOLON ClassBodyDeclarationSeq  */
  if (yyn == 120)
    /* "src/main/resources/Java_16_Grammar.y":607  */
                                        { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 121: /* RecordDeclaration: RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody  */
  if (yyn == 121)
    /* "src/main/resources/Java_16_Grammar.y":613  */
                                                                                                        { yyval = null; };
  break;


  case 134: /* FieldDeclaration: UnannotatedType VariableDeclaratorList SEMICOLON  */
  if (yyn == 134)
    /* "src/main/resources/Java_16_Grammar.y":650  */
                                                  { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 135: /* VariableDeclaratorList: VariableDeclarator  */
  if (yyn == 135)
    /* "src/main/resources/Java_16_Grammar.y":654  */
                                                      { yyval = new VariableDeclarators(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 136: /* VariableDeclaratorList: VariableDeclaratorList COMMA VariableDeclarator  */
  if (yyn == 136)
    /* "src/main/resources/Java_16_Grammar.y":655  */
                                                      { yyval = ((VariableDeclarators)(yystack.valueAt (2))).add(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 137: /* VariableDeclarator: IDENTIFIER  */
  if (yyn == 137)
    /* "src/main/resources/Java_16_Grammar.y":659  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 138: /* VariableDeclarator: IDENTIFIER EQUAL Expression  */
  if (yyn == 138)
    /* "src/main/resources/Java_16_Grammar.y":660  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (2))),null,new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0))))); };
  break;


  case 139: /* VariableDeclarator: IDENTIFIER Dims  */
  if (yyn == 139)
    /* "src/main/resources/Java_16_Grammar.y":661  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),null); };
  break;


  case 140: /* VariableDeclarator: IDENTIFIER Dims EQUAL ArrayInitializer  */
  if (yyn == 140)
    /* "src/main/resources/Java_16_Grammar.y":662  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2))),((InitializerArray)(yystack.valueAt (0)))); };
  break;


  case 141: /* ArrayInitializer: LBRACE VariableInitializerListOpt RBRACE  */
  if (yyn == 141)
    /* "src/main/resources/Java_16_Grammar.y":666  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (1))); };
  break;


  case 142: /* ArrayInitializer: LBRACE VariableInitializerListOpt COMMA RBRACE  */
  if (yyn == 142)
    /* "src/main/resources/Java_16_Grammar.y":667  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (2))); };
  break;


  case 143: /* VariableInitializerListOpt: %empty  */
  if (yyn == 143)
    /* "src/main/resources/Java_16_Grammar.y":671  */
                                { yyval = null; };
  break;


  case 144: /* VariableInitializerListOpt: VariableInitializerList  */
  if (yyn == 144)
    /* "src/main/resources/Java_16_Grammar.y":672  */
                                { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 145: /* VariableInitializerList: VariableInitializer  */
  if (yyn == 145)
    /* "src/main/resources/Java_16_Grammar.y":676  */
                                                        { yyval = new InitializerArray(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 146: /* VariableInitializerList: VariableInitializerList COMMA VariableInitializer  */
  if (yyn == 146)
    /* "src/main/resources/Java_16_Grammar.y":677  */
                                                        { yyval = ((InitializerArray)(yystack.valueAt (2))).add(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 147: /* VariableInitializer: Expression  */
  if (yyn == 147)
    /* "src/main/resources/Java_16_Grammar.y":681  */
                        { yyval = new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 148: /* VariableInitializer: ArrayInitializer  */
  if (yyn == 148)
    /* "src/main/resources/Java_16_Grammar.y":682  */
                        { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 149: /* MethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 149)
    /* "src/main/resources/Java_16_Grammar.y":688  */
                              { yyval = new MethodDeclaration(((MethodHeader)(yystack.valueAt (1))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 150: /* MethodHeader: TypeParameters Type MethodDeclarator ThrowsOpt  */
  if (yyn == 150)
    /* "src/main/resources/Java_16_Grammar.y":698  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 151: /* MethodHeader: TypeParameters AnnotationSeq VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 151)
    /* "src/main/resources/Java_16_Grammar.y":699  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (4))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 152: /* MethodHeader: TypeParameters UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 152)
    /* "src/main/resources/Java_16_Grammar.y":700  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 153: /* MethodHeader: TypeParameters VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 153)
    /* "src/main/resources/Java_16_Grammar.y":701  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 154: /* MethodHeader: UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 154)
    /* "src/main/resources/Java_16_Grammar.y":702  */
                                                                              { yyval = new MethodHeader(null,((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 155: /* MethodHeader: VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 155)
    /* "src/main/resources/Java_16_Grammar.y":703  */
                                                                              { yyval = new MethodHeader(null,null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 156: /* MethodDeclarator: IDENTIFIER LPAREN RPAREN DimsOpt  */
  if (yyn == 156)
    /* "src/main/resources/Java_16_Grammar.y":712  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (3))),null,((Dims)(yystack.valueAt (0)))); };
  break;


  case 157: /* MethodDeclarator: IDENTIFIER LPAREN FormalParameterList RPAREN DimsOpt  */
  if (yyn == 157)
    /* "src/main/resources/Java_16_Grammar.y":713  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (2))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 158: /* FormalParameterList: FormalParameter  */
  if (yyn == 158)
    /* "src/main/resources/Java_16_Grammar.y":727  */
                                                { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 159: /* FormalParameterList: FormalParameterList COMMA FormalParameter  */
  if (yyn == 159)
    /* "src/main/resources/Java_16_Grammar.y":728  */
                                                { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0))));};
  break;


  case 160: /* FormalParameter: ModifierSeq UnannotatedType FormalParameterTail  */
  if (yyn == 160)
    /* "src/main/resources/Java_16_Grammar.y":732  */
                                                      { yyval = ParameterDeclaration.create(((Modifiers)(yystack.valueAt (2))),((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 161: /* FormalParameter: UnannotatedType FormalParameterTail  */
  if (yyn == 161)
    /* "src/main/resources/Java_16_Grammar.y":733  */
                                                      { yyval = ParameterDeclaration.create(null,((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 162: /* FormalParameterTail: IDENTIFIER DimsOpt  */
  if (yyn == 162)
    /* "src/main/resources/Java_16_Grammar.y":737  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),false,false); };
  break;


  case 163: /* FormalParameterTail: AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 163)
    /* "src/main/resources/Java_16_Grammar.y":738  */
                                                   { yyval = new ParameterTail(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (0))),null,true,false); };
  break;


  case 164: /* FormalParameterTail: THIS  */
  if (yyn == 164)
    /* "src/main/resources/Java_16_Grammar.y":739  */
                                                   { yyval = new ParameterTail(null,null,null,false,true); };
  break;


  case 165: /* FormalParameterTail: IDENTIFIER DOT THIS  */
  if (yyn == 165)
    /* "src/main/resources/Java_16_Grammar.y":740  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (2))),null,false,true); };
  break;


  case 166: /* ThrowsOpt: %empty  */
  if (yyn == 166)
    /* "src/main/resources/Java_16_Grammar.y":752  */
                             { yyval = null; };
  break;


  case 167: /* ThrowsOpt: THROWS ClassTypeList1  */
  if (yyn == 167)
    /* "src/main/resources/Java_16_Grammar.y":753  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 168: /* MethodBody: Block  */
  if (yyn == 168)
    /* "src/main/resources/Java_16_Grammar.y":757  */
                   { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 169: /* MethodBody: SEMICOLON  */
  if (yyn == 169)
    /* "src/main/resources/Java_16_Grammar.y":758  */
                   { yyval = null; };
  break;


  case 170: /* DimsOpt: %empty  */
  if (yyn == 170)
    /* "src/main/resources/Java_16_Grammar.y":764  */
                 { yyval = null; };
  break;


  case 171: /* DimsOpt: Dims  */
  if (yyn == 171)
    /* "src/main/resources/Java_16_Grammar.y":765  */
                 { yyval = ((Dims)(yystack.valueAt (0))); };
  break;


  case 172: /* Dims: Dim  */
  if (yyn == 172)
    /* "src/main/resources/Java_16_Grammar.y":769  */
                { yyval = new Dims(((Dim)(yystack.valueAt (0)))); };
  break;


  case 173: /* Dims: Dims Dim  */
  if (yyn == 173)
    /* "src/main/resources/Java_16_Grammar.y":770  */
                { yyval = ((Dims)(yystack.valueAt (1))).add(((Dim)(yystack.valueAt (0)))); };
  break;


  case 174: /* Dim: AnnotationSeq LBRACKET RBRACKET  */
  if (yyn == 174)
    /* "src/main/resources/Java_16_Grammar.y":774  */
                                      { yyval = new Dim(((Annotations)(yystack.valueAt (2)))); };
  break;


  case 175: /* Dim: LBRACKET RBRACKET  */
  if (yyn == 175)
    /* "src/main/resources/Java_16_Grammar.y":775  */
                                      { yyval = new Dim(null); };
  break;


  case 176: /* InterfaceDeclaration: NormalInterfaceDeclaration  */
  if (yyn == 176)
    /* "src/main/resources/Java_16_Grammar.y":781  */
                                      { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 177: /* InterfaceDeclaration: AnnotationInterfaceDeclaration  */
  if (yyn == 177)
    /* "src/main/resources/Java_16_Grammar.y":782  */
                                      { yyval = null; };
  break;


  case 178: /* NormalInterfaceDeclaration: INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody  */
  if (yyn == 178)
    /* "src/main/resources/Java_16_Grammar.y":787  */
                                         { yyval = new NormalInterfaceDeclaration(((Token)(yystack.valueAt (3))),((TypeParameters)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 179: /* InterfaceExtendsOpt: %empty  */
  if (yyn == 179)
    /* "src/main/resources/Java_16_Grammar.y":791  */
                        { yyval = null; };
  break;


  case 180: /* InterfaceExtendsOpt: InterfaceExtends  */
  if (yyn == 180)
    /* "src/main/resources/Java_16_Grammar.y":792  */
                        { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 181: /* InterfaceExtends: EXTENDS Type  */
  if (yyn == 181)
    /* "src/main/resources/Java_16_Grammar.y":796  */
                                   { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 182: /* InterfaceExtends: InterfaceExtends COMMA Type  */
  if (yyn == 182)
    /* "src/main/resources/Java_16_Grammar.y":797  */
                                   { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 183: /* InterfaceBody: LBRACE RBRACE  */
  if (yyn == 183)
    /* "src/main/resources/Java_16_Grammar.y":801  */
                                                  { yyval = null; };
  break;


  case 184: /* InterfaceBody: LBRACE InterfaceMemberDeclarationSeq RBRACE  */
  if (yyn == 184)
    /* "src/main/resources/Java_16_Grammar.y":802  */
                                                  { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 185: /* InterfaceMemberDeclarationSeq: ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 185)
    /* "src/main/resources/Java_16_Grammar.y":806  */
                                                                              { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 186: /* InterfaceMemberDeclarationSeq: InterfaceMemberDeclarationSeq ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 186)
    /* "src/main/resources/Java_16_Grammar.y":807  */
                                                                              { yyval = ((Declarations)(yystack.valueAt (2))).add(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 187: /* InterfaceMemberDeclaration: ConstantDeclaration  */
  if (yyn == 187)
    /* "src/main/resources/Java_16_Grammar.y":811  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 188: /* InterfaceMemberDeclaration: InterfaceMethodDeclaration  */
  if (yyn == 188)
    /* "src/main/resources/Java_16_Grammar.y":812  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 189: /* InterfaceMemberDeclaration: ClassDeclaration  */
  if (yyn == 189)
    /* "src/main/resources/Java_16_Grammar.y":813  */
                                  { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 190: /* InterfaceMemberDeclaration: InterfaceDeclaration  */
  if (yyn == 190)
    /* "src/main/resources/Java_16_Grammar.y":814  */
                                  { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 191: /* ConstantDeclaration: Type VariableDeclaratorList SEMICOLON  */
  if (yyn == 191)
    /* "src/main/resources/Java_16_Grammar.y":818  */
                                            { yyval = new TypeAndDeclarators(((tree.Type.Type)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 192: /* InterfaceMethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 192)
    /* "src/main/resources/Java_16_Grammar.y":822  */
                              { yyval = null; };
  break;


  case 193: /* AnnotationInterfaceDeclaration: AT INTERFACE IDENTIFIER AnnotationInterfaceBody  */
  if (yyn == 193)
    /* "src/main/resources/Java_16_Grammar.y":826  */
                                                      { yyval = null; };
  break;


  case 205: /* Block: LBRACE RBRACE  */
  if (yyn == 205)
    /* "src/main/resources/Java_16_Grammar.y":859  */
                                        { yyval = null; };
  break;


  case 206: /* Block: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 206)
    /* "src/main/resources/Java_16_Grammar.y":860  */
                                        { yyval = new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1)))); };
  break;


  case 207: /* BlockStatementSeq: BlockStatement  */
  if (yyn == 207)
    /* "src/main/resources/Java_16_Grammar.y":864  */
                                           { yyval = new BlockStatements(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 208: /* BlockStatementSeq: BlockStatementSeq BlockStatement  */
  if (yyn == 208)
    /* "src/main/resources/Java_16_Grammar.y":865  */
                                       { yyval = ((tree.Statement.BlockStatements)(yystack.valueAt (1))).add(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 209: /* BlockStatement: ModifierSeqOpt ClassDeclaration  */
  if (yyn == 209)
    /* "src/main/resources/Java_16_Grammar.y":881  */
                                                { yyval = new BlockStatement(((ClassDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 210: /* BlockStatement: ModifierSeqOpt NormalInterfaceDeclaration  */
  if (yyn == 210)
    /* "src/main/resources/Java_16_Grammar.y":882  */
                                                { yyval = new BlockStatement(((InterfaceDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 211: /* BlockStatement: ModifierSeqOpt LocalVariableDeclaration SEMICOLON  */
  if (yyn == 211)
    /* "src/main/resources/Java_16_Grammar.y":884  */
                                                { yyval = new BlockStatement(((tree.Declaration.Declaration)(yystack.valueAt (1))).addModifiers(((Modifiers)(yystack.valueAt (2))))); };
  break;


  case 212: /* BlockStatement: Statement  */
  if (yyn == 212)
    /* "src/main/resources/Java_16_Grammar.y":885  */
                                                { yyval = new BlockStatement(((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 213: /* LocalVariableDeclaration: UnannotatedType VariableDeclaratorList  */
  if (yyn == 213)
    /* "src/main/resources/Java_16_Grammar.y":889  */
                                             { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (1))),((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 214: /* LocalVariableDeclaration: VAR VariableDeclaratorList  */
  if (yyn == 214)
    /* "src/main/resources/Java_16_Grammar.y":890  */
                                             { yyval = new TypeAndDeclarators(null,((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 220: /* SimpleStatement: Block  */
  if (yyn == 220)
    /* "src/main/resources/Java_16_Grammar.y":902  */
                                        { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 221: /* SimpleStatement: SEMICOLON  */
  if (yyn == 221)
    /* "src/main/resources/Java_16_Grammar.y":903  */
                                            { yyval = null; };
  break;


  case 222: /* SimpleStatement: StatementExpression SEMICOLON  */
  if (yyn == 222)
    /* "src/main/resources/Java_16_Grammar.y":904  */
                                        { yyval = ((StatementExpression)(yystack.valueAt (1))); };
  break;


  case 223: /* SimpleStatement: ASSERT Expression SEMICOLON  */
  if (yyn == 223)
    /* "src/main/resources/Java_16_Grammar.y":906  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (1))),null); };
  break;


  case 224: /* SimpleStatement: ASSERT Expression COLON Expression SEMICOLON  */
  if (yyn == 224)
    /* "src/main/resources/Java_16_Grammar.y":907  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 225: /* SimpleStatement: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 225)
    /* "src/main/resources/Java_16_Grammar.y":909  */
                                                   { yyval = null; };
  break;


  case 226: /* SimpleStatement: DO Statement WHILE LPAREN Expression RPAREN SEMICOLON  */
  if (yyn == 226)
    /* "src/main/resources/Java_16_Grammar.y":910  */
                                                            { yyval = new Do(null,((tree.Statement.Statement)(yystack.valueAt (5))),((tree.Expression.Expression)(yystack.valueAt (2)))); };
  break;


  case 227: /* SimpleStatement: BREAK SEMICOLON  */
  if (yyn == 227)
    /* "src/main/resources/Java_16_Grammar.y":912  */
                                  { yyval = new Break(null,null); };
  break;


  case 228: /* SimpleStatement: BREAK IDENTIFIER SEMICOLON  */
  if (yyn == 228)
    /* "src/main/resources/Java_16_Grammar.y":913  */
                                  { yyval = new Break(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 229: /* SimpleStatement: CONTINUE SEMICOLON  */
  if (yyn == 229)
    /* "src/main/resources/Java_16_Grammar.y":915  */
                                      { yyval = new Continue(null,null); };
  break;


  case 230: /* SimpleStatement: CONTINUE IDENTIFIER SEMICOLON  */
  if (yyn == 230)
    /* "src/main/resources/Java_16_Grammar.y":916  */
                                      { yyval = new Continue(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 231: /* SimpleStatement: RETURN SEMICOLON  */
  if (yyn == 231)
    /* "src/main/resources/Java_16_Grammar.y":918  */
                                      { yyval = new Return(null,null); };
  break;


  case 232: /* SimpleStatement: RETURN Expression SEMICOLON  */
  if (yyn == 232)
    /* "src/main/resources/Java_16_Grammar.y":919  */
                                      { yyval = new Return(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 233: /* SimpleStatement: SYNCHRONIZED LPAREN Expression RPAREN Block  */
  if (yyn == 233)
    /* "src/main/resources/Java_16_Grammar.y":921  */
                                                   { yyval = new Synchronized(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 234: /* SimpleStatement: THROW Expression SEMICOLON  */
  if (yyn == 234)
    /* "src/main/resources/Java_16_Grammar.y":923  */
                                  { yyval = new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 235: /* SimpleStatement: YIELD Expression SEMICOLON  */
  if (yyn == 235)
    /* "src/main/resources/Java_16_Grammar.y":924  */
                                  { yyval = new Yield(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 236: /* SimpleStatement: TRY Block Catches  */
  if (yyn == 236)
    /* "src/main/resources/Java_16_Grammar.y":927  */
                                   { yyval = null; };
  break;


  case 237: /* SimpleStatement: TRY Block Catches Finally  */
  if (yyn == 237)
    /* "src/main/resources/Java_16_Grammar.y":928  */
                                   { yyval = null; };
  break;


  case 238: /* SimpleStatement: TRY Block Finally  */
  if (yyn == 238)
    /* "src/main/resources/Java_16_Grammar.y":929  */
                                   { yyval = null; };
  break;


  case 239: /* SimpleStatement: TRY ResourceSpecification Block CatchesOpt FinallyOpt  */
  if (yyn == 239)
    /* "src/main/resources/Java_16_Grammar.y":931  */
                                   { yyval = null; };
  break;


  case 240: /* SimpleStatement: error SEMICOLON  */
  if (yyn == 240)
    /* "src/main/resources/Java_16_Grammar.y":932  */
                                   { yyval = null; };
  break;


  case 241: /* LabeledStatement: IDENTIFIER COLON Statement  */
  if (yyn == 241)
    /* "src/main/resources/Java_16_Grammar.y":936  */
                                 { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))).addLabel(((Token)(yystack.valueAt (2)))); };
  break;


  case 242: /* StatementExpression: Assignment  */
  if (yyn == 242)
    /* "src/main/resources/Java_16_Grammar.y":940  */
                                   { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 243: /* StatementExpression: PreIncrementExpression  */
  if (yyn == 243)
    /* "src/main/resources/Java_16_Grammar.y":941  */
                                   { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 244: /* StatementExpression: PreDecrementExpression  */
  if (yyn == 244)
    /* "src/main/resources/Java_16_Grammar.y":942  */
                                   { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 245: /* StatementExpression: PostIncrementExpression  */
  if (yyn == 245)
    /* "src/main/resources/Java_16_Grammar.y":943  */
                                   { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 246: /* StatementExpression: PostDecrementExpression  */
  if (yyn == 246)
    /* "src/main/resources/Java_16_Grammar.y":944  */
                                   { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 247: /* StatementExpression: MethodInvocation  */
  if (yyn == 247)
    /* "src/main/resources/Java_16_Grammar.y":945  */
                                   { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 248: /* StatementExpression: ClassInstanceCreationExpression  */
  if (yyn == 248)
    /* "src/main/resources/Java_16_Grammar.y":946  */
                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 249: /* IfThenElseStatement: IF LPAREN Expression RPAREN Statement ElsePartOpt  */
  if (yyn == 249)
    /* "src/main/resources/Java_16_Grammar.y":950  */
                                                        { yyval = new IfThenElse(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Statement.Statement)(yystack.valueAt (1))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 250: /* ElsePartOpt: %empty  */
  if (yyn == 250)
    /* "src/main/resources/Java_16_Grammar.y":954  */
                      { yyval = null; };
  break;


  case 251: /* ElsePartOpt: ELSE Statement  */
  if (yyn == 251)
    /* "src/main/resources/Java_16_Grammar.y":955  */
                      { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 252: /* SwitchBlock: LBRACE SwitchRuleSeq RBRACE  */
  if (yyn == 252)
    /* "src/main/resources/Java_16_Grammar.y":959  */
                                                                   { yyval = null; };
  break;


  case 253: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeqOpt RBRACE  */
  if (yyn == 253)
    /* "src/main/resources/Java_16_Grammar.y":960  */
                                                                   { yyval = null; };
  break;


  case 254: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeqOpt SwitchLabelSeq RBRACE  */
  if (yyn == 254)
    /* "src/main/resources/Java_16_Grammar.y":961  */
                                                                   { yyval = null; };
  break;


  case 255: /* SwitchRuleSeq: SwitchRule  */
  if (yyn == 255)
    /* "src/main/resources/Java_16_Grammar.y":965  */
                               { yyval = new SwitchRules(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 256: /* SwitchRuleSeq: SwitchRuleSeq SwitchRule  */
  if (yyn == 256)
    /* "src/main/resources/Java_16_Grammar.y":966  */
                               { yyval = ((SwitchRules)(yystack.valueAt (1))).add(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 257: /* SwitchRule: SwitchLabel ARROW Expression SEMICOLON  */
  if (yyn == 257)
    /* "src/main/resources/Java_16_Grammar.y":970  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 258: /* SwitchRule: SwitchLabel ARROW Block  */
  if (yyn == 258)
    /* "src/main/resources/Java_16_Grammar.y":971  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 259: /* SwitchRule: SwitchLabel ARROW THROW Expression SEMICOLON  */
  if (yyn == 259)
    /* "src/main/resources/Java_16_Grammar.y":972  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (4))),new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1))))); };
  break;


  case 265: /* SwitchLabelSeq: SwitchLabel COLON  */
  if (yyn == 265)
    /* "src/main/resources/Java_16_Grammar.y":987  */
                                       { yyval = new SwitchLabels(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 266: /* SwitchLabelSeq: SwitchLabelSeq SwitchLabel COLON  */
  if (yyn == 266)
    /* "src/main/resources/Java_16_Grammar.y":988  */
                                       { yyval = ((SwitchLabels)(yystack.valueAt (2))).add(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 267: /* SwitchLabel: CASE CaseExpressionList  */
  if (yyn == 267)
    /* "src/main/resources/Java_16_Grammar.y":992  */
                               { yyval = ((SwitchLabel)(yystack.valueAt (0))); };
  break;


  case 268: /* SwitchLabel: DEFAULT  */
  if (yyn == 268)
    /* "src/main/resources/Java_16_Grammar.y":993  */
                                   { yyval = null; };
  break;


  case 269: /* CaseExpressionList: AssignmentExpression  */
  if (yyn == 269)
    /* "src/main/resources/Java_16_Grammar.y":997  */
                                                    { yyval = new SwitchLabel(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 270: /* CaseExpressionList: CaseExpressionList COMMA AssignmentExpression  */
  if (yyn == 270)
    /* "src/main/resources/Java_16_Grammar.y":998  */
                                                    { yyval = ((SwitchLabel)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 271: /* WhileStatement: WHILE LPAREN Expression RPAREN Statement  */
  if (yyn == 271)
    /* "src/main/resources/Java_16_Grammar.y":1005  */
                                                { yyval = new While(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 272: /* ForStatement: BasicForStatement  */
  if (yyn == 272)
    /* "src/main/resources/Java_16_Grammar.y":1009  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 273: /* ForStatement: EnhancedForStatement  */
  if (yyn == 273)
    /* "src/main/resources/Java_16_Grammar.y":1010  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 274: /* BasicForStatement: FOR LPAREN ForInitOpt SEMICOLON ExpressionOpt SEMICOLON StatementExpressionListOpt RPAREN Statement  */
  if (yyn == 274)
    /* "src/main/resources/Java_16_Grammar.y":1015  */
                          { yyval = null; };
  break;


  case 278: /* ExpressionOpt: %empty  */
  if (yyn == 278)
    /* "src/main/resources/Java_16_Grammar.y":1025  */
                  { yyval = null; };
  break;


  case 279: /* ExpressionOpt: Expression  */
  if (yyn == 279)
    /* "src/main/resources/Java_16_Grammar.y":1026  */
                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 280: /* StatementExpressionList: StatementExpression  */
  if (yyn == 280)
    /* "src/main/resources/Java_16_Grammar.y":1033  */
                                                        { yyval = ((StatementExpression)(yystack.valueAt (0))); };
  break;


  case 281: /* StatementExpressionList: StatementExpressionList COMMA StatementExpression  */
  if (yyn == 281)
    /* "src/main/resources/Java_16_Grammar.y":1034  */
                                                        { yyval = ((StatementExpressions)(yystack.valueAt (2))).add(((StatementExpression)(yystack.valueAt (0)))); };
  break;


  case 282: /* StatementExpressionListOpt: %empty  */
  if (yyn == 282)
    /* "src/main/resources/Java_16_Grammar.y":1038  */
                               { yyval = null; };
  break;


  case 283: /* StatementExpressionListOpt: StatementExpressionList  */
  if (yyn == 283)
    /* "src/main/resources/Java_16_Grammar.y":1039  */
                               { yyval = ((StatementExpressions)(yystack.valueAt (0))); };
  break;


  case 284: /* EnhancedForStatement: FOR LPAREN LocalVariableDeclaration COLON Expression RPAREN Statement  */
  if (yyn == 284)
    /* "src/main/resources/Java_16_Grammar.y":1043  */
                                                                            { yyval = null; };
  break;


  case 285: /* CatchesOpt: %empty  */
  if (yyn == 285)
    /* "src/main/resources/Java_16_Grammar.y":1047  */
               { yyval = null; };
  break;


  case 286: /* CatchesOpt: Catches  */
  if (yyn == 286)
    /* "src/main/resources/Java_16_Grammar.y":1048  */
               { yyval = ((CatchClauses)(yystack.valueAt (0))); };
  break;


  case 287: /* Catches: CatchClause  */
  if (yyn == 287)
    /* "src/main/resources/Java_16_Grammar.y":1052  */
                            { yyval = new CatchClauses(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 288: /* Catches: Catches CatchClause  */
  if (yyn == 288)
    /* "src/main/resources/Java_16_Grammar.y":1053  */
                            { yyval = ((CatchClauses)(yystack.valueAt (1))).add(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 289: /* CatchClause: CATCH LPAREN CatchFormalParameter RPAREN Block  */
  if (yyn == 289)
    /* "src/main/resources/Java_16_Grammar.y":1057  */
                                                     { yyval = new CatchClause(((CatchParameter)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 290: /* CatchFormalParameter: ModifierSeqOpt CatchType IDENTIFIER DimsOpt  */
  if (yyn == 290)
    /* "src/main/resources/Java_16_Grammar.y":1061  */
                                                  { yyval = new CatchParameter(((Modifiers)(yystack.valueAt (3))),((tree.Type.TypeList)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 291: /* CatchType: Type  */
  if (yyn == 291)
    /* "src/main/resources/Java_16_Grammar.y":1065  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 292: /* CatchType: CatchType VERTICAL Type  */
  if (yyn == 292)
    /* "src/main/resources/Java_16_Grammar.y":1066  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 303: /* Primary: Literal  */
  if (yyn == 303)
    /* "src/main/resources/Java_16_Grammar.y":1103  */
                                        { yyval = new Literal(((Token)(yystack.valueAt (0)))); };
  break;


  case 304: /* Primary: Type DimsOpt DOT CLASS  */
  if (yyn == 304)
    /* "src/main/resources/Java_16_Grammar.y":1104  */
                                        { yyval = new ClassLiteral(((tree.Type.Type)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2)))); };
  break;


  case 305: /* Primary: VOID DimsOpt DOT CLASS  */
  if (yyn == 305)
    /* "src/main/resources/Java_16_Grammar.y":1105  */
                                        { yyval = new ClassLiteral(null,((Dims)(yystack.valueAt (2)))); };
  break;


  case 306: /* Primary: THIS  */
  if (yyn == 306)
    /* "src/main/resources/Java_16_Grammar.y":1106  */
                                        { yyval = new This(null); };
  break;


  case 307: /* Primary: Type DOT THIS  */
  if (yyn == 307)
    /* "src/main/resources/Java_16_Grammar.y":1107  */
                                        { yyval = new This(((tree.Type.Type)(yystack.valueAt (2)))); };
  break;


  case 308: /* Primary: LPAREN Expression RPAREN  */
  if (yyn == 308)
    /* "src/main/resources/Java_16_Grammar.y":1108  */
                                        { yyval = new Parenthesized(((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 309: /* Primary: ClassInstanceCreationExpression  */
  if (yyn == 309)
    /* "src/main/resources/Java_16_Grammar.y":1109  */
                                        { yyval = null; };
  break;


  case 310: /* Primary: FieldAccess  */
  if (yyn == 310)
    /* "src/main/resources/Java_16_Grammar.y":1110  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 311: /* Primary: ArrayAccess  */
  if (yyn == 311)
    /* "src/main/resources/Java_16_Grammar.y":1111  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 312: /* Primary: MethodInvocation  */
  if (yyn == 312)
    /* "src/main/resources/Java_16_Grammar.y":1112  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 313: /* Primary: MethodReference  */
  if (yyn == 313)
    /* "src/main/resources/Java_16_Grammar.y":1113  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 314: /* Primary: ArrayCreationExpression  */
  if (yyn == 314)
    /* "src/main/resources/Java_16_Grammar.y":1114  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 315: /* ClassInstanceCreationExpression: UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 315)
    /* "src/main/resources/Java_16_Grammar.y":1124  */
                                                                  { yyval = null; };
  break;


  case 316: /* ClassInstanceCreationExpression: CompoundName DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 316)
    /* "src/main/resources/Java_16_Grammar.y":1125  */
                                                                  { yyval = null; };
  break;


  case 317: /* ClassInstanceCreationExpression: Primary DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 317)
    /* "src/main/resources/Java_16_Grammar.y":1126  */
                                                                  { yyval = null; };
  break;


  case 323: /* TypeArgumentsOpt: %empty  */
  if (yyn == 323)
    /* "src/main/resources/Java_16_Grammar.y":1144  */
                      { yyval = null; };
  break;


  case 324: /* TypeArgumentsOpt: TypeArguments  */
  if (yyn == 324)
    /* "src/main/resources/Java_16_Grammar.y":1145  */
                      { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (0))); };
  break;


  case 325: /* TypeArguments: LESS TypeArgumentList GREATER  */
  if (yyn == 325)
    /* "src/main/resources/Java_16_Grammar.y":1149  */
                                     { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (1))); };
  break;


  case 326: /* TypeArgumentList: TypeArgument  */
  if (yyn == 326)
    /* "src/main/resources/Java_16_Grammar.y":1153  */
                                           { yyval = new TypeArguments(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 327: /* TypeArgumentList: TypeArgumentList COMMA TypeArgument  */
  if (yyn == 327)
    /* "src/main/resources/Java_16_Grammar.y":1154  */
                                           { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (2))).add(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 328: /* TypeArgument: Type  */
  if (yyn == 328)
    /* "src/main/resources/Java_16_Grammar.y":1158  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),0,null); };
  break;


  case 329: /* TypeArgument: QUESTION  */
  if (yyn == 329)
    /* "src/main/resources/Java_16_Grammar.y":1159  */
                                               { yyval = new TypeArgument(null,1,null); };
  break;


  case 330: /* TypeArgument: QUESTION EXTENDS Type  */
  if (yyn == 330)
    /* "src/main/resources/Java_16_Grammar.y":1160  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),1,null); };
  break;


  case 331: /* TypeArgument: QUESTION SUPER Type  */
  if (yyn == 331)
    /* "src/main/resources/Java_16_Grammar.y":1161  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,null); };
  break;


  case 332: /* TypeArgument: AnnotationSeq QUESTION  */
  if (yyn == 332)
    /* "src/main/resources/Java_16_Grammar.y":1162  */
                                               { yyval = new TypeArgument(null,1,((Annotations)(yystack.valueAt (1)))); };
  break;


  case 333: /* TypeArgument: AnnotationSeq QUESTION EXTENDS Type  */
  if (yyn == 333)
    /* "src/main/resources/Java_16_Grammar.y":1163  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 334: /* TypeArgument: AnnotationSeq QUESTION SUPER Type  */
  if (yyn == 334)
    /* "src/main/resources/Java_16_Grammar.y":1164  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),3,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 335: /* FieldAccess: Primary DOT IDENTIFIER  */
  if (yyn == 335)
    /* "src/main/resources/Java_16_Grammar.y":1174  */
                                             { yyval = new FieldAccess(((tree.Expression.Expression)(yystack.valueAt (2))),  false,((Token)(yystack.valueAt (0)))); };
  break;


  case 336: /* FieldAccess: SUPER DOT IDENTIFIER  */
  if (yyn == 336)
    /* "src/main/resources/Java_16_Grammar.y":1175  */
                                             { yyval = new FieldAccess(null,true, ((Token)(yystack.valueAt (0)))); };
  break;


  case 337: /* FieldAccess: CompoundName DOT SUPER DOT IDENTIFIER  */
  if (yyn == 337)
    /* "src/main/resources/Java_16_Grammar.y":1176  */
                                             { yyval = new FieldAccess(new SimpleReference(((CompoundName)(yystack.valueAt (4)))),true,((Token)(yystack.valueAt (0)))); };
  break;


  case 338: /* ArrayAccess: CompoundName LBRACKET Expression RBRACKET  */
  if (yyn == 338)
    /* "src/main/resources/Java_16_Grammar.y":1180  */
                                                 { yyval = new ArrayAccess(new SimpleReference(((CompoundName)(yystack.valueAt (3)))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 339: /* ArrayAccess: Primary LBRACKET Expression RBRACKET  */
  if (yyn == 339)
    /* "src/main/resources/Java_16_Grammar.y":1181  */
                                                 { yyval = new ArrayAccess(((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 340: /* MethodInvocation: CompoundName Arguments  */
  if (yyn == 340)
    /* "src/main/resources/Java_16_Grammar.y":1185  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (1))));
                                                                         yyval = new MethodInvocation(ref,false,null,null,((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 341: /* MethodInvocation: CompoundName DOT TypeArguments IDENTIFIER Arguments  */
  if (yyn == 341)
    /* "src/main/resources/Java_16_Grammar.y":1187  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (4))));
                                                                         yyval = new MethodInvocation(ref,false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 342: /* MethodInvocation: Primary DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 342)
    /* "src/main/resources/Java_16_Grammar.y":1189  */
                                                                       { yyval = new MethodInvocation(((tree.Expression.Expression)(yystack.valueAt (4))),false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 343: /* MethodInvocation: SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 343)
    /* "src/main/resources/Java_16_Grammar.y":1190  */
                                                                       { yyval = new MethodInvocation(null,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 344: /* MethodInvocation: CompoundName DOT SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 344)
    /* "src/main/resources/Java_16_Grammar.y":1191  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (6))));
                                                                         yyval = new MethodInvocation(ref,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 345: /* Arguments: LPAREN RPAREN  */
  if (yyn == 345)
    /* "src/main/resources/Java_16_Grammar.y":1196  */
                                 { yyval = null; };
  break;


  case 346: /* Arguments: LPAREN ArgumentList RPAREN  */
  if (yyn == 346)
    /* "src/main/resources/Java_16_Grammar.y":1197  */
                                 { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (1))); };
  break;


  case 347: /* ArgumentList: Expression  */
  if (yyn == 347)
    /* "src/main/resources/Java_16_Grammar.y":1206  */
                                    { yyval = new ArgumentList(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 348: /* ArgumentList: ArgumentList COMMA Expression  */
  if (yyn == 348)
    /* "src/main/resources/Java_16_Grammar.y":1207  */
                                    { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 349: /* MethodReference: Primary DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 349)
    /* "src/main/resources/Java_16_Grammar.y":1212  */
                                                           { yyval = null; };
  break;


  case 350: /* MethodReference: Type DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 350)
    /* "src/main/resources/Java_16_Grammar.y":1213  */
                                                           { yyval = null; };
  break;


  case 351: /* MethodReference: SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 351)
    /* "src/main/resources/Java_16_Grammar.y":1214  */
                                                           { yyval = null; };
  break;


  case 352: /* MethodReference: Type DOT SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 352)
    /* "src/main/resources/Java_16_Grammar.y":1215  */
                                                           { yyval = null; };
  break;


  case 353: /* MethodReference: Type DBL_COLON TypeArgumentsOpt NEW  */
  if (yyn == 353)
    /* "src/main/resources/Java_16_Grammar.y":1216  */
                                                           { yyval = null; };
  break;


  case 354: /* ArrayCreationExpression: NEW Type DimExprs DimsOpt  */
  if (yyn == 354)
    /* "src/main/resources/Java_16_Grammar.y":1220  */
                                       { yyval = null; };
  break;


  case 355: /* ArrayCreationExpression: NEW Type Dims ArrayInitializer  */
  if (yyn == 355)
    /* "src/main/resources/Java_16_Grammar.y":1221  */
                                       { yyval = null; };
  break;


  case 360: /* Expression: LambdaExpression  */
  if (yyn == 360)
    /* "src/main/resources/Java_16_Grammar.y":1237  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 361: /* Expression: AssignmentExpression  */
  if (yyn == 361)
    /* "src/main/resources/Java_16_Grammar.y":1238  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 362: /* LambdaExpression: IDENTIFIER ARROW Expression  */
  if (yyn == 362)
    /* "src/main/resources/Java_16_Grammar.y":1243  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 363: /* LambdaExpression: IDENTIFIER ARROW Block  */
  if (yyn == 363)
    /* "src/main/resources/Java_16_Grammar.y":1245  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 364: /* LambdaExpression: LambdaParameters ARROW Expression  */
  if (yyn == 364)
    /* "src/main/resources/Java_16_Grammar.y":1246  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 365: /* LambdaExpression: LambdaParameters ARROW Block  */
  if (yyn == 365)
    /* "src/main/resources/Java_16_Grammar.y":1247  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 366: /* LambdaParameters: LPAREN RPAREN  */
  if (yyn == 366)
    /* "src/main/resources/Java_16_Grammar.y":1256  */
                                           { yyval = null; };
  break;


  case 367: /* LambdaParameters: LPAREN LambdaParameterList1 RPAREN  */
  if (yyn == 367)
    /* "src/main/resources/Java_16_Grammar.y":1257  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 368: /* LambdaParameters: LPAREN LambdaParameterList2 RPAREN  */
  if (yyn == 368)
    /* "src/main/resources/Java_16_Grammar.y":1258  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 369: /* LambdaParameterList1: IDENTIFIER  */
  if (yyn == 369)
    /* "src/main/resources/Java_16_Grammar.y":1263  */
                                             { yyval = new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 370: /* LambdaParameterList1: LambdaParameterList1 COMMA IDENTIFIER  */
  if (yyn == 370)
    /* "src/main/resources/Java_16_Grammar.y":1264  */
                                             { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 371: /* LambdaParameterList2: LambdaParameter  */
  if (yyn == 371)
    /* "src/main/resources/Java_16_Grammar.y":1268  */
                                                 { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 372: /* LambdaParameterList2: LambdaParameterList2 COMMA LambdaParameter  */
  if (yyn == 372)
    /* "src/main/resources/Java_16_Grammar.y":1269  */
                                                 { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 373: /* LambdaParameter: ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt  */
  if (yyn == 373)
    /* "src/main/resources/Java_16_Grammar.y":1280  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 374: /* LambdaParameter: ModifierSeqOpt VAR IDENTIFIER DimsOpt  */
  if (yyn == 374)
    /* "src/main/resources/Java_16_Grammar.y":1281  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),null,((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 375: /* LambdaParameter: ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 375)
    /* "src/main/resources/Java_16_Grammar.y":1283  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (4))),((tree.Type.UnannotatedType)(yystack.valueAt (3))),((Token)(yystack.valueAt (0))).image,((Annotations)(yystack.valueAt (2))),true,null); };
  break;


  case 376: /* AssignmentExpression: ConditionalExpression  */
  if (yyn == 376)
    /* "src/main/resources/Java_16_Grammar.y":1292  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 377: /* AssignmentExpression: Assignment  */
  if (yyn == 377)
    /* "src/main/resources/Java_16_Grammar.y":1293  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 378: /* Assignment: LeftHandSide AssignmentOperator Expression  */
  if (yyn == 378)
    /* "src/main/resources/Java_16_Grammar.y":1297  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 379: /* LeftHandSide: CompoundName  */
  if (yyn == 379)
    /* "src/main/resources/Java_16_Grammar.y":1301  */
                   { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 380: /* LeftHandSide: FieldAccess  */
  if (yyn == 380)
    /* "src/main/resources/Java_16_Grammar.y":1302  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 381: /* LeftHandSide: ArrayAccess  */
  if (yyn == 381)
    /* "src/main/resources/Java_16_Grammar.y":1303  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 382: /* AssignmentOperator: EQUAL  */
  if (yyn == 382)
    /* "src/main/resources/Java_16_Grammar.y":1307  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 383: /* AssignmentOperator: STAR_EQUAL  */
  if (yyn == 383)
    /* "src/main/resources/Java_16_Grammar.y":1308  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 384: /* AssignmentOperator: SLASH_EQUAL  */
  if (yyn == 384)
    /* "src/main/resources/Java_16_Grammar.y":1309  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 385: /* AssignmentOperator: PERCENT_EQUAL  */
  if (yyn == 385)
    /* "src/main/resources/Java_16_Grammar.y":1310  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 386: /* AssignmentOperator: PLUS_EQUAL  */
  if (yyn == 386)
    /* "src/main/resources/Java_16_Grammar.y":1311  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 387: /* AssignmentOperator: MINUS_EQUAL  */
  if (yyn == 387)
    /* "src/main/resources/Java_16_Grammar.y":1312  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 388: /* AssignmentOperator: LESS_LESS_EQUAL  */
  if (yyn == 388)
    /* "src/main/resources/Java_16_Grammar.y":1313  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 389: /* AssignmentOperator: GR_GR_EQUAL  */
  if (yyn == 389)
    /* "src/main/resources/Java_16_Grammar.y":1314  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 390: /* AssignmentOperator: GR_GR_GR_EQUAL  */
  if (yyn == 390)
    /* "src/main/resources/Java_16_Grammar.y":1315  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 391: /* AssignmentOperator: AMP_EQUAL  */
  if (yyn == 391)
    /* "src/main/resources/Java_16_Grammar.y":1316  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 392: /* AssignmentOperator: CARET_EQUAL  */
  if (yyn == 392)
    /* "src/main/resources/Java_16_Grammar.y":1317  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 393: /* AssignmentOperator: VERTICAL_EQUAL  */
  if (yyn == 393)
    /* "src/main/resources/Java_16_Grammar.y":1318  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 394: /* ConditionalExpression: ConditionalOrExpression ConditionalOrTail  */
  if (yyn == 394)
    /* "src/main/resources/Java_16_Grammar.y":1322  */
                                                { if ( ((tree.Expression.Binary)(yystack.valueAt (0))) == null ) yyval = ((tree.Expression.Expression)(yystack.valueAt (1)));
                                                  else              yyval = new Conditional(((tree.Expression.Expression)(yystack.valueAt (1))),((tree.Expression.Binary)(yystack.valueAt (0))).left,((tree.Expression.Binary)(yystack.valueAt (0))).right); };
  break;


  case 395: /* ConditionalOrTail: %empty  */
  if (yyn == 395)
    /* "src/main/resources/Java_16_Grammar.y":1327  */
                                                       { yyval = null; };
  break;


  case 396: /* ConditionalOrTail: QUESTION Expression COLON ConditionalExpression  */
  if (yyn == 396)
    /* "src/main/resources/Java_16_Grammar.y":1328  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 397: /* ConditionalOrTail: QUESTION Expression COLON LambdaExpression  */
  if (yyn == 397)
    /* "src/main/resources/Java_16_Grammar.y":1329  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 398: /* ConditionalOrExpression: ConditionalAndExpression  */
  if (yyn == 398)
    /* "src/main/resources/Java_16_Grammar.y":1333  */
                                                                    { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 399: /* ConditionalOrExpression: ConditionalOrExpression DBL_VERTICAL ConditionalAndExpression  */
  if (yyn == 399)
    /* "src/main/resources/Java_16_Grammar.y":1334  */
                                                                    { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 400: /* ConditionalAndExpression: InclusiveOrExpression  */
  if (yyn == 400)
    /* "src/main/resources/Java_16_Grammar.y":1338  */
                                                                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 401: /* ConditionalAndExpression: ConditionalAndExpression DBL_AMPERSAND InclusiveOrExpression  */
  if (yyn == 401)
    /* "src/main/resources/Java_16_Grammar.y":1339  */
                                                                   { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 402: /* InclusiveOrExpression: ExclusiveOrExpression  */
  if (yyn == 402)
    /* "src/main/resources/Java_16_Grammar.y":1343  */
                                                           { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 403: /* InclusiveOrExpression: InclusiveOrExpression VERTICAL ExclusiveOrExpression  */
  if (yyn == 403)
    /* "src/main/resources/Java_16_Grammar.y":1344  */
                                                           { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 404: /* ExclusiveOrExpression: AndExpression  */
  if (yyn == 404)
    /* "src/main/resources/Java_16_Grammar.y":1348  */
                                                { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 405: /* ExclusiveOrExpression: ExclusiveOrExpression CARET AndExpression  */
  if (yyn == 405)
    /* "src/main/resources/Java_16_Grammar.y":1349  */
                                                { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 406: /* AndExpression: EqualityExpression  */
  if (yyn == 406)
    /* "src/main/resources/Java_16_Grammar.y":1353  */
                                                 { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 407: /* AndExpression: AndExpression AMPERSAND EqualityExpression  */
  if (yyn == 407)
    /* "src/main/resources/Java_16_Grammar.y":1354  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 408: /* EqualityExpression: RelationalExpression  */
  if (yyn == 408)
    /* "src/main/resources/Java_16_Grammar.y":1358  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 409: /* EqualityExpression: EqualityExpression DBL_EQUAL RelationalExpression  */
  if (yyn == 409)
    /* "src/main/resources/Java_16_Grammar.y":1359  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 410: /* EqualityExpression: EqualityExpression NON_EQUAL RelationalExpression  */
  if (yyn == 410)
    /* "src/main/resources/Java_16_Grammar.y":1360  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 411: /* RelationalExpression: ShiftExpression  */
  if (yyn == 411)
    /* "src/main/resources/Java_16_Grammar.y":1364  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 412: /* RelationalExpression: RelationalExpression LESS ShiftExpression  */
  if (yyn == 412)
    /* "src/main/resources/Java_16_Grammar.y":1365  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 413: /* RelationalExpression: RelationalExpression GREATER ShiftExpression  */
  if (yyn == 413)
    /* "src/main/resources/Java_16_Grammar.y":1366  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 414: /* RelationalExpression: RelationalExpression LESS_EQUAL ShiftExpression  */
  if (yyn == 414)
    /* "src/main/resources/Java_16_Grammar.y":1367  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 415: /* RelationalExpression: RelationalExpression GREATER_EQUAL ShiftExpression  */
  if (yyn == 415)
    /* "src/main/resources/Java_16_Grammar.y":1368  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 416: /* RelationalExpression: InstanceofExpression  */
  if (yyn == 416)
    /* "src/main/resources/Java_16_Grammar.y":1369  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 417: /* InstanceofExpression: RelationalExpression INSTANCEOF Type  */
  if (yyn == 417)
    /* "src/main/resources/Java_16_Grammar.y":1373  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 418: /* InstanceofExpression: RelationalExpression INSTANCEOF Pattern  */
  if (yyn == 418)
    /* "src/main/resources/Java_16_Grammar.y":1374  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 419: /* ShiftExpression: AdditiveExpression  */
  if (yyn == 419)
    /* "src/main/resources/Java_16_Grammar.y":1378  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 420: /* ShiftExpression: ShiftExpression DBL_LESS AdditiveExpression  */
  if (yyn == 420)
    /* "src/main/resources/Java_16_Grammar.y":1379  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 421: /* ShiftExpression: ShiftExpression DBL_GREATER AdditiveExpression  */
  if (yyn == 421)
    /* "src/main/resources/Java_16_Grammar.y":1380  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 422: /* ShiftExpression: ShiftExpression TRIPL_GREATER AdditiveExpression  */
  if (yyn == 422)
    /* "src/main/resources/Java_16_Grammar.y":1381  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 423: /* AdditiveExpression: MultiplicativeExpression  */
  if (yyn == 423)
    /* "src/main/resources/Java_16_Grammar.y":1385  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 424: /* AdditiveExpression: AdditiveExpression PLUS MultiplicativeExpression  */
  if (yyn == 424)
    /* "src/main/resources/Java_16_Grammar.y":1386  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 425: /* AdditiveExpression: AdditiveExpression MINUS MultiplicativeExpression  */
  if (yyn == 425)
    /* "src/main/resources/Java_16_Grammar.y":1387  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 426: /* MultiplicativeExpression: UnaryExpression  */
  if (yyn == 426)
    /* "src/main/resources/Java_16_Grammar.y":1391  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 427: /* MultiplicativeExpression: MultiplicativeExpression STAR UnaryExpression  */
  if (yyn == 427)
    /* "src/main/resources/Java_16_Grammar.y":1392  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 428: /* MultiplicativeExpression: MultiplicativeExpression SLASH UnaryExpression  */
  if (yyn == 428)
    /* "src/main/resources/Java_16_Grammar.y":1393  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 429: /* MultiplicativeExpression: MultiplicativeExpression PERCENT UnaryExpression  */
  if (yyn == 429)
    /* "src/main/resources/Java_16_Grammar.y":1394  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 430: /* UnaryExpression: PreIncrementExpression  */
  if (yyn == 430)
    /* "src/main/resources/Java_16_Grammar.y":1398  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 431: /* UnaryExpression: PreDecrementExpression  */
  if (yyn == 431)
    /* "src/main/resources/Java_16_Grammar.y":1399  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 432: /* UnaryExpression: PLUS UnaryExpression  */
  if (yyn == 432)
    /* "src/main/resources/Java_16_Grammar.y":1400  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 433: /* UnaryExpression: MINUS UnaryExpression  */
  if (yyn == 433)
    /* "src/main/resources/Java_16_Grammar.y":1401  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 434: /* UnaryExpression: UnaryExpressionNotPlusMinus  */
  if (yyn == 434)
    /* "src/main/resources/Java_16_Grammar.y":1402  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 435: /* PreIncrementExpression: DBL_PLUS UnaryExpression  */
  if (yyn == 435)
    /* "src/main/resources/Java_16_Grammar.y":1406  */
                               { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 436: /* PreDecrementExpression: DBL_MINUS UnaryExpression  */
  if (yyn == 436)
    /* "src/main/resources/Java_16_Grammar.y":1410  */
                                 { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 438: /* UnaryExpressionNotPlusMinus: TILDE UnaryExpression  */
  if (yyn == 438)
    /* "src/main/resources/Java_16_Grammar.y":1415  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 439: /* UnaryExpressionNotPlusMinus: EXCLAMATION UnaryExpression  */
  if (yyn == 439)
    /* "src/main/resources/Java_16_Grammar.y":1416  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 440: /* UnaryExpressionNotPlusMinus: CastExpression  */
  if (yyn == 440)
    /* "src/main/resources/Java_16_Grammar.y":1417  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 441: /* UnaryExpressionNotPlusMinus: SwitchExpression  */
  if (yyn == 441)
    /* "src/main/resources/Java_16_Grammar.y":1418  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 442: /* PostfixExpression: Primary  */
  if (yyn == 442)
    /* "src/main/resources/Java_16_Grammar.y":1422  */
                               { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 443: /* PostfixExpression: CompoundName  */
  if (yyn == 443)
    /* "src/main/resources/Java_16_Grammar.y":1423  */
                               { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 444: /* PostfixExpression: PostIncrementExpression  */
  if (yyn == 444)
    /* "src/main/resources/Java_16_Grammar.y":1424  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 445: /* PostfixExpression: PostDecrementExpression  */
  if (yyn == 445)
    /* "src/main/resources/Java_16_Grammar.y":1425  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 446: /* PostIncrementExpression: PostfixExpression DBL_PLUS  */
  if (yyn == 446)
    /* "src/main/resources/Java_16_Grammar.y":1429  */
                                 { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 447: /* PostDecrementExpression: PostfixExpression DBL_MINUS  */
  if (yyn == 447)
    /* "src/main/resources/Java_16_Grammar.y":1433  */
                                  { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 448: /* CastExpression: TargetType UnaryExpression  */
  if (yyn == 448)
    /* "src/main/resources/Java_16_Grammar.y":1437  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 449: /* CastExpression: TargetType LambdaExpression  */
  if (yyn == 449)
    /* "src/main/resources/Java_16_Grammar.y":1438  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 450: /* TargetType: LPAREN TypeList RPAREN  */
  if (yyn == 450)
    /* "src/main/resources/Java_16_Grammar.y":1442  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (1))); };
  break;


  case 451: /* TypeList: Type  */
  if (yyn == 451)
    /* "src/main/resources/Java_16_Grammar.y":1446  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 452: /* TypeList: TypeList AMPERSAND Type  */
  if (yyn == 452)
    /* "src/main/resources/Java_16_Grammar.y":1447  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 453: /* SwitchExpression: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 453)
    /* "src/main/resources/Java_16_Grammar.y":1451  */
                                                  { yyval = new SwitchExpression(((tree.Expression.Expression)(yystack.valueAt (2))),((SwitchBlock)(yystack.valueAt (0)))); };
  break;


  case 454: /* AnnotationSeqOpt: %empty  */
  if (yyn == 454)
    /* "src/main/resources/Java_16_Grammar.y":1463  */
                       { yyval = null; };
  break;


  case 455: /* AnnotationSeqOpt: AnnotationSeq  */
  if (yyn == 455)
    /* "src/main/resources/Java_16_Grammar.y":1464  */
                       { yyval = ((Annotations)(yystack.valueAt (0))); };
  break;


  case 456: /* AnnotationSeq: Annotation  */
  if (yyn == 456)
    /* "src/main/resources/Java_16_Grammar.y":1468  */
                                { yyval = new Annotations(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 457: /* AnnotationSeq: AnnotationSeq Annotation  */
  if (yyn == 457)
    /* "src/main/resources/Java_16_Grammar.y":1469  */
                                { yyval = ((Annotations)(yystack.valueAt (1))).add(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 458: /* Annotation: AT CompoundName  */
  if (yyn == 458)
    /* "src/main/resources/Java_16_Grammar.y":1473  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (0))),(AnnoParameterList)null); };
  break;


  case 459: /* Annotation: AT CompoundName LPAREN RPAREN  */
  if (yyn == 459)
    /* "src/main/resources/Java_16_Grammar.y":1474  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (2))),(AnnoParameterList)null); };
  break;


  case 460: /* Annotation: AT CompoundName LPAREN AnnoParameterList RPAREN  */
  if (yyn == 460)
    /* "src/main/resources/Java_16_Grammar.y":1475  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),/*$4*/ (AnnoParameterList)null); };
  break;


  case 461: /* Annotation: AT CompoundName LPAREN ElementValue RPAREN  */
  if (yyn == 461)
    /* "src/main/resources/Java_16_Grammar.y":1476  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),(AnnoElementValue)null); };
  break;


  case 462: /* AnnoParameterList: IDENTIFIER EQUAL ElementValue  */
  if (yyn == 462)
    /* "src/main/resources/Java_16_Grammar.y":1480  */
                                                            { yyval = null; };
  break;


  case 463: /* AnnoParameterList: AnnoParameterList COMMA IDENTIFIER EQUAL ElementValue  */
  if (yyn == 463)
    /* "src/main/resources/Java_16_Grammar.y":1481  */
                                                            { yyval = null; };
  break;


  case 464: /* ElementValue: ConditionalExpression  */
  if (yyn == 464)
    /* "src/main/resources/Java_16_Grammar.y":1485  */
                                                 { yyval = null; };
  break;


  case 465: /* ElementValue: LBRACE ElementValueListOpt RBRACE  */
  if (yyn == 465)
    /* "src/main/resources/Java_16_Grammar.y":1486  */
                                                 { yyval = null; };
  break;


  case 466: /* ElementValue: LBRACE COMMA RBRACE  */
  if (yyn == 466)
    /* "src/main/resources/Java_16_Grammar.y":1487  */
                                                 { yyval = null; };
  break;


  case 467: /* ElementValue: Annotation  */
  if (yyn == 467)
    /* "src/main/resources/Java_16_Grammar.y":1488  */
                                                 { yyval = null; };
  break;



/* "src/main/java/parser/JavaParser.java":4154  */

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

  private static final short yypact_ninf_ = -653;
  private static final short yytable_ninf_ = -468;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
      85,    -2,     9,   166,  -653,   978,  -653,  -653,  -653,     9,
     472,   540,  -653,     9,  -653,  -653,  -653,  -653,  -653,  -653,
    -653,  -653,  -653,  -653,  -653,  -653,  2886,  -653,  3991,  -653,
    -653,  1062,  4502,  -653,   554,    36,  -653,   121,   214,   272,
     177,   256,   264,   299,   316,  -653,  -653,  -653,  -653,  -653,
    -653,  -653,  -653,  -653,  2886,  3991,  -653,    72,  -653,   391,
    -653,   711,  2947,   361,   310,   416,   416,   431,  -653,   437,
    -653,  -653,  1198,  3607,  -653,  3013,  3673,  3673,  3673,  3673,
    3673,  3673,   413,  -653,  -653,  -653,  -653,  -653,  -653,  -653,
    -653,  -653,  -653,  -653,  -653,   698,  -653,  -653,   359,   489,
    -653,  -653,    89,  -653,   297,   394,    89,  -653,   421,  -653,
    -653,  -653,  -653,  -653,  -653,  -653,  -653,   197,   411,   475,
     474,   493,   455,   163,  -653,   204,   555,   504,  -653,  -653,
    -653,  -653,   536,  -653,  -653,  -653,  3607,  -653,  1758,   415,
     285,   509,   521,  1758,   526,   133,   459,  -653,   538,   416,
    -653,  2835,   531,  4604,   394,  1076,  1904,   567,  -653,   549,
    -653,  -653,  2021,  -653,   281,   573,  -653,   384,  -653,  -653,
    -653,  -653,  -653,  -653,  3145,   445,   314,   321,   565,  -653,
      70,   566,  3607,   582,   586,    89,  -653,   331,  3211,  3607,
      44,  -653,  -653,   301,   566,   595,  -653,  3607,    51,   566,
    3607,  3673,  -653,  3673,  3673,  3673,  3673,  3673,  3673,  3673,
    3673,  3673,  3673,  1627,  3673,  3673,  3673,  3673,  3673,  3673,
    3673,  3673,  -653,  -653,  -653,  -653,    89,  -653,   553,  -653,
    4159,  -653,  -653,   601,   171,  -653,   537,   300,  -653,  -653,
     133,  1758,   608,   605,   284,   310,   544,  -653,   156,   481,
     341,   438,  -653,  4491,  3277,  -653,  3277,  -653,  -653,  -653,
    -653,  -653,  -653,  -653,  -653,  -653,  -653,  -653,  -653,  3607,
    -653,  1758,  -653,  -653,  3145,  -653,     7,  -653,   344,  -653,
    2788,  3343,   382,   321,  -653,   352,   612,   302,   561,   565,
    -653,   568,   569,   621,  -653,   552,  -653,   613,  -653,   440,
    -653,   619,   566,   618,  -653,   574,   620,  -653,    26,   564,
     627,  -653,  -653,   581,   584,   628,   411,   475,   474,   493,
     455,   163,   163,   204,   204,   204,   204,   590,  -653,    49,
    -653,  -653,   555,   555,   555,   504,   504,  -653,  -653,  -653,
     622,  -653,  4436,  4170,  1758,   505,   632,  -653,   593,  1758,
     133,  -653,  -653,  -653,  4215,  -653,  1758,   447,  -653,   616,
     646,  1758,   310,   597,    50,  -653,   598,  -653,  4502,  2151,
    -653,  -653,  -653,  -653,  -653,  -653,  -653,  1758,  1758,   445,
    -653,    97,   651,  3409,  -653,  -653,  -653,  3475,   649,   565,
    -653,  -653,  -653,   612,  -653,   655,  -653,  -653,  -653,  3607,
    -653,   175,   612,   566,  -653,  -653,  -653,  -653,   612,  -653,
    3607,   141,   656,  -653,   656,  3145,   590,   172,  -653,  -653,
    -653,  -653,  -653,  -653,  4436,  -653,   658,  3942,   660,   565,
     612,  -653,   647,   615,  1758,  -653,  -653,  4281,  4226,  -653,
    -653,   565,   174,  4002,  -653,  -653,   649,    89,    89,   641,
     331,  -653,  -653,   663,  3607,  -653,  -653,   664,  3607,    55,
      60,  2731,   672,   674,  3541,   676,   678,  3607,   524,   681,
    3607,  4393,  -653,  2267,  -653,  -653,  -653,  -653,   679,  -653,
    -653,  -653,  -653,  -653,   404,   418,  -653,  -653,  -653,   536,
     541,   546,  -653,  -653,  -653,  1758,  1758,  -653,  -653,   452,
     680,  -653,  -653,   677,  4047,  -653,  -653,   639,  -653,   392,
    -653,  -653,  -653,   643,  -653,   644,  -653,  -653,  -653,  3607,
     259,   590,  -653,   545,   684,  -653,   690,  -653,   697,  4281,
    4058,  -653,  -653,  -653,  -653,   649,  1758,  -653,   650,   231,
    -653,   412,   318,  -653,  -653,  -653,  -653,  -653,  4281,  -653,
    -653,   673,  -653,  4338,  -653,  4103,  -653,  -653,  -653,  -653,
     652,  -653,  2731,   583,  -653,   699,  -653,   701,   678,   594,
    3735,  3607,  -653,   702,  3607,  3607,   703,  3919,    24,   697,
    3607,   712,    49,  -653,  -653,   717,  -653,  -653,  -653,  -653,
    -653,  -653,   725,  3409,  -653,  -653,  4114,  -653,  3673,  -653,
      53,  -653,   185,  -653,  1687,   241,   612,  -653,  -653,   727,
    -653,  -653,   729,  -653,  -653,   253,  -653,   682,   412,  -653,
    -653,   629,  -653,  -653,   318,  -653,  -653,  -653,  -653,   731,
     629,   629,   650,   650,   231,  1391,  -653,  -653,  -653,  -653,
     686,   737,  -653,  -653,  -653,  -653,  -653,  3607,  -653,  -653,
     740,   732,  -653,   734,   738,   742,  -653,   744,   748,  -653,
     337,  -653,   364,  -653,   421,   414,   751,   697,    24,  -653,
    -653,   689,   752,  -653,  -653,  -653,  -653,  -653,   749,  -653,
    -653,  -653,   733,  -653,  -653,  1803,   755,   757,  1919,   764,
    -653,  3079,  -653,  -653,    89,   277,   550,   763,  1758,   737,
    -653,  1561,  -653,  -653,   629,   629,   629,   650,  -653,  2035,
    -653,   768,  3607,  3607,  3607,  3797,  2731,   655,   697,  -653,
    3859,  4502,  -653,  -653,  -653,   706,   689,  2731,  3673,  -653,
    -653,  3607,  -653,   769,   716,  -653,  4491,   601,  -653,    89,
     616,    33,   456,  -653,  -653,  -653,  -653,   629,  -653,   921,
    2383,  2499,   430,   373,  -653,   783,   785,   779,  -653,  -653,
     722,  -653,  -653,  -653,  -653,  1758,   792,  -653,  -653,  -653,
    -653,   787,  -653,  3145,   788,   464,  -653,    33,   381,  -653,
    -653,   770,    89,  4491,  -653,    44,  -653,  2615,  -653,    51,
     612,   612,   789,  2731,  3797,  2731,  -653,  -653,    92,   697,
    -653,  -653,  -653,  -653,  -653,   704,  -653,   753,  -653,  -653,
     715,   574,  -653,    10,   793,   802,  -653,  -653,   738,   814,
    -653,  1758,    89,  -653,  -653,  -653,   612,   612,  -653,  -653,
    2731,  -653,  -653,   803,   812,  -653,  -653,  -653
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
      33,     0,     0,     0,    30,    11,    34,    35,     9,     0,
       0,     0,     1,     0,    22,    17,    18,    28,    21,    20,
      19,    23,    24,    25,    26,    27,    11,    12,    13,    15,
      36,    11,     0,   456,     0,     0,    37,     0,    33,   458,
       0,     0,     0,     0,     0,    43,    45,    61,    62,    63,
      46,   176,   177,    16,    11,    14,   457,     0,    38,     0,
      10,    11,     0,     0,    77,    65,    65,     0,    44,     0,
      39,    32,    11,     0,   459,   468,     0,     0,     0,     0,
       0,     0,     9,     2,     3,     6,     7,    60,    53,    57,
      59,     5,    58,    55,    56,     0,     8,    54,     0,     0,
     306,     4,   170,   303,   443,     0,    47,    49,   442,   309,
     315,   310,   311,   312,   313,   314,   464,   395,   398,   400,
     402,   404,   406,   408,   416,   411,   419,   423,   426,   430,
     431,   434,   437,   444,   445,   440,     0,   441,     0,   456,
       0,     0,     0,     0,     0,     0,   179,    66,     0,    65,
      40,    11,     9,   443,   451,   310,   311,     0,   360,     0,
     361,   377,     0,   376,     0,     0,   469,     0,   432,   433,
     438,   439,   435,   436,     0,     0,    50,     0,   454,   324,
       0,   323,     0,     0,     0,   171,   172,     0,     0,     0,
       0,    51,   340,     0,   323,     0,    52,     0,     0,   323,
       0,     0,   394,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,   446,   447,   449,   448,    48,   460,     0,   461,
      11,   193,    79,    78,   111,   108,    72,     0,    68,    71,
       0,     0,     0,   180,   454,    77,    75,   366,     9,     0,
       0,     0,   371,     0,     0,   308,     0,   382,   383,   384,
     385,   386,   387,   388,   389,   390,   391,   392,   393,     0,
     450,     0,   466,   465,     0,   462,   329,   328,     0,   326,
       0,     0,     0,   170,   356,     0,     0,   323,     0,   455,
     336,     0,     0,     0,   175,     0,   173,     0,   345,     0,
     347,     0,   323,     0,   316,     0,     0,   307,     0,     0,
       0,   335,   317,     0,     0,     0,   399,   401,   403,   405,
     407,   409,   410,   412,   413,   414,   415,     0,   417,    47,
     302,   418,   420,   421,   422,   424,   425,   427,   428,   429,
       0,   194,    11,    11,     0,   118,   112,   113,     0,     0,
       0,    67,    70,   181,    11,   178,     0,     0,   124,     0,
       0,     0,    77,     0,   454,   367,     0,   368,    11,     0,
     363,   362,   365,   364,   378,   452,   470,     0,     0,     0,
     325,   332,     0,   143,   355,   354,   357,     0,    83,   454,
     320,   319,   321,     0,   351,     0,   305,   174,   346,     0,
     338,     0,     0,   323,   350,   353,   304,   339,     0,   349,
       0,   137,   214,   135,   213,     0,     0,     0,   200,   201,
     199,   196,   198,   195,    11,    80,   118,    11,     0,   454,
     115,    81,    74,     0,     0,    69,   183,    11,    11,   182,
     122,   454,   454,    11,   121,    76,     0,   170,   170,     0,
     455,   370,   372,     0,     0,   205,   221,     9,     0,     0,
       0,     0,     0,     0,     0,     0,    25,     0,     0,     0,
       0,    11,   220,     0,   207,   212,   215,   216,     0,   217,
     218,   219,   272,   273,   309,   312,   242,   243,   244,     0,
     245,   246,   330,   331,   327,     0,     0,   358,   148,     0,
     144,   145,   147,     0,    11,   318,    84,     0,   343,   260,
     453,   348,   337,     0,   341,     0,   342,   397,   396,     0,
     139,     0,   463,     0,     0,   197,     0,    92,    23,    11,
      11,    87,    90,   109,   114,   116,     0,    73,     0,     0,
     189,     0,     0,   190,   185,   187,   188,   184,    11,   125,
     126,     0,   128,    11,   132,    11,   130,    64,   374,   373,
       0,   240,     0,     0,   227,     0,   229,     0,     0,     0,
     275,     0,   231,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,   209,   210,     0,   206,   208,   222,   333,
     334,   141,     0,     0,   359,    85,    11,   322,     0,   268,
       0,   255,     0,   261,     0,     0,     0,   352,   138,     0,
     136,   191,     0,   110,    91,     0,    95,     0,     0,    89,
      97,   166,    93,    94,     0,    96,    88,   117,    82,     0,
     166,   166,     0,     0,     0,     0,   169,   192,   168,   186,
       0,     9,   129,   131,   375,   241,   223,     0,   228,   230,
       0,   277,   280,     0,   276,     0,   232,     0,     0,   234,
      50,   300,     0,   298,     0,   310,     0,     0,   236,   287,
     238,   285,     0,   235,   211,   142,   146,    86,   267,   269,
     252,   256,     0,   253,   262,     0,     0,    17,     0,     0,
     265,     0,   344,   140,   170,   137,     0,     0,     0,     0,
     149,     0,   155,   154,   166,   166,   166,     0,   127,     0,
     133,     0,     0,     0,   278,     0,     0,     0,     0,   296,
       0,    11,   295,   288,   237,   293,   286,     0,     0,   254,
     266,     0,   258,     0,   203,   134,     0,   167,    98,   170,
       0,   454,     0,   158,   153,   150,   152,   166,   100,   379,
       0,     0,   442,     0,   224,     0,     0,     0,   279,   281,
     250,   225,   233,   297,   299,     0,     0,   239,   294,   271,
     270,     0,   257,     0,     0,     0,   156,   454,   170,   164,
     161,     0,   170,     0,   151,     0,   101,     0,   102,   323,
       0,     0,     0,     0,   282,     0,   249,   291,     0,     0,
     259,   204,   202,    99,   160,     0,   162,     0,   157,   159,
       0,   324,   103,     0,     0,     0,   226,   284,   283,     0,
     251,     0,   170,   289,   165,   163,     0,     0,   105,   104,
       0,   292,   290,     0,     0,   274,   106,   107
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -653,  -653,    -1,    42,  -652,   -11,   207,  -653,  -653,   790,
    -653,    32,  -653,   760,   772,   -43,   653,  -653,  -270,  -653,
     -30,  -403,  -653,   480,   591,  -653,  -219,   136,  -653,  -653,
    -418,   332,  -419,  -653,  -653,  -653,   138,  -653,  -653,  -653,
    -653,  -653,   410,   417,  -653,  -653,  -653,   399,  -653,  -653,
     286,  -653,  -324,   324,  -278,  -653,  -653,   249,  -653,  -292,
    -476,   108,    73,    76,  -576,   233,   -96,  -172,    91,  -284,
     387,  -653,  -653,  -653,  -653,   307,  -404,  -653,  -653,  -653,
    -653,   435,  -653,  -653,   617,  -367,  -455,  -203,  -413,  -653,
    -653,  -551,  -653,  -653,   143,  -653,   261,  -653,   260,   262,
    -440,  -653,  -653,  -653,  -653,  -653,  -653,    69,  -653,  -653,
    -653,   194,  -639,  -653,  -653,  -653,  -630,  -653,  -653,   147,
    -653,  -557,   349,  -183,  -653,  -653,  -167,   -93,  -653,   490,
     771,   810,   630,  -269,  -653,  -653,  -653,  -653,   587,   754,
    -120,  -653,  -653,  -653,   506,  -573,   635,  -653,  -653,   -53,
    -653,  -653,   675,   691,   671,   688,   692,   393,  -653,   278,
     323,   386,   -35,   687,   804,  -653,   809,   879,   892,  -653,
    -653,  -653,  -653,    -3,   220,   192,  -653,   -52,  -653
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short[] yydefgoto_ = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
      -1,   103,   153,    44,    27,    28,    29,     3,     4,     5,
       6,     7,    71,    31,    45,   105,   106,   107,    46,    47,
     617,   147,   237,   238,   239,   362,   144,   233,   432,   505,
     506,   530,   531,   619,   620,   621,   710,   750,    48,   235,
     345,   346,   347,   428,    49,   245,   357,   358,   444,   555,
     556,   622,   414,   413,   498,   499,   500,   501,   623,   542,
     631,   742,   743,   780,   699,   637,   195,   185,   186,    50,
      51,   242,   243,   355,   438,   544,   420,   546,    52,   231,
     343,   421,   422,   774,   472,   688,   474,   661,   475,   476,
     477,   478,   479,   796,   510,   600,   601,   602,   603,   604,
     689,   678,   480,   481,   482,   653,   757,   654,   819,   483,
     725,   668,   669,   766,   798,   767,   670,   579,   662,   663,
     331,   108,   109,   110,   286,   287,   178,   179,   278,   279,
     155,   156,   113,   192,   299,   114,   115,   283,   284,   157,
     158,   159,   250,   251,   252,   160,   161,   162,   269,   163,
     202,   117,   118,   119,   120,   121,   122,   123,   124,   125,
     126,   127,   128,   129,   130,   131,   132,   133,   134,   135,
     136,   164,   137,   348,   138,    33,   140,   141,   167
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
      10,    11,   473,   412,   384,   282,   184,   304,    34,   116,
     330,   191,    39,   291,   292,   312,   224,   388,   587,   652,
     664,    55,   116,   166,   554,   679,   360,   308,   557,   723,
     154,   313,   314,   545,   541,   146,   148,    30,   724,    39,
     183,   168,   169,   170,   171,   172,   173,    26,   569,   740,
      59,    13,   177,     8,   702,   703,   183,   183,   419,   680,
     191,   104,   630,   175,     8,   408,   564,    13,    13,   605,
     175,   566,   418,    54,   104,   104,   104,   104,   104,   104,
     104,   404,   377,   191,   740,   -29,    69,   723,   778,   175,
     666,    60,   523,    30,   176,   768,   183,   305,     9,    60,
     232,   225,   667,    26,   411,   448,   311,    13,   154,   378,
     565,   626,   827,   821,    54,   567,   405,   627,   598,   246,
     391,   116,   275,   599,   508,   290,   618,    60,   744,   745,
     746,   740,   277,   514,   302,   104,   554,   176,   779,   516,
     419,   302,   176,   446,   545,   541,   303,   822,   183,   645,
     618,    13,   752,   543,   418,   770,   704,   705,   706,    13,
     682,   535,   686,   664,   759,  -369,    12,   540,     1,   519,
     328,   784,   495,   104,   176,   288,    60,   626,     2,   183,
     254,   183,   209,   210,   337,   338,   339,   385,   236,    13,
      13,   683,    13,   249,   175,   211,   212,   196,   353,   496,
     104,   583,   104,   104,   104,   104,   104,   104,   104,   104,
     104,   104,   176,   104,   104,   104,   104,   104,   104,   104,
     104,   116,   376,   200,    56,    32,  -454,   524,   375,   550,
     512,   747,     8,   587,   513,    53,   515,   624,   183,   520,
     176,   359,    55,   652,   201,   625,    32,   213,   176,    13,
     598,    32,   176,   690,   139,   599,   214,   215,   216,   616,
     183,   624,    53,    63,   543,   691,   183,   139,   585,   625,
     176,    13,   342,   104,    32,    62,   296,    13,   540,   176,
     701,    32,    37,   616,   183,   270,   629,   609,  -123,   227,
     517,   696,    32,  -123,   228,    13,   587,     1,   271,   416,
     188,   425,    13,   760,   189,   519,   431,   190,   695,   350,
     -50,    64,   389,   439,   769,   -50,   175,   196,   445,    65,
     351,   175,   187,   369,    37,   187,   187,   390,   281,   636,
      56,   693,   587,   175,   492,   493,   277,   692,   297,    13,
     188,   176,   751,   176,   189,   365,   433,   190,   176,    13,
     366,   558,   559,   379,    66,   176,   175,   518,   176,   387,
     176,   449,   116,   522,   380,   240,   139,   651,   719,   180,
      13,   253,   181,   296,   187,   720,   176,   176,   176,    56,
     817,   416,   820,   787,    67,   424,   507,   383,   183,   183,
     273,   805,   143,   274,   416,   280,   437,   285,   289,    13,
      13,   183,    70,   306,   193,   187,   307,   194,  -248,   104,
     249,   471,    13,  -248,   104,  -248,   142,   835,  -301,  -467,
     196,  -467,  -247,   176,  -467,  -301,  -467,  -247,   197,  -247,
      13,   198,    56,   176,   199,   145,   176,   197,   359,   551,
     789,   174,   367,   199,   398,    56,   187,   368,   150,   399,
      32,   440,   589,   590,   289,   196,   441,   598,   591,   203,
     782,   592,   599,    13,   289,   783,   139,     8,   803,   529,
     176,   276,    56,   783,    87,   790,    88,    56,   791,    89,
     548,    56,    35,    36,    90,   553,   149,   323,   324,   325,
     326,    92,   182,   628,   176,   176,   204,    93,   633,    94,
       8,   205,   187,   285,   207,   416,   208,    87,   196,    88,
     206,    97,    89,   229,   426,   471,   427,    90,   219,   220,
     221,   814,   815,   520,    92,   632,   230,   577,   176,   369,
      93,   234,    94,   196,   241,   176,     8,   332,   333,   334,
     176,   244,   753,    87,    97,    88,   529,   176,    89,   187,
      37,    38,   176,    90,   521,   254,   611,   833,   834,   521,
      92,   735,   253,    32,    57,    58,    93,   191,    94,   434,
     240,   255,   529,   256,    32,   633,   660,   217,   218,   272,
      97,   222,   223,    13,   450,   175,  -444,  -444,    32,   253,
     294,  -445,  -445,   363,   646,   647,   295,   553,   734,   280,
     321,   322,   304,   335,   336,   309,   312,   139,   340,   289,
     344,   296,   349,   354,   356,   188,   392,   176,   810,   361,
     396,   397,   813,   393,   394,   395,    56,   400,   401,   402,
     196,   187,   406,   403,   176,   407,   408,   187,   529,   409,
     410,   429,    56,   776,   253,   411,   471,    32,   430,   289,
     415,   443,   447,   451,   504,   232,   191,   253,    32,   497,
     509,   289,   450,    32,   536,   521,   533,   187,   187,   427,
     537,     8,   560,   196,   561,   570,   562,   571,    87,   574,
      88,   575,   806,    89,   580,   594,   808,   612,    90,   593,
     588,    32,   811,   253,   597,    92,   613,   176,   606,   607,
     176,    93,   369,    94,   640,   629,   196,   644,   749,   650,
     648,   -41,   649,   656,   659,    97,    13,   175,   484,   660,
     116,   801,   797,   673,    32,   196,   832,   471,   674,    13,
     471,   675,   383,   694,   701,   176,   698,   697,   781,   176,
     187,   708,   709,   712,   713,   714,   716,   715,   717,    32,
      32,   471,   718,     8,   721,   666,   727,   691,   728,   187,
      87,   635,    88,   765,   176,    89,   736,   690,   253,  -268,
      90,    14,   104,    32,   781,    32,   730,    92,   831,   754,
     772,    15,   176,    93,   667,    94,   773,   792,    16,   793,
     794,   226,   471,   471,     1,   795,   799,    97,   800,   802,
     816,   807,   187,    17,   828,    18,    19,    20,   825,   824,
     484,    21,    22,   829,   836,    23,    32,   826,   830,    24,
     176,    72,   484,   837,   253,    25,    68,    56,    61,   471,
     435,   352,   196,   111,   737,   187,   596,   738,   635,   534,
     549,   643,   676,   526,   775,   610,   111,   111,   111,   111,
     111,   111,   111,   804,   187,   639,   809,   700,   584,   525,
     761,   681,   684,   818,   685,   726,   329,   764,   196,   494,
     386,   370,   112,   372,   452,   318,   316,     0,     0,     0,
       0,     0,     0,     0,     0,   112,   112,   112,   112,   112,
     112,   112,     0,   319,   317,     0,     0,     0,   320,     0,
       0,     0,   364,     0,     0,   253,   226,   111,   253,     0,
       0,   484,     0,     0,   187,   187,     0,     0,     0,   484,
       0,    32,     0,     0,   188,     0,     0,     0,   189,   253,
       0,   785,     0,   226,   -50,     0,   293,     0,     0,   -50,
     175,    32,   300,   301,     0,   111,   112,     0,     0,     0,
       0,   310,     0,   484,   315,     0,    32,     0,     0,   187,
       0,   450,     0,     0,     0,   139,  -443,  -443,     0,     0,
     253,   253,   111,     0,   111,   111,   111,   111,   111,   111,
     111,   111,   111,   111,   112,   111,   111,   111,   111,   111,
     111,   111,   111,     0,     0,   417,    13,   450,   187,   485,
       0,     0,   187,    32,   486,     0,     0,   253,   371,     0,
     373,   112,   442,   112,   112,   112,   112,   112,   112,   112,
     112,   112,   112,   374,   112,   112,   112,   112,   112,   112,
     112,   112,     0,     0,   484,   382,     0,   484,    14,     0,
       0,     0,   187,     0,   532,   111,     0,     0,    15,     0,
       0,     0,     0,     0,     0,    16,   487,     0,   484,     0,
     532,     1,   -31,     0,   484,   484,     0,     0,     0,     0,
      17,     0,    18,    19,    20,     0,   484,   417,    21,    22,
      13,     0,    23,     0,   112,   578,    24,   226,     0,     0,
     539,   485,    25,     0,     0,     0,   486,     0,     0,   484,
     484,     0,     0,   485,  -380,     0,     0,     0,   486,     0,
    -380,  -380,  -380,  -380,  -380,  -380,  -380,  -380,  -380,  -380,
    -380,   532,    14,     0,   582,     0,     0,     0,     0,     0,
       0,     0,    15,     0,     0,     0,   484,   502,     0,    16,
       0,   503,   484,   484,   484,   614,     0,   532,   487,     0,
       0,     0,     0,   511,    17,     0,    18,    19,    20,   638,
     487,     0,    21,    22,     0,     0,    23,     0,     0,     0,
      24,     0,   532,   488,     0,     0,    25,     0,   489,   484,
       0,   111,   615,     0,     0,     0,   111,     0,     0,     0,
       0,     0,   485,     0,   634,     0,   671,   486,   -42,     0,
     485,   539,     0,     0,     0,   486,   615,     0,     0,     0,
       0,     0,   563,   532,     0,     0,    13,     0,   573,     0,
     112,   576,     0,   329,   581,   112,     0,     0,     0,     0,
     329,     0,     0,     0,   485,     0,     0,     0,     0,   486,
       0,   638,     0,     0,     0,     0,     0,     0,   490,   487,
       0,     0,     0,     0,     0,     0,     0,   487,    14,     0,
       0,   491,     0,     0,     0,   488,     0,     0,    15,     0,
     489,   634,     0,   608,     0,    16,     0,   488,     0,     0,
       0,     0,   489,     0,   722,     0,     0,     0,   226,     0,
      17,   487,    18,    19,    20,     0,     0,     0,    21,    22,
       0,     0,    23,     0,     0,     0,    24,     0,   732,     0,
       0,     0,    25,     0,     0,   485,     0,     0,   485,     0,
     486,     0,     0,   486,     0,   655,     0,     0,   657,   658,
       0,     0,     0,     0,   672,   762,     0,     0,     0,   485,
     490,     0,     0,     0,   486,   485,   485,   502,   665,     0,
     486,   486,   490,   491,   741,     0,     0,   485,     0,     0,
       0,     0,   486,     0,     0,   491,   488,     0,     0,     0,
       0,   489,   487,   329,   488,   487,     0,     0,     0,   489,
     485,   485,     0,     0,     0,   486,   486,   112,     0,   741,
       0,     0,     0,   777,     0,     0,   487,     0,     0,     0,
       0,   711,   487,   487,     0,     0,     0,     0,   488,    13,
       0,     0,     0,   489,   487,     0,   823,   485,     0,     0,
       0,     0,   486,   485,   485,   485,     0,     0,   486,   486,
     486,     0,     0,     0,     0,     0,   741,   487,   487,     0,
       0,   490,     0,     0,     0,   733,     8,     0,     0,   490,
       0,     0,     0,    87,   491,    88,     0,     0,    89,     0,
     485,     0,   491,    90,     0,   486,   755,   756,   758,     0,
      92,     0,     0,     0,   487,     0,    93,     0,    94,     0,
     487,   487,   487,   490,     0,   771,     0,     0,     0,   488,
      97,   665,   488,     0,   489,     0,   491,   489,     0,     0,
       0,     0,     0,     0,   707,     0,     0,     0,     0,     0,
       0,     0,     0,   488,     0,     0,     0,   487,   489,   488,
     488,     0,     0,     0,   489,   489,     0,     0,     0,     0,
     112,   488,     0,     0,     0,     0,   489,     0,     0,     0,
       0,     0,     0,     0,   111,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   488,   488,     0,     0,     0,   489,
     489,     0,     0,     0,   490,   739,     0,   490,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   491,     0,    13,
     491,     0,     0,   112,     0,     0,     0,     0,   490,     0,
       0,   488,     0,     0,   490,   490,   489,   488,   488,   488,
       0,   491,   489,   489,   489,     0,   490,   491,   491,     0,
       0,     0,     0,     0,     0,     0,     8,     0,     0,   491,
       0,    14,     0,    87,     0,    88,     0,     0,    89,   490,
     490,    15,     0,    90,   488,     0,     0,     0,    16,   489,
      92,     0,   491,   491,     0,    13,    93,     0,    94,     0,
       0,     0,     0,    17,     0,    18,    19,    20,     0,     0,
      97,    21,    22,     0,     0,    23,   490,     0,     0,    24,
       0,     0,   490,   490,   490,    25,     0,     0,     0,   491,
       0,     0,     8,     0,     0,   491,   491,   491,   453,    87,
     454,    88,   369,  -263,    89,     0,     0,     0,   456,    90,
       0,     0,     0,     0,     0,    13,    92,     0,     0,   490,
       0,     0,    93,     0,    94,     0,     0,     0,     0,     0,
       0,     0,   491,     0,     0,     0,    97,     0,     0,     0,
       0,     0,    80,    81,     0,     0,     0,     0,     0,   327,
       0,     0,   457,    83,    84,    85,    86,    14,   458,    87,
     459,    88,   598,     0,    89,   -11,   460,   687,   461,    90,
       0,   -11,     0,    91,    16,     0,    92,   462,   463,     0,
       0,     0,    93,   -11,    94,     0,    13,    95,    96,    17,
       0,    18,    19,    20,   -11,   464,    97,    21,    22,    98,
     465,   466,   100,   467,     0,    24,     0,   101,   468,   -11,
     102,    25,   469,   470,   453,     0,   454,     0,   369,   729,
       0,     0,     0,     8,   456,     0,     0,     0,     0,     0,
      87,    13,    88,     0,     0,    89,     0,     0,     0,     0,
      90,     0,     0,     0,     0,     0,     0,    92,     0,     0,
       0,     0,     0,    93,     0,    94,     0,     0,    80,    81,
       0,     0,     0,     0,     0,     0,     0,    97,   457,    83,
      84,    85,    86,    14,   458,    87,   459,    88,   598,     0,
      89,   -11,   460,   687,   461,    90,     0,   -11,     0,    91,
      16,     0,    92,   462,   463,     0,     0,     0,    93,   -11,
      94,     0,     0,    95,    96,    17,     0,    18,    19,    20,
     -11,   464,    97,    21,    22,    98,   465,   466,   100,   467,
       0,    24,     0,   101,   468,   -11,   102,    25,   469,   470,
     453,     0,   454,     0,   369,  -264,     0,     0,     0,     0,
     456,     0,  -381,     0,     0,     0,     0,    13,  -381,  -381,
    -381,  -381,  -381,  -381,  -381,  -381,  -381,  -381,  -381,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    80,    81,     0,     0,     0,     0,
       0,     0,     0,     0,   457,    83,    84,    85,    86,    14,
     458,    87,   459,    88,  -264,     0,    89,   -11,   460,    15,
     461,    90,     0,   -11,     0,    91,    16,     0,    92,   462,
     463,     0,     0,     0,    93,   -11,    94,     0,     0,    95,
      96,    17,     0,    18,    19,    20,   -11,   464,    97,    21,
      22,    98,   465,   466,   100,   467,     0,    24,     0,   101,
     468,   -11,   102,    25,   469,   470,   453,     0,   454,     0,
     369,   748,     0,     0,     0,     0,   456,     0,     0,   257,
       0,     0,     0,    13,   175,   258,   259,   260,   261,   262,
     263,   264,   265,   266,   267,   268,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
      80,    81,     0,     0,     0,     0,     0,     0,     0,     0,
     457,    83,    84,    85,    86,    14,   458,    87,   459,    88,
       0,     0,    89,   -11,   460,    15,   461,    90,     0,   -11,
       0,    91,    16,     0,    92,   462,   463,     0,     0,     0,
      93,   -11,    94,     0,     0,    95,    96,    17,     0,    18,
      19,    20,   -11,   464,    97,    21,    22,    98,   465,   466,
     100,   467,     0,    24,     0,   101,   468,   -11,   102,    25,
     469,   470,   453,     0,   454,     0,   369,   455,     0,     0,
       0,     0,   456,     0,     0,     0,     0,     0,     0,    13,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    80,    81,     0,     0,
       0,     0,     0,     0,     0,     0,   457,    83,    84,    85,
      86,    14,   458,    87,   459,    88,     0,     0,    89,   -11,
     460,    15,   461,    90,     0,   -11,     0,    91,    16,     0,
      92,   462,   463,     0,     0,     0,    93,   -11,    94,     0,
       0,    95,    96,    17,     0,    18,    19,    20,   -11,   464,
      97,    21,    22,    98,   465,   466,   100,   467,     0,    24,
       0,   101,   468,   -11,   102,    25,   469,   470,   453,     0,
     454,     0,   369,   586,     0,     0,     0,     0,   456,     0,
       0,     0,     0,     0,     0,    13,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    80,    81,     0,     0,     0,     0,     0,     0,
       0,     0,   457,    83,    84,    85,    86,    14,   458,    87,
     459,    88,     0,     0,    89,   -11,   460,    15,   461,    90,
       0,   -11,     0,    91,    16,     0,    92,   462,   463,     0,
       0,     0,    93,   -11,    94,     0,     0,    95,    96,    17,
       0,    18,    19,    20,   -11,   464,    97,    21,    22,    98,
     465,   466,   100,   467,     0,    24,     0,   101,   468,   -11,
     102,    25,   469,   470,   453,     0,   454,     0,   369,   786,
       0,     0,     0,     0,   456,     0,     0,     0,     0,     0,
       0,    13,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,    80,    81,
       0,     0,     0,     0,     0,     0,     0,     0,   457,    83,
      84,    85,    86,    14,   458,    87,   459,    88,     0,     0,
      89,   -11,   460,    15,   461,    90,     0,   -11,     0,    91,
      16,     0,    92,   462,   463,     0,     0,     0,    93,   -11,
      94,     0,     0,    95,    96,    17,     0,    18,    19,    20,
     -11,   464,    97,    21,    22,    98,   465,   466,   100,   467,
       0,    24,     0,   101,   468,   -11,   102,    25,   469,   470,
     453,     0,   454,     0,   369,   788,     0,     0,     0,     0,
     456,     0,     0,     0,     0,     0,     0,    13,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    80,    81,     0,     0,     0,     0,
       0,     0,     0,     0,   457,    83,    84,    85,    86,    14,
     458,    87,   459,    88,     0,     0,    89,   -11,   460,    15,
     461,    90,     0,   -11,     0,    91,    16,     0,    92,   462,
     463,     0,     0,     0,    93,   -11,    94,     0,     0,    95,
      96,    17,     0,    18,    19,    20,   -11,   464,    97,    21,
      22,    98,   465,   466,   100,   467,     0,    24,     0,   101,
     468,   -11,   102,    25,   469,   470,   453,     0,   454,     0,
     369,   812,     0,     0,     0,     0,   456,     0,     0,     0,
       0,     0,     0,    13,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
      80,    81,     0,     0,     0,     0,     0,     0,     0,     0,
     457,    83,    84,    85,    86,    14,   458,    87,   459,    88,
       0,     0,    89,   -11,   460,    15,   461,    90,     0,   -11,
       0,    91,    16,     0,    92,   462,   463,     0,     0,     0,
      93,   -11,    94,     0,     0,    95,    96,    17,     0,    18,
      19,    20,   -11,   464,    97,    21,    22,    98,   465,   466,
     100,   467,     0,    24,     0,   101,   468,   -11,   102,    25,
     469,   470,   453,     0,   454,     0,   369,     0,     0,     0,
       0,     0,   456,     0,     0,     0,     0,     0,     0,    13,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    80,    81,     0,     0,
       0,     0,     0,     0,     0,     0,   457,    83,    84,    85,
      86,     0,   458,    87,   459,    88,     0,     0,    89,     0,
     460,     0,   461,    90,     0,     0,    13,    91,     0,     0,
      92,   462,   463,     0,   381,     0,    93,     0,    94,     0,
       0,    95,    96,     0,     0,     0,     0,     0,     0,   464,
      97,     0,     0,    98,   465,   568,   100,   467,   151,   247,
       0,   101,   468,     8,   102,     0,   469,   470,     0,     0,
      87,     0,    88,    13,     0,    89,     0,    76,    77,     0,
      90,     0,     0,     0,    78,    79,     0,    92,     0,     0,
       0,     0,     0,    93,     0,    94,     0,     0,     0,     0,
      80,    81,     0,     0,     0,     0,     0,    97,     0,     0,
     248,    83,    84,    85,    86,    14,     0,    87,     0,    88,
       0,     0,    89,     0,    40,    15,     0,    90,     0,     0,
       0,    91,    16,     0,    92,     0,     0,     0,     0,     0,
      93,     0,    94,     0,     0,    95,    96,    17,     0,    18,
      19,    20,     0,     0,    97,    21,    22,    98,    99,    23,
     100,     0,     0,    24,     0,   101,    14,     0,   102,    25,
      73,    74,    75,     0,     0,     0,    15,     0,     0,     0,
      41,     0,     0,    16,     0,    13,     0,     0,     0,    76,
      77,     0,    42,     0,     0,     0,    78,    79,    17,     0,
      18,    19,    20,    43,     0,     0,    21,    22,     0,     0,
      23,     0,    80,    81,    24,     0,     0,     0,     0,     0,
      25,     0,    82,    83,    84,    85,    86,     0,     0,    87,
       0,    88,     0,     0,    89,     0,    73,     0,    75,    90,
       0,     0,   165,    91,     0,     0,    92,     0,     0,     0,
       0,    13,    93,     0,    94,    76,    77,    95,    96,     0,
       0,     0,    78,    79,     0,     0,    97,     0,     0,    98,
      99,     0,   100,     0,     0,     0,     0,   101,    80,    81,
     102,     0,     0,     0,     0,     0,     0,     0,     8,    83,
      84,    85,    86,     0,     0,    87,     0,    88,     0,     0,
      89,     0,   151,     0,   369,    90,     0,     0,     0,    91,
       0,     0,    92,     0,     0,     0,     0,    13,    93,     0,
      94,    76,    77,    95,    96,     0,     0,     0,    78,    79,
       0,     0,    97,     0,     0,    98,    99,     0,   100,     0,
       0,     0,     0,   101,    80,    81,   102,     0,     0,     0,
       0,     0,     0,     0,   152,    83,    84,    85,    86,     0,
       0,    87,     0,    88,     0,     0,    89,     0,    73,     0,
      75,    90,     0,     0,     0,    91,     0,     0,    92,     0,
       0,     0,     0,    13,    93,     0,    94,    76,    77,    95,
      96,     0,     0,     0,    78,    79,     0,     0,    97,     0,
       0,    98,    99,     0,   100,   731,     0,     0,     0,   101,
      80,    81,   102,     0,     0,     0,     0,     0,     0,     0,
       8,    83,    84,    85,    86,     0,     0,    87,     0,    88,
       0,     0,    89,     0,   151,   298,     0,    90,     0,     0,
       0,    91,     0,     0,    92,     0,     0,     0,     0,    13,
      93,     0,    94,    76,    77,    95,    96,     0,     0,     0,
      78,    79,     0,     0,    97,     0,     0,    98,    99,     0,
     100,     0,     0,     0,     0,   101,    80,    81,   102,     0,
       0,     0,     0,     0,     0,     0,   152,    83,    84,    85,
      86,     0,     0,    87,     0,    88,     0,     0,    89,     0,
     151,     0,   369,    90,     0,     0,     0,    91,     0,     0,
      92,     0,     0,     0,     0,    13,    93,     0,    94,    76,
      77,    95,    96,     0,     0,     0,    78,    79,     0,     0,
      97,     0,     0,    98,    99,     0,   100,     0,     0,     0,
       0,   101,    80,    81,   102,     0,     0,     0,     0,     0,
       0,     0,   152,    83,    84,    85,    86,     0,     0,    87,
       0,    88,     0,     0,    89,     0,   151,     0,     0,    90,
       0,   294,     0,    91,     0,     0,    92,     0,     0,     0,
       0,    13,    93,     0,    94,    76,    77,    95,    96,     0,
       0,     0,    78,    79,     0,     0,    97,     0,     0,    98,
      99,     0,   100,     0,     0,     0,     0,   101,    80,    81,
     102,     0,     0,     0,     0,     0,     0,     0,   152,    83,
      84,    85,    86,     0,     0,    87,     0,    88,     0,     0,
      89,     0,   151,     0,   383,    90,     0,     0,     0,    91,
       0,     0,    92,     0,     0,     0,     0,    13,    93,     0,
      94,    76,    77,    95,    96,     0,     0,     0,    78,    79,
       0,     0,    97,     0,     0,    98,    99,     0,   100,     0,
       0,     0,     0,   101,    80,    81,   102,     0,     0,     0,
       0,     0,     0,     0,   152,    83,    84,    85,    86,     0,
       0,    87,     0,    88,     0,     0,    89,     0,   151,     0,
       0,    90,     0,   397,     0,    91,     0,     0,    92,     0,
       0,     0,     0,    13,    93,     0,    94,    76,    77,    95,
      96,     0,     0,     0,    78,    79,     0,     0,    97,     0,
       0,    98,    99,     0,   100,     0,     0,     0,     0,   101,
      80,    81,   102,     0,     0,     0,     0,     0,     0,     0,
     152,    83,    84,    85,    86,     0,     0,    87,     0,    88,
       0,     0,    89,     0,   151,     0,     0,    90,     0,     0,
       0,    91,   572,     0,    92,     0,     0,     0,     0,    13,
      93,     0,    94,    76,    77,    95,    96,     0,     0,     0,
      78,    79,     0,     0,    97,     0,     0,    98,    99,     0,
     100,     0,     0,     0,     0,   101,    80,    81,   102,     0,
       0,     0,     0,     0,     0,     0,   152,    83,    84,    85,
      86,     0,     0,    87,     0,    88,     0,     0,    89,     0,
     151,     0,     0,    90,     0,     0,     0,    91,     0,     0,
      92,     0,     0,     0,     0,    13,    93,     0,    94,    76,
      77,    95,    96,     0,     0,     0,    78,    79,     0,     0,
      97,     0,     0,    98,    99,     0,   100,     0,     0,     0,
       0,   101,    80,    81,   102,     0,     0,     0,     0,     0,
       0,     0,   152,    83,    84,    85,    86,     0,     0,    87,
       0,    88,     0,     0,    89,     0,    73,     0,     0,    90,
       0,     0,     0,    91,     0,     0,    92,     0,     0,     0,
       0,    13,    93,     0,    94,    76,    77,    95,    96,     0,
       0,     0,    78,    79,     0,     0,    97,     0,     0,    98,
      99,     0,   100,     0,     0,     0,     0,   101,    80,    81,
     102,     0,     0,     0,     0,     0,     0,     0,     8,    83,
      84,    85,    86,     0,     0,    87,     0,    88,   454,     0,
      89,     0,     0,     0,     0,    90,     0,     0,     0,    91,
       0,     0,    92,    13,     0,     0,     0,     0,    93,     0,
      94,     0,     0,    95,    96,     0,     0,     0,     0,     0,
       0,     0,    97,     0,     0,    98,    99,     0,   100,     0,
      80,    81,     0,   101,     0,     0,   102,     0,     0,     0,
       8,    83,    84,    85,    86,     0,     0,    87,     0,    88,
     454,     0,    89,     0,     0,     0,     0,    90,     0,     0,
       0,    91,     0,     0,    92,    13,     0,     0,     0,     0,
      93,     0,    94,     0,     0,    95,    96,     0,     0,     0,
       0,     0,     0,     0,    97,     0,     0,    98,     0,     0,
     100,     0,    80,    81,     0,   101,     0,   327,   102,     0,
       0,     0,     8,    83,    84,    85,    86,     0,     0,    87,
       0,    88,   454,   763,    89,     0,     0,     0,     0,    90,
       0,     0,     0,    91,     0,     0,    92,    13,     0,     0,
       0,     0,    93,     0,    94,     0,     0,    95,    96,     0,
       0,     0,     0,     0,     0,     0,    97,     0,     0,    98,
       0,     0,   100,     0,     0,     0,     0,   101,     0,     0,
     102,     0,     0,     0,     8,    83,    84,    85,    86,     0,
       0,    87,   454,    88,     0,     0,    89,     0,     0,     0,
       0,    90,     0,     0,     0,    91,     0,    13,    92,     0,
       0,     0,     0,     0,    93,     0,    94,   369,  -119,    95,
      96,     0,     0,   527,     0,     0,     0,     0,    97,     0,
      13,    98,     0,     0,   100,     0,     0,     0,     0,   101,
       0,   327,   102,     0,     8,    83,    84,    85,    86,     0,
       0,    87,     0,    88,     0,     0,    89,     0,     0,     0,
       0,    90,     0,     0,     0,    91,     0,     0,    92,     0,
       0,     0,    14,     0,    93,     0,    94,   369,   552,    95,
      96,     0,    15,   527,     0,     0,     0,     0,    97,    16,
      13,    98,     0,     0,   100,     0,     0,     0,     0,   101,
       0,   327,   102,     0,    17,     0,    18,    19,    20,     0,
       0,     0,   528,    22,     0,     0,    23,     0,     0,     0,
      24,    14,   369,   595,     0,     0,    25,     0,   527,     0,
       0,    15,    14,   369,  -120,    13,     0,     0,    16,   527,
       0,     0,    15,     0,     0,     0,    13,     0,     0,    16,
       0,     0,     0,    17,     0,    18,    19,    20,     0,     0,
       0,    21,    22,     0,    17,    23,    18,    19,    20,    24,
       0,     0,   528,    22,     0,    25,    23,    14,   369,   642,
      24,     0,     0,     0,   527,     0,    25,    15,    14,   369,
     677,    13,     0,     0,    16,   527,     0,     0,    15,     0,
       0,     0,    13,     0,     0,    16,     0,     0,     0,    17,
       0,    18,    19,    20,     0,     0,     0,   528,    22,     0,
      17,    23,    18,    19,    20,    24,     0,     0,   528,    22,
       0,    25,    23,    14,     0,   341,    24,     0,     0,     0,
       0,     0,    25,    15,    14,     0,   423,    13,     0,     0,
      16,     0,     0,     0,    15,     0,     0,     0,    13,     0,
       0,    16,     0,     0,     0,    17,     0,    18,    19,    20,
       0,     0,     0,   528,    22,     0,    17,    23,    18,    19,
      20,    24,     0,     0,   528,    22,     0,    25,    23,    14,
       0,   436,    24,     0,     0,     0,     0,     0,    25,    15,
      14,     0,   547,    13,     0,     0,    16,     0,     0,     0,
      15,     0,     0,     0,    13,     0,     0,    16,     0,     0,
       0,    17,     0,    18,    19,    20,     0,     0,     0,    21,
      22,     0,    17,    23,    18,    19,    20,    24,     0,     0,
      21,    22,     0,    25,    23,    14,     0,     0,    24,     0,
       0,     0,     0,     0,    25,    15,    14,     0,     0,     0,
       0,     0,    16,     0,     0,     0,    15,     0,     0,    40,
     145,     0,     0,    16,     0,     0,     0,    17,     0,    18,
      19,    20,     0,     0,     0,    21,    22,     0,    17,    23,
      18,    19,    20,    24,     0,     0,    21,    22,     0,    25,
      23,     0,     0,     0,    24,     0,     8,     0,     0,     0,
      25,    14,     0,    87,     0,    88,     0,     0,    89,     0,
       0,    15,     0,    90,     0,    41,    40,   145,    16,     0,
      92,     0,     0,     0,     0,     0,    93,    42,    94,     0,
       0,     0,     0,    17,     0,    18,    19,    20,    43,     0,
      97,    21,    22,     0,     0,    23,     0,     0,     0,    24,
       0,     0,     0,   641,   538,    25,     0,     0,    14,     0,
      87,     0,    88,     0,     0,    89,     0,     0,    15,     0,
      90,    13,    41,     0,     0,    16,     0,    92,     0,     0,
       0,     0,     0,    93,    42,    94,     0,     0,     0,     0,
      17,     0,    18,    19,    20,    43,     0,    97,    21,    22,
       0,     0,    23,     0,     0,     0,    24,     0,     8,     0,
       0,   538,    25,    14,    40,    87,     0,    88,     0,     0,
      89,     0,     0,    15,     0,    90,     0,    41,     0,     0,
      16,     0,    92,     0,     0,     0,     0,     0,    93,    42,
      94,     0,     0,     0,     0,    17,     0,    18,    19,    20,
      43,     8,    97,    21,    22,     0,    14,    23,    87,     0,
      88,    24,     0,    89,     0,   327,    15,    25,    90,    13,
      41,     0,     0,    16,     0,    92,     0,     0,     0,     0,
      13,    93,    42,    94,     0,     0,     0,     0,    17,     0,
      18,    19,    20,    43,     0,    97,    21,    22,     0,     0,
      23,     0,     0,     0,    24,     0,     8,     0,     0,     0,
      25,    14,     0,    87,     0,    88,     0,     0,    89,     0,
       0,    15,    14,    90,     0,     0,     0,     0,    16,     0,
      92,     0,    15,     0,     0,     0,    93,     0,    94,    16,
       0,     0,     0,    17,     0,    18,    19,    20,     0,     0,
      97,    21,    22,     0,    17,    23,    18,    19,    20,    24,
       0,     0,    21,    22,     0,    25,    23,   188,   -50,     0,
      24,   189,     0,     0,   190,     0,    25,   -50,     0,     0,
       0,   -50,   -50,   175,     0,     0,     0,     0,     0,     0,
       0,     0,  -379,     0,     0,     0,     0,     0,  -379,  -379,
    -379,  -379,  -379,  -379,  -379,  -379,  -379,  -379,  -379,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   -50
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
       1,     2,   369,   327,   282,   177,   102,   190,     9,    62,
     213,   104,    13,   180,   181,   198,   136,   286,   473,   570,
     577,    32,    75,    75,   443,   598,   245,   194,   446,   668,
      73,   198,   199,   437,   437,    65,    66,     5,   668,    40,
       7,    76,    77,    78,    79,    80,    81,     5,   461,   701,
      14,    18,    95,    55,   630,   631,     7,     7,   342,     6,
     153,    62,   538,    19,    55,    55,    11,    18,    18,   509,
      19,    11,   342,    31,    75,    76,    77,    78,    79,    80,
      81,    55,    75,   176,   736,     0,    14,   726,    55,    19,
      66,    55,   416,    61,    95,   725,     7,   190,   100,    55,
     143,   136,    78,    61,    55,    55,    55,    18,   151,   102,
      55,   530,   102,    21,    72,    55,    90,   535,    65,   149,
     287,   174,   174,    70,   393,    55,   529,    55,   704,   705,
     706,   783,   175,   402,    90,   136,   555,   138,   105,   408,
     424,    90,   143,   362,   548,   548,   102,    55,     7,   562,
     553,    18,   709,   437,   424,   728,   632,   633,   634,    18,
     600,   430,   602,   720,   715,     9,     0,   437,    83,    28,
     213,   747,    75,   174,   175,   178,    55,   596,    93,     7,
      24,     7,    19,    20,   219,   220,   221,   283,    55,    18,
      18,     6,    18,   151,    19,    32,    33,   106,   241,   102,
     201,   471,   203,   204,   205,   206,   207,   208,   209,   210,
     211,   212,   213,   214,   215,   216,   217,   218,   219,   220,
     221,   274,   274,    26,    32,     5,    55,    55,   271,    55,
      55,   707,    55,   688,   401,    28,   403,   529,     7,   411,
     241,   244,   253,   794,    47,   529,    26,    84,   249,    18,
      65,    31,   253,    12,    62,    70,    52,    53,    54,   529,
       7,   553,    55,    86,   548,    24,     7,    75,   471,   553,
     271,    18,   230,   274,    54,     3,   185,    18,   548,   280,
       3,    61,    10,   553,     7,     4,    55,    28,     4,     4,
     410,   615,    72,     9,     9,    18,   751,    83,    17,   342,
       3,   344,    18,   716,     7,    28,   349,    10,    55,     9,
      13,    55,    10,   356,   727,    18,    19,   226,   361,    55,
      20,    19,   102,     5,    10,   105,   106,    25,     7,    11,
     138,   609,   787,    19,   377,   378,   379,   606,     7,    18,
       3,   342,   709,   344,     7,     4,   349,    10,   349,    18,
       9,   447,   448,     9,    55,   356,    19,   410,   359,     7,
     361,   364,   415,   415,    20,   145,   174,   570,     4,    10,
      18,   151,    13,   282,   154,    11,   377,   378,   379,   187,
     793,   424,   795,   750,    68,   343,   389,     5,     7,     7,
       6,    10,    82,     9,   437,   175,   354,   177,   178,    18,
      18,     7,    11,   102,    10,   185,   105,    13,     4,   410,
     368,   369,    18,     9,   415,    11,    55,   830,     4,     4,
     329,     6,     4,   424,     9,    11,    11,     9,     7,    11,
      18,    10,   240,   434,    13,    19,   437,     7,   441,   442,
      10,    28,     4,    13,     4,   253,   226,     9,    11,     9,
     230,     4,   495,   496,   234,   364,     9,    65,     6,    48,
       4,     9,    70,    18,   244,     9,   274,    55,     4,   427,
     471,    26,   280,     9,    62,   102,    64,   285,   105,    67,
     438,   289,    10,    11,    72,   443,    55,   209,   210,   211,
     212,    79,     3,   536,   495,   496,    21,    85,   541,    87,
      55,    27,   282,   283,    49,   548,    51,    62,   417,    64,
      17,    99,    67,     4,     9,   473,    11,    72,    14,    15,
      16,   790,   791,   695,    79,   113,     5,     3,   529,     5,
      85,     5,    87,   442,    75,   536,    55,   214,   215,   216,
     541,     3,   709,    62,    99,    64,   504,   548,    67,   329,
      10,    11,   553,    72,     9,    24,    11,   826,   827,     9,
      79,    11,   342,   343,    10,    11,    85,   660,    87,   349,
     350,     4,   530,    24,   354,   618,   577,    22,    23,     6,
      99,    45,    46,    18,   364,    19,    45,    46,   368,   369,
       8,    45,    46,   112,    11,    12,    10,   555,   694,   379,
     207,   208,   785,   217,   218,    10,   789,   415,    55,   389,
       9,   520,    75,     5,     9,     3,    55,   618,   785,    75,
      68,     8,   789,    55,    55,     4,   434,     8,    10,    55,
     539,   411,    68,    13,   635,     8,    55,   417,   596,    55,
      12,     9,   450,   739,   424,    55,   604,   427,    55,   429,
      28,     5,    55,    55,     5,   698,   749,   437,   438,     8,
       5,   441,   442,   443,    17,     9,     6,   447,   448,    11,
      55,    55,    31,   582,    11,     3,    12,     3,    62,     3,
      64,     3,   778,    67,     3,     8,   782,     3,    72,     9,
      11,   471,   785,   473,    55,    79,     6,   698,    55,    55,
     701,    85,     5,    87,    31,    55,   615,    55,   709,   115,
      11,     0,    11,    11,    11,    99,    18,    19,   369,   720,
     773,   773,   765,    11,   504,   634,   822,   685,    11,    18,
     688,     6,     5,     4,     3,   736,   107,    55,   741,   740,
     520,    55,     5,     3,    12,    11,     4,     9,     4,   529,
     530,   709,     4,    55,     3,    66,     4,    24,     9,   539,
      62,   541,    64,   721,   765,    67,     3,    12,   548,    12,
      72,    60,   773,   553,   777,   555,    12,    79,   821,    11,
      11,    70,   783,    85,    78,    87,    70,     4,    77,     4,
      11,   138,   750,   751,    83,    73,     4,    99,    11,    11,
      11,    31,   582,    92,    11,    94,    95,    96,    55,   105,
     461,   100,   101,    11,    11,   104,   596,   102,     4,   108,
     821,    61,   473,    11,   604,   114,    54,   635,    38,   787,
     350,   240,   741,    62,   698,   615,   504,   699,   618,   429,
     441,   555,   593,   426,   736,   521,    75,    76,    77,    78,
      79,    80,    81,   777,   634,   548,   783,   624,   471,   424,
     717,   600,   602,   794,   602,   671,   213,   720,   777,   379,
     283,   254,    62,   256,   368,   204,   201,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    75,    76,    77,    78,    79,
      80,    81,    -1,   205,   203,    -1,    -1,    -1,   206,    -1,
      -1,    -1,   249,    -1,    -1,   685,   253,   136,   688,    -1,
      -1,   562,    -1,    -1,   694,   695,    -1,    -1,    -1,   570,
      -1,   701,    -1,    -1,     3,    -1,    -1,    -1,     7,   709,
      -1,    10,    -1,   280,    13,    -1,   182,    -1,    -1,    18,
      19,   721,   188,   189,    -1,   174,   136,    -1,    -1,    -1,
      -1,   197,    -1,   604,   200,    -1,   736,    -1,    -1,   739,
      -1,   741,    -1,    -1,    -1,   773,    45,    46,    -1,    -1,
     750,   751,   201,    -1,   203,   204,   205,   206,   207,   208,
     209,   210,   211,   212,   174,   214,   215,   216,   217,   218,
     219,   220,   221,    -1,    -1,   342,    18,   777,   778,   369,
      -1,    -1,   782,   783,   369,    -1,    -1,   787,   254,    -1,
     256,   201,   359,   203,   204,   205,   206,   207,   208,   209,
     210,   211,   212,   269,   214,   215,   216,   217,   218,   219,
     220,   221,    -1,    -1,   685,   281,    -1,   688,    60,    -1,
      -1,    -1,   822,    -1,   427,   274,    -1,    -1,    70,    -1,
      -1,    -1,    -1,    -1,    -1,    77,   369,    -1,   709,    -1,
     443,    83,     0,    -1,   715,   716,    -1,    -1,    -1,    -1,
      92,    -1,    94,    95,    96,    -1,   727,   424,   100,   101,
      18,    -1,   104,    -1,   274,   468,   108,   434,    -1,    -1,
     437,   461,   114,    -1,    -1,    -1,   461,    -1,    -1,   750,
     751,    -1,    -1,   473,    28,    -1,    -1,    -1,   473,    -1,
      34,    35,    36,    37,    38,    39,    40,    41,    42,    43,
      44,   504,    60,    -1,   471,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    70,    -1,    -1,    -1,   787,   383,    -1,    77,
      -1,   387,   793,   794,   795,   528,    -1,   530,   461,    -1,
      -1,    -1,    -1,   399,    92,    -1,    94,    95,    96,   542,
     473,    -1,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,
     108,    -1,   555,   369,    -1,    -1,   114,    -1,   369,   830,
      -1,   410,   529,    -1,    -1,    -1,   415,    -1,    -1,    -1,
      -1,    -1,   562,    -1,   541,    -1,   579,   562,     0,    -1,
     570,   548,    -1,    -1,    -1,   570,   553,    -1,    -1,    -1,
      -1,    -1,   458,   596,    -1,    -1,    18,    -1,   464,    -1,
     410,   467,    -1,   570,   470,   415,    -1,    -1,    -1,    -1,
     577,    -1,    -1,    -1,   604,    -1,    -1,    -1,    -1,   604,
      -1,   624,    -1,    -1,    -1,    -1,    -1,    -1,   369,   562,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,   570,    60,    -1,
      -1,   369,    -1,    -1,    -1,   461,    -1,    -1,    70,    -1,
     461,   618,    -1,   519,    -1,    77,    -1,   473,    -1,    -1,
      -1,    -1,   473,    -1,   667,    -1,    -1,    -1,   635,    -1,
      92,   604,    94,    95,    96,    -1,    -1,    -1,   100,   101,
      -1,    -1,   104,    -1,    -1,    -1,   108,    -1,   691,    -1,
      -1,    -1,   114,    -1,    -1,   685,    -1,    -1,   688,    -1,
     685,    -1,    -1,   688,    -1,   571,    -1,    -1,   574,   575,
      -1,    -1,    -1,    -1,   580,   718,    -1,    -1,    -1,   709,
     461,    -1,    -1,    -1,   709,   715,   716,   593,   577,    -1,
     715,   716,   473,   461,   701,    -1,    -1,   727,    -1,    -1,
      -1,    -1,   727,    -1,    -1,   473,   562,    -1,    -1,    -1,
      -1,   562,   685,   720,   570,   688,    -1,    -1,    -1,   570,
     750,   751,    -1,    -1,    -1,   750,   751,   577,    -1,   736,
      -1,    -1,    -1,   740,    -1,    -1,   709,    -1,    -1,    -1,
      -1,   647,   715,   716,    -1,    -1,    -1,    -1,   604,    18,
      -1,    -1,    -1,   604,   727,    -1,   799,   787,    -1,    -1,
      -1,    -1,   787,   793,   794,   795,    -1,    -1,   793,   794,
     795,    -1,    -1,    -1,    -1,    -1,   783,   750,   751,    -1,
      -1,   562,    -1,    -1,    -1,   691,    55,    -1,    -1,   570,
      -1,    -1,    -1,    62,   562,    64,    -1,    -1,    67,    -1,
     830,    -1,   570,    72,    -1,   830,   712,   713,   714,    -1,
      79,    -1,    -1,    -1,   787,    -1,    85,    -1,    87,    -1,
     793,   794,   795,   604,    -1,   731,    -1,    -1,    -1,   685,
      99,   720,   688,    -1,   685,    -1,   604,   688,    -1,    -1,
      -1,    -1,    -1,    -1,   113,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,   709,    -1,    -1,    -1,   830,   709,   715,
     716,    -1,    -1,    -1,   715,   716,    -1,    -1,    -1,    -1,
     720,   727,    -1,    -1,    -1,    -1,   727,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,   773,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,   750,   751,    -1,    -1,    -1,   750,
     751,    -1,    -1,    -1,   685,     4,    -1,   688,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,   685,    -1,    18,
     688,    -1,    -1,   773,    -1,    -1,    -1,    -1,   709,    -1,
      -1,   787,    -1,    -1,   715,   716,   787,   793,   794,   795,
      -1,   709,   793,   794,   795,    -1,   727,   715,   716,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    -1,    -1,   727,
      -1,    60,    -1,    62,    -1,    64,    -1,    -1,    67,   750,
     751,    70,    -1,    72,   830,    -1,    -1,    -1,    77,   830,
      79,    -1,   750,   751,    -1,    18,    85,    -1,    87,    -1,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,    -1,
      99,   100,   101,    -1,    -1,   104,   787,    -1,    -1,   108,
      -1,    -1,   793,   794,   795,   114,    -1,    -1,    -1,   787,
      -1,    -1,    55,    -1,    -1,   793,   794,   795,     1,    62,
       3,    64,     5,     6,    67,    -1,    -1,    -1,    11,    72,
      -1,    -1,    -1,    -1,    -1,    18,    79,    -1,    -1,   830,
      -1,    -1,    85,    -1,    87,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,   830,    -1,    -1,    -1,    99,    -1,    -1,    -1,
      -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,   112,
      -1,    -1,    55,    56,    57,    58,    59,    60,    61,    62,
      63,    64,    65,    -1,    67,    68,    69,    70,    71,    72,
      -1,    74,    -1,    76,    77,    -1,    79,    80,    81,    -1,
      -1,    -1,    85,    86,    87,    -1,    18,    90,    91,    92,
      -1,    94,    95,    96,    97,    98,    99,   100,   101,   102,
     103,   104,   105,   106,    -1,   108,    -1,   110,   111,   112,
     113,   114,   115,   116,     1,    -1,     3,    -1,     5,     6,
      -1,    -1,    -1,    55,    11,    -1,    -1,    -1,    -1,    -1,
      62,    18,    64,    -1,    -1,    67,    -1,    -1,    -1,    -1,
      72,    -1,    -1,    -1,    -1,    -1,    -1,    79,    -1,    -1,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    45,    46,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    99,    55,    56,
      57,    58,    59,    60,    61,    62,    63,    64,    65,    -1,
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
      61,    62,    63,    64,    65,    -1,    67,    68,    69,    70,
      71,    72,    -1,    74,    -1,    76,    77,    -1,    79,    80,
      81,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,    90,
      91,    92,    -1,    94,    95,    96,    97,    98,    99,   100,
     101,   102,   103,   104,   105,   106,    -1,   108,    -1,   110,
     111,   112,   113,   114,   115,   116,     1,    -1,     3,    -1,
       5,     6,    -1,    -1,    -1,    -1,    11,    -1,    -1,    28,
      -1,    -1,    -1,    18,    19,    34,    35,    36,    37,    38,
      39,    40,    41,    42,    43,    44,    -1,    -1,    -1,    -1,
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
     113,   114,   115,   116,     1,    -1,     3,    -1,     5,     6,
      -1,    -1,    -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,
      -1,    18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,
      57,    58,    59,    60,    61,    62,    63,    64,    -1,    -1,
      67,    68,    69,    70,    71,    72,    -1,    74,    -1,    76,
      77,    -1,    79,    80,    81,    -1,    -1,    -1,    85,    86,
      87,    -1,    -1,    90,    91,    92,    -1,    94,    95,    96,
      97,    98,    99,   100,   101,   102,   103,   104,   105,   106,
      -1,   108,    -1,   110,   111,   112,   113,   114,   115,   116,
       1,    -1,     3,    -1,     5,     6,    -1,    -1,    -1,    -1,
      11,    -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
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
     115,   116,     1,    -1,     3,    -1,     5,    -1,    -1,    -1,
      -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,    18,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    -1,    61,    62,    63,    64,    -1,    -1,    67,    -1,
      69,    -1,    71,    72,    -1,    -1,    18,    76,    -1,    -1,
      79,    80,    81,    -1,    26,    -1,    85,    -1,    87,    -1,
      -1,    90,    91,    -1,    -1,    -1,    -1,    -1,    -1,    98,
      99,    -1,    -1,   102,   103,   104,   105,   106,     3,     4,
      -1,   110,   111,    55,   113,    -1,   115,   116,    -1,    -1,
      62,    -1,    64,    18,    -1,    67,    -1,    22,    23,    -1,
      72,    -1,    -1,    -1,    29,    30,    -1,    79,    -1,    -1,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    -1,    -1,
      45,    46,    -1,    -1,    -1,    -1,    -1,    99,    -1,    -1,
      55,    56,    57,    58,    59,    60,    -1,    62,    -1,    64,
      -1,    -1,    67,    -1,    18,    70,    -1,    72,    -1,    -1,
      -1,    76,    77,    -1,    79,    -1,    -1,    -1,    -1,    -1,
      85,    -1,    87,    -1,    -1,    90,    91,    92,    -1,    94,
      95,    96,    -1,    -1,    99,   100,   101,   102,   103,   104,
     105,    -1,    -1,   108,    -1,   110,    60,    -1,   113,   114,
       3,     4,     5,    -1,    -1,    -1,    70,    -1,    -1,    -1,
      74,    -1,    -1,    77,    -1,    18,    -1,    -1,    -1,    22,
      23,    -1,    86,    -1,    -1,    -1,    29,    30,    92,    -1,
      94,    95,    96,    97,    -1,    -1,   100,   101,    -1,    -1,
     104,    -1,    45,    46,   108,    -1,    -1,    -1,    -1,    -1,
     114,    -1,    55,    56,    57,    58,    59,    -1,    -1,    62,
      -1,    64,    -1,    -1,    67,    -1,     3,    -1,     5,    72,
      -1,    -1,     9,    76,    -1,    -1,    79,    -1,    -1,    -1,
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
       5,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,    -1,
      -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,    90,
      91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,    -1,
      -1,   102,   103,    -1,   105,   106,    -1,    -1,    -1,   110,
      45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      55,    56,    57,    58,    59,    -1,    -1,    62,    -1,    64,
      -1,    -1,    67,    -1,     3,     4,    -1,    72,    -1,    -1,
      -1,    76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,
      85,    -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,
      29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,
     105,    -1,    -1,    -1,    -1,   110,    45,    46,   113,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
       3,    -1,     5,    72,    -1,    -1,    -1,    76,    -1,    -1,
      79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,
      23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,
      99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,
      -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,    62,
      -1,    64,    -1,    -1,    67,    -1,     3,    -1,    -1,    72,
      -1,     8,    -1,    76,    -1,    -1,    79,    -1,    -1,    -1,
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
      -1,    -1,    67,    -1,     3,    -1,    -1,    72,    -1,    -1,
      -1,    76,    11,    -1,    79,    -1,    -1,    -1,    -1,    18,
      85,    -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,
      29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,
     105,    -1,    -1,    -1,    -1,   110,    45,    46,   113,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
       3,    -1,    -1,    72,    -1,    -1,    -1,    76,    -1,    -1,
      79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,
      23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,
      99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,
      -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,    62,
      -1,    64,    -1,    -1,    67,    -1,     3,    -1,    -1,    72,
      -1,    -1,    -1,    76,    -1,    -1,    79,    -1,    -1,    -1,
      -1,    18,    85,    -1,    87,    22,    23,    90,    91,    -1,
      -1,    -1,    29,    30,    -1,    -1,    99,    -1,    -1,   102,
     103,    -1,   105,    -1,    -1,    -1,    -1,   110,    45,    46,
     113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,
      57,    58,    59,    -1,    -1,    62,    -1,    64,     3,    -1,
      67,    -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,    76,
      -1,    -1,    79,    18,    -1,    -1,    -1,    -1,    85,    -1,
      87,    -1,    -1,    90,    91,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,
      45,    46,    -1,   110,    -1,    -1,   113,    -1,    -1,    -1,
      55,    56,    57,    58,    59,    -1,    -1,    62,    -1,    64,
       3,    -1,    67,    -1,    -1,    -1,    -1,    72,    -1,    -1,
      -1,    76,    -1,    -1,    79,    18,    -1,    -1,    -1,    -1,
      85,    -1,    87,    -1,    -1,    90,    91,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    99,    -1,    -1,   102,    -1,    -1,
     105,    -1,    45,    46,    -1,   110,    -1,   112,   113,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,    62,
      -1,    64,     3,     4,    67,    -1,    -1,    -1,    -1,    72,
      -1,    -1,    -1,    76,    -1,    -1,    79,    18,    -1,    -1,
      -1,    -1,    85,    -1,    87,    -1,    -1,    90,    91,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    99,    -1,    -1,   102,
      -1,    -1,   105,    -1,    -1,    -1,    -1,   110,    -1,    -1,
     113,    -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,
      -1,    62,     3,    64,    -1,    -1,    67,    -1,    -1,    -1,
      -1,    72,    -1,    -1,    -1,    76,    -1,    18,    79,    -1,
      -1,    -1,    -1,    -1,    85,    -1,    87,     5,     6,    90,
      91,    -1,    -1,    11,    -1,    -1,    -1,    -1,    99,    -1,
      18,   102,    -1,    -1,   105,    -1,    -1,    -1,    -1,   110,
      -1,   112,   113,    -1,    55,    56,    57,    58,    59,    -1,
      -1,    62,    -1,    64,    -1,    -1,    67,    -1,    -1,    -1,
      -1,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,    -1,
      -1,    -1,    60,    -1,    85,    -1,    87,     5,     6,    90,
      91,    -1,    70,    11,    -1,    -1,    -1,    -1,    99,    77,
      18,   102,    -1,    -1,   105,    -1,    -1,    -1,    -1,   110,
      -1,   112,   113,    -1,    92,    -1,    94,    95,    96,    -1,
      -1,    -1,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,
     108,    60,     5,     6,    -1,    -1,   114,    -1,    11,    -1,
      -1,    70,    60,     5,     6,    18,    -1,    -1,    77,    11,
      -1,    -1,    70,    -1,    -1,    -1,    18,    -1,    -1,    77,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,    -1,
      -1,   100,   101,    -1,    92,   104,    94,    95,    96,   108,
      -1,    -1,   100,   101,    -1,   114,   104,    60,     5,     6,
     108,    -1,    -1,    -1,    11,    -1,   114,    70,    60,     5,
       6,    18,    -1,    -1,    77,    11,    -1,    -1,    70,    -1,
      -1,    -1,    18,    -1,    -1,    77,    -1,    -1,    -1,    92,
      -1,    94,    95,    96,    -1,    -1,    -1,   100,   101,    -1,
      92,   104,    94,    95,    96,   108,    -1,    -1,   100,   101,
      -1,   114,   104,    60,    -1,     6,   108,    -1,    -1,    -1,
      -1,    -1,   114,    70,    60,    -1,     6,    18,    -1,    -1,
      77,    -1,    -1,    -1,    70,    -1,    -1,    -1,    18,    -1,
      -1,    77,    -1,    -1,    -1,    92,    -1,    94,    95,    96,
      -1,    -1,    -1,   100,   101,    -1,    92,   104,    94,    95,
      96,   108,    -1,    -1,   100,   101,    -1,   114,   104,    60,
      -1,     6,   108,    -1,    -1,    -1,    -1,    -1,   114,    70,
      60,    -1,     6,    18,    -1,    -1,    77,    -1,    -1,    -1,
      70,    -1,    -1,    -1,    18,    -1,    -1,    77,    -1,    -1,
      -1,    92,    -1,    94,    95,    96,    -1,    -1,    -1,   100,
     101,    -1,    92,   104,    94,    95,    96,   108,    -1,    -1,
     100,   101,    -1,   114,   104,    60,    -1,    -1,   108,    -1,
      -1,    -1,    -1,    -1,   114,    70,    60,    -1,    -1,    -1,
      -1,    -1,    77,    -1,    -1,    -1,    70,    -1,    -1,    18,
      19,    -1,    -1,    77,    -1,    -1,    -1,    92,    -1,    94,
      95,    96,    -1,    -1,    -1,   100,   101,    -1,    92,   104,
      94,    95,    96,   108,    -1,    -1,   100,   101,    -1,   114,
     104,    -1,    -1,    -1,   108,    -1,    55,    -1,    -1,    -1,
     114,    60,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
      -1,    70,    -1,    72,    -1,    74,    18,    19,    77,    -1,
      79,    -1,    -1,    -1,    -1,    -1,    85,    86,    87,    -1,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    97,    -1,
      99,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,
      -1,    -1,    -1,    55,   113,   114,    -1,    -1,    60,    -1,
      62,    -1,    64,    -1,    -1,    67,    -1,    -1,    70,    -1,
      72,    18,    74,    -1,    -1,    77,    -1,    79,    -1,    -1,
      -1,    -1,    -1,    85,    86,    87,    -1,    -1,    -1,    -1,
      92,    -1,    94,    95,    96,    97,    -1,    99,   100,   101,
      -1,    -1,   104,    -1,    -1,    -1,   108,    -1,    55,    -1,
      -1,   113,   114,    60,    18,    62,    -1,    64,    -1,    -1,
      67,    -1,    -1,    70,    -1,    72,    -1,    74,    -1,    -1,
      77,    -1,    79,    -1,    -1,    -1,    -1,    -1,    85,    86,
      87,    -1,    -1,    -1,    -1,    92,    -1,    94,    95,    96,
      97,    55,    99,   100,   101,    -1,    60,   104,    62,    -1,
      64,   108,    -1,    67,    -1,   112,    70,   114,    72,    18,
      74,    -1,    -1,    77,    -1,    79,    -1,    -1,    -1,    -1,
      18,    85,    86,    87,    -1,    -1,    -1,    -1,    92,    -1,
      94,    95,    96,    97,    -1,    99,   100,   101,    -1,    -1,
     104,    -1,    -1,    -1,   108,    -1,    55,    -1,    -1,    -1,
     114,    60,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
      -1,    70,    60,    72,    -1,    -1,    -1,    -1,    77,    -1,
      79,    -1,    70,    -1,    -1,    -1,    85,    -1,    87,    77,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,    -1,
      99,   100,   101,    -1,    92,   104,    94,    95,    96,   108,
      -1,    -1,   100,   101,    -1,   114,   104,     3,     4,    -1,
     108,     7,    -1,    -1,    10,    -1,   114,    13,    -1,    -1,
      -1,    17,    18,    19,    -1,    -1,    -1,    -1,    -1,    -1,
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
       0,    83,    93,   134,   135,   136,   137,   138,    55,   100,
     129,   129,     0,    18,    60,    70,    77,    92,    94,    95,
      96,   100,   101,   104,   108,   114,   130,   131,   132,   133,
     138,   140,   301,   302,   129,    10,    11,    10,    11,   129,
      18,    74,    86,    97,   130,   141,   145,   146,   165,   171,
     196,   197,   205,   133,   130,   132,   302,    10,    11,    14,
      55,   136,     3,    86,    55,    55,    55,    68,   141,    14,
      11,   139,   140,     3,     4,     5,    22,    23,    29,    30,
      45,    46,    55,    56,    57,    58,    59,    62,    64,    67,
      72,    76,    79,    85,    87,    90,    91,    99,   102,   103,
     105,   110,   113,   128,   129,   142,   143,   144,   248,   249,
     250,   257,   258,   259,   262,   263,   276,   278,   279,   280,
     281,   282,   283,   284,   285,   286,   287,   288,   289,   290,
     291,   292,   293,   294,   295,   296,   297,   299,   301,   302,
     303,   304,    55,    82,   153,    19,   147,   148,   147,    55,
      11,     3,    55,   129,   142,   257,   258,   266,   267,   268,
     272,   273,   274,   276,   298,     9,   304,   305,   289,   289,
     289,   289,   289,   289,    28,    19,   129,   142,   253,   254,
      10,    13,     3,     7,   193,   194,   195,   301,     3,     7,
      10,   254,   260,    10,    13,   193,   195,     7,    10,    13,
      26,    47,   277,    48,    21,    27,    17,    49,    51,    19,
      20,    32,    33,    84,    52,    53,    54,    22,    23,    14,
      15,    16,    45,    46,   267,   289,   143,     4,     9,     4,
       5,   206,   142,   154,     5,   166,    55,   149,   150,   151,
     301,    75,   198,   199,     3,   172,   147,     4,    55,   130,
     269,   270,   271,   301,    24,     4,    24,    28,    34,    35,
      36,    37,    38,    39,    40,    41,    42,    43,    44,   275,
       4,    17,     6,     6,     9,   304,    26,   142,   255,   256,
     301,     7,   194,   264,   265,   301,   251,   252,   300,   301,
      55,   253,   253,   266,     8,    10,   195,     7,     4,   261,
     266,   266,    90,   102,   250,   254,   102,   105,   253,    10,
     266,    55,   250,   253,   253,   266,   279,   280,   281,   282,
     283,   284,   284,   286,   286,   286,   286,   112,   142,   143,
     214,   247,   287,   287,   287,   288,   288,   289,   289,   289,
      55,     6,   130,   207,     9,   167,   168,   169,   300,    75,
       9,    20,   151,   142,     5,   200,     9,   173,   174,   300,
     153,    75,   152,   112,   143,     4,     9,     4,     9,     5,
     211,   266,   211,   266,   266,   142,   304,    75,   102,     9,
      20,    26,   266,     5,   181,   193,   265,     7,   260,    10,
      25,   253,    55,    55,    55,     4,    68,     8,     4,     9,
       8,    10,    55,    13,    55,    90,    68,     8,    55,    55,
      12,    55,   179,   180,   179,    28,   142,   143,   145,   196,
     203,   208,   209,     6,   130,   142,     9,    11,   170,     9,
      55,   142,   155,   300,   301,   150,     6,   130,   201,   142,
       4,     9,   143,     5,   175,   142,   153,    55,    55,   300,
     301,    55,   271,     1,     3,     6,    11,    55,    61,    63,
      69,    71,    80,    81,    98,   103,   104,   106,   111,   115,
     116,   130,   211,   212,   213,   215,   216,   217,   218,   219,
     229,   230,   231,   236,   249,   259,   273,   290,   291,   293,
     294,   295,   142,   142,   256,    75,   102,     8,   181,   182,
     183,   184,   266,   266,     5,   156,   157,   300,   260,     5,
     221,   266,    55,   253,   260,   253,   260,   267,   276,    28,
     194,     9,   304,   179,    55,   208,   170,    11,   100,   130,
     158,   159,   211,     6,   169,   260,    17,    55,   113,   143,
     145,   148,   186,   196,   202,   203,   204,     6,   130,   174,
      55,   300,     6,   130,   159,   176,   177,   157,   193,   193,
      31,    11,    12,   266,    11,    55,    11,    55,   104,   215,
       3,     3,    11,   266,     3,     3,   266,     3,   211,   244,
       3,   266,   143,   145,   197,   214,     6,   213,    11,   142,
     142,     6,     9,     9,     8,     6,   158,    55,    65,    70,
     222,   223,   224,   225,   226,   227,    55,    55,   266,    28,
     180,    11,     3,     6,   211,   143,   145,   147,   148,   160,
     161,   162,   178,   185,   186,   196,   159,   157,   142,    55,
     187,   187,   113,   142,   143,   301,    11,   192,   211,   202,
      31,    55,     6,   177,    55,   215,    11,    12,    11,    11,
     115,   214,   218,   232,   234,   266,    11,   266,   266,    11,
     129,   214,   245,   246,   248,   257,    66,    78,   238,   239,
     243,   211,   266,    11,    11,     6,   184,     6,   228,   272,
       6,   223,   227,     6,   225,   226,   227,    70,   212,   227,
      12,    24,   260,   181,     4,    55,   179,    55,   107,   191,
     192,     3,   191,   191,   187,   187,   187,   113,    55,     5,
     163,   266,     3,    12,    11,     9,     4,     4,     4,     4,
      11,     3,   211,   239,   243,   237,   238,     4,     9,     6,
      12,   106,   211,   266,   193,    11,     3,   154,   163,     4,
     131,   143,   188,   189,   191,   191,   191,   187,     6,   129,
     164,   212,   248,   253,    11,   266,   266,   233,   266,   218,
     215,   221,   211,     4,   246,   130,   240,   242,   243,   215,
     272,   266,    11,    70,   210,   188,   193,   143,    55,   105,
     190,   300,     4,     9,   191,    10,     6,   212,     6,    10,
     102,   105,     4,     4,    11,    73,   220,   142,   241,     4,
      11,   304,    11,     4,   190,    10,   193,    31,   193,   189,
     253,   254,     6,   253,   260,   260,    11,   215,   234,   235,
     215,    21,    55,   211,   105,    55,   102,   102,    11,    11,
       4,   142,   193,   260,   260,   215,    11,    11
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
     134,   134,   135,   136,   136,   137,   137,   138,   138,   138,
     138,   139,   139,   140,   140,   141,   141,   142,   142,   143,
     143,   143,   143,   144,   144,   144,   144,   144,   144,   144,
     144,   145,   145,   145,   146,   147,   147,   148,   149,   149,
     150,   150,   151,   151,   151,   152,   152,   153,   153,   154,
     154,   155,   155,   156,   156,   157,   157,   158,   158,   159,
     159,   159,   159,   160,   160,   160,   160,   160,   161,   162,
     163,   163,   163,   163,   164,   164,   164,   164,   165,   166,
     166,   167,   167,   168,   168,   169,   169,   169,   170,   170,
     170,   171,   172,   173,   173,   173,   174,   174,   175,   175,
     176,   176,   177,   177,   178,   179,   179,   180,   180,   180,
     180,   181,   181,   182,   182,   183,   183,   184,   184,   185,
     186,   186,   186,   186,   186,   186,   187,   187,   188,   188,
     189,   189,   190,   190,   190,   190,   191,   191,   192,   192,
     193,   193,   194,   194,   195,   195,   196,   196,   197,   198,
     198,   199,   199,   200,   200,   201,   201,   202,   202,   202,
     202,   203,   204,   205,   206,   206,   207,   207,   208,   208,
     208,   208,   209,   210,   210,   211,   211,   212,   212,   213,
     213,   213,   213,   214,   214,   215,   215,   215,   215,   215,
     216,   216,   216,   216,   216,   216,   216,   216,   216,   216,
     216,   216,   216,   216,   216,   216,   216,   216,   216,   216,
     216,   217,   218,   218,   218,   218,   218,   218,   218,   219,
     220,   220,   221,   221,   221,   222,   222,   223,   223,   223,
     224,   224,   224,   225,   225,   226,   226,   227,   227,   228,
     228,   229,   230,   230,   231,   232,   232,   232,   233,   233,
     234,   234,   235,   235,   236,   237,   237,   238,   238,   239,
     240,   241,   241,   242,   242,   243,   244,   244,   245,   245,
     246,   246,   247,   248,   248,   248,   248,   248,   248,   248,
     248,   248,   248,   248,   248,   249,   249,   249,   250,   251,
     251,   252,   252,   253,   253,   254,   255,   255,   256,   256,
     256,   256,   256,   256,   256,   257,   257,   257,   258,   258,
     259,   259,   259,   259,   259,   260,   260,   261,   261,   262,
     262,   262,   262,   262,   263,   263,   264,   264,   265,   265,
     266,   266,   267,   267,   267,   267,   268,   268,   268,   269,
     269,   270,   270,   271,   271,   271,   272,   272,   273,   274,
     274,   274,   275,   275,   275,   275,   275,   275,   275,   275,
     275,   275,   275,   275,   276,   277,   277,   277,   278,   278,
     279,   279,   280,   280,   281,   281,   282,   282,   283,   283,
     283,   284,   284,   284,   284,   284,   284,   285,   285,   286,
     286,   286,   286,   287,   287,   287,   288,   288,   288,   288,
     289,   289,   289,   289,   289,   290,   291,   292,   292,   292,
     292,   292,   293,   293,   293,   293,   294,   295,   296,   296,
     297,   298,   298,   299,   300,   300,   301,   301,   302,   302,
     302,   302,   303,   303,   304,   304,   304,   304,   305,   305,
     305
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
       1,     2,     5,     0,     1,     1,     2,     3,     4,     5,
       6,     0,     1,     2,     3,     1,     1,     1,     2,     1,
       1,     2,     2,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     7,     0,     1,     3,     1,     3,
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


  private static final int YYLAST_ = 4659;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 12;
  private static final int YYNTOKENS_ = 127;

/* Unqualified %code blocks.  */
/* "src/main/resources/Java_16_Grammar.y":150  */

    public CompilationUnit ast;

/* "src/main/java/parser/JavaParser.java":6047  */

}
/* "src/main/resources/Java_16_Grammar.y":1497  */


