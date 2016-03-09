/**
  * Created by ONicholls on 26/02/2016.
  */

/*
refactor the solution to
the last exercise so that Square and Rectangle are subtypes of a common type
Rectangular.
 */


import scala.math.{Pi,sqrt,pow}

trait Shape2 {

  def sides: Int
  def perimeter: Double
  def area: Double

}

case class Circle1 (radius: Double) extends Shape2{
  def sides = 1
  def area = Pi * pow(radius,2)
  def perimeter = 2*Pi*radius
}


trait Rectangular extends Shape2{
  def side1:Double
  def side2: Double
  def sides()  = 4
  def perimeter = side1*2 + side2*2
  def area = side1 * side2

}

case class Rectangle1 (side1: Double, side2:Double ) extends Rectangular {

}

case class Square1 (side: Double )extends Rectangular {
  def side1:Double = side
  def side2: Double = side

}

