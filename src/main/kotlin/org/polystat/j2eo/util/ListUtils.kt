package org.polystat.j2eo.util

import java.util.*
import java.util.stream.Collectors
import java.util.stream.Stream

object ListUtils {
    @JvmStatic
    @SafeVarargs
    fun <T> listOf(vararg elems: T): List<T> {
        return Stream.of(*elems).collect(Collectors.toList())
    }

    @SafeVarargs
    fun <T> concat(vararg lists: List<T>): List<T> {
        return Stream.of(*lists)
            .flatMap { obj: List<T> -> obj.stream() }
            .collect(Collectors.toList())
    }

    fun <T : Any> first(list: List<T>): Optional<T> {
        return if (list.isEmpty()) {
            Optional.empty()
        } else {
            Optional.ofNullable(list[0])
        }
    }

    fun <T : Any> last(list: List<T>): Optional<T> {
        return if (list.isEmpty()) {
            Optional.empty()
        } else {
            Optional.ofNullable(list[list.size - 1])
        }
    }
}
