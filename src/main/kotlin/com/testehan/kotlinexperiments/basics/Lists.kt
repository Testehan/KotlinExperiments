package com.testehan.kotlinexperiments.basics

fun main() {
    // listOf returns readlonly list
    val names : List<String> = listOf("Dan", "Dana", "Laura")

    println(names)      // prints content
    println(names.contains("Peter"))
    println(names.last())

    // this list is modifiable
//    val animals = mutableListOf("cow","pig","chicken","dog",4)  // not recommanded to use these generic lists
    val animals = mutableListOf("cow","pig","chicken","dog")  // now this only allows strings
    animals.remove("dog")
    println(animals)
    animals.add("tortoise")
    println("The first animal is ${animals[0]}")
    println("The first animal is ${animals.first()}")
    println("The last animal is ${animals.last()}")

    print("whale" in animals)           // false

}