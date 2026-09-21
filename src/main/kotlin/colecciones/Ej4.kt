package org.ies.tierno.colecciones

fun sum(list: List<Int>): List<Int> {
    val newlist = mutableListOf<Int>()

    for (number in list) {
        number + 10

        newlist.add(number)

    }
    return newlist
}

fun main(){

}
