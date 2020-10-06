class Human(var n: String) {
    var name = n
    var age: Int = 0
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
    fun think() {
        println("Kotlin is Awesome $name : $age")
    }
}

fun main(args: Array<String>) {

    var human = Human("ali", 20)
    human.think()
}