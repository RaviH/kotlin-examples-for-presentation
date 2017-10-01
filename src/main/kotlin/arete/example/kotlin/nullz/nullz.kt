package arete.example.kotlin.nullz

class Actor(val fistName: String, val lastName: String)

class ActorWithNulls(val fistName: String, val lastName: String, var secondHomeAddress: String? = null)

fun main(args: Array<String>) {
    val str:String? = null
//    str.length //This will show error as ?. is not used may result in
    str?.length

//    val actor = Actor("Rob", null) Cannot assign a null value to non-nullable field
    val actor = Actor("Rob", "Smith")
    val actorWithNulls = ActorWithNulls("Rob", "Smith")
    println (actor.fistName + actor.lastName)
    println (actor.fistName + actor.lastName)
//    val allActorStr = actorWithNulls.fistName + actorWithNulls.lastName + actorWithNulls.secondHomeAddress
    println (actorWithNulls.fistName + actorWithNulls.lastName + actorWithNulls?.secondHomeAddress)
}