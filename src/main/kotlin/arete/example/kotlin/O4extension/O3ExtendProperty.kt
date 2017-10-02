package arete.example.kotlin.O4extension

data class Points(val a: Int, val b: Int)

val Points.c: Int
    get() = a + b

fun main(args: Array<String>) {
    val a = Points(1, 2)
    println ("Found c, loading it: ${a.c}")
}