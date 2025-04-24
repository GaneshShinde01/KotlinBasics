package org.example

fun main() {

    // Variables in Kotlin

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

    // Operators in Kotlin

    // 1 . Arithmetic Operators
    println()
    println(score + score1)  // 10 + 5 = 15
    println(score - score3)  // 10 - 4 = 6
    println(temperature * temperature2)  // 41.2 x 41.2 = 1,697.44
    println(score / score1)  // 10 / 5 = 2
    println(score % score3) // 10 % 4 = 2

    var a = 13
    var b = 2
    println(a / b) // Actual output is 6.5 but it gives 6.
    println(a.toFloat() / b) //now gives output in float


    // 2 . Relational Operators
    println()
    println(a > b) // true
    println(a < b)  // false
    println(a >= b)  //true
    println(a <= b)  //false
    println(a == b) //false
    println(a != b)  //true

    // 3. Increment and Decrement Operators
    println()
    println(a++)  //post increment   print 13 but next time it is 14
    println(++a)  //pre increment    it is 14 and now increment by 1 and becomes 15
    println(a--)  //post decrement    print 15 but next time it is 14
    println(--a)  //pre decrement    it is 14 and now decrement by 1 and becomes 13

    // 4. Logical Operators
    println()
    var c = true
    var d = false
    println(c && d)  // false
    println(c || d)  // true
    println(!d)  //true
    println(!!d) //false

    // ******       Short Circuiting   ********
    println()
    var i = 10
    var j = 11
    var result = i == 10 || j++ == 11
    println(result)
    println(i)
    println(j)   // the value of j must be 12 bz there is post increment used but this is not done bz of the Short Circuiting
    // in above statement the first condition is true then it does not check for second condition and displays the result
    var result1 = j++ == 11 || i ==10
    println(result1)
    println(i)
    println(j)

}