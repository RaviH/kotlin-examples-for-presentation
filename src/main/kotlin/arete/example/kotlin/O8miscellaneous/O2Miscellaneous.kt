package arete.example.kotlin.O8miscellaneous

// Below is a singleton class
object Singleton

open class A {
    open val aProperty : Int = 10
}

class B: A() {
    override val aProperty : Int = 20
}

fun main(args: Array<String>) {
    println (B().aProperty)
}

//--------TODOs in Kotlin is awesome------------------------------

interface SomeInterface {
    fun pleaseImplementMe(someInt: Int)
}

class C : SomeInterface {
    override fun pleaseImplementMe(someInt: Int) {
        TODO("not implemented")
    }

}
