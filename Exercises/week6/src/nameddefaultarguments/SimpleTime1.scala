package nameddefaultarguments

import AtomicScala.AtomicTest._
/**
  * Created by ONicholls on 12/02/2016.
  */
class SimpleTime1 (val hours:Int, val minutes:Int = 0) // defaulting minutes to 0

object SimpleTime1 extends  App{

  val t2 = new SimpleTime1(hours=10)
  t2.hours is 10
  t2.minutes is 0


}
