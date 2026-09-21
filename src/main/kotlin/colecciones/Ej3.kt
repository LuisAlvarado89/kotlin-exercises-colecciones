package org.ies.tierno.colecciones

fun last(list: List<Int>): Int {
    return list[list.lastIndex]
}

fun main() {
    val list = listOf(10, 20, 30, 40)
    println(last(list))
}