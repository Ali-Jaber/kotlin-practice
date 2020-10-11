class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {
    val person = Person().apply {
        name = "Ali Jaebr"
        age = 24
    }
    val name = with(person) {
        println(age)
        println(this.name)
        name
    }

    person.also {
        it.name = "Mohammed"
    }
    println(person.name)

    var str: String? = "Hello"
    val len = str?.let {
        println(it)
        println(it.reversed())
        it.length
    }
    println(len)
}