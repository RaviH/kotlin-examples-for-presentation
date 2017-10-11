package arete.example.kotlin.O9higherorderfunctions

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}

fun doSomethingLockWorthy(): String {
    println("Doing something lock worthy")
    return "Done with the lock"
}

fun main(args: Array<String>) {
    lock(ReentrantLock(), {
        println("COLIN")
        val result = doSomethingLockWorthy()
        println(result)
    })
}