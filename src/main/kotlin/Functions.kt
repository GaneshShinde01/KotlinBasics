package org.example

import kotlin.math.pow


fun main(){

    val result = add(5,2)
    println(result)

    val result1 = add1(5,2)
    println(result1)

    val result2 = evenOdd(14)

    //calling function with default argument
    printMessage()

    //***** storing function into the varible **

    var fn = ::power
    println(fn(2.0,3.0))

}

fun add(num1 : Int , num2 : Int): Int
{
    val sum = num1 + num2
    return sum
}

// above function can be written as inline function
fun add1(num1 : Int, num2 : Int) = num1 + num2

fun evenOdd(num : Int)   //default data type of the function is ---Unit---
{
    val result = if(num % 2 == 0) "Even" else "Odd"
    println(result)
}

//default argument
private fun printMessage(count : Int = 2){

   // count = 4
    //**** variables in function parenthesis are of val type ... can't be reassigned

    for(i in 1..count){
        println("Hello $i")
    }
}

fun power(a:Double, b:Double) : Double
{
    return a.pow(b)
}

