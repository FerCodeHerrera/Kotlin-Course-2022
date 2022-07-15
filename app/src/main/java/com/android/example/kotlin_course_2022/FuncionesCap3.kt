package com.android.example.kotlin_course_2022

val numeroA:Int = 40
val numeroB:Int = 20
var resultado:Int = 0

fun main(){
    sumar(numeroA,numeroB)
    restar(numeroA,numeroB)
    multiplicar(numeroA,numeroB)
    dividir(numeroA,numeroB)
}
fun sumar(A:Int,B:Int){
    resultado = A + B
    println("La suma es: " + resultado)
}

fun  restar(A:Int,B:Int) {
    resultado = A - B
    println("La resta es: " + resultado)
}

fun multiplicar(A:Int,B:Int){
    resultado = A * B
    println("La multiplicación es: " + resultado)
}

fun dividir(A:Int,B:Int){
    resultado = A / B
    println("La división es: " + resultado)
}