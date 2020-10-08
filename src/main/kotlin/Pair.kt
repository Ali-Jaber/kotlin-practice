fun main(args: Array<String>) {
    val (x,y) = Pair(1,"Kotlin")
    println(x)
    println(y)

    val pair = Pair(2,"Java")
    println(pair.first)
    println(pair.second)
    println("String representation is $pair")

    val pair2 = Pair("Kotlin", listOf("1.1","1.2","1.3"))
    println(pair2)
}