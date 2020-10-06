package functions

fun sum(a: Int, b: Int): Int {
    val result = a + b
    return result
}


/*
There are two ways to declare a function that returns nothing:
 */
fun printAB(a: Int, b: Int) {
    println(a)
    println(b)
}

fun printSum(a: Int, b: Int): Unit {
    println(a + b)
}

/*
Single-expression functions
 */
fun sumSingle(a: Int,b: Int): Int = a + b

fun sayHello(): Unit = println("Hello")

fun isPositive(number: Int): Boolean = number > 0
// also it can be inferred automatically:

fun sum2(a: Int, b: Int) = a + b // Int

fun sayHello2() = println("Hello") // Unit

fun isPositive2(number: Int) = number > 0 // Boolean

/*
Default arguments
 */

fun printLine(line: String = "", end: String = "\n") = print("$line$end")

fun findMax(n1: Int, n2: Int, absolute: Boolean = false): Int {
    val v1: Int
    val v2: Int

    if (absolute) {
        v1 = Math.abs(n1)
        v2 = Math.abs(n2)
    } else {
        v1 = n1
        v2 = n2
    }

    return if (v1 > v2) n1 else n2
}

/*
Named arguments:
 */

fun calcEndDayAmount(startAmount: Int, ticketPrice: Int, soldTickets: Int) =
        startAmount + ticketPrice * soldTickets

fun main(args: Array<String>) {
    val result1 = sum(2, 3)
    println(result1)
    val result2 = sum(result1, 7)
    println(result2)


    // Default arguments
    printLine("Hello, Kotlin", "!!!") // prints "Hello, Kotlin!!!"
    printLine("Kotlin") // prints "Kotlin" with an ending
    printLine() // prints an empty line like println()

    println(findMax(11, 15)) // 15
    println(findMax(11, 15, true)) // 15
    println(findMax(-4, -9)) // -4
    println(findMax(-4, -9, true)) // -9

    // Named arguments
    val amount1 = calcEndDayAmount(1000, 10, 500)  // 6000
    val amount2 = calcEndDayAmount(
            startAmount = 1000,
            ticketPrice = 10,
            soldTickets = 500
    )  // 6000

    // Mixing named and positional arguments
    /*
    val amount = calcEndDayAmount(10, 500)  // It does not work:
                                        // no value passed for soldTickets
    Here 10 is assigned to the first optional argument startAmount, not to the second parameter ticketPrice.
    To invoke this function as you want it, we must use named parameters:
     */
    calcEndDayAmount(1000, ticketPrice = 10, soldTickets = 500)
}