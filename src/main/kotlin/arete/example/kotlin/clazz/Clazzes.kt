package arete.example.kotlin.clazz

class Token // public AND final by default

class Customer(val firstName: String, val lastName: String, val age: Int = 50) // Classes with arguments

class Customer1(name: String) {
    init {
        // Initialization code goes here
        println("Customer1 initialized with value ${name}")
    }
}

class Account(val account: String, val customer: Customer)

val account = Account("123", customer = Customer("Spider", "Man"))