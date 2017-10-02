package arete.example.kotlin.sequenz



fun main(args: Array<String>) {

    val range = 1 .. 1000000000
//    range
//            .filter { it > 30 }
//            .forEach { println(it) } // Slow....

//    range.asSequence() // Converts collection to a "lazy" collection
//            .filter { it > 30 }
//            .forEach { println(it) }

    println (range.asSequence()
            .filter { it > 30 }
            .take(30)
            .sum())

    // generateSequence allows creation of infinite sequence, takes a
    // initial value, and an operation you want to perform on it
    val sequence = generateSequence(1.0) { it -> it * 2.5 + 3 }
    println(sequence.take(30).sum())
}