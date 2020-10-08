package collection

import java.util.*

data class Car(var name: String, var price: Int)

fun main(args: Array<String>) {
    val set = mutableSetOf(1, 2, 1, 3)
    println(set)

    set.remove(3)
    set += listOf(4, 5)
    println(set)

    val words = setOf("pen", "cup", "dog", "person", "cement", "coal", "donkey", "spectacles")

    val w1 = words.first()
    println(w1)

    val w2 = words.last()
    println(w2)

    val w3 = words.findLast { w -> w.startsWith("d") }
    println(w3)

    val w4 = words.last { w -> w.startsWith('s') }
    println(w4)


    val nums = setOf(11, 5, 3, 8, 1, 9, 6, 2)
    val sortAsc = nums.sorted()
    println(sortAsc)

    val sortDesc = nums.sortedDescending()
    println(sortDesc)

    val revNums = nums.reversed()
    println(revNums)

    val cars = setOf(
        Car("Mazda", 6300), Car("Toyota", 12400),
        Car("Skoda", 5670), Car("Mercedes", 18600)
    )

    val res = cars.sortedBy { car -> car.name }
    res.forEach { e -> println(e) }

    val treeSet = TreeSet(listOf(2,3,4))
    println(treeSet)
    treeSet.add(1)
    println(treeSet)
}