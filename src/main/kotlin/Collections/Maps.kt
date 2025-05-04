package org.example.Collections

fun main(){

    val students = mutableMapOf<Int,String>()
    students.put(1,"Ganesh")
    students.put(2,"Krushna")
    println(students)

    for((key,value) in students){
        println("$key = $value")
    }

    students[3] = "Mahesh"
    println(students[3])
    println()


    //immutable map
    val map = mapOf<Int,String>(1 to "Ganesh", 2 to "Krushna")
    println(map)
}