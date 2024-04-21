package com.testehan.kotlinexperiments.basics

fun main() {
    greet("Dan")
    greet()

    executeFunction(someFunction = {
        println("Executing the random function")
    })

    println(doubleNumber(4))
}


// Unit corresponds to void in java; it is default so not needed to be declared
fun greet(name: String = "default") : Unit {
    println("hello $name")
}

fun executeFunction(someFunction : () -> Unit){
    println("We will shortly execute some random function that we got as param")
    someFunction()
}

fun doubleNumber(n: Int): Int{
    return n*2
}
// function above can be simplified to
fun simpleDoubleNumber(n: Int): Int = n*2
