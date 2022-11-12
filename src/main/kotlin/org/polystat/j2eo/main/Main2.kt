package org.polystat.j2eo.main

import JavaLexer
import JavaParser
import arrow.core.Some
import java.io.File
import java.io.FileNotFoundException
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.path.createDirectories
import kotlin.system.exitProcess
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.CommandLineParser
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Option
import org.apache.commons.cli.Options
import org.apache.commons.cli.ParseException
import org.polystat.j2eo.eotree.EOLicense
import org.polystat.j2eo.eotree.EOMetas
import org.polystat.j2eo.eotree.EOProgram
import org.polystat.j2eo.translator.Context
import org.polystat.j2eo.translator.Translator
import org.polystat.j2eo.treeMapper.Visitor
import org.polystat.j2eo.util.logger
import tree.Compilation.CompilationUnit
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.TopLevelComponents
import tree.Declaration.ImportDeclarations
import tree.Entity

object Main2 {
    @Throws(FileNotFoundException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        // Setup command line argument parser
        val options = Options()

        val output = Option("o", "output", true, "Target EOLANG filepath")
        output.isRequired = true
        options.addOption(output)

        val debug = Option("d", "debug", false, "Debug mode")
        debug.isRequired = false
        options.addOption(debug)

        val cmdLineParser: CommandLineParser = DefaultParser()
        val formatter = HelpFormatter()

        // Parse command line arguments and exit if parsing failed.
        val cmd: CommandLine = try {
            cmdLineParser.parse(options, args)
        } catch (e: ParseException) {
            e.printStackTrace()
            logger.error("Failed parsing command-line arguments")
            printUsage(formatter, options)
            exitProcess(1)
        }

        // Check argv for all required data
        if (cmd.argList.size != 1) {
            logger.error("1 argument should be passed, but ${cmd.argList.size} were passed")
            printUsage(formatter, options)
            exitProcess(1)
        }

        Entity.debug = cmd.hasOption("d")

        // Check if source file exists
        val inputFilepath = cmd.argList[0]
        val sourceFile = File(inputFilepath)
        if (!sourceFile.exists()) {
            throw FileNotFoundException("No source file or directory found at \"$inputFilepath\"")
        }

        logger.info("Parsing files in directory \"${sourceFile.absolutePath}\"")

        val filesToProcess: List<File> = if (sourceFile.isDirectory)
            sourceFile.walk()
                .filter { it.isFile }
                .filter { it.toString().endsWith(".java") }
                .toList()
        else
            listOf(sourceFile)

        if (cmd.hasOption("d")) {
            logger.debug("List of files to translate:" + filesToProcess.joinToString("") { "\n  ${it.path}" })
        }

        val translatedFiles: List<Pair<File, EOProgram>> = filesToProcess
            .mapIndexed { i, f ->
                val percent = (1f * i / filesToProcess.size) * 100f
                logger.info("Progress: %.2f".format(percent) + "% / 100.0%. --- Files left: ${filesToProcess.size - i}; file: ${f.path}")

                // Parse Java file using ANTLR parser
                val lexer = JavaLexer(CharStreams.fromFileName(f.absolutePath))
                val parser = JavaParser(CommonTokenStream(lexer))

                // Traverse the ANTLR AST
                val tree = parser.compilationUnit()
                val eval = Visitor()
                var cu: CompilationUnit? = null
                try {
                    cu = eval.visit(tree) as CompilationUnit
                } catch (e: Exception) {
                    e.printStackTrace()
                }

                if (Entity.debug) {
                    cu?.report(0)
                    logger.debug("[${i + 1}/${filesToProcess.size}] Translating ${f.absolutePath}")
                }

                val dummy = SimpleCompilationUnit(
                    ImportDeclarations(null),
                    TopLevelComponents(null)
                )
                val translator = Translator(f.relativeTo(sourceFile).toPath())
                var translation: EOProgram? = null
                try {
                    translation = translator.translate(cu ?: dummy, Context(HashMap()))
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                Pair(f, translation ?: EOProgram(EOLicense(), EOMetas(Some("failed translation!"), listOf()), listOf()))
            }
        println()

        translatedFiles.forEach { (file, eoProgram) ->
            val targetText = eoProgram.generateEO(0)
            val outputPath = Paths.get(
                cmd.getOptionValue('o'),
                if (sourceFile.isDirectory)
                    file.parentFile.toRelativeString(File(cmd.args[0]))
                else
                    file.toRelativeString(File(cmd.args[0]))
            )
            val outputFile = Paths.get(
                outputPath.toString(),
                file.name.replace(".java", ".eo")
            )

            if (cmd.hasOption("d")) {
                logger.debug("Printing output to file $outputFile")
            }
            outputPath.createDirectories()
            Files.writeString(outputFile, targetText)
        }

        logger.info("Translation complete.")
    }

    private fun printUsage(formatter: HelpFormatter, options: Options) {
        formatter.printHelp("java -jar J2EO.jar [OPTIONS...] <input file>", options)
    }
}
