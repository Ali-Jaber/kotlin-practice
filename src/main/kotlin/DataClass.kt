data class Costumer(val firstName: String, val secondName: String, val phone: String)


// equals and hashCode
// toString
// copy
fun main(args: Array<String>) {
    val cost1 = Costumer("Ali","Jaber","555")
    val cost2 = Costumer("Ali","Jaber","555")
    println(cost1 == cost2)
    val cost3 = cost2.copy(phone = "888")
    println(cost1.hashCode())
    println(cost2.hashCode())
    println(cost3.hashCode())
}