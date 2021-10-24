package translator;

import eotree.*;
import tree.Expression.Primary.MethodInvocation;
import java.util.Optional;
import java.util.stream.Collectors;


public class MethodInvocations {
    public static EOCopy mapMethodInvocation(MethodInvocation methodInvocation){
        if (methodInvocation.qualifier != null){
            throw new IllegalArgumentException("Qualifiers aren't supported yet");
        }
        if (methodInvocation.superSign){
            throw new IllegalArgumentException("Super sign isn't supported yet");
        }
        if (methodInvocation.typeArguments != null){
            throw new IllegalArgumentException("Type arguments aren't supported yet");
        }

        return new EOCopy(
                new EODot(Optional.empty(), methodInvocation.name),
                methodInvocation.arguments.arguments.stream()
                        .map(Expressions::mapExpression)
                        .collect(Collectors.toList())
        );
        // Optional.empty() in EODot will be removed
    }
}
