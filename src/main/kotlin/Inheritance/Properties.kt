package Inheritance

open class Parent() {
    open var num: Int = 100
    open fun demo(){
        println("demo function of parent class")
    }
}

interface Driveable {
    val maxSpeed: Double
    fun drive(): String
}

open class MotorVehicle(
    override val maxSpeed: Double,
    val wheelCount: Int
) : Driveable {
    override fun drive() = "Wroom!"
}

class Child: Parent() {
    override var num: Int  = 101
    override fun demo() {
        super.demo()
        println("demo function of child class")
    }
    fun demo2(){
        println(super.num)
    }
}

fun main(args: Array<String>) {
    val obj = Child()
    obj.demo()
    obj.demo2()
}