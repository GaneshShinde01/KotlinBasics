package org.example

fun main(){

    //*********    Variables in Kotlin     **************

    // Note:
    // 1. var is used to create the variable which can be resigned a value
    // 2. val is also used for creating the variables but no resignment of variable is allowed
    // 3. //if you want to check the type of variable press [ Ctrl + Shift + p ]

    var score = 5   //it automatically decides the data type as int
    var temperature = 41.2
    var isRaining = false
    var alphabet = 'A'
    var message = "Hello"
    score = 10;
    println(score)

    val score1 = 5
    val temperature1 = 41.2
    val isRaining1 = false
    val alphabet1 = 'A'
    val message1 = "Hello"
    //message1 = "Hellow, How are you??"   not possible
    println(message1)

    // explicitly assigning values
    var score2 : Int = 5
    var temperature2 : Double = 41.2
    var isRaining2 : Boolean = false
    var alphabet2 : Char = 'A'
    var message2 : String = "Hello"
    println(temperature2)

    val score3 : Int = 4
    println(score3)

}