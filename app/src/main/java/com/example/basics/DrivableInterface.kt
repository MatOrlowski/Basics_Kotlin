package com.example.basics

interface Drivable {
    val maxSpeed: Int
    fun drive(): String
    fun brake() {
        println("The drivable is braking.")
    }
}