package org.polystat.j2eo.treeMapper

// import org.polystat.j2eo.antlrParser.JavaParser.CompilationUnitContext
// import org.polystat.j2eo.antlrParser.JavaParserBaseVisitor

import tree.Entity

class Visitor : JavaParserBaseVisitor<Entity>() {
    // Why does this line work???
    // JavaParser parser = new JavaParser()

    override fun visitCompilationUnit(ctx: JavaParser.CompilationUnitContext?): Entity = ctx!!.toCompilationUnit()

    override fun visitPackageDeclaration(ctx: JavaParser.PackageDeclarationContext?): Entity = ctx!!.toPackage()

    override fun visitForControl(ctx: JavaParser.ForControlContext?): Entity {
        ctx?.enhancedForControl().apply { println("Found enhanced for control") }
        ctx?.forInit().apply { println("Found for init") }
        return tree.CompoundName("asdfasdfsdfasdfasdg")
    }
}
