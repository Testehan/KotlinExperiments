package com.testehan.kotlinexperiments.basics

fun main() {
    var name = "Dan"
//    name = null         // compile error
    var profession : String? = "student"        // ? marks a type as nullable.
    profession = null
    println(profession)     // prints null

    var bornIn : String? = null
    println(bornIn?.uppercase())     // prints null
}