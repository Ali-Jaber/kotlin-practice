package nullability

fun main(args: Array<String>) {

    /*
    Safe Calls Operator ( ?. )
    Let's start with an example: there is a city object with plenty of nested objects.
     We want to access the name of a building from this city like this:

    if (city != null &&
        city.address != null &&
        city.address.street != null &&
        city.address.street.building != null
    ) {
         print(city.address.street.building.name)
    } else {
        print(null)
    }

    That's it! Just add a ? sign every time right after a nullable reference.
    ? will compare its value to null and return null if that reference is null.

    print(city?.address?.street?.building?.name)
     */

    /*
        Elvis Operator ( ?: )
     */
    var name: String? = "Kotlin"
    val length: Int? = name?.length
    print(if (length != null) length else 0)

    /*
    we can simplify the code with the Elvis operator:
    The Elvis operator works like this: if the left-hand side of the expression is not null (name?.length), return it;
    otherwise, the right-hand side (0) is to return. You can also use return and throw expressions in the right part:
     */
    var name2: String? = "Kotlin"
    val length2: Int? = name2?.length
    print(length2 ?: 0)

    val length3: Int = name?.length
            ?: throw Exception("The name is null")

    /*
    Not Null Assertion Operator ( !! )
    There is an easy way to invoke an NPE: the !! operator.
    The code won't crash only if you're a 100% sure that your variable won't be null.
    This operator is used to stop the program when null is met.
     */

    var name3: String? = "Kotlin"
    print(name3!!.length)

    var name4: String? = "Kotlin"
    val length4: Int = name4?.length
            ?: throw Exception("The name is null")
    print(length4)
}