val pi: Float? by lazy {
    3.14f
}

fun main(args: Array<String>) {
    lateinit var fullName: String
    fullName = "Ali Jaber"
    if (!fullName.isNullOrEmpty()) {
        print("Hi, $fullName")
    } else {
        println("not found")
    }
    
    val area = pi!! * 8 * 8
}