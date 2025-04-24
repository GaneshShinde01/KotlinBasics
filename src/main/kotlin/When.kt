package org.example


fun main(){
    val animal = "Dog"

    /*if(animal == "Horse"){
        println("Animal is Horse")
    }
    else if(animal == "Dog"){
        println("Animal is Dog")
    }
    else if(animal == "Cat"){
        println("Animal is Cat")
    }
    else {
        println("Animal not found")
    }*/

    when(animal){
        "Horse" -> println("Animal is Horse")
        "Dog" -> println("Animal is Dog")
        "Cat" -> println("Animal is Cat")
        else -> println("Animal not found")
    }

    val result = when(animal){
        "Horse" -> "Animal is Horse"
        "Dog" -> "Animal is Dog"
        "Cat" -> "Animal is Cat"
        else -> "Animal not found"
    }
    println(result)

    var number = 13
    val result1 = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19  -> "Teen"
        else -> "Not in range"
    }
    println(result1)
}