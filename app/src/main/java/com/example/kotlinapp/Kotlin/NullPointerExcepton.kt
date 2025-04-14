package com.example.kotlinapp.Kotlin

fun main(){
    //in kotlin we cant assign by null
//    val a:Int=null
    //how to make null value store with the help of elvish operator
    var a: Int? = 12
    println(
        if (a == null) {
            -1
        } else {
            a.toString().length
        }
    )
    //or
    a?.toString()?.let { println(it.length) }
}