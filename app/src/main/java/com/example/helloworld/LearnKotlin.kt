package com.example.helloworld

import kotlin.math.max

//fun largeNumber(num1: Int, num2: Int): Int {
////    return max(num1, num2)
//
//    var value = 0
//    if (num1 > num2) {
//        value = num1
//    } else {
//        value = num2
//    }
//    return value
//}

fun largeNumber(num1: Int, num2: Int): Int = if (num1 > num2) { num1 } else { num2 }

fun checkNumber (num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}

fun main() {
//    println("Hello Kotlin！")

//    var a: Int = 10
//    a = a * 10
//    println("a = " + a)

//    val a = 37
//    val b = 40
//    val value = largeNumber(a, b)
//    print("larger number is " + value)

//    val num: Double = 10.342
//    checkNumber(num)

//    for (i in 0 until 10 step 2) {
//        println(i)
//    }

    for (i in 10 downTo 2) {
        println(i)
    }
}