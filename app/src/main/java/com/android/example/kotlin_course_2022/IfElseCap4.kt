package com.android.example.kotlin_course_2022

var resultSuma:Int = 0
var resultMulti:Int = 0
var resultDivi:Int = 0
var resultRest:Int = 0


fun main()
{
    resultSuma = suma(5,4)
    resultRest = resta(5,4)
    resultMulti = multiplication(5,4)
    resultDivi = divition(5,4)

    if((resultSuma%2) != 0)
        println("El resultado de la suma es $resultSuma y es impar")
    else
        println("El resultado de la suma es $resultSuma y es par")

    if((resultRest%2) != 0)
        println("El resultado de la resta es $resultRest y es impar")
    else
        println("El resultado de la resta es $resultRest y es par")

    if((resultMulti%2) != 0)
        println("El resultado de la multiplicación es $resultMulti y es impar")
    else
        println("El resultado de la multiplicación es $resultMulti y es par")

    if((resultDivi%2) != 0)
        println("El resultado de la división es $resultDivi y es impar")
    else
        println("El resultado de la división es $resultDivi y es par")
}

fun suma(A:Int,B:Int):Int = A + B
fun resta(A:Int,B:Int):Int = A - B
fun multiplication(A:Int,B:Int):Int = A * B
fun divition(A:Int,B:Int):Int = A / B