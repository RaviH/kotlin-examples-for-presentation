package arete.example.kotlin.`02arguments`

fun simple(firstName: String = "John", lastName: String, age: Int = 49) {
    println("$firstName $lastName age is $age")
}

fun main(args: Array<String>) {
    simple(lastName = "Pitt", firstName = "Brad") // Named argument allows us to send data in any order we like

    simple("Brad", "Pitt") // Overrides default argument

//    simple("Pitt") // Won't work because it doesn't know what that argument is for.

    simple(lastName = "Pitt") // Uses default argument

    simple(lastName = "Pitt", age = 88) // Uses default argument
}