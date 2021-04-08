package com.example.basics

open class Vehicle(override val maxSpeed: Int, val name: String, val brand: String) : Drivable {
    open var range: Double = 0.0
    fun extendedRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    //Own method belonging to Vehicle class
    open fun drive(distance: Double) {
        println("Drove for $distance km.")
    }

    //Overriding the interface
    override fun drive(): String {
        return "driving the interface drive"
    }
}

class ElectricCar(maxSpeed: Int, name: String, brand: String, batteryLife: Double) : Vehicle(maxSpeed, name, brand) {
    override var range = batteryLife * 5

    //Overriding Vehicle fun
    override fun drive(distance: Double) {
        println("Drove $distance on electricity.")
    }

    //Overriding Interface fun
    override fun drive(): String {
        return "Drove for $range on electricity."
    }

    override fun brake() {
        super.brake()
        println("Brake of interface inside electric car.")
    }
}

fun main() {
    val tesla = ElectricCar(250, "S-Model", "Tesla", 450.0)
    tesla.brake()
    tesla.drive(200.0)
    tesla.drive()
}