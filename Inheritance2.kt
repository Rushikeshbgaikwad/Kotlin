package com.ru.Rushikesh

open class Person2(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Person2(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String, time: Int): Person2(age, name) {
    val time1 = time
    init {
        println("My football playing time is $time hr ")
    }
    fun playFootball() {
//        println("My football playing time is $time1 hr ")
        println("I play for LA Galaxy.")
    }
}

fun main(args: Array<String>) {
    val t1 = MathTeacher(25, "Jack")
    t1.teachMaths()

    println()

    val f1 = Footballer(29, "Christiano",2)
    f1.playFootball()
}