package main

import eotree.EOProgram
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.apache.commons.cli.*
import parser.JavaLexer
import parser.JavaParser
import parser.Visitor
import translator.Context
import translator.Translator
import tree.Compilation.CompilationUnit
import tree.Entity
import util.logger
import java.io.File
import java.io.FileNotFoundException
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.collections.HashMap
import kotlin.io.path.createDirectories
import kotlin.system.exitProcess

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
                val cu = eval.visit(tree) as CompilationUnit

                if (Entity.debug) {
                    cu.report(0)
                    logger.debug("[${i + 1}/${filesToProcess.size}] Translating ${f.absolutePath}")
                }
//                else {
//                    if (i % 100 == 0) {
//                        val percent = (1f * i / filesToProcess.size) * 100f
//                        print("Progress: %.2f".format(percent) + "% / 100.0%. --- Files left: ${filesToProcess.size - i}\r")
//                    }
//                }

                val translator = Translator(f.relativeTo(sourceFile).toPath())
                Pair(f, translator.translate(cu, Context(HashMap())))
            }
        println()

//        val parsedFiles: List<Pair<File, CompilationUnit>> = filesToProcess
//            .mapNotNull { f ->
//                val scanner = Scanner()
//                scanner.readFile(f.absolutePath)
//                val parser = JavaParser(scanner)
//
//                try {
//                    val result: Boolean = parser.parse()
//
//                    if (!result)
//                        throw ParseException("Parsing of file \"${f.absolutePath}\" failed")
//
//                    if (Entity.debug)
//                        parser.ast.report(0)
//
//                    Pair(f, parser.ast)
//                } catch (exc: Exception) {
//                    exc.printStackTrace()
//                    null
//                }
//            }

//        val translatedFiles: List<Pair<File, EOProgram>> = parsedFiles
//            .mapIndexed { i, (file, ast) ->
//                println("[$i/${parsedFiles.size}] Translating ${file.absolutePath}")
//                val translator = Translator()
//                Pair(file, translator.translate(ast))
//            }

        val outputDirectory = File(cmd.getOptionValue('o'))
        logger.info("Cleaning up output directory \"$outputDirectory\" before printing")
        outputDirectory.deleteRecursively()

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
            Files.writeString(Files.createFile(outputFile), targetText)
        }

        logger.info("Translation complete.")
//        Resource
//        InputStream = javaClass.getResourceAsStream()
    }

    private fun printUsage(formatter: HelpFormatter, options: Options) {
        formatter.printHelp("java -jar J2EO.jar [OPTIONS...] <input file>", options)
    }
}