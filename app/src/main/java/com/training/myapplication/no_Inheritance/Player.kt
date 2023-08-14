package com.training.myapplication.no_Inheritance

class Player(var name:String ,var age:Int) {
    fun walk(){
        print("The player  $name age $age is talking")
    }
    fun talk(){
        print("The player $name age $age is walking")
    }
    fun eat(){
        print("The player $name age $age is eating")
    }
}