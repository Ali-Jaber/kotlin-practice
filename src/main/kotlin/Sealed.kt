import kotlin.math.sqrt

sealed class Shape {
    data class Circle(val radius: Double): Shape()
    data class Square(val length: Double): Shape()
    data class Rectangle(val length: Double, val breadth: Double): Shape()
}

fun Shape.takeArea(): Double {
    return when(this) {
        is Shape.Circle -> Math.PI * sqrt(this.radius)
        is Shape.Square -> sqrt(this.length)
        is Shape.Rectangle -> this.breadth * this.length
    }
}

fun main(args: Array<String>) {
    val a = Shape.Circle(3.55)
    println(a.takeArea())
}