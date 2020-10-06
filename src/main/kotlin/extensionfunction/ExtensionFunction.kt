package extensionfunction

fun String.playWithText(): String {
    var str = ""
    for (s in indices) {
        str += if (s % 2 == 0) {
            this[s].toUpperCase()
        } else {
            this[s].toLowerCase()
        }
    }
    return str
}

fun main(args: Array<String>) {
    val name = "kotlin"
    println(name.playWithText())
}