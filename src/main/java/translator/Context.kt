package translator

import tree.Entity

class Context(var uniqueObjectIds: HashMap<String, Int>) {
    fun genUniqueEntityName(e: Entity?): String {
        return if (e != null) {
            var simpleName = e.javaClass.simpleName
            simpleName = simpleName[0].lowercase() + simpleName.substring(1)

            uniqueObjectIds[simpleName] ?: run { uniqueObjectIds[simpleName] = 0 }
            uniqueObjectIds[simpleName] = uniqueObjectIds[simpleName]!! + 1

            "${simpleName}_${uniqueObjectIds[simpleName]}"
        } else {
            "no_name_for_null_entity"
        }
    }
    fun genUniqueEntityName(name: String): String {
        uniqueObjectIds[name] ?: run { uniqueObjectIds[name] = 0 }
        uniqueObjectIds[name] = uniqueObjectIds[name]!! + 1
        return "${name}_${uniqueObjectIds[name]}"
    }
}
