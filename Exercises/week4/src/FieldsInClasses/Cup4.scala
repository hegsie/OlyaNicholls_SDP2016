package FieldsInClasses
import atomicscala.AtomicTest._
/**
  * Created by ONicholls on 07/02/2016.
  */
/*
4. Write methods that allow you to both set and get the value of percentFull.
 */

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
  def get(): Int = percentFull
}

object Cup4 extends App {

  val cup4 = new Cup4
  cup4.set(56)
  cup4.get() is 56
}

