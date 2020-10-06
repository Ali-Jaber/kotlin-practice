class Rectangle {
    companion object {
        fun calcArea(l: Int, w: Int) {
            println("rectangle surface Area is : ${l*w}")
        }
    }
}

fun main(args: Array<String>) {
    Rectangle.calcArea(5,5)
}