package datatypes

fun main(args: Array<String>) {
    val language = "Kotlin"
    println(language)

    var dayOfWeek = "Monday"
    println(dayOfWeek) // Monday

    dayOfWeek = "Tuesday"
    println(dayOfWeek) // Tuesday

    val cost = 3
    val costOfCoffee = cost
    println(costOfCoffee)

    val ten = 10
    val greeting = "Hello"
    val firstLetter = 'A'

    println(ten)
    println(greeting)
    println(firstLetter)

    var number = 10
    number = 11
    // an error here! -> number = "twelve"

}