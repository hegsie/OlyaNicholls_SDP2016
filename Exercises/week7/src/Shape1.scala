/**
  * Created by ONicholls on 26/02/2016.
  */

import scala.math.{Pi,sqrt,pow}

trait Shape1 {

  def sides: Int
  def perimeter: Double
  def area: Double

}


case class Circle (radius: Double) extends Shape1{
  def sides = 1
  def area = Pi * pow(radius,2)
  def perimeter = 2*Pi*radius
}


case class Rectangle (side1: Double, side2:Double )extends Shape1{
  def sides  = 4
  def perimeter = side1*2 + side2*2
  def area = side1 * side2

}

case class Square (side: Double )extends Shape1{
  def sides  = 4
  def perimeter = side*4
  def area = side * side

}



object MyShapes extends App{

  val c = Circle(4.00)
  println("%.2f".format(c.area).toDouble, "%.2f".format(c.perimeter).toDouble, c.sides)

  val r = Rectangle(2,5)
  println(r.area,r.perimeter,r.sides)

  val s = Square(2)
  println(s.area,s.perimeter,s.sides)

}