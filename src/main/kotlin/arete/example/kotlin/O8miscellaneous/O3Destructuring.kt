package arete.example.kotlin.O8miscellaneous

data class IAmADataClass(val a: Int, val b: String, val c: Long)

fun main(args: Array<String>) {
    val (a, b, c) = IAmADataClass(1, "Awesomeness", 10)
    println("Value of a: $a, b: $b: c: $c")

    // Use underscore to ignore values not interested in
    val (_, _, c1) = IAmADataClass(1, "Awesomeness", 10)
    println("I only interested in c: $c1")
    val (_, b1, _) = IAmADataClass(1, "Awesomeness", 10)
    println("I only interested in b: $b1")

    // Destructuring a map
    val someMap = mapOf( 1 to 2, 3 to 4, 5 to 6)
    for ((key, value) in someMap) {
        println("$key -> $value")
    }

    // De-structure a map in a Lambda
    println(someMap.mapValues { (key, value) -> "$value!" })
    println(someMap.mapValues { (key, _) -> "Only keys: $key!" })
}