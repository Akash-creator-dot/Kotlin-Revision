package com.example.kotlinapp.Kotlin

class Calculator {
   /* access modifiers
    private cant use outside class
    public is default and can be use anywhere even outside package
    internal cannot be use outside of the package
    protected mostly used in inheritance and this cant be used outside class*/
    var a=12;
    var b=23;
    fun add(){
        println("The addition is = ${a+b}")
    }
    fun multiply(){
        println("The multiply is = ${a*b}")
    }
    fun substraction(){
        println("The substraction is = ${a-b}")
    }
    fun division(){
        println("The division is = ${a/b}")
    }
}
fun main(args : Array<String>){
    var obj1=Calculator();
    obj1.add()
    obj1.substraction()
    obj1.multiply()
    obj1.division()
    println(obj1.a)
    println(obj1.b)
}