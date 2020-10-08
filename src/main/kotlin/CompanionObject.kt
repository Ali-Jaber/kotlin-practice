class Rectangle {
    companion object {
        fun calcArea(l: Int, w: Int) {
            println("rectangle surface Area is : ${l*w}")
        }

        @JvmStatic
        fun calcArea2(l: Int, w: Int) {
            println("rectangle surface Area is : ${l*w}")
        }
    }
}

// Companion object and outer class
class Deck {
    companion object {
        val size = 10
        val height = 2
        fun volume(bottom: Int, height: Int) = bottom * height
    }

    val square = size * size             //100
    val volume = volume(square, height)  //200
}

/*
But what happens if the outer class has a property with the same name as the companion object?
Well, in this case, the properties from the class will shadow the properties of the companion.
 */

class Deck2 {
    companion object {
        val size = 10
    }
    val size = 2
    val square = size * size // 4
}

/*
In this case, if you want to use a property from the companion,
you must use its name, or Companion, if it wasn't named:
 */

class Deck3 {
    companion object {
        val size = 10
    }
    val size = 2
    val square = Companion.size * Companion.size // 100
}

/*
    Limitations of companion objects:
    Only one companion object is available for each class.
    That means you can't create multiple companion objects for a class because Kotlin does not support this behavior,
     even if they were named differently. If we try to do it, an error will occur:
     class BadClass {
    companion object Properties {

    }

    companion object Factory {

    }
}

    Compilation error
    Error: Only one companion object is allowed per class
 */

/*
 However, we can create one companion object and some nested objects:
 */

class Player4(val id: Int) {
    companion object Properties {
        /* Default player speed in playing field - 7 cells per turn */
        val defaultSpeed = 7

        fun calcMovePenalty(cell: Int): Int {
           return 0
        }
    }

    /* creates a new instance of Player */
    object Factory {
        fun create(playerId: Int): Player4 {
            return Player4(playerId)
        }
    }
}

fun main(args: Array<String>) {
    Rectangle.calcArea(5,5)
    /* prints 7 */
    println(Player4.Properties.defaultSpeed)

/* also prints 7 */
    println(Player4.defaultSpeed)

/* prints 13 */
    println(Player4.Factory.create(13).id)
}