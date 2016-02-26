/**
  * Created by ONicholls on 26/02/2016.
  */
import scala.math.{Pi,sqrt,pow}

trait Shape2 {

  def sides: Int
  def perimeter: Double
  def area: Double

}

case class Circle1 (radius: Double) extends Shape2{
  def sides = 0
  def area = Pi * pow(radius,2)
  def perimeter = 2*Pi*radius
}


case class Rectangular (side1: Double, side2:Double )extends Shape2{
  def sides()  = 4
  def perimeter = side1*2 + side2*2
  def area = side1 * side2

}

class Rectangle1 (side1: Double, side2:Double ) extends Rectangular(side1,side2) {
  override def sides  = 4
  override def perimeter = side1*2 + side2*2
  override def area = side1 * side2

}

class Square1 (side1: Double, side2:Double )extends Rectangular (side1, side2){
  override def sides()  = super.sides()
  override def perimeter = side1*4
  override def area = pow(side1,2)

}