package arete.example.kotlin.O1clazz

// Kotlin provides toString, equals and hashCode for a data class.
data class Movie(val name: String, val year: Int) {
    override fun toString(): String {
        return "Movie $name was released in $year"
    }
}

fun main(args: Array<String>) {
    val movie = Movie("Rocky", 1980)

    // data class provides us:
    //  getters and setters,
    //  hashCode,
    //  equals
    //  copy

    println("${movie.name} ==> ${movie.year}")
    println(movie.toString())
    println(movie.equals(Movie("River", 1980)))
    println (movie.hashCode())
    val movie2 = movie.copy(year = 1999)
    println (movie2)
    println(movie == movie2)
}