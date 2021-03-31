package com.example.basics

//Recursion (function calling itself)
//fun main(){
//    val number = 5
//    val result: Int
//    result=factorial(number)
//    println("Factorial of $number is $result.")
//}
//
//fun factorial(n: Int): Int{
//    if (n == 1){
//        return n
//    }else{
//        return n * factorial(n-1)
//    }
//}

fun main() {
    println("Please enter your string: ")
    var userString = readLine()
    println("Please enter your index: ")
    var userInput = readLine()
    var charAtIndex = userInput?.let { userString?.get(it.toInt()) }
    println("Char at given index is $charAtIndex.")
}

var cloneMyPublicClass = MyPublicClass()