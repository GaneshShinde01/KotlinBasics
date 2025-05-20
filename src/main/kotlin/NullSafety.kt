package org.example

import java.util.Locale
import java.util.Locale.getDefault

fun main(){

    var gender : String ? = null    //the ? mark is used to define the null type

    gender?.let {    // safe call operator
        println("Line 1")
        println("Line 2 $gender")
        println("Line 3")
    }

    var seletedValue = gender ?: "NA"
}