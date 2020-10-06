package datatypes

fun main(args: Array<String>) {
    val text = "Hello, I am studying Kotlin now."
    val n = 1

    val text1: String = "Hello, I am studying Kotlin now."
    val n1: Int = 1

    /*
     val greeting // error
     greeting = "hello"
     */
    val greeting: String // ok
    greeting = "hello"

    /*
    Type mismatch:
    val n: Int = "abc" // Type mismatch: inferred type is String but Int was expected
    var age = 30 // the type is inferred as Int
    age = "31 years old" // Type mismatch
     */

    var string = "Hello, World!"
    string = "Hello, Kotlin!"
}