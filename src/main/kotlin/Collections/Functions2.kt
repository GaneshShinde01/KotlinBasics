package org.example.Collections

fun main(){

    val userList = listOf(User(1,"Ganesh"),
        User(2,"Krushna"),
        User(3,"Faiyaj"),
        User(4,"Omkar"))

    println(userList.filter { it.id == 2 })

}

data class User(val id : Int, val name : String)