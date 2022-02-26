package util

enum class TokenCodes(val value: String) {
    PRIM__INT("prim__int"),
    PRIM__FLOAT("prim__float"),
    PRIM__BOOLEAN("prim__boolean"),
    PRIM__NUMBER("prim__number"),
    CLASS__SYSTEM("class__System"),
    CLASS__STRING("class__String"),
    CLASS__OBJECT("class__Object")
}