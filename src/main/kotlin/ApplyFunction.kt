package org.example

fun main(){

    val emp = Employee()
    emp.name = "Ganesh"
    emp.age = 21

    emp.apply {
        name = "Krushna"
        age = 19
    }

    println(emp)

}
data class Employee(var name : String= "", var age : Int = 18)