package util

import tree.Compilation.TopLevelComponent
import tree.Declaration.ClassDeclaration
import tree.Declaration.NormalClassDeclaration

fun findNameAsClass(objName: String, clsDec: NormalClassDeclaration): Boolean {
    return if (objName != clsDec.name) {
        try {
            clsDec.body.declarations
                .filterIsInstance<NormalClassDeclaration>()
                .find { dec: NormalClassDeclaration -> findNameAsClass(objName, dec) } != null
        } catch (e: NullPointerException) {
            false
        }
    } else {
        true
    }
}

fun isItClass(objName: String, components: ArrayList<TopLevelComponent>): Boolean {
    return if (objName != "System") {
        components
            .mapNotNull { component: TopLevelComponent -> component.classDecl }
            .filterIsInstance<NormalClassDeclaration>()
            .find { clsDec: ClassDeclaration -> findNameAsClass(objName, clsDec as NormalClassDeclaration) } != null
    } else {
        true
    }
}
