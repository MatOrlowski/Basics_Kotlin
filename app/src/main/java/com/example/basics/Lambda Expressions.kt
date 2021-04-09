package com.example.basics

//Classic function
fun add(a: Int, b: Int): Int {
    val add = a + b
    return add
}

// Lambda Expression (Long)
val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

//Lambda Expression (Short)
val result = { a: Int, b: Int -> println(a + b) }

fun main() {
    result(18, 2)
}