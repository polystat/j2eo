package translator;

import eotree.EOBndExpr;
import eotree.EOBndName;
import eotree.EOObject;
import tree.Declaration.Declaration;
import tree.Declaration.MethodDeclaration;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static util.ListUtils.first;

public class Methods {
    public static EOBndExpr mapMethodDeclaration(MethodDeclaration dec) {
        return new EOBndExpr(
                new EOObject(
                        // Non-vararg parameters
                        dec.parameters != null ?
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
//                        dec.methodBody.block.blockStatements.stream()
//                                .map(Statements::mapBlockStatement)
//                                .collect(Collectors.toList())
                        new ArrayList<>()
                ),
                new EOBndName(dec.name)
        );
    }
}
