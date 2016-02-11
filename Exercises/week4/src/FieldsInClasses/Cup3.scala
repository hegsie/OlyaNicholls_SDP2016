package FieldsInClasses
import atomicscala.AtomicTest._
/**
  * Created by ONicholls on 07/02/2016.
  */

/*3. Can you set percentFull from outside the class? Try it, like this:
cup.percentFull = 56
cup.percentFull is 56
*/

class Cup3 {
  var percentFull = 0
  val max = 100
  val min = 0

  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max)
      percentFull = max
    else if(percentFull < min)
      percentFull  = min

    percentFull // Return this value
  }
}

object Cup3 extends App {

  val cup3 = new Cup3


  cup3.percentFull = 56
  cup3.percentFull is 56




}

/*
4. Write methods that allow you to both set and get the value of percentFull.


class Cup4 {
  var percentFull = 0
  val max = 100
  val min = 0

  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max)
      percentFull = max
    else if(percentFull < min)
      percentFull  = min

    percentFull // Return this value
  }

  def set(percent: Int) = {percentFull = percent }
  def get(): Int = {percentFull}
}

val cup4 = new Cup4
cup4.set(100)
val c = cup4.get()

assert(c == 100, "Expected 56, outcome " + c)
println(c)

*/
