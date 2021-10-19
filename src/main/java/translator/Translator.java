package translator;

import eotree.*;
import tree.Compilation.CompilationUnit;
import tree.Compilation.Package;
import tree.Compilation.SimpleCompilationUnit;
import tree.Compilation.TopLevelComponent;
import tree.Declaration.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Translator {
    public static EOProgram translate(CompilationUnit unit) {
        if (unit instanceof SimpleCompilationUnit)
            return mapSimpleCompilationUnit((SimpleCompilationUnit) unit);
        else
            throw new IllegalArgumentException("CompilationUnit of type " +
                                               unit.getClass().getSimpleName() +
                                               " is not supported");
    }

    public static EOProgram mapPackage(Package pkg) {
        return new EOProgram(
                new EOLicense(), // TODO: add license?
                new EOMetas(
                        Optional.of(
                                String.join(".", pkg.compoundName.names)
                        ),
                        new ArrayList<>()
                ),
                pkg.components.components
                        .stream()
                        .map(Translator::mapTopLevelComponent)
                        .collect(Collectors.toList())
        );
    }

    public static EOProgram mapSimpleCompilationUnit(SimpleCompilationUnit unit) {
        return new EOProgram(
                new EOLicense(),
                new EOMetas(
                        Optional.empty(),
                        new ArrayList<>()
                ),
                unit.components.components
                        .stream()
                        .map(Translator::mapTopLevelComponent)
                        .collect(Collectors.toList())
        );
    }

    public static EOBnd mapTopLevelComponent(TopLevelComponent component) {
        if (component.classDecl != null) {
            return Classes.mapClass(component.classDecl);
        } else if (component.interfaceDecl != null) {
            return Classes.mapInterface(component.interfaceDecl);
        } else {
            throw new IllegalArgumentException("Supplied TopLevelComponent does not have neither class nor interface");
        }
    }
}
