package org.example

fun main(){

    val p1 = Person("A",21)

    p1.age = 23
    println(p1.age)

    p1.age = -20

}

class Person(nameParam : String, ageParam : Int){

    var age : Int = ageParam

        //default getter and setters
        get() = field
        set(value){
            if( value > 0){
                field = value
            }else{
                println("Age can't be negative")
            }
        }


}