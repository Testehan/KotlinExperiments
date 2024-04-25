package com.testehan.kotlinexperiments.basics

fun main() {
    greet("Dan")
    greet()

    executeFunction(someFunction = {
        println("Executing the random function")
    })

    println(doubleNumber(4))

    val (v1,v2) = return2ValuesFromFun()
    println("$v1 $v2")
    val (t1,t2,t3) = return3ValuesFromFun()
    println("$t1 $t2 $t3")
}


// Unit corresponds to void in java; it is default so not needed to be declared
fun greet(name: String = "default") : Unit {    // if a default value is provided, the parameter value can be omitted
    println("hello $name")                      // when the function is called.
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
fun simpleDoubleNumber2(n: Int) = n*2       // for a single line function you can ommit the returned type

fun return2ValuesFromFun() : Pair<String, Int>{
    return "dan" to 3       // ( this is how we return a pair ) or
//    return Pair("dan",3)
}

fun return3ValuesFromFun() : Triple<String, Int, Int>{
    return Triple("dan", 3, 5)       // ( this is how we return a triple )
}
