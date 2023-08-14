package com.training.myapplication

fun main() {

    var car1 = CarConstructor("Toyota", 2000, "blue")
    var car2 = CarConstructor("Honda", 2004, "red")
    val text = car1.brand

    println(car1.year.toString() +" "+car2.brand + car2.color)
    println("$text")



}