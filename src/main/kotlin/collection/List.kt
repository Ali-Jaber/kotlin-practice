package collection

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val cars = listOf<String>("BMW", "Honda", "Mercedes")
    println(cars)

    val textUsMethod = listOf("SMS", "Email")

    val staff = emptyList<String>()
    println(staff) // output: []

    val partyList = listOf("Ali", "Mohammed", "Khaled", "Ahmad")

    if (partyList.isNotEmpty()) {
        val size = partyList.size
        val whoIsFirst = partyList[0]
        println("The party will not be lonesome! We already got $size people. And $whoIsFirst was the first to arrive today!")
    }

    println("Khaled came in ${partyList.indexOf("Khaled") + 1}") // Khaled came in 2
    println("Guys, is it true that Mohammed came? It's ${partyList.contains("Mohammed")}")

    for (name in partyList) {
        println("Hello $name!")
    }

    // Mutable List
    val places = mutableListOf("Paris", "Moscow", "Tokyo")
    places.add("Saint-Petersburg")
    println(places) // output: [Paris, Moscow, Tokyo, Saint-Petersburg]

    val products = listOf("Milk", "Cheese", "Coke")
    val finalList = products.toMutableList()
    finalList.add("Chips")
    finalList[0] = "Chips"
    println(finalList)

    val dadProduct = listOf("Banana","Watermelon","Apple")
    finalList.addAll(dadProduct)
    println(dadProduct)

    for (product in finalList) {
        println(product)
    }

    finalList.removeAt(0)
    finalList.remove("Apple")
    finalList.clear()

    val arrayList = ArrayList(listOf("Ali","Jaber"))
    println(arrayList)

    val linkedList: Queue<String> = LinkedList(listOf("Ali","Jaber"))
    println(linkedList)
}