package com.example.basics

open class Bird(){
    open var name: String = "Bird"
    open fun walk (){
        println("$name walks.")
    }
}

class Parrot(): Bird() {
    override var name = "Parrot"
    fun fly(){
        println("$name flies.")
    }
    override fun walk(){
        println("$name usually doesn't walk.")
    }
}

class Duck(): Bird(){
    override var name = "Duck"
    fun swim() {
        println("$name can swim.")
    }
    override fun walk(){
        println("$name walks but very slowly.")
    }
}

fun main(){
    val d = Duck()
    d.swim()
    d.walk()
    val p = Parrot()
    p.fly()
    p.walk()
}