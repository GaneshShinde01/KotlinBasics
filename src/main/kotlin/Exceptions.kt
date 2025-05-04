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


    createUserList(5)
    createUserList(-2)
}

//another way for exception handling

fun createUserList(count : Int){
    if(count < 0){
        throw IllegalArgumentException("Count must be greater than 0")
    }else{
        println("User list created successfully")
    }
}
