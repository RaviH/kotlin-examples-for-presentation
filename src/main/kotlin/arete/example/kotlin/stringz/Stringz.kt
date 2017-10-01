package arete.example.kotlin.stringz

val a = 1
val b = 2
val c = """
    Multiline String
    """
fun main(args: Array<String>) {
    println("String interpolation at play here: $a $b")
    println("""String interpolation at play here: $a $b""")
    println(c)
    println("For regex \n")
    println("""For regex \n""")
}