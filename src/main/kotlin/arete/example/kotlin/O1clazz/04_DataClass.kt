package arete.example.kotlin.O1clazz

// Kotlin provides toString, equals and hashCode for a data class.
data class Movie(val name: String, val year: Int) {
    override fun toString(): String {
        return "$name was released in $year"
    }
}