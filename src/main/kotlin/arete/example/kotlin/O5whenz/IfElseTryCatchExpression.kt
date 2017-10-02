package arete.example.kotlin.O5whenz

fun someDemo(list: List<Int>) {
    val isEmpty =
            if (list == null || list.size == 0) {
                true
            } else {
                false
            }

    println("List is empty? $isEmpty")

    val someIntValue =
            try {
                println("Do some heavy evaluation")
                1
            } catch (e: Exception) {
                0
            }
    println("Some int value: $someIntValue")
}

fun main(args: Array<String>) {
    someDemo((1..10).toList())
}