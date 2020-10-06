fun main(args: Array<String>) {
    val num: Int = 2

    var str = when (num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Give a proper input"
    }
    println(str)
}