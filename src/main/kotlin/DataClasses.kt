package org.example

fun main(){

    val p1 = Person1(1,"Ganesh")
    val p2 = Person1(2,"Ganesh")

    val p3 = p1.copy()
    val p4 = p1.copy(id=4)
    println(p3)
    println(p4)
}

data class Person1(val id : Int, val name : String){

}