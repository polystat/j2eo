package util

import arrow.core.None
import eotree.EOBndExpr
import eotree.EOObject
import tree.Entity
import kotlin.collections.ArrayList

class ParseExprTasks {
    val tasks = ArrayList<Pair<String, Entity>>()
    val readyBindings = mutableListOf<Pair<String, EOBndExpr>>()

    fun addTask(e: Entity): String {
        val name = "e_${e.hashCode()}"
        tasks.add(Pair(name, e))
        return name
    }

    fun addReadyBinding(obj: EOBndExpr): String {
        val name = "e_${obj.hashCode()}"

        val newObj = EOBndExpr(
            EOObject(
                listOf(),
                None,
                listOf(obj)
            ),
            name
        )
        readyBindings.add(Pair(name, newObj))
        return name
    }
}