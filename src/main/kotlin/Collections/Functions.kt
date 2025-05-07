package org.example.Collections

fun main(){
    val nums = listOf(1,2,3,4,5)
    println(isOdd(2))
    println(isOdd(3))

    val list = nums.filter(::isOdd)
    println(list)
}
fun isOdd(a:Int) : Boolean {
    return a %2 != 0
}