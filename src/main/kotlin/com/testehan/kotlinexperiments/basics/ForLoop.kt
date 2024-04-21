package com.testehan.kotlinexperiments.basics

fun main() {
    val names = listOf<String>("Dan", "Li", "Muci")
    val numbers = intArrayOf(100,200,300,400,500)

    for (name in names){
        println(name)
    }

    for (index in numbers.indices){
        println(index)
    }

    for (index in numbers.indices.reversed()){      // reversed loop over indexes
        println(numbers[index])
    }

    for (i in 1..4){        // range loops
        println(i)
    }

    for (i in 5 downTo 1){        // range loops down
        println(i)
    }

    val alphabet = "abcdefg.."
    for (letter in alphabet){
        print("$letter ")
    }

    names.forEach({ println(it) })      // "it" coresponds to the value of each element in the list
}