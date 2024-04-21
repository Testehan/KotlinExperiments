package com.testehan.kotlinexperiments.basics

fun main() {
    // listOf returns readlonly list
    val names : List<String> = listOf("Dan", "Dana", "Laura")

    println(names)      // prints content
    println(names.contains("Peter"))
    println(names.last())

    // this list is modifiable
//    val animals = mutableListOf("cow","pig","chicken","dog",4)  // not recommanded to use these generic lists
    val animals = mutableListOf<String>("cow","pig","chicken","dog")  // now this only allows strings
    animals.remove("dog")
    println(animals)
    animals.add("tortoise")

}