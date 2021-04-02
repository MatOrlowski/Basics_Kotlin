package com.example.basics

fun main() {
    var myCar = Car()
    println(myCar.owner).also { println(myCar.myBrand) }
    var userInput = readLine()
    if (userInput != null) {
        myCar.maxSpeed = userInput.toInt()
    }
    println("MaxSpeed set to ${myCar.maxSpeed}.")
}

class Car() {
    lateinit var owner: String

    val myBrand: String = "BMW"
        get() {  //Created custom getter, whenever someone want to access myBrand, he will get 'bmw'
            return field.toLowerCase()
        }

    var maxSpeed = 250
        //get() = field     Redundant getter can be omitted
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("MaxSpeed cannot be less than 0!")
        }

    var myModel: String = "E46"
        private set //private setter can be changed only in init

    init {
        owner = "Franek"
    }
}