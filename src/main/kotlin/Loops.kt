package org.example

fun main(){

    for(i in 1..5){  //default increment by 1
        println(i)
    }

    println()

    for(i in 1..5 step 2){
        println(i)
    }

    println()
    for(i in 1 until 5){
        println(i)
    }

    println()
    for(i in 10 downTo 1){
        println(i)
    }
    println()
    for(i in 10 downTo 1 step 2){
        println(i)
    }


    // printing table
    println()
    val number = 2
    for(i in 1..10){
        //println(number * i)
        //println(number.toString() + " x " + i + " = " + (number * i))

        //String templating
        println("$number x $i = ${number * i}")
    }

}