/**
  * Created by ONicholls on 26/02/2016.
  */

// A sealed trait can be extended only in the same file as its declaration.

import scala.math._

sealed trait Shape3 {
  def sides: Int
  def perimeter: Double
  def area: Double
}


case class C (radius: Double) extends Shape3{

  def sides = 0
  def area = Pi * pow(radius,2)
  def perimeter = 2*Pi*radius
}


case class R (side1: Double, side2:Double )extends Shape3{
  def sides()  = 4
  def perimeter = side1*2 + side2*2
  def area = side1 * side2

}

class Rec (side1: Double, side2:Double ) extends R(side1,side2) {
  override def sides  = 4
  override def perimeter = side1*2 + side2*2
  override def area = side1 * side2

}

class Sq (side1: Double, side2:Double )extends R (side1, side2){
  override def sides()  = super.sides()
  override def perimeter = side1*4
  override def area = pow(side1,2)
}

case class Draw (shape: Any) {
  def apply(shape:Any)

}