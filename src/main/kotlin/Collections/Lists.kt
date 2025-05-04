package org.example.Collections

fun main(){

    val num1 = listOf(1,2,3,4)
    println(num1.indexOf(2))
    println(num1.contains(5))
    println()

    val num2 = mutableListOf(1,2,3,4)
    println(num2.indexOf(5))
    num2[2] = 10
    println(num2[2])
    num2.add(9)
    num2.remove(4)
    println(num2)

    val num3 = mutableListOf(11,12)
    num3.addAll(num2)
    println(num3)
}
