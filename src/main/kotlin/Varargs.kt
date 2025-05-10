package org.example

fun main(){


    add(1,2,3,4,5,7)
    add(63,63,2,7)
    add(5,3)
    add(4)
    add(53,63,2,84,2745,35,7345)
}

private fun add(vararg values: Int){

    var sum = 0
    for(i in values){
        sum += i
    }
    println(sum)
}