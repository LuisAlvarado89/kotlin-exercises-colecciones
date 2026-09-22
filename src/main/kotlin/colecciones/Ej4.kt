package org.ies.tierno.colecciones

fun sum(list: List<Int>): List<Int> =
    list.map { it + 10 }


fun main() {
    val list = listOf(4, 78, 46, 32, 25)
    println(sum(list))
}
