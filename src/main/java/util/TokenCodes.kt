package util

enum class TokenCodes(val value: String, val importPath: String) {
    PRIM__BYTE("prim__byte", "stdlib.primitives.prim__byte"),
    PRIM__SHORT("prim__short", "stdlib.primitives.prim__short"),
    PRIM__CHAR("prim__char", "stdlib.primitives.prim__char"),
    PRIM__INT("prim__int", "stdlib.primitives.prim__int"),
    PRIM__LONG("prim__long", "stdlib.primitives.prim__long"),
    PRIM__FLOAT("prim__float", "stdlib.primitives.prim__float"),
    PRIM__DOUBLE("prim__double", "stdlib.primitives.prim__double"),
    PRIM__BOOLEAN("prim__boolean", "stdlib.primitives.prim__boolean"),
    PRIM__NUMBER("prim__number", "stdlib.primitives.prim__number"),
    CLASS__SYSTEM("class__System", "stdlib.lang.class__System"),
    CLASS__STRING("class__String", "stdlib.lang.class__String"),
    CLASS__OBJECT("class__Object", "stdlib.lang.class__Object"),
    CLASS__RANDOM("class__Random", "stdlib.util.class__Random"),
    EO_CAGE("gray.cage", "org.eolang.gray.cage")
}