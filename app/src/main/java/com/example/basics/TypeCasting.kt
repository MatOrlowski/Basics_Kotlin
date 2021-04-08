package com.example.basics

fun main() {
    val stringList: List<String> = listOf("Mateusz", "Marcin", "Agnieszka", "Wiktoria")

    val mixedList: List<Any> = listOf("Sara", 2007, "Tosia", 2015.0, false)

    for (value in mixedList) {
        if (value is Int) println("Int: $value")
        else if (value is String) println("String: $value")
        else if (value is Double) println("Double: $value")
        else if (value is Boolean) println("Boolean: $value")
        else println("Unknown type")
    }

    //SmartCast
    val object1: Any = "Not enough to live, too much to die."
    if (object1 !is String) println("Not a String")
    else {
        println("It is a String of length ${object1.length}")
    }

    //Unsafe casting using as
    val string1: String = object1 as String
    val object2: Any = 12345
    //val string2: String = object2 as String
    println(string1)
    //println(string2)

    //Safe casting using as
    val string3: String? = object2 as? String
    println(string3)
}