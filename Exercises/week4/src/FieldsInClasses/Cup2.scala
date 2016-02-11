package FieldsInClasses
import atomicscala.AtomicTest._
/**
  * Created by ONicholls on 07/02/2016.
  */

/*
2. Add code to handle negative values to ensure that the total never goes below 0.

*/

class Cup2 {
  var percentFull = 0
  val max = 100
  val min = 0

  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max)
      percentFull = max
    else if(percentFull < min) // adding extra condition to ensure that percentFull does not become a negative number
      percentFull  = min

    percentFull // Return this value
  }
}

object Cup2 extends App {

  val cup2 = new Cup2
  cup2.add(45) is 45
  cup2.add(-55) is 0
  cup2.add(10) is 10
  cup2.add(-9) is 1
  cup2.add(-2) is 0



}


