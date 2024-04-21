package com.testehan.kotlinexperiments.basics

fun main() {
    val names = arrayOf<String>("Dan","Dana")   // if we don;t specify <String> we can put numbers etc in it
    println(names)      // prints hashcode
    println(names.contentToString())    // prints content
    println(names[0])

    if ("Dan" in names){
        println("I found Dan")
    }

    names[1] = "Laura"
    println(names.contentToString())

    var digits = intArrayOf(1,2,3,4,5,6,7,8,9,0)
    println(digits.contentToString())
}