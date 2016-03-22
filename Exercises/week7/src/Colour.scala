/**
  * Created by ONicholls on 09/03/2016.
  */
//i. give Colour three properties for its RGB values;

sealed trait MyColour {

  def R: Int
  def G: Int
  def B: Int

  // adding a tone method to see whether a colour is dark or light

  def colourtone = {

    if((R+G+B)/3 > 50){"Dark"} else {"Light"}

  }

}

//ii. create three predefined colours: Red, Yellow, and Pink;
//NB:  'final' means that it cannot be changed and cannot be overridden

// FOR THE PURPOSES OF THIS EXERSICE: RGB values defined as INTs 0 to 100

final case object Red extends MyColour {

  def R = 100
  def G = 0
  def B = 0
}

final case object Yellow extends MyColour {

  def R = 50
  def G = 50
  def B = 0
}

final case object Pink extends MyColour {

  def R = 90
  def G = 0
  def B = 90
}

//provide a means for people to produce their own custom Colours with their own RGB values;

final case class NewColour(
                            R: Int,
                            G: Int,
                            B:Int) extends MyColour


/*
Edit the code for Shape and its subtypes to add a colour to each shape.
Finally, update the code for Draw.apply to print the colour of the argument as
well as its shape and dimensions
 */


import scala.math._


sealed trait Shape4 {

  def sides: Int
  def perimeter: Double
  def area: Double
  def colour: MyColour

}

case class Circle4 (radius: Double, colour: MyColour) extends Shape4{
  def sides = 1
  def area = Pi * pow(radius,2)
  def perimeter = 2*Pi*radius
}


trait Rectangular4 extends Shape4{
  def side1:Double
  def side2: Double
  def sides()  = 4
  def perimeter = side1*2 + side2*2
  def area = side1 * side2

}
case class Rectangle4 (side1: Double, side2:Double, colour: MyColour ) extends Rectangular4 {
}

case class Square4 (side: Double, colour: MyColour )extends Rectangular4 {
  def side1:Double = side
  def side2: Double = side

}

object Draw4 extends App{

  //can do overloading for apply method to deal with Shapes and with Colours

  def apply(shape: Shape4): Unit = shape match {
    case Rectangle4(side1,side2,colour) =>
      println(s"A ${Draw4(colour)} rectangle of width $side1 cm and height  $side2 cm ")
    case Square4(side,colour) =>
      println(s"A ${Draw4(colour)} square with a side $side cm")
    case Circle4(radius,colour) =>
      println(s"A ${Draw4(colour)} circle of radius $radius cm")
    case _ => println(s"A shape of some sort")

  }

  def apply (colour: MyColour): String = colour match {

    case Red => "red"
    case Yellow => "yellow"
    case Pink => "pink"
    case colour => if (colour.colourtone == "Dark") "Dark" else "Light"

  }



  apply(Square4(2,NewColour(50,50,100)))
  apply(Circle4(5,Red))
  apply(Rectangle4(5,10, NewColour(1,2,3)))


}























object TestingColours extends App{

  println(NewColour(10,20,30).colourtone)


}
