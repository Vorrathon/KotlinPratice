package com.training.myapplication.no_Inheritance

class Teacher (var name: String , var age:Int ){

    fun walk(){
        print("The teacher $name age $age is talking")
    }
    fun talk(){
        print("The teacher $name age $age is walking")
    }
    fun eat(){
        print("The teacher $name age $age is eating")
    }
}