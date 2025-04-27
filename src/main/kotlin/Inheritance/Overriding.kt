package org.example.Inheritance


fun main(){
    val onePlus = OnePlus()
    onePlus.display()
    val generalMobile = Mobile()
    generalMobile.display()
}

open class Mobile(){
    open val name : String = ""
    open val size : Int = 5
    fun makeCall() = println("Calling from Mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")  //we need to open it for override
}

class OnePlus : Mobile(){

    override fun display() = println("One plus display")
    override val name : String = "One Plus"
    override val size: Int = 6
}