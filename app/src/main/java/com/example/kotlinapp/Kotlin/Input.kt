package com.example.kotlinapp.Kotlin

fun main(args: Array<String>){
    println("Enter the name and age")
    var name= readLine()
    var age= readLine()?.toInt()
    println("Name is $name of $age years old")

}