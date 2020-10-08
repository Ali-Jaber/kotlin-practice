package functionalprogramming

fun main(args: Array<String>) {
    val numbers = listOf(2, 3, 4, 6, 23, 90)
    val myPredicate = { num: Int -> num > 10 }

    val check1 = numbers.all(myPredicate)
    println(check1)

    val check2 = numbers.any(myPredicate)
    println(check2)

    val check3 = numbers.count(myPredicate)
    println(check3)

    val check4 = numbers.find(myPredicate)
    println(check4)

    val allEven = numbers.none { it % 2 == 1 }
    println(allEven)

    val sum = numbers.sum()
    println(sum)
}