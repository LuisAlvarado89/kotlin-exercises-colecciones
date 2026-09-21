package org.ies.tierno.colecciones

fun first(list: List<String>): String {
    return list[0]
}

fun main() {
    val list = listOf("Mañana","Hola", "Altura", "Programacion")

    println(first(list))


}