package com.android.example.kotlin_course_2022

import kotlin.math.pow

var areaCircle: Float = 0.0f    //This is a Variable
val PI:Float = 3.1416F          //This is a Constant
val radioCircle: Float = 5.0f   //This is a Constant

fun main (){
    areaCircle = PI*(radioCircle.pow(2))
    println("The area is: " + areaCircle)
}
