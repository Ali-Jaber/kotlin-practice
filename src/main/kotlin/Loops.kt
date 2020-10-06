fun main(args: Array<String>) {

    var n = 1..10
    for (i in n) {
        println(i)
    }
    println()
    for (i in n step 2) {
        println(i)
    }
    println()
    var m = 10 downTo 1
    for (j in m) {
        println(j)
    }
    println()

    n = 1 until 16
    for(i in n) {
        println(i)
    }
    println()
    for (i in n.reversed()) {
        println(i)
    }
    println()
    var x = 'A'..'z'
    for (i in x) {
        println(i)
    }
}