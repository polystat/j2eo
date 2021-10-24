package translator;

import eotree.*;
import tree.Declaration.MethodDeclaration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

import static util.ListUtils.listOf;

public class Methods {
    public static EOBndExpr mapMethodDeclaration(MethodDeclaration dec) {
        return new EOBndExpr(
                new EOObject(
                        // Non-vararg parameters
                        dec.parameters != null && !dec.name.equals("main") ? // Exclude 'String[] args' fon now
                                dec.parameters.parameters.stream()
                                        .filter(param -> !param.signEllipsis)
                                        .map(param -> new EOBndName(param.name))
                                        .collect(Collectors.toList()) :
                                new ArrayList<>(),
                        // Optional vararg parameter
                        dec.parameters != null ?
                                dec.parameters.parameters.stream()
                                        .filter(param -> param.signEllipsis)
                                        .map(param -> new EOBndName(param.name))
                                        .findFirst() :
                                Optional.empty(),
                        // Bound attributes
                        listOf(
                                new EOBndExpr(
                                        new EOCopy(
                                                new EODot(Optional.empty(), "seq"),
                                                dec.methodBody != null ?
                                                dec.methodBody.block.blockStatements.stream()
                                                        .map(Statements::mapBlockStatement)
                                                        .collect(Collectors.toList()) :
                                                        Collections.emptyList()
                                        ),
                                        new EOBndName("@")
                                )
                        )
                ),
                new EOBndName(dec.name)
        );
    }
}
