package translator

import arrow.core.None
import arrow.core.Some
import eotree.*
import tree.Compilation.CompilationUnit
import tree.Compilation.Package
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import util.ListUtils
import java.time.LocalDateTime

fun translate(unit: CompilationUnit): EOProgram {
    return if (unit is SimpleCompilationUnit) mapSimpleCompilationUnit(unit) else throw IllegalArgumentException(
        "CompilationUnit of type " +
                unit.javaClass.simpleName +
                " is not supported")
}

fun mapPackage(pkg: Package): EOProgram {
    return EOProgram(
        EOLicense(),  // TODO: add license?
        EOMetas(
            Some(pkg.compoundName.names.joinToString(".")),
            ArrayList()
        ),
        pkg.components.components
            .map { obj -> mapTopLevelComponent(obj) }
    )
}

fun mapSimpleCompilationUnit(unit: SimpleCompilationUnit): EOProgram {
    val stdBnds = ArrayList<EOBndExpr>() // Standard top-level bounds
    stdBnds.add(
        EOBndExpr(
            EOObject(
                ArrayList(),
                None,
                emptyList()
            ),
            "class_Object"
        )
    )
    val printlnObj = EOObject(
        ListUtils.listOf(
            "text"
        ),
        None,
        ListUtils.listOf(
            EOBndExpr(
                EOCopy(
                    EODot("stdout"),
                    ListUtils.listOf<EOBnd>(
                        EOAnonExpr(
                            EODot("text")
                        )
                    )
                ),
                "@"
            )
        )
    )
    val outObj = EOObject(
        ListUtils.listOf(),
        None,
        ListUtils.listOf(
            EOBndExpr(
                printlnObj,
                "println"
            )
        )
    )
    stdBnds.add(
        EOBndExpr(
            EOObject(
                ListUtils.listOf(),
                None,
                ListUtils.listOf(
                    EOBndExpr(
                        outObj,
                        "out"
                    )
                )
            ),
            "class_System"
        )
    )
    val bnds = unit.components.components
        .map { obj: TopLevelComponent? -> mapTopLevelComponent(obj!!) }
        .map { bnd: EOBnd -> bnd as EOBndExpr }

    // FIXME: assuming there is only one top-level component and it is a class
    // Always calling the 'main' method
//    val mainClassName = bndLst[0].bndName
//    bndLst.add(EOBndExpr(
//        EODot(mainClassName),
//        "mainObj"
//    ))
//    bndLst.add(
//        EOBndExpr(
//            EODot(Optional.of(EODot("mainObj")), "main"
//            ),
//            "@"
//        )
//    )
//    val globalBnd = ListUtils.listOf<EOBnd>(
//        EOBndExpr(
//            EOObject(
//                ListUtils.listOf(),
//                Optional.of("args"),
//                bndLst
//            ),
//            "global"
//        )
//    )
//    globalBnd.addAll(stdBnds)

    return EOProgram(
        EOLicense(
            EOComment(LocalDateTime.now().toString()),
            EOComment("j2eo team")
        ),
        EOMetas(
            None,
            ListUtils.listOf(
                EOMeta("alias", "org.eolang.io.stdout")
            )
        ),
        bnds
    )
}

fun mapTopLevelComponent(component: TopLevelComponent): EOBnd {
    return if (component.classDecl != null) {
        mapClass(component.classDecl)
    } else if (component.interfaceDecl != null) {
        mapInterface(component.interfaceDecl)
    } else {
        throw IllegalArgumentException("Supplied TopLevelComponent does not have neither class nor interface")
    }
}
