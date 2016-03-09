/**
  * Created by ONicholls on 09/03/2016.
  */

sealed trait DivisionResult

final case class Finite(result: Int) extends DivisionResult

//because no constructure arguments, we can define Infinite as OBJECT
final case object Infinite extends DivisionResult



object Divide {

  def apply (numerator: Int, denominator:Int):DivisionResult = {

    if (denominator == 0)Infinite else Finite(numerator/denominator)
  }

}

object testDivision extends App {

  Divide(10,2) match {
    case Finite(result) => println(s"The result is finite ${result}")
    case Infinite => println("The result is infinite")

  }

}