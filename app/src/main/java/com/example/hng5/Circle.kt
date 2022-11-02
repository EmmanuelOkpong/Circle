package com.example.hng5

import kotlin.math.PI

/**
 * STAGE I TASK ON MOBILE TRACK SUBMITTED BY EMMANUEL OKPONG WITH NO:
 *
 * TITLE: Program to calculate basic dimension of a circle with different Radius
 * AUTHOR: Emmanuel Okpong,        SID: HNG01385775Y
 * DATE OF LAST UPDATE: 30TH October, 2022
 */
//Main function instantiating object of class circle
fun  main() {
    val circle1 = Circle1()
    val circle2 = Circle1(2.0)
    val circle3=Circle1(2.0,"Blue")

}
//root class for circle with three parameters
    class Circle1 {
        var radius:Double=1.0
        var color: String="Red"
//the First construction without taken any parameter
        constructor(){
            val color=this.color
            val radius=this.radius
//code to print the result of dimension for this constructor
            println("Circle 1:")
            println("Area: ${getArea(radius)}")
            println("Circumference: ${getCircumference(radius)}")
            println("Description: ${getDescription(radius,color)}")
           println("Color:  ${getColour(color)}")
            println("")
        }
 //constructor taking only one parameter
        constructor(radius: Double) {
            color="Red"
            println("Circle 2:")
            println("Area: ${getArea(radius)}")
            println("Circumference: ${getCircumference(radius)}")
            println("Description: ${getDescription(radius,color)}")
            println("Color:  ${getColour(color)}")
            println("")
        }
//constructor of take both parameter
        constructor(radius: Double , color: String) {
            //println("$radius and $color")
            println("Circle 3:")
            println("Area: ${getArea(radius)}")
            println("Circumference: ${getCircumference(radius)}")
            println("Description: ${getDescription(radius,color)}")
            println("Color:  ${getColour(color)}")
            println("")

        }
//A function to return the area of the circl
        fun getArea(radius: Double): Double {
            return PI * (radius * radius)
        }
//the function is to return the circumference
        fun getCircumference(radius: Double): Double {
            return 2 * radius*PI
        }
//this function return to description
        fun getDescription(radius: Double,color: String): String {
            return "Radius: $radius Color: $color"
        }
//this function the color of them circle
        fun getColour(color: String): String {
            return "$color"
        }
    }

