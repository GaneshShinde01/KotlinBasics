package org.example

fun main(){

    val fn:(a : Double, b : Double) -> Double = :: sum    // storing the function into the variable
    println(fn(4.2,2.5))

    calculator(21.2,52.9, ::sum)
}

fun sum(a : Double, b : Double) : Double{
    return a + b
}


// Higher Order functions -- functions that accepts functions as argument or return functions or both
fun calculator(a:Double, b:Double, gn: (Double,Double) -> Double){
    val result = gn(a,b)
    println(result)
}