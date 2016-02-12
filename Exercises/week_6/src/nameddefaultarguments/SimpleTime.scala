package nameddefaultarguments

import AtomicScala.AtomicTest1._
/**
  * Created by ONicholls on 12/02/2016.
  */
class SimpleTime (val hours:Int, val minutes:Int)

object SimpleTime extends  App{

  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30

}
