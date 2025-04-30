package org.example

fun main(){
    myClass.myObject.f()
    myClass.g()    //method called without the object. but the method is not static
}

class myClass{

    object myObject{
        fun f(){
            println("Hello I am F from Object")
        }
    }

    companion object anotherObject{    ///only one companion object is allowed per class
        @JvmStatic    //this annotation is used to make the function like static for accession in java class
        fun g(){
            println("Hello I am G from Object")
        }
    }
}

