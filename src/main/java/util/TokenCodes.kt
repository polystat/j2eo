package util

enum class TokenCodes(val value: String) {
    PRIM__BYTE("prim__byte"),
    PRIM__SHORT("prim__short"),
    PRIM__CHAR("prim__char"),
    PRIM__INT("prim__int"),
    PRIM__LONG("prim__long"),
    PRIM__FLOAT("prim__float"),
    PRIM__DOUBLE("prim__double"),
    PRIM__BOOLEAN("prim__boolean"),
    PRIM__NUMBER("prim__number"),
    CLASS__SYSTEM("class__System"),
    CLASS__STRING("class__String"),
    CLASS__OBJECT("class__Object"),
    EO_CAGE("gray.cage")
}