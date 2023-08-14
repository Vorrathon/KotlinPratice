package com.training.myapplication

fun main(){
   val result =  addTwoNum(3,5)
    println("ผลลัพธ์คือ " + result)
    val myProfile = mixReturn("Vorrathon",26)
    println(myProfile)
}
fun addTwoNum(x:Int,y:Int):Int{
    return x+y
}

fun mixReturn(fname:String,age:Int):String{
    return "ชื่อของฉันคือ $fname อายุ $age"
}