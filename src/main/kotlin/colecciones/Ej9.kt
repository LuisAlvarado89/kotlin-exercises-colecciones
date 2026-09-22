package org.ies.tierno.colecciones

//Un método junction(numbers1: List<Double> , numbers2: List<Double>) que dadas dos listas de números,//
//devuelve los números que están tanto numbers1 como en numbers2//

fun junction(numbers1: List<Double>, numbers2: List<Double>): List<Double> {
    return numbers1.filter { it in numbers2 }
}

fun main() {
    println(
        junction(
            listOf(1.0, 2.0, 3.0, 4.0),
            listOf(3.0, 4.0, 5.0, 6.0)
        )
    )
}
