package collection

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap


fun main(args: Array<String>) {
//    val marathon = mutableMapOf<Int, String>()
    val marathon = mutableMapOf(
        1 to "Ali Jaber",
        2 to "Mohammed Al-najjar",
        3 to "Any"
    )

    // Accessing elements
    println(marathon)
    println(marathon[1])
    println(marathon[2])
    marathon.remove(1)
    println(marathon)
    println(marathon.containsKey(1))
    println(marathon.containsValue("Ali Jaber"))

    // Iterating through elements
    marathon[1] = "Ali Jaber"
    for (entry in marathon) {
        println("${entry.key} ${entry.value}")
    }
    println(marathon.size)
    println(marathon.isEmpty())
    println(marathon.isNullOrEmpty())

    val immutableMap = mapOf(1 to 'A', 2 to 'B', 3 to 'C')
    //immutableMap[1] = 'a'
    println(immutableMap)

    /*
    HashMap makes absolutely no guarantees about the iteration order.
    It can (and will) even change completely when new elements are added
     */
    val hashMap = HashMap<Int,String>();
    hashMap[1] = "Java"
    hashMap[2] = "Kotlin"
    hashMap[3] = "C++"
    println(hashMap)

    /*
    TreeMap will iterate according to the "natural ordering" of the keys according
    to their compareTo() method (or an externally supplied Comparator).
    Additionally, it implements the SortedMap interface, which contains methods that depend on this sort order.
     */
    val treeMap = TreeMap<Char,Char>()
    treeMap['D'] = 'D'
    treeMap['C'] = 'C'
    treeMap['B'] = 'B'
    treeMap['A'] = 'A'
    println(treeMap)

    /*
    LinkedHashMap will iterate in the order in which the entries were put into the map
     */
    val linkedHashMap = LinkedHashMap<Char,Char>()
    treeMap['A'] = 'A'
    treeMap['B'] = 'B'
    treeMap['C'] = 'C'
    treeMap['D'] = 'D'
    println(linkedHashMap)


}