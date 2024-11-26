package com.example.helloworld

open class Person(val name: String, val age: Int) {
//    var name = ""
//    var age = 0

    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}


fun main() {
    val p = Person("Jack", 10)
//    p.age  = 10
//    p.name = "Jack"
    p.eat()
}
