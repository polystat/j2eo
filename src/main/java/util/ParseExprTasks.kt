package util

import tree.Entity
import kotlin.collections.ArrayList

class ParseExprTasks {
    val tasks = ArrayList<Pair<String, Entity>>()

    fun addTask(e: Entity): String {
        val name = "e_${e.hashCode()}"
        tasks.add(Pair(name, e))
        return name
    }
}