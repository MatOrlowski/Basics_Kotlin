package com.example.basics

fun main() {
    val iPhone = MobilePhone("iOS 14", "Apple", "iPhone 12 Pro", "Mark", 2020)
    val xiaomi = MobilePhone("Android 11", "Xiaomi", "Mi 11", "Julian", 2019)
    xiaomi.YoP = 2020
}

class MobilePhone(osName: String, brand: String, model: String) {
    var userName: String? = null

    var YoP: Int? = null

    init {
        println("Initialized mobile phone working on $osName of brand: $brand and model: $model.")
    }

    //Member secondary constructor
    constructor(osName: String, brand: String, model: String, userName: String, YoP: Int) : this(osName, brand, model) {
        this.userName = userName
        this.YoP = YoP
        println("Initialized mobile phone working on $osName of brand: $brand and model: $model. Owner is $userName. Year of production $YoP.")
    }


}
