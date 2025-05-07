package org.example

fun main(){

    val iContainer = Container<Int>(5)
    iContainer.getValue()

    val sContainer = Container<String>("Hello")
    sContainer.getValue()
}

class Container<T>(var data : T){
    fun setValue(value: T){
        data = value
    }

    fun getValue() : T{
        return data
    }
}