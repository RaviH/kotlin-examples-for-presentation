package arete.example.kotlin.`01clazz`

class Token // public AND final by default

// Classes with properties and default arguments
class Customer(val firstName: String, val lastName: String, val age: Int = 50)

// How to create an instance of a class
val customer  = Customer("Robin", "Smith", 45)

//class Customer1(name: String) {
//    init {
//        // Initialization code goes here
//        println("Customer1 initialized with value ${name}")
//    }
//}
