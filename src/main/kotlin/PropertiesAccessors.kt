/*
Property getter
Custom getter:
 */

class Client {
    var name: String = "Unknown"
    val defaultAge = 18
    var age: Int = 18
        set(value) {
            field = if (value < 0) {
                println("Age cannot be negative. Set to $defaultAge")
                defaultAge
            } else
                value
        }
    val info: String
        get() {
            return "name = $name, age = $age"
        }

}


fun main(args: Array<String>) {
    val client = Client()
    println(client.info) // name = Unknown, age = 18
    client.name = "Lester"
    client.age = 20
    println(client.info) // name = Lester, age = 20
    client.age = -1      // Age cannot be negative. Set to 18.
    println(client.age)
}