package Task3

//typealias SumFun<T, Z> = (T, Z) -> Int

typealias SumFun = (Int, Int) -> Int

class Fun {
//
//    val t: SumFun<Int, Int> = { x: Int, y: Int -> x + y }
//    println()
}

//fun invokeLambda(e: (s) -> Int) : Int {
//    return 4
//}

fun sum(a: Int, b: Int, sum: SumFun): Int {
    return sum(a, b)
}

fun main(args: Array<String>) {
    val a = 2
    val b = 3
    println(sum(a, b) { _, _ -> a + b })
}