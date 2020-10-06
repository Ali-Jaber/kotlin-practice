enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

    companion object {
        fun findByRgb(rgb: String): Rainbow {
            for(enum in Rainbow.values()) {
                if(rgb == enum.rgb)
                    return enum
            }
            return NULL
        }
    }
    fun isRainbow(color: String) : Boolean {
        for (enum in Rainbow.values()) {
            if (color.toUpperCase() == enum.name) return true
        }
        return false
    }

    fun printFullInfo() {
        println("Color - $color, rgb - $rgb")
    }
}

fun main(args: Array<String>) {
    println(Rainbow.valueOf("RED"))

    val color: Rainbow = Rainbow.GREEN
    println(color.name)
    println(color.ordinal)
    println(Rainbow.findByRgb("#FF0001"))
}