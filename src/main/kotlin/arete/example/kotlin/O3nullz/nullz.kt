package arete.example.kotlin.O3nullz

class Actor(val fistName: String, val lastName: String)

class ActorWithNulls(val name: String, var secondHomeAddress: String? = null)

fun main(args: Array<String>) {
    val str:String? = null
//    str.length //This will show error as ?. is not used may result in
    str?.length

//    --------------------------------------------------
//     Cannot assign a null value to non-nullable field
//    val actor = Actor("Rob", null)
//    --------------------------------------------------

//    --------------------------------------------------
    val actor = Actor("Rob", "Smith")
    // No problem printing a value it knows cannot be null
    println (actor.fistName + actor.lastName)
//    --------------------------------------------------

//    --------------------------------------------------
    val actorWithNulls = ActorWithNulls("Will Smith")
//    val allActorStr = actorWithNulls.name + actorWithNulls.secondHomeAddress
    println (actorWithNulls.name + actorWithNulls?.secondHomeAddress)
//    --------------------------------------------------
}