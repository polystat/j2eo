package translator;

import eotree.*;
import tree.Expression.Expression;
import tree.Expression.Primary.MethodInvocation;
import tree.Expression.SimpleReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;


public class MethodInvocations {
    public static EOCopy mapMethodInvocation(MethodInvocation methodInvocation){
        Optional<EOExpr> src = Optional.empty();
        if (methodInvocation.qualifier != null){
            Expression expr = methodInvocation.qualifier;
            if (expr instanceof SimpleReference) {
                Collections.reverse(((SimpleReference) expr).compoundName.names);
                src = buildEODotObjTree(((SimpleReference) expr).compoundName.names);
            }
        }
        if (methodInvocation.superSign){
            throw new IllegalArgumentException("Super sign isn't supported yet");
        }
        if (methodInvocation.typeArguments != null){
            throw new IllegalArgumentException("Type arguments aren't supported yet");
        }

        return new EOCopy(
                new EODot(src, methodInvocation.name),
                methodInvocation.arguments.arguments.stream()
                        .map(Expressions::mapExpression)
                        .collect(Collectors.toList())
        );
        // Optional.empty() in EODot will be removed
    }

    private static Optional<EOExpr> buildEODotObjTree(ArrayList<String> names) {
        if (names.size() > 0) {
            String name = names.remove(0);
            if (name.equals("System")) {
                name = "class_" + name;
            }
            return Optional.of(
                    new EODot(
                            buildEODotObjTree(names),
                            name
                    )
            );
        } else {
            return Optional.empty();
        }
    }
}
