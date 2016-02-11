package FieldsInClasses

import atomicscala.AtomicTest._
/**
  * Created by ONicholls on 07/02/2016.
  */
/*

1. What happens in Cups add method if increase is a negative value? Is any addi-
tional code necessary to satisfy the following tests:

*/


class Cup {
  var percentFull = 0
  val max = 100

  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }
}

object Cup extends App {

  val cup = new Cup

  cup.add(45) is 45
  cup.add(-15) is 30
  cup.add(-50) is -20

}


