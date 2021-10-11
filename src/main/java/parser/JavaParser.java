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
/* "src/main/resources/Java_16_Grammar.y":137  */
 import lexer.*; 
/* "src/main/resources/Java_16_Grammar.y":138  */
 import tree.*; 
/* "src/main/resources/Java_16_Grammar.y":139  */
 import tree.Compilation.*; 
/* "src/main/resources/Java_16_Grammar.y":140  */
 import tree.Declaration.*; 
/* "src/main/resources/Java_16_Grammar.y":141  */
 import tree.Expression.*; 
/* "src/main/resources/Java_16_Grammar.y":142  */
 import tree.Expression.Primary.*; 
/* "src/main/resources/Java_16_Grammar.y":143  */
 import tree.Statement.*; 
/* "src/main/resources/Java_16_Grammar.y":144  */
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
    S_EnumConstant(174),           /* EnumConstant  */
    S_EnumBodyDeclarationsOpt(175), /* EnumBodyDeclarationsOpt  */
    S_RecordDeclaration(176),      /* RecordDeclaration  */
    S_RecordHeader(177),           /* RecordHeader  */
    S_RecordComponentListOpt(178), /* RecordComponentListOpt  */
    S_RecordComponent(179),        /* RecordComponent  */
    S_RecordBody(180),             /* RecordBody  */
    S_RecordBodyDeclarationSeq(181), /* RecordBodyDeclarationSeq  */
    S_RecordBodyDeclaration(182),  /* RecordBodyDeclaration  */
    S_FieldDeclaration(183),       /* FieldDeclaration  */
    S_VariableDeclaratorList(184), /* VariableDeclaratorList  */
    S_VariableDeclarator(185),     /* VariableDeclarator  */
    S_ArrayInitializer(186),       /* ArrayInitializer  */
    S_VariableInitializerListOpt(187), /* VariableInitializerListOpt  */
    S_VariableInitializerList(188), /* VariableInitializerList  */
    S_VariableInitializer(189),    /* VariableInitializer  */
    S_MethodDeclaration(190),      /* MethodDeclaration  */
    S_MethodHeader(191),           /* MethodHeader  */
    S_MethodDeclarator(192),       /* MethodDeclarator  */
    S_FormalParameterList(193),    /* FormalParameterList  */
    S_FormalParameter(194),        /* FormalParameter  */
    S_FormalParameterTail(195),    /* FormalParameterTail  */
    S_ThrowsOpt(196),              /* ThrowsOpt  */
    S_MethodBody(197),             /* MethodBody  */
    S_DimsOpt(198),                /* DimsOpt  */
    S_Dims(199),                   /* Dims  */
    S_Dim(200),                    /* Dim  */
    S_InterfaceDeclaration(201),   /* InterfaceDeclaration  */
    S_NormalInterfaceDeclaration(202), /* NormalInterfaceDeclaration  */
    S_InterfaceExtendsOpt(203),    /* InterfaceExtendsOpt  */
    S_InterfaceExtends(204),       /* InterfaceExtends  */
    S_InterfaceBody(205),          /* InterfaceBody  */
    S_InterfaceMemberDeclarationSeq(206), /* InterfaceMemberDeclarationSeq  */
    S_InterfaceMemberDeclaration(207), /* InterfaceMemberDeclaration  */
    S_ConstantDeclaration(208),    /* ConstantDeclaration  */
    S_InterfaceMethodDeclaration(209), /* InterfaceMethodDeclaration  */
    S_AnnotationInterfaceDeclaration(210), /* AnnotationInterfaceDeclaration  */
    S_AnnotationInterfaceBody(211), /* AnnotationInterfaceBody  */
    S_AnnotationInterfaceMemberDeclarationSeq(212), /* AnnotationInterfaceMemberDeclarationSeq  */
    S_AnnotationInterfaceMemberDeclaration(213), /* AnnotationInterfaceMemberDeclaration  */
    S_AnnotationInterfaceElementDeclaration(214), /* AnnotationInterfaceElementDeclaration  */
    S_DefaultValueOpt(215),        /* DefaultValueOpt  */
    S_Block(216),                  /* Block  */
    S_BlockStatementSeq(217),      /* BlockStatementSeq  */
    S_BlockStatement(218),         /* BlockStatement  */
    S_BlockDeclaration(219),       /* BlockDeclaration  */
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
      SymbolKind.S_BlockDeclaration,
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
  "EnumConstantListOpt", "EnumConstant", "EnumBodyDeclarationsOpt",
  "RecordDeclaration", "RecordHeader", "RecordComponentListOpt",
  "RecordComponent", "RecordBody", "RecordBodyDeclarationSeq",
  "RecordBodyDeclaration", "FieldDeclaration", "VariableDeclaratorList",
  "VariableDeclarator", "ArrayInitializer", "VariableInitializerListOpt",
  "VariableInitializerList", "VariableInitializer", "MethodDeclaration",
  "MethodHeader", "MethodDeclarator", "FormalParameterList",
  "FormalParameter", "FormalParameterTail", "ThrowsOpt", "MethodBody",
  "DimsOpt", "Dims", "Dim", "InterfaceDeclaration",
  "NormalInterfaceDeclaration", "InterfaceExtendsOpt", "InterfaceExtends",
  "InterfaceBody", "InterfaceMemberDeclarationSeq",
  "InterfaceMemberDeclaration", "ConstantDeclaration",
  "InterfaceMethodDeclaration", "AnnotationInterfaceDeclaration",
  "AnnotationInterfaceBody", "AnnotationInterfaceMemberDeclarationSeq",
  "AnnotationInterfaceMemberDeclaration",
  "AnnotationInterfaceElementDeclaration", "DefaultValueOpt", "Block",
  "BlockStatementSeq", "BlockStatement", "BlockDeclaration",
  "LocalVariableDeclaration", "Statement", "SimpleStatement",
  "LabeledStatement", "StatementExpression", "IfThenElseStatement",
  "ElsePartOpt", "SwitchBlock", "SwitchRuleSeq", "SwitchRule",
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
    /* "src/main/resources/Java_16_Grammar.y":258  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 3: /* Literal: FLOATING_POINT_LITERAL  */
  if (yyn == 3)
    /* "src/main/resources/Java_16_Grammar.y":259  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 4: /* Literal: TRUE  */
  if (yyn == 4)
    /* "src/main/resources/Java_16_Grammar.y":260  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 5: /* Literal: FALSE  */
  if (yyn == 5)
    /* "src/main/resources/Java_16_Grammar.y":261  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 6: /* Literal: CHARACTER_LITERAL  */
  if (yyn == 6)
    /* "src/main/resources/Java_16_Grammar.y":262  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 7: /* Literal: STRING_LITERAL  */
  if (yyn == 7)
    /* "src/main/resources/Java_16_Grammar.y":263  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 8: /* Literal: NULL  */
  if (yyn == 8)
    /* "src/main/resources/Java_16_Grammar.y":265  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 9: /* CompoundName: IDENTIFIER  */
  if (yyn == 9)
    /* "src/main/resources/Java_16_Grammar.y":271  */
                                  { yyval = new CompoundName(((Token)(yystack.valueAt (0))).image); };
  break;


  case 10: /* CompoundName: CompoundName DOT IDENTIFIER  */
  if (yyn == 10)
    /* "src/main/resources/Java_16_Grammar.y":272  */
                                  { yyval = ((CompoundName)(yystack.valueAt (2))).add(((Token)(yystack.valueAt (0))).image); };
  break;


  case 11: /* ModifierSeqOpt: %empty  */
  if (yyn == 11)
    /* "src/main/resources/Java_16_Grammar.y":276  */
                   { yyval = null; };
  break;


  case 12: /* ModifierSeqOpt: ModifierSeq  */
  if (yyn == 12)
    /* "src/main/resources/Java_16_Grammar.y":277  */
                   { yyval = ((Modifiers)(yystack.valueAt (0))); };
  break;


  case 13: /* ModifierSeq: StandardModifierSeq  */
  if (yyn == 13)
    /* "src/main/resources/Java_16_Grammar.y":281  */
                                        { yyval = new Modifiers(null,((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 14: /* ModifierSeq: AnnotationSeq StandardModifierSeq  */
  if (yyn == 14)
    /* "src/main/resources/Java_16_Grammar.y":282  */
                                        { yyval = new Modifiers(((Annotations)(yystack.valueAt (1))),((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 15: /* StandardModifierSeq: StandardModifier  */
  if (yyn == 15)
    /* "src/main/resources/Java_16_Grammar.y":286  */
                                           { yyval = new StandardModifiers(((Token)(yystack.valueAt (0)))); };
  break;


  case 16: /* StandardModifierSeq: StandardModifierSeq StandardModifier  */
  if (yyn == 16)
    /* "src/main/resources/Java_16_Grammar.y":287  */
                                           { yyval = ((StandardModifiers)(yystack.valueAt (1))).add(((Token)(yystack.valueAt (0)))); };
  break;


  case 17: /* StandardModifier: DEFAULT  */
  if (yyn == 17)
    /* "src/main/resources/Java_16_Grammar.y":292  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 18: /* StandardModifier: FINAL  */
  if (yyn == 18)
    /* "src/main/resources/Java_16_Grammar.y":293  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 19: /* StandardModifier: PUBLIC  */
  if (yyn == 19)
    /* "src/main/resources/Java_16_Grammar.y":294  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 20: /* StandardModifier: PROTECTED  */
  if (yyn == 20)
    /* "src/main/resources/Java_16_Grammar.y":295  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 21: /* StandardModifier: PRIVATE  */
  if (yyn == 21)
    /* "src/main/resources/Java_16_Grammar.y":296  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 22: /* StandardModifier: ABSTRACT  */
  if (yyn == 22)
    /* "src/main/resources/Java_16_Grammar.y":297  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 23: /* StandardModifier: STATIC  */
  if (yyn == 23)
    /* "src/main/resources/Java_16_Grammar.y":298  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 24: /* StandardModifier: STRICTFP  */
  if (yyn == 24)
    /* "src/main/resources/Java_16_Grammar.y":299  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 25: /* StandardModifier: SYNCHRONIZED  */
  if (yyn == 25)
    /* "src/main/resources/Java_16_Grammar.y":300  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 26: /* StandardModifier: TRANSIENT  */
  if (yyn == 26)
    /* "src/main/resources/Java_16_Grammar.y":301  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 27: /* StandardModifier: VOLATILE  */
  if (yyn == 27)
    /* "src/main/resources/Java_16_Grammar.y":302  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 28: /* StandardModifier: OPEN  */
  if (yyn == 28)
    /* "src/main/resources/Java_16_Grammar.y":303  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 29: /* CompilationUnit: %empty  */
  if (yyn == 29)
    /* "src/main/resources/Java_16_Grammar.y":309  */
                                                    { yyval = null; };
  break;


  case 30: /* CompilationUnit: Package  */
  if (yyn == 30)
    /* "src/main/resources/Java_16_Grammar.y":310  */
                                                    { yyval = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); ast = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); };
  break;


  case 31: /* CompilationUnit: Module  */
  if (yyn == 31)
    /* "src/main/resources/Java_16_Grammar.y":311  */
                                                    { yyval = ((tree.Compilation.Module)(yystack.valueAt (0))); ast = ((tree.Compilation.Module)(yystack.valueAt (0))); };
  break;


  case 32: /* CompilationUnit: ImportDeclarationSeqOpt TopLevelComponentSeq  */
  if (yyn == 32)
    /* "src/main/resources/Java_16_Grammar.y":312  */
                                                    { ast = new SimpleCompilationUnit(((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 33: /* Package: PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt  */
  if (yyn == 33)
    /* "src/main/resources/Java_16_Grammar.y":317  */
                                                    { yyval = new tree.Compilation.Package(((CompoundName)(yystack.valueAt (3))),((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 34: /* Module: ModifierSeqOpt MODULE CompoundName LBRACE ModuleDirectiveSeqOpt RBRACE  */
  if (yyn == 34)
    /* "src/main/resources/Java_16_Grammar.y":323  */
                                                                             { yyval = null; };
  break;


  case 35: /* ImportDeclarationSeqOpt: %empty  */
  if (yyn == 35)
    /* "src/main/resources/Java_16_Grammar.y":327  */
                                                 { yyval = null; };
  break;


  case 36: /* ImportDeclarationSeqOpt: ImportDeclarationSeq  */
  if (yyn == 36)
    /* "src/main/resources/Java_16_Grammar.y":328  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (0))); };
  break;


  case 37: /* ImportDeclarationSeq: ImportDeclaration  */
  if (yyn == 37)
    /* "src/main/resources/Java_16_Grammar.y":332  */
                                                 { yyval = new ImportDeclarations(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 38: /* ImportDeclarationSeq: ImportDeclarationSeqOpt ImportDeclaration  */
  if (yyn == 38)
    /* "src/main/resources/Java_16_Grammar.y":333  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))).add(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 39: /* ImportDeclaration: IMPORT CompoundName SEMICOLON  */
  if (yyn == 39)
    /* "src/main/resources/Java_16_Grammar.y":337  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 40: /* ImportDeclaration: IMPORT STATIC CompoundName SEMICOLON  */
  if (yyn == 40)
    /* "src/main/resources/Java_16_Grammar.y":338  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 41: /* ImportDeclaration: IMPORT CompoundName DOT STAR SEMICOLON  */
  if (yyn == 41)
    /* "src/main/resources/Java_16_Grammar.y":339  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 42: /* ImportDeclaration: IMPORT STATIC CompoundName DOT STAR SEMICOLON  */
  if (yyn == 42)
    /* "src/main/resources/Java_16_Grammar.y":340  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 43: /* TopLevelComponentSeqOpt: %empty  */
  if (yyn == 43)
    /* "src/main/resources/Java_16_Grammar.y":344  */
                            { yyval = null; };
  break;


  case 44: /* TopLevelComponentSeqOpt: TopLevelComponentSeq  */
  if (yyn == 44)
    /* "src/main/resources/Java_16_Grammar.y":345  */
                            { yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (0))); };
  break;


  case 45: /* TopLevelComponentSeq: ModifierSeqOpt TopLevelComponent  */
  if (yyn == 45)
    /* "src/main/resources/Java_16_Grammar.y":349  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = new TopLevelComponents(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 46: /* TopLevelComponentSeq: TopLevelComponentSeq ModifierSeqOpt TopLevelComponent  */
  if (yyn == 46)
    /* "src/main/resources/Java_16_Grammar.y":350  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (2))).add(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 47: /* TopLevelComponent: ClassDeclaration  */
  if (yyn == 47)
    /* "src/main/resources/Java_16_Grammar.y":354  */
                           { yyval = new TopLevelComponent(((ClassDeclaration)(yystack.valueAt (0)))); };
  break;


  case 48: /* TopLevelComponent: InterfaceDeclaration  */
  if (yyn == 48)
    /* "src/main/resources/Java_16_Grammar.y":355  */
                           { yyval = new TopLevelComponent(((InterfaceDeclaration)(yystack.valueAt (0)))); };
  break;


  case 67: /* Type: UnannotatedType  */
  if (yyn == 67)
    /* "src/main/resources/Java_16_Grammar.y":402  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))); };
  break;


  case 68: /* Type: AnnotationSeq UnannotatedType  */
  if (yyn == 68)
    /* "src/main/resources/Java_16_Grammar.y":403  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))).addAnnotations(((Annotations)(yystack.valueAt (1)))); };
  break;


  case 69: /* UnannotatedType: PrimitiveType  */
  if (yyn == 69)
    /* "src/main/resources/Java_16_Grammar.y":407  */
                                 { yyval = new PrimitiveType(((Token)(yystack.valueAt (0)))); };
  break;


  case 70: /* UnannotatedType: CompoundName  */
  if (yyn == 70)
    /* "src/main/resources/Java_16_Grammar.y":409  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (0))),null); };
  break;


  case 71: /* UnannotatedType: CompoundName TypeArguments  */
  if (yyn == 71)
    /* "src/main/resources/Java_16_Grammar.y":410  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (1))),((tree.Type.TypeArguments)(yystack.valueAt (0)))); };
  break;


  case 72: /* UnannotatedType: UnannotatedType Dim  */
  if (yyn == 72)
    /* "src/main/resources/Java_16_Grammar.y":412  */
                                     { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (1))).addDimension(((Dim)(yystack.valueAt (0)))); };
  break;


  case 73: /* PrimitiveType: BYTE  */
  if (yyn == 73)
    /* "src/main/resources/Java_16_Grammar.y":421  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 74: /* PrimitiveType: SHORT  */
  if (yyn == 74)
    /* "src/main/resources/Java_16_Grammar.y":422  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 75: /* PrimitiveType: INT  */
  if (yyn == 75)
    /* "src/main/resources/Java_16_Grammar.y":423  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 76: /* PrimitiveType: LONG  */
  if (yyn == 76)
    /* "src/main/resources/Java_16_Grammar.y":424  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 77: /* PrimitiveType: CHAR  */
  if (yyn == 77)
    /* "src/main/resources/Java_16_Grammar.y":425  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 78: /* PrimitiveType: FLOAT  */
  if (yyn == 78)
    /* "src/main/resources/Java_16_Grammar.y":427  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 79: /* PrimitiveType: DOUBLE  */
  if (yyn == 79)
    /* "src/main/resources/Java_16_Grammar.y":428  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 80: /* PrimitiveType: BOOLEAN  */
  if (yyn == 80)
    /* "src/main/resources/Java_16_Grammar.y":429  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 81: /* ClassDeclaration: NormalClassDeclaration  */
  if (yyn == 81)
    /* "src/main/resources/Java_16_Grammar.y":450  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 82: /* ClassDeclaration: EnumDeclaration  */
  if (yyn == 82)
    /* "src/main/resources/Java_16_Grammar.y":451  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 83: /* ClassDeclaration: RecordDeclaration  */
  if (yyn == 83)
    /* "src/main/resources/Java_16_Grammar.y":452  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 84: /* NormalClassDeclaration: CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody  */
  if (yyn == 84)
    /* "src/main/resources/Java_16_Grammar.y":457  */
                              { yyval = new NormalClassDeclaration(((Token)(yystack.valueAt (4))),((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 85: /* TypeParametersOpt: %empty  */
  if (yyn == 85)
    /* "src/main/resources/Java_16_Grammar.y":461  */
                       { yyval = null; };
  break;


  case 86: /* TypeParametersOpt: TypeParameters  */
  if (yyn == 86)
    /* "src/main/resources/Java_16_Grammar.y":462  */
                       { yyval = ((TypeParameters)(yystack.valueAt (0))); };
  break;


  case 87: /* TypeParameters: LESS TypeParameterList GREATER  */
  if (yyn == 87)
    /* "src/main/resources/Java_16_Grammar.y":466  */
                                      { yyval = ((TypeParameters)(yystack.valueAt (1))); };
  break;


  case 88: /* TypeParameterList: TypeParameter  */
  if (yyn == 88)
    /* "src/main/resources/Java_16_Grammar.y":470  */
                                            { yyval = new TypeParameters(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 89: /* TypeParameterList: TypeParameterList COMMA TypeParameter  */
  if (yyn == 89)
    /* "src/main/resources/Java_16_Grammar.y":471  */
                                            { yyval = ((TypeParameters)(yystack.valueAt (2))).add(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 90: /* TypeParameter: AnnotationSeq TypeParameterTail  */
  if (yyn == 90)
    /* "src/main/resources/Java_16_Grammar.y":481  */
                                      { yyval = new TypeParameter(((Annotations)(yystack.valueAt (1))),((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 91: /* TypeParameter: TypeParameterTail  */
  if (yyn == 91)
    /* "src/main/resources/Java_16_Grammar.y":482  */
                                      { yyval = new TypeParameter(null,((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 92: /* TypeParameterTail: IDENTIFIER  */
  if (yyn == 92)
    /* "src/main/resources/Java_16_Grammar.y":486  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (0))),null); };
  break;


  case 93: /* TypeParameterTail: IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 93)
    /* "src/main/resources/Java_16_Grammar.y":487  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (3))),((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0)))); };
  break;


  case 94: /* TypeParameterTail: IDENTIFIER EXTENDS ClassTypeList2  */
  if (yyn == 94)
    /* "src/main/resources/Java_16_Grammar.y":488  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 95: /* ClassExtendsOpt: %empty  */
  if (yyn == 95)
    /* "src/main/resources/Java_16_Grammar.y":492  */
                    { yyval = null; };
  break;


  case 96: /* ClassExtendsOpt: EXTENDS Type  */
  if (yyn == 96)
    /* "src/main/resources/Java_16_Grammar.y":493  */
                    { yyval = ((tree.Type.Type)(yystack.valueAt (0))); };
  break;


  case 97: /* ClassImplementsOpt: %empty  */
  if (yyn == 97)
    /* "src/main/resources/Java_16_Grammar.y":497  */
                                 { yyval = null; };
  break;


  case 98: /* ClassImplementsOpt: IMPLEMENTS ClassTypeList1  */
  if (yyn == 98)
    /* "src/main/resources/Java_16_Grammar.y":498  */
                                 { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 99: /* ClassTypeList1: Type  */
  if (yyn == 99)
    /* "src/main/resources/Java_16_Grammar.y":502  */
                                { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 100: /* ClassTypeList1: ClassTypeList1 COMMA Type  */
  if (yyn == 100)
    /* "src/main/resources/Java_16_Grammar.y":503  */
                                { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 101: /* ClassTypeList2: Type  */
  if (yyn == 101)
    /* "src/main/resources/Java_16_Grammar.y":507  */
                                    { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 102: /* ClassTypeList2: ClassTypeList2 AMPERSAND Type  */
  if (yyn == 102)
    /* "src/main/resources/Java_16_Grammar.y":508  */
                                    { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 103: /* ClassBodyOpt: %empty  */
  if (yyn == 103)
    /* "src/main/resources/Java_16_Grammar.y":512  */
                    { yyval = null; };
  break;


  case 104: /* ClassBodyOpt: ClassBody  */
  if (yyn == 104)
    /* "src/main/resources/Java_16_Grammar.y":513  */
                    { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 105: /* ClassBody: LBRACE RBRACE  */
  if (yyn == 105)
    /* "src/main/resources/Java_16_Grammar.y":517  */
                                             { yyval = null; };
  break;


  case 106: /* ClassBody: LBRACE ClassBodyDeclarationSeq RBRACE  */
  if (yyn == 106)
    /* "src/main/resources/Java_16_Grammar.y":518  */
                                                 { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 107: /* ClassBodyDeclarationSeq: ClassBodyDeclaration  */
  if (yyn == 107)
    /* "src/main/resources/Java_16_Grammar.y":522  */
                                                   { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 108: /* ClassBodyDeclarationSeq: ClassBodyDeclarationSeq ClassBodyDeclaration  */
  if (yyn == 108)
    /* "src/main/resources/Java_16_Grammar.y":523  */
                                                   { yyval = ((Declarations)(yystack.valueAt (1))).add(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 109: /* ClassBodyDeclaration: ModifierSeqOpt PureBodyDeclaration  */
  if (yyn == 109)
    /* "src/main/resources/Java_16_Grammar.y":527  */
                                         { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); };
  break;


  case 110: /* ClassBodyDeclaration: Block  */
  if (yyn == 110)
    /* "src/main/resources/Java_16_Grammar.y":528  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),false); };
  break;


  case 111: /* ClassBodyDeclaration: STATIC Block  */
  if (yyn == 111)
    /* "src/main/resources/Java_16_Grammar.y":529  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),true); };
  break;


  case 112: /* ClassBodyDeclaration: SEMICOLON  */
  if (yyn == 112)
    /* "src/main/resources/Java_16_Grammar.y":530  */
                      { yyval = null; };
  break;


  case 113: /* PureBodyDeclaration: FieldDeclaration  */
  if (yyn == 113)
    /* "src/main/resources/Java_16_Grammar.y":534  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 114: /* PureBodyDeclaration: MethodDeclaration  */
  if (yyn == 114)
    /* "src/main/resources/Java_16_Grammar.y":535  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 115: /* PureBodyDeclaration: ClassDeclaration  */
  if (yyn == 115)
    /* "src/main/resources/Java_16_Grammar.y":536  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 116: /* PureBodyDeclaration: InterfaceDeclaration  */
  if (yyn == 116)
    /* "src/main/resources/Java_16_Grammar.y":537  */
                               { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 117: /* PureBodyDeclaration: ConstructorDeclaration  */
  if (yyn == 117)
    /* "src/main/resources/Java_16_Grammar.y":538  */
                               { yyval = ((ConstructorDeclaration)(yystack.valueAt (0))); };
  break;


  case 118: /* ConstructorDeclaration: ConstructorDeclarator ThrowsOpt ConstructorBody  */
  if (yyn == 118)
    /* "src/main/resources/Java_16_Grammar.y":545  */
                            { yyval = new ConstructorDeclaration(null,((ConstructorDeclarator)(yystack.valueAt (2))).typeParameters,((ConstructorDeclarator)(yystack.valueAt (2))).formalParameters,
                                                              ((tree.Type.TypeList)(yystack.valueAt (1))),((ConstructorBody)(yystack.valueAt (0))).invocation,((ConstructorBody)(yystack.valueAt (0))).block); };
  break;


  case 119: /* ConstructorDeclarator: TypeParametersOpt IDENTIFIER LPAREN FormalParameterList RPAREN  */
  if (yyn == 119)
    /* "src/main/resources/Java_16_Grammar.y":551  */
                                      { yyval = new ConstructorDeclarator(((TypeParameters)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (1)))); };
  break;


  case 120: /* ConstructorBody: LBRACE RBRACE  */
  if (yyn == 120)
    /* "src/main/resources/Java_16_Grammar.y":555  */
                                                                    { yyval = new ConstructorBody(null,null); };
  break;


  case 121: /* ConstructorBody: LBRACE ExplicitConstructorInvocation RBRACE  */
  if (yyn == 121)
    /* "src/main/resources/Java_16_Grammar.y":556  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (1))),null); };
  break;


  case 122: /* ConstructorBody: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 122)
    /* "src/main/resources/Java_16_Grammar.y":557  */
                                                                    { yyval = new ConstructorBody(null,new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 123: /* ConstructorBody: LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE  */
  if (yyn == 123)
    /* "src/main/resources/Java_16_Grammar.y":558  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (2))),new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 124: /* ExplicitConstructorInvocation: TypeArgumentsOpt THIS Arguments SEMICOLON  */
  if (yyn == 124)
    /* "src/main/resources/Java_16_Grammar.y":562  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),false,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 125: /* ExplicitConstructorInvocation: TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 125)
    /* "src/main/resources/Java_16_Grammar.y":563  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 126: /* ExplicitConstructorInvocation: CompoundName DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 126)
    /* "src/main/resources/Java_16_Grammar.y":564  */
                                                                  { Expression expr = new SimpleReference(((CompoundName)(yystack.valueAt (5))));
                                                                    yyval = new ExplicitConstructorInvocation(expr,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 127: /* ExplicitConstructorInvocation: Primary DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 127)
    /* "src/main/resources/Java_16_Grammar.y":566  */
                                                                  { yyval = new ExplicitConstructorInvocation(((tree.Expression.Expression)(yystack.valueAt (5))),((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 128: /* EnumDeclaration: ENUM IDENTIFIER ClassImplementsOpt EnumBody  */
  if (yyn == 128)
    /* "src/main/resources/Java_16_Grammar.y":572  */
                                                                     { yyval = null; };
  break;


  case 139: /* RecordDeclaration: RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody  */
  if (yyn == 139)
    /* "src/main/resources/Java_16_Grammar.y":600  */
                                                                                                        { yyval = null; };
  break;


  case 152: /* FieldDeclaration: UnannotatedType VariableDeclaratorList SEMICOLON  */
  if (yyn == 152)
    /* "src/main/resources/Java_16_Grammar.y":636  */
                                                                          { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 153: /* VariableDeclaratorList: VariableDeclarator  */
  if (yyn == 153)
    /* "src/main/resources/Java_16_Grammar.y":640  */
                                                      { yyval = new VariableDeclarators(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 154: /* VariableDeclaratorList: VariableDeclaratorList COMMA VariableDeclarator  */
  if (yyn == 154)
    /* "src/main/resources/Java_16_Grammar.y":641  */
                                                      { yyval = ((VariableDeclarators)(yystack.valueAt (2))).add(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 155: /* VariableDeclarator: IDENTIFIER  */
  if (yyn == 155)
    /* "src/main/resources/Java_16_Grammar.y":645  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 156: /* VariableDeclarator: IDENTIFIER EQUAL Expression  */
  if (yyn == 156)
    /* "src/main/resources/Java_16_Grammar.y":646  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (2))),null,new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0))))); };
  break;


  case 157: /* VariableDeclarator: IDENTIFIER Dims  */
  if (yyn == 157)
    /* "src/main/resources/Java_16_Grammar.y":647  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),null); };
  break;


  case 158: /* VariableDeclarator: IDENTIFIER Dims EQUAL ArrayInitializer  */
  if (yyn == 158)
    /* "src/main/resources/Java_16_Grammar.y":648  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2))),((InitializerArray)(yystack.valueAt (0)))); };
  break;


  case 159: /* ArrayInitializer: LBRACE VariableInitializerListOpt RBRACE  */
  if (yyn == 159)
    /* "src/main/resources/Java_16_Grammar.y":652  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (1))); };
  break;


  case 160: /* ArrayInitializer: LBRACE VariableInitializerListOpt COMMA RBRACE  */
  if (yyn == 160)
    /* "src/main/resources/Java_16_Grammar.y":653  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (2))); };
  break;


  case 161: /* VariableInitializerListOpt: %empty  */
  if (yyn == 161)
    /* "src/main/resources/Java_16_Grammar.y":657  */
                                { yyval = null; };
  break;


  case 162: /* VariableInitializerListOpt: VariableInitializerList  */
  if (yyn == 162)
    /* "src/main/resources/Java_16_Grammar.y":658  */
                                { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 163: /* VariableInitializerList: VariableInitializer  */
  if (yyn == 163)
    /* "src/main/resources/Java_16_Grammar.y":662  */
                                                        { yyval = new InitializerArray(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 164: /* VariableInitializerList: VariableInitializerList COMMA VariableInitializer  */
  if (yyn == 164)
    /* "src/main/resources/Java_16_Grammar.y":663  */
                                                        { yyval = ((InitializerArray)(yystack.valueAt (2))).add(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 165: /* VariableInitializer: Expression  */
  if (yyn == 165)
    /* "src/main/resources/Java_16_Grammar.y":667  */
                        { yyval = new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 166: /* VariableInitializer: ArrayInitializer  */
  if (yyn == 166)
    /* "src/main/resources/Java_16_Grammar.y":668  */
                        { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 167: /* MethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 167)
    /* "src/main/resources/Java_16_Grammar.y":674  */
                              { yyval = new MethodDeclaration(((MethodHeader)(yystack.valueAt (1))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 168: /* MethodHeader: TypeParameters Type MethodDeclarator ThrowsOpt  */
  if (yyn == 168)
    /* "src/main/resources/Java_16_Grammar.y":684  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 169: /* MethodHeader: TypeParameters AnnotationSeq VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 169)
    /* "src/main/resources/Java_16_Grammar.y":685  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (4))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 170: /* MethodHeader: TypeParameters UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 170)
    /* "src/main/resources/Java_16_Grammar.y":686  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 171: /* MethodHeader: TypeParameters VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 171)
    /* "src/main/resources/Java_16_Grammar.y":687  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 172: /* MethodHeader: UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 172)
    /* "src/main/resources/Java_16_Grammar.y":688  */
                                                                              { yyval = new MethodHeader(null,((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 173: /* MethodHeader: VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 173)
    /* "src/main/resources/Java_16_Grammar.y":689  */
                                                                              { yyval = new MethodHeader(null,null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 174: /* MethodDeclarator: IDENTIFIER LPAREN RPAREN DimsOpt  */
  if (yyn == 174)
    /* "src/main/resources/Java_16_Grammar.y":698  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (3))),null,((Dims)(yystack.valueAt (0)))); };
  break;


  case 175: /* MethodDeclarator: IDENTIFIER LPAREN FormalParameterList RPAREN DimsOpt  */
  if (yyn == 175)
    /* "src/main/resources/Java_16_Grammar.y":699  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (2))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 176: /* FormalParameterList: FormalParameter  */
  if (yyn == 176)
    /* "src/main/resources/Java_16_Grammar.y":713  */
                                                { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 177: /* FormalParameterList: FormalParameterList COMMA FormalParameter  */
  if (yyn == 177)
    /* "src/main/resources/Java_16_Grammar.y":714  */
                                                { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0))));};
  break;


  case 178: /* FormalParameter: ModifierSeq UnannotatedType FormalParameterTail  */
  if (yyn == 178)
    /* "src/main/resources/Java_16_Grammar.y":718  */
                                                      { yyval = ParameterDeclaration.create(((Modifiers)(yystack.valueAt (2))),((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 179: /* FormalParameter: UnannotatedType FormalParameterTail  */
  if (yyn == 179)
    /* "src/main/resources/Java_16_Grammar.y":719  */
                                                      { yyval = ParameterDeclaration.create(null,((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 180: /* FormalParameterTail: IDENTIFIER DimsOpt  */
  if (yyn == 180)
    /* "src/main/resources/Java_16_Grammar.y":723  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),false,false); };
  break;


  case 181: /* FormalParameterTail: AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 181)
    /* "src/main/resources/Java_16_Grammar.y":724  */
                                                   { yyval = new ParameterTail(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (0))),null,true,false); };
  break;


  case 182: /* FormalParameterTail: THIS  */
  if (yyn == 182)
    /* "src/main/resources/Java_16_Grammar.y":725  */
                                                   { yyval = new ParameterTail(null,null,null,false,true); };
  break;


  case 183: /* FormalParameterTail: IDENTIFIER DOT THIS  */
  if (yyn == 183)
    /* "src/main/resources/Java_16_Grammar.y":726  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (2))),null,false,true); };
  break;


  case 184: /* ThrowsOpt: %empty  */
  if (yyn == 184)
    /* "src/main/resources/Java_16_Grammar.y":738  */
                             { yyval = null; };
  break;


  case 185: /* ThrowsOpt: THROWS ClassTypeList1  */
  if (yyn == 185)
    /* "src/main/resources/Java_16_Grammar.y":739  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 186: /* MethodBody: Block  */
  if (yyn == 186)
    /* "src/main/resources/Java_16_Grammar.y":743  */
                   { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 187: /* MethodBody: SEMICOLON  */
  if (yyn == 187)
    /* "src/main/resources/Java_16_Grammar.y":744  */
                   { yyval = null; };
  break;


  case 188: /* DimsOpt: %empty  */
  if (yyn == 188)
    /* "src/main/resources/Java_16_Grammar.y":750  */
                 { yyval = null; };
  break;


  case 189: /* DimsOpt: Dims  */
  if (yyn == 189)
    /* "src/main/resources/Java_16_Grammar.y":751  */
                 { yyval = ((Dims)(yystack.valueAt (0))); };
  break;


  case 190: /* Dims: Dim  */
  if (yyn == 190)
    /* "src/main/resources/Java_16_Grammar.y":755  */
                { yyval = new Dims(((Dim)(yystack.valueAt (0)))); };
  break;


  case 191: /* Dims: Dims Dim  */
  if (yyn == 191)
    /* "src/main/resources/Java_16_Grammar.y":756  */
                { yyval = ((Dims)(yystack.valueAt (1))).add(((Dim)(yystack.valueAt (0)))); };
  break;


  case 192: /* Dim: AnnotationSeq LBRACKET RBRACKET  */
  if (yyn == 192)
    /* "src/main/resources/Java_16_Grammar.y":760  */
                                      { yyval = new Dim(((Annotations)(yystack.valueAt (2)))); };
  break;


  case 193: /* Dim: LBRACKET RBRACKET  */
  if (yyn == 193)
    /* "src/main/resources/Java_16_Grammar.y":761  */
                                      { yyval = new Dim(null); };
  break;


  case 194: /* InterfaceDeclaration: NormalInterfaceDeclaration  */
  if (yyn == 194)
    /* "src/main/resources/Java_16_Grammar.y":767  */
                                      { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 195: /* InterfaceDeclaration: AnnotationInterfaceDeclaration  */
  if (yyn == 195)
    /* "src/main/resources/Java_16_Grammar.y":768  */
                                      { yyval = null; };
  break;


  case 196: /* NormalInterfaceDeclaration: INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody  */
  if (yyn == 196)
    /* "src/main/resources/Java_16_Grammar.y":773  */
                                         { yyval = new NormalInterfaceDeclaration(((Token)(yystack.valueAt (3))),((TypeParameters)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 197: /* InterfaceExtendsOpt: %empty  */
  if (yyn == 197)
    /* "src/main/resources/Java_16_Grammar.y":777  */
                        { yyval = null; };
  break;


  case 198: /* InterfaceExtendsOpt: InterfaceExtends  */
  if (yyn == 198)
    /* "src/main/resources/Java_16_Grammar.y":778  */
                        { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 199: /* InterfaceExtends: EXTENDS Type  */
  if (yyn == 199)
    /* "src/main/resources/Java_16_Grammar.y":782  */
                                   { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 200: /* InterfaceExtends: InterfaceExtends COMMA Type  */
  if (yyn == 200)
    /* "src/main/resources/Java_16_Grammar.y":783  */
                                   { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 201: /* InterfaceBody: LBRACE RBRACE  */
  if (yyn == 201)
    /* "src/main/resources/Java_16_Grammar.y":787  */
                                                  { yyval = null; };
  break;


  case 202: /* InterfaceBody: LBRACE InterfaceMemberDeclarationSeq RBRACE  */
  if (yyn == 202)
    /* "src/main/resources/Java_16_Grammar.y":788  */
                                                  { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 203: /* InterfaceMemberDeclarationSeq: ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 203)
    /* "src/main/resources/Java_16_Grammar.y":792  */
                                                                              { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 204: /* InterfaceMemberDeclarationSeq: InterfaceMemberDeclarationSeq ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 204)
    /* "src/main/resources/Java_16_Grammar.y":793  */
                                                                              { yyval = ((Declarations)(yystack.valueAt (2))).add(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 205: /* InterfaceMemberDeclaration: ConstantDeclaration  */
  if (yyn == 205)
    /* "src/main/resources/Java_16_Grammar.y":797  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 206: /* InterfaceMemberDeclaration: InterfaceMethodDeclaration  */
  if (yyn == 206)
    /* "src/main/resources/Java_16_Grammar.y":798  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 207: /* InterfaceMemberDeclaration: ClassDeclaration  */
  if (yyn == 207)
    /* "src/main/resources/Java_16_Grammar.y":799  */
                                  { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 208: /* InterfaceMemberDeclaration: InterfaceDeclaration  */
  if (yyn == 208)
    /* "src/main/resources/Java_16_Grammar.y":800  */
                                  { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 209: /* ConstantDeclaration: Type VariableDeclaratorList SEMICOLON  */
  if (yyn == 209)
    /* "src/main/resources/Java_16_Grammar.y":804  */
                                            { yyval = new TypeAndDeclarators(((tree.Type.Type)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 210: /* InterfaceMethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 210)
    /* "src/main/resources/Java_16_Grammar.y":808  */
                              { yyval = null; };
  break;


  case 211: /* AnnotationInterfaceDeclaration: AT INTERFACE IDENTIFIER AnnotationInterfaceBody  */
  if (yyn == 211)
    /* "src/main/resources/Java_16_Grammar.y":812  */
                                                      { yyval = null; };
  break;


  case 223: /* Block: LBRACE RBRACE  */
  if (yyn == 223)
    /* "src/main/resources/Java_16_Grammar.y":844  */
                                      { yyval = null; };
  break;


  case 224: /* Block: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 224)
    /* "src/main/resources/Java_16_Grammar.y":845  */
                                      { yyval = new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1)))); };
  break;


  case 225: /* BlockStatementSeq: BlockStatement  */
  if (yyn == 225)
    /* "src/main/resources/Java_16_Grammar.y":849  */
                                           { yyval = new BlockStatements(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 226: /* BlockStatementSeq: BlockStatementSeq BlockStatement  */
  if (yyn == 226)
    /* "src/main/resources/Java_16_Grammar.y":850  */
                                       { yyval = ((tree.Statement.BlockStatements)(yystack.valueAt (1))).add(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 227: /* BlockStatement: ModifierSeqOpt BlockDeclaration  */
  if (yyn == 227)
    /* "src/main/resources/Java_16_Grammar.y":854  */
                                      { yyval = new BlockStatement(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 228: /* BlockStatement: Statement  */
  if (yyn == 228)
    /* "src/main/resources/Java_16_Grammar.y":855  */
                                      { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 229: /* BlockDeclaration: ClassDeclaration  */
  if (yyn == 229)
    /* "src/main/resources/Java_16_Grammar.y":859  */
                                         { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 230: /* BlockDeclaration: NormalInterfaceDeclaration  */
  if (yyn == 230)
    /* "src/main/resources/Java_16_Grammar.y":860  */
                                         { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 231: /* BlockDeclaration: LocalVariableDeclaration SEMICOLON  */
  if (yyn == 231)
    /* "src/main/resources/Java_16_Grammar.y":861  */
                                         { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (1))); };
  break;


  case 232: /* LocalVariableDeclaration: UnannotatedType VariableDeclaratorList  */
  if (yyn == 232)
    /* "src/main/resources/Java_16_Grammar.y":865  */
                                             { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (1))),((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 233: /* LocalVariableDeclaration: VAR VariableDeclaratorList  */
  if (yyn == 233)
    /* "src/main/resources/Java_16_Grammar.y":866  */
                                             { yyval = new TypeAndDeclarators(null,((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 239: /* SimpleStatement: Block  */
  if (yyn == 239)
    /* "src/main/resources/Java_16_Grammar.y":878  */
                                        { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 240: /* SimpleStatement: SEMICOLON  */
  if (yyn == 240)
    /* "src/main/resources/Java_16_Grammar.y":879  */
                                            { yyval = null; };
  break;


  case 241: /* SimpleStatement: StatementExpression SEMICOLON  */
  if (yyn == 241)
    /* "src/main/resources/Java_16_Grammar.y":880  */
                                        { yyval = ((StatementExpression)(yystack.valueAt (1))); };
  break;


  case 242: /* SimpleStatement: ASSERT Expression SEMICOLON  */
  if (yyn == 242)
    /* "src/main/resources/Java_16_Grammar.y":882  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (1))),null); };
  break;


  case 243: /* SimpleStatement: ASSERT Expression COLON Expression SEMICOLON  */
  if (yyn == 243)
    /* "src/main/resources/Java_16_Grammar.y":883  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 244: /* SimpleStatement: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 244)
    /* "src/main/resources/Java_16_Grammar.y":885  */
                                                   { yyval = null; };
  break;


  case 245: /* SimpleStatement: DO Statement WHILE LPAREN Expression RPAREN SEMICOLON  */
  if (yyn == 245)
    /* "src/main/resources/Java_16_Grammar.y":886  */
                                                            { yyval = new Do(null,((tree.Statement.Statement)(yystack.valueAt (5))),((tree.Expression.Expression)(yystack.valueAt (2)))); };
  break;


  case 246: /* SimpleStatement: BREAK SEMICOLON  */
  if (yyn == 246)
    /* "src/main/resources/Java_16_Grammar.y":888  */
                                  { yyval = new Break(null,null); };
  break;


  case 247: /* SimpleStatement: BREAK IDENTIFIER SEMICOLON  */
  if (yyn == 247)
    /* "src/main/resources/Java_16_Grammar.y":889  */
                                  { yyval = new Break(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 248: /* SimpleStatement: CONTINUE SEMICOLON  */
  if (yyn == 248)
    /* "src/main/resources/Java_16_Grammar.y":891  */
                                      { yyval = new Continue(null,null); };
  break;


  case 249: /* SimpleStatement: CONTINUE IDENTIFIER SEMICOLON  */
  if (yyn == 249)
    /* "src/main/resources/Java_16_Grammar.y":892  */
                                      { yyval = new Continue(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 250: /* SimpleStatement: RETURN SEMICOLON  */
  if (yyn == 250)
    /* "src/main/resources/Java_16_Grammar.y":894  */
                                      { yyval = new Return(null,null); };
  break;


  case 251: /* SimpleStatement: RETURN Expression SEMICOLON  */
  if (yyn == 251)
    /* "src/main/resources/Java_16_Grammar.y":895  */
                                      { yyval = new Return(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 252: /* SimpleStatement: SYNCHRONIZED LPAREN Expression RPAREN Block  */
  if (yyn == 252)
    /* "src/main/resources/Java_16_Grammar.y":897  */
                                                   { yyval = new Synchronized(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 253: /* SimpleStatement: THROW Expression SEMICOLON  */
  if (yyn == 253)
    /* "src/main/resources/Java_16_Grammar.y":899  */
                                  { yyval = new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 254: /* SimpleStatement: YIELD Expression SEMICOLON  */
  if (yyn == 254)
    /* "src/main/resources/Java_16_Grammar.y":900  */
                                  { yyval = new Yield(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 255: /* SimpleStatement: TRY Block Catches  */
  if (yyn == 255)
    /* "src/main/resources/Java_16_Grammar.y":903  */
                                   { yyval = null; };
  break;


  case 256: /* SimpleStatement: TRY Block Catches Finally  */
  if (yyn == 256)
    /* "src/main/resources/Java_16_Grammar.y":904  */
                                   { yyval = null; };
  break;


  case 257: /* SimpleStatement: TRY Block Finally  */
  if (yyn == 257)
    /* "src/main/resources/Java_16_Grammar.y":905  */
                                   { yyval = null; };
  break;


  case 258: /* SimpleStatement: TRY ResourceSpecification Block CatchesOpt FinallyOpt  */
  if (yyn == 258)
    /* "src/main/resources/Java_16_Grammar.y":907  */
                                   { yyval = null; };
  break;


  case 259: /* LabeledStatement: IDENTIFIER COLON Statement  */
  if (yyn == 259)
    /* "src/main/resources/Java_16_Grammar.y":911  */
                                 { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))).addLabel(((Token)(yystack.valueAt (2)))); };
  break;


  case 260: /* StatementExpression: Assignment  */
  if (yyn == 260)
    /* "src/main/resources/Java_16_Grammar.y":915  */
                                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 261: /* StatementExpression: PreIncrementExpression  */
  if (yyn == 261)
    /* "src/main/resources/Java_16_Grammar.y":916  */
                                   { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 262: /* StatementExpression: PreDecrementExpression  */
  if (yyn == 262)
    /* "src/main/resources/Java_16_Grammar.y":917  */
                                   { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 263: /* StatementExpression: PostIncrementExpression  */
  if (yyn == 263)
    /* "src/main/resources/Java_16_Grammar.y":918  */
                                   { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 264: /* StatementExpression: PostDecrementExpression  */
  if (yyn == 264)
    /* "src/main/resources/Java_16_Grammar.y":919  */
                                   { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 265: /* StatementExpression: MethodInvocation  */
  if (yyn == 265)
    /* "src/main/resources/Java_16_Grammar.y":920  */
                                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 266: /* StatementExpression: ClassInstanceCreationExpression  */
  if (yyn == 266)
    /* "src/main/resources/Java_16_Grammar.y":921  */
                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 267: /* IfThenElseStatement: IF LPAREN Expression RPAREN Statement ElsePartOpt  */
  if (yyn == 267)
    /* "src/main/resources/Java_16_Grammar.y":925  */
                                                        { yyval = null; };
  break;


  case 268: /* ElsePartOpt: %empty  */
  if (yyn == 268)
    /* "src/main/resources/Java_16_Grammar.y":929  */
                      { yyval = null; };
  break;


  case 269: /* ElsePartOpt: ELSE Statement  */
  if (yyn == 269)
    /* "src/main/resources/Java_16_Grammar.y":930  */
                      { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 270: /* SwitchBlock: LBRACE SwitchRuleSeq RBRACE  */
  if (yyn == 270)
    /* "src/main/resources/Java_16_Grammar.y":934  */
                                                                   { yyval = null; };
  break;


  case 271: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeqOpt RBRACE  */
  if (yyn == 271)
    /* "src/main/resources/Java_16_Grammar.y":935  */
                                                                   { yyval = null; };
  break;


  case 272: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeqOpt SwitchLabelSeq RBRACE  */
  if (yyn == 272)
    /* "src/main/resources/Java_16_Grammar.y":936  */
                                                                   { yyval = null; };
  break;


  case 273: /* SwitchRuleSeq: SwitchRule  */
  if (yyn == 273)
    /* "src/main/resources/Java_16_Grammar.y":940  */
                               { yyval = new SwitchRules(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 274: /* SwitchRuleSeq: SwitchRuleSeq SwitchRule  */
  if (yyn == 274)
    /* "src/main/resources/Java_16_Grammar.y":941  */
                               { yyval = ((SwitchRules)(yystack.valueAt (1))).add(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 275: /* SwitchRule: SwitchLabel ARROW Expression SEMICOLON  */
  if (yyn == 275)
    /* "src/main/resources/Java_16_Grammar.y":945  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 276: /* SwitchRule: SwitchLabel ARROW Block  */
  if (yyn == 276)
    /* "src/main/resources/Java_16_Grammar.y":946  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 277: /* SwitchRule: SwitchLabel ARROW THROW Expression SEMICOLON  */
  if (yyn == 277)
    /* "src/main/resources/Java_16_Grammar.y":947  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (4))),new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1))))); };
  break;


  case 283: /* SwitchLabelSeq: SwitchLabel COLON  */
  if (yyn == 283)
    /* "src/main/resources/Java_16_Grammar.y":962  */
                                       { yyval = new SwitchLabels(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 284: /* SwitchLabelSeq: SwitchLabelSeq SwitchLabel COLON  */
  if (yyn == 284)
    /* "src/main/resources/Java_16_Grammar.y":963  */
                                       { yyval = ((SwitchLabels)(yystack.valueAt (2))).add(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 285: /* SwitchLabel: CASE CaseExpressionList  */
  if (yyn == 285)
    /* "src/main/resources/Java_16_Grammar.y":967  */
                               { yyval = ((SwitchLabel)(yystack.valueAt (0))); };
  break;


  case 286: /* SwitchLabel: DEFAULT  */
  if (yyn == 286)
    /* "src/main/resources/Java_16_Grammar.y":968  */
                                   { yyval = null; };
  break;


  case 287: /* CaseExpressionList: AssignmentExpression  */
  if (yyn == 287)
    /* "src/main/resources/Java_16_Grammar.y":972  */
                                                    { yyval = new SwitchLabel(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 288: /* CaseExpressionList: CaseExpressionList COMMA AssignmentExpression  */
  if (yyn == 288)
    /* "src/main/resources/Java_16_Grammar.y":973  */
                                                    { yyval = ((SwitchLabel)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 289: /* WhileStatement: WHILE LPAREN Expression RPAREN Statement  */
  if (yyn == 289)
    /* "src/main/resources/Java_16_Grammar.y":980  */
                                                { yyval = new While(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 290: /* ForStatement: BasicForStatement  */
  if (yyn == 290)
    /* "src/main/resources/Java_16_Grammar.y":984  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 291: /* ForStatement: EnhancedForStatement  */
  if (yyn == 291)
    /* "src/main/resources/Java_16_Grammar.y":985  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 292: /* BasicForStatement: FOR LPAREN ForInitOpt SEMICOLON ExpressionOpt SEMICOLON StatementExpressionListOpt RPAREN Statement  */
  if (yyn == 292)
    /* "src/main/resources/Java_16_Grammar.y":990  */
                          { yyval = null; };
  break;


  case 296: /* ExpressionOpt: %empty  */
  if (yyn == 296)
    /* "src/main/resources/Java_16_Grammar.y":1000  */
                  { yyval = null; };
  break;


  case 297: /* ExpressionOpt: Expression  */
  if (yyn == 297)
    /* "src/main/resources/Java_16_Grammar.y":1001  */
                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 298: /* StatementExpressionList: StatementExpression  */
  if (yyn == 298)
    /* "src/main/resources/Java_16_Grammar.y":1008  */
                                                        { yyval = ((StatementExpression)(yystack.valueAt (0))); };
  break;


  case 299: /* StatementExpressionList: StatementExpressionList COMMA StatementExpression  */
  if (yyn == 299)
    /* "src/main/resources/Java_16_Grammar.y":1009  */
                                                        { yyval = ((StatementExpressions)(yystack.valueAt (2))).add(((StatementExpression)(yystack.valueAt (0)))); };
  break;


  case 300: /* StatementExpressionListOpt: %empty  */
  if (yyn == 300)
    /* "src/main/resources/Java_16_Grammar.y":1013  */
                               { yyval = null; };
  break;


  case 301: /* StatementExpressionListOpt: StatementExpressionList  */
  if (yyn == 301)
    /* "src/main/resources/Java_16_Grammar.y":1014  */
                               { yyval = ((StatementExpressions)(yystack.valueAt (0))); };
  break;


  case 302: /* EnhancedForStatement: FOR LPAREN LocalVariableDeclaration COLON Expression RPAREN Statement  */
  if (yyn == 302)
    /* "src/main/resources/Java_16_Grammar.y":1018  */
                                                                            { yyval = null; };
  break;


  case 303: /* CatchesOpt: %empty  */
  if (yyn == 303)
    /* "src/main/resources/Java_16_Grammar.y":1022  */
               { yyval = null; };
  break;


  case 304: /* CatchesOpt: Catches  */
  if (yyn == 304)
    /* "src/main/resources/Java_16_Grammar.y":1023  */
               { yyval = ((CatchClauses)(yystack.valueAt (0))); };
  break;


  case 305: /* Catches: CatchClause  */
  if (yyn == 305)
    /* "src/main/resources/Java_16_Grammar.y":1027  */
                            { yyval = new CatchClauses(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 306: /* Catches: Catches CatchClause  */
  if (yyn == 306)
    /* "src/main/resources/Java_16_Grammar.y":1028  */
                            { yyval = ((CatchClauses)(yystack.valueAt (1))).add(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 307: /* CatchClause: CATCH LPAREN CatchFormalParameter RPAREN Block  */
  if (yyn == 307)
    /* "src/main/resources/Java_16_Grammar.y":1032  */
                                                     { yyval = new CatchClause(((CatchParameter)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 308: /* CatchFormalParameter: ModifierSeqOpt CatchType IDENTIFIER DimsOpt  */
  if (yyn == 308)
    /* "src/main/resources/Java_16_Grammar.y":1036  */
                                                  { yyval = new CatchParameter(((Modifiers)(yystack.valueAt (3))),((tree.Type.TypeList)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 309: /* CatchType: Type  */
  if (yyn == 309)
    /* "src/main/resources/Java_16_Grammar.y":1040  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 310: /* CatchType: CatchType VERTICAL Type  */
  if (yyn == 310)
    /* "src/main/resources/Java_16_Grammar.y":1041  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 321: /* Primary: Literal  */
  if (yyn == 321)
    /* "src/main/resources/Java_16_Grammar.y":1078  */
                                        { yyval = new Literal(((Token)(yystack.valueAt (0)))); };
  break;


  case 322: /* Primary: Type DimsOpt DOT CLASS  */
  if (yyn == 322)
    /* "src/main/resources/Java_16_Grammar.y":1079  */
                                        { yyval = new ClassLiteral(((tree.Type.Type)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2)))); };
  break;


  case 323: /* Primary: VOID DimsOpt DOT CLASS  */
  if (yyn == 323)
    /* "src/main/resources/Java_16_Grammar.y":1080  */
                                        { yyval = new ClassLiteral(null,((Dims)(yystack.valueAt (2)))); };
  break;


  case 324: /* Primary: THIS  */
  if (yyn == 324)
    /* "src/main/resources/Java_16_Grammar.y":1081  */
                                        { yyval = new This(null); };
  break;


  case 325: /* Primary: Type DOT THIS  */
  if (yyn == 325)
    /* "src/main/resources/Java_16_Grammar.y":1082  */
                                        { yyval = new This(((tree.Type.Type)(yystack.valueAt (2)))); };
  break;


  case 326: /* Primary: LPAREN Expression RPAREN  */
  if (yyn == 326)
    /* "src/main/resources/Java_16_Grammar.y":1083  */
                                        { yyval = new Parenthesized(((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 327: /* Primary: ClassInstanceCreationExpression  */
  if (yyn == 327)
    /* "src/main/resources/Java_16_Grammar.y":1084  */
                                        { yyval = null; };
  break;


  case 328: /* Primary: FieldAccess  */
  if (yyn == 328)
    /* "src/main/resources/Java_16_Grammar.y":1085  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 329: /* Primary: ArrayAccess  */
  if (yyn == 329)
    /* "src/main/resources/Java_16_Grammar.y":1086  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 330: /* Primary: MethodInvocation  */
  if (yyn == 330)
    /* "src/main/resources/Java_16_Grammar.y":1087  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 331: /* Primary: MethodReference  */
  if (yyn == 331)
    /* "src/main/resources/Java_16_Grammar.y":1088  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 332: /* Primary: ArrayCreationExpression  */
  if (yyn == 332)
    /* "src/main/resources/Java_16_Grammar.y":1089  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 333: /* ClassInstanceCreationExpression: UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 333)
    /* "src/main/resources/Java_16_Grammar.y":1099  */
                                                                  { yyval = null; };
  break;


  case 334: /* ClassInstanceCreationExpression: CompoundName DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 334)
    /* "src/main/resources/Java_16_Grammar.y":1100  */
                                                                  { yyval = null; };
  break;


  case 335: /* ClassInstanceCreationExpression: Primary DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 335)
    /* "src/main/resources/Java_16_Grammar.y":1101  */
                                                                  { yyval = null; };
  break;


  case 341: /* TypeArgumentsOpt: %empty  */
  if (yyn == 341)
    /* "src/main/resources/Java_16_Grammar.y":1119  */
                      { yyval = null; };
  break;


  case 342: /* TypeArgumentsOpt: TypeArguments  */
  if (yyn == 342)
    /* "src/main/resources/Java_16_Grammar.y":1120  */
                      { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (0))); };
  break;


  case 343: /* TypeArguments: LESS TypeArgumentList GREATER  */
  if (yyn == 343)
    /* "src/main/resources/Java_16_Grammar.y":1124  */
                                     { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (1))); };
  break;


  case 344: /* TypeArgumentList: TypeArgument  */
  if (yyn == 344)
    /* "src/main/resources/Java_16_Grammar.y":1128  */
                                           { yyval = new TypeArguments(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 345: /* TypeArgumentList: TypeArgumentList COMMA TypeArgument  */
  if (yyn == 345)
    /* "src/main/resources/Java_16_Grammar.y":1129  */
                                           { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (2))).add(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 346: /* TypeArgument: Type  */
  if (yyn == 346)
    /* "src/main/resources/Java_16_Grammar.y":1133  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),0,null); };
  break;


  case 347: /* TypeArgument: QUESTION  */
  if (yyn == 347)
    /* "src/main/resources/Java_16_Grammar.y":1134  */
                                               { yyval = new TypeArgument(null,1,null); };
  break;


  case 348: /* TypeArgument: QUESTION EXTENDS Type  */
  if (yyn == 348)
    /* "src/main/resources/Java_16_Grammar.y":1135  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),1,null); };
  break;


  case 349: /* TypeArgument: QUESTION SUPER Type  */
  if (yyn == 349)
    /* "src/main/resources/Java_16_Grammar.y":1136  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,null); };
  break;


  case 350: /* TypeArgument: AnnotationSeq QUESTION  */
  if (yyn == 350)
    /* "src/main/resources/Java_16_Grammar.y":1137  */
                                               { yyval = new TypeArgument(null,1,((Annotations)(yystack.valueAt (1)))); };
  break;


  case 351: /* TypeArgument: AnnotationSeq QUESTION EXTENDS Type  */
  if (yyn == 351)
    /* "src/main/resources/Java_16_Grammar.y":1138  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 352: /* TypeArgument: AnnotationSeq QUESTION SUPER Type  */
  if (yyn == 352)
    /* "src/main/resources/Java_16_Grammar.y":1139  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),3,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 353: /* FieldAccess: Primary DOT IDENTIFIER  */
  if (yyn == 353)
    /* "src/main/resources/Java_16_Grammar.y":1149  */
                                             { yyval = new FieldAccess(((tree.Expression.Expression)(yystack.valueAt (2))),  false,((Token)(yystack.valueAt (0)))); };
  break;


  case 354: /* FieldAccess: SUPER DOT IDENTIFIER  */
  if (yyn == 354)
    /* "src/main/resources/Java_16_Grammar.y":1150  */
                                             { yyval = new FieldAccess(null,true, ((Token)(yystack.valueAt (0)))); };
  break;


  case 355: /* FieldAccess: CompoundName DOT SUPER DOT IDENTIFIER  */
  if (yyn == 355)
    /* "src/main/resources/Java_16_Grammar.y":1151  */
                                             { yyval = new FieldAccess(new SimpleReference(((CompoundName)(yystack.valueAt (4)))),true,((Token)(yystack.valueAt (0)))); };
  break;


  case 356: /* ArrayAccess: CompoundName LBRACKET Expression RBRACKET  */
  if (yyn == 356)
    /* "src/main/resources/Java_16_Grammar.y":1155  */
                                                 { yyval = new ArrayAccess(new SimpleReference(((CompoundName)(yystack.valueAt (3)))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 357: /* ArrayAccess: Primary LBRACKET Expression RBRACKET  */
  if (yyn == 357)
    /* "src/main/resources/Java_16_Grammar.y":1156  */
                                                 { yyval = new ArrayAccess(((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 358: /* MethodInvocation: IDENTIFIER Arguments  */
  if (yyn == 358)
    /* "src/main/resources/Java_16_Grammar.y":1160  */
                                                                       { yyval = null; };
  break;


  case 359: /* MethodInvocation: CompoundName DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 359)
    /* "src/main/resources/Java_16_Grammar.y":1161  */
                                                                       { yyval = null; };
  break;


  case 360: /* MethodInvocation: Primary DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 360)
    /* "src/main/resources/Java_16_Grammar.y":1162  */
                                                                       { yyval = null; };
  break;


  case 361: /* MethodInvocation: SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 361)
    /* "src/main/resources/Java_16_Grammar.y":1163  */
                                                                       { yyval = null; };
  break;


  case 362: /* MethodInvocation: CompoundName DOT SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 362)
    /* "src/main/resources/Java_16_Grammar.y":1164  */
                                                                       { yyval = null; };
  break;


  case 363: /* Arguments: LPAREN RPAREN  */
  if (yyn == 363)
    /* "src/main/resources/Java_16_Grammar.y":1168  */
                                 { yyval = null; };
  break;


  case 364: /* Arguments: LPAREN ArgumentList RPAREN  */
  if (yyn == 364)
    /* "src/main/resources/Java_16_Grammar.y":1169  */
                                 { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (1))); };
  break;


  case 365: /* ArgumentList: Expression  */
  if (yyn == 365)
    /* "src/main/resources/Java_16_Grammar.y":1178  */
                                    { yyval = new ArgumentList(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 366: /* ArgumentList: ArgumentList COMMA Expression  */
  if (yyn == 366)
    /* "src/main/resources/Java_16_Grammar.y":1179  */
                                    { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 367: /* MethodReference: CompoundName DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 367)
    /* "src/main/resources/Java_16_Grammar.y":1183  */
                                                              { yyval = null; };
  break;


  case 368: /* MethodReference: Primary DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 368)
    /* "src/main/resources/Java_16_Grammar.y":1184  */
                                                              { yyval = null; };
  break;


  case 369: /* MethodReference: Type DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 369)
    /* "src/main/resources/Java_16_Grammar.y":1185  */
                                                              { yyval = null; };
  break;


  case 370: /* MethodReference: SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 370)
    /* "src/main/resources/Java_16_Grammar.y":1186  */
                                                              { yyval = null; };
  break;


  case 371: /* MethodReference: Type DOT SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 371)
    /* "src/main/resources/Java_16_Grammar.y":1187  */
                                                              { yyval = null; };
  break;


  case 372: /* MethodReference: Type DBL_COLON TypeArgumentsOpt NEW  */
  if (yyn == 372)
    /* "src/main/resources/Java_16_Grammar.y":1188  */
                                                              { yyval = null; };
  break;


  case 373: /* ArrayCreationExpression: NEW Type DimExprs DimsOpt  */
  if (yyn == 373)
    /* "src/main/resources/Java_16_Grammar.y":1192  */
                                       { yyval = null; };
  break;


  case 374: /* ArrayCreationExpression: NEW Type Dims ArrayInitializer  */
  if (yyn == 374)
    /* "src/main/resources/Java_16_Grammar.y":1193  */
                                       { yyval = null; };
  break;


  case 379: /* Expression: LambdaExpression  */
  if (yyn == 379)
    /* "src/main/resources/Java_16_Grammar.y":1209  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 380: /* Expression: AssignmentExpression  */
  if (yyn == 380)
    /* "src/main/resources/Java_16_Grammar.y":1210  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 381: /* LambdaExpression: IDENTIFIER ARROW Expression  */
  if (yyn == 381)
    /* "src/main/resources/Java_16_Grammar.y":1215  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 382: /* LambdaExpression: IDENTIFIER ARROW Block  */
  if (yyn == 382)
    /* "src/main/resources/Java_16_Grammar.y":1217  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 383: /* LambdaExpression: LambdaParameters ARROW Expression  */
  if (yyn == 383)
    /* "src/main/resources/Java_16_Grammar.y":1218  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 384: /* LambdaExpression: LambdaParameters ARROW Block  */
  if (yyn == 384)
    /* "src/main/resources/Java_16_Grammar.y":1219  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 385: /* LambdaParameters: LPAREN RPAREN  */
  if (yyn == 385)
    /* "src/main/resources/Java_16_Grammar.y":1228  */
                                           { yyval = null; };
  break;


  case 386: /* LambdaParameters: LPAREN LambdaParameterList1 RPAREN  */
  if (yyn == 386)
    /* "src/main/resources/Java_16_Grammar.y":1229  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 387: /* LambdaParameters: LPAREN LambdaParameterList2 RPAREN  */
  if (yyn == 387)
    /* "src/main/resources/Java_16_Grammar.y":1230  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 388: /* LambdaParameterList1: IDENTIFIER  */
  if (yyn == 388)
    /* "src/main/resources/Java_16_Grammar.y":1235  */
                                             { yyval = new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 389: /* LambdaParameterList1: LambdaParameterList1 COMMA IDENTIFIER  */
  if (yyn == 389)
    /* "src/main/resources/Java_16_Grammar.y":1236  */
                                             { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 390: /* LambdaParameterList2: LambdaParameter  */
  if (yyn == 390)
    /* "src/main/resources/Java_16_Grammar.y":1240  */
                                                 { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 391: /* LambdaParameterList2: LambdaParameterList2 COMMA LambdaParameter  */
  if (yyn == 391)
    /* "src/main/resources/Java_16_Grammar.y":1241  */
                                                 { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 392: /* LambdaParameter: ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt  */
  if (yyn == 392)
    /* "src/main/resources/Java_16_Grammar.y":1252  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 393: /* LambdaParameter: ModifierSeqOpt VAR IDENTIFIER DimsOpt  */
  if (yyn == 393)
    /* "src/main/resources/Java_16_Grammar.y":1253  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),null,((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 394: /* LambdaParameter: ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 394)
    /* "src/main/resources/Java_16_Grammar.y":1255  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (4))),((tree.Type.UnannotatedType)(yystack.valueAt (3))),((Token)(yystack.valueAt (0))).image,((Annotations)(yystack.valueAt (2))),true,null); };
  break;


  case 395: /* AssignmentExpression: ConditionalExpression  */
  if (yyn == 395)
    /* "src/main/resources/Java_16_Grammar.y":1265  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 396: /* AssignmentExpression: Assignment  */
  if (yyn == 396)
    /* "src/main/resources/Java_16_Grammar.y":1266  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 397: /* Assignment: LeftHandSide AssignmentOperator Expression  */
  if (yyn == 397)
    /* "src/main/resources/Java_16_Grammar.y":1270  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 398: /* LeftHandSide: CompoundName  */
  if (yyn == 398)
    /* "src/main/resources/Java_16_Grammar.y":1274  */
                   { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 399: /* LeftHandSide: FieldAccess  */
  if (yyn == 399)
    /* "src/main/resources/Java_16_Grammar.y":1275  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 400: /* LeftHandSide: ArrayAccess  */
  if (yyn == 400)
    /* "src/main/resources/Java_16_Grammar.y":1276  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 401: /* AssignmentOperator: EQUAL  */
  if (yyn == 401)
    /* "src/main/resources/Java_16_Grammar.y":1280  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 402: /* AssignmentOperator: STAR_EQUAL  */
  if (yyn == 402)
    /* "src/main/resources/Java_16_Grammar.y":1281  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 403: /* AssignmentOperator: SLASH_EQUAL  */
  if (yyn == 403)
    /* "src/main/resources/Java_16_Grammar.y":1282  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 404: /* AssignmentOperator: PERCENT_EQUAL  */
  if (yyn == 404)
    /* "src/main/resources/Java_16_Grammar.y":1283  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 405: /* AssignmentOperator: PLUS_EQUAL  */
  if (yyn == 405)
    /* "src/main/resources/Java_16_Grammar.y":1284  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 406: /* AssignmentOperator: MINUS_EQUAL  */
  if (yyn == 406)
    /* "src/main/resources/Java_16_Grammar.y":1285  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 407: /* AssignmentOperator: LESS_LESS_EQUAL  */
  if (yyn == 407)
    /* "src/main/resources/Java_16_Grammar.y":1286  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 408: /* AssignmentOperator: GR_GR_EQUAL  */
  if (yyn == 408)
    /* "src/main/resources/Java_16_Grammar.y":1287  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 409: /* AssignmentOperator: GR_GR_GR_EQUAL  */
  if (yyn == 409)
    /* "src/main/resources/Java_16_Grammar.y":1288  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 410: /* AssignmentOperator: AMP_EQUAL  */
  if (yyn == 410)
    /* "src/main/resources/Java_16_Grammar.y":1289  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 411: /* AssignmentOperator: CARET_EQUAL  */
  if (yyn == 411)
    /* "src/main/resources/Java_16_Grammar.y":1290  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 412: /* AssignmentOperator: VERTICAL_EQUAL  */
  if (yyn == 412)
    /* "src/main/resources/Java_16_Grammar.y":1291  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 413: /* ConditionalExpression: ConditionalOrExpression ConditionalOrTail  */
  if (yyn == 413)
    /* "src/main/resources/Java_16_Grammar.y":1295  */
                                                { if ( ((tree.Expression.Binary)(yystack.valueAt (0))) == null ) yyval = ((tree.Expression.Expression)(yystack.valueAt (1)));
                                                  else              yyval = new Conditional(((tree.Expression.Expression)(yystack.valueAt (1))),((tree.Expression.Binary)(yystack.valueAt (0))).left,((tree.Expression.Binary)(yystack.valueAt (0))).right); };
  break;


  case 414: /* ConditionalOrTail: %empty  */
  if (yyn == 414)
    /* "src/main/resources/Java_16_Grammar.y":1300  */
                                                       { yyval = null; };
  break;


  case 415: /* ConditionalOrTail: QUESTION Expression COLON ConditionalExpression  */
  if (yyn == 415)
    /* "src/main/resources/Java_16_Grammar.y":1301  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 416: /* ConditionalOrTail: QUESTION Expression COLON LambdaExpression  */
  if (yyn == 416)
    /* "src/main/resources/Java_16_Grammar.y":1302  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 417: /* ConditionalOrExpression: ConditionalAndExpression  */
  if (yyn == 417)
    /* "src/main/resources/Java_16_Grammar.y":1306  */
                                                                    { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 418: /* ConditionalOrExpression: ConditionalOrExpression DBL_VERTICAL ConditionalAndExpression  */
  if (yyn == 418)
    /* "src/main/resources/Java_16_Grammar.y":1307  */
                                                                    { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 419: /* ConditionalAndExpression: InclusiveOrExpression  */
  if (yyn == 419)
    /* "src/main/resources/Java_16_Grammar.y":1311  */
                                                                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 420: /* ConditionalAndExpression: ConditionalAndExpression DBL_AMPERSAND InclusiveOrExpression  */
  if (yyn == 420)
    /* "src/main/resources/Java_16_Grammar.y":1312  */
                                                                   { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 421: /* InclusiveOrExpression: ExclusiveOrExpression  */
  if (yyn == 421)
    /* "src/main/resources/Java_16_Grammar.y":1316  */
                                                           { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 422: /* InclusiveOrExpression: InclusiveOrExpression VERTICAL ExclusiveOrExpression  */
  if (yyn == 422)
    /* "src/main/resources/Java_16_Grammar.y":1317  */
                                                           { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 423: /* ExclusiveOrExpression: AndExpression  */
  if (yyn == 423)
    /* "src/main/resources/Java_16_Grammar.y":1321  */
                                                { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 424: /* ExclusiveOrExpression: ExclusiveOrExpression CARET AndExpression  */
  if (yyn == 424)
    /* "src/main/resources/Java_16_Grammar.y":1322  */
                                                { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 425: /* AndExpression: EqualityExpression  */
  if (yyn == 425)
    /* "src/main/resources/Java_16_Grammar.y":1326  */
                                                 { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 426: /* AndExpression: AndExpression AMPERSAND EqualityExpression  */
  if (yyn == 426)
    /* "src/main/resources/Java_16_Grammar.y":1327  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 427: /* EqualityExpression: RelationalExpression  */
  if (yyn == 427)
    /* "src/main/resources/Java_16_Grammar.y":1331  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 428: /* EqualityExpression: EqualityExpression DBL_EQUAL RelationalExpression  */
  if (yyn == 428)
    /* "src/main/resources/Java_16_Grammar.y":1332  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 429: /* EqualityExpression: EqualityExpression NON_EQUAL RelationalExpression  */
  if (yyn == 429)
    /* "src/main/resources/Java_16_Grammar.y":1333  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 430: /* RelationalExpression: ShiftExpression  */
  if (yyn == 430)
    /* "src/main/resources/Java_16_Grammar.y":1337  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 431: /* RelationalExpression: RelationalExpression LESS ShiftExpression  */
  if (yyn == 431)
    /* "src/main/resources/Java_16_Grammar.y":1338  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 432: /* RelationalExpression: RelationalExpression GREATER ShiftExpression  */
  if (yyn == 432)
    /* "src/main/resources/Java_16_Grammar.y":1339  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 433: /* RelationalExpression: RelationalExpression LESS_EQUAL ShiftExpression  */
  if (yyn == 433)
    /* "src/main/resources/Java_16_Grammar.y":1340  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 434: /* RelationalExpression: RelationalExpression GREATER_EQUAL ShiftExpression  */
  if (yyn == 434)
    /* "src/main/resources/Java_16_Grammar.y":1341  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 435: /* RelationalExpression: InstanceofExpression  */
  if (yyn == 435)
    /* "src/main/resources/Java_16_Grammar.y":1342  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 436: /* InstanceofExpression: RelationalExpression INSTANCEOF Type  */
  if (yyn == 436)
    /* "src/main/resources/Java_16_Grammar.y":1346  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 437: /* InstanceofExpression: RelationalExpression INSTANCEOF Pattern  */
  if (yyn == 437)
    /* "src/main/resources/Java_16_Grammar.y":1347  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 438: /* ShiftExpression: AdditiveExpression  */
  if (yyn == 438)
    /* "src/main/resources/Java_16_Grammar.y":1351  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 439: /* ShiftExpression: ShiftExpression DBL_LESS AdditiveExpression  */
  if (yyn == 439)
    /* "src/main/resources/Java_16_Grammar.y":1352  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 440: /* ShiftExpression: ShiftExpression DBL_GREATER AdditiveExpression  */
  if (yyn == 440)
    /* "src/main/resources/Java_16_Grammar.y":1353  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 441: /* ShiftExpression: ShiftExpression TRIPL_GREATER AdditiveExpression  */
  if (yyn == 441)
    /* "src/main/resources/Java_16_Grammar.y":1354  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 442: /* AdditiveExpression: MultiplicativeExpression  */
  if (yyn == 442)
    /* "src/main/resources/Java_16_Grammar.y":1358  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 443: /* AdditiveExpression: AdditiveExpression PLUS MultiplicativeExpression  */
  if (yyn == 443)
    /* "src/main/resources/Java_16_Grammar.y":1359  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 444: /* AdditiveExpression: AdditiveExpression MINUS MultiplicativeExpression  */
  if (yyn == 444)
    /* "src/main/resources/Java_16_Grammar.y":1360  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 445: /* MultiplicativeExpression: UnaryExpression  */
  if (yyn == 445)
    /* "src/main/resources/Java_16_Grammar.y":1364  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 446: /* MultiplicativeExpression: MultiplicativeExpression STAR UnaryExpression  */
  if (yyn == 446)
    /* "src/main/resources/Java_16_Grammar.y":1365  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 447: /* MultiplicativeExpression: MultiplicativeExpression SLASH UnaryExpression  */
  if (yyn == 447)
    /* "src/main/resources/Java_16_Grammar.y":1366  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 448: /* MultiplicativeExpression: MultiplicativeExpression PERCENT UnaryExpression  */
  if (yyn == 448)
    /* "src/main/resources/Java_16_Grammar.y":1367  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 449: /* UnaryExpression: PreIncrementExpression  */
  if (yyn == 449)
    /* "src/main/resources/Java_16_Grammar.y":1371  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 450: /* UnaryExpression: PreDecrementExpression  */
  if (yyn == 450)
    /* "src/main/resources/Java_16_Grammar.y":1372  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 451: /* UnaryExpression: PLUS UnaryExpression  */
  if (yyn == 451)
    /* "src/main/resources/Java_16_Grammar.y":1373  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 452: /* UnaryExpression: MINUS UnaryExpression  */
  if (yyn == 452)
    /* "src/main/resources/Java_16_Grammar.y":1374  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 453: /* UnaryExpression: UnaryExpressionNotPlusMinus  */
  if (yyn == 453)
    /* "src/main/resources/Java_16_Grammar.y":1375  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 454: /* PreIncrementExpression: DBL_PLUS UnaryExpression  */
  if (yyn == 454)
    /* "src/main/resources/Java_16_Grammar.y":1379  */
                               { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 455: /* PreDecrementExpression: DBL_MINUS UnaryExpression  */
  if (yyn == 455)
    /* "src/main/resources/Java_16_Grammar.y":1383  */
                                 { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 457: /* UnaryExpressionNotPlusMinus: TILDE UnaryExpression  */
  if (yyn == 457)
    /* "src/main/resources/Java_16_Grammar.y":1388  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 458: /* UnaryExpressionNotPlusMinus: EXCLAMATION UnaryExpression  */
  if (yyn == 458)
    /* "src/main/resources/Java_16_Grammar.y":1389  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 459: /* UnaryExpressionNotPlusMinus: CastExpression  */
  if (yyn == 459)
    /* "src/main/resources/Java_16_Grammar.y":1390  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 460: /* UnaryExpressionNotPlusMinus: SwitchExpression  */
  if (yyn == 460)
    /* "src/main/resources/Java_16_Grammar.y":1391  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 461: /* PostfixExpression: Primary  */
  if (yyn == 461)
    /* "src/main/resources/Java_16_Grammar.y":1395  */
                               { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 462: /* PostfixExpression: CompoundName  */
  if (yyn == 462)
    /* "src/main/resources/Java_16_Grammar.y":1396  */
                               { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 463: /* PostfixExpression: PostIncrementExpression  */
  if (yyn == 463)
    /* "src/main/resources/Java_16_Grammar.y":1397  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 464: /* PostfixExpression: PostDecrementExpression  */
  if (yyn == 464)
    /* "src/main/resources/Java_16_Grammar.y":1398  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 465: /* PostIncrementExpression: PostfixExpression DBL_PLUS  */
  if (yyn == 465)
    /* "src/main/resources/Java_16_Grammar.y":1402  */
                                 { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 466: /* PostDecrementExpression: PostfixExpression DBL_MINUS  */
  if (yyn == 466)
    /* "src/main/resources/Java_16_Grammar.y":1406  */
                                  { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 467: /* CastExpression: TargetType UnaryExpression  */
  if (yyn == 467)
    /* "src/main/resources/Java_16_Grammar.y":1410  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 468: /* CastExpression: TargetType LambdaExpression  */
  if (yyn == 468)
    /* "src/main/resources/Java_16_Grammar.y":1411  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 469: /* TargetType: LPAREN TypeList RPAREN  */
  if (yyn == 469)
    /* "src/main/resources/Java_16_Grammar.y":1415  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (1))); };
  break;


  case 470: /* TypeList: Type  */
  if (yyn == 470)
    /* "src/main/resources/Java_16_Grammar.y":1419  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 471: /* TypeList: TypeList AMPERSAND Type  */
  if (yyn == 471)
    /* "src/main/resources/Java_16_Grammar.y":1420  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 472: /* SwitchExpression: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 472)
    /* "src/main/resources/Java_16_Grammar.y":1424  */
                                                  { yyval = new SwitchExpression(((tree.Expression.Expression)(yystack.valueAt (2))),((SwitchBlock)(yystack.valueAt (0)))); };
  break;


  case 473: /* AnnotationSeqOpt: %empty  */
  if (yyn == 473)
    /* "src/main/resources/Java_16_Grammar.y":1436  */
                       { yyval = null; };
  break;


  case 474: /* AnnotationSeqOpt: AnnotationSeq  */
  if (yyn == 474)
    /* "src/main/resources/Java_16_Grammar.y":1437  */
                       { yyval = ((Annotations)(yystack.valueAt (0))); };
  break;


  case 475: /* AnnotationSeq: Annotation  */
  if (yyn == 475)
    /* "src/main/resources/Java_16_Grammar.y":1441  */
                                { yyval = new Annotations(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 476: /* AnnotationSeq: AnnotationSeq Annotation  */
  if (yyn == 476)
    /* "src/main/resources/Java_16_Grammar.y":1442  */
                                { yyval = ((Annotations)(yystack.valueAt (1))).add(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 477: /* Annotation: AT CompoundName  */
  if (yyn == 477)
    /* "src/main/resources/Java_16_Grammar.y":1446  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (0))),(AnnoParameterList)null); };
  break;


  case 478: /* Annotation: AT CompoundName LPAREN RPAREN  */
  if (yyn == 478)
    /* "src/main/resources/Java_16_Grammar.y":1447  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (2))),(AnnoParameterList)null); };
  break;


  case 479: /* Annotation: AT CompoundName LPAREN AnnoParameterList RPAREN  */
  if (yyn == 479)
    /* "src/main/resources/Java_16_Grammar.y":1448  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),/*$4*/ (AnnoParameterList)null); };
  break;


  case 480: /* Annotation: AT CompoundName LPAREN ElementValue RPAREN  */
  if (yyn == 480)
    /* "src/main/resources/Java_16_Grammar.y":1449  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),(AnnoElementValue)null); };
  break;


  case 481: /* AnnoParameterList: IDENTIFIER EQUAL ElementValue  */
  if (yyn == 481)
    /* "src/main/resources/Java_16_Grammar.y":1453  */
                                                            { yyval = null; };
  break;


  case 482: /* AnnoParameterList: AnnoParameterList COMMA IDENTIFIER EQUAL ElementValue  */
  if (yyn == 482)
    /* "src/main/resources/Java_16_Grammar.y":1454  */
                                                            { yyval = null; };
  break;


  case 483: /* ElementValue: ConditionalExpression  */
  if (yyn == 483)
    /* "src/main/resources/Java_16_Grammar.y":1458  */
                                                 { yyval = null; };
  break;


  case 484: /* ElementValue: LBRACE ElementValueListOpt RBRACE  */
  if (yyn == 484)
    /* "src/main/resources/Java_16_Grammar.y":1459  */
                                                 { yyval = null; };
  break;


  case 485: /* ElementValue: LBRACE COMMA RBRACE  */
  if (yyn == 485)
    /* "src/main/resources/Java_16_Grammar.y":1460  */
                                                 { yyval = null; };
  break;


  case 486: /* ElementValue: Annotation  */
  if (yyn == 486)
    /* "src/main/resources/Java_16_Grammar.y":1461  */
                                                 { yyval = null; };
  break;



/* "src/main/java/parser/JavaParser.java":4116  */

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



  /**
   * Build and emit a "syntax error" message in a user-defined way.
   *
   * @param ctx  The context of the error.
   */
  private void yyreportSyntaxError(Context yyctx) {
      yyerror("syntax error");
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

  private static final short yypact_ninf_ = -631;
  private static final short yytable_ninf_ = -487;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
    1540,    -8,  -631,  -631,  -631,     8,  -631,    -8,  -631,  -631,
    -631,  -631,  -631,  -631,  -631,  -631,   118,  -631,   760,  -631,
      64,  -631,  -631,   927,  -631,  -631,  2871,  -631,  -631,   318,
      -8,   526,   642,    -8,  -631,  -631,    81,  -631,   215,   760,
    -631,  2932,    22,   674,   169,  -631,    76,   303,    20,   180,
     188,   207,   221,  -631,  -631,  -631,  -631,  -631,  -631,  -631,
    -631,    81,  3592,  -631,  2998,  3658,  3658,  3658,  3658,  3658,
    3658,   292,  -631,  -631,  -631,  -631,  -631,  -631,  -631,  -631,
    -631,  -631,  -631,  -631,  1122,  -631,  -631,   550,   302,  -631,
    -631,   319,  -631,   451,   467,   319,  -631,   490,  -631,  -631,
    -631,  -631,  -631,  -631,  -631,  -631,   130,   288,   350,   426,
     448,   378,   209,  -631,   556,   632,   625,  -631,  -631,  -631,
    -631,   649,  -631,  -631,  -631,  3592,  -631,  1342,   505,   349,
     474,  -631,   193,  -631,   478,  1061,   452,   416,   477,   424,
     477,   477,  -631,  2820,   293,  4516,   467,  1789,  1903,   513,
    -631,   500,  -631,  -631,  2018,  -631,   282,   537,   561,  -631,
     489,  -631,  -631,  -631,  -631,  -631,  -631,  3130,  3196,  -631,
    1031,    77,   394,   535,  -631,    47,   563,  3592,   587,   595,
     319,  -631,   399,  3592,    46,   563,  -631,   491,   563,   612,
    -631,  3592,    78,   563,  3592,  3658,  -631,  3658,  3658,  3658,
    3658,  3658,  3658,  3658,  3658,  3658,  3658,   420,  3658,  3658,
    3658,  3658,  3658,  3658,  3658,  3658,  -631,  -631,  -631,  -631,
     319,  -631,   516,  -631,   616,  -631,  -631,  1561,   254,    -8,
      -8,    -8,    -8,   641,   452,  -631,   627,    21,   574,  -631,
    1342,   673,   613,   677,  -631,   321,   539,   393,   530,  -631,
    4335,  3262,  -631,  3262,  -631,  -631,  -631,  -631,  -631,  -631,
    -631,  -631,  -631,  -631,  -631,  -631,  3592,  -631,  1342,  -631,
    -631,  3196,  -631,   542,  -631,  -631,   189,  -631,   411,  -631,
    2773,  3328,   419,   394,  -631,   436,   561,   336,   645,   535,
    -631,   647,   653,   706,  -631,   652,  -631,   719,   720,   563,
     721,  -631,   678,   681,   724,  -631,   184,   675,   731,  -631,
    -631,   687,   689,   733,   288,   350,   426,   448,   378,   209,
     209,   556,   556,   556,   556,   692,  -631,    30,  -631,  -631,
     632,   632,   632,   625,   625,  -631,  -631,  -631,   722,  -631,
     639,   651,    -8,    18,    23,   686,    11,  -631,  -631,  4212,
    -631,   679,   447,  -631,  -631,    21,  1342,   424,  -631,   740,
     105,  -631,  1342,   752,   749,   390,   424,   704,    60,  -631,
     705,  -631,  2871,  2146,  -631,  -631,  -631,  -631,  -631,  -631,
    -631,  -631,  3592,  1342,  1342,  1031,  -631,   202,   753,  3394,
    -631,  -631,  -631,  3460,   758,   535,  -631,  -631,  -631,   561,
    -631,   763,  -631,  -631,  -631,   166,   561,  -631,   563,  -631,
    -631,  -631,  -631,   561,  -631,  3592,   227,   761,  -631,   761,
    3196,  -631,  -631,   688,  -631,    -8,  -631,    -8,  -631,    -8,
    -631,  1508,  4240,  1342,    21,  -631,  -631,  -631,   758,  1342,
     430,  -631,   716,  -631,  4251,  -631,  1342,   543,  -631,   885,
     770,   319,   319,   745,   399,  -631,  -631,  3592,  -631,  -631,
     460,  3592,   127,   150,  2716,   774,   784,  3526,   787,   788,
    3592,   444,   789,  3592,  1003,  -631,  2260,  -631,  -631,  -631,
    -631,   783,  -631,  -631,  -631,  -631,  -631,   479,   531,  -631,
    -631,  -631,   649,   669,   671,  -631,  -631,  -631,  -631,  1342,
    1342,  -631,  -631,   591,   786,  -631,  -631,   790,  3981,  -631,
    -631,   741,  -631,   485,  -631,  -631,   742,  -631,   744,  -631,
    -631,  -631,  3592,   375,   692,  -631,  -631,   794,   446,   605,
     608,   177,   692,    61,  -631,  -631,  -631,  -631,  -631,  -631,
    1508,  -631,   792,   750,  1342,  -631,  -631,  -631,    71,  4020,
     800,   561,  -631,  1645,  4279,  -631,  -631,   535,   239,  4073,
    -631,  -631,  -631,   755,  2716,   501,  -631,   796,  -631,   802,
     788,   701,  3720,  3592,  -631,   808,  3592,  3592,   810,  3904,
     234,   817,  3592,   813,    30,  -631,  -631,  -631,   815,  -631,
    -631,  -631,  -631,  -631,  -631,   821,  3394,  -631,  -631,  -631,
     817,  4390,  4112,  -631,  -631,  -631,  3658,  -631,   160,  -631,
     203,  -631,  1690,   320,   561,  -631,  -631,   826,  -631,    -8,
    -631,  -631,  -631,   614,   829,  -631,  1342,  -631,  -631,   830,
    4133,  -631,   758,   780,   283,  -631,    26,   410,  -631,  -631,
    -631,  -631,  -631,  1645,  -631,  -631,   811,  -631,  4428,  -631,
    4179,  -631,  -631,  -631,  -631,  3592,  -631,  -631,   838,   835,
    -631,   837,   841,   847,  -631,   849,   853,  -631,   371,  -631,
     165,  -631,   490,   475,   855,   817,   234,  -631,  -631,   793,
     858,  -631,  -631,  -631,  -631,  -631,   296,  -631,   812,    26,
    -631,  -631,   759,  -631,  -631,   410,  -631,  -631,  -631,   860,
    -631,  -631,  -631,   848,  -631,  -631,  1804,   861,   863,  1918,
     865,  -631,  3064,  -631,  -631,   794,  -631,   874,  -631,  -631,
    -631,   862,   759,   759,   780,   780,   283,  2098,  -631,  -631,
    -631,  -631,   828,   879,  -631,  -631,   876,  3592,  3592,  3592,
    3782,  2716,   763,   817,  -631,  3844,  2871,  -631,  -631,  -631,
     807,   793,  2716,   315,   626,   888,  1342,   879,  -631,  3658,
    -631,  -631,  3592,  -631,   882,   319,  3960,  -631,  -631,   759,
     759,   759,   780,  -631,  2032,  -631,  -631,   892,   893,   887,
    -631,  -631,   831,  -631,  -631,  -631,  -631,  1342,   895,  -631,
    -631,  -631,  -631,  4335,   740,  -631,  -631,   890,  -631,   832,
     319,   885,    25,   552,  -631,  -631,  -631,  -631,   759,  -631,
     400,  2374,  2488,   508,   502,   894,  2716,  3782,  2716,  -631,
    -631,   141,   817,   570,  -631,  3196,   897,  -631,    25,   359,
    -631,  -631,   899,   319,  4335,  -631,    46,  -631,  2602,  -631,
      78,   561,   561,  -631,  -631,   841,   917,  -631,  1342,   319,
    -631,  -631,  -631,  -631,  -631,   834,  -631,   886,  -631,  -631,
     -19,  -631,     7,   920,   923,  2716,  -631,  -631,  -631,  -631,
     561,   561,  -631,  -631,  -631,   931,   932,  -631,  -631
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
       0,     0,     0,    45,    47,    81,    82,    83,    48,   194,
     195,     0,     0,   478,   487,     0,     0,     0,     0,     0,
       0,     9,     2,     3,     6,     7,    80,    73,    77,    79,
       5,    78,    75,    76,     0,     8,    74,     0,     0,   324,
       4,   188,   321,   462,     0,    67,    69,   461,   327,   333,
     328,   329,   330,   331,   332,   483,   414,   417,   419,   421,
     423,   425,   427,   435,   430,   438,   442,   445,   449,   450,
     453,   456,   463,   464,   459,     0,   460,     0,   475,     0,
       0,    10,     0,    40,     0,    11,    49,     0,    85,    97,
      85,    85,    46,    11,     9,   462,   470,   328,   329,     0,
     379,     0,   380,   396,     0,   395,     0,     0,     9,   488,
       0,   451,   452,   457,   458,   454,   455,     0,     0,   358,
       0,    70,     0,   473,   342,     0,   341,     0,     0,     0,
     189,   190,     0,     0,     0,   341,    71,     0,   341,     0,
      72,     0,     0,   341,     0,     0,   413,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,   465,   466,   468,   467,
      68,   479,     0,   480,     0,    41,    33,    11,    62,     0,
       0,     0,     0,     0,    50,    51,     0,     0,    95,    86,
       0,     0,   197,     0,   385,     9,     0,     0,     0,   390,
       0,     0,   326,     0,   401,   402,   403,   404,   405,   406,
     407,   408,   409,   410,   411,   412,     0,   469,     0,   485,
     484,     0,   363,     0,   365,   481,   347,   346,     0,   344,
       0,     0,     0,   188,   375,     0,     0,   341,     0,   474,
     354,     0,     0,     0,   193,     0,   191,     0,     0,   341,
       0,   334,     0,     0,     0,   325,     0,     0,     0,   353,
     335,     0,     0,     0,   418,   420,   422,   424,   426,   428,
     429,   431,   432,   433,   434,     0,   436,    67,   320,   437,
     439,   440,   441,   443,   444,   446,   447,   448,     0,    42,
      65,    63,     0,     0,     0,     0,     0,    34,    52,    11,
     211,    92,     0,    88,    91,     0,     0,    97,    99,    98,
     131,   128,     0,     0,   198,   473,    97,     0,   473,   386,
       0,   387,    11,    11,   382,   381,   384,   383,   397,   471,
     489,   364,     0,     0,     0,     0,   343,   350,     0,   161,
     374,   373,   376,     0,   103,   473,   338,   337,   339,     0,
     370,     0,   323,   192,   356,     0,     0,   367,   341,   369,
     372,   322,   357,     0,   368,     0,   155,   233,   153,   232,
       0,    66,    64,     0,    54,     0,    56,     0,    58,     0,
     212,     0,    11,     0,     0,    87,    90,    96,     0,     0,
     136,   132,     0,   199,    11,   196,     0,     0,   142,     0,
       0,   188,   188,     0,   474,   389,   391,     0,   223,   240,
       9,     0,     0,     0,     0,     0,     0,     0,     0,    25,
       0,     0,     0,     0,     0,   239,    11,   225,   228,   234,
     235,     0,   236,   237,   238,   290,   291,   327,   330,   260,
     261,   262,     0,   263,   264,   366,   348,   349,   345,     0,
       0,   377,   166,     0,   162,   163,   165,     0,    11,   336,
     104,     0,   361,   278,   472,   355,     0,   359,     0,   360,
     416,   415,     0,   157,     0,   482,    53,    60,     0,     0,
       0,     0,     0,     0,   218,   219,   217,   214,   216,   213,
       0,   101,    94,     0,     0,    89,    84,   100,   136,    11,
       0,     0,   201,     0,    11,   200,   140,   473,   473,    11,
     139,   393,   392,     0,     0,     0,   246,     0,   248,     0,
       0,     0,   293,     0,   250,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   229,   230,   227,     0,   224,
     226,   241,   351,   352,   159,     0,     0,   378,   105,   112,
      23,     0,    11,   107,   110,   340,     0,   286,     0,   273,
       0,   279,    11,     0,     0,   371,   156,     0,   154,     0,
      55,    57,    59,     0,     0,   215,     0,    93,   133,     0,
      11,   129,   134,     0,     0,   207,     0,     0,   208,   203,
     205,   206,   202,     0,   143,   144,     0,   146,     0,   150,
      11,   148,   394,   259,   242,     0,   247,   249,     0,   295,
     298,     0,   294,     0,   251,     0,     0,   253,    70,   318,
       0,   316,     0,   328,     0,     0,   255,   305,   257,   303,
       0,   254,   231,   160,   164,   111,     0,   115,     0,     0,
     109,   117,   184,   113,   114,     0,   116,   106,   108,   285,
     287,   270,   274,     0,   271,   280,    11,     0,    17,    11,
       0,   283,     0,   362,   158,    61,   209,     0,   102,   130,
     135,     0,   184,   184,     0,     0,     0,     0,   187,   210,
     186,   204,     0,     9,   147,   149,     0,     0,     0,   296,
       0,     0,     0,     0,   314,     0,    11,   313,   306,   256,
     311,   304,     0,   155,     0,     0,     0,     0,   167,     0,
     272,   284,     0,   276,     0,   188,     0,   173,   172,   184,
     184,   184,     0,   145,    11,   151,   243,     0,     0,     0,
     297,   299,   268,   244,   252,   315,   317,     0,     0,   258,
     312,   289,   152,     0,   185,   118,   288,     0,   275,   221,
     188,     0,   473,     0,   176,   171,   168,   170,   184,   120,
     398,    11,    11,   461,     0,     0,     0,   300,     0,   267,
     309,     0,     0,     0,   277,     0,     0,   174,   473,   188,
     182,   179,     0,   188,     0,   169,     0,   121,    11,   122,
     341,     0,     0,   245,   302,   301,     0,   269,     0,   188,
     307,   119,   222,   220,   178,     0,   180,     0,   175,   177,
       0,   123,     0,     0,     0,     0,   310,   308,   183,   181,
       0,     0,   125,   124,   292,     0,     0,   126,   127
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -631,  -631,   461,   213,  -612,   -10,   135,  -631,  -631,  -631,
     898,  -631,    -4,  -631,   816,   889,  -631,  -631,   728,   219,
    -631,   182,   506,  -631,  -390,  -631,   440,  -501,  -631,   519,
     599,  -631,    57,   190,  -631,  -631,  -418,   409,  -498,  -631,
    -631,  -631,   210,  -631,  -631,  -631,  -631,   418,   423,  -631,
    -631,  -631,   417,  -631,  -631,   323,  -631,  -316,   453,  -267,
    -631,  -631,   372,  -631,  -556,  -607,   183,   145,   147,  -383,
     286,   -60,  -166,   154,  -389,   509,  -631,  -631,  -631,  -631,
     343,  -531,  -631,  -631,  -631,  -631,   449,  -631,  -631,  -202,
    -369,  -471,  -631,  -196,  -454,  -631,  -631,  -565,  -631,  -631,
     246,  -631,   382,  -631,   381,   384,  -488,  -631,  -631,  -631,
    -631,  -631,  -631,   178,  -631,  -631,  -631,   317,  -630,  -631,
    -631,  -631,  -626,  -631,  -631,   253,  -631,  -566,   560,  -157,
    -631,  -631,    96,   -85,  -631,   615,   -11,   714,   575,  -272,
    -631,  -631,  -631,  -631,   723,   712,  -113,  -631,  -631,  -631,
     630,  -588,   644,  -631,  -631,   -40,  -631,  -631,   804,   806,
     809,   814,   818,   517,  -631,   386,   434,   512,     4,   659,
     726,  -631,   739,   856,   872,  -631,  -631,  -631,  -631,   -98,
       0,   -24,  -631,   -61,  -631
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short[] yydefgoto_ = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
      -1,    92,   145,   474,    17,    18,    19,    20,    21,    22,
      23,    24,    25,   226,    38,    53,   233,   234,   235,   528,
     342,    94,    95,    96,    54,    55,   688,   239,   352,   353,
     354,   357,   241,   359,   542,   509,   510,   602,   603,   690,
     691,   692,   775,   811,    56,   361,   440,   441,   550,    57,
     366,   447,   448,   560,   650,   651,   693,   419,   418,   502,
     503,   504,   505,   694,   637,   723,   803,   804,   831,   757,
     729,   189,   180,   181,    58,    59,   363,   364,   445,   554,
     639,   536,   641,    60,   350,   432,   537,   538,   826,   475,
     709,   477,   587,   669,   478,   479,   480,   481,   482,   819,
     514,   608,   609,   610,   611,   612,   710,   699,   483,   484,
     485,   661,   779,   662,   846,   486,   750,   676,   677,   788,
     821,   789,   678,   581,   670,   671,   329,    97,    98,    99,
     286,   287,   173,   174,   278,   279,   147,   148,   102,   169,
     273,   103,   104,   283,   284,   149,   150,   151,   247,   248,
     249,   152,   153,   154,   266,   155,   196,   106,   107,   108,
     109,   110,   111,   112,   113,   114,   115,   116,   117,   118,
     119,   120,   121,   122,   123,   124,   125,   156,   126,   442,
     127,    27,   129,   130,   160
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
      26,   105,    40,   159,   476,   590,   282,   660,   186,   417,
     571,   328,   218,   672,   394,   390,    39,   128,   700,    37,
     546,    42,   640,    26,   105,   613,   722,   301,    42,   424,
     100,   179,   178,    42,   426,   310,   406,   178,    26,     1,
     128,   534,   535,     1,     1,   695,   748,    28,     1,   374,
     749,   376,   636,   100,   100,   100,   100,   100,   100,   100,
     186,   649,   413,    28,    35,   170,   170,   178,   178,   161,
     162,   163,   164,   165,   166,   288,   351,   131,     1,     1,
     829,    28,   549,   870,   585,   416,   186,    42,    76,     1,
      77,   182,   695,    78,   182,   182,   170,   170,    79,    48,
     689,   131,   290,    40,   698,    81,   137,   275,    30,   871,
     653,    82,   640,    83,   100,   452,   624,   769,   770,   771,
     703,   748,   707,     1,   790,    86,  -473,   512,   105,   219,
     830,    37,   698,   309,   517,    26,   299,   429,   566,   724,
     425,   519,   636,   250,   128,   427,   182,   689,   300,    49,
     534,   535,   649,    34,   801,    50,   194,   100,    40,     5,
    -473,   568,   848,   635,   638,   808,   701,    51,   299,   744,
     280,   796,   285,   289,    34,   781,   745,   195,    52,   672,
     182,   801,   567,   134,   100,   170,   100,   100,   100,   100,
     100,   100,   100,   100,   100,   100,   849,   100,   100,   100,
     100,   100,   100,   100,   100,   569,    33,   224,   813,   704,
     380,   687,   696,    16,   720,   -32,   623,   335,   336,   337,
     182,   515,   801,   391,   131,   606,    40,    26,   203,   204,
     607,   105,    28,     1,   178,   138,    36,   355,   590,   409,
      39,   205,   206,   139,   146,     1,   178,   128,   131,   190,
     523,    61,   660,   635,   638,   522,    40,     1,   687,   696,
     100,    40,   140,   137,   383,    40,   172,   449,   606,   580,
     453,   291,   292,   607,   410,     2,   141,   499,   588,   632,
     302,   303,   182,   285,   306,     3,   267,   782,   311,   312,
     178,   384,     4,   207,   645,   167,   167,   511,   791,   268,
     674,     1,   520,   178,   500,   177,   604,     6,   136,     8,
       9,    10,   675,    42,     1,    11,    12,   251,   766,    13,
     168,    41,   178,    14,   167,   146,   178,   182,    42,    15,
    -388,    40,   711,     1,   296,   543,   197,     1,   721,   767,
     768,   590,   713,   522,   712,   251,   395,   604,    36,    26,
     714,   753,   277,   221,   340,   170,   246,   604,   222,   525,
     289,   396,   844,   341,   847,   289,   178,   590,   454,   855,
     754,   198,    26,   250,   190,   521,   659,     1,   183,   679,
     105,   184,   178,   397,   185,   280,   805,   806,   807,   326,
     170,   561,   562,     1,  -141,   289,   128,   369,   685,  -141,
     604,   281,   370,   617,   100,   812,   297,   183,     1,   100,
     836,   874,     1,   185,   438,   373,   182,     1,   -70,   170,
     385,   728,   358,   450,   389,   835,   178,   201,   604,   202,
      40,   386,    26,   544,   355,   730,   296,     1,     1,   548,
      61,   549,   838,   393,    26,  -462,  -462,   579,   604,   373,
     379,   182,   182,   199,     1,   619,   434,   620,   183,   449,
     646,   184,    29,   167,   185,   200,    31,   435,    32,   -70,
     170,   236,   564,   747,   178,    28,   250,   187,   223,  -319,
     188,   190,    76,  -266,    77,     1,  -319,    78,  -266,   225,
    -266,    43,    79,   730,    47,   270,   237,   191,   271,    81,
     192,   516,    93,   193,   518,    82,   240,    83,    26,  -486,
     763,  -486,   654,   655,  -486,   191,  -486,   252,   840,    86,
      40,   193,   190,   182,   253,    93,    93,    93,    93,    93,
      93,    93,   325,   182,   371,  -265,    44,    45,   437,   372,
    -265,   784,  -265,   269,   443,   171,   381,   556,   289,    26,
     606,   382,   557,     1,    26,   607,   833,   289,   454,    26,
     175,   834,   431,   176,   167,   496,   497,   277,   673,   863,
     864,   338,   228,   229,   851,   230,   231,   232,   238,   834,
     242,   243,   170,   186,   182,   246,    93,   523,   171,   321,
     322,   323,   324,   304,    28,   294,   305,   594,   875,   876,
     595,    76,    26,    77,   841,   295,    78,   842,   208,   209,
     210,    79,   250,   532,   619,   541,   621,   619,    81,   622,
     850,   547,   307,   524,    82,   716,    83,   339,   555,    93,
      26,   171,   349,   220,   182,   524,   727,   792,    86,   213,
     214,   215,   330,   331,   332,   540,   529,   347,   530,   356,
      26,   367,    42,    46,   211,   212,    93,   553,    93,    93,
      93,    93,    93,    93,    93,    93,    93,    93,   171,    93,
      93,    93,    93,    93,    93,    93,    93,   296,   360,   301,
     365,   592,   593,   310,   132,   133,   182,   190,   362,   727,
     343,   344,   345,   346,   216,   217,    42,   428,    42,   526,
     398,   171,   399,    40,   832,   799,   250,   171,   400,   250,
     401,   171,   190,   327,  -463,  -463,  -464,  -464,   319,   320,
     402,   601,   532,   333,   334,   186,   182,   403,   404,   171,
     832,   405,    93,   406,   673,   532,   407,   408,   190,   412,
     827,   171,   413,   411,   414,   415,    26,   416,   421,   439,
     420,   422,   368,   182,   433,   101,   220,   444,   446,   451,
     455,   501,   601,   508,   852,   182,    26,   643,   513,   856,
     524,   551,   648,   858,   250,   559,   563,   572,   101,   101,
     101,   101,   101,   101,   101,   105,   220,   573,   190,   867,
     576,   577,   582,    26,   591,   596,   605,   614,   597,   615,
     182,   128,   454,   423,    42,   627,   631,   656,   718,   626,
     652,   250,   250,   657,   100,   601,   658,   171,   725,   664,
       2,   667,   373,   171,   681,   532,   682,   683,   454,   182,
       3,   389,   717,   182,    26,   721,   719,     4,   250,   101,
     190,   737,   732,   601,   171,   171,   171,   738,   739,   182,
     740,   741,     6,   742,     8,     9,    10,   743,   746,   674,
      11,    12,   752,   648,    13,   766,   756,   755,    14,   759,
     814,   725,   712,   711,    15,  -286,    93,   761,   765,   274,
     190,    93,   101,   773,   774,   675,   527,   776,   527,   293,
     527,   793,   171,   798,   171,   298,   815,   816,   817,   822,
     171,   824,   825,   308,   818,   843,   313,   171,   853,   101,
     171,   101,   101,   101,   101,   101,   101,   101,   101,   101,
     101,   865,   101,   101,   101,   101,   101,   101,   101,   101,
     857,   872,   860,   487,   873,   171,   862,   533,   358,   868,
      28,   869,   877,   878,   135,     1,   794,    76,   488,    77,
     142,   227,    78,   545,   436,   558,   190,    79,   630,   787,
     171,   171,   348,   375,    81,   377,   628,   795,   684,   820,
      82,   629,    83,   735,   644,   854,   823,   618,   378,   859,
     584,   758,   190,   586,    86,   101,   731,     2,   783,   625,
     702,   705,    29,   388,   706,   845,   751,     3,   786,   314,
     498,   171,   456,   315,     4,   171,   392,   316,     0,     0,
       5,     0,     0,   317,   171,     0,     0,   489,   318,     6,
       0,     8,     9,    10,   487,     0,     0,    11,    12,     0,
     866,    13,   490,     0,     0,    14,   487,     0,     0,   488,
     668,    15,     0,     0,     0,     0,   533,     0,     0,     1,
     220,   488,     0,     0,     0,     0,     0,   276,    28,   634,
       0,   -43,   171,     0,     0,    76,     0,    77,     0,     0,
      78,    49,     0,     0,     0,    79,     0,    50,   327,     1,
     715,     0,    81,     0,     0,   327,    28,   171,    82,    51,
      83,     0,     0,    76,   495,    77,     0,   171,    78,   491,
      52,   506,    86,    79,   171,   507,     0,   686,   489,   171,
      81,     0,   492,     0,     0,   325,    82,     0,    83,     0,
     489,     2,     0,   490,   487,     0,     0,     0,     0,   101,
      86,     3,   487,     0,   101,   490,     0,     0,     4,   488,
       1,   170,   726,     0,     5,     0,     0,   488,     0,   634,
     171,     0,     0,     6,   686,     8,     9,    10,     0,     0,
       0,    11,    12,     0,     0,    13,     0,     0,     0,    14,
       0,     0,   487,   565,     0,    15,     0,    28,     0,   575,
       0,     0,   578,     0,    76,   583,    77,   488,   171,    78,
     491,     0,     0,     0,    79,   726,     0,     0,     0,     0,
       0,    81,   491,   492,     0,     0,   668,    82,   489,    83,
       0,     0,     0,     0,     0,   492,   489,   171,     0,     0,
       0,    86,     0,   490,     0,     0,     0,   171,     0,   493,
       0,   490,     0,   220,   616,   810,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   494,     0,     0,   171,     0,
       0,   327,     0,     0,   171,     0,   489,     0,     0,     0,
       0,     0,   171,     0,     0,     0,   487,     0,     0,   487,
       0,   490,   802,     0,     0,     0,     0,     0,     0,     0,
       0,   488,     0,     0,   488,   663,    93,     0,   665,   666,
     491,     0,     0,   101,   680,   171,     0,     0,   491,   802,
     487,   487,     0,   492,     0,     0,     0,   828,   506,   171,
       0,   492,   487,     0,     0,   488,   488,     0,     0,     0,
     493,     0,     0,     0,     0,     0,     0,   488,     0,     0,
       0,     0,   493,     0,   487,     0,   494,     0,   491,     0,
     802,     0,     0,     0,     0,     0,     0,     0,   494,   488,
     489,   492,     0,   489,     0,     0,     0,     0,     0,     0,
       1,     0,     0,     0,     0,   490,     0,   736,   490,     0,
       0,   487,   487,     0,     0,     0,   487,   487,   487,     0,
       0,     0,     0,     0,   489,   489,   488,   488,     0,     0,
       0,   488,   488,   488,     0,     0,   489,    28,   487,   490,
     490,     0,     0,     0,    76,     0,    77,     0,     0,    78,
       0,   490,     0,   488,    79,     0,     0,     0,   489,     0,
     493,    81,     0,     0,   764,   487,     0,    82,   493,    83,
       0,     0,   491,   490,     0,   491,   494,     0,     0,     0,
     488,    86,     0,     0,   494,   492,     0,     0,   492,   777,
     778,   780,     0,     0,     0,   489,   489,     0,     0,   101,
     489,   489,   489,     0,     0,     0,   491,   491,   493,     0,
     490,   490,     0,     0,   797,   490,   490,   490,   491,   492,
     492,     0,   489,     0,   494,     0,     0,     0,     0,     0,
       0,   492,     0,     0,     0,     0,     0,   490,     0,     0,
     491,     0,     0,     0,     0,     0,     0,     0,     0,   489,
       0,     0,     0,   492,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   490,     0,   531,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   491,   491,   101,
     -29,     0,   491,   491,   491,     0,     0,     0,     0,     0,
     492,   492,     0,     0,     0,   492,   492,   492,     1,     0,
       0,   -44,   493,    28,   491,   493,     0,     0,     0,     0,
      76,     0,    77,     0,     0,    78,    49,   492,   494,     1,
      79,   494,    50,     0,     0,     0,     0,    81,     0,     0,
       0,   491,     0,    82,    51,    83,   493,   493,     0,     0,
       2,     0,     0,     0,   492,    52,     0,    86,   493,     0,
       3,     0,   494,   494,     0,     0,     0,     4,     0,     0,
       0,     2,     0,     5,   494,     0,     0,     0,   -11,     0,
     493,     3,     6,     7,     8,     9,    10,     0,     4,     0,
      11,    12,     0,     0,    13,     0,   494,     0,    14,     0,
       0,     0,     0,     6,    15,     8,     9,    10,     0,     0,
       0,    11,    12,   531,   237,    13,     0,   493,   493,    14,
       0,     0,   493,   493,   493,    15,     0,     0,     0,     0,
       0,     0,     0,   494,   494,     0,     0,     0,   494,   494,
     494,     0,     0,   457,   493,   373,  -281,     0,     0,     0,
      28,   459,     0,     0,     0,     0,     0,    76,     1,    77,
     494,     0,    78,    49,     0,     0,     0,    79,     0,    50,
       0,   493,     0,     0,    81,     0,     0,     0,     0,     0,
      82,    51,    83,     0,     0,    69,    70,   494,     0,     0,
       0,     0,    52,     0,    86,   460,    72,    73,    74,    75,
       2,   461,    76,   462,    77,   606,     0,    78,   633,   463,
     708,   464,    79,     0,     0,     0,    80,     4,     0,    81,
     465,   466,     0,     0,     0,    82,     0,    83,     0,     0,
      84,    85,     6,     0,     8,     9,    10,     0,   467,    86,
      11,    12,    87,   468,   469,    89,   470,     0,    14,     0,
      90,   471,     0,    91,    15,   472,   473,   457,     0,   373,
     760,     0,     0,     0,     0,   459,     0,  -399,     0,     0,
       0,     0,     1,  -399,  -399,  -399,  -399,  -399,  -399,  -399,
    -399,  -399,  -399,  -399,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    69,
      70,     0,     0,     0,     0,     0,     0,     0,     0,   460,
      72,    73,    74,    75,     2,   461,    76,   462,    77,   606,
       0,    78,     0,   463,   708,   464,    79,     0,     0,     0,
      80,     4,     0,    81,   465,   466,     0,     0,     0,    82,
       0,    83,     0,     0,    84,    85,     6,     0,     8,     9,
      10,     0,   467,    86,    11,    12,    87,   468,   469,    89,
     470,     0,    14,     0,    90,   471,     0,    91,    15,   472,
     473,   457,     0,   373,  -282,     0,     0,     0,     0,   459,
       0,  -400,     0,     0,     0,     0,     1,  -400,  -400,  -400,
    -400,  -400,  -400,  -400,  -400,  -400,  -400,  -400,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    69,    70,     0,     0,     0,     0,     0,
       0,     0,     0,   460,    72,    73,    74,    75,     2,   461,
      76,   462,    77,  -282,     0,    78,     0,   463,     3,   464,
      79,     0,     0,     0,    80,     4,     0,    81,   465,   466,
       0,     0,     0,    82,     0,    83,     0,     0,    84,    85,
       6,     0,     8,     9,    10,     0,   467,    86,    11,    12,
      87,   468,   469,    89,   470,     0,    14,     0,    90,   471,
       0,    91,    15,   472,   473,   457,     0,   373,   809,     0,
       0,     0,     0,   459,     0,     0,   254,     0,     0,     0,
       1,   170,   255,   256,   257,   258,   259,   260,   261,   262,
     263,   264,   265,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    69,    70,     0,
       0,     0,     0,     0,     0,     0,     0,   460,    72,    73,
      74,    75,     2,   461,    76,   462,    77,     0,     0,    78,
       0,   463,     3,   464,    79,     0,     0,     0,    80,     4,
       0,    81,   465,   466,     0,     0,     1,    82,     0,    83,
       0,     0,    84,    85,     6,     0,     8,     9,    10,     0,
     467,    86,    11,    12,    87,   468,   469,    89,   470,     0,
      14,     0,    90,   471,     0,    91,    15,   472,   473,   457,
       0,   373,   458,    28,     0,     0,     0,   459,     0,     0,
      76,     0,    77,     0,     1,    78,     0,     0,     0,     0,
      79,     0,     0,     0,     0,     0,     0,    81,     0,     0,
       0,     0,     0,    82,     0,    83,     0,     0,     0,     0,
       0,    69,    70,     0,     0,     0,     0,    86,     0,     0,
       0,   460,    72,    73,    74,    75,     2,   461,    76,   462,
      77,   772,     0,    78,     0,   463,     3,   464,    79,     0,
       0,     0,    80,     4,     0,    81,   465,   466,     0,     0,
       0,    82,     0,    83,     0,     0,    84,    85,     6,     0,
       8,     9,    10,     0,   467,    86,    11,    12,    87,   468,
     469,    89,   470,     0,    14,     0,    90,   471,     0,    91,
      15,   472,   473,   457,     0,   373,   589,     0,     0,     0,
       0,   459,     0,     0,     0,     0,     0,     0,     1,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,    69,    70,     0,     0,     0,
       0,     0,     0,     0,     0,   460,    72,    73,    74,    75,
       2,   461,    76,   462,    77,     0,     0,    78,     0,   463,
       3,   464,    79,     0,     0,     0,    80,     4,     0,    81,
     465,   466,     0,     0,     0,    82,     0,    83,     0,     0,
      84,    85,     6,     0,     8,     9,    10,     0,   467,    86,
      11,    12,    87,   468,   469,    89,   470,     0,    14,     0,
      90,   471,     0,    91,    15,   472,   473,   457,     0,   373,
     837,     0,     0,     0,     0,   459,     0,     0,     0,     0,
       0,     0,     1,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    69,
      70,     0,     0,     0,     0,     0,     0,     0,     0,   460,
      72,    73,    74,    75,     2,   461,    76,   462,    77,     0,
       0,    78,     0,   463,     3,   464,    79,     0,     0,     0,
      80,     4,     0,    81,   465,   466,     0,     0,     0,    82,
       0,    83,     0,     0,    84,    85,     6,     0,     8,     9,
      10,     0,   467,    86,    11,    12,    87,   468,   469,    89,
     470,     0,    14,     0,    90,   471,     0,    91,    15,   472,
     473,   457,     0,   373,   839,     0,     0,     0,     0,   459,
       0,     0,     0,     0,     0,     0,     1,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    69,    70,     0,     0,     0,     0,     0,
       0,     0,     0,   460,    72,    73,    74,    75,     2,   461,
      76,   462,    77,     0,     0,    78,     0,   463,     3,   464,
      79,     0,     0,     0,    80,     4,     0,    81,   465,   466,
       0,     0,     0,    82,     0,    83,     0,     0,    84,    85,
       6,     0,     8,     9,    10,     0,   467,    86,    11,    12,
      87,   468,   469,    89,   470,     0,    14,     0,    90,   471,
       0,    91,    15,   472,   473,   457,     0,   373,   861,     0,
       0,     0,     0,   459,     0,     0,     0,     0,     0,     0,
       1,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    69,    70,     0,
       0,     0,     0,     0,     0,     0,     0,   460,    72,    73,
      74,    75,     2,   461,    76,   462,    77,     0,     0,    78,
       0,   463,     3,   464,    79,     0,     0,     0,    80,     4,
       0,    81,   465,   466,     0,     0,     0,    82,     0,    83,
       0,     0,    84,    85,     6,     0,     8,     9,    10,     0,
     467,    86,    11,    12,    87,   468,   469,    89,   470,     0,
      14,     0,    90,   471,     0,    91,    15,   472,   473,   457,
       0,   373,     0,     0,     0,     0,     0,   459,     0,     0,
       0,     0,     0,     0,     1,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,    69,    70,     0,     0,     0,     0,     0,     0,     0,
       0,   460,    72,    73,    74,    75,     0,   461,    76,   462,
      77,     0,     0,    78,     0,   463,     0,   464,    79,     0,
       0,     1,    80,     0,     0,    81,   465,   466,     0,   387,
       0,    82,     0,    83,     0,     0,    84,    85,     0,     0,
       0,     0,     0,     0,   467,    86,     0,     0,    87,   468,
     570,    89,   470,   143,   244,     0,    90,   471,    28,    91,
       0,   472,   473,     0,     0,    76,     0,    77,     1,     0,
      78,     0,    65,    66,     0,    79,     0,     0,     0,    67,
      68,     0,    81,     0,     0,     0,     0,     0,    82,     0,
      83,     0,     0,     0,     0,    69,    70,     0,     0,     0,
       0,     0,    86,     0,     0,   245,    72,    73,    74,    75,
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
       0,     0,     0,   158,    72,    73,    74,    75,     0,     0,
      76,     0,    77,     0,     0,    78,     0,   143,     0,   373,
      79,     0,     0,     0,    80,     0,     0,    81,     0,     0,
       0,     0,     1,    82,     0,    83,    65,    66,    84,    85,
       0,     0,     0,    67,    68,     0,     0,    86,     0,     0,
      87,    88,     0,    89,     0,     0,     0,     0,    90,    69,
      70,    91,     0,     0,     0,     0,     0,     0,     0,   144,
      72,    73,    74,    75,     0,     0,    76,     0,    77,     0,
       0,    78,     0,   143,   272,     0,    79,     0,     0,     0,
      80,     0,     0,    81,     0,     0,     0,     0,     1,    82,
       0,    83,    65,    66,    84,    85,     0,     0,     0,    67,
      68,     0,     0,    86,     0,     0,    87,    88,     0,    89,
     762,     0,     0,     0,    90,    69,    70,    91,     0,     0,
       0,     0,     0,     0,     0,   144,    72,    73,    74,    75,
       0,     0,    76,     0,    77,     0,     0,    78,     0,    62,
       0,    64,    79,     0,     0,     0,    80,     0,     0,    81,
       0,     0,     0,     0,     1,    82,     0,    83,    65,    66,
      84,    85,     0,     0,     0,    67,    68,     0,     0,    86,
       0,     0,    87,    88,     0,    89,     0,     0,     0,     0,
      90,    69,    70,    91,     0,     0,     0,     0,     0,     0,
       0,   158,    72,    73,    74,    75,     0,     0,    76,     0,
      77,     0,     0,    78,     0,   143,     0,   373,    79,     0,
       0,     0,    80,     0,     0,    81,     0,     0,     0,     0,
       1,    82,     0,    83,    65,    66,    84,    85,     0,     0,
       0,    67,    68,     0,     0,    86,     0,     0,    87,    88,
       0,    89,     0,     0,     0,     0,    90,    69,    70,    91,
       0,     0,     0,     0,     0,     0,     0,   144,    72,    73,
      74,    75,     0,     0,    76,     0,    77,     0,     0,    78,
       0,   143,     0,     0,    79,     0,   294,     0,    80,     0,
       0,    81,     0,     0,     0,     0,     1,    82,     0,    83,
      65,    66,    84,    85,     0,     0,     0,    67,    68,     0,
       0,    86,     0,     0,    87,    88,     0,    89,     0,     0,
       0,     0,    90,    69,    70,    91,     0,     0,     0,     0,
       0,     0,     0,   144,    72,    73,    74,    75,     0,     0,
      76,     0,    77,     0,     0,    78,     0,   143,     0,   389,
      79,     0,     0,     0,    80,     0,     0,    81,     0,     0,
       0,     0,     1,    82,     0,    83,    65,    66,    84,    85,
       0,     0,     0,    67,    68,     0,     0,    86,     0,     0,
      87,    88,     0,    89,     0,     0,     0,     0,    90,    69,
      70,    91,     0,     0,     0,     0,     0,     0,     0,   144,
      72,    73,    74,    75,     0,     0,    76,     0,    77,     0,
       0,    78,     0,   143,     0,     0,    79,     0,   403,     0,
      80,     0,     0,    81,     0,     0,     0,     0,     1,    82,
       0,    83,    65,    66,    84,    85,     0,     0,     0,    67,
      68,     0,     0,    86,     0,     0,    87,    88,     0,    89,
       0,     0,     0,     0,    90,    69,    70,    91,     0,     0,
       0,     0,     0,     0,     0,   144,    72,    73,    74,    75,
       0,     0,    76,     0,    77,     0,     0,    78,     0,   143,
       0,     0,    79,     0,     0,     0,    80,   574,     0,    81,
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
       0,     0,     0,   158,    72,    73,    74,    75,     0,     0,
      76,     0,    77,   457,     0,    78,     0,     0,     0,     0,
      79,     0,     0,     0,    80,     0,     0,    81,     1,     0,
       0,     0,     0,    82,     0,    83,     0,     0,    84,    85,
       0,     0,     0,     0,     0,     0,     0,    86,     0,     0,
      87,    88,     0,    89,     0,    69,    70,     0,    90,     0,
       0,    91,     0,     0,     0,   158,    72,    73,    74,    75,
       0,     0,    76,     0,    77,   457,     0,    78,     0,     0,
       0,     0,    79,     0,     0,     0,    80,     0,     0,    81,
       1,     0,     0,     0,     0,    82,     0,    83,     0,     0,
      84,    85,     0,     0,     0,     0,     0,     0,     0,    86,
       0,     0,    87,     0,     0,    89,     0,    69,    70,     0,
      90,     0,   325,    91,     0,     0,     0,   158,    72,    73,
      74,    75,     0,     0,    76,     0,    77,   457,   785,    78,
       0,     0,     0,     0,    79,     0,     0,     0,    80,     0,
       0,    81,     1,     0,     0,     0,     0,    82,     0,    83,
       0,     0,    84,    85,     0,     0,     0,     0,     0,     0,
       0,    86,     0,     0,    87,     0,     0,    89,     0,     0,
       0,     0,    90,     0,     0,    91,     0,     0,     0,   158,
      72,    73,    74,    75,     0,     0,    76,   457,    77,     0,
       0,    78,     0,     0,     0,     0,    79,     0,     0,     0,
      80,     0,     1,    81,     0,     0,     0,     0,     0,    82,
       0,    83,     0,     0,    84,    85,     0,     0,     0,     0,
       0,     0,     0,    86,     0,     0,    87,     0,     0,    89,
       0,     0,     0,     0,    90,     0,   325,    91,     0,   158,
      72,    73,    74,    75,   800,     0,    76,     0,    77,     0,
       0,    78,     0,     0,     0,     0,    79,     0,     1,     0,
      80,     0,     0,    81,     0,     0,   373,   598,     0,    82,
       0,    83,   599,     0,    84,    85,     0,     0,     0,     1,
       0,     0,     0,    86,     0,     0,    87,     0,     0,    89,
       0,     0,     0,     0,    90,    28,   325,    91,     0,     0,
       2,     0,    76,     0,    77,   373,  -137,    78,     0,     0,
       3,   599,    79,     0,     0,     0,     0,     4,     1,    81,
       0,     2,     0,     0,     0,    82,     0,    83,     0,     0,
       0,     3,     6,     0,     8,     9,    10,     0,     4,    86,
      11,    12,     0,     0,    13,     0,     0,     0,    14,     0,
       0,     0,     0,     6,    15,     8,     9,    10,   373,   647,
       2,   600,    12,     0,   599,    13,     0,     0,     0,    14,
       3,     1,     0,     0,     0,    15,     0,     4,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     6,     0,     8,     9,    10,   373,   697,     0,
     600,    12,     0,   599,    13,     0,     0,     0,    14,     0,
       1,     0,     0,     2,    15,     0,     0,     0,   373,  -138,
       0,     0,     0,     3,   599,     0,     0,     0,     0,     0,
       4,     1,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     6,     0,     8,     9,    10,
       0,     0,     2,   600,    12,     0,     0,    13,     0,     0,
       0,    14,     3,     0,   373,   734,     0,    15,     0,     4,
     599,     0,     0,     2,     0,     0,     0,     1,     0,     0,
       0,     0,     0,     3,     6,     0,     8,     9,    10,     0,
       4,     0,   600,    12,     0,     0,    13,     0,   430,     0,
      14,     0,     0,     0,     0,     6,    15,     8,     9,    10,
       1,     0,     0,   600,    12,     0,     0,    13,     0,     2,
       0,    14,     0,     0,     0,     0,   539,    15,     0,     3,
       0,     0,     0,     0,     0,     0,     4,   552,     1,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     1,
       0,     6,     2,     8,     9,    10,     0,     0,     0,   600,
      12,     0,     3,    13,     0,   642,     0,    14,     0,     4,
       0,     0,     0,    15,     0,     0,     0,     1,     0,     0,
       2,     0,     0,     0,     6,     0,     8,     9,    10,     0,
       3,     2,    11,    12,     0,     0,    13,     4,     0,     0,
      14,     3,     0,     0,     0,     0,    15,     0,     4,     0,
       0,     0,     6,     0,     8,     9,    10,     0,     0,     2,
      11,    12,     0,     6,    13,     8,     9,    10,    14,     3,
       0,    11,    12,     1,    15,    13,     4,     0,     0,    14,
       0,     0,     0,     0,     0,    15,     0,     0,     0,     0,
       0,     6,     0,     8,     9,    10,     0,     0,     0,    11,
      12,     0,     0,    13,     0,     0,     0,    14,     0,     0,
      28,     0,     0,    15,     0,     2,     0,    76,     0,    77,
       0,     0,    78,     0,     0,     3,     0,    79,    48,   237,
       0,     0,     4,     0,    81,     0,     0,     0,     0,     0,
      82,     0,    83,     0,     0,     0,     0,     6,     0,     8,
       9,    10,     0,     0,    86,    11,    12,     0,     0,    13,
       0,     0,     0,    14,     0,    28,    48,   237,     0,    15,
       0,     0,    76,     0,    77,     0,     0,    78,    49,     0,
       0,     0,    79,     0,    50,     0,     0,     0,     0,    81,
       0,     0,     0,     0,     0,    82,    51,    83,     0,     0,
       0,     0,     0,   733,     0,     0,     0,    52,     0,    86,
      76,     0,    77,     0,     0,    78,    49,     0,     0,     0,
      79,     0,    50,   633,     0,     0,     0,    81,     0,     0,
       0,     0,     0,    82,    51,    83,     0,     0,     0,     0,
     -70,     0,     0,   183,     0,    52,   184,    86,     0,   185,
       0,     0,     0,   -70,   -70,   170,     0,     0,     0,     0,
       0,   633,     0,     0,  -398,     0,     0,     0,     0,     0,
    -398,  -398,  -398,  -398,  -398,  -398,  -398,  -398,  -398,  -398,
    -398,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,   -70
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
       0,    41,    26,    64,   373,   476,   172,   572,    93,   325,
     464,   207,   125,   579,   286,   282,    26,    41,   606,    23,
     438,    10,   553,    23,    64,   513,   633,   184,    10,    11,
      41,    91,     7,    10,    11,   192,    55,     7,    38,    18,
      64,   431,   431,    18,    18,   601,   676,    55,    18,   251,
     676,   253,   553,    64,    65,    66,    67,    68,    69,    70,
     145,   559,    55,    55,     0,    19,    19,     7,     7,    65,
      66,    67,    68,    69,    70,   173,    55,    55,    18,    18,
      55,    55,    11,   102,   474,    55,   171,    10,    62,    18,
      64,    91,   648,    67,    94,    95,    19,    19,    72,    18,
     601,    55,    55,   127,   602,    79,    86,   168,   100,   102,
     564,    85,   643,    87,   125,    55,    55,   724,   725,   726,
     608,   751,   610,    18,   750,    99,    55,   399,   168,   125,
     105,   135,   630,    55,   406,   135,    90,   126,    11,   113,
     122,   413,   643,   143,   168,   122,   146,   648,   102,    68,
     540,   540,   650,    18,   766,    74,    26,   168,   182,    83,
      55,    11,    21,   553,   553,   772,     6,    86,    90,     4,
     170,   759,   172,   173,    39,   740,    11,    47,    97,   745,
     180,   793,    55,    14,   195,    19,   197,   198,   199,   200,
     201,   202,   203,   204,   205,   206,    55,   208,   209,   210,
     211,   212,   213,   214,   215,    55,    88,    14,   774,     6,
     271,   601,   601,     0,   632,     0,   532,   213,   214,   215,
     220,    55,   834,   283,    55,    65,   250,   227,    19,    20,
      70,   271,    55,    18,     7,    55,    23,   237,   709,    55,
     250,    32,    33,    55,    62,    18,     7,   271,    55,    95,
     416,    38,   817,   643,   643,    28,   280,    18,   648,   648,
     271,   285,    55,    86,    75,   289,    84,   365,    65,   471,
     368,   175,   176,    70,    90,    60,    55,    75,   474,   551,
     184,   185,   282,   283,   188,    70,     4,   741,   192,   193,
       7,   102,    77,    84,    55,     3,     3,   395,   752,    17,
      66,    18,   415,     7,   102,     3,   508,    92,     5,    94,
      95,    96,    78,    10,    18,   100,   101,    24,     3,   104,
      28,     3,     7,   108,     3,   143,     7,   327,    10,   114,
       9,   355,    12,    18,   180,   433,    48,    18,    55,   722,
     723,   812,   614,    28,    24,    24,    10,   549,   135,   349,
     617,    55,   170,     4,   100,    19,   143,   559,     9,   420,
     360,    25,   816,   109,   818,   365,     7,   838,   368,    10,
     686,    21,   372,   373,   220,   415,   572,    18,     7,   581,
     420,    10,     7,   287,    13,   385,   769,   770,   771,   207,
      19,   451,   452,    18,     4,   395,   420,     4,   600,     9,
     602,     7,     9,    28,   415,   774,     7,     7,    18,   420,
      10,   865,    18,    13,   357,     5,   416,    18,    18,    19,
       9,    11,   240,   366,     5,   808,     7,    49,   630,    51,
     454,    20,   432,   433,   434,   637,   282,    18,    18,     9,
     227,    11,   811,     7,   444,    45,    46,     3,   650,     5,
     268,   451,   452,    27,    18,     9,     9,    11,     7,   557,
     558,    10,     1,     3,    13,    17,     5,    20,     7,    18,
      19,    55,    12,   675,     7,    55,   476,    10,     4,     4,
      13,   327,    62,     4,    64,    18,    11,    67,     9,    11,
      11,    30,    72,   695,    33,     6,    19,     7,     9,    79,
      10,   405,    41,    13,   408,    85,    82,    87,   508,     4,
     712,     6,    11,    12,     9,     7,    11,     4,    10,    99,
     544,    13,   368,   523,    24,    64,    65,    66,    67,    68,
      69,    70,   112,   533,     4,     4,    10,    11,   356,     9,
       9,   743,    11,     6,   362,    84,     4,     4,   548,   549,
      65,     9,     9,    18,   554,    70,     4,   557,   558,   559,
      10,     9,   349,    13,     3,   383,   384,   385,   579,   841,
     842,    55,   120,   121,     4,   123,   124,   125,   138,     9,
     140,   141,    19,   668,   584,   372,   125,   753,   127,   203,
     204,   205,   206,   102,    55,     8,   105,     6,   870,   871,
       9,    62,   602,    64,   102,    10,    67,   105,    52,    53,
      54,    72,   612,   431,     9,   433,    11,     9,    79,    11,
     822,   439,    10,     9,    85,    11,    87,    11,   446,   168,
     630,   170,     5,   127,   634,     9,   636,    11,    99,    14,
      15,    16,   208,   209,   210,   432,   427,     6,   429,    75,
     650,   112,    10,    11,    22,    23,   195,   444,   197,   198,
     199,   200,   201,   202,   203,   204,   205,   206,   207,   208,
     209,   210,   211,   212,   213,   214,   215,   523,     5,   836,
       3,   499,   500,   840,    10,    11,   686,   533,    75,   689,
     229,   230,   231,   232,    45,    46,    10,    11,    10,    11,
      55,   240,    55,   727,   802,   765,   706,   246,    55,   709,
       4,   250,   558,   207,    45,    46,    45,    46,   201,   202,
      68,   508,   540,   211,   212,   810,   726,     8,     8,   268,
     828,    10,   271,    55,   745,   553,    55,    13,   584,     8,
     800,   280,    55,    68,    55,    12,   746,    55,   109,     9,
      28,   100,   246,   753,    75,    41,   250,     5,     9,    55,
      55,     8,   549,     5,   825,   765,   766,   554,     5,   829,
       9,    55,   559,   833,   774,     5,    31,     3,    64,    65,
      66,    67,    68,    69,    70,   825,   280,     3,   634,   849,
       3,     3,     3,   793,    11,     9,    55,    55,     8,    55,
     800,   825,   802,   342,    10,    55,     6,    11,   626,    17,
      55,   811,   812,    11,   825,   602,   115,   356,   636,    11,
      60,    11,     5,   362,    11,   643,    11,     6,   828,   829,
      70,     5,     3,   833,   834,    55,     6,    77,   838,   125,
     686,     3,    31,   630,   383,   384,   385,    12,    11,   849,
       9,     4,    92,     4,    94,    95,    96,     4,     3,    66,
     100,   101,     4,   650,   104,     3,   107,    55,   108,     9,
     774,   689,    24,    12,   114,    12,   415,    12,     4,   167,
     726,   420,   168,    55,     5,    78,   425,    11,   427,   177,
     429,     3,   431,    11,   433,   183,     4,     4,    11,     4,
     439,    11,    70,   191,    73,    11,   194,   446,    11,   195,
     449,   197,   198,   199,   200,   201,   202,   203,   204,   205,
     206,     4,   208,   209,   210,   211,   212,   213,   214,   215,
      31,    11,   836,   373,    11,   474,   840,   431,   756,   105,
      55,    55,    11,    11,    46,    18,   756,    62,   373,    64,
      61,   135,    67,   434,   355,   449,   802,    72,   549,   746,
     499,   500,   234,   251,    79,   253,   548,   757,   596,   787,
      85,   548,    87,   650,   557,   828,   793,   524,   266,   834,
     474,   695,   828,   474,    99,   271,   643,    60,   742,   540,
     608,   610,   531,   281,   610,   817,   679,    70,   745,   195,
     385,   540,   372,   197,    77,   544,   283,   198,    -1,    -1,
      83,    -1,    -1,   199,   553,    -1,    -1,   373,   200,    92,
      -1,    94,    95,    96,   464,    -1,    -1,   100,   101,    -1,
     848,   104,   373,    -1,    -1,   108,   476,    -1,    -1,   464,
     579,   114,    -1,    -1,    -1,    -1,   540,    -1,    -1,    18,
     544,   476,    -1,    -1,    -1,    -1,    -1,    26,    55,   553,
      -1,     0,   601,    -1,    -1,    62,    -1,    64,    -1,    -1,
      67,    68,    -1,    -1,    -1,    72,    -1,    74,   572,    18,
     619,    -1,    79,    -1,    -1,   579,    55,   626,    85,    86,
      87,    -1,    -1,    62,   382,    64,    -1,   636,    67,   373,
      97,   389,    99,    72,   643,   393,    -1,   601,   464,   648,
      79,    -1,   373,    -1,    -1,   112,    85,    -1,    87,    -1,
     476,    60,    -1,   464,   564,    -1,    -1,    -1,    -1,   415,
      99,    70,   572,    -1,   420,   476,    -1,    -1,    77,   564,
      18,    19,   636,    -1,    83,    -1,    -1,   572,    -1,   643,
     689,    -1,    -1,    92,   648,    94,    95,    96,    -1,    -1,
      -1,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,
      -1,    -1,   612,   461,    -1,   114,    -1,    55,    -1,   467,
      -1,    -1,   470,    -1,    62,   473,    64,   612,   727,    67,
     464,    -1,    -1,    -1,    72,   689,    -1,    -1,    -1,    -1,
      -1,    79,   476,   464,    -1,    -1,   745,    85,   564,    87,
      -1,    -1,    -1,    -1,    -1,   476,   572,   756,    -1,    -1,
      -1,    99,    -1,   564,    -1,    -1,    -1,   766,    -1,   373,
      -1,   572,    -1,   727,   522,   774,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,   373,    -1,    -1,   787,    -1,
      -1,   745,    -1,    -1,   793,    -1,   612,    -1,    -1,    -1,
      -1,    -1,   801,    -1,    -1,    -1,   706,    -1,    -1,   709,
      -1,   612,   766,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,   706,    -1,    -1,   709,   573,   825,    -1,   576,   577,
     564,    -1,    -1,   579,   582,   834,    -1,    -1,   572,   793,
     740,   741,    -1,   564,    -1,    -1,    -1,   801,   596,   848,
      -1,   572,   752,    -1,    -1,   740,   741,    -1,    -1,    -1,
     464,    -1,    -1,    -1,    -1,    -1,    -1,   752,    -1,    -1,
      -1,    -1,   476,    -1,   774,    -1,   464,    -1,   612,    -1,
     834,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   476,   774,
     706,   612,    -1,   709,    -1,    -1,    -1,    -1,    -1,    -1,
      18,    -1,    -1,    -1,    -1,   706,    -1,   655,   709,    -1,
      -1,   811,   812,    -1,    -1,    -1,   816,   817,   818,    -1,
      -1,    -1,    -1,    -1,   740,   741,   811,   812,    -1,    -1,
      -1,   816,   817,   818,    -1,    -1,   752,    55,   838,   740,
     741,    -1,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,   752,    -1,   838,    72,    -1,    -1,    -1,   774,    -1,
     564,    79,    -1,    -1,   712,   865,    -1,    85,   572,    87,
      -1,    -1,   706,   774,    -1,   709,   564,    -1,    -1,    -1,
     865,    99,    -1,    -1,   572,   706,    -1,    -1,   709,   737,
     738,   739,    -1,    -1,    -1,   811,   812,    -1,    -1,   745,
     816,   817,   818,    -1,    -1,    -1,   740,   741,   612,    -1,
     811,   812,    -1,    -1,   762,   816,   817,   818,   752,   740,
     741,    -1,   838,    -1,   612,    -1,    -1,    -1,    -1,    -1,
      -1,   752,    -1,    -1,    -1,    -1,    -1,   838,    -1,    -1,
     774,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   865,
      -1,    -1,    -1,   774,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,   865,    -1,    18,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,   811,   812,   825,
       0,    -1,   816,   817,   818,    -1,    -1,    -1,    -1,    -1,
     811,   812,    -1,    -1,    -1,   816,   817,   818,    18,    -1,
      -1,     0,   706,    55,   838,   709,    -1,    -1,    -1,    -1,
      62,    -1,    64,    -1,    -1,    67,    68,   838,   706,    18,
      72,   709,    74,    -1,    -1,    -1,    -1,    79,    -1,    -1,
      -1,   865,    -1,    85,    86,    87,   740,   741,    -1,    -1,
      60,    -1,    -1,    -1,   865,    97,    -1,    99,   752,    -1,
      70,    -1,   740,   741,    -1,    -1,    -1,    77,    -1,    -1,
      -1,    60,    -1,    83,   752,    -1,    -1,    -1,    88,    -1,
     774,    70,    92,    93,    94,    95,    96,    -1,    77,    -1,
     100,   101,    -1,    -1,   104,    -1,   774,    -1,   108,    -1,
      -1,    -1,    -1,    92,   114,    94,    95,    96,    -1,    -1,
      -1,   100,   101,    18,    19,   104,    -1,   811,   812,   108,
      -1,    -1,   816,   817,   818,   114,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,   811,   812,    -1,    -1,    -1,   816,   817,
     818,    -1,    -1,     3,   838,     5,     6,    -1,    -1,    -1,
      55,    11,    -1,    -1,    -1,    -1,    -1,    62,    18,    64,
     838,    -1,    67,    68,    -1,    -1,    -1,    72,    -1,    74,
      -1,   865,    -1,    -1,    79,    -1,    -1,    -1,    -1,    -1,
      85,    86,    87,    -1,    -1,    45,    46,   865,    -1,    -1,
      -1,    -1,    97,    -1,    99,    55,    56,    57,    58,    59,
      60,    61,    62,    63,    64,    65,    -1,    67,   113,    69,
      70,    71,    72,    -1,    -1,    -1,    76,    77,    -1,    79,
      80,    81,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,
      90,    91,    92,    -1,    94,    95,    96,    -1,    98,    99,
     100,   101,   102,   103,   104,   105,   106,    -1,   108,    -1,
     110,   111,    -1,   113,   114,   115,   116,     3,    -1,     5,
       6,    -1,    -1,    -1,    -1,    11,    -1,    28,    -1,    -1,
      -1,    -1,    18,    34,    35,    36,    37,    38,    39,    40,
      41,    42,    43,    44,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,
      46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,
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
      -1,    -1,    -1,    11,    -1,    -1,    28,    -1,    -1,    -1,
      18,    19,    34,    35,    36,    37,    38,    39,    40,    41,
      42,    43,    44,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    60,    61,    62,    63,    64,    -1,    -1,    67,
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
      -1,    67,    -1,     3,     4,    -1,    72,    -1,    -1,    -1,
      76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,    85,
      -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,    29,
      30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,
     106,    -1,    -1,    -1,   110,    45,    46,   113,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,
      -1,     5,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,
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
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    92,    -1,    94,    95,    96,     5,     6,    -1,
     100,   101,    -1,    11,   104,    -1,    -1,    -1,   108,    -1,
      18,    -1,    -1,    60,   114,    -1,    -1,    -1,     5,     6,
      -1,    -1,    -1,    70,    11,    -1,    -1,    -1,    -1,    -1,
      77,    18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    92,    -1,    94,    95,    96,
      -1,    -1,    60,   100,   101,    -1,    -1,   104,    -1,    -1,
      -1,   108,    70,    -1,     5,     6,    -1,   114,    -1,    77,
      11,    -1,    -1,    60,    -1,    -1,    -1,    18,    -1,    -1,
      -1,    -1,    -1,    70,    92,    -1,    94,    95,    96,    -1,
      77,    -1,   100,   101,    -1,    -1,   104,    -1,     6,    -1,
     108,    -1,    -1,    -1,    -1,    92,   114,    94,    95,    96,
      18,    -1,    -1,   100,   101,    -1,    -1,   104,    -1,    60,
      -1,   108,    -1,    -1,    -1,    -1,     6,   114,    -1,    70,
      -1,    -1,    -1,    -1,    -1,    -1,    77,     6,    18,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    18,
      -1,    92,    60,    94,    95,    96,    -1,    -1,    -1,   100,
     101,    -1,    70,   104,    -1,     6,    -1,   108,    -1,    77,
      -1,    -1,    -1,   114,    -1,    -1,    -1,    18,    -1,    -1,
      60,    -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,
      70,    60,   100,   101,    -1,    -1,   104,    77,    -1,    -1,
     108,    70,    -1,    -1,    -1,    -1,   114,    -1,    77,    -1,
      -1,    -1,    92,    -1,    94,    95,    96,    -1,    -1,    60,
     100,   101,    -1,    92,   104,    94,    95,    96,   108,    70,
      -1,   100,   101,    18,   114,   104,    77,    -1,    -1,   108,
      -1,    -1,    -1,    -1,    -1,   114,    -1,    -1,    -1,    -1,
      -1,    92,    -1,    94,    95,    96,    -1,    -1,    -1,   100,
     101,    -1,    -1,   104,    -1,    -1,    -1,   108,    -1,    -1,
      55,    -1,    -1,   114,    -1,    60,    -1,    62,    -1,    64,
      -1,    -1,    67,    -1,    -1,    70,    -1,    72,    18,    19,
      -1,    -1,    77,    -1,    79,    -1,    -1,    -1,    -1,    -1,
      85,    -1,    87,    -1,    -1,    -1,    -1,    92,    -1,    94,
      95,    96,    -1,    -1,    99,   100,   101,    -1,    -1,   104,
      -1,    -1,    -1,   108,    -1,    55,    18,    19,    -1,   114,
      -1,    -1,    62,    -1,    64,    -1,    -1,    67,    68,    -1,
      -1,    -1,    72,    -1,    74,    -1,    -1,    -1,    -1,    79,
      -1,    -1,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,
      -1,    -1,    -1,    55,    -1,    -1,    -1,    97,    -1,    99,
      62,    -1,    64,    -1,    -1,    67,    68,    -1,    -1,    -1,
      72,    -1,    74,   113,    -1,    -1,    -1,    79,    -1,    -1,
      -1,    -1,    -1,    85,    86,    87,    -1,    -1,    -1,    -1,
       4,    -1,    -1,     7,    -1,    97,    10,    99,    -1,    13,
      -1,    -1,    -1,    17,    18,    19,    -1,    -1,    -1,    -1,
      -1,   113,    -1,    -1,    28,    -1,    -1,    -1,    -1,    -1,
      34,    35,    36,    37,    38,    39,    40,    41,    42,    43,
      44,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55
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
      74,    86,    97,   142,   151,   152,   171,   176,   201,   202,
     210,   130,     3,     4,     5,    22,    23,    29,    30,    45,
      46,    55,    56,    57,    58,    59,    62,    64,    67,    72,
      76,    79,    85,    87,    90,    91,    99,   102,   103,   105,
     110,   113,   128,   129,   148,   149,   150,   254,   255,   256,
     263,   264,   265,   268,   269,   282,   284,   285,   286,   287,
     288,   289,   290,   291,   292,   293,   294,   295,   296,   297,
     298,   299,   300,   301,   302,   303,   305,   307,   308,   309,
     310,    55,    10,    11,    14,   137,     5,    86,    55,    55,
      55,    55,   142,     3,    55,   129,   148,   263,   264,   272,
     273,   274,   278,   279,   280,   282,   304,     9,    55,   310,
     311,   295,   295,   295,   295,   295,   295,     3,    28,   266,
      19,   129,   148,   259,   260,    10,    13,     3,     7,   198,
     199,   200,   307,     7,    10,    13,   260,    10,    13,   198,
     200,     7,    10,    13,    26,    47,   283,    48,    21,    27,
      17,    49,    51,    19,    20,    32,    33,    84,    52,    53,
      54,    22,    23,    14,    15,    16,    45,    46,   273,   295,
     149,     4,     9,     4,    14,    11,   140,   141,   120,   121,
     123,   124,   125,   143,   144,   145,    55,    19,   153,   154,
      82,   159,   153,   153,     4,    55,   130,   275,   276,   277,
     307,    24,     4,    24,    28,    34,    35,    36,    37,    38,
      39,    40,    41,    42,    43,    44,   281,     4,    17,     6,
       6,     9,     4,   267,   272,   310,    26,   148,   261,   262,
     307,     7,   199,   270,   271,   307,   257,   258,   306,   307,
      55,   259,   259,   272,     8,    10,   200,     7,   272,    90,
     102,   256,   259,   259,   102,   105,   259,    10,   272,    55,
     256,   259,   259,   272,   285,   286,   287,   288,   289,   290,
     290,   292,   292,   292,   292,   112,   148,   149,   220,   253,
     293,   293,   293,   294,   294,   295,   295,   295,    55,    11,
     100,   109,   147,   129,   129,   129,   129,     6,   145,     5,
     211,    55,   155,   156,   157,   307,    75,   158,   148,   160,
       5,   172,    75,   203,   204,     3,   177,   112,   149,     4,
       9,     4,     9,     5,   216,   272,   216,   272,   272,   148,
     310,     4,     9,    75,   102,     9,    20,    26,   272,     5,
     186,   198,   271,     7,   266,    10,    25,   259,    55,    55,
      55,     4,    68,     8,     8,    10,    55,    55,    13,    55,
      90,    68,     8,    55,    55,    12,    55,   184,   185,   184,
      28,   109,   100,   129,    11,   122,    11,   122,    11,   126,
       6,   130,   212,    75,     9,    20,   157,   148,   159,     9,
     173,   174,   306,   148,     5,   205,     9,   178,   179,   306,
     159,    55,    55,   306,   307,    55,   277,     3,     6,    11,
      55,    61,    63,    69,    71,    80,    81,    98,   103,   104,
     106,   111,   115,   116,   130,   216,   217,   218,   221,   222,
     223,   224,   225,   235,   236,   237,   242,   255,   265,   279,
     296,   297,   299,   300,   301,   272,   148,   148,   262,    75,
     102,     8,   186,   187,   188,   189,   272,   272,     5,   162,
     163,   306,   266,     5,   227,    55,   259,   266,   259,   266,
     273,   282,    28,   199,     9,   310,    11,   129,   146,   146,
     146,    18,   148,   149,   151,   201,   208,   213,   214,     6,
     130,   148,   161,   306,   307,   156,   163,   148,     9,    11,
     175,    55,     6,   130,   206,   148,     4,     9,   149,     5,
     180,   198,   198,    31,    12,   272,    11,    55,    11,    55,
     104,   221,     3,     3,    11,   272,     3,     3,   272,     3,
     216,   250,     3,   272,   149,   151,   202,   219,   220,     6,
     218,    11,   148,   148,     6,     9,     9,     8,     6,    11,
     100,   130,   164,   165,   216,    55,    65,    70,   228,   229,
     230,   231,   232,   233,    55,    55,   272,    28,   185,     9,
      11,    11,    11,   184,    55,   213,    17,    55,   174,   175,
     164,     6,   266,   113,   149,   151,   154,   191,   201,   207,
     208,   209,     6,   130,   179,    55,   306,     6,   130,   165,
     181,   182,    55,   221,    11,    12,    11,    11,   115,   220,
     224,   238,   240,   272,    11,   272,   272,    11,   129,   220,
     251,   252,   254,   263,    66,    78,   244,   245,   249,   216,
     272,    11,    11,     6,   189,   216,   149,   151,   153,   154,
     166,   167,   168,   183,   190,   191,   201,     6,   165,   234,
     278,     6,   229,   233,     6,   231,   232,   233,    70,   217,
     233,    12,    24,   266,   186,   129,    11,     3,   148,     6,
     163,    55,   192,   192,   113,   148,   149,   307,    11,   197,
     216,   207,    31,    55,     6,   182,   272,     3,    12,    11,
       9,     4,     4,     4,     4,    11,     3,   216,   245,   249,
     243,   244,     4,    55,   184,    55,   107,   196,   197,     9,
       6,    12,   106,   216,   272,     4,     3,   196,   196,   192,
     192,   192,   113,    55,     5,   169,    11,   272,   272,   239,
     272,   224,   221,   227,   216,     4,   252,   130,   246,   248,
     249,   221,    11,     3,   160,   169,   278,   272,    11,   198,
       4,   131,   149,   193,   194,   196,   196,   196,   192,     6,
     129,   170,   217,   254,   259,     4,     4,    11,    73,   226,
     148,   247,     4,   193,    11,    70,   215,   198,   149,    55,
     105,   195,   306,     4,     9,   196,    10,     6,   217,     6,
      10,   102,   105,    11,   221,   240,   241,   221,    21,    55,
     216,     4,   310,    11,   195,    10,   198,    31,   198,   194,
     259,     6,   259,   266,   266,     4,   148,   198,   105,    55,
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
     172,   173,   173,   173,   174,   174,   175,   175,   175,   176,
     177,   178,   178,   178,   179,   179,   180,   180,   181,   181,
     182,   182,   183,   184,   184,   185,   185,   185,   185,   186,
     186,   187,   187,   188,   188,   189,   189,   190,   191,   191,
     191,   191,   191,   191,   192,   192,   193,   193,   194,   194,
     195,   195,   195,   195,   196,   196,   197,   197,   198,   198,
     199,   199,   200,   200,   201,   201,   202,   203,   203,   204,
     204,   205,   205,   206,   206,   207,   207,   207,   207,   208,
     209,   210,   211,   211,   212,   212,   213,   213,   213,   213,
     214,   215,   215,   216,   216,   217,   217,   218,   218,   219,
     219,   219,   220,   220,   221,   221,   221,   221,   221,   222,
     222,   222,   222,   222,   222,   222,   222,   222,   222,   222,
     222,   222,   222,   222,   222,   222,   222,   222,   222,   223,
     224,   224,   224,   224,   224,   224,   224,   225,   226,   226,
     227,   227,   227,   228,   228,   229,   229,   229,   230,   230,
     230,   231,   231,   232,   232,   233,   233,   234,   234,   235,
     236,   236,   237,   238,   238,   238,   239,   239,   240,   240,
     241,   241,   242,   243,   243,   244,   244,   245,   246,   247,
     247,   248,   248,   249,   250,   250,   251,   251,   252,   252,
     253,   254,   254,   254,   254,   254,   254,   254,   254,   254,
     254,   254,   254,   255,   255,   255,   256,   257,   257,   258,
     258,   259,   259,   260,   261,   261,   262,   262,   262,   262,
     262,   262,   262,   263,   263,   263,   264,   264,   265,   265,
     265,   265,   265,   266,   266,   267,   267,   268,   268,   268,
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
       5,     0,     1,     3,     3,     4,     0,     1,     2,     6,
       3,     0,     1,     3,     3,     5,     2,     3,     1,     2,
       1,     3,     3,     1,     3,     1,     3,     2,     4,     3,
       4,     0,     1,     1,     3,     1,     1,     2,     4,     5,
       4,     4,     3,     3,     4,     5,     1,     3,     3,     2,
       2,     3,     1,     3,     0,     2,     1,     1,     0,     1,
       1,     2,     3,     2,     1,     1,     5,     0,     1,     2,
       3,     2,     3,     2,     3,     1,     1,     1,     1,     3,
       2,     4,     2,     3,     2,     3,     1,     1,     1,     1,
       7,     0,     2,     2,     3,     1,     2,     2,     1,     1,
       1,     2,     2,     2,     1,     1,     1,     1,     1,     1,
       1,     2,     3,     5,     5,     7,     2,     3,     2,     3,
       2,     3,     5,     3,     3,     3,     4,     3,     5,     3,
       1,     1,     1,     1,     1,     1,     1,     6,     0,     2,
       3,     3,     4,     1,     2,     4,     3,     5,     0,     1,
       2,     1,     2,     2,     3,     2,     1,     1,     3,     5,
       1,     1,     9,     0,     1,     1,     0,     1,     1,     3,
       0,     1,     7,     0,     1,     1,     2,     5,     4,     1,
       3,     0,     1,     2,     3,     4,     1,     3,     1,     1,
       1,     1,     4,     4,     1,     3,     3,     1,     1,     1,
       1,     1,     1,     1,     3,     3,     5,     2,     2,     2,
       4,     0,     1,     3,     1,     3,     1,     1,     3,     3,
       2,     4,     4,     3,     3,     5,     4,     4,     2,     5,
       5,     5,     7,     2,     3,     1,     3,     4,     4,     4,
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


  private static final int YYLAST_ = 4571;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 35;
  private static final int YYNTOKENS_ = 127;

/* Unqualified %code blocks.  */
/* "src/main/resources/Java_16_Grammar.y":146  */

    public CompilationUnit ast;

/* "src/main/java/parser/JavaParser.java":5949  */

}
/* "src/main/resources/Java_16_Grammar.y":1470  */


