package org.example

fun main(){
    var testObj = object{
        val x : Int = 10
        fun method(){
            println("I am object expression")
        }
    }
    println(testObj.method())

}