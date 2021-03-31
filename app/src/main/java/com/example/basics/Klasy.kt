package com.example.basics

class MyPublicClass () {
    var name: String = "myName"
}

private class MyPrivateClass(){
    var name: String = "name"
}

//var inst_MyPrivateClass = MyPrivateClass()

open class MyClassWithProtectedVar(){
    protected var licenseNumber = "1789564"
}

class SecretData(): MyClassWithProtectedVar(){
    var numberOfLicense = licenseNumber
}

open class Base(){
    var a = 5 //pubic by default
    private var b = 10 //private to Base class
    protected open val c = 15 //visible to Base and Derived class
    internal val d = 20 //visible inside the same module
    protected fun e(){} //visible to Base and Derived class
}

class Derived(): Base(){
    //a,c,d and e() are visible
    //b is not visible
    override val c = 9 //c is protected
}
fun xyz(args: Array<String>) {
    val base = Base()
    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible
    val derived = Derived()
    // derived.c is not visible
}

fun main(){
    var accessToData = MyClassWithProtectedVar()
    //accessToData.licenseNumber
}