package util

import tree.Expression.Primary.MethodInvocation
import tree.Expression.SimpleReference

fun isSystemOutCall(methodInvocation: MethodInvocation): Boolean {
    return if (methodInvocation.qualifier != null) {
        if ((methodInvocation.qualifier as SimpleReference).compoundName.names.size == 3) {
            (methodInvocation.qualifier as SimpleReference).compoundName.names[0] == "class__System" &&
                    (methodInvocation.qualifier as SimpleReference).compoundName.names[1] == "out"
        } else {
            false
        }
    } else {
        false
    }
}
