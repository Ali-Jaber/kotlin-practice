fun <T> search(list: ArrayList<T>, s: T) {
    if (s in list) {
        println("Yes found")
    } else {
        println("Not found")
    }
}

fun main(args: Array<String>) {
    val intList = ArrayList<Int>()

    intList.add(1)
    intList.add(2)
    intList.add(3)
    intList.add(4)

    search(intList, 2)

    val stringList = ArrayList<String>()
    stringList.add("A")
    stringList.add("B")
    stringList.add("C")
    stringList.add("D")

    search(stringList, "D")
}