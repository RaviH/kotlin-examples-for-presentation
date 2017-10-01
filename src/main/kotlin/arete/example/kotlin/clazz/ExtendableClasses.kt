package arete.example.kotlin.clazz

// class Bar : Token        // Cannot extend a final class

open class Tokenizer // To allow a class to be extended mark it "open"

class BooBar : Tokenizer() // Now we can extend Tokenizer

