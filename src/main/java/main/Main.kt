package main

import arrow.core.getOrElse
import eotree.EOProgram
import lexer.Scanner
import org.apache.commons.cli.*
import parser.JavaParser
import translator.Translator
import tree.Compilation.CompilationUnit
import tree.Entity
import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter
import kotlin.system.exitProcess

object Main {
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
            System.err.println("Failed parsing command-line arguments")
            printUsage(formatter, options)
            exitProcess(1)
        }

        // Check argv for all required data
        if (cmd.argList.size != 1) {
            System.err.println("1 argument should be passed, but ${cmd.argList.size} were passed")
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

        println("Parsing files in directory \"${sourceFile.absolutePath}\"")

        val filesToProcess: List<File> = if (sourceFile.isDirectory)
            sourceFile.walk()
                .filter { it.isFile }
                .filter { it.toString().endsWith(".java") }
                .toList()
        else
            listOf(sourceFile)

        println("List of files to translate:" + filesToProcess.map { "\n  ${it.path}" }.joinToString(""))

        val parsedFiles: List<Pair<File, CompilationUnit>> = filesToProcess
            .mapNotNull { f ->
                val scanner = Scanner()
                scanner.readFile(f.absolutePath)
                val parser = JavaParser(scanner)

                try {
                    val result: Boolean = parser.parse()

                    if (!result)
                        throw ParseException("Parsing of file \"${f.absolutePath}\" failed")

                    if (Entity.debug)
                        parser.ast.report(0)

                    Pair(f, parser.ast)
                } catch (exc: Exception) {
                    exc.printStackTrace()
                    null
                }
            }

        val translatedFiles: List<Pair<File, EOProgram>> = parsedFiles
            .map { (file, ast) ->
                val translator = Translator()
                Pair(file, translator.translate(ast))
            }

        translatedFiles.forEach { (file, eoProgram) ->
            val targetText = eoProgram.generateEO(0)

            val output_dir = cmd.getOptionValue("o") + "/";
            val output_filename =
                eoProgram.metas.packageName.getOrElse { "" } + "/" +
                        file.path.substringAfterLast("/")

            val outputPath =
                (output_dir + output_filename)
                    .replace("//", "/")
                    .replace(".java", ".eo")

            println("Printing output to file $outputPath")
            File(outputPath.substringBeforeLast("/")).mkdirs()
            PrintWriter(outputPath).use { writer -> writer.println(targetText) }
        }

//        Resource
//        InputStream = javaClass.getResourceAsStream()
    }

    private fun printUsage(formatter: HelpFormatter, options: Options) {
        formatter.printHelp("java -jar J2EO.jar [OPTIONS...] <input file>", options)
    }
}