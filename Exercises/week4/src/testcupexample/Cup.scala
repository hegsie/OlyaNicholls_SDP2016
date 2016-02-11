package testcupexample

import atomicscala.AtomicTest._
/**
  * Created by ONicholls on 06/02/2016.
  */
class Cup {
  var percentFull = 0
  val max = 100
  val min = 0

  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max)
      percentFull = max
     //else if (percentFull < min){
      //percentFull = min

    percentFull // Return this value
  }
}


object Main extends App{

  import sun.util.resources.cldr.pa.CurrencyNames_pa
  //  val cup1 = new Cup
//  cup1.add(50)
//  println(cup1.add(50))
//  println(cup1.add(50))

//  var cup2 = new Cup
//  val x = cup2.add(5)
//  println(x)
//  val y = cup2.add(-50)
//  println(y)
//  val z = cup2.add(140)
//  println(z)
//  val q = cup2.add(6-7)
//  println(q)

  val cup = new Cup
  cup.add(45) is 45
  cup.add(-15) is 30
  cup.add(-50) is -20
}

