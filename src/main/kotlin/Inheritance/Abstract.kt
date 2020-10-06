package Inheritance

abstract class Human2 {

    abstract fun think()
    fun talk() {
        println("talking...")
    }
}

class Ali2() : Human2() {

    override fun think() {
        println("Virtual Thinking")
    }
}

fun main(args: Array<String>) {
    val human: Human2 = Ali2()
    human.talk()
    human.think()
}