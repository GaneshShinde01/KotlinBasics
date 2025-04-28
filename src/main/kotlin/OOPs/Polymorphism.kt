package org.example.OOPs


fun main(){

    //creating objects

    val circle = Circle(2.0)
    val square = Square(10.0)

    // explicitly
    val circle1 : Circle = Circle(2.0)
    val square1 : Square = Square(10.0)

    println(circle.area())
    println(circle1.area())

    println(square.area())
    println(square1.area())


    //we can make reference of Parent class
    // parent can call the method of child class which are common
    val circle2 : Shape = Circle(2.0)
    val square2 : Shape = Square(10.0)
    println(circle2.area())
    println(square2.area())


    val shapes = arrayOf(Circle(2.0), Square(10.0), Triangle(5.0,10.0))
    calculateAreas(shapes)
}
fun calculateAreas(shapes : Array<Shape>){
    println()
    for(shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area() : Double{
        return 0.0
    }
}

class Circle(val radius : Double) : Shape(){
    override fun area() : Double{
        return Math.PI * radius * radius
    }
}

class Square(val side : Double) : Shape(){
    override fun area() : Double{
        return side * side
    }
}

class Triangle(val base : Double, val height : Double) : Shape(){
    override fun area() : Double{
        return 0.5 * base * height
    }
    //
}