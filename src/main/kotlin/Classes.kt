package org.example

fun main(){

    val mustang = Car("mustang","petrol",100)   //this shows the creating and calling the objects
    val beetle = Car("beetle","diesel",200)

    println(mustang.name)  //calling the property by reference named mustang
    println(mustang.type)

    println(beetle.knRan)

    mustang.driveCar()

    beetle.applyBrakes()  //calling the method
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