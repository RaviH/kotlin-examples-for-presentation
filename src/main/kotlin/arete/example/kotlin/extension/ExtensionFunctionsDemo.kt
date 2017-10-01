package arete.example.kotlin.extension

fun <T> List<T>.println() {
    println("---------")
    forEach { println(it) }
    println("---------")
}

fun <T> List<T>.print() {
    forEach { print(it) }
}

fun main(args: Array<String>) {
    val aList = (1..5).toList()

    aList.println()

    aList.print()
}