package translator

import arrow.core.None
import arrow.core.Some
import eotree.EOBnd
import eotree.EOBndExpr
import eotree.EOComment
import eotree.EOLicense
import eotree.EOMeta
import eotree.EOMetas
import eotree.EOProgram
import translator.preprocessor.Preprocessor
import tree.Compilation.CompilationUnit
import tree.Compilation.Package
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import util.findMainClass
import util.generateEntryPoint
import util.logger
import java.time.LocalDateTime


class Translator {

    fun translate(unit: CompilationUnit): EOProgram {
        return if (unit is SimpleCompilationUnit)
            mapSimpleCompilationUnit(unit)
        else
            throw IllegalArgumentException(
                "CompilationUnit of type " +
                    unit.javaClass.simpleName +
                    " is not supported"
            )
    }

    fun mapPackage(pkg: Package): EOProgram {
        return EOProgram(
            EOLicense(), // TODO: add license?
            EOMetas(
                Some(pkg.compoundName.names.joinToString(".")),
                ArrayList()
            ),
            pkg.components.components
                .map { obj -> mapTopLevelComponent(obj) }
        )
    }

    private fun mapSimpleCompilationUnit(unit: SimpleCompilationUnit): EOProgram {
        // preprocessUnit(unit)
        val preprocessor = Preprocessor()
        preprocessor.preprocess(unit)

        val bnds = unit.components.components
            .map { obj: TopLevelComponent? -> mapTopLevelComponent(obj!!) }
            .map { bnd: EOBnd -> bnd as EOBndExpr }

        // FIXME: assuming there is only one top-level component and it is a class
        var entrypointBnds = listOf<EOBndExpr>()
        try {
            val mainClassName = findMainClass(unit)
            entrypointBnds = generateEntryPoint(mainClassName)
        } catch (e: NullPointerException) {
            logger.info { "No entry point here!" }
        }

        // FIXME: assuming there is only one top-level component and it is a class
        // Always calling the 'main' method


        val stdAliases = preprocessor.stdClassesForCurrentAlias.stream()
            .map { EOMeta("alias", "stdlib.$it") }.toList()

        return EOProgram(
            EOLicense(
                EOComment(LocalDateTime.now().toString()),
                EOComment("j2eo team")
            ),
            EOMetas(
                None,
                stdAliases
            ),
            bnds + entrypointBnds
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
}
