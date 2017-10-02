package arete.example.kotlin.lazy

fun main(args: Array<String>) {
    val lazyInt : Int by lazy {
        println("This is never evaluated until needed.")
        10
    }

    println ("That int is still lazy!")
//    println(lazyInt)

}