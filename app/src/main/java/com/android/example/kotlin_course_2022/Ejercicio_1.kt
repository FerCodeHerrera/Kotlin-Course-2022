package com.android.example.kotlin_course_2022

import android.icu.util.Calendar
import java.lang.Exception
import java.util.*

//* Ingresar dos variables nombre y apellido y concatenarlas en nombreCompleto
//* Cambiar el valor de apellido y mostrar de nuevo el nombreCompleto
//* Declarar la variable añoNacimiento del humano y la variable añoActual que nos entregará automáticamente la máquina con la función Calendar.

var nombre: String = ""
var apellido: String = ""
var añoNacimiento:Int = 0
var añoActual:Int = 0

fun main(){

    try {
        obtainNameSurname()
    }
    catch(error:Exception) {
        println("Valor introducido incorrectamente, por favor de introducir un valor admitido.")
    }finally {
        println("Se finalizó la tarea.")
    }
}

fun obtainNameSurname(){

    println("Ingrese su nombre: ")
    nombre = readLine().toString()

    println("Ingrese su apellido: ")
    apellido = readLine().toString()

    println("El nombre completo es: $nombre$apellido")

    println("Ingrese su año de nacimiento: ")
    añoNacimiento = readLine()!!.toInt()
    añoActual = java.util.Calendar.getInstance().get(Calendar.YEAR)

    println("La edad de $nombre$apellido es de:${añoActual - añoNacimiento} años")
}