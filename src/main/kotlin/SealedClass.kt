package org.example

import kotlin.random.Random

sealed class Result {

    data class Success(val data : String) : Result()
    data class Error(val message : String) : Result()
    object Loading : Result()
}

fun processResult(result : Result){

    when(result) {
        is Result.Error -> println("Error ${result.message}")
        Result.Loading -> println("Loading data")
        is Result.Success -> println("data ${result.data}")
    }
}

fun main() {

    val success = Result.Success("User Profile Fetched")
    val error = Result.Error("Network Failed")
    val loading = Result.Loading

    processResult(success)
    processResult(error)
    processResult(loading)
}