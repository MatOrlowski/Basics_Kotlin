package com.example.basics

abstract class Mammal(private val name: String, private val origin: String, private val weight: Int) {

    //Abstract members have to be implemented
    abstract var maxSpeed: Double
    abstract fun run()
    abstract fun breathe()

    //Non-abstract members MAY be implemented
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, " + "Max speed: $maxSpeed.")
    }
}

class Human(name: String, origin: String, weight: Int, override var maxSpeed: Double) : Mammal(name, origin, weight) {
    override fun run() {
        println("Human runs on two legs.")
    }

    override fun breathe() {
        println("Human has very efficient lungs. He breaths through nose and mouth.")
    }
}

class Dog(name: String, origin: String, weight: Int, override var maxSpeed: Double) : Mammal(name, origin, weight) {
    override fun run() {
        println("Dog runs on four legs.")
    }

    override fun breathe() {
        println("Dog breaths only through nose.")
    }
}

fun main() {
    val human = Human("Mateusz", "Poland", 80, 28.0)
    val dog = Dog("Sara", "Poland", 28, 40.0)

    human.run()
    dog.run()
    human.breathe()
    dog.breathe()
    human.displayDetails()
    dog.displayDetails()
}