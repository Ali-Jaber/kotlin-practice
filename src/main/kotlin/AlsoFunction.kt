fun main(args: Array<String>) {
    val numbers = mutableListOf(1,2,3)

    val duplicateNumber = numbers
        .also {
            it.add(4)
            it.remove(2)
        }
    println(numbers)
    println(duplicateNumber)
}