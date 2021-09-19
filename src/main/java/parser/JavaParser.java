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
/* "src/main/resources/Java_16_Grammar.y":131  */
 import lexer.*; 
/* "src/main/resources/Java_16_Grammar.y":132  */
 import tree.*; 
/* "src/main/resources/Java_16_Grammar.y":133  */
 import tree.Compilation.*; 
/* "src/main/resources/Java_16_Grammar.y":134  */
 import tree.Declaration.*; 
/* "src/main/resources/Java_16_Grammar.y":135  */
 import tree.Expression.*; 
/* "src/main/resources/Java_16_Grammar.y":136  */
 import tree.Expression.Primary.*; 
/* "src/main/resources/Java_16_Grammar.y":137  */
 import tree.Statement.*; 
/* "src/main/resources/Java_16_Grammar.y":138  */
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
    S_NON_EQUAL(50),               /* NON_EQUAL  */
    S_DBL_LESS(51),                /* DBL_LESS  */
    S_DBL_GREATER(52),             /* DBL_GREATER  */
    S_TRIPL_GREATER(53),           /* TRIPL_GREATER  */
    S_IDENTIFIER(54),              /* IDENTIFIER  */
    S_INTEGER_LITERAL(55),         /* INTEGER_LITERAL  */
    S_FLOATING_POINT_LITERAL(56),  /* FLOATING_POINT_LITERAL  */
    S_CHARACTER_LITERAL(57),       /* CHARACTER_LITERAL  */
    S_STRING_LITERAL(58),          /* STRING_LITERAL  */
    S_ABSTRACT(59),                /* ABSTRACT  */
    S_ASSERT(60),                  /* ASSERT  */
    S_BOOLEAN(61),                 /* BOOLEAN  */
    S_BREAK(62),                   /* BREAK  */
    S_BYTE(63),                    /* BYTE  */
    S_CASE(64),                    /* CASE  */
    S_CATCH(65),                   /* CATCH  */
    S_CHAR(66),                    /* CHAR  */
    S_CLASS(67),                   /* CLASS  */
    S_CONTINUE(68),                /* CONTINUE  */
    S_DEFAULT(69),                 /* DEFAULT  */
    S_DO(70),                      /* DO  */
    S_DOUBLE(71),                  /* DOUBLE  */
    S_ELSE(72),                    /* ELSE  */
    S_ENUM(73),                    /* ENUM  */
    S_EXTENDS(74),                 /* EXTENDS  */
    S_FALSE(75),                   /* FALSE  */
    S_FINAL(76),                   /* FINAL  */
    S_FINALLY(77),                 /* FINALLY  */
    S_FLOAT(78),                   /* FLOAT  */
    S_FOR(79),                     /* FOR  */
    S_IF(80),                      /* IF  */
    S_IMPLEMENTS(81),              /* IMPLEMENTS  */
    S_IMPORT(82),                  /* IMPORT  */
    S_INSTANCEOF(83),              /* INSTANCEOF  */
    S_INT(84),                     /* INT  */
    S_INTERFACE(85),               /* INTERFACE  */
    S_LONG(86),                    /* LONG  */
    S_MODULE(87),                  /* MODULE  */
    S_NEW(88),                     /* NEW  */
    S_NULL(89),                    /* NULL  */
    S_OPEN(90),                    /* OPEN  */
    S_PACKAGE(91),                 /* PACKAGE  */
    S_PRIVATE(92),                 /* PRIVATE  */
    S_PROTECTED(93),               /* PROTECTED  */
    S_PUBLIC(94),                  /* PUBLIC  */
    S_RECORD(95),                  /* RECORD  */
    S_RETURN(96),                  /* RETURN  */
    S_SHORT(97),                   /* SHORT  */
    S_STATIC(98),                  /* STATIC  */
    S_STRICTFP(99),                /* STRICTFP  */
    S_SUPER(100),                  /* SUPER  */
    S_SWITCH(101),                 /* SWITCH  */
    S_SYNCHRONIZED(102),           /* SYNCHRONIZED  */
    S_THIS(103),                   /* THIS  */
    S_THROW(104),                  /* THROW  */
    S_THROWS(105),                 /* THROWS  */
    S_TRANSIENT(106),              /* TRANSIENT  */
    S_TRANSITIVE(107),             /* TRANSITIVE  */
    S_TRUE(108),                   /* TRUE  */
    S_TRY(109),                    /* TRY  */
    S_VAR(110),                    /* VAR  */
    S_VOID(111),                   /* VOID  */
    S_VOLATILE(112),               /* VOLATILE  */
    S_WHILE(113),                  /* WHILE  */
    S_YIELD(114),                  /* YIELD  */
    S_115_requires_(115),          /* "requires"  */
    S_116_exports_(116),           /* "exports"  */
    S_117_to_(117),                /* "to"  */
    S_118_opens_(118),             /* "opens"  */
    S_119_uses_(119),              /* "uses"  */
    S_120_provides_(120),          /* "provides"  */
    S_121_with_(121),              /* "with"  */
    S_YYACCEPT(122),               /* $accept  */
    S_Literal(123),                /* Literal  */
    S_CompoundName(124),           /* CompoundName  */
    S_ModifierSeqOpt(125),         /* ModifierSeqOpt  */
    S_ModifierSeq(126),            /* ModifierSeq  */
    S_StandardModifierSeq(127),    /* StandardModifierSeq  */
    S_StandardModifier(128),       /* StandardModifier  */
    S_CompilationUnit(129),        /* CompilationUnit  */
    S_Package(130),                /* Package  */
    S_Module(131),                 /* Module  */
    S_ImportDeclarationSeqOpt(132), /* ImportDeclarationSeqOpt  */
    S_ImportDeclarationSeq(133),   /* ImportDeclarationSeq  */
    S_ImportDeclaration(134),      /* ImportDeclaration  */
    S_TopLevelComponentSeqOpt(135), /* TopLevelComponentSeqOpt  */
    S_TopLevelComponentSeq(136),   /* TopLevelComponentSeq  */
    S_TopLevelComponent(137),      /* TopLevelComponent  */
    S_ModuleDirectiveSeqOpt(138),  /* ModuleDirectiveSeqOpt  */
    S_ModuleDirectiveSeq(139),     /* ModuleDirectiveSeq  */
    S_ModuleDirective(140),        /* ModuleDirective  */
    S_ModuleNameList(141),         /* ModuleNameList  */
    S_RequiresModifierSeqOpt(142), /* RequiresModifierSeqOpt  */
    S_Type(143),                   /* Type  */
    S_UnannotatedType(144),        /* UnannotatedType  */
    S_PrimitiveType(145),          /* PrimitiveType  */
    S_ClassDeclaration(146),       /* ClassDeclaration  */
    S_NormalClassDeclaration(147), /* NormalClassDeclaration  */
    S_TypeParametersOpt(148),      /* TypeParametersOpt  */
    S_TypeParameters(149),         /* TypeParameters  */
    S_TypeParameterList(150),      /* TypeParameterList  */
    S_TypeParameter(151),          /* TypeParameter  */
    S_TypeParameterTail(152),      /* TypeParameterTail  */
    S_ClassExtendsOpt(153),        /* ClassExtendsOpt  */
    S_ClassImplementsOpt(154),     /* ClassImplementsOpt  */
    S_ClassTypeList1(155),         /* ClassTypeList1  */
    S_ClassTypeList2(156),         /* ClassTypeList2  */
    S_ClassBodyOpt(157),           /* ClassBodyOpt  */
    S_ClassBody(158),              /* ClassBody  */
    S_ClassBodyDeclarationSeq(159), /* ClassBodyDeclarationSeq  */
    S_ClassBodyDeclaration(160),   /* ClassBodyDeclaration  */
    S_PureBodyDeclaration(161),    /* PureBodyDeclaration  */
    S_ConstructorDeclaration(162), /* ConstructorDeclaration  */
    S_ConstructorDeclarator(163),  /* ConstructorDeclarator  */
    S_ConstructorBody(164),        /* ConstructorBody  */
    S_ExplicitConstructorInvocation(165), /* ExplicitConstructorInvocation  */
    S_EnumDeclaration(166),        /* EnumDeclaration  */
    S_EnumBody(167),               /* EnumBody  */
    S_EnumConstantListOpt(168),    /* EnumConstantListOpt  */
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
    S_BlockDeclaration(214),       /* BlockDeclaration  */
    S_LocalVariableDeclaration(215), /* LocalVariableDeclaration  */
    S_Statement(216),              /* Statement  */
    S_SimpleStatement(217),        /* SimpleStatement  */
    S_LabeledStatement(218),       /* LabeledStatement  */
    S_StatementExpression(219),    /* StatementExpression  */
    S_IfThenElseStatement(220),    /* IfThenElseStatement  */
    S_ElsePartOpt(221),            /* ElsePartOpt  */
    S_SwitchBlock(222),            /* SwitchBlock  */
    S_SwitchRuleSeq(223),          /* SwitchRuleSeq  */
    S_SwitchRule(224),             /* SwitchRule  */
    S_SwitchBlockStatementGroupSeqOpt(225), /* SwitchBlockStatementGroupSeqOpt  */
    S_SwitchBlockStatementGroup(226), /* SwitchBlockStatementGroup  */
    S_SwitchLabelSeq(227),         /* SwitchLabelSeq  */
    S_SwitchLabel(228),            /* SwitchLabel  */
    S_CaseExpressionList(229),     /* CaseExpressionList  */
    S_WhileStatement(230),         /* WhileStatement  */
    S_ForStatement(231),           /* ForStatement  */
    S_BasicForStatement(232),      /* BasicForStatement  */
    S_ForInitOpt(233),             /* ForInitOpt  */
    S_ExpressionOpt(234),          /* ExpressionOpt  */
    S_StatementExpressionList(235), /* StatementExpressionList  */
    S_StatementExpressionListOpt(236), /* StatementExpressionListOpt  */
    S_EnhancedForStatement(237),   /* EnhancedForStatement  */
    S_CatchesOpt(238),             /* CatchesOpt  */
    S_Catches(239),                /* Catches  */
    S_CatchClause(240),            /* CatchClause  */
    S_CatchFormalParameter(241),   /* CatchFormalParameter  */
    S_CatchType(242),              /* CatchType  */
    S_FinallyOpt(243),             /* FinallyOpt  */
    S_Finally(244),                /* Finally  */
    S_ResourceSpecification(245),  /* ResourceSpecification  */
    S_ResourceSeq(246),            /* ResourceSeq  */
    S_Resource(247),               /* Resource  */
    S_Pattern(248),                /* Pattern  */
    S_Primary(249),                /* Primary  */
    S_ClassInstanceCreationExpression(250), /* ClassInstanceCreationExpression  */
    S_UnqualifiedClassInstanceCreationExpression(251), /* UnqualifiedClassInstanceCreationExpression  */
    S_ClassOrInterfaceTypeToInstantiate(252), /* ClassOrInterfaceTypeToInstantiate  */
    S_AnnotatedCompoundName(253),  /* AnnotatedCompoundName  */
    S_TypeArgumentsOpt(254),       /* TypeArgumentsOpt  */
    S_TypeArguments(255),          /* TypeArguments  */
    S_TypeArgumentList(256),       /* TypeArgumentList  */
    S_TypeArgument(257),           /* TypeArgument  */
    S_FieldAccess(258),            /* FieldAccess  */
    S_ArrayAccess(259),            /* ArrayAccess  */
    S_MethodInvocation(260),       /* MethodInvocation  */
    S_Arguments(261),              /* Arguments  */
    S_ArgumentList(262),           /* ArgumentList  */
    S_MethodReference(263),        /* MethodReference  */
    S_ArrayCreationExpression(264), /* ArrayCreationExpression  */
    S_DimExprs(265),               /* DimExprs  */
    S_DimExpr(266),                /* DimExpr  */
    S_Expression(267),             /* Expression  */
    S_LambdaExpression(268),       /* LambdaExpression  */
    S_LambdaParameters(269),       /* LambdaParameters  */
    S_LambdaParameterList1(270),   /* LambdaParameterList1  */
    S_LambdaParameterList2(271),   /* LambdaParameterList2  */
    S_LambdaParameter(272),        /* LambdaParameter  */
    S_AssignmentExpression(273),   /* AssignmentExpression  */
    S_Assignment(274),             /* Assignment  */
    S_LeftHandSide(275),           /* LeftHandSide  */
    S_AssignmentOperator(276),     /* AssignmentOperator  */
    S_ConditionalExpression(277),  /* ConditionalExpression  */
    S_ConditionalOrTail(278),      /* ConditionalOrTail  */
    S_ConditionalOrExpression(279), /* ConditionalOrExpression  */
    S_ConditionalAndExpression(280), /* ConditionalAndExpression  */
    S_InclusiveOrExpression(281),  /* InclusiveOrExpression  */
    S_ExclusiveOrExpression(282),  /* ExclusiveOrExpression  */
    S_AndExpression(283),          /* AndExpression  */
    S_EqualityExpression(284),     /* EqualityExpression  */
    S_RelationalExpression(285),   /* RelationalExpression  */
    S_InstanceofExpression(286),   /* InstanceofExpression  */
    S_ShiftExpression(287),        /* ShiftExpression  */
    S_AdditiveExpression(288),     /* AdditiveExpression  */
    S_MultiplicativeExpression(289), /* MultiplicativeExpression  */
    S_UnaryExpression(290),        /* UnaryExpression  */
    S_PreIncrementExpression(291), /* PreIncrementExpression  */
    S_PreDecrementExpression(292), /* PreDecrementExpression  */
    S_UnaryExpressionNotPlusMinus(293), /* UnaryExpressionNotPlusMinus  */
    S_PostfixExpression(294),      /* PostfixExpression  */
    S_PostIncrementExpression(295), /* PostIncrementExpression  */
    S_PostDecrementExpression(296), /* PostDecrementExpression  */
    S_CastExpression(297),         /* CastExpression  */
    S_TargetType(298),             /* TargetType  */
    S_TypeList(299),               /* TypeList  */
    S_SwitchExpression(300),       /* SwitchExpression  */
    S_AnnotationSeqOpt(301),       /* AnnotationSeqOpt  */
    S_AnnotationSeq(302),          /* AnnotationSeq  */
    S_Annotation(303),             /* Annotation  */
    S_AnnoParameterList(304),      /* AnnoParameterList  */
    S_ElementValue(305),           /* ElementValue  */
    S_ElementValueListOpt(306);    /* ElementValueListOpt  */


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
      SymbolKind.S_115_requires_,
      SymbolKind.S_116_exports_,
      SymbolKind.S_117_to_,
      SymbolKind.S_118_opens_,
      SymbolKind.S_119_uses_,
      SymbolKind.S_120_provides_,
      SymbolKind.S_121_with_,
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
  "DBL_AMPERSAND", "DBL_EQUAL", "NON_EQUAL", "DBL_LESS", "DBL_GREATER",
  "TRIPL_GREATER", "IDENTIFIER", "INTEGER_LITERAL",
  "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL",
  "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
  "CHAR", "CLASS", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM",
  "EXTENDS", "FALSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF",
  "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG",
  "MODULE", "NEW", "NULL", "OPEN", "PACKAGE", "PRIVATE", "PROTECTED",
  "PUBLIC", "RECORD", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER",
  "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT",
  "TRANSITIVE", "TRUE", "TRY", "VAR", "VOID", "VOLATILE", "WHILE", "YIELD",
  "\"requires\"", "\"exports\"", "\"to\"", "\"opens\"", "\"uses\"",
  "\"provides\"", "\"with\"", "$accept", "Literal", "CompoundName",
  "ModifierSeqOpt", "ModifierSeq", "StandardModifierSeq",
  "StandardModifier", "CompilationUnit", "Package", "Module",
  "ImportDeclarationSeqOpt", "ImportDeclarationSeq", "ImportDeclaration",
  "TopLevelComponentSeqOpt", "TopLevelComponentSeq", "TopLevelComponent",
  "ModuleDirectiveSeqOpt", "ModuleDirectiveSeq", "ModuleDirective",
  "ModuleNameList", "RequiresModifierSeqOpt", "Type", "UnannotatedType",
  "PrimitiveType", "ClassDeclaration", "NormalClassDeclaration",
  "TypeParametersOpt", "TypeParameters", "TypeParameterList",
  "TypeParameter", "TypeParameterTail", "ClassExtendsOpt",
  "ClassImplementsOpt", "ClassTypeList1", "ClassTypeList2", "ClassBodyOpt",
  "ClassBody", "ClassBodyDeclarationSeq", "ClassBodyDeclaration",
  "PureBodyDeclaration", "ConstructorDeclaration", "ConstructorDeclarator",
  "ConstructorBody", "ExplicitConstructorInvocation", "EnumDeclaration",
  "EnumBody", "EnumConstantListOpt", "EnumConstant",
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
    /** Token NON_EQUAL, to be returned by the scanner.  */
    static final int NON_EQUAL = 305;
    /** Token DBL_LESS, to be returned by the scanner.  */
    static final int DBL_LESS = 306;
    /** Token DBL_GREATER, to be returned by the scanner.  */
    static final int DBL_GREATER = 307;
    /** Token TRIPL_GREATER, to be returned by the scanner.  */
    static final int TRIPL_GREATER = 308;
    /** Token IDENTIFIER, to be returned by the scanner.  */
    static final int IDENTIFIER = 309;
    /** Token INTEGER_LITERAL, to be returned by the scanner.  */
    static final int INTEGER_LITERAL = 310;
    /** Token FLOATING_POINT_LITERAL, to be returned by the scanner.  */
    static final int FLOATING_POINT_LITERAL = 311;
    /** Token CHARACTER_LITERAL, to be returned by the scanner.  */
    static final int CHARACTER_LITERAL = 312;
    /** Token STRING_LITERAL, to be returned by the scanner.  */
    static final int STRING_LITERAL = 313;
    /** Token ABSTRACT, to be returned by the scanner.  */
    static final int ABSTRACT = 314;
    /** Token ASSERT, to be returned by the scanner.  */
    static final int ASSERT = 315;
    /** Token BOOLEAN, to be returned by the scanner.  */
    static final int BOOLEAN = 316;
    /** Token BREAK, to be returned by the scanner.  */
    static final int BREAK = 317;
    /** Token BYTE, to be returned by the scanner.  */
    static final int BYTE = 318;
    /** Token CASE, to be returned by the scanner.  */
    static final int CASE = 319;
    /** Token CATCH, to be returned by the scanner.  */
    static final int CATCH = 320;
    /** Token CHAR, to be returned by the scanner.  */
    static final int CHAR = 321;
    /** Token CLASS, to be returned by the scanner.  */
    static final int CLASS = 322;
    /** Token CONTINUE, to be returned by the scanner.  */
    static final int CONTINUE = 323;
    /** Token DEFAULT, to be returned by the scanner.  */
    static final int DEFAULT = 324;
    /** Token DO, to be returned by the scanner.  */
    static final int DO = 325;
    /** Token DOUBLE, to be returned by the scanner.  */
    static final int DOUBLE = 326;
    /** Token ELSE, to be returned by the scanner.  */
    static final int ELSE = 327;
    /** Token ENUM, to be returned by the scanner.  */
    static final int ENUM = 328;
    /** Token EXTENDS, to be returned by the scanner.  */
    static final int EXTENDS = 329;
    /** Token FALSE, to be returned by the scanner.  */
    static final int FALSE = 330;
    /** Token FINAL, to be returned by the scanner.  */
    static final int FINAL = 331;
    /** Token FINALLY, to be returned by the scanner.  */
    static final int FINALLY = 332;
    /** Token FLOAT, to be returned by the scanner.  */
    static final int FLOAT = 333;
    /** Token FOR, to be returned by the scanner.  */
    static final int FOR = 334;
    /** Token IF, to be returned by the scanner.  */
    static final int IF = 335;
    /** Token IMPLEMENTS, to be returned by the scanner.  */
    static final int IMPLEMENTS = 336;
    /** Token IMPORT, to be returned by the scanner.  */
    static final int IMPORT = 337;
    /** Token INSTANCEOF, to be returned by the scanner.  */
    static final int INSTANCEOF = 338;
    /** Token INT, to be returned by the scanner.  */
    static final int INT = 339;
    /** Token INTERFACE, to be returned by the scanner.  */
    static final int INTERFACE = 340;
    /** Token LONG, to be returned by the scanner.  */
    static final int LONG = 341;
    /** Token MODULE, to be returned by the scanner.  */
    static final int MODULE = 342;
    /** Token NEW, to be returned by the scanner.  */
    static final int NEW = 343;
    /** Token NULL, to be returned by the scanner.  */
    static final int NULL = 344;
    /** Token OPEN, to be returned by the scanner.  */
    static final int OPEN = 345;
    /** Token PACKAGE, to be returned by the scanner.  */
    static final int PACKAGE = 346;
    /** Token PRIVATE, to be returned by the scanner.  */
    static final int PRIVATE = 347;
    /** Token PROTECTED, to be returned by the scanner.  */
    static final int PROTECTED = 348;
    /** Token PUBLIC, to be returned by the scanner.  */
    static final int PUBLIC = 349;
    /** Token RECORD, to be returned by the scanner.  */
    static final int RECORD = 350;
    /** Token RETURN, to be returned by the scanner.  */
    static final int RETURN = 351;
    /** Token SHORT, to be returned by the scanner.  */
    static final int SHORT = 352;
    /** Token STATIC, to be returned by the scanner.  */
    static final int STATIC = 353;
    /** Token STRICTFP, to be returned by the scanner.  */
    static final int STRICTFP = 354;
    /** Token SUPER, to be returned by the scanner.  */
    static final int SUPER = 355;
    /** Token SWITCH, to be returned by the scanner.  */
    static final int SWITCH = 356;
    /** Token SYNCHRONIZED, to be returned by the scanner.  */
    static final int SYNCHRONIZED = 357;
    /** Token THIS, to be returned by the scanner.  */
    static final int THIS = 358;
    /** Token THROW, to be returned by the scanner.  */
    static final int THROW = 359;
    /** Token THROWS, to be returned by the scanner.  */
    static final int THROWS = 360;
    /** Token TRANSIENT, to be returned by the scanner.  */
    static final int TRANSIENT = 361;
    /** Token TRANSITIVE, to be returned by the scanner.  */
    static final int TRANSITIVE = 362;
    /** Token TRUE, to be returned by the scanner.  */
    static final int TRUE = 363;
    /** Token TRY, to be returned by the scanner.  */
    static final int TRY = 364;
    /** Token VAR, to be returned by the scanner.  */
    static final int VAR = 365;
    /** Token VOID, to be returned by the scanner.  */
    static final int VOID = 366;
    /** Token VOLATILE, to be returned by the scanner.  */
    static final int VOLATILE = 367;
    /** Token WHILE, to be returned by the scanner.  */
    static final int WHILE = 368;
    /** Token YIELD, to be returned by the scanner.  */
    static final int YIELD = 369;

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
    /* "src/main/resources/Java_16_Grammar.y":212  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 3: /* Literal: FLOATING_POINT_LITERAL  */
  if (yyn == 3)
    /* "src/main/resources/Java_16_Grammar.y":213  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 4: /* Literal: TRUE  */
  if (yyn == 4)
    /* "src/main/resources/Java_16_Grammar.y":214  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 5: /* Literal: FALSE  */
  if (yyn == 5)
    /* "src/main/resources/Java_16_Grammar.y":215  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 6: /* Literal: CHARACTER_LITERAL  */
  if (yyn == 6)
    /* "src/main/resources/Java_16_Grammar.y":216  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 7: /* Literal: STRING_LITERAL  */
  if (yyn == 7)
    /* "src/main/resources/Java_16_Grammar.y":217  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 8: /* Literal: NULL  */
  if (yyn == 8)
    /* "src/main/resources/Java_16_Grammar.y":219  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 9: /* CompoundName: IDENTIFIER  */
  if (yyn == 9)
    /* "src/main/resources/Java_16_Grammar.y":225  */
                                  { yyval = new CompoundName(((Token)(yystack.valueAt (0))).image); };
  break;


  case 10: /* CompoundName: CompoundName DOT IDENTIFIER  */
  if (yyn == 10)
    /* "src/main/resources/Java_16_Grammar.y":226  */
                                  { yyval = ((CompoundName)(yystack.valueAt (2))).add(((Token)(yystack.valueAt (0))).image); };
  break;


  case 11: /* ModifierSeqOpt: %empty  */
  if (yyn == 11)
    /* "src/main/resources/Java_16_Grammar.y":230  */
                   { yyval = null; };
  break;


  case 12: /* ModifierSeqOpt: ModifierSeq  */
  if (yyn == 12)
    /* "src/main/resources/Java_16_Grammar.y":231  */
                   { yyval = ((Modifiers)(yystack.valueAt (0))); };
  break;


  case 13: /* ModifierSeq: StandardModifierSeq  */
  if (yyn == 13)
    /* "src/main/resources/Java_16_Grammar.y":235  */
                                        { yyval = new Modifiers(null,((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 14: /* ModifierSeq: AnnotationSeq StandardModifierSeq  */
  if (yyn == 14)
    /* "src/main/resources/Java_16_Grammar.y":236  */
                                        { yyval = new Modifiers(((Annotations)(yystack.valueAt (1))),((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 15: /* StandardModifierSeq: StandardModifier  */
  if (yyn == 15)
    /* "src/main/resources/Java_16_Grammar.y":240  */
                                           { yyval = new StandardModifiers(((Token)(yystack.valueAt (0)))); };
  break;


  case 16: /* StandardModifierSeq: StandardModifierSeq StandardModifier  */
  if (yyn == 16)
    /* "src/main/resources/Java_16_Grammar.y":241  */
                                           { yyval = ((StandardModifiers)(yystack.valueAt (1))).add(((Token)(yystack.valueAt (0)))); };
  break;


  case 17: /* StandardModifier: DEFAULT  */
  if (yyn == 17)
    /* "src/main/resources/Java_16_Grammar.y":246  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 18: /* StandardModifier: FINAL  */
  if (yyn == 18)
    /* "src/main/resources/Java_16_Grammar.y":247  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 19: /* StandardModifier: PUBLIC  */
  if (yyn == 19)
    /* "src/main/resources/Java_16_Grammar.y":248  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 20: /* StandardModifier: PROTECTED  */
  if (yyn == 20)
    /* "src/main/resources/Java_16_Grammar.y":249  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 21: /* StandardModifier: PRIVATE  */
  if (yyn == 21)
    /* "src/main/resources/Java_16_Grammar.y":250  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 22: /* StandardModifier: ABSTRACT  */
  if (yyn == 22)
    /* "src/main/resources/Java_16_Grammar.y":251  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 23: /* StandardModifier: STATIC  */
  if (yyn == 23)
    /* "src/main/resources/Java_16_Grammar.y":252  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 24: /* StandardModifier: STRICTFP  */
  if (yyn == 24)
    /* "src/main/resources/Java_16_Grammar.y":253  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 25: /* StandardModifier: SYNCHRONIZED  */
  if (yyn == 25)
    /* "src/main/resources/Java_16_Grammar.y":254  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 26: /* StandardModifier: TRANSIENT  */
  if (yyn == 26)
    /* "src/main/resources/Java_16_Grammar.y":255  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 27: /* StandardModifier: VOLATILE  */
  if (yyn == 27)
    /* "src/main/resources/Java_16_Grammar.y":256  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 28: /* StandardModifier: OPEN  */
  if (yyn == 28)
    /* "src/main/resources/Java_16_Grammar.y":257  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 29: /* CompilationUnit: %empty  */
  if (yyn == 29)
    /* "src/main/resources/Java_16_Grammar.y":263  */
                                                    { yyval = null; };
  break;


  case 30: /* CompilationUnit: Package  */
  if (yyn == 30)
    /* "src/main/resources/Java_16_Grammar.y":264  */
                                                    { yyval = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); };
  break;


  case 31: /* CompilationUnit: Module  */
  if (yyn == 31)
    /* "src/main/resources/Java_16_Grammar.y":265  */
                                                    { yyval = ((tree.Compilation.Module)(yystack.valueAt (0))); };
  break;


  case 32: /* CompilationUnit: ImportDeclarationSeqOpt TopLevelComponentSeq  */
  if (yyn == 32)
    /* "src/main/resources/Java_16_Grammar.y":266  */
                                                    { yyval = new SimpleCompilationUnit(((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 33: /* Package: PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt  */
  if (yyn == 33)
    /* "src/main/resources/Java_16_Grammar.y":271  */
                                                    { yyval = new tree.Compilation.Package(((CompoundName)(yystack.valueAt (3))),((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 34: /* Module: ModifierSeqOpt MODULE CompoundName LBRACE ModuleDirectiveSeqOpt RBRACE  */
  if (yyn == 34)
    /* "src/main/resources/Java_16_Grammar.y":277  */
                                                                             { yyval = null; };
  break;


  case 35: /* ImportDeclarationSeqOpt: %empty  */
  if (yyn == 35)
    /* "src/main/resources/Java_16_Grammar.y":281  */
                                                 { yyval = null; };
  break;


  case 36: /* ImportDeclarationSeqOpt: ImportDeclarationSeq  */
  if (yyn == 36)
    /* "src/main/resources/Java_16_Grammar.y":282  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (0))); };
  break;


  case 37: /* ImportDeclarationSeq: ImportDeclaration  */
  if (yyn == 37)
    /* "src/main/resources/Java_16_Grammar.y":286  */
                                                 { yyval = new ImportDeclarations(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 38: /* ImportDeclarationSeq: ImportDeclarationSeqOpt ImportDeclaration  */
  if (yyn == 38)
    /* "src/main/resources/Java_16_Grammar.y":287  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))).add(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 39: /* ImportDeclaration: IMPORT CompoundName SEMICOLON  */
  if (yyn == 39)
    /* "src/main/resources/Java_16_Grammar.y":291  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 40: /* ImportDeclaration: IMPORT STATIC CompoundName SEMICOLON  */
  if (yyn == 40)
    /* "src/main/resources/Java_16_Grammar.y":292  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 41: /* ImportDeclaration: IMPORT CompoundName DOT STAR SEMICOLON  */
  if (yyn == 41)
    /* "src/main/resources/Java_16_Grammar.y":293  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 42: /* ImportDeclaration: IMPORT STATIC CompoundName DOT STAR SEMICOLON  */
  if (yyn == 42)
    /* "src/main/resources/Java_16_Grammar.y":294  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 43: /* TopLevelComponentSeqOpt: %empty  */
  if (yyn == 43)
    /* "src/main/resources/Java_16_Grammar.y":298  */
                            { yyval = null; };
  break;


  case 44: /* TopLevelComponentSeqOpt: TopLevelComponentSeq  */
  if (yyn == 44)
    /* "src/main/resources/Java_16_Grammar.y":299  */
                            { yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (0))); };
  break;


  case 45: /* TopLevelComponentSeq: ModifierSeqOpt TopLevelComponent  */
  if (yyn == 45)
    /* "src/main/resources/Java_16_Grammar.y":303  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = new TopLevelComponents(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 46: /* TopLevelComponentSeq: TopLevelComponentSeq ModifierSeqOpt TopLevelComponent  */
  if (yyn == 46)
    /* "src/main/resources/Java_16_Grammar.y":304  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (2))).add(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 47: /* TopLevelComponent: ClassDeclaration  */
  if (yyn == 47)
    /* "src/main/resources/Java_16_Grammar.y":308  */
                           { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 48: /* TopLevelComponent: InterfaceDeclaration  */
  if (yyn == 48)
    /* "src/main/resources/Java_16_Grammar.y":309  */
                           { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 67: /* Type: UnannotatedType  */
  if (yyn == 67)
    /* "src/main/resources/Java_16_Grammar.y":356  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))); };
  break;


  case 68: /* Type: AnnotationSeq UnannotatedType  */
  if (yyn == 68)
    /* "src/main/resources/Java_16_Grammar.y":357  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))).addAnnotations(((Annotations)(yystack.valueAt (1)))); };
  break;


  case 69: /* UnannotatedType: PrimitiveType  */
  if (yyn == 69)
    /* "src/main/resources/Java_16_Grammar.y":361  */
                                 { yyval = new PrimitiveType(((Token)(yystack.valueAt (0)))); };
  break;


  case 70: /* UnannotatedType: CompoundName  */
  if (yyn == 70)
    /* "src/main/resources/Java_16_Grammar.y":363  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (0))),null); };
  break;


  case 71: /* UnannotatedType: CompoundName TypeArguments  */
  if (yyn == 71)
    /* "src/main/resources/Java_16_Grammar.y":364  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (1))),((tree.Type.TypeArguments)(yystack.valueAt (0)))); };
  break;


  case 72: /* UnannotatedType: UnannotatedType Dim  */
  if (yyn == 72)
    /* "src/main/resources/Java_16_Grammar.y":366  */
                                     { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (1))).addDimension(((Dim)(yystack.valueAt (0)))); };
  break;


  case 73: /* PrimitiveType: BYTE  */
  if (yyn == 73)
    /* "src/main/resources/Java_16_Grammar.y":375  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 74: /* PrimitiveType: SHORT  */
  if (yyn == 74)
    /* "src/main/resources/Java_16_Grammar.y":376  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 75: /* PrimitiveType: INT  */
  if (yyn == 75)
    /* "src/main/resources/Java_16_Grammar.y":377  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 76: /* PrimitiveType: LONG  */
  if (yyn == 76)
    /* "src/main/resources/Java_16_Grammar.y":378  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 77: /* PrimitiveType: CHAR  */
  if (yyn == 77)
    /* "src/main/resources/Java_16_Grammar.y":379  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 78: /* PrimitiveType: FLOAT  */
  if (yyn == 78)
    /* "src/main/resources/Java_16_Grammar.y":381  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 79: /* PrimitiveType: DOUBLE  */
  if (yyn == 79)
    /* "src/main/resources/Java_16_Grammar.y":382  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 80: /* PrimitiveType: BOOLEAN  */
  if (yyn == 80)
    /* "src/main/resources/Java_16_Grammar.y":383  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 81: /* ClassDeclaration: NormalClassDeclaration  */
  if (yyn == 81)
    /* "src/main/resources/Java_16_Grammar.y":404  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 82: /* ClassDeclaration: EnumDeclaration  */
  if (yyn == 82)
    /* "src/main/resources/Java_16_Grammar.y":405  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 83: /* ClassDeclaration: RecordDeclaration  */
  if (yyn == 83)
    /* "src/main/resources/Java_16_Grammar.y":406  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 84: /* NormalClassDeclaration: CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody  */
  if (yyn == 84)
    /* "src/main/resources/Java_16_Grammar.y":411  */
                              { yyval = new NormalClassDeclaration(((Token)(yystack.valueAt (4))),((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 85: /* TypeParametersOpt: %empty  */
  if (yyn == 85)
    /* "src/main/resources/Java_16_Grammar.y":415  */
                       { yyval = null; };
  break;


  case 86: /* TypeParametersOpt: TypeParameters  */
  if (yyn == 86)
    /* "src/main/resources/Java_16_Grammar.y":416  */
                       { yyval = ((TypeParameters)(yystack.valueAt (0))); };
  break;


  case 87: /* TypeParameters: LESS TypeParameterList GREATER  */
  if (yyn == 87)
    /* "src/main/resources/Java_16_Grammar.y":420  */
                                      { yyval = ((TypeParameters)(yystack.valueAt (1))); };
  break;


  case 88: /* TypeParameterList: TypeParameter  */
  if (yyn == 88)
    /* "src/main/resources/Java_16_Grammar.y":424  */
                                            { yyval = new TypeParameters(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 89: /* TypeParameterList: TypeParameterList COMMA TypeParameter  */
  if (yyn == 89)
    /* "src/main/resources/Java_16_Grammar.y":425  */
                                            { yyval = ((TypeParameters)(yystack.valueAt (2))).add(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 90: /* TypeParameter: AnnotationSeq TypeParameterTail  */
  if (yyn == 90)
    /* "src/main/resources/Java_16_Grammar.y":435  */
                                      { yyval = new TypeParameter(((Annotations)(yystack.valueAt (1))),((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 91: /* TypeParameter: TypeParameterTail  */
  if (yyn == 91)
    /* "src/main/resources/Java_16_Grammar.y":436  */
                                      { yyval = new TypeParameter(null,((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 92: /* TypeParameterTail: IDENTIFIER  */
  if (yyn == 92)
    /* "src/main/resources/Java_16_Grammar.y":440  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (0))),null); };
  break;


  case 93: /* TypeParameterTail: IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 93)
    /* "src/main/resources/Java_16_Grammar.y":441  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (3))),((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0)))); };
  break;


  case 94: /* TypeParameterTail: IDENTIFIER EXTENDS ClassTypeList2  */
  if (yyn == 94)
    /* "src/main/resources/Java_16_Grammar.y":442  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 95: /* ClassExtendsOpt: %empty  */
  if (yyn == 95)
    /* "src/main/resources/Java_16_Grammar.y":446  */
                    { yyval = null; };
  break;


  case 96: /* ClassExtendsOpt: EXTENDS Type  */
  if (yyn == 96)
    /* "src/main/resources/Java_16_Grammar.y":447  */
                    { yyval = ((tree.Type.Type)(yystack.valueAt (0))); };
  break;


  case 97: /* ClassImplementsOpt: %empty  */
  if (yyn == 97)
    /* "src/main/resources/Java_16_Grammar.y":451  */
                                 { yyval = null; };
  break;


  case 98: /* ClassImplementsOpt: IMPLEMENTS ClassTypeList1  */
  if (yyn == 98)
    /* "src/main/resources/Java_16_Grammar.y":452  */
                                 { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 99: /* ClassTypeList1: Type  */
  if (yyn == 99)
    /* "src/main/resources/Java_16_Grammar.y":456  */
                                { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 100: /* ClassTypeList1: ClassTypeList1 COMMA Type  */
  if (yyn == 100)
    /* "src/main/resources/Java_16_Grammar.y":457  */
                                { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 101: /* ClassTypeList2: Type  */
  if (yyn == 101)
    /* "src/main/resources/Java_16_Grammar.y":461  */
                                    { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 102: /* ClassTypeList2: ClassTypeList2 AMPERSAND Type  */
  if (yyn == 102)
    /* "src/main/resources/Java_16_Grammar.y":462  */
                                    { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 103: /* ClassBodyOpt: %empty  */
  if (yyn == 103)
    /* "src/main/resources/Java_16_Grammar.y":466  */
                    { yyval = null; };
  break;


  case 104: /* ClassBodyOpt: ClassBody  */
  if (yyn == 104)
    /* "src/main/resources/Java_16_Grammar.y":467  */
                    { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 105: /* ClassBody: LBRACE RBRACE  */
  if (yyn == 105)
    /* "src/main/resources/Java_16_Grammar.y":471  */
                                             { yyval = null; };
  break;


  case 106: /* ClassBody: LBRACE ClassBodyDeclarationSeq RBRACE  */
  if (yyn == 106)
    /* "src/main/resources/Java_16_Grammar.y":472  */
                                                 { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 107: /* ClassBodyDeclarationSeq: ClassBodyDeclaration  */
  if (yyn == 107)
    /* "src/main/resources/Java_16_Grammar.y":476  */
                                                   { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 108: /* ClassBodyDeclarationSeq: ClassBodyDeclarationSeq ClassBodyDeclaration  */
  if (yyn == 108)
    /* "src/main/resources/Java_16_Grammar.y":477  */
                                                   { yyval = ((Declarations)(yystack.valueAt (1))).add(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 109: /* ClassBodyDeclaration: ModifierSeqOpt PureBodyDeclaration  */
  if (yyn == 109)
    /* "src/main/resources/Java_16_Grammar.y":481  */
                                         { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); };
  break;


  case 110: /* ClassBodyDeclaration: Block  */
  if (yyn == 110)
    /* "src/main/resources/Java_16_Grammar.y":482  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),false); };
  break;


  case 111: /* ClassBodyDeclaration: STATIC Block  */
  if (yyn == 111)
    /* "src/main/resources/Java_16_Grammar.y":483  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),true); };
  break;


  case 112: /* ClassBodyDeclaration: SEMICOLON  */
  if (yyn == 112)
    /* "src/main/resources/Java_16_Grammar.y":484  */
                      { yyval = null; };
  break;


  case 113: /* PureBodyDeclaration: FieldDeclaration  */
  if (yyn == 113)
    /* "src/main/resources/Java_16_Grammar.y":488  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 114: /* PureBodyDeclaration: MethodDeclaration  */
  if (yyn == 114)
    /* "src/main/resources/Java_16_Grammar.y":489  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 115: /* PureBodyDeclaration: ClassDeclaration  */
  if (yyn == 115)
    /* "src/main/resources/Java_16_Grammar.y":490  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 116: /* PureBodyDeclaration: InterfaceDeclaration  */
  if (yyn == 116)
    /* "src/main/resources/Java_16_Grammar.y":491  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 117: /* PureBodyDeclaration: ConstructorDeclaration  */
  if (yyn == 117)
    /* "src/main/resources/Java_16_Grammar.y":492  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 128: /* EnumDeclaration: ENUM IDENTIFIER ClassImplementsOpt EnumBody  */
  if (yyn == 128)
    /* "src/main/resources/Java_16_Grammar.y":522  */
                                                                     { yyval = null; };
  break;


  case 139: /* RecordDeclaration: RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody  */
  if (yyn == 139)
    /* "src/main/resources/Java_16_Grammar.y":550  */
                                                                                                        { yyval = null; };
  break;


  case 188: /* DimsOpt: %empty  */
  if (yyn == 188)
    /* "src/main/resources/Java_16_Grammar.y":700  */
                 { yyval = null; };
  break;


  case 189: /* DimsOpt: Dims  */
  if (yyn == 189)
    /* "src/main/resources/Java_16_Grammar.y":701  */
                 { yyval = ((Dims)(yystack.valueAt (0))); };
  break;


  case 190: /* Dims: Dim  */
  if (yyn == 190)
    /* "src/main/resources/Java_16_Grammar.y":705  */
                { yyval = new Dims(((Dim)(yystack.valueAt (0)))); };
  break;


  case 191: /* Dims: Dims Dim  */
  if (yyn == 191)
    /* "src/main/resources/Java_16_Grammar.y":706  */
                { yyval = ((Dims)(yystack.valueAt (1))).add(((Dim)(yystack.valueAt (0)))); };
  break;


  case 192: /* Dim: AnnotationSeq LBRACKET RBRACKET  */
  if (yyn == 192)
    /* "src/main/resources/Java_16_Grammar.y":710  */
                                      { yyval = new Dim(((Annotations)(yystack.valueAt (2)))); };
  break;


  case 193: /* Dim: LBRACKET RBRACKET  */
  if (yyn == 193)
    /* "src/main/resources/Java_16_Grammar.y":711  */
                                      { yyval = new Dim(null); };
  break;


  case 194: /* InterfaceDeclaration: NormalInterfaceDeclaration  */
  if (yyn == 194)
    /* "src/main/resources/Java_16_Grammar.y":717  */
                                      { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 195: /* InterfaceDeclaration: AnnotationInterfaceDeclaration  */
  if (yyn == 195)
    /* "src/main/resources/Java_16_Grammar.y":718  */
                                      { yyval = null; };
  break;


  case 196: /* NormalInterfaceDeclaration: INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody  */
  if (yyn == 196)
    /* "src/main/resources/Java_16_Grammar.y":723  */
                                         { yyval = new NormalInterfaceDeclaration(((Token)(yystack.valueAt (3))),((TypeParameters)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 197: /* InterfaceExtendsOpt: %empty  */
  if (yyn == 197)
    /* "src/main/resources/Java_16_Grammar.y":727  */
                        { yyval = null; };
  break;


  case 198: /* InterfaceExtendsOpt: InterfaceExtends  */
  if (yyn == 198)
    /* "src/main/resources/Java_16_Grammar.y":728  */
                        { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 199: /* InterfaceExtends: EXTENDS Type  */
  if (yyn == 199)
    /* "src/main/resources/Java_16_Grammar.y":732  */
                                   { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 200: /* InterfaceExtends: InterfaceExtends COMMA Type  */
  if (yyn == 200)
    /* "src/main/resources/Java_16_Grammar.y":733  */
                                   { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 201: /* InterfaceBody: LBRACE RBRACE  */
  if (yyn == 201)
    /* "src/main/resources/Java_16_Grammar.y":737  */
                                                  { yyval = null; };
  break;


  case 202: /* InterfaceBody: LBRACE InterfaceMemberDeclarationSeq RBRACE  */
  if (yyn == 202)
    /* "src/main/resources/Java_16_Grammar.y":738  */
                                                  { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 203: /* InterfaceMemberDeclarationSeq: ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 203)
    /* "src/main/resources/Java_16_Grammar.y":742  */
                                                                              { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 204: /* InterfaceMemberDeclarationSeq: InterfaceMemberDeclarationSeq ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 204)
    /* "src/main/resources/Java_16_Grammar.y":743  */
                                                                              { yyval = ((Declarations)(yystack.valueAt (2))).add(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 205: /* InterfaceMemberDeclaration: ConstantDeclaration  */
  if (yyn == 205)
    /* "src/main/resources/Java_16_Grammar.y":747  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 206: /* InterfaceMemberDeclaration: InterfaceMethodDeclaration  */
  if (yyn == 206)
    /* "src/main/resources/Java_16_Grammar.y":748  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 207: /* InterfaceMemberDeclaration: ClassDeclaration  */
  if (yyn == 207)
    /* "src/main/resources/Java_16_Grammar.y":749  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 208: /* InterfaceMemberDeclaration: InterfaceDeclaration  */
  if (yyn == 208)
    /* "src/main/resources/Java_16_Grammar.y":750  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 211: /* AnnotationInterfaceDeclaration: AT INTERFACE IDENTIFIER AnnotationInterfaceBody  */
  if (yyn == 211)
    /* "src/main/resources/Java_16_Grammar.y":762  */
                                                      { yyval = null; };
  break;


  case 223: /* Block: LBRACE RBRACE  */
  if (yyn == 223)
    /* "src/main/resources/Java_16_Grammar.y":794  */
                                      { yyval = null; };
  break;


  case 224: /* Block: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 224)
    /* "src/main/resources/Java_16_Grammar.y":795  */
                                      { yyval = ((tree.Statement.BlockStatements)(yystack.valueAt (1))); };
  break;


  case 225: /* BlockStatementSeq: BlockStatement  */
  if (yyn == 225)
    /* "src/main/resources/Java_16_Grammar.y":799  */
                                           { yyval = new BlockStatements(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 226: /* BlockStatementSeq: BlockStatementSeq BlockStatement  */
  if (yyn == 226)
    /* "src/main/resources/Java_16_Grammar.y":800  */
                                       { yyval = ((tree.Statement.BlockStatements)(yystack.valueAt (1))).add(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 321: /* Primary: Literal  */
  if (yyn == 321)
    /* "src/main/resources/Java_16_Grammar.y":1026  */
                                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 322: /* Primary: Type DimsOpt DOT CLASS  */
  if (yyn == 322)
    /* "src/main/resources/Java_16_Grammar.y":1027  */
                                        { yyval = new ClassLiteral(((tree.Type.Type)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2)))); };
  break;


  case 323: /* Primary: VOID DimsOpt DOT CLASS  */
  if (yyn == 323)
    /* "src/main/resources/Java_16_Grammar.y":1028  */
                                        { yyval = new ClassLiteral(null,((Dims)(yystack.valueAt (2)))); };
  break;


  case 324: /* Primary: THIS  */
  if (yyn == 324)
    /* "src/main/resources/Java_16_Grammar.y":1029  */
                                        { yyval = new This(null); };
  break;


  case 325: /* Primary: Type DOT THIS  */
  if (yyn == 325)
    /* "src/main/resources/Java_16_Grammar.y":1030  */
                                        { yyval = new This(((tree.Type.Type)(yystack.valueAt (2)))); };
  break;


  case 326: /* Primary: LPAREN Expression RPAREN  */
  if (yyn == 326)
    /* "src/main/resources/Java_16_Grammar.y":1031  */
                                        { yyval = new Parenthesized(((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 328: /* Primary: FieldAccess  */
  if (yyn == 328)
    /* "src/main/resources/Java_16_Grammar.y":1033  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 329: /* Primary: ArrayAccess  */
  if (yyn == 329)
    /* "src/main/resources/Java_16_Grammar.y":1034  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 341: /* TypeArgumentsOpt: %empty  */
  if (yyn == 341)
    /* "src/main/resources/Java_16_Grammar.y":1067  */
                      { yyval = null; };
  break;


  case 342: /* TypeArgumentsOpt: TypeArguments  */
  if (yyn == 342)
    /* "src/main/resources/Java_16_Grammar.y":1068  */
                      { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (0))); };
  break;


  case 343: /* TypeArguments: LESS TypeArgumentList GREATER  */
  if (yyn == 343)
    /* "src/main/resources/Java_16_Grammar.y":1072  */
                                     { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (1))); };
  break;


  case 344: /* TypeArgumentList: TypeArgument  */
  if (yyn == 344)
    /* "src/main/resources/Java_16_Grammar.y":1076  */
                                           { yyval = new TypeArguments(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 345: /* TypeArgumentList: TypeArgumentList COMMA TypeArgument  */
  if (yyn == 345)
    /* "src/main/resources/Java_16_Grammar.y":1077  */
                                           { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (2))).add(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 346: /* TypeArgument: Type  */
  if (yyn == 346)
    /* "src/main/resources/Java_16_Grammar.y":1081  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),0,null); };
  break;


  case 347: /* TypeArgument: QUESTION  */
  if (yyn == 347)
    /* "src/main/resources/Java_16_Grammar.y":1082  */
                                               { yyval = new TypeArgument(null,1,null); };
  break;


  case 348: /* TypeArgument: QUESTION EXTENDS Type  */
  if (yyn == 348)
    /* "src/main/resources/Java_16_Grammar.y":1083  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),1,null); };
  break;


  case 349: /* TypeArgument: QUESTION SUPER Type  */
  if (yyn == 349)
    /* "src/main/resources/Java_16_Grammar.y":1084  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,null); };
  break;


  case 350: /* TypeArgument: AnnotationSeq QUESTION  */
  if (yyn == 350)
    /* "src/main/resources/Java_16_Grammar.y":1085  */
                                               { yyval = new TypeArgument(null,1,((Annotations)(yystack.valueAt (1)))); };
  break;


  case 351: /* TypeArgument: AnnotationSeq QUESTION EXTENDS Type  */
  if (yyn == 351)
    /* "src/main/resources/Java_16_Grammar.y":1086  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 352: /* TypeArgument: AnnotationSeq QUESTION SUPER Type  */
  if (yyn == 352)
    /* "src/main/resources/Java_16_Grammar.y":1087  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),3,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 353: /* FieldAccess: Primary DOT IDENTIFIER  */
  if (yyn == 353)
    /* "src/main/resources/Java_16_Grammar.y":1097  */
                                             { yyval = new FieldAccess(((tree.Expression.Expression)(yystack.valueAt (2))),  false,((Token)(yystack.valueAt (0)))); };
  break;


  case 354: /* FieldAccess: SUPER DOT IDENTIFIER  */
  if (yyn == 354)
    /* "src/main/resources/Java_16_Grammar.y":1098  */
                                             { yyval = new FieldAccess(null,true, ((Token)(yystack.valueAt (0)))); };
  break;


  case 355: /* FieldAccess: CompoundName DOT SUPER DOT IDENTIFIER  */
  if (yyn == 355)
    /* "src/main/resources/Java_16_Grammar.y":1099  */
                                             { yyval = new FieldAccess(new SimpleReference(((CompoundName)(yystack.valueAt (4)))),true,((Token)(yystack.valueAt (0)))); };
  break;


  case 356: /* ArrayAccess: CompoundName LBRACKET Expression RBRACKET  */
  if (yyn == 356)
    /* "src/main/resources/Java_16_Grammar.y":1103  */
                                                 { yyval = new ArrayAccess(new SimpleReference(((CompoundName)(yystack.valueAt (3)))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 357: /* ArrayAccess: Primary LBRACKET Expression RBRACKET  */
  if (yyn == 357)
    /* "src/main/resources/Java_16_Grammar.y":1104  */
                                                 { yyval = new ArrayAccess(((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 363: /* Arguments: LPAREN RPAREN  */
  if (yyn == 363)
    /* "src/main/resources/Java_16_Grammar.y":1116  */
                                 { yyval = null; };
  break;


  case 364: /* Arguments: LPAREN ArgumentList RPAREN  */
  if (yyn == 364)
    /* "src/main/resources/Java_16_Grammar.y":1117  */
                                 { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (1))); };
  break;


  case 365: /* ArgumentList: Expression  */
  if (yyn == 365)
    /* "src/main/resources/Java_16_Grammar.y":1126  */
                                    { yyval = new ArgumentList(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 366: /* ArgumentList: ArgumentList COMMA Expression  */
  if (yyn == 366)
    /* "src/main/resources/Java_16_Grammar.y":1127  */
                                    { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 379: /* Expression: LambdaExpression  */
  if (yyn == 379)
    /* "src/main/resources/Java_16_Grammar.y":1157  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 380: /* Expression: AssignmentExpression  */
  if (yyn == 380)
    /* "src/main/resources/Java_16_Grammar.y":1158  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 381: /* LambdaExpression: IDENTIFIER ARROW Expression  */
  if (yyn == 381)
    /* "src/main/resources/Java_16_Grammar.y":1163  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 382: /* LambdaExpression: IDENTIFIER ARROW Block  */
  if (yyn == 382)
    /* "src/main/resources/Java_16_Grammar.y":1165  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 383: /* LambdaExpression: LambdaParameters ARROW Expression  */
  if (yyn == 383)
    /* "src/main/resources/Java_16_Grammar.y":1166  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 384: /* LambdaExpression: LambdaParameters ARROW Block  */
  if (yyn == 384)
    /* "src/main/resources/Java_16_Grammar.y":1167  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 385: /* LambdaParameters: LPAREN RPAREN  */
  if (yyn == 385)
    /* "src/main/resources/Java_16_Grammar.y":1176  */
                                           { yyval = null; };
  break;


  case 386: /* LambdaParameters: LPAREN LambdaParameterList1 RPAREN  */
  if (yyn == 386)
    /* "src/main/resources/Java_16_Grammar.y":1177  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 387: /* LambdaParameters: LPAREN LambdaParameterList2 RPAREN  */
  if (yyn == 387)
    /* "src/main/resources/Java_16_Grammar.y":1178  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 388: /* LambdaParameterList1: IDENTIFIER  */
  if (yyn == 388)
    /* "src/main/resources/Java_16_Grammar.y":1183  */
                                             { yyval = new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 389: /* LambdaParameterList1: LambdaParameterList1 COMMA IDENTIFIER  */
  if (yyn == 389)
    /* "src/main/resources/Java_16_Grammar.y":1184  */
                                             { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(new ParameterDeclaration(((Token)(yystack.valueAt (0))))); };
  break;


  case 390: /* LambdaParameterList2: LambdaParameter  */
  if (yyn == 390)
    /* "src/main/resources/Java_16_Grammar.y":1188  */
                                                 { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 391: /* LambdaParameterList2: LambdaParameterList2 COMMA LambdaParameter  */
  if (yyn == 391)
    /* "src/main/resources/Java_16_Grammar.y":1189  */
                                                 { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 392: /* LambdaParameter: ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt  */
  if (yyn == 392)
    /* "src/main/resources/Java_16_Grammar.y":1200  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 393: /* LambdaParameter: ModifierSeqOpt VAR IDENTIFIER DimsOpt  */
  if (yyn == 393)
    /* "src/main/resources/Java_16_Grammar.y":1201  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),null,((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 394: /* LambdaParameter: ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 394)
    /* "src/main/resources/Java_16_Grammar.y":1203  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (4))),((tree.Type.UnannotatedType)(yystack.valueAt (3))),((Token)(yystack.valueAt (0))).image,((Annotations)(yystack.valueAt (2))),true,null); };
  break;


  case 395: /* AssignmentExpression: ConditionalExpression  */
  if (yyn == 395)
    /* "src/main/resources/Java_16_Grammar.y":1213  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 396: /* AssignmentExpression: Assignment  */
  if (yyn == 396)
    /* "src/main/resources/Java_16_Grammar.y":1214  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 397: /* Assignment: LeftHandSide AssignmentOperator Expression  */
  if (yyn == 397)
    /* "src/main/resources/Java_16_Grammar.y":1218  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 398: /* LeftHandSide: CompoundName  */
  if (yyn == 398)
    /* "src/main/resources/Java_16_Grammar.y":1222  */
                   { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 399: /* LeftHandSide: FieldAccess  */
  if (yyn == 399)
    /* "src/main/resources/Java_16_Grammar.y":1223  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 400: /* LeftHandSide: ArrayAccess  */
  if (yyn == 400)
    /* "src/main/resources/Java_16_Grammar.y":1224  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 401: /* AssignmentOperator: EQUAL  */
  if (yyn == 401)
    /* "src/main/resources/Java_16_Grammar.y":1228  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 402: /* AssignmentOperator: STAR_EQUAL  */
  if (yyn == 402)
    /* "src/main/resources/Java_16_Grammar.y":1229  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 403: /* AssignmentOperator: SLASH_EQUAL  */
  if (yyn == 403)
    /* "src/main/resources/Java_16_Grammar.y":1230  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 404: /* AssignmentOperator: PERCENT_EQUAL  */
  if (yyn == 404)
    /* "src/main/resources/Java_16_Grammar.y":1231  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 405: /* AssignmentOperator: PLUS_EQUAL  */
  if (yyn == 405)
    /* "src/main/resources/Java_16_Grammar.y":1232  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 406: /* AssignmentOperator: MINUS_EQUAL  */
  if (yyn == 406)
    /* "src/main/resources/Java_16_Grammar.y":1233  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 407: /* AssignmentOperator: LESS_LESS_EQUAL  */
  if (yyn == 407)
    /* "src/main/resources/Java_16_Grammar.y":1234  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 408: /* AssignmentOperator: GR_GR_EQUAL  */
  if (yyn == 408)
    /* "src/main/resources/Java_16_Grammar.y":1235  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 409: /* AssignmentOperator: GR_GR_GR_EQUAL  */
  if (yyn == 409)
    /* "src/main/resources/Java_16_Grammar.y":1236  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 410: /* AssignmentOperator: AMP_EQUAL  */
  if (yyn == 410)
    /* "src/main/resources/Java_16_Grammar.y":1237  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 411: /* AssignmentOperator: CARET_EQUAL  */
  if (yyn == 411)
    /* "src/main/resources/Java_16_Grammar.y":1238  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 412: /* AssignmentOperator: VERTICAL_EQUAL  */
  if (yyn == 412)
    /* "src/main/resources/Java_16_Grammar.y":1239  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 413: /* ConditionalExpression: ConditionalOrExpression ConditionalOrTail  */
  if (yyn == 413)
    /* "src/main/resources/Java_16_Grammar.y":1243  */
                                                { if ( ((tree.Expression.Binary)(yystack.valueAt (0))) == null ) yyval = ((tree.Expression.Binary)(yystack.valueAt (1)));
                                                  else              yyval = new Conditional(((tree.Expression.Binary)(yystack.valueAt (1))),((tree.Expression.Binary)(yystack.valueAt (0))).left,((tree.Expression.Binary)(yystack.valueAt (0))).right); };
  break;


  case 414: /* ConditionalOrTail: %empty  */
  if (yyn == 414)
    /* "src/main/resources/Java_16_Grammar.y":1248  */
                                                       { yyval = null; };
  break;


  case 415: /* ConditionalOrTail: QUESTION Expression COLON ConditionalExpression  */
  if (yyn == 415)
    /* "src/main/resources/Java_16_Grammar.y":1249  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 416: /* ConditionalOrTail: QUESTION Expression COLON LambdaExpression  */
  if (yyn == 416)
    /* "src/main/resources/Java_16_Grammar.y":1250  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 417: /* ConditionalOrExpression: ConditionalAndExpression  */
  if (yyn == 417)
    /* "src/main/resources/Java_16_Grammar.y":1254  */
                                                                    { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 418: /* ConditionalOrExpression: ConditionalOrExpression DBL_VERTICAL ConditionalAndExpression  */
  if (yyn == 418)
    /* "src/main/resources/Java_16_Grammar.y":1255  */
                                                                    { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 419: /* ConditionalAndExpression: InclusiveOrExpression  */
  if (yyn == 419)
    /* "src/main/resources/Java_16_Grammar.y":1259  */
                                                                   { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 420: /* ConditionalAndExpression: ConditionalAndExpression DBL_AMPERSAND InclusiveOrExpression  */
  if (yyn == 420)
    /* "src/main/resources/Java_16_Grammar.y":1260  */
                                                                   { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 421: /* InclusiveOrExpression: ExclusiveOrExpression  */
  if (yyn == 421)
    /* "src/main/resources/Java_16_Grammar.y":1264  */
                                                           { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 422: /* InclusiveOrExpression: InclusiveOrExpression VERTICAL ExclusiveOrExpression  */
  if (yyn == 422)
    /* "src/main/resources/Java_16_Grammar.y":1265  */
                                                           { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 423: /* ExclusiveOrExpression: AndExpression  */
  if (yyn == 423)
    /* "src/main/resources/Java_16_Grammar.y":1269  */
                                                { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 424: /* ExclusiveOrExpression: ExclusiveOrExpression CARET AndExpression  */
  if (yyn == 424)
    /* "src/main/resources/Java_16_Grammar.y":1270  */
                                                { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 425: /* AndExpression: EqualityExpression  */
  if (yyn == 425)
    /* "src/main/resources/Java_16_Grammar.y":1274  */
                                                 { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 426: /* AndExpression: AndExpression AMPERSAND EqualityExpression  */
  if (yyn == 426)
    /* "src/main/resources/Java_16_Grammar.y":1275  */
                                                 { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 427: /* EqualityExpression: RelationalExpression  */
  if (yyn == 427)
    /* "src/main/resources/Java_16_Grammar.y":1279  */
                                                        { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 428: /* EqualityExpression: EqualityExpression DBL_EQUAL RelationalExpression  */
  if (yyn == 428)
    /* "src/main/resources/Java_16_Grammar.y":1280  */
                                                        { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 429: /* EqualityExpression: EqualityExpression NON_EQUAL RelationalExpression  */
  if (yyn == 429)
    /* "src/main/resources/Java_16_Grammar.y":1281  */
                                                        { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 430: /* RelationalExpression: ShiftExpression  */
  if (yyn == 430)
    /* "src/main/resources/Java_16_Grammar.y":1285  */
                                                         { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 431: /* RelationalExpression: RelationalExpression LESS ShiftExpression  */
  if (yyn == 431)
    /* "src/main/resources/Java_16_Grammar.y":1286  */
                                                         { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 432: /* RelationalExpression: RelationalExpression GREATER ShiftExpression  */
  if (yyn == 432)
    /* "src/main/resources/Java_16_Grammar.y":1287  */
                                                         { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 433: /* RelationalExpression: RelationalExpression LESS_EQUAL ShiftExpression  */
  if (yyn == 433)
    /* "src/main/resources/Java_16_Grammar.y":1288  */
                                                         { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 434: /* RelationalExpression: RelationalExpression GREATER_EQUAL ShiftExpression  */
  if (yyn == 434)
    /* "src/main/resources/Java_16_Grammar.y":1289  */
                                                         { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 435: /* RelationalExpression: InstanceofExpression  */
  if (yyn == 435)
    /* "src/main/resources/Java_16_Grammar.y":1290  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 436: /* InstanceofExpression: RelationalExpression INSTANCEOF Type  */
  if (yyn == 436)
    /* "src/main/resources/Java_16_Grammar.y":1294  */
                                               { yyval = new InstanceOf(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 437: /* InstanceofExpression: RelationalExpression INSTANCEOF Pattern  */
  if (yyn == 437)
    /* "src/main/resources/Java_16_Grammar.y":1295  */
                                               { yyval = new InstanceOf(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 438: /* ShiftExpression: AdditiveExpression  */
  if (yyn == 438)
    /* "src/main/resources/Java_16_Grammar.y":1299  */
                                                       { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 439: /* ShiftExpression: ShiftExpression DBL_LESS AdditiveExpression  */
  if (yyn == 439)
    /* "src/main/resources/Java_16_Grammar.y":1300  */
                                                       { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 440: /* ShiftExpression: ShiftExpression DBL_GREATER AdditiveExpression  */
  if (yyn == 440)
    /* "src/main/resources/Java_16_Grammar.y":1301  */
                                                       { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 441: /* ShiftExpression: ShiftExpression TRIPL_GREATER AdditiveExpression  */
  if (yyn == 441)
    /* "src/main/resources/Java_16_Grammar.y":1302  */
                                                       { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 442: /* AdditiveExpression: MultiplicativeExpression  */
  if (yyn == 442)
    /* "src/main/resources/Java_16_Grammar.y":1306  */
                                                        { yyval = ((tree.Expression.Binary)(yystack.valueAt (0))); };
  break;


  case 443: /* AdditiveExpression: AdditiveExpression PLUS MultiplicativeExpression  */
  if (yyn == 443)
    /* "src/main/resources/Java_16_Grammar.y":1307  */
                                                        { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 444: /* AdditiveExpression: AdditiveExpression MINUS MultiplicativeExpression  */
  if (yyn == 444)
    /* "src/main/resources/Java_16_Grammar.y":1308  */
                                                        { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Binary)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 445: /* MultiplicativeExpression: UnaryExpression  */
  if (yyn == 445)
    /* "src/main/resources/Java_16_Grammar.y":1312  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 446: /* MultiplicativeExpression: MultiplicativeExpression STAR UnaryExpression  */
  if (yyn == 446)
    /* "src/main/resources/Java_16_Grammar.y":1313  */
                                                       { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 447: /* MultiplicativeExpression: MultiplicativeExpression SLASH UnaryExpression  */
  if (yyn == 447)
    /* "src/main/resources/Java_16_Grammar.y":1314  */
                                                       { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 448: /* MultiplicativeExpression: MultiplicativeExpression PERCENT UnaryExpression  */
  if (yyn == 448)
    /* "src/main/resources/Java_16_Grammar.y":1315  */
                                                       { yyval = new Binary(((tree.Expression.Binary)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 449: /* UnaryExpression: PreIncrementExpression  */
  if (yyn == 449)
    /* "src/main/resources/Java_16_Grammar.y":1319  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 450: /* UnaryExpression: PreDecrementExpression  */
  if (yyn == 450)
    /* "src/main/resources/Java_16_Grammar.y":1320  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 451: /* UnaryExpression: PLUS UnaryExpression  */
  if (yyn == 451)
    /* "src/main/resources/Java_16_Grammar.y":1321  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 452: /* UnaryExpression: MINUS UnaryExpression  */
  if (yyn == 452)
    /* "src/main/resources/Java_16_Grammar.y":1322  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 453: /* UnaryExpression: UnaryExpressionNotPlusMinus  */
  if (yyn == 453)
    /* "src/main/resources/Java_16_Grammar.y":1323  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 454: /* PreIncrementExpression: DBL_PLUS UnaryExpression  */
  if (yyn == 454)
    /* "src/main/resources/Java_16_Grammar.y":1327  */
                               { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 455: /* PreDecrementExpression: DBL_MINUS UnaryExpression  */
  if (yyn == 455)
    /* "src/main/resources/Java_16_Grammar.y":1331  */
                                 { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 457: /* UnaryExpressionNotPlusMinus: TILDE UnaryExpression  */
  if (yyn == 457)
    /* "src/main/resources/Java_16_Grammar.y":1336  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 458: /* UnaryExpressionNotPlusMinus: EXCLAMATION UnaryExpression  */
  if (yyn == 458)
    /* "src/main/resources/Java_16_Grammar.y":1337  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 459: /* UnaryExpressionNotPlusMinus: CastExpression  */
  if (yyn == 459)
    /* "src/main/resources/Java_16_Grammar.y":1338  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 460: /* UnaryExpressionNotPlusMinus: SwitchExpression  */
  if (yyn == 460)
    /* "src/main/resources/Java_16_Grammar.y":1339  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 461: /* PostfixExpression: Primary  */
  if (yyn == 461)
    /* "src/main/resources/Java_16_Grammar.y":1343  */
                               { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 462: /* PostfixExpression: CompoundName  */
  if (yyn == 462)
    /* "src/main/resources/Java_16_Grammar.y":1344  */
                               { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 463: /* PostfixExpression: PostIncrementExpression  */
  if (yyn == 463)
    /* "src/main/resources/Java_16_Grammar.y":1345  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 464: /* PostfixExpression: PostDecrementExpression  */
  if (yyn == 464)
    /* "src/main/resources/Java_16_Grammar.y":1346  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 465: /* PostIncrementExpression: PostfixExpression DBL_PLUS  */
  if (yyn == 465)
    /* "src/main/resources/Java_16_Grammar.y":1350  */
                                 { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 466: /* PostDecrementExpression: PostfixExpression DBL_MINUS  */
  if (yyn == 466)
    /* "src/main/resources/Java_16_Grammar.y":1354  */
                                  { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 467: /* CastExpression: TargetType UnaryExpression  */
  if (yyn == 467)
    /* "src/main/resources/Java_16_Grammar.y":1358  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 468: /* CastExpression: TargetType LambdaExpression  */
  if (yyn == 468)
    /* "src/main/resources/Java_16_Grammar.y":1359  */
                                   { yyval = new Cast(((tree.Type.TypeList)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 469: /* TargetType: LPAREN TypeList RPAREN  */
  if (yyn == 469)
    /* "src/main/resources/Java_16_Grammar.y":1363  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (1))); };
  break;


  case 470: /* TypeList: Type  */
  if (yyn == 470)
    /* "src/main/resources/Java_16_Grammar.y":1367  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 471: /* TypeList: TypeList AMPERSAND Type  */
  if (yyn == 471)
    /* "src/main/resources/Java_16_Grammar.y":1368  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 473: /* AnnotationSeqOpt: %empty  */
  if (yyn == 473)
    /* "src/main/resources/Java_16_Grammar.y":1384  */
                       { yyval = null; };
  break;


  case 474: /* AnnotationSeqOpt: AnnotationSeq  */
  if (yyn == 474)
    /* "src/main/resources/Java_16_Grammar.y":1385  */
                       { yyval = ((Annotations)(yystack.valueAt (0))); };
  break;


  case 475: /* AnnotationSeq: Annotation  */
  if (yyn == 475)
    /* "src/main/resources/Java_16_Grammar.y":1389  */
                                { yyval = new Annotations(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 476: /* AnnotationSeq: AnnotationSeq Annotation  */
  if (yyn == 476)
    /* "src/main/resources/Java_16_Grammar.y":1390  */
                                { yyval = ((Annotations)(yystack.valueAt (1))).add(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 477: /* Annotation: AT CompoundName  */
  if (yyn == 477)
    /* "src/main/resources/Java_16_Grammar.y":1394  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (0))),(AnnoParameterList)null); };
  break;


  case 478: /* Annotation: AT CompoundName LPAREN RPAREN  */
  if (yyn == 478)
    /* "src/main/resources/Java_16_Grammar.y":1395  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (2))),(AnnoParameterList)null); };
  break;


  case 479: /* Annotation: AT CompoundName LPAREN AnnoParameterList RPAREN  */
  if (yyn == 479)
    /* "src/main/resources/Java_16_Grammar.y":1396  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),/*$4*/ (AnnoParameterList)null); };
  break;


  case 480: /* Annotation: AT CompoundName LPAREN ElementValue RPAREN  */
  if (yyn == 480)
    /* "src/main/resources/Java_16_Grammar.y":1397  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),(AnnoElementValue)null); };
  break;


  case 483: /* ElementValue: ConditionalExpression  */
  if (yyn == 483)
    /* "src/main/resources/Java_16_Grammar.y":1406  */
                                                 { yyval = null; };
  break;


  case 484: /* ElementValue: LBRACE ElementValueListOpt RBRACE  */
  if (yyn == 484)
    /* "src/main/resources/Java_16_Grammar.y":1407  */
                                                 { yyval = null; };
  break;


  case 485: /* ElementValue: LBRACE COMMA RBRACE  */
  if (yyn == 485)
    /* "src/main/resources/Java_16_Grammar.y":1408  */
                                                 { yyval = null; };
  break;


  case 486: /* ElementValue: Annotation  */
  if (yyn == 486)
    /* "src/main/resources/Java_16_Grammar.y":1409  */
                                                 { yyval = null; };
  break;



/* "src/main/java/parser/JavaParser.java":3100  */

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

  private static final short yypact_ninf_ = -730;
  private static final short yytable_ninf_ = -487;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
    1429,    54,  -730,  -730,  -730,    -6,  -730,    54,  -730,  -730,
    -730,  -730,  -730,  -730,  -730,  -730,    51,  -730,   502,  -730,
     205,  -730,  -730,   217,  -730,  -730,   325,  -730,  -730,   252,
      54,   526,   571,    54,  -730,  -730,    82,  -730,  1068,   502,
    -730,  2914,   107,   616,    52,  -730,   146,   220,   172,   292,
     317,   333,   358,  -730,  -730,  -730,  -730,  -730,  -730,  -730,
    -730,    82,  3611,  -730,  2990,  3680,  3680,  3680,  3680,  3680,
    3680,   150,  -730,  -730,  -730,  -730,  -730,  -730,  -730,  -730,
    -730,  -730,  -730,  -730,  2955,  -730,  -730,   416,   417,  -730,
    -730,   319,  -730,   436,   493,   319,  -730,   566,  -730,  -730,
    -730,  -730,  -730,  -730,  -730,  -730,    41,   409,   458,   482,
     539,   603,   149,  -730,   355,   625,   623,  -730,  -730,  -730,
    -730,   609,  -730,  -730,  -730,  3611,  -730,  2095,   508,   463,
     520,  -730,    67,  -730,   532,  1529,   370,   510,   553,   494,
     553,   553,  -730,  2804,   270,  4447,   493,  1614,  2239,   586,
    -730,   569,  -730,  -730,  2351,  -730,   300,   591,   600,  -730,
     432,  -730,  -730,  -730,  -730,  -730,  -730,  3128,  3197,  -730,
    1115,   311,   379,   605,  -730,   187,   613,  3611,   627,   630,
     319,  -730,   381,  3611,    42,   613,  -730,   353,   613,   668,
    -730,  3611,    24,   613,  3611,  3680,  -730,  3680,  3680,  3680,
    3680,  3680,  3680,  3680,  3680,  3680,  3680,   913,  3680,  3680,
    3680,  3680,  3680,  3680,  3680,  3680,  -730,  -730,  -730,  -730,
     319,  -730,   626,  -730,   677,  -730,  -730,  1626,   238,    54,
      54,    54,    54,   694,   370,  -730,   697,    79,   634,  -730,
    2095,   705,   646,   720,  -730,   309,  2096,   512,   530,  -730,
    4270,  3266,  -730,  3266,  -730,  -730,  -730,  -730,  -730,  -730,
    -730,  -730,  -730,  -730,  -730,  -730,  3611,  -730,  2095,  -730,
    -730,  3197,  -730,   543,  -730,  -730,   148,  -730,   393,  -730,
    1871,  3335,   348,   379,  -730,   403,   600,   303,   670,   605,
    -730,   673,   679,   724,  -730,   664,  -730,   728,   729,   613,
     732,  -730,   685,   689,   731,  -730,   155,   678,   740,  -730,
    -730,   693,   695,   738,   409,   458,   482,   539,   603,   149,
     149,   355,   355,   355,   355,   700,  -730,    29,  -730,  -730,
     625,   625,   625,   623,   623,  -730,  -730,  -730,   723,  -730,
     650,   660,    54,    22,    35,   674,    11,  -730,  -730,  1477,
    -730,   686,   405,  -730,  -730,    79,  2095,   494,  -730,   750,
     142,  -730,  2095,   756,   754,   259,   494,   716,    61,  -730,
     717,  -730,   325,  2142,  -730,  -730,  -730,  -730,  -730,  -730,
    -730,  -730,  3611,  2095,  2095,  1115,  -730,   190,   760,  3404,
    -730,  -730,  -730,  3473,   770,   605,  -730,  -730,  -730,   600,
    -730,   771,  -730,  -730,  -730,   188,   600,  -730,   613,  -730,
    -730,  -730,  -730,   600,  -730,  3611,   267,   768,  -730,   768,
    3197,  -730,  -730,   684,  -730,    54,  -730,    54,  -730,    54,
    -730,  1759,  4169,  2095,    79,  -730,  -730,  -730,   770,  2095,
     454,  -730,   733,  -730,  4201,  -730,  2095,   546,  -730,  1276,
     785,   319,   319,   761,   381,  -730,  -730,  3611,  -730,  -730,
     378,  3611,   100,   105,  2702,   788,   791,  3542,   792,   793,
    3611,   442,   794,  3611,  1984,  -730,  2254,  -730,  -730,  -730,
    -730,   787,  -730,  -730,  -730,  -730,  -730,   531,   542,  -730,
    -730,  -730,   609,   651,   653,  -730,  -730,  -730,  -730,  2095,
    2095,  -730,  -730,   489,   790,  -730,  -730,   796,   935,  -730,
    -730,   751,  -730,   236,  -730,  -730,   752,  -730,   753,  -730,
    -730,  -730,  3611,   296,   700,  -730,  -730,   799,   469,   504,
     580,   161,   700,    69,  -730,  -730,  -730,  -730,  -730,  -730,
    1759,  -730,   802,   759,  2095,  -730,  -730,  -730,    71,  4005,
     804,   600,  -730,  2867,  4228,  -730,  -730,   605,    83,  4032,
    -730,  -730,  -730,   762,  2702,   703,  -730,   809,  -730,   810,
     793,   709,  3739,  3611,  -730,   813,  3611,  3611,   815,  3918,
     168,   822,  3611,   819,    29,  -730,  -730,  -730,   820,  -730,
    -730,  -730,  -730,  -730,  -730,   826,  3404,  -730,  -730,  -730,
     822,  4324,  4078,  -730,  -730,  -730,  3680,  -730,   160,  -730,
     170,  -730,  1694,   308,   600,  -730,  -730,   830,  -730,    54,
    -730,  -730,  -730,   598,   833,  -730,  2095,  -730,  -730,   831,
    4110,  -730,   770,   797,   129,  -730,   421,   151,  -730,  -730,
    -730,  -730,  -730,  2867,  -730,  -730,   811,  -730,  4361,  -730,
    4137,  -730,  -730,  -730,  -730,  3611,  -730,  -730,   838,   835,
    -730,   837,   841,   848,  -730,   849,   850,  -730,   464,  -730,
     297,  -730,   566,   340,   852,   822,   168,  -730,  -730,   795,
     853,  -730,  -730,  -730,  -730,  -730,   167,  -730,   805,   421,
    -730,  -730,   757,  -730,  -730,   151,  -730,  -730,  -730,   847,
    -730,  -730,  -730,   834,  -730,  -730,  1806,   854,   855,  1918,
     857,  -730,  3059,  -730,  -730,   799,  -730,   860,  -730,  -730,
    -730,   858,   757,   757,   797,   797,   129,   995,  -730,  -730,
    -730,  -730,   814,   867,  -730,  -730,   862,  3611,  3611,  3611,
    3798,  2702,   771,   822,  -730,  3859,   325,  -730,  -730,  -730,
     798,   795,  2702,   375,   635,   871,  2095,   867,  -730,  3680,
    -730,  -730,  3611,  -730,   866,   319,  3973,  -730,  -730,   757,
     757,   757,   797,  -730,  2030,  -730,  -730,   861,   874,   873,
    -730,  -730,   821,  -730,  -730,  -730,  -730,  2095,   879,  -730,
    -730,  -730,  -730,  4270,   750,  -730,  -730,   876,  -730,   816,
     319,  1276,    45,   601,  -730,  -730,  -730,  -730,   757,  -730,
     451,  2366,  2478,   567,   460,   880,  2702,  3798,  2702,  -730,
    -730,    23,   822,   602,  -730,  3197,   885,  -730,    45,   351,
    -730,  -730,   868,   319,  4270,  -730,    42,  -730,  2590,  -730,
      24,   600,   600,  -730,  -730,   841,   893,  -730,  2095,   319,
    -730,  -730,  -730,  -730,  -730,   801,  -730,   844,  -730,  -730,
     -15,  -730,    26,   890,   891,  2702,  -730,  -730,  -730,  -730,
     600,   600,  -730,  -730,  -730,   894,   897,  -730,  -730
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
    -730,  -730,   461,   213,  -729,   -10,   257,  -730,  -730,  -730,
     875,  -730,    -4,  -730,   807,   869,  -730,  -730,   710,   222,
    -730,   182,   506,  -730,  -390,  -730,   484,  -503,  -730,   500,
     584,  -730,    -3,   189,  -730,  -730,  -418,   394,  -537,  -730,
    -730,  -730,   192,  -730,  -730,  -730,  -730,   399,   402,  -730,
    -730,  -730,   395,  -730,  -730,   301,  -730,  -316,   430,  -267,
    -730,  -730,   361,  -730,  -539,  -607,   165,   128,   136,  -431,
     271,   -60,  -166,   154,  -389,   496,  -730,  -730,  -730,  -730,
     328,  -519,  -730,  -730,  -730,  -730,   428,  -730,  -730,  -202,
    -369,  -471,  -730,  -196,  -454,  -730,  -730,  -565,  -730,  -730,
     230,  -730,   365,  -730,   367,   371,  -488,  -730,  -730,  -730,
    -730,  -730,  -730,   158,  -730,  -730,  -730,   304,  -647,  -730,
    -730,  -730,  -648,  -730,  -730,   241,  -730,  -566,   560,  -157,
    -730,  -730,    96,   -85,  -730,   604,   -11,   714,   575,  -272,
    -730,  -730,  -730,  -730,   704,   712,  -113,  -730,  -730,  -730,
     618,  -588,   644,  -730,  -730,   -40,  -730,  -730,   800,   803,
     808,   789,   812,   515,  -730,   413,   433,   507,     4,   659,
     726,  -730,   739,   856,   872,  -730,  -730,  -730,  -730,   -98,
       0,   -24,  -730,   -61,  -730
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
     546,    42,   649,    26,   105,   613,   722,   301,   749,   748,
     100,   179,    42,   424,   640,   310,   178,   801,    26,   406,
     128,   534,   535,   170,   848,    42,   426,     1,    28,   374,
     636,   376,   178,   100,   100,   100,   100,   100,   100,   100,
     186,   170,   695,     1,   801,   698,   134,   194,   178,   161,
     162,   163,   164,   165,   166,   288,   178,   849,   309,     1,
     413,   224,   549,   416,   585,   870,   186,     1,   195,     1,
     178,   182,    30,   698,   182,   182,   131,     1,   689,   829,
      48,     1,   790,    40,   748,   801,   131,   275,    28,   695,
     653,   566,   299,   649,   100,   452,   568,   769,   770,   771,
     703,   131,   707,   624,   640,  -473,   871,   512,   105,   219,
     299,    37,   429,   351,   517,    26,   178,   645,    33,   425,
     636,   519,   300,   250,   128,   689,   182,     1,   830,    49,
     534,   535,   427,   167,   567,    50,   373,   100,    40,   569,
       1,   131,   728,   635,   638,   808,   701,    51,   203,   204,
     280,   796,   285,   289,   178,   781,   704,    52,   168,   672,
     182,   205,   206,   721,   100,     1,   100,   100,   100,   100,
     100,   100,   100,   100,   100,   100,  -473,   100,   100,   100,
     100,   100,   100,   100,   100,    35,   170,   170,   813,   409,
     380,   687,   696,    16,   720,    28,   623,   335,   336,   337,
     182,   753,   383,   391,   606,   136,    40,    26,     5,   607,
      42,   105,   207,   674,   606,     1,    36,   355,   590,   607,
      39,   290,   515,   410,   146,   675,   137,   128,   384,   190,
     523,    61,   660,   635,   638,    41,    40,   137,   687,   696,
     100,    40,    42,  -141,   499,    40,   172,   449,  -141,   580,
     453,   291,   292,   167,   178,    34,     2,     1,   588,   632,
     302,   303,   182,   285,   306,     1,     3,   782,   311,   312,
     500,   767,   768,     4,   251,   522,    34,   511,   791,     5,
     606,   744,   520,   178,   267,   607,   604,     6,   745,     8,
       9,    10,   167,   395,     1,    11,    12,   268,  -388,    13,
     711,    42,   170,    14,   617,   146,   178,   182,   396,    15,
     170,    40,   712,   251,   296,   543,   340,     1,   805,   806,
     807,   590,   713,     1,  -319,   341,   138,   604,    36,    26,
     714,  -319,   277,   389,   438,   178,   246,   604,   178,   525,
     289,   855,   844,   450,   847,   289,     1,   590,   454,     1,
     754,   139,    26,   250,   190,   521,   659,   835,   766,   679,
     105,   167,   178,   397,     2,   280,   281,   140,   297,   326,
     564,   561,   562,     1,     3,   289,   128,     1,   685,     1,
     604,     4,   385,   522,   100,   812,   208,   209,   210,   100,
     393,   874,   141,   386,   434,     6,   182,     8,     9,    10,
     177,     1,   358,    11,    12,   435,   175,    13,   604,   176,
      40,    14,    26,   544,   355,   730,   296,    15,   270,     1,
      61,   271,   838,   183,    26,   579,   184,   373,   604,   185,
     379,   182,   182,   304,   -70,   170,   305,   197,   183,   449,
     646,   836,    29,   548,   185,   549,    31,   221,    32,   -70,
     170,   183,   222,   747,   184,    28,   250,   185,   619,   198,
     620,   190,    76,   170,    77,   228,   229,    78,   230,   231,
     232,    43,    79,   730,    47,   594,  -462,  -462,   595,    81,
     178,   516,    93,   187,   518,    82,   188,    83,    26,   199,
     763,     1,  -486,   619,  -486,   621,   369,  -486,    86,  -486,
      40,   370,   190,   182,   223,    93,    93,    93,    93,    93,
      93,    93,   724,   182,   371,  -266,    44,    45,   437,   372,
    -266,   784,  -266,   225,   443,   171,  -265,   381,   289,    26,
     556,  -265,   382,  -265,    26,   557,   200,   289,   454,    26,
     841,     2,   431,   842,   236,   496,   497,   277,   673,   863,
     864,     3,   237,   191,   191,   240,   192,   840,     4,   193,
     193,    42,    46,   186,   182,   246,    93,   523,   171,   619,
     252,   622,     6,   253,     8,     9,    10,   269,   875,   876,
      11,    12,    26,   167,    13,   833,   851,   524,    14,   716,
     834,   834,   250,   532,    15,   541,   321,   322,   323,   324,
     850,   547,   238,     1,   242,   243,   132,   133,   555,    93,
      26,   171,   170,   220,   182,   294,   727,   213,   214,   215,
     295,   330,   331,   332,   524,   540,   792,   211,   212,   529,
      26,   530,   201,   202,   216,   217,    93,   553,    93,    93,
      93,    93,    93,    93,    93,    93,    93,    93,   171,    93,
      93,    93,    93,    93,    93,    93,    93,   296,   307,   301,
     338,   592,   593,   310,    42,   428,   182,   190,   339,   727,
     343,   344,   345,   346,    42,   526,  -463,  -463,  -464,  -464,
     347,   171,   349,    40,   832,   799,   250,   171,   356,   250,
     360,   171,   190,   327,   654,   655,   319,   320,   333,   334,
     362,   601,   532,   365,   398,   186,   182,   399,   401,   171,
     832,   402,    93,   400,   673,   532,   403,   404,   190,   406,
     827,   171,   405,   407,   408,   411,    26,   413,   412,   414,
     415,   420,   368,   182,   416,   101,   220,   421,   422,   439,
     433,   444,   601,   446,   852,   182,    26,   643,   501,   856,
     451,   455,   648,   858,   250,   508,   513,   524,   101,   101,
     101,   101,   101,   101,   101,   105,   220,   551,   190,   867,
     559,   572,   563,    26,   573,   576,   577,   582,   591,   596,
     182,   128,   454,   423,   597,   605,   614,   615,   718,    42,
     631,   250,   250,   627,   100,   601,   652,   171,   725,   626,
     656,   657,   658,   171,   664,   532,   667,   373,   454,   182,
     681,   682,   683,   182,    26,   389,   717,   719,   250,   101,
     190,   737,   732,   601,   171,   171,   171,   738,   739,   182,
     740,   721,   741,   742,   743,   746,   759,   752,   712,   755,
     674,   766,   756,   648,   765,   815,   711,  -286,   773,   761,
     814,   725,   774,   776,   793,   675,    93,   798,   816,   274,
     190,    93,   101,   822,   817,   825,   527,   824,   527,   293,
     527,   843,   171,   818,   171,   298,   853,   865,   869,   857,
     171,   872,   873,   308,   868,   877,   313,   171,   878,   101,
     171,   101,   101,   101,   101,   101,   101,   101,   101,   101,
     101,   135,   101,   101,   101,   101,   101,   101,   101,   101,
     142,     1,   860,   487,   545,   171,   862,   533,   358,   436,
     373,   598,   227,   630,   348,   794,   599,   628,   488,   795,
     629,   735,   644,     1,   618,   558,   190,   684,   823,   787,
     171,   171,   859,   375,   854,   377,   758,    28,   625,   820,
     586,   731,   783,   702,    76,   845,    77,   705,   378,    78,
     584,   706,   190,   751,    79,   101,   786,   392,   317,   498,
     456,    81,    29,   388,     2,   314,     0,    82,     0,    83,
     315,   171,     0,     0,     3,   171,   316,     0,     0,     0,
      86,     4,   318,     1,   171,     0,     0,   489,     0,     0,
       0,     0,     0,   325,   487,     6,     0,     8,     9,    10,
     866,     0,   490,   600,    12,     0,   487,    13,     0,   488,
     668,    14,     0,     0,     0,     0,   533,    15,     0,    28,
     220,   488,     0,     0,     0,     0,    76,     0,    77,   634,
       0,    78,   171,     0,     0,     0,    79,     0,   -32,     0,
       0,     0,     0,    81,     0,     0,     0,     0,   327,    82,
     715,    83,     0,     0,     0,   327,     1,   171,     0,     0,
       0,     0,    86,     0,   495,     0,     0,   171,     0,   491,
       0,   506,     0,     0,   171,   507,   772,   686,   489,   171,
       0,     0,   492,     0,     0,     0,     0,     0,     0,     0,
     489,     0,     0,   490,   487,     0,     0,     2,     0,   101,
       0,     0,   487,     1,   101,   490,     0,     3,     0,   488,
       0,   276,   726,     0,     4,     0,     0,   488,     0,   634,
     171,     0,     0,     0,   686,     0,     0,     0,     6,     0,
       8,     9,    10,     0,     0,     0,    11,    12,     0,    28,
      13,     0,   487,   565,    14,     0,    76,     0,    77,   575,
      15,    78,   578,     0,     0,   583,    79,   488,   171,     0,
     491,     0,     0,    81,     0,   726,     0,     0,     0,    82,
       0,    83,   491,   492,     0,     0,   668,     0,   489,     0,
       0,     0,    86,     0,     0,   492,   489,   171,     0,     0,
       0,     0,     0,   490,     0,     0,     0,   171,     0,   493,
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
      28,     0,   493,     0,   487,     0,   494,    76,   491,    77,
     802,     0,    78,     0,     0,     0,     0,    79,   494,   488,
     489,   492,     0,   489,    81,     0,     0,     0,     0,     0,
      82,     0,    83,     0,     0,   490,     0,   736,   490,     0,
       0,   487,   487,    86,     0,     0,   487,   487,   487,     0,
       0,     0,     0,     0,   489,   489,   488,   488,     0,     0,
       0,   488,   488,   488,     0,     0,   489,     0,   487,   490,
     490,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,   490,     0,   488,     0,     0,     0,     0,   489,     0,
     493,     0,     0,     0,   764,   487,     0,     0,   493,   -29,
       0,     0,   491,   490,     0,   491,   494,     0,     0,     0,
     488,     0,     0,     0,   494,   492,     0,     1,   492,   777,
     778,   780,     0,     0,     0,   489,   489,     0,     0,   101,
     489,   489,   489,     0,     0,     0,   491,   491,   493,     0,
     490,   490,     0,     0,   797,   490,   490,   490,   491,   492,
     492,     0,   489,   430,   494,     0,     0,     0,     2,     0,
       0,   492,     0,     0,     0,     1,     0,   490,     3,     0,
     491,     0,     0,     0,     0,     4,     0,     0,     0,   489,
       0,     5,     0,   492,     0,     0,   -11,     0,     0,     6,
       7,     8,     9,    10,   490,     0,     0,    11,    12,   -43,
       0,    13,     0,     0,     0,    14,     2,   491,   491,   101,
       0,    15,   491,   491,   491,     0,     3,     1,     0,     0,
     492,   492,     0,     4,     0,   492,   492,   492,     0,     0,
       0,     0,   493,     0,   491,   493,     0,     6,     0,     8,
       9,    10,     0,     0,     0,    11,    12,   492,   494,    13,
       0,   494,     0,    14,     0,     0,     0,     0,     2,    15,
       0,   491,     0,     0,     0,     0,   493,   493,     3,     0,
       0,     0,     0,     0,   492,     4,     0,     0,   493,     0,
       0,     5,   494,   494,     0,     0,     0,     0,     0,     6,
       0,     8,     9,    10,   494,     0,   -44,    11,    12,     0,
     493,    13,     0,     0,     0,    14,     0,     0,     0,     0,
       0,    15,  -399,     0,     1,     0,   494,     0,  -399,  -399,
    -399,  -399,  -399,  -399,  -399,  -399,  -399,  -399,  -399,     0,
       0,     0,     0,     0,     0,     0,     0,   493,   493,     0,
       0,     0,   493,   493,   493,     0,     0,     0,     0,     0,
       0,     0,     0,   494,   494,     2,     0,     0,   494,   494,
     494,     0,     0,     0,   493,     3,     0,   457,     0,   373,
    -281,     0,     4,     0,     0,   459,     0,     0,     0,     0,
     494,     0,     1,     0,     0,     0,     6,     0,     8,     9,
      10,   493,     0,     0,    11,    12,     0,     0,    13,     0,
       0,     0,    14,     0,     0,     0,     0,   494,    15,    69,
      70,     0,     0,     0,     0,     0,     0,     0,   460,    72,
      73,    74,    75,     2,   461,    76,   462,    77,   606,     0,
      78,     0,   463,   708,   464,    79,     0,     0,     0,    80,
       4,     0,    81,   465,   466,     0,     0,   531,    82,     0,
      83,     0,    84,    85,     6,     0,     8,     9,    10,     0,
     467,    86,    11,    12,    87,   468,   469,    89,   470,     0,
      14,     0,    90,   471,     0,    91,    15,   472,   473,   457,
       0,   373,   760,    28,     0,     0,     0,   459,     0,     0,
      76,     0,    77,     0,     1,    78,    49,     0,     0,     0,
      79,     0,    50,     0,     0,     0,     0,    81,     0,     0,
       0,     0,     0,    82,    51,    83,     0,     0,     0,     0,
       0,    69,    70,     0,    52,     0,    86,     0,     0,     0,
     460,    72,    73,    74,    75,     2,   461,    76,   462,    77,
     606,     0,    78,     0,   463,   708,   464,    79,     0,     0,
       0,    80,     4,     0,    81,   465,   466,     0,     0,     1,
      82,     0,    83,     0,    84,    85,     6,   387,     8,     9,
      10,     0,   467,    86,    11,    12,    87,   468,   469,    89,
     470,     0,    14,     0,    90,   471,     0,    91,    15,   472,
     473,   457,     0,   373,  -282,    28,     0,     0,     0,   459,
       0,     0,    76,     0,    77,     0,     1,    78,     0,     0,
       0,     0,    79,     0,     0,     0,     0,     0,     0,    81,
       0,     0,     0,     0,     0,    82,     0,    83,     0,     0,
       0,     0,     0,    69,    70,     0,     0,     0,    86,     0,
       0,     0,   460,    72,    73,    74,    75,     2,   461,    76,
     462,    77,  -282,     0,    78,     0,   463,     3,   464,    79,
       0,     0,     0,    80,     4,     0,    81,   465,   466,     0,
       0,     0,    82,     0,    83,     0,    84,    85,     6,     0,
       8,     9,    10,     0,   467,    86,    11,    12,    87,   468,
     469,    89,   470,     0,    14,     0,    90,   471,     0,    91,
      15,   472,   473,   457,     0,   373,   809,     0,    28,     0,
       0,   459,     0,     0,     0,    76,     0,    77,     1,   170,
      78,    49,     0,     0,     0,    79,     0,    50,     0,     0,
       0,     0,    81,     0,     0,     0,     0,     0,    82,    51,
      83,     0,     0,     0,     0,    69,    70,     0,     0,    52,
       0,    86,     0,     0,   460,    72,    73,    74,    75,     2,
     461,    76,   462,    77,   325,     0,    78,     0,   463,     3,
     464,    79,     0,     0,     0,    80,     4,     0,    81,   465,
     466,     0,     0,     1,    82,     0,    83,     0,    84,    85,
       6,     0,     8,     9,    10,     0,   467,    86,    11,    12,
      87,   468,   469,    89,   470,     0,    14,     0,    90,   471,
       0,    91,    15,   472,   473,   457,     0,   373,   458,    28,
      28,     0,     0,   459,     0,     0,    76,    76,    77,    77,
       1,    78,    78,     0,     0,     0,    79,    79,     0,     0,
       0,     0,     0,    81,    81,     0,     0,     0,     0,    82,
      82,    83,    83,     0,     0,     0,     0,    69,    70,     0,
       0,     0,    86,    86,     0,     0,   460,    72,    73,    74,
      75,     2,   461,    76,   462,    77,   367,     0,    78,     0,
     463,     3,   464,    79,     0,     0,     0,    80,     4,     0,
      81,   465,   466,     0,     0,     0,    82,     0,    83,     0,
      84,    85,     6,     0,     8,     9,    10,     0,   467,    86,
      11,    12,    87,   468,   469,    89,   470,     0,    14,     0,
      90,   471,     0,    91,    15,   472,   473,   457,     0,   373,
     589,     0,     0,     0,     0,   459,     0,  -400,     0,     0,
       0,     0,     1,  -400,  -400,  -400,  -400,  -400,  -400,  -400,
    -400,  -400,  -400,  -400,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    69,
      70,     0,     0,     0,     0,     0,     0,     0,   460,    72,
      73,    74,    75,     2,   461,    76,   462,    77,     0,     0,
      78,     0,   463,     3,   464,    79,     0,     0,     0,    80,
       4,     0,    81,   465,   466,     0,     0,     0,    82,     0,
      83,     0,    84,    85,     6,     0,     8,     9,    10,     0,
     467,    86,    11,    12,    87,   468,   469,    89,   470,     0,
      14,     0,    90,   471,     0,    91,    15,   472,   473,   457,
       0,   373,   837,     0,     0,     0,     0,   459,     0,   254,
       0,     0,     0,     0,     1,   255,   256,   257,   258,   259,
     260,   261,   262,   263,   264,   265,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,    69,    70,     0,     0,     0,     0,     0,     0,     0,
     460,    72,    73,    74,    75,     2,   461,    76,   462,    77,
       0,     0,    78,     0,   463,     3,   464,    79,     0,     0,
       0,    80,     4,     0,    81,   465,   466,     0,     0,     0,
      82,     0,    83,     0,    84,    85,     6,     0,     8,     9,
      10,     0,   467,    86,    11,    12,    87,   468,   469,    89,
     470,     0,    14,     0,    90,   471,     0,    91,    15,   472,
     473,   457,     0,   373,   839,     0,     0,     0,     0,   459,
       0,     0,     0,     0,     0,     0,     1,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    69,    70,     0,     0,     0,     0,     0,
       0,     0,   460,    72,    73,    74,    75,     2,   461,    76,
     462,    77,     0,     0,    78,     0,   463,     3,   464,    79,
       0,     0,     0,    80,     4,     0,    81,   465,   466,     0,
       0,     0,    82,     0,    83,     0,    84,    85,     6,     0,
       8,     9,    10,     0,   467,    86,    11,    12,    87,   468,
     469,    89,   470,     0,    14,     0,    90,   471,     0,    91,
      15,   472,   473,   457,     0,   373,   861,     0,     0,     0,
       0,   459,     0,     0,     0,     0,     0,     0,     1,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,    69,    70,     0,     0,     0,
       0,     0,     0,     0,   460,    72,    73,    74,    75,     2,
     461,    76,   462,    77,     0,     0,    78,     0,   463,     3,
     464,    79,     0,     0,     0,    80,     4,     0,    81,   465,
     466,     0,     0,     0,    82,     0,    83,     0,    84,    85,
       6,     0,     8,     9,    10,     0,   467,    86,    11,    12,
      87,   468,   469,    89,   470,     0,    14,     0,    90,   471,
       0,    91,    15,   472,   473,   457,     0,   373,     0,     0,
       0,     0,     0,   459,     0,     0,     0,     0,     0,     0,
       1,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    69,    70,     0,
       0,     0,     0,     0,     0,     0,   460,    72,    73,    74,
      75,     0,   461,    76,   462,    77,     0,     0,    78,     0,
     463,     0,   464,    79,     0,     0,     0,    80,     0,     0,
      81,   465,   466,     0,     0,     0,    82,     0,    83,     0,
      84,    85,     0,     0,     0,     0,     0,     0,   467,    86,
       0,     0,    87,   468,   570,    89,   470,   143,   244,     0,
      90,   471,     0,    91,     0,   472,   473,     0,     0,     0,
       0,     0,     1,     0,     0,     0,    65,    66,     0,     0,
       0,     0,     0,    67,    68,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    69,
      70,     0,     0,     0,     0,     0,     0,     0,   245,    72,
      73,    74,    75,     2,     0,    76,     0,    77,     0,     0,
      78,     0,     0,     3,     0,    79,     0,     0,     0,    80,
       4,     0,    81,     0,     0,   531,   237,     0,    82,     0,
      83,     0,    84,    85,     6,     0,     8,     9,    10,     0,
       0,    86,    11,    12,    87,    88,    13,    89,     0,     0,
      14,     0,    90,     0,     0,    91,    15,    62,    63,    64,
       0,    28,     0,     0,     0,     0,     0,     0,    76,     0,
      77,     0,     1,    78,    49,     0,    65,    66,    79,     0,
      50,     0,     0,    67,    68,    81,     0,     0,     0,     0,
       0,    82,    51,    83,     0,     0,     0,     0,     0,    69,
      70,     0,    52,     0,    86,     0,     0,     0,    71,    72,
      73,    74,    75,     1,   170,    76,     0,    77,   633,     0,
      78,     0,     0,     0,     0,    79,     0,     0,     0,    80,
       0,     0,    81,    62,     0,    64,     0,     0,    82,   157,
      83,     0,    84,    85,     0,     0,     0,     0,     1,    28,
       0,    86,    65,    66,    87,    88,    76,    89,    77,    67,
      68,    78,    90,     0,     0,    91,    79,     0,     0,     0,
       0,     0,     0,    81,     0,    69,    70,     0,     0,    82,
       0,    83,     0,     0,   158,    72,    73,    74,    75,     0,
       0,    76,    86,    77,     0,     0,    78,     0,     0,     0,
       0,    79,   143,     0,   373,    80,     0,     0,    81,     0,
       0,     0,     0,     0,    82,     0,    83,     1,    84,    85,
       0,    65,    66,     0,     0,     0,     0,    86,    67,    68,
      87,    88,     0,    89,     0,     0,     0,     0,    90,     0,
       0,    91,     0,     0,    69,    70,     0,     0,     0,     0,
       0,     0,     0,   144,    72,    73,    74,    75,     0,     0,
      76,     0,    77,     0,     0,    78,     0,     0,     0,     0,
      79,   143,   272,     0,    80,     0,     0,    81,     0,     0,
       0,     0,     0,    82,     0,    83,     1,    84,    85,     0,
      65,    66,     0,     0,     0,     0,    86,    67,    68,    87,
      88,     0,    89,   762,     0,     0,     0,    90,     0,     0,
      91,     0,     0,    69,    70,     0,     0,     0,     0,     0,
       0,     0,   144,    72,    73,    74,    75,     0,     0,    76,
       0,    77,     0,     0,    78,     0,     0,     0,     0,    79,
      62,     0,    64,    80,     0,     0,    81,     0,     0,     0,
       0,     0,    82,     0,    83,     1,    84,    85,     0,    65,
      66,     0,     0,     0,     0,    86,    67,    68,    87,    88,
       0,    89,     0,     0,     0,     0,    90,     0,     0,    91,
       0,     0,    69,    70,     0,     0,     0,     0,     0,     0,
       0,   158,    72,    73,    74,    75,     0,     0,    76,     0,
      77,     0,     0,    78,     0,     0,     0,     0,    79,   143,
       0,   373,    80,     0,     0,    81,     0,     0,     0,     0,
       0,    82,     0,    83,     1,    84,    85,     0,    65,    66,
       0,     0,     0,     0,    86,    67,    68,    87,    88,     0,
      89,     0,     0,     0,     0,    90,     0,     0,    91,     0,
       0,    69,    70,     0,     0,     0,     0,     0,     0,     0,
     144,    72,    73,    74,    75,     0,     0,    76,     0,    77,
       0,     0,    78,     0,     0,     0,     0,    79,   143,     0,
       0,    80,     0,   294,    81,     0,     0,     0,     0,     0,
      82,     0,    83,     1,    84,    85,     0,    65,    66,     0,
       0,     0,     0,    86,    67,    68,    87,    88,     0,    89,
       0,     0,     0,     0,    90,     0,     0,    91,     0,     0,
      69,    70,     0,     0,     0,     0,     0,     0,     0,   144,
      72,    73,    74,    75,     0,     0,    76,     0,    77,     0,
       0,    78,     0,     0,     0,     0,    79,   143,     0,   389,
      80,     0,     0,    81,     0,     0,     0,     0,     0,    82,
       0,    83,     1,    84,    85,     0,    65,    66,     0,     0,
       0,     0,    86,    67,    68,    87,    88,     0,    89,     0,
       0,     0,     0,    90,     0,     0,    91,     0,     0,    69,
      70,     0,     0,     0,     0,     0,     0,     0,   144,    72,
      73,    74,    75,     0,     0,    76,     0,    77,     0,     0,
      78,     0,     0,     0,     0,    79,   143,     0,     0,    80,
       0,   403,    81,     0,     0,     0,     0,     0,    82,     0,
      83,     1,    84,    85,     0,    65,    66,     0,     0,     0,
       0,    86,    67,    68,    87,    88,     0,    89,     0,     0,
       0,     0,    90,     0,     0,    91,     0,     0,    69,    70,
       0,     0,     0,     0,     0,     0,     0,   144,    72,    73,
      74,    75,     0,     0,    76,     0,    77,     0,     0,    78,
       0,     0,     0,     0,    79,   143,     0,     0,    80,     0,
       0,    81,     0,   574,     0,     0,     0,    82,     0,    83,
       1,    84,    85,     0,    65,    66,     0,     0,     0,     0,
      86,    67,    68,    87,    88,     0,    89,     0,     0,     0,
       0,    90,     0,     0,    91,     0,     0,    69,    70,     0,
       0,     0,     0,     0,     0,     0,   144,    72,    73,    74,
      75,     0,     0,    76,     0,    77,     0,     0,    78,     0,
       0,     0,     0,    79,   143,     0,     0,    80,     0,     0,
      81,     0,     0,     0,     0,     0,    82,     0,    83,     1,
      84,    85,     0,    65,    66,     0,     0,     0,     0,    86,
      67,    68,    87,    88,     0,    89,     0,     0,     0,     0,
      90,     0,     0,    91,     0,     0,    69,    70,     0,     0,
       0,     0,     0,     0,     0,   144,    72,    73,    74,    75,
       0,     0,    76,     0,    77,     0,     0,    78,     0,     0,
       0,     0,    79,    62,     0,     0,    80,     0,     0,    81,
       0,     0,     0,     0,     0,    82,     0,    83,     1,    84,
      85,     0,    65,    66,     0,     0,     0,     0,    86,    67,
      68,    87,    88,     0,    89,     0,     0,     0,     0,    90,
       0,     0,    91,     0,     0,    69,    70,     0,     0,     0,
       0,     0,     0,     0,   158,    72,    73,    74,    75,     0,
       0,    76,   457,    77,     0,     0,    78,     0,     0,     0,
       0,    79,     0,     0,     0,    80,     0,     1,    81,     0,
       0,     0,     0,     0,    82,     0,    83,     0,    84,    85,
       0,     0,     0,     0,     0,     0,     0,    86,     0,     0,
      87,    88,     0,    89,    69,    70,     0,     0,    90,     0,
       0,    91,     0,   158,    72,    73,    74,    75,     0,     0,
      76,   457,    77,     0,     0,    78,     0,     0,     0,     0,
      79,     0,     0,     0,    80,     0,     1,    81,     0,     0,
       0,     0,     0,    82,     0,    83,     0,    84,    85,     0,
       0,     0,     0,     0,     0,     0,    86,     0,     0,    87,
       0,     0,    89,    69,    70,     0,     0,    90,     0,   325,
      91,     0,   158,    72,    73,    74,    75,     0,     0,    76,
       0,    77,   457,   785,    78,     0,     0,     0,     0,    79,
       0,     0,     0,    80,     0,     0,    81,     1,     0,     0,
       0,     0,    82,     0,    83,     0,    84,    85,     0,     0,
       0,     0,     0,     0,     0,    86,     0,     0,    87,     0,
       0,    89,     0,     0,     0,     0,    90,     0,     0,    91,
       0,     0,     0,   158,    72,    73,    74,    75,     0,     0,
      76,   457,    77,     0,     0,    78,     0,     0,     0,     0,
      79,     0,     0,     0,    80,     0,     1,    81,     0,     0,
       0,     0,     0,    82,     0,    83,     0,    84,    85,     0,
       0,     0,     0,     0,     0,     0,    86,     0,     0,    87,
       0,     0,    89,     0,     0,     0,     0,    90,     0,   325,
      91,     0,   158,    72,    73,    74,    75,   800,     0,    76,
       0,    77,     0,     0,    78,     0,     0,     0,     0,    79,
       0,     1,     0,    80,     0,     0,    81,     0,     0,     0,
       0,     0,    82,     0,    83,     0,    84,    85,     0,     0,
     373,  -137,     0,     0,     0,    86,   599,     0,    87,     0,
       0,    89,     0,     1,     0,     0,    90,    28,   325,    91,
       0,     0,     2,     0,    76,     0,    77,   373,   647,    78,
       0,     0,     3,   599,    79,     0,     0,     0,     0,     4,
       1,    81,     0,     0,     0,     0,     0,    82,     0,    83,
       0,     0,     0,     6,     2,     8,     9,    10,     0,     0,
      86,    11,    12,     0,     3,    13,     0,     0,     0,    14,
       0,     4,     0,   373,   697,    15,     0,     0,     0,   599,
       0,     2,     0,     0,     0,     6,     1,     8,     9,    10,
       0,     3,     0,   600,    12,     0,     0,    13,     4,     0,
       0,    14,     0,     0,     0,   373,  -138,    15,     0,     0,
       0,   599,     6,     0,     8,     9,    10,     0,     1,     0,
     600,    12,     0,     0,    13,     0,     0,     2,    14,     0,
       0,     0,   373,   734,    15,     0,     0,     3,   599,     0,
       0,     0,     0,     0,     4,     1,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     6,     2,
       8,     9,    10,     0,     0,   539,   600,    12,     0,     3,
      13,     0,     0,     0,    14,     0,     4,     1,     0,     0,
      15,     0,     0,     0,     0,     0,     2,     0,     0,     0,
       6,     0,     8,     9,    10,     0,     3,   552,   600,    12,
       0,     0,    13,     4,     0,     0,    14,     0,     0,     1,
       0,     0,    15,     0,     0,     0,     0,     6,     2,     8,
       9,    10,     0,     0,   642,   600,    12,     0,     3,    13,
       0,     0,     0,    14,     0,     4,     1,     0,     0,    15,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     6,
       2,     8,     9,    10,     0,     0,     0,    11,    12,     0,
       3,    13,     0,     0,     0,    14,     0,     4,     0,     0,
       0,    15,     0,     0,     0,     0,     0,     2,     1,     0,
       0,     6,     0,     8,     9,    10,     0,     3,     0,    11,
      12,     0,     0,    13,     4,     0,     0,    14,     0,     0,
       0,     0,     0,    15,     0,     0,     0,     0,     6,     0,
       8,     9,    10,     0,    28,     0,    11,    12,     0,     2,
      13,    76,     0,    77,    14,     0,    78,     0,     0,     3,
      15,    79,    48,   237,     0,     0,     4,     0,    81,     0,
       0,     0,     0,     0,    82,     0,    83,     0,     0,     0,
       6,     0,     8,     9,    10,     0,     0,    86,    11,    12,
       0,     0,    13,     0,     0,     0,    14,     0,    28,    48,
     237,     0,    15,     0,     0,    76,     0,    77,     0,     0,
      78,    49,     0,     0,     0,    79,     0,    50,     0,     0,
       0,     0,    81,     0,     0,     0,     0,     0,    82,    51,
      83,     0,     0,     0,     0,   733,     0,     0,     0,    52,
       0,    86,    76,     0,    77,     0,     0,    78,    49,     0,
       0,     0,    79,     0,    50,   633,     0,     0,     0,    81,
       0,     0,     0,     0,     0,    82,    51,    83,     0,     0,
       0,   -70,     0,     0,   183,     0,    52,   184,    86,     0,
     185,     0,     0,     0,   -70,   -70,   170,     0,     0,     0,
       0,     0,   633,     0,     0,  -398,     0,     0,     0,     0,
       0,  -398,  -398,  -398,  -398,  -398,  -398,  -398,  -398,  -398,
    -398,  -398,     0,     0,     0,     0,     0,     0,     0,     0,
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
     438,    10,   559,    23,    64,   513,   633,   184,   676,   676,
      41,    91,    10,    11,   553,   192,     7,   766,    38,    54,
      64,   431,   431,    19,    21,    10,    11,    18,    54,   251,
     553,   253,     7,    64,    65,    66,    67,    68,    69,    70,
     145,    19,   601,    18,   793,   602,    14,    26,     7,    65,
      66,    67,    68,    69,    70,   173,     7,    54,    54,    18,
      54,    14,    11,    54,   474,   100,   171,    18,    47,    18,
       7,    91,    98,   630,    94,    95,    54,    18,   601,    54,
      18,    18,   750,   127,   751,   834,    54,   168,    54,   648,
     564,    11,    88,   650,   125,    54,    11,   724,   725,   726,
     608,    54,   610,    54,   643,    54,   100,   399,   168,   125,
      88,   135,   121,    54,   406,   135,     7,    54,    87,   117,
     643,   413,   100,   143,   168,   648,   146,    18,   103,    67,
     540,   540,   117,     3,    54,    73,     5,   168,   182,    54,
      18,    54,    11,   553,   553,   772,     6,    85,    19,    20,
     170,   759,   172,   173,     7,   740,     6,    95,    28,   745,
     180,    32,    33,    54,   195,    18,   197,   198,   199,   200,
     201,   202,   203,   204,   205,   206,    54,   208,   209,   210,
     211,   212,   213,   214,   215,     0,    19,    19,   774,    54,
     271,   601,   601,     0,   632,    54,   532,   213,   214,   215,
     220,    54,    74,   283,    64,     5,   250,   227,    82,    69,
      10,   271,    83,    65,    64,    18,    23,   237,   709,    69,
     250,    54,    54,    88,    62,    77,    85,   271,   100,    95,
     416,    38,   817,   643,   643,     3,   280,    85,   648,   648,
     271,   285,    10,     4,    74,   289,    84,   365,     9,   471,
     368,   175,   176,     3,     7,    18,    59,    18,   474,   551,
     184,   185,   282,   283,   188,    18,    69,   741,   192,   193,
     100,   722,   723,    76,    24,    28,    39,   395,   752,    82,
      64,     4,   415,     7,     4,    69,   508,    90,    11,    92,
      93,    94,     3,    10,    18,    98,    99,    17,     9,   102,
      12,    10,    19,   106,    28,   143,     7,   327,    25,   112,
      19,   355,    24,    24,   180,   433,    98,    18,   769,   770,
     771,   812,   614,    18,     4,   107,    54,   549,   135,   349,
     617,    11,   170,     5,   357,     7,   143,   559,     7,   420,
     360,    10,   816,   366,   818,   365,    18,   838,   368,    18,
     686,    54,   372,   373,   220,   415,   572,   808,     3,   581,
     420,     3,     7,   287,    59,   385,     7,    54,     7,   207,
      12,   451,   452,    18,    69,   395,   420,    18,   600,    18,
     602,    76,     9,    28,   415,   774,    51,    52,    53,   420,
       7,   865,    54,    20,     9,    90,   416,    92,    93,    94,
       3,    18,   240,    98,    99,    20,    10,   102,   630,    13,
     454,   106,   432,   433,   434,   637,   282,   112,     6,    18,
     227,     9,   811,     7,   444,     3,    10,     5,   650,    13,
     268,   451,   452,   100,    18,    19,   103,    48,     7,   557,
     558,    10,     1,     9,    13,    11,     5,     4,     7,    18,
      19,     7,     9,   675,    10,    54,   476,    13,     9,    21,
      11,   327,    61,    19,    63,   115,   116,    66,   118,   119,
     120,    30,    71,   695,    33,     6,    45,    46,     9,    78,
       7,   405,    41,    10,   408,    84,    13,    86,   508,    27,
     712,    18,     4,     9,     6,    11,     4,     9,    97,    11,
     544,     9,   368,   523,     4,    64,    65,    66,    67,    68,
      69,    70,   111,   533,     4,     4,    10,    11,   356,     9,
       9,   743,    11,    11,   362,    84,     4,     4,   548,   549,
       4,     9,     9,    11,   554,     9,    17,   557,   558,   559,
     100,    59,   349,   103,    54,   383,   384,   385,   579,   841,
     842,    69,    19,     7,     7,    81,    10,    10,    76,    13,
      13,    10,    11,   668,   584,   372,   125,   753,   127,     9,
       4,    11,    90,    24,    92,    93,    94,     6,   870,   871,
      98,    99,   602,     3,   102,     4,     4,     9,   106,    11,
       9,     9,   612,   431,   112,   433,   203,   204,   205,   206,
     822,   439,   138,    18,   140,   141,    10,    11,   446,   168,
     630,   170,    19,   127,   634,     8,   636,    14,    15,    16,
      10,   208,   209,   210,     9,   432,    11,    22,    23,   427,
     650,   429,    49,    50,    45,    46,   195,   444,   197,   198,
     199,   200,   201,   202,   203,   204,   205,   206,   207,   208,
     209,   210,   211,   212,   213,   214,   215,   523,    10,   836,
      54,   499,   500,   840,    10,    11,   686,   533,    11,   689,
     229,   230,   231,   232,    10,    11,    45,    46,    45,    46,
       6,   240,     5,   727,   802,   765,   706,   246,    74,   709,
       5,   250,   558,   207,    11,    12,   201,   202,   211,   212,
      74,   508,   540,     3,    54,   810,   726,    54,     4,   268,
     828,    67,   271,    54,   745,   553,     8,     8,   584,    54,
     800,   280,    10,    54,    13,    67,   746,    54,     8,    54,
      12,    28,   246,   753,    54,    41,   250,   107,    98,     9,
      74,     5,   549,     9,   825,   765,   766,   554,     8,   829,
      54,    54,   559,   833,   774,     5,     5,     9,    64,    65,
      66,    67,    68,    69,    70,   825,   280,    54,   634,   849,
       5,     3,    31,   793,     3,     3,     3,     3,    11,     9,
     800,   825,   802,   342,     8,    54,    54,    54,   626,    10,
       6,   811,   812,    54,   825,   602,    54,   356,   636,    17,
      11,    11,   113,   362,    11,   643,    11,     5,   828,   829,
      11,    11,     6,   833,   834,     5,     3,     6,   838,   125,
     686,     3,    31,   630,   383,   384,   385,    12,    11,   849,
       9,    54,     4,     4,     4,     3,     9,     4,    24,    54,
      65,     3,   105,   650,     4,     4,    12,    12,    54,    12,
     774,   689,     5,    11,     3,    77,   415,    11,     4,   167,
     726,   420,   168,     4,    11,    69,   425,    11,   427,   177,
     429,    11,   431,    72,   433,   183,    11,     4,    54,    31,
     439,    11,    11,   191,   103,    11,   194,   446,    11,   195,
     449,   197,   198,   199,   200,   201,   202,   203,   204,   205,
     206,    46,   208,   209,   210,   211,   212,   213,   214,   215,
      61,    18,   836,   373,   434,   474,   840,   431,   756,   355,
       5,     6,   135,   549,   234,   756,    11,   548,   373,   757,
     548,   650,   557,    18,   524,   449,   802,   596,   793,   746,
     499,   500,   834,   251,   828,   253,   695,    54,   540,   787,
     474,   643,   742,   608,    61,   817,    63,   610,   266,    66,
     474,   610,   828,   679,    71,   271,   745,   283,   199,   385,
     372,    78,   531,   281,    59,   195,    -1,    84,    -1,    86,
     197,   540,    -1,    -1,    69,   544,   198,    -1,    -1,    -1,
      97,    76,   200,    18,   553,    -1,    -1,   373,    -1,    -1,
      -1,    -1,    -1,   110,   464,    90,    -1,    92,    93,    94,
     848,    -1,   373,    98,    99,    -1,   476,   102,    -1,   464,
     579,   106,    -1,    -1,    -1,    -1,   540,   112,    -1,    54,
     544,   476,    -1,    -1,    -1,    -1,    61,    -1,    63,   553,
      -1,    66,   601,    -1,    -1,    -1,    71,    -1,     0,    -1,
      -1,    -1,    -1,    78,    -1,    -1,    -1,    -1,   572,    84,
     619,    86,    -1,    -1,    -1,   579,    18,   626,    -1,    -1,
      -1,    -1,    97,    -1,   382,    -1,    -1,   636,    -1,   373,
      -1,   389,    -1,    -1,   643,   393,   111,   601,   464,   648,
      -1,    -1,   373,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
     476,    -1,    -1,   464,   564,    -1,    -1,    59,    -1,   415,
      -1,    -1,   572,    18,   420,   476,    -1,    69,    -1,   564,
      -1,    26,   636,    -1,    76,    -1,    -1,   572,    -1,   643,
     689,    -1,    -1,    -1,   648,    -1,    -1,    -1,    90,    -1,
      92,    93,    94,    -1,    -1,    -1,    98,    99,    -1,    54,
     102,    -1,   612,   461,   106,    -1,    61,    -1,    63,   467,
     112,    66,   470,    -1,    -1,   473,    71,   612,   727,    -1,
     464,    -1,    -1,    78,    -1,   689,    -1,    -1,    -1,    84,
      -1,    86,   476,   464,    -1,    -1,   745,    -1,   564,    -1,
      -1,    -1,    97,    -1,    -1,   476,   572,   756,    -1,    -1,
      -1,    -1,    -1,   564,    -1,    -1,    -1,   766,    -1,   373,
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
      54,    -1,   476,    -1,   774,    -1,   464,    61,   612,    63,
     834,    -1,    66,    -1,    -1,    -1,    -1,    71,   476,   774,
     706,   612,    -1,   709,    78,    -1,    -1,    -1,    -1,    -1,
      84,    -1,    86,    -1,    -1,   706,    -1,   655,   709,    -1,
      -1,   811,   812,    97,    -1,    -1,   816,   817,   818,    -1,
      -1,    -1,    -1,    -1,   740,   741,   811,   812,    -1,    -1,
      -1,   816,   817,   818,    -1,    -1,   752,    -1,   838,   740,
     741,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,   752,    -1,   838,    -1,    -1,    -1,    -1,   774,    -1,
     564,    -1,    -1,    -1,   712,   865,    -1,    -1,   572,     0,
      -1,    -1,   706,   774,    -1,   709,   564,    -1,    -1,    -1,
     865,    -1,    -1,    -1,   572,   706,    -1,    18,   709,   737,
     738,   739,    -1,    -1,    -1,   811,   812,    -1,    -1,   745,
     816,   817,   818,    -1,    -1,    -1,   740,   741,   612,    -1,
     811,   812,    -1,    -1,   762,   816,   817,   818,   752,   740,
     741,    -1,   838,     6,   612,    -1,    -1,    -1,    59,    -1,
      -1,   752,    -1,    -1,    -1,    18,    -1,   838,    69,    -1,
     774,    -1,    -1,    -1,    -1,    76,    -1,    -1,    -1,   865,
      -1,    82,    -1,   774,    -1,    -1,    87,    -1,    -1,    90,
      91,    92,    93,    94,   865,    -1,    -1,    98,    99,     0,
      -1,   102,    -1,    -1,    -1,   106,    59,   811,   812,   825,
      -1,   112,   816,   817,   818,    -1,    69,    18,    -1,    -1,
     811,   812,    -1,    76,    -1,   816,   817,   818,    -1,    -1,
      -1,    -1,   706,    -1,   838,   709,    -1,    90,    -1,    92,
      93,    94,    -1,    -1,    -1,    98,    99,   838,   706,   102,
      -1,   709,    -1,   106,    -1,    -1,    -1,    -1,    59,   112,
      -1,   865,    -1,    -1,    -1,    -1,   740,   741,    69,    -1,
      -1,    -1,    -1,    -1,   865,    76,    -1,    -1,   752,    -1,
      -1,    82,   740,   741,    -1,    -1,    -1,    -1,    -1,    90,
      -1,    92,    93,    94,   752,    -1,     0,    98,    99,    -1,
     774,   102,    -1,    -1,    -1,   106,    -1,    -1,    -1,    -1,
      -1,   112,    28,    -1,    18,    -1,   774,    -1,    34,    35,
      36,    37,    38,    39,    40,    41,    42,    43,    44,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,   811,   812,    -1,
      -1,    -1,   816,   817,   818,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,   811,   812,    59,    -1,    -1,   816,   817,
     818,    -1,    -1,    -1,   838,    69,    -1,     3,    -1,     5,
       6,    -1,    76,    -1,    -1,    11,    -1,    -1,    -1,    -1,
     838,    -1,    18,    -1,    -1,    -1,    90,    -1,    92,    93,
      94,   865,    -1,    -1,    98,    99,    -1,    -1,   102,    -1,
      -1,    -1,   106,    -1,    -1,    -1,    -1,   865,   112,    45,
      46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    54,    55,
      56,    57,    58,    59,    60,    61,    62,    63,    64,    -1,
      66,    -1,    68,    69,    70,    71,    -1,    -1,    -1,    75,
      76,    -1,    78,    79,    80,    -1,    -1,    18,    84,    -1,
      86,    -1,    88,    89,    90,    -1,    92,    93,    94,    -1,
      96,    97,    98,    99,   100,   101,   102,   103,   104,    -1,
     106,    -1,   108,   109,    -1,   111,   112,   113,   114,     3,
      -1,     5,     6,    54,    -1,    -1,    -1,    11,    -1,    -1,
      61,    -1,    63,    -1,    18,    66,    67,    -1,    -1,    -1,
      71,    -1,    73,    -1,    -1,    -1,    -1,    78,    -1,    -1,
      -1,    -1,    -1,    84,    85,    86,    -1,    -1,    -1,    -1,
      -1,    45,    46,    -1,    95,    -1,    97,    -1,    -1,    -1,
      54,    55,    56,    57,    58,    59,    60,    61,    62,    63,
      64,    -1,    66,    -1,    68,    69,    70,    71,    -1,    -1,
      -1,    75,    76,    -1,    78,    79,    80,    -1,    -1,    18,
      84,    -1,    86,    -1,    88,    89,    90,    26,    92,    93,
      94,    -1,    96,    97,    98,    99,   100,   101,   102,   103,
     104,    -1,   106,    -1,   108,   109,    -1,   111,   112,   113,
     114,     3,    -1,     5,     6,    54,    -1,    -1,    -1,    11,
      -1,    -1,    61,    -1,    63,    -1,    18,    66,    -1,    -1,
      -1,    -1,    71,    -1,    -1,    -1,    -1,    -1,    -1,    78,
      -1,    -1,    -1,    -1,    -1,    84,    -1,    86,    -1,    -1,
      -1,    -1,    -1,    45,    46,    -1,    -1,    -1,    97,    -1,
      -1,    -1,    54,    55,    56,    57,    58,    59,    60,    61,
      62,    63,    64,    -1,    66,    -1,    68,    69,    70,    71,
      -1,    -1,    -1,    75,    76,    -1,    78,    79,    80,    -1,
      -1,    -1,    84,    -1,    86,    -1,    88,    89,    90,    -1,
      92,    93,    94,    -1,    96,    97,    98,    99,   100,   101,
     102,   103,   104,    -1,   106,    -1,   108,   109,    -1,   111,
     112,   113,   114,     3,    -1,     5,     6,    -1,    54,    -1,
      -1,    11,    -1,    -1,    -1,    61,    -1,    63,    18,    19,
      66,    67,    -1,    -1,    -1,    71,    -1,    73,    -1,    -1,
      -1,    -1,    78,    -1,    -1,    -1,    -1,    -1,    84,    85,
      86,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    95,
      -1,    97,    -1,    -1,    54,    55,    56,    57,    58,    59,
      60,    61,    62,    63,   110,    -1,    66,    -1,    68,    69,
      70,    71,    -1,    -1,    -1,    75,    76,    -1,    78,    79,
      80,    -1,    -1,    18,    84,    -1,    86,    -1,    88,    89,
      90,    -1,    92,    93,    94,    -1,    96,    97,    98,    99,
     100,   101,   102,   103,   104,    -1,   106,    -1,   108,   109,
      -1,   111,   112,   113,   114,     3,    -1,     5,     6,    54,
      54,    -1,    -1,    11,    -1,    -1,    61,    61,    63,    63,
      18,    66,    66,    -1,    -1,    -1,    71,    71,    -1,    -1,
      -1,    -1,    -1,    78,    78,    -1,    -1,    -1,    -1,    84,
      84,    86,    86,    -1,    -1,    -1,    -1,    45,    46,    -1,
      -1,    -1,    97,    97,    -1,    -1,    54,    55,    56,    57,
      58,    59,    60,    61,    62,    63,   110,    -1,    66,    -1,
      68,    69,    70,    71,    -1,    -1,    -1,    75,    76,    -1,
      78,    79,    80,    -1,    -1,    -1,    84,    -1,    86,    -1,
      88,    89,    90,    -1,    92,    93,    94,    -1,    96,    97,
      98,    99,   100,   101,   102,   103,   104,    -1,   106,    -1,
     108,   109,    -1,   111,   112,   113,   114,     3,    -1,     5,
       6,    -1,    -1,    -1,    -1,    11,    -1,    28,    -1,    -1,
      -1,    -1,    18,    34,    35,    36,    37,    38,    39,    40,
      41,    42,    43,    44,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,
      46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    54,    55,
      56,    57,    58,    59,    60,    61,    62,    63,    -1,    -1,
      66,    -1,    68,    69,    70,    71,    -1,    -1,    -1,    75,
      76,    -1,    78,    79,    80,    -1,    -1,    -1,    84,    -1,
      86,    -1,    88,    89,    90,    -1,    92,    93,    94,    -1,
      96,    97,    98,    99,   100,   101,   102,   103,   104,    -1,
     106,    -1,   108,   109,    -1,   111,   112,   113,   114,     3,
      -1,     5,     6,    -1,    -1,    -1,    -1,    11,    -1,    28,
      -1,    -1,    -1,    -1,    18,    34,    35,    36,    37,    38,
      39,    40,    41,    42,    43,    44,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      54,    55,    56,    57,    58,    59,    60,    61,    62,    63,
      -1,    -1,    66,    -1,    68,    69,    70,    71,    -1,    -1,
      -1,    75,    76,    -1,    78,    79,    80,    -1,    -1,    -1,
      84,    -1,    86,    -1,    88,    89,    90,    -1,    92,    93,
      94,    -1,    96,    97,    98,    99,   100,   101,   102,   103,
     104,    -1,   106,    -1,   108,   109,    -1,   111,   112,   113,
     114,     3,    -1,     5,     6,    -1,    -1,    -1,    -1,    11,
      -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    54,    55,    56,    57,    58,    59,    60,    61,
      62,    63,    -1,    -1,    66,    -1,    68,    69,    70,    71,
      -1,    -1,    -1,    75,    76,    -1,    78,    79,    80,    -1,
      -1,    -1,    84,    -1,    86,    -1,    88,    89,    90,    -1,
      92,    93,    94,    -1,    96,    97,    98,    99,   100,   101,
     102,   103,   104,    -1,   106,    -1,   108,   109,    -1,   111,
     112,   113,   114,     3,    -1,     5,     6,    -1,    -1,    -1,
      -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    54,    55,    56,    57,    58,    59,
      60,    61,    62,    63,    -1,    -1,    66,    -1,    68,    69,
      70,    71,    -1,    -1,    -1,    75,    76,    -1,    78,    79,
      80,    -1,    -1,    -1,    84,    -1,    86,    -1,    88,    89,
      90,    -1,    92,    93,    94,    -1,    96,    97,    98,    99,
     100,   101,   102,   103,   104,    -1,   106,    -1,   108,   109,
      -1,   111,   112,   113,   114,     3,    -1,     5,    -1,    -1,
      -1,    -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,
      18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    54,    55,    56,    57,
      58,    -1,    60,    61,    62,    63,    -1,    -1,    66,    -1,
      68,    -1,    70,    71,    -1,    -1,    -1,    75,    -1,    -1,
      78,    79,    80,    -1,    -1,    -1,    84,    -1,    86,    -1,
      88,    89,    -1,    -1,    -1,    -1,    -1,    -1,    96,    97,
      -1,    -1,   100,   101,   102,   103,   104,     3,     4,    -1,
     108,   109,    -1,   111,    -1,   113,   114,    -1,    -1,    -1,
      -1,    -1,    18,    -1,    -1,    -1,    22,    23,    -1,    -1,
      -1,    -1,    -1,    29,    30,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,
      46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    54,    55,
      56,    57,    58,    59,    -1,    61,    -1,    63,    -1,    -1,
      66,    -1,    -1,    69,    -1,    71,    -1,    -1,    -1,    75,
      76,    -1,    78,    -1,    -1,    18,    19,    -1,    84,    -1,
      86,    -1,    88,    89,    90,    -1,    92,    93,    94,    -1,
      -1,    97,    98,    99,   100,   101,   102,   103,    -1,    -1,
     106,    -1,   108,    -1,    -1,   111,   112,     3,     4,     5,
      -1,    54,    -1,    -1,    -1,    -1,    -1,    -1,    61,    -1,
      63,    -1,    18,    66,    67,    -1,    22,    23,    71,    -1,
      73,    -1,    -1,    29,    30,    78,    -1,    -1,    -1,    -1,
      -1,    84,    85,    86,    -1,    -1,    -1,    -1,    -1,    45,
      46,    -1,    95,    -1,    97,    -1,    -1,    -1,    54,    55,
      56,    57,    58,    18,    19,    61,    -1,    63,   111,    -1,
      66,    -1,    -1,    -1,    -1,    71,    -1,    -1,    -1,    75,
      -1,    -1,    78,     3,    -1,     5,    -1,    -1,    84,     9,
      86,    -1,    88,    89,    -1,    -1,    -1,    -1,    18,    54,
      -1,    97,    22,    23,   100,   101,    61,   103,    63,    29,
      30,    66,   108,    -1,    -1,   111,    71,    -1,    -1,    -1,
      -1,    -1,    -1,    78,    -1,    45,    46,    -1,    -1,    84,
      -1,    86,    -1,    -1,    54,    55,    56,    57,    58,    -1,
      -1,    61,    97,    63,    -1,    -1,    66,    -1,    -1,    -1,
      -1,    71,     3,    -1,     5,    75,    -1,    -1,    78,    -1,
      -1,    -1,    -1,    -1,    84,    -1,    86,    18,    88,    89,
      -1,    22,    23,    -1,    -1,    -1,    -1,    97,    29,    30,
     100,   101,    -1,   103,    -1,    -1,    -1,    -1,   108,    -1,
      -1,   111,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    54,    55,    56,    57,    58,    -1,    -1,
      61,    -1,    63,    -1,    -1,    66,    -1,    -1,    -1,    -1,
      71,     3,     4,    -1,    75,    -1,    -1,    78,    -1,    -1,
      -1,    -1,    -1,    84,    -1,    86,    18,    88,    89,    -1,
      22,    23,    -1,    -1,    -1,    -1,    97,    29,    30,   100,
     101,    -1,   103,   104,    -1,    -1,    -1,   108,    -1,    -1,
     111,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    54,    55,    56,    57,    58,    -1,    -1,    61,
      -1,    63,    -1,    -1,    66,    -1,    -1,    -1,    -1,    71,
       3,    -1,     5,    75,    -1,    -1,    78,    -1,    -1,    -1,
      -1,    -1,    84,    -1,    86,    18,    88,    89,    -1,    22,
      23,    -1,    -1,    -1,    -1,    97,    29,    30,   100,   101,
      -1,   103,    -1,    -1,    -1,    -1,   108,    -1,    -1,   111,
      -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    54,    55,    56,    57,    58,    -1,    -1,    61,    -1,
      63,    -1,    -1,    66,    -1,    -1,    -1,    -1,    71,     3,
      -1,     5,    75,    -1,    -1,    78,    -1,    -1,    -1,    -1,
      -1,    84,    -1,    86,    18,    88,    89,    -1,    22,    23,
      -1,    -1,    -1,    -1,    97,    29,    30,   100,   101,    -1,
     103,    -1,    -1,    -1,    -1,   108,    -1,    -1,   111,    -1,
      -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      54,    55,    56,    57,    58,    -1,    -1,    61,    -1,    63,
      -1,    -1,    66,    -1,    -1,    -1,    -1,    71,     3,    -1,
      -1,    75,    -1,     8,    78,    -1,    -1,    -1,    -1,    -1,
      84,    -1,    86,    18,    88,    89,    -1,    22,    23,    -1,
      -1,    -1,    -1,    97,    29,    30,   100,   101,    -1,   103,
      -1,    -1,    -1,    -1,   108,    -1,    -1,   111,    -1,    -1,
      45,    46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    54,
      55,    56,    57,    58,    -1,    -1,    61,    -1,    63,    -1,
      -1,    66,    -1,    -1,    -1,    -1,    71,     3,    -1,     5,
      75,    -1,    -1,    78,    -1,    -1,    -1,    -1,    -1,    84,
      -1,    86,    18,    88,    89,    -1,    22,    23,    -1,    -1,
      -1,    -1,    97,    29,    30,   100,   101,    -1,   103,    -1,
      -1,    -1,    -1,   108,    -1,    -1,   111,    -1,    -1,    45,
      46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    54,    55,
      56,    57,    58,    -1,    -1,    61,    -1,    63,    -1,    -1,
      66,    -1,    -1,    -1,    -1,    71,     3,    -1,    -1,    75,
      -1,     8,    78,    -1,    -1,    -1,    -1,    -1,    84,    -1,
      86,    18,    88,    89,    -1,    22,    23,    -1,    -1,    -1,
      -1,    97,    29,    30,   100,   101,    -1,   103,    -1,    -1,
      -1,    -1,   108,    -1,    -1,   111,    -1,    -1,    45,    46,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    54,    55,    56,
      57,    58,    -1,    -1,    61,    -1,    63,    -1,    -1,    66,
      -1,    -1,    -1,    -1,    71,     3,    -1,    -1,    75,    -1,
      -1,    78,    -1,    11,    -1,    -1,    -1,    84,    -1,    86,
      18,    88,    89,    -1,    22,    23,    -1,    -1,    -1,    -1,
      97,    29,    30,   100,   101,    -1,   103,    -1,    -1,    -1,
      -1,   108,    -1,    -1,   111,    -1,    -1,    45,    46,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    54,    55,    56,    57,
      58,    -1,    -1,    61,    -1,    63,    -1,    -1,    66,    -1,
      -1,    -1,    -1,    71,     3,    -1,    -1,    75,    -1,    -1,
      78,    -1,    -1,    -1,    -1,    -1,    84,    -1,    86,    18,
      88,    89,    -1,    22,    23,    -1,    -1,    -1,    -1,    97,
      29,    30,   100,   101,    -1,   103,    -1,    -1,    -1,    -1,
     108,    -1,    -1,   111,    -1,    -1,    45,    46,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    54,    55,    56,    57,    58,
      -1,    -1,    61,    -1,    63,    -1,    -1,    66,    -1,    -1,
      -1,    -1,    71,     3,    -1,    -1,    75,    -1,    -1,    78,
      -1,    -1,    -1,    -1,    -1,    84,    -1,    86,    18,    88,
      89,    -1,    22,    23,    -1,    -1,    -1,    -1,    97,    29,
      30,   100,   101,    -1,   103,    -1,    -1,    -1,    -1,   108,
      -1,    -1,   111,    -1,    -1,    45,    46,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    54,    55,    56,    57,    58,    -1,
      -1,    61,     3,    63,    -1,    -1,    66,    -1,    -1,    -1,
      -1,    71,    -1,    -1,    -1,    75,    -1,    18,    78,    -1,
      -1,    -1,    -1,    -1,    84,    -1,    86,    -1,    88,    89,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    97,    -1,    -1,
     100,   101,    -1,   103,    45,    46,    -1,    -1,   108,    -1,
      -1,   111,    -1,    54,    55,    56,    57,    58,    -1,    -1,
      61,     3,    63,    -1,    -1,    66,    -1,    -1,    -1,    -1,
      71,    -1,    -1,    -1,    75,    -1,    18,    78,    -1,    -1,
      -1,    -1,    -1,    84,    -1,    86,    -1,    88,    89,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    97,    -1,    -1,   100,
      -1,    -1,   103,    45,    46,    -1,    -1,   108,    -1,   110,
     111,    -1,    54,    55,    56,    57,    58,    -1,    -1,    61,
      -1,    63,     3,     4,    66,    -1,    -1,    -1,    -1,    71,
      -1,    -1,    -1,    75,    -1,    -1,    78,    18,    -1,    -1,
      -1,    -1,    84,    -1,    86,    -1,    88,    89,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    97,    -1,    -1,   100,    -1,
      -1,   103,    -1,    -1,    -1,    -1,   108,    -1,    -1,   111,
      -1,    -1,    -1,    54,    55,    56,    57,    58,    -1,    -1,
      61,     3,    63,    -1,    -1,    66,    -1,    -1,    -1,    -1,
      71,    -1,    -1,    -1,    75,    -1,    18,    78,    -1,    -1,
      -1,    -1,    -1,    84,    -1,    86,    -1,    88,    89,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    97,    -1,    -1,   100,
      -1,    -1,   103,    -1,    -1,    -1,    -1,   108,    -1,   110,
     111,    -1,    54,    55,    56,    57,    58,     4,    -1,    61,
      -1,    63,    -1,    -1,    66,    -1,    -1,    -1,    -1,    71,
      -1,    18,    -1,    75,    -1,    -1,    78,    -1,    -1,    -1,
      -1,    -1,    84,    -1,    86,    -1,    88,    89,    -1,    -1,
       5,     6,    -1,    -1,    -1,    97,    11,    -1,   100,    -1,
      -1,   103,    -1,    18,    -1,    -1,   108,    54,   110,   111,
      -1,    -1,    59,    -1,    61,    -1,    63,     5,     6,    66,
      -1,    -1,    69,    11,    71,    -1,    -1,    -1,    -1,    76,
      18,    78,    -1,    -1,    -1,    -1,    -1,    84,    -1,    86,
      -1,    -1,    -1,    90,    59,    92,    93,    94,    -1,    -1,
      97,    98,    99,    -1,    69,   102,    -1,    -1,    -1,   106,
      -1,    76,    -1,     5,     6,   112,    -1,    -1,    -1,    11,
      -1,    59,    -1,    -1,    -1,    90,    18,    92,    93,    94,
      -1,    69,    -1,    98,    99,    -1,    -1,   102,    76,    -1,
      -1,   106,    -1,    -1,    -1,     5,     6,   112,    -1,    -1,
      -1,    11,    90,    -1,    92,    93,    94,    -1,    18,    -1,
      98,    99,    -1,    -1,   102,    -1,    -1,    59,   106,    -1,
      -1,    -1,     5,     6,   112,    -1,    -1,    69,    11,    -1,
      -1,    -1,    -1,    -1,    76,    18,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    90,    59,
      92,    93,    94,    -1,    -1,     6,    98,    99,    -1,    69,
     102,    -1,    -1,    -1,   106,    -1,    76,    18,    -1,    -1,
     112,    -1,    -1,    -1,    -1,    -1,    59,    -1,    -1,    -1,
      90,    -1,    92,    93,    94,    -1,    69,     6,    98,    99,
      -1,    -1,   102,    76,    -1,    -1,   106,    -1,    -1,    18,
      -1,    -1,   112,    -1,    -1,    -1,    -1,    90,    59,    92,
      93,    94,    -1,    -1,     6,    98,    99,    -1,    69,   102,
      -1,    -1,    -1,   106,    -1,    76,    18,    -1,    -1,   112,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    90,
      59,    92,    93,    94,    -1,    -1,    -1,    98,    99,    -1,
      69,   102,    -1,    -1,    -1,   106,    -1,    76,    -1,    -1,
      -1,   112,    -1,    -1,    -1,    -1,    -1,    59,    18,    -1,
      -1,    90,    -1,    92,    93,    94,    -1,    69,    -1,    98,
      99,    -1,    -1,   102,    76,    -1,    -1,   106,    -1,    -1,
      -1,    -1,    -1,   112,    -1,    -1,    -1,    -1,    90,    -1,
      92,    93,    94,    -1,    54,    -1,    98,    99,    -1,    59,
     102,    61,    -1,    63,   106,    -1,    66,    -1,    -1,    69,
     112,    71,    18,    19,    -1,    -1,    76,    -1,    78,    -1,
      -1,    -1,    -1,    -1,    84,    -1,    86,    -1,    -1,    -1,
      90,    -1,    92,    93,    94,    -1,    -1,    97,    98,    99,
      -1,    -1,   102,    -1,    -1,    -1,   106,    -1,    54,    18,
      19,    -1,   112,    -1,    -1,    61,    -1,    63,    -1,    -1,
      66,    67,    -1,    -1,    -1,    71,    -1,    73,    -1,    -1,
      -1,    -1,    78,    -1,    -1,    -1,    -1,    -1,    84,    85,
      86,    -1,    -1,    -1,    -1,    54,    -1,    -1,    -1,    95,
      -1,    97,    61,    -1,    63,    -1,    -1,    66,    67,    -1,
      -1,    -1,    71,    -1,    73,   111,    -1,    -1,    -1,    78,
      -1,    -1,    -1,    -1,    -1,    84,    85,    86,    -1,    -1,
      -1,     4,    -1,    -1,     7,    -1,    95,    10,    97,    -1,
      13,    -1,    -1,    -1,    17,    18,    19,    -1,    -1,    -1,
      -1,    -1,   111,    -1,    -1,    28,    -1,    -1,    -1,    -1,
      -1,    34,    35,    36,    37,    38,    39,    40,    41,    42,
      43,    44,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    54
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final short[] yystos_ = yystos_init();
  private static final short[] yystos_init()
  {
    return new short[]
    {
       0,    18,    59,    69,    76,    82,    90,    91,    92,    93,
      94,    98,    99,   102,   106,   112,   125,   126,   127,   128,
     129,   130,   131,   132,   133,   134,   302,   303,    54,   124,
      98,   124,   124,    87,   128,     0,   125,   134,   136,   127,
     303,     3,    10,   124,    10,    11,    11,   124,    18,    67,
      73,    85,    95,   137,   146,   147,   166,   171,   196,   197,
     205,   125,     3,     4,     5,    22,    23,    29,    30,    45,
      46,    54,    55,    56,    57,    58,    61,    63,    66,    71,
      75,    78,    84,    86,    88,    89,    97,   100,   101,   103,
     108,   111,   123,   124,   143,   144,   145,   249,   250,   251,
     258,   259,   260,   263,   264,   277,   279,   280,   281,   282,
     283,   284,   285,   286,   287,   288,   289,   290,   291,   292,
     293,   294,   295,   296,   297,   298,   300,   302,   303,   304,
     305,    54,    10,    11,    14,   132,     5,    85,    54,    54,
      54,    54,   137,     3,    54,   124,   143,   258,   259,   267,
     268,   269,   273,   274,   275,   277,   299,     9,    54,   305,
     306,   290,   290,   290,   290,   290,   290,     3,    28,   261,
      19,   124,   143,   254,   255,    10,    13,     3,     7,   193,
     194,   195,   302,     7,    10,    13,   255,    10,    13,   193,
     195,     7,    10,    13,    26,    47,   278,    48,    21,    27,
      17,    49,    50,    19,    20,    32,    33,    83,    51,    52,
      53,    22,    23,    14,    15,    16,    45,    46,   268,   290,
     144,     4,     9,     4,    14,    11,   135,   136,   115,   116,
     118,   119,   120,   138,   139,   140,    54,    19,   148,   149,
      81,   154,   148,   148,     4,    54,   125,   270,   271,   272,
     302,    24,     4,    24,    28,    34,    35,    36,    37,    38,
      39,    40,    41,    42,    43,    44,   276,     4,    17,     6,
       6,     9,     4,   262,   267,   305,    26,   143,   256,   257,
     302,     7,   194,   265,   266,   302,   252,   253,   301,   302,
      54,   254,   254,   267,     8,    10,   195,     7,   267,    88,
     100,   251,   254,   254,   100,   103,   254,    10,   267,    54,
     251,   254,   254,   267,   280,   281,   282,   283,   284,   285,
     285,   287,   287,   287,   287,   110,   143,   144,   215,   248,
     288,   288,   288,   289,   289,   290,   290,   290,    54,    11,
      98,   107,   142,   124,   124,   124,   124,     6,   140,     5,
     206,    54,   150,   151,   152,   302,    74,   153,   143,   155,
       5,   167,    74,   198,   199,     3,   172,   110,   144,     4,
       9,     4,     9,     5,   211,   267,   211,   267,   267,   143,
     305,     4,     9,    74,   100,     9,    20,    26,   267,     5,
     181,   193,   266,     7,   261,    10,    25,   254,    54,    54,
      54,     4,    67,     8,     8,    10,    54,    54,    13,    54,
      88,    67,     8,    54,    54,    12,    54,   179,   180,   179,
      28,   107,    98,   124,    11,   117,    11,   117,    11,   121,
       6,   125,   207,    74,     9,    20,   152,   143,   154,     9,
     168,   169,   301,   143,     5,   200,     9,   173,   174,   301,
     154,    54,    54,   301,   302,    54,   272,     3,     6,    11,
      54,    60,    62,    68,    70,    79,    80,    96,   101,   102,
     104,   109,   113,   114,   125,   211,   212,   213,   216,   217,
     218,   219,   220,   230,   231,   232,   237,   250,   260,   274,
     291,   292,   294,   295,   296,   267,   143,   143,   257,    74,
     100,     8,   181,   182,   183,   184,   267,   267,     5,   157,
     158,   301,   261,     5,   222,    54,   254,   261,   254,   261,
     268,   277,    28,   194,     9,   305,    11,   124,   141,   141,
     141,    18,   143,   144,   146,   196,   203,   208,   209,     6,
     125,   143,   156,   301,   302,   151,   158,   143,     9,    11,
     170,    54,     6,   125,   201,   143,     4,     9,   144,     5,
     175,   193,   193,    31,    12,   267,    11,    54,    11,    54,
     102,   216,     3,     3,    11,   267,     3,     3,   267,     3,
     211,   245,     3,   267,   144,   146,   197,   214,   215,     6,
     213,    11,   143,   143,     6,     9,     9,     8,     6,    11,
      98,   125,   159,   160,   211,    54,    64,    69,   223,   224,
     225,   226,   227,   228,    54,    54,   267,    28,   180,     9,
      11,    11,    11,   179,    54,   208,    17,    54,   169,   170,
     159,     6,   261,   111,   144,   146,   149,   186,   196,   202,
     203,   204,     6,   125,   174,    54,   301,     6,   125,   160,
     176,   177,    54,   216,    11,    12,    11,    11,   113,   215,
     219,   233,   235,   267,    11,   267,   267,    11,   124,   215,
     246,   247,   249,   258,    65,    77,   239,   240,   244,   211,
     267,    11,    11,     6,   184,   211,   144,   146,   148,   149,
     161,   162,   163,   178,   185,   186,   196,     6,   160,   229,
     273,     6,   224,   228,     6,   226,   227,   228,    69,   212,
     228,    12,    24,   261,   181,   124,    11,     3,   143,     6,
     158,    54,   187,   187,   111,   143,   144,   302,    11,   192,
     211,   202,    31,    54,     6,   177,   267,     3,    12,    11,
       9,     4,     4,     4,     4,    11,     3,   211,   240,   244,
     238,   239,     4,    54,   179,    54,   105,   191,   192,     9,
       6,    12,   104,   211,   267,     4,     3,   191,   191,   187,
     187,   187,   111,    54,     5,   164,    11,   267,   267,   234,
     267,   219,   216,   222,   211,     4,   247,   125,   241,   243,
     244,   216,    11,     3,   155,   164,   273,   267,    11,   193,
       4,   126,   144,   188,   189,   191,   191,   191,   187,     6,
     124,   165,   212,   249,   254,     4,     4,    11,    72,   221,
     143,   242,     4,   188,    11,    69,   210,   193,   144,    54,
     103,   190,   301,     4,     9,   191,    10,     6,   212,     6,
      10,   100,   103,    11,   216,   235,   236,   216,    21,    54,
     211,     4,   305,    11,   190,    10,   193,    31,   193,   189,
     254,     6,   254,   261,   261,     4,   143,   193,   103,    54,
     100,   100,    11,    11,   216,   261,   261,    11,    11
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short[] yyr1_ = yyr1_init();
  private static final short[] yyr1_init()
  {
    return new short[]
    {
       0,   122,   123,   123,   123,   123,   123,   123,   123,   124,
     124,   125,   125,   126,   126,   127,   127,   128,   128,   128,
     128,   128,   128,   128,   128,   128,   128,   128,   128,   129,
     129,   129,   129,   130,   131,   132,   132,   133,   133,   134,
     134,   134,   134,   135,   135,   136,   136,   137,   137,   138,
     138,   139,   139,   140,   140,   140,   140,   140,   140,   140,
     141,   141,   142,   142,   142,   142,   142,   143,   143,   144,
     144,   144,   144,   145,   145,   145,   145,   145,   145,   145,
     145,   146,   146,   146,   147,   148,   148,   149,   150,   150,
     151,   151,   152,   152,   152,   153,   153,   154,   154,   155,
     155,   156,   156,   157,   157,   158,   158,   159,   159,   160,
     160,   160,   160,   161,   161,   161,   161,   161,   162,   163,
     164,   164,   164,   164,   165,   165,   165,   165,   166,   167,
     167,   168,   168,   168,   169,   169,   170,   170,   170,   171,
     172,   173,   173,   173,   174,   174,   175,   175,   176,   176,
     177,   177,   178,   179,   179,   180,   180,   180,   180,   181,
     181,   182,   182,   183,   183,   184,   184,   185,   186,   186,
     186,   186,   186,   186,   187,   187,   188,   188,   189,   189,
     190,   190,   190,   190,   191,   191,   192,   192,   193,   193,
     194,   194,   195,   195,   196,   196,   197,   198,   198,   199,
     199,   200,   200,   201,   201,   202,   202,   202,   202,   203,
     204,   205,   206,   206,   207,   207,   208,   208,   208,   208,
     209,   210,   210,   211,   211,   212,   212,   213,   213,   214,
     214,   214,   215,   215,   216,   216,   216,   216,   216,   217,
     217,   217,   217,   217,   217,   217,   217,   217,   217,   217,
     217,   217,   217,   217,   217,   217,   217,   217,   217,   218,
     219,   219,   219,   219,   219,   219,   219,   220,   221,   221,
     222,   222,   222,   223,   223,   224,   224,   224,   225,   225,
     225,   226,   226,   227,   227,   228,   228,   229,   229,   230,
     231,   231,   232,   233,   233,   233,   234,   234,   235,   235,
     236,   236,   237,   238,   238,   239,   239,   240,   241,   242,
     242,   243,   243,   244,   245,   245,   246,   246,   247,   247,
     248,   249,   249,   249,   249,   249,   249,   249,   249,   249,
     249,   249,   249,   250,   250,   250,   251,   252,   252,   253,
     253,   254,   254,   255,   256,   256,   257,   257,   257,   257,
     257,   257,   257,   258,   258,   258,   259,   259,   260,   260,
     260,   260,   260,   261,   261,   262,   262,   263,   263,   263,
     263,   263,   263,   264,   264,   265,   265,   266,   266,   267,
     267,   268,   268,   268,   268,   269,   269,   269,   270,   270,
     271,   271,   272,   272,   272,   273,   273,   274,   275,   275,
     275,   276,   276,   276,   276,   276,   276,   276,   276,   276,
     276,   276,   276,   277,   278,   278,   278,   279,   279,   280,
     280,   281,   281,   282,   282,   283,   283,   284,   284,   284,
     285,   285,   285,   285,   285,   285,   286,   286,   287,   287,
     287,   287,   288,   288,   288,   289,   289,   289,   289,   290,
     290,   290,   290,   290,   291,   292,   293,   293,   293,   293,
     293,   294,   294,   294,   294,   295,   296,   297,   297,   298,
     299,   299,   300,   301,   301,   302,   302,   303,   303,   303,
     303,   304,   304,   305,   305,   305,   305,   306,   306,   306
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
    int code_max = 376;
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
     115,   116,   117,   118,   119,   120,   121
    };
  }


  private static final int YYLAST_ = 4501;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 35;
  private static final int YYNTOKENS_ = 122;


}
/* "src/main/resources/Java_16_Grammar.y":1418  */


