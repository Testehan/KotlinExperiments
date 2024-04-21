package com.testehan.kotlinexperiments.basics

fun main() {
    var number = 1;

    while (number <= 5){
        println(number)
        ++number
    }

    do {
        println(number)
        ++number
    } while (number < 100)
}