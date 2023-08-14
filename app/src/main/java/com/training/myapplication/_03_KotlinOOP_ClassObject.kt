package com.training.myapplication

fun main(){
    var c1 = Car() // สร้างตัวเรียกใช้ Class Car

    println(c1.color)
    println(c1.year)
    println(c1.model)
    c1.driving()
    c1.brake()

    c1.color = "green" //สามารถเปลี่ยนค่าใน class car ได้
    println(c1.color)

}