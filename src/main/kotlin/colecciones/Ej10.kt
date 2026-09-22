package org.ies.tierno.colecciones

data class Order(val id: Int, val price: Double, val items: List<OrderItem>)
data class OrderItem(val itemId: Int, val price: Double)

//Ejercicio10
fun getPrices(ordersList: List<Order>): List<Double> {
    val newList = ordersList.map { it.price }
    return newList

}

//Ejercicio11

fun returnPrice(listOrder: List<Order>): Double {
    val totalPrice = listOrder
        .map { it.price }//te da los precios
        .reduce { acc, price -> acc + price }//se suma ese precio

    return totalPrice
}