/**
  * Created by ONicholls on 26/02/2016.
  */

/*
i. Make Shape a sealed trait.
ii. Then write a singleton object called Draw with an apply method that takes
a Shape as an argument and returns a description of it on the console.
 */

import scala.math._


 sealed trait Shape3 {

  def sides: Int
  def perimeter: Double
  def area: Double

}

case class Circle3 (radius: Double) extends Shape3{
  def sides = 1
  def area = Pi * pow(radius,2)
  def perimeter = 2*Pi*radius
}


trait Rectangular3 extends Shape3{
  def side1:Double
  def side2: Double
  def sides()  = 4
  def perimeter = side1*2 + side2*2
  def area = side1 * side2

}
 case class Rectangle3 (side1: Double, side2:Double ) extends Rectangular3 {
}

case class Square3 (side: Double )extends Rectangular3 {
  def side1:Double = side
  def side2: Double = side

}

object Draw extends App{
  def apply(shape: Shape3): Unit = shape match {
    case Rectangle3(side1,side2) =>
      println(s"A rectangle of width $side1 cm and height  $side2 cm ")
    case Square3(side) =>
      println(s"A square with a side $side cm")
    case Circle3(radius) =>
      println(s"A circle of radius $radius cm")

  }


  apply(Square3(5))
  apply(Circle3(5))
  apply(Rectangle3(5,10))


}