package org.example

fun main(){

    val day = Day.SUNDAY
    println(day)


    val day1 = Day1.FRIDAY
    println(day1)
    println(day1.number)

    for (i in Day.values()){
        println(i)
    }

    day1.printFormattedDay()

}
enum class Day{

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY

}

enum class Day1(val number : Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);  //we need semicolon here

    fun printFormattedDay(){
        println("Day is $this")
    }

}