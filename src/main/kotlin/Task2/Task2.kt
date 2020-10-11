package Task2

import java.time.LocalDate
import java.time.Month

class Movie(val id: String, val name: String, val date: LocalDate) : Comparable<Movie> {

    override fun compareTo(other: Movie): Int {
        if (id > other.id) {
            return 1
        } else if (id < other.id) {
            return -1
        }
        return 0
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Movie

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}

fun main(args: Array<String>) {
    val movie1 = Movie("A123","The Shawshank Redemption", LocalDate.of(1994,Month.APRIL,22))
    val movie11 = Movie("A123","The Shawshank Redemption", LocalDate.of(1994,Month.APRIL,22))
    val movie2 = Movie("A124","The Godfather", LocalDate.of(1972,Month.FEBRUARY,15))
    val movie3 = Movie("A125","The Dark Knight", LocalDate.of(2008,Month.JUNE,8))
    val movie4 = Movie("A125","The Dark Knight2", LocalDate.of(2012,Month.AUGUST,5))

    println(movie1.equals(movie11))
    println(movie1 == movie11)
    println(movie2 == movie3)
    println(movie3 == movie4)
}