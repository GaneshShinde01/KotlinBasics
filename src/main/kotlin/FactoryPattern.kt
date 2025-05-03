package org.example

fun main(){

    var pizza1 = Pizza.Factory.create("Peppy Paneer")
    println(pizza1)

    //here I am calling via factory reference - don't want to use factory ref
    //now after defining it as companion
    var pizza2 = Pizza.create("Tomato")
    println(pizza2)

    // one more thing we can do -- we want everyone to call this create method if they want pizza
    // fot that we will mark the constructor as private
   // var pizza3 = Pizza()   // now everyone needs to call create method


}

// Example of factory pattern using companion
class Pizza private constructor(val type: String, val toppings : String){
    companion object Factory{  //this my factory object
        fun create(pizzaType : String) : Pizza{
            return when(pizzaType){
                "Tomato" -> Pizza("Tomato","Tomato, cheese")
                "Peppy Paneer" -> Pizza("Paneer Farm","Paneer, Cheese Burst, Tomato, Onion")
                else -> Pizza("Basic","Onion, Cheese")
            }
        }

    }
}