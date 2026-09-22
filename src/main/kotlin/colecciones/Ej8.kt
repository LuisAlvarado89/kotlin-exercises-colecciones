package org.ies.tierno.colecciones

//Un método sum( numbers: List<Double> ) que calcula la suma de los números en la lista,
// si la lista está vacía devuelve 0//


fun sum(numbers: List<Double>): Double =
    numbers.fold(0.0) { a, b -> a + b }


fun main() {
    println(
        sum(listOf(2.5, 3.0, 4.5))
    )
}