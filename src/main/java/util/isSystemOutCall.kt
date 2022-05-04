package util

import tree.Expression.Primary.FieldAccess
import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference

fun isSystemOutCall(methodInvocation: MethodInvocation): Boolean {
    return methodInvocation.qualifier != null &&
        when (val methodQualifier = methodInvocation.qualifier) {
            is SimpleReference ->
                methodQualifier.compoundName.names.size == 3
                        && methodQualifier.compoundName.names[0] == "class__System"
                        && methodQualifier.compoundName.names[1] == "out"
            is FieldAccess -> false
            else -> false
        }
}
