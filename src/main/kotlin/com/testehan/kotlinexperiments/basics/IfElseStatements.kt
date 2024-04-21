package com.testehan.kotlinexperiments.basics

fun main() {
    val n1 = 10;
    val n2 = 30;

    if (n1 > n2){
        println(n1)
    } else {
        println(n2)
    }

    // "if" is actually an expression... see example below

    val smiley = if (n1 > n2){
        ":)"
    } else {
        ":("
    }
    println(smiley)

//    var weather = n1>n2 ? "chilly" : "hot"        java ternary
    var weather = if (n1>n2)  "chilly" else "hot"
    println(weather)

}