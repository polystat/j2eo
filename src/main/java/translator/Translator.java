package translator;

import eotree.*;
import tree.Compilation.CompilationUnit;
import tree.Compilation.Package;
import tree.Compilation.SimpleCompilationUnit;
import tree.Compilation.TopLevelComponent;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static util.ListUtils.listOf;

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
        ArrayList<EOBndExpr> stdBnds = new ArrayList<>(); // Standard top-level bounds
        stdBnds.add(
                new EOBndExpr(
                        new EOObject(
                                new ArrayList<>(),
                                Optional.empty(),
                                Collections.emptyList()
                        ),
                        new EOBndName("class_Object")
                )
        );
        EOObject printlnObj = new EOObject(
                        listOf(
                                new EOBndName("text")
                        ),
                        Optional.empty(),
                        listOf(
                                new EOBndExpr(
                                        new EOCopy(
                                                new EODot(Optional.empty(), "stdout"),
                                                listOf(
                                                        new EOAnonExpr(
                                                                new EODot(Optional.empty(), "text")
                                                        )
                                                )
                                        ),
                                        new EOBndName("@")
                                )
                        )
                );
        EOObject outObj =
                new EOObject(
                        listOf(),
                        Optional.empty(),
                        listOf(
                                new EOBndExpr(
                                        printlnObj,
                                        new EOBndName("println")
                                )
                        )
                );
        stdBnds.add(
                new EOBndExpr(
                        new EOObject(
                                listOf(),
                                Optional.empty(),
                                listOf(
                                        new EOBndExpr(
                                                outObj,
                                                new EOBndName("out")
                                        )
                                )
                        ),
                        new EOBndName("class_System")
                )
        );
        List<EOBndExpr> bndLst = unit.components.components
                        .stream()
                        .map(Translator::mapTopLevelComponent)
                        .map(bnd -> (EOBndExpr)bnd)
                        .collect(Collectors.toList());

        // FIXME: assuming there is only one top-level component and it is a class
        // Always calling the 'main' method
        String mainClassName = bndLst.get(0).bndName.name;
        bndLst.add(new EOBndExpr(
                new EODot(Optional.empty(), mainClassName),
                new EOBndName("mainObj")
        ));
        bndLst.add(
                new EOBndExpr(
                        new EODot(
                                Optional.of(new EODot(
                                        Optional.empty(),
                                        "mainObj"
                                )),
                                "main"
                        ),
                        new EOBndName("@")
                )
        );

        List<EOBnd> globalBnd = listOf(
                new EOBndExpr(
                        new EOObject(
                                listOf(),
                                Optional.of(new EOBndName("args")),
                                bndLst
                        ),
                        new EOBndName("global")
                )
        );

        globalBnd.addAll(stdBnds);


        return new EOProgram(
                new EOLicense(
                        new EOComment(LocalDateTime.now().toString()),
                        new EOComment("j2eo team")
                ),
                new EOMetas(
                        Optional.empty(),
                        listOf(
                                new EOMeta("alias", "org.eolang.io.stdout")
                        )
                ),
                globalBnd
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
