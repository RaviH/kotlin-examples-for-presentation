package arete.example.kotlin.O7lambdas

import arete.example.kotlin.O1clazz.Movie

// Demo lambdas and functions directly available to List

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

fun allEven(collection: Collection<Int>): Boolean = collection.all { it % 2 == 0 }

fun filterStuff(collection: Collection<Int>) = collection.filter { it % 2 == 0 }

fun chainedFunctionality(collection: Collection<Movie>) =
        collection
                .filter { it.year > 2015 }
                .map { it.copy(name = it.name.toUpperCase()) }


fun main(args: Array<String>) {
    val allEventList = (0..20 step 2).toList()
    println(containsEven(listOf(1, 2, 3, 4, 5)))
    println(allEven(listOf(1, 2, 3, 4)))
    println(allEven(allEventList))
    println(filterStuff((1..20).toList()))
    println(chainedFunctionality(listOf(
            Movie("a", 2013),
            Movie("b", 2014),
            Movie("c", 2015),
            Movie("d", 2016)
    )))
}
