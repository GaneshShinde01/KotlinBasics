package org.example

enum class TrafficLight(val action : String){

    RED("Thamba"),
    YELLOW("Veg kami kara"),
    GREEN("Ja");

    fun getInstructions() : String{

        return "Traffic Light Says: $action"
    }
}

fun processTrafficLight(light : TrafficLight){

    when(light) {
        TrafficLight.RED -> println(light.getInstructions())
        TrafficLight.YELLOW -> println(light.getInstructions())
        TrafficLight.GREEN -> println(light.getInstructions())
    }
}
//hello
fun main() {

    val red = TrafficLight.RED
    val yellow = TrafficLight.YELLOW
    val green = TrafficLight.GREEN

    processTrafficLight(red)
    processTrafficLight(yellow)
    processTrafficLight(green)
}