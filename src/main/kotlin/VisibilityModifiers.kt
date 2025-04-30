package org.example

fun main(){
    var b = B()
    b.test()
}

open class A{
    public var  p = 10
    private var q = 20
    internal var r = 30
    protected var s = 40
}

class B : A(){
    fun test(){
        println(p)
        //println(q)  can't accessible
        println(r)
        println(s)
    }

}