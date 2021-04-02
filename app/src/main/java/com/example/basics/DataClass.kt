package com.example.basics

data class User(val id: Long, val employee: String, val supervisor: String? = null)
//data class cannot be sealed, open, inner or abstract

fun main() {
    val user1 = User(1, "Mateusz")

    val userName = user1.employee
    println(userName).also {
        if (user1.supervisor == "<no supervisor>") {
            println("Supervisor is ${user1.supervisor}.")
        } else {
            println("Employee has no supervisor.")
        }
    }

    val user2 = user1.copy(id = 2, "Zbigniew", "Janusz Tracz")
    println("Employee details: ${user2.employee}, supervisor: ${user2.supervisor}")

    println(user2.component1())     //Printing argument for that object = 2
    println(user2.component2())     //Print Zbigniew
    println(user2.component3())     //Print Janusz Tracz

    //Deconstruction
    val (id, name) = user2
    /*Equals to:
    val id = user2.id
    val name = user2.employee
    */
}
