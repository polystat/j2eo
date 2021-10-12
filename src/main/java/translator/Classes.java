package translator;

import eotree.*;
import tree.Declaration.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import static util.ListUtils.concat;
import static util.ListUtils.listOf;

public class Classes {
    public static EOBnd mapClass(ClassDeclaration classDeclaration) {
        if (!(classDeclaration instanceof NormalClassDeclaration))
            throw new IllegalArgumentException("Only NormalClassDeclaration is supported, but " +
                                               classDeclaration.getClass().getSimpleName()
                                               + " was passed");
        NormalClassDeclaration clsDec = (NormalClassDeclaration) classDeclaration;

        // TODO: implement inheritance support
        if (clsDec.extendedType != null)
            throw new IllegalArgumentException("Extended types are not supported yet");

        return new EOBndExpr(
                new EOObject(
                        new ArrayList<>(),
                        Optional.empty(),
                        concat(listOf(
                                        /* Super class extension */
                                        clsDec.extendedType != null ?
//                                        new EOBndExpr(
//                                                new EODot(Optional.empty(), clsDec.extendedType.),
//                                                new EOBndName("@")
//                                        )
                                                null :
                                                // Derive classes without "extends" specification from Object class.
                                                new EOBndExpr(
                                                        new EODot(Optional.empty(), "class_Object"),
                                                        new EOBndName("@")
                                                )


                                ),

                                clsDec.body.declarations.stream()
                                        .map(Declarations::mapDeclaration)
                                        .collect(Collectors.toList()))
                ),
                new EOBndName(clsDec.name)
        );
    }

    public static EOBnd mapInterface(InterfaceDeclaration interfaceDeclaration) {
        throw new IllegalArgumentException("Interface declarations are not yet implemented");
    }
}
