package arete.example.kotlin.`02arguments`

class DefaultArguments {

    fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String =
            (if (toUpperCase) name.toUpperCase() else name) + number
}

fun main(args: Array<String>) {
    println(DefaultArguments().foo("Peter")) // defaults to age of 42
    println(DefaultArguments().foo("Peter", 55)) // changes the default age of Peter to 55
    println(DefaultArguments().foo("Peter", 55, true)) // Overrides toUpperCase default
}