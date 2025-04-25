package org.example

fun main(){

    val mustang = Car("mustang","petrol",100)
    val beetle = Car("beetle","diesel",200)

    println(mustang.name)
    println(mustang.type)

    println(beetle.knRan)

    mustang.driveCar()
}
class Car(val name : String , val type : String , var knRan : Int)
{

    fun driveCar(){
        println("$name  car is driving")
    }
    fun applyBrakes(){
        println("Applied Brakes")
    }

}