package arete.example.kotlin.O4extension

fun <T> List<T>.println() {
    println("---------")
    forEach { println(it) }
    println("---------")
}

// print is also available on null list
fun <T> List<T>?.print() {
    if (this == null) {
        print("null")
    } else{
        print(joinToString())
    }
}

fun main(args: Array<String>) {
    val aList = (1..5).toList()

    aList.println()

    aList.print()
}