package Inheritance

open class Human(age: Int) {
    init {
        println("is human : " + age)
    }
    
    open fun think() {
        println("Real Thinking")
    }
}

class Ali(age: Int) : Human(age) {
    init {
        println("in ali")
    }

    override fun think() {
        println("Virtual Thinking")
    }
}

fun main(args: Array<String>) {
    val human: Human = Ali(25)
    human.think()
}