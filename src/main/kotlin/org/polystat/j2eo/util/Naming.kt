package org.polystat.j2eo.util

import tree.CompoundName

fun String.eoClassName(): String = genClassName(this)

fun genClassName(javaName: String): String =
    "class__$javaName"

// We should introduce logic considering packages and classes
fun CompoundName.eoClassCompoundName(): CompoundName =
    CompoundName(names.dropLast(1) + names.last().eoClassName())
