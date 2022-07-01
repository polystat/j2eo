package translator

import arrow.core.None
import arrow.core.Some
import eotree.*
import translator.preprocessor.PreprocessorState
import translator.preprocessor.preprocess
import tree.Compilation.CompilationUnit
import tree.Compilation.Package
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponent
import tree.Declaration.ImportDeclaration
import util.findMainClass
import util.generateEntryPoint
import util.logger
import java.nio.file.Path
import java.time.LocalDateTime
import java.util.*

class Translator(val relativePath: Path) {

    fun translate(unit: CompilationUnit, context: Context): EOProgram {
        return if (unit is SimpleCompilationUnit)
            mapSimpleCompilationUnit(unit, context)
        else
            throw IllegalArgumentException(
                "CompilationUnit of type " +
                        unit.javaClass.simpleName +
                        " is not supported"
            )
    }

    fun mapPackage(pkg: Package, context: Context): EOProgram {
        return EOProgram(
            EOLicense(), // TODO: add license?
            EOMetas(
                Some(pkg.compoundName.names.joinToString(".")),
                ArrayList()
            ),
            pkg.components.components
                .map { obj -> mapTopLevelComponent(obj, context) }
        )
    }

    private fun mapSimpleCompilationUnit(unit: SimpleCompilationUnit, context: Context): EOProgram {
        // preprocessUnit(unit)
        val preprocessorState = PreprocessorState()
        preprocess(preprocessorState, unit)

        val bnds = unit.components.components
            .map { obj: TopLevelComponent? -> mapTopLevelComponent(obj!!, context) }
            .map { bnd: EOBnd -> bnd as EOBndExpr }


        // FIXME: assuming there is only one top-level component and it is a class
        val mainClassName = findMainClass(unit)
        var entrypointBnds = listOf<EOBndExpr>()
        if (mainClassName != null) {
            entrypointBnds = generateEntryPoint(mainClassName)
        } else {
            logger.info { "No entry point here!" }
        }

        // FIXME: assuming there is only one top-level component and it is a class
        // Always calling the 'main' method

        val stdAliases = (
            preprocessorState.stdTokensForCurrentAlias
                .map { EOMeta("alias", it) }.toList() +
            (unit.imports?.imports?.map { mapImport(it, context) } ?: listOf())
        ).distinct()

        val eoAliases = preprocessorState.eoClassesForCurrentAlias
                .map { EOMeta("alias", it) }.toList()
        val pkg = relativePath.toList().dropLast(1).joinToString(".")

        return EOProgram(
            EOLicense(
                EOComment(LocalDateTime.now().toString()),
                EOComment("j2eo team")
            ),
            EOMetas(
                if (pkg.isNotEmpty()) Some(pkg) else None,
                stdAliases + eoAliases
            ),
            bnds + entrypointBnds
        )
    }

    private fun mapTopLevelComponent(component: TopLevelComponent, context: Context): EOBnd {
        return if (component.classDecl != null) {
            mapClass(component.classDecl, context)
        } else if (component.interfaceDecl != null) {
            mapInterface(component.interfaceDecl, context)
        } else {
            throw IllegalArgumentException("Supplied TopLevelComponent does not have neither class nor interface")
        }
    }

    private fun mapImport(importDecl: ImportDeclaration, context: Context): EOMeta {
        return EOMeta("alias", importDecl.compoundName.names.joinToString("."))
    }
}
