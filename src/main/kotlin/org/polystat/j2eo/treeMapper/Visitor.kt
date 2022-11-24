package org.polystat.j2eo.treeMapper

import JavaParser
import JavaParser.CompilationUnitContext
import JavaParserBaseVisitor
import tree.Entity

class Visitor : JavaParserBaseVisitor<Entity>() {
    override fun visitCompilationUnit(ctx: CompilationUnitContext?): Entity = ctx!!.toCompilationUnit()

    override fun visitPackageDeclaration(ctx: JavaParser.PackageDeclarationContext?): Entity = ctx!!.toPackage()

    override fun visitForControl(ctx: JavaParser.ForControlContext?): Entity {
        ctx?.enhancedForControl().apply { println("Found enhanced for control") }
        ctx?.forInit().apply { println("Found for init") }
        return tree.CompoundName("asdfasdfsdfasdfasdg")
    }
}
