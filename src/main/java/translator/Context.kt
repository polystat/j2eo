package translator

import tree.Entity

class Context(var uniqueObjectId: Int) {
    fun genUniqueEntityName(e: Entity?): String {
        return if (e != null) {
            "atom_${e.javaClass.simpleName}_${uniqueObjectId++}"
        } else {
            "no_name_for_null_entity"
        }
    }
}
