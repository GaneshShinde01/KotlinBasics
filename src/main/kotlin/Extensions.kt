package org.example

fun main(){

    println("Hello Ganesh".formattedString())
}
fun String.formattedString(): String{
    return "--------------\n$this\n--------------"
}