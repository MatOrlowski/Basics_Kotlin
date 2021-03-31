package com.example.basics

class Initializers(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First property initialized w/ name: $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second property initialized w/ name length: ${name.length}")
    }
}

fun main(){
    Initializers("Mateusz")
}
