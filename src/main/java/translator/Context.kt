package translator

import tree.Entity

class Context(var uniqueObjectId: Int) {
    fun genUniqueEntityName(e: Entity?): String {
        return if (e != null) {
            var simpleName = e.javaClass.simpleName
            simpleName = simpleName[0].lowercase() + simpleName.substring(1)
            "${simpleName}_${uniqueObjectId++}"
        } else {
            "no_name_for_null_entity"
        }
    }
}
