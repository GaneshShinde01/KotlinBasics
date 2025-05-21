package org.example

fun main(){

    var lambda1 = {x : Int, y : Int -> x + y}
    var multiLineLambda = {
        println("Hello Lambda")
        val a : Int = 2 + 3
        "Hello"
        2
    }

    multiLineLambda()
    println(multiLineLambda())

    val singleLineLambda = {x :Int -> x * x}
    val lambda2 : (Int) -> Int = {x -> x*x}
}