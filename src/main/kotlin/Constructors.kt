package org.example


//********** Types of Constructors**********
//1. Primary Constructors
//2. Secondary Constructors
//3. Default Constructors

//this is primary constructor
class Student(var id:Int,var name:String){


    fun showStudent(){
        println("Student name is $name with id $id")
    }
}

//this is secondary constructor
private class Cars(){

    var model : String = ""
    var color : String = ""

    constructor(model : String) : this() {
         this.model = model
         this.color = "no color"
         println("single argument constructor")

    }
    constructor(model : String, color :String) : this() {
         this.model = model
         this.color = color
         println("multiple argument constructor")
    }

    fun horn(){
        println("$color $model horn : beep beep")
    }
}

class DefaultCons{
    fun show(){
        println("Default Constructor called")
    }
}


fun main(){

    var student = Student(101,"Ganesh")
    student.showStudent()

    //objects of secondary constructors
    var car1 = Cars("Hyudai creta")
    car1.horn()

    var car2 = Cars("Maruti Suzuki","Black")
    car2.horn()

    // default constructor
    var defaultCons = DefaultCons()
    defaultCons.show()
}

