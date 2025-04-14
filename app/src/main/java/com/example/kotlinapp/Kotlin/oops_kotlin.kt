package com.example.kotlinapp.Kotlin

class oops_kotlin {
    fun bath(){
        println("Getting a bath")
    }
    fun ready(){
        println("ready for the college")
    }
    fun backtohome(){
        println("Welcome back")
    }
}
fun main(args : Array<String>){
    val person1= oops_kotlin()
    person1.bath();
    person1.ready();
    person1.backtohome()
}