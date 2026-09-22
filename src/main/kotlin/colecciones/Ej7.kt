package org.ies.tierno.colecciones

//Un método que recibe una lista de números enteros (numbers) y //
// devuelve otra lista con los números pares que había en numbers//

fun filterNumbers(listNumbers: List<Int>): List<Int> {
    return listNumbers.filter { it % 2 == 0 }

}

fun main() {
    val list = listOf(1, 45, 6, 78, 24, 42, 65, 54)
    println(filterNumbers(list))
}