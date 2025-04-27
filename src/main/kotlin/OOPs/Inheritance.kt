package org.example.Inheritance


//*********   Kotlin supports only single inheritance  ******

fun main(){
        val objChild = Child()
        objChild.myMethod()
        objChild.myMethod2()
}


//***** we need to specify to the compiler that this class is to be inherited  ***
open class Parent{
    val name : String = ""

    init{
        println("Parent's constructor is called")
    }

    fun myMethod(){
        println("I am in Parent Class")
    }
}

class Child : Parent(){

    val name2 : String = ""

    init{
        println("Child's constructor is called")
    }
    fun myMethod2(){
        println("I am in Child Clas")
    }
}