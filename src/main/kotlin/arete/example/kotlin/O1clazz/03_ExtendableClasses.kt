package arete.example.kotlin.O1clazz

class Animal

// Cannot extend a final class
// class Elephant : Animal

open class Tokenizer // To allow a class to be extended mark it "open"

class BooBar : Tokenizer() // Now we can extend Tokenizer

