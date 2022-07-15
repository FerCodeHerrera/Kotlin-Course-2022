package com.android.example.kotlin_course_2022

val Nombre:String = "Luis Fernando"
val Apellido:String = "Herrera Palacios"
var Edad:Int = 24
var Trabajo = "Programador de Sistemas Embebidos"

fun main(){
    println("Mi nombre es $Nombre $Apellido y mi edad es  $Edad y trabajo como $Trabajo")
        println("Otra forma de usar las variables es por medio de: ")
    println("Mi nombre es " + Nombre + " " + Apellido + " y mi edad es " + Edad + "y trabajo como " + Trabajo )
}