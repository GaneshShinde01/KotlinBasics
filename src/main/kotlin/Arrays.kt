package org.example

fun main(){
    var arr = arrayOf("Ganesh", "Krushna", "Omkar", "Harshwardhan")
    var arr1 = arrayOf(1,2,3,4)

    var arr2 = arrayOf<String>("One","Two","Three","Four")

    for(i in arr){
        println(i)
    }

    for((i,e) in arr.withIndex()){
        println("$i - $e")   //i for index and e for element
    }

    println()
    println(arr1[0])
    println(arr1.get(2))
    println()

    arr.set(0,"Mahesh")
    println(arr[0])

    println()
    println(arr.size)
    for(i in arr){
        println(i)
    }

}
