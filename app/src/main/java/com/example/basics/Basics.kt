package com.example.basics

fun main(args: Array<String>){
//    val num1 = 10
//    val num2 = 20
//    val num3 = 30
//
//    val result = if(num1>num2){
//        val max = if(num1>num3){
//            num1
//        }else{
//            num3
//        }
//        "body of if $max"
//    }else if (num2>num3){
//        "body of else if $num2"
//    }else{
//        "body of else if $num3"
//    }
//    println(result)

    //When in range
    var num = 10
    when(num){
        in 1..5 -> println("Number is in range 1 to 5")
        in 6..10 -> println("Number is in range 6 to 10")
    }
    //Iterate through array
    val marks = arrayOf(10,20,30,40,50,60)
    for(item in marks){
        println(item)
    }
    //Iterate through array indices
    for (item in marks.indices){
        println("marks[$item] " + marks[item])
    }
    //Iterate through range
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)
    println()
    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing
    println()
    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()
    print("for (i in 5 downTo 2) print(i) = ")
    for (i in 5 downTo 2) print(i)
    println()
    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()
    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
}