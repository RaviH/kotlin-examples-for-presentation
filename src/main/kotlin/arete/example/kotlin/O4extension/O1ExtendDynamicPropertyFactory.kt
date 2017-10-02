package arete.example.kotlin.O4extension

import com.netflix.config.DynamicPropertyFactory

fun <T> String.getConfig(default: T): T {
    val dynamicPropertyFactory = DynamicPropertyFactory.getInstance()
    when (default) {
        is String  -> dynamicPropertyFactory.getStringProperty(this, default).get()
        is Int     -> dynamicPropertyFactory.getIntProperty(this, default).get()
        is Float   -> dynamicPropertyFactory.getFloatProperty(this, default).get()
        is Double  -> dynamicPropertyFactory.getDoubleProperty(this, default).get()
        is Boolean -> dynamicPropertyFactory.getBooleanProperty(this, default).get()
        is Long    -> dynamicPropertyFactory.getLongProperty(this, default).get()
        else       -> throw IllegalAccessException("Please provide one of String, Int, Float, Long types only!!!")
    }

    return default
}

fun main(args: Array<String>) {
    println("Some String Config".getConfig("ABC"))
    print("SomeIntConfig".getConfig(9))
}