package org.example

fun main(){
    val arr = arrayOf(1,2,3,4)

    try{
        println(arr[5])
    }
    catch (np : NullPointerException){
        println(np.toString())
    }
    catch (e : Exception){
        println(e.toString())
    }
    finally {
        println("executes every time")
    }
}
