package com.training.myapplication.no_Inheritance

class BusinessMan(var name: String , var age:Int ) {
    fun walk(){
        print("The businessman $name age $age is talking")
    }
    fun talk(){
        print("The businessman $name age $age is walking")
    }
    fun eat(){
        print("The businessman $name age $age is eating")
    }

}