package com.training.myapplication
fun main(){
    myFirstFunction()
    passParameter("ggg")
    addPara(5,6)
    mutiPly(1.00,2.44)
    mixPara("นอกจากชื่อฉัน ", 5)
}


fun myFirstFunction(){
    println("Hello Function")
}

fun passParameter(fname :String){
    println("hello " + fname )
}
fun addPara(num1:Int,num2:Int){
    println("จำนวนที่ 1 + จำนวนที่ 2 คือ " + (num1+num2) )
}
fun mutiPly(a:Double,b:Double){
    println("จำนวนแรกคือ $a จำนวนที่สองคือ $b ผลลัพธ์คือ " + (a*b))
}

fun mixPara(myName:String,number:Int){
   println(myName+number)
}
