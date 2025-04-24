package org.example

fun main(){
    val number = 5

    val result = number in 1..5  //1, 2, 3, 4, 5  //upper bound included
    println(result)

    val result1 = number in 1 until 5  //1, 2, 3, 4  //upper bound is not included
    println(result1)
}