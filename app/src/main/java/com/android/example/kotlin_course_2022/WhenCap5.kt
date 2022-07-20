package com.android.example.kotlin_course_2022

//Realizar la operación de suma,resta, multiplicación y división con la sentencia when.

fun main(){
    ope(5.6f,3.4f,"Suma")
    ope(1.2f,7.4f,"Resta")
    ope(2.0f,5.0f,"Multiplicación")
    ope(6.2f,3.1f,"División")
}

fun ope(A:Float,B:Float,Ope:String){

     when(Ope){
        "Suma"  -> {
            print("La suma es: ")
            println(A + B)
        }

         "Resta"  -> {
             print("La resta es: ")
             println(A - B)
         }

         "Multiplicación"  -> {
             print("La multiplicación es: ")
             println(A * B)
         }

         else -> {
             print("La división es: ")
             println(A / B)
         }
    }
}

