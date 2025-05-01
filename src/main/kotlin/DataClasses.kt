package org.example

fun main(){

    val p1 = Person1(1,"Ganesh")
    val p2 = Person1(2,"Krushna")

    val p3 = p1.copy()
    val p4 = p1.copy(id=4)
    println(p3)
    println(p4)

    val (id,name) = p2
    println(id)
    println(name)
}

data class Person1(val id : Int, val name : String){

}