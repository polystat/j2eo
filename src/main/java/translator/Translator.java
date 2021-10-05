package translator;

import eotree.*;
import tree.Compilation.Package;
import tree.Compilation.TopLevelComponent;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Translator {
    public EOProgram translate(Package pkg) {
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
                        .map(this::mapTopLevelComponent)
                        .collect(Collectors.toList())
        );
    }

    private EOBnd mapTopLevelComponent(TopLevelComponent component) {
        if (component.classDecl != null) {
            // TODO: implement
            throw new IllegalStateException("Not implemented");
        } else if (component.interfaceDecl != null) {
            // TODO: implement
            throw new IllegalStateException("Not implemented");
        } else {
            throw new IllegalArgumentException("Supplied TopLevelComponent does not have neither class nor interface");
        }
    }
}
