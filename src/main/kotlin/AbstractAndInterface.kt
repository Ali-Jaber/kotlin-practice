interface Handler {
    fun accept()
    fun test(): Boolean
}

fun main(args: Array<String>) {
    val handler = object : Handler {
        override fun accept() =
            println("Kotlin")

        override fun test(): Boolean = true

    }
}